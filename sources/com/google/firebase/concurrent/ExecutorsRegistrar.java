package com.google.firebase.concurrent;

import ab.m;
import android.os.Build;
import android.os.StrictMode;
import c8.tc;
import com.google.firebase.components.ComponentRegistrar;
import e2.j0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import q9.b;
import q9.c;
import q9.d;
import u9.n;
import u9.r;
import v0.j;
import v9.a;
import v9.f;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final n a = new n(new m(3));
    public static final n b = new n(new m(4));
    public static final n c = new n(new m(5));
    public static final n d = new n(new m(6));

    public static f a() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i7 = Build.VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (i7 >= 26) {
            detectNetwork.detectUnbufferedIo();
        }
        return new f(Executors.newFixedThreadPool(4, new a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        r rVar = new r(q9.a.class, ScheduledExecutorService.class);
        r[] rVarArr = {new r(q9.a.class, ExecutorService.class), new r(q9.a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            tc.a(rVar2, "Null interface");
        }
        Collections.addAll(hashSet, rVarArr);
        u9.a aVar = new u9.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new j(6), hashSet3);
        r rVar3 = new r(b.class, ScheduledExecutorService.class);
        r[] rVarArr2 = {new r(b.class, ExecutorService.class), new r(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(rVar3);
        for (r rVar4 : rVarArr2) {
            tc.a(rVar4, "Null interface");
        }
        Collections.addAll(hashSet4, rVarArr2);
        u9.a aVar2 = new u9.a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new j(7), hashSet6);
        r rVar5 = new r(c.class, ScheduledExecutorService.class);
        r[] rVarArr3 = {new r(c.class, ExecutorService.class), new r(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(rVar5);
        for (r rVar6 : rVarArr3) {
            tc.a(rVar6, "Null interface");
        }
        Collections.addAll(hashSet7, rVarArr3);
        u9.a aVar3 = new u9.a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new j(8), hashSet9);
        j0 b10 = u9.a.b(new r(d.class, Executor.class));
        b10.f = new j(9);
        return Arrays.asList(aVar, aVar2, aVar3, b10.b());
    }
}
