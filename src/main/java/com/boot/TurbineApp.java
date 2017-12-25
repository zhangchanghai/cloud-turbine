package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class TurbineApp {

	public static void main(String[] args) {
		SpringApplication.run(TurbineApp.class, args);
		System.out.println("====cloud-turbine 启动完毕====");
	}

}
