package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import b2.i0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import m9.b;
import m9.c;
import m9.d;
import org.telegram.ui.sw0;
import q9.f;
import q9.n;
import q9.r;
import r9.a;
import r9.i;
import w7.o6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final n a = new n(new f(2));
    public static final n b = new n(new f(3));
    public static final n c = new n(new f(4));
    public static final n d = new n(new f(5));

    public static r9.f a() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i10 >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return new r9.f(Executors.newFixedThreadPool(4, new a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        r rVar = new r(m9.a.class, ScheduledExecutorService.class);
        int i10 = 0;
        int i11 = 1;
        r[] rVarArr = {new r(m9.a.class, ExecutorService.class), new r(m9.a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            o6.a(rVar2, "Null interface");
        }
        Collections.addAll(hashSet, rVarArr);
        q9.a aVar = new q9.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new sw0(28), hashSet3);
        r rVar3 = new r(b.class, ScheduledExecutorService.class);
        r[] rVarArr2 = {new r(b.class, ExecutorService.class), new r(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(rVar3);
        for (r rVar4 : rVarArr2) {
            o6.a(rVar4, "Null interface");
        }
        Collections.addAll(hashSet4, rVarArr2);
        q9.a aVar2 = new q9.a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new sw0(29), hashSet6);
        r rVar5 = new r(c.class, ScheduledExecutorService.class);
        r[] rVarArr3 = {new r(c.class, ExecutorService.class), new r(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(rVar5);
        for (r rVar6 : rVarArr3) {
            o6.a(rVar6, "Null interface");
        }
        Collections.addAll(hashSet7, rVarArr3);
        q9.a aVar3 = new q9.a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new i(i10), hashSet9);
        i0 b10 = q9.a.b(new r(d.class, Executor.class));
        b10.f = new i(i11);
        return Arrays.asList(aVar, aVar2, aVar3, b10.b());
    }
}
