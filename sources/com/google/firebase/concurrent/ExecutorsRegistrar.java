package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import androidx.emoji2.text.w;
import c9.b;
import c9.g;
import c9.p;
import c9.t;
import com.google.firebase.components.ComponentRegistrar;
import d9.a;
import j7.k5;
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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final p a = new p(new g(2));
    public static final p b = new p(new g(3));
    public static final p c = new p(new g(4));
    public static final p d = new p(new g(5));

    public static d9.g a() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i10 >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return new d9.g(Executors.newFixedThreadPool(4, new a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        t tVar = new t(y8.a.class, ScheduledExecutorService.class);
        t[] tVarArr = {new t(y8.a.class, ExecutorService.class), new t(y8.a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(tVar);
        for (t tVar2 : tVarArr) {
            k5.a(tVar2, "Null interface");
        }
        Collections.addAll(hashSet, tVarArr);
        b bVar = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new w(15), hashSet3);
        t tVar3 = new t(y8.b.class, ScheduledExecutorService.class);
        t[] tVarArr2 = {new t(y8.b.class, ExecutorService.class), new t(y8.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(tVar3);
        for (t tVar4 : tVarArr2) {
            k5.a(tVar4, "Null interface");
        }
        Collections.addAll(hashSet4, tVarArr2);
        b bVar2 = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new w(16), hashSet6);
        t tVar5 = new t(c.class, ScheduledExecutorService.class);
        t[] tVarArr3 = {new t(c.class, ExecutorService.class), new t(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(tVar5);
        for (t tVar6 : tVarArr3) {
            k5.a(tVar6, "Null interface");
        }
        Collections.addAll(hashSet7, tVarArr3);
        b bVar3 = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new w(17), hashSet9);
        c9.a a2 = b.a(new t(d.class, Executor.class));
        a2.g = new w(18);
        return Arrays.asList(bVar, bVar2, bVar3, a2.b());
    }
}
