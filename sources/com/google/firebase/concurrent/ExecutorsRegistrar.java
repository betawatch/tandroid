package com.google.firebase.concurrent;

import a9.a;
import a9.h;
import a9.l;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import h7.v8;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import v8.b;
import v8.c;
import v8.d;
import z8.m;
import z8.q;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final m a = new m(new l(0));
    public static final m b = new m(new l(1));
    public static final m c = new m(new l(2));
    public static final m d = new m(new l(3));

    public static h a() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i10 >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return new h(Executors.newFixedThreadPool(4, new a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        q qVar = new q(v8.a.class, ScheduledExecutorService.class);
        int i10 = 2;
        int i11 = 0;
        int i12 = 1;
        q[] qVarArr = {new q(v8.a.class, ExecutorService.class), new q(v8.a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            v8.a(qVar2, "Null interface");
        }
        Collections.addAll(hashSet, qVarArr);
        z8.a aVar = new z8.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new a9.m(i11), hashSet3);
        q qVar3 = new q(b.class, ScheduledExecutorService.class);
        q[] qVarArr2 = {new q(b.class, ExecutorService.class), new q(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(qVar3);
        for (q qVar4 : qVarArr2) {
            v8.a(qVar4, "Null interface");
        }
        Collections.addAll(hashSet4, qVarArr2);
        z8.a aVar2 = new z8.a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new a9.m(i12), hashSet6);
        q qVar5 = new q(c.class, ScheduledExecutorService.class);
        q[] qVarArr3 = {new q(c.class, ExecutorService.class), new q(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(qVar5);
        for (q qVar6 : qVarArr3) {
            v8.a(qVar6, "Null interface");
        }
        Collections.addAll(hashSet7, qVarArr3);
        z8.a aVar3 = new z8.a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new a9.m(i10), hashSet9);
        ug.b b10 = z8.a.b(new q(d.class, Executor.class));
        b10.f = new a9.m(3);
        return Arrays.asList(aVar, aVar2, aVar3, b10.b());
    }
}
