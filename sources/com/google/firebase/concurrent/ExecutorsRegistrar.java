package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import c9.b;
import c9.h;
import c9.q;
import c9.u;
import com.google.firebase.components.ComponentRegistrar;
import d9.a;
import d9.g;
import j7.j5;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import y8.c;
import y8.d;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final q a = new q(new h(2));
    public static final q b = new q(new h(3));
    public static final q c = new q(new h(4));
    public static final q d = new q(new h(5));

    public static g a() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i10 >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return new g(Executors.newFixedThreadPool(4, new a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        u uVar = new u(y8.a.class, ScheduledExecutorService.class);
        u[] uVarArr = {new u(y8.a.class, ExecutorService.class), new u(y8.a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(uVar);
        for (u uVar2 : uVarArr) {
            j5.a(uVar2, "Null interface");
        }
        Collections.addAll(hashSet, uVarArr);
        b bVar = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new af.a(21), hashSet3);
        u uVar3 = new u(y8.b.class, ScheduledExecutorService.class);
        u[] uVarArr2 = {new u(y8.b.class, ExecutorService.class), new u(y8.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(uVar3);
        for (u uVar4 : uVarArr2) {
            j5.a(uVar4, "Null interface");
        }
        Collections.addAll(hashSet4, uVarArr2);
        b bVar2 = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new af.a(22), hashSet6);
        u uVar5 = new u(c.class, ScheduledExecutorService.class);
        u[] uVarArr3 = {new u(c.class, ExecutorService.class), new u(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(uVar5);
        for (u uVar6 : uVarArr3) {
            j5.a(uVar6, "Null interface");
        }
        Collections.addAll(hashSet7, uVarArr3);
        b bVar3 = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new af.a(23), hashSet9);
        c9.a a2 = b.a(new u(d.class, Executor.class));
        a2.g = new af.a(24);
        return Arrays.asList(bVar, bVar2, bVar3, a2.b());
    }
}
