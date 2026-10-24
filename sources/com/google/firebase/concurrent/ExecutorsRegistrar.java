package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import b2.m0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import n9.c;
import n9.d;
import r9.f;
import r9.n;
import r9.r;
import s0.b;
import s9.a;
import w7.a7;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final n a = new n(new f(2));
    public static final n b = new n(new f(3));
    public static final n c = new n(new f(4));
    public static final n d = new n(new f(5));

    public static s9.f a() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (i10 >= 26) {
            detectNetwork.detectUnbufferedIo();
        }
        return new s9.f(Executors.newFixedThreadPool(4, new a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        r rVar = new r(n9.a.class, ScheduledExecutorService.class);
        r[] rVarArr = {new r(n9.a.class, ExecutorService.class), new r(n9.a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            a7.a(rVar2, "Null interface");
        }
        Collections.addAll(hashSet, rVarArr);
        r9.a aVar = new r9.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new b(7), hashSet3);
        r rVar3 = new r(n9.b.class, ScheduledExecutorService.class);
        r[] rVarArr2 = {new r(n9.b.class, ExecutorService.class), new r(n9.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(rVar3);
        for (r rVar4 : rVarArr2) {
            a7.a(rVar4, "Null interface");
        }
        Collections.addAll(hashSet4, rVarArr2);
        r9.a aVar2 = new r9.a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new b(8), hashSet6);
        r rVar5 = new r(c.class, ScheduledExecutorService.class);
        r[] rVarArr3 = {new r(c.class, ExecutorService.class), new r(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(rVar5);
        for (r rVar6 : rVarArr3) {
            a7.a(rVar6, "Null interface");
        }
        Collections.addAll(hashSet7, rVarArr3);
        r9.a aVar3 = new r9.a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new b(9), hashSet9);
        m0 b10 = r9.a.b(new r(d.class, Executor.class));
        b10.f = new b(10);
        return Arrays.asList(aVar, aVar2, aVar3, b10.b());
    }
}
