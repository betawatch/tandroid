package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final e06 a = new e06(new cq2((byte) 1));
    public static final e06 b = new e06(new cq2((byte) 2));
    public static final e06 c = new e06(new cq2((byte) 3));
    public static final e06 d = new e06(new cq2((byte) 4));

    public static id3 a() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        detectNetwork.detectResourceMismatches();
        if (Build.VERSION.SDK_INT >= 26) {
            detectNetwork.detectUnbufferedIo();
        }
        return new id3(Executors.newFixedThreadPool(4, new y43("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        xw8 xw8Var = new xw8(md0.class, ScheduledExecutorService.class);
        xw8[] xw8VarArr = {new xw8(md0.class, ExecutorService.class), new xw8(md0.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(xw8Var);
        for (int i = 0; i < 2; i++) {
            hre.a(xw8VarArr[i], "Null interface");
        }
        Collections.addAll(hashSet, xw8VarArr);
        mp2 mp2Var = new mp2(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new k93((byte) 29), hashSet3);
        xw8 xw8Var2 = new xw8(nk0.class, ScheduledExecutorService.class);
        xw8[] xw8VarArr2 = {new xw8(nk0.class, ExecutorService.class), new xw8(nk0.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(xw8Var2);
        for (int i2 = 0; i2 < 2; i2++) {
            hre.a(xw8VarArr2[i2], "Null interface");
        }
        Collections.addAll(hashSet4, xw8VarArr2);
        mp2 mp2Var2 = new mp2(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new w44((byte) 0), hashSet6);
        xw8 xw8Var3 = new xw8(i16.class, ScheduledExecutorService.class);
        xw8[] xw8VarArr3 = {new xw8(i16.class, ExecutorService.class), new xw8(i16.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(xw8Var3);
        for (int i3 = 0; i3 < 2; i3++) {
            hre.a(xw8VarArr3[i3], "Null interface");
        }
        Collections.addAll(hashSet7, xw8VarArr3);
        mp2 mp2Var3 = new mp2(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new w44((byte) 1), hashSet9);
        lp2 a2 = mp2.a(new xw8(n4c.class, Executor.class));
        a2.f = new w44((byte) 2);
        return Arrays.asList(mp2Var, mp2Var2, mp2Var3, a2.b());
    }
}
