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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final e26 a = new e26(new nr2((byte) 1));
    public static final e26 b = new e26(new nr2((byte) 2));
    public static final e26 c = new e26(new nr2((byte) 3));
    public static final e26 d = new e26(new nr2((byte) 4));

    public static ue3 a() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        detectNetwork.detectResourceMismatches();
        if (Build.VERSION.SDK_INT >= 26) {
            detectNetwork.detectUnbufferedIo();
        }
        return new ue3(Executors.newFixedThreadPool(4, new j63("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        yy8 yy8Var = new yy8(me0.class, ScheduledExecutorService.class);
        byte b2 = 2;
        byte b3 = 0;
        byte b4 = 1;
        yy8[] yy8VarArr = {new yy8(me0.class, ExecutorService.class), new yy8(me0.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(yy8Var);
        for (int i = 0; i < 2; i++) {
            kte.a(yy8VarArr[i], "Null interface");
        }
        Collections.addAll(hashSet, yy8VarArr);
        xq2 xq2Var = new xq2(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new h64(b3), hashSet3);
        yy8 yy8Var2 = new yy8(nl0.class, ScheduledExecutorService.class);
        yy8[] yy8VarArr2 = {new yy8(nl0.class, ExecutorService.class), new yy8(nl0.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(yy8Var2);
        for (int i2 = 0; i2 < 2; i2++) {
            kte.a(yy8VarArr2[i2], "Null interface");
        }
        Collections.addAll(hashSet4, yy8VarArr2);
        xq2 xq2Var2 = new xq2(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new h64(b4), hashSet6);
        yy8 yy8Var3 = new yy8(i36.class, ScheduledExecutorService.class);
        yy8[] yy8VarArr3 = {new yy8(i36.class, ExecutorService.class), new yy8(i36.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(yy8Var3);
        for (int i3 = 0; i3 < 2; i3++) {
            kte.a(yy8VarArr3[i3], "Null interface");
        }
        Collections.addAll(hashSet7, yy8VarArr3);
        xq2 xq2Var3 = new xq2(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new h64(b2), hashSet9);
        wq2 a2 = xq2.a(new yy8(n6c.class, Executor.class));
        a2.f = new h64((byte) 3);
        return Arrays.asList(xq2Var, xq2Var2, xq2Var3, a2.b());
    }
}
