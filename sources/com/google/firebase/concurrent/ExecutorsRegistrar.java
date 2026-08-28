package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import g7.t8;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import u8.b;
import u8.c;
import u8.d;
import v0.l;
import y8.f;
import y8.n;
import y8.r;
import z8.a;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final n a = new n(new f(2));
    public static final n b = new n(new f(3));
    public static final n c = new n(new f(4));
    public static final n d = new n(new f(5));

    public static z8.f a() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 23) {
            detectNetwork.detectResourceMismatches();
            if (i9 >= 26) {
                detectNetwork.detectUnbufferedIo();
            }
        }
        return new z8.f(Executors.newFixedThreadPool(4, new a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        r rVar = new r(u8.a.class, ScheduledExecutorService.class);
        r[] rVarArr = {new r(u8.a.class, ExecutorService.class), new r(u8.a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            t8.a(rVar2, "Null interface");
        }
        Collections.addAll(hashSet, rVarArr);
        y8.a aVar = new y8.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new l(14), hashSet3);
        r rVar3 = new r(b.class, ScheduledExecutorService.class);
        r[] rVarArr2 = {new r(b.class, ExecutorService.class), new r(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(rVar3);
        for (r rVar4 : rVarArr2) {
            t8.a(rVar4, "Null interface");
        }
        Collections.addAll(hashSet4, rVarArr2);
        y8.a aVar2 = new y8.a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new l(15), hashSet6);
        r rVar5 = new r(c.class, ScheduledExecutorService.class);
        r[] rVarArr3 = {new r(c.class, ExecutorService.class), new r(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(rVar5);
        for (r rVar6 : rVarArr3) {
            t8.a(rVar6, "Null interface");
        }
        Collections.addAll(hashSet7, rVarArr3);
        y8.a aVar3 = new y8.a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new l(16), hashSet9);
        tg.b b10 = y8.a.b(new r(d.class, Executor.class));
        b10.f = new l(17);
        return Arrays.asList(aVar, aVar2, aVar3, b10.b());
    }
}
