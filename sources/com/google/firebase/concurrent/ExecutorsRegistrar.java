package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import b2.n0;
import com.google.android.gms.internal.play_billing.s1;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import o9.c;
import o9.d;
import s0.b;
import s9.f;
import s9.o;
import s9.s;
import t9.a;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final o a = new o(new f(2));
    public static final o b = new o(new f(3));
    public static final o c = new o(new f(4));
    public static final o d = new o(new f(5));

    public static t9.f a() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (i10 >= 26) {
            detectNetwork.detectUnbufferedIo();
        }
        return new t9.f(Executors.newFixedThreadPool(4, new a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        s sVar = new s(o9.a.class, ScheduledExecutorService.class);
        s[] sVarArr = {new s(o9.a.class, ExecutorService.class), new s(o9.a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(sVar);
        for (s sVar2 : sVarArr) {
            s1.a(sVar2, "Null interface");
        }
        Collections.addAll(hashSet, sVarArr);
        s9.a aVar = new s9.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new b(11), hashSet3);
        s sVar3 = new s(o9.b.class, ScheduledExecutorService.class);
        s[] sVarArr2 = {new s(o9.b.class, ExecutorService.class), new s(o9.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(sVar3);
        for (s sVar4 : sVarArr2) {
            s1.a(sVar4, "Null interface");
        }
        Collections.addAll(hashSet4, sVarArr2);
        s9.a aVar2 = new s9.a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new b(12), hashSet6);
        s sVar5 = new s(c.class, ScheduledExecutorService.class);
        s[] sVarArr3 = {new s(c.class, ExecutorService.class), new s(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(sVar5);
        for (s sVar6 : sVarArr3) {
            s1.a(sVar6, "Null interface");
        }
        Collections.addAll(hashSet7, sVarArr3);
        s9.a aVar3 = new s9.a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new b(13), hashSet9);
        n0 b10 = s9.a.b(new s(d.class, Executor.class));
        b10.f = new b(14);
        return Arrays.asList(aVar, aVar2, aVar3, b10.b());
    }
}
