package com.google.firebase.concurrent;

import a9.b;
import a9.f;
import a9.h;
import a9.q;
import a9.v;
import android.os.Build;
import android.os.StrictMode;
import b9.a;
import com.google.firebase.components.ComponentRegistrar;
import h7.n;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import w8.c;
import w8.d;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final q a = new q(new h(2));
    public static final q b = new q(new h(3));
    public static final q c = new q(new h(4));
    public static final q d = new q(new h(5));

    public static b9.h a() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i10 >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return new b9.h(Executors.newFixedThreadPool(4, new a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        v vVar = new v(w8.a.class, ScheduledExecutorService.class);
        v[] vVarArr = {new v(w8.a.class, ExecutorService.class), new v(w8.a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(vVar);
        for (v vVar2 : vVarArr) {
            n.a(vVar2, "Null interface");
        }
        Collections.addAll(hashSet, vVarArr);
        b bVar = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new f(12), hashSet3);
        v vVar3 = new v(w8.b.class, ScheduledExecutorService.class);
        v[] vVarArr2 = {new v(w8.b.class, ExecutorService.class), new v(w8.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(vVar3);
        for (v vVar4 : vVarArr2) {
            n.a(vVar4, "Null interface");
        }
        Collections.addAll(hashSet4, vVarArr2);
        b bVar2 = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new f(13), hashSet6);
        v vVar5 = new v(c.class, ScheduledExecutorService.class);
        v[] vVarArr3 = {new v(c.class, ExecutorService.class), new v(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(vVar5);
        for (v vVar6 : vVarArr3) {
            n.a(vVar6, "Null interface");
        }
        Collections.addAll(hashSet7, vVarArr3);
        b bVar3 = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new f(14), hashSet9);
        a9.a a2 = b.a(new v(d.class, Executor.class));
        a2.g = new f(15);
        return Arrays.asList(bVar, bVar2, bVar3, a2.b());
    }
}
