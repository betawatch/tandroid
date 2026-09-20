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
import q9.f;
import q9.n;
import q9.p;
import q9.s;
import r9.a;
import w7.t6;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        s sVar = new s(m9.a.class, ScheduledExecutorService.class);
        s[] sVarArr = {new s(m9.a.class, ExecutorService.class), new s(m9.a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(sVar);
        for (s sVar2 : sVarArr) {
            t6.a(sVar2, "Null interface");
        }
        Collections.addAll(hashSet, sVarArr);
        q9.a aVar = new q9.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new p(8), hashSet3);
        s sVar3 = new s(b.class, ScheduledExecutorService.class);
        s[] sVarArr2 = {new s(b.class, ExecutorService.class), new s(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(sVar3);
        for (s sVar4 : sVarArr2) {
            t6.a(sVar4, "Null interface");
        }
        Collections.addAll(hashSet4, sVarArr2);
        q9.a aVar2 = new q9.a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new p(9), hashSet6);
        s sVar5 = new s(c.class, ScheduledExecutorService.class);
        s[] sVarArr3 = {new s(c.class, ExecutorService.class), new s(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(sVar5);
        for (s sVar6 : sVarArr3) {
            t6.a(sVar6, "Null interface");
        }
        Collections.addAll(hashSet7, sVarArr3);
        q9.a aVar3 = new q9.a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new p(10), hashSet9);
        i0 b10 = q9.a.b(new s(d.class, Executor.class));
        b10.f = new p(11);
        return Arrays.asList(aVar, aVar2, aVar3, b10.b());
    }
}
