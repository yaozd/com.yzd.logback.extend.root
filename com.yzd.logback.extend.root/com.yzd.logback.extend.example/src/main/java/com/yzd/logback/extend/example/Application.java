package com.yzd.logback.extend.example;

import com.yzd.logback.extend.SystemExtend;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    static {
        //初始化用户自定的系统变量
        //这样保证程序启动时，最先运行，设置本地ip。
        SystemExtend.initProperty();
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println(System.getProperty("local-ip"));
    }

}
