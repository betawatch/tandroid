package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import d2.l0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p9.a;
import p9.c;
import p9.d;
import t9.f;
import t9.n;
import t9.r;
import u9.b;
import u9.g;
import u9.j;
import x7.b0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final n a = new n(new f(2));
    public static final n b = new n(new f(3));
    public static final n c = new n(new f(4));
    public static final n d = new n(new f(5));

    public static g a() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i3 = Build.VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (i3 >= 26) {
            detectNetwork.detectUnbufferedIo();
        }
        return new g(Executors.newFixedThreadPool(4, new b("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        r rVar = new r(a.class, ScheduledExecutorService.class);
        int i3 = 0;
        r[] rVarArr = {new r(a.class, ExecutorService.class), new r(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            b0.a(rVar2, "Null interface");
        }
        Collections.addAll(hashSet, rVarArr);
        t9.a aVar = new t9.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new s0.b(27), hashSet3);
        r rVar3 = new r(p9.b.class, ScheduledExecutorService.class);
        r[] rVarArr2 = {new r(p9.b.class, ExecutorService.class), new r(p9.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(rVar3);
        for (r rVar4 : rVarArr2) {
            b0.a(rVar4, "Null interface");
        }
        Collections.addAll(hashSet4, rVarArr2);
        t9.a aVar2 = new t9.a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new s0.b(28), hashSet6);
        r rVar5 = new r(c.class, ScheduledExecutorService.class);
        r[] rVarArr3 = {new r(c.class, ExecutorService.class), new r(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(rVar5);
        for (r rVar6 : rVarArr3) {
            b0.a(rVar6, "Null interface");
        }
        Collections.addAll(hashSet7, rVarArr3);
        t9.a aVar3 = new t9.a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new s0.b(29), hashSet9);
        l0 b10 = t9.a.b(new r(d.class, Executor.class));
        b10.f = new j(i3);
        return Arrays.asList(aVar, aVar2, aVar3, b10.b());
    }
}
