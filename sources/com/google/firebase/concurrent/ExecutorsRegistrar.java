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
import s9.n;
import s9.r;
import t9.a;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final n a = new n(new f(2));
    public static final n b = new n(new f(3));
    public static final n c = new n(new f(4));
    public static final n d = new n(new f(5));

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
        r rVar = new r(o9.a.class, ScheduledExecutorService.class);
        r[] rVarArr = {new r(o9.a.class, ExecutorService.class), new r(o9.a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            s1.a(rVar2, "Null interface");
        }
        Collections.addAll(hashSet, rVarArr);
        s9.a aVar = new s9.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new b(11), hashSet3);
        r rVar3 = new r(o9.b.class, ScheduledExecutorService.class);
        r[] rVarArr2 = {new r(o9.b.class, ExecutorService.class), new r(o9.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(rVar3);
        for (r rVar4 : rVarArr2) {
            s1.a(rVar4, "Null interface");
        }
        Collections.addAll(hashSet4, rVarArr2);
        s9.a aVar2 = new s9.a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new b(12), hashSet6);
        r rVar5 = new r(c.class, ScheduledExecutorService.class);
        r[] rVarArr3 = {new r(c.class, ExecutorService.class), new r(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(rVar5);
        for (r rVar6 : rVarArr3) {
            s1.a(rVar6, "Null interface");
        }
        Collections.addAll(hashSet7, rVarArr3);
        s9.a aVar3 = new s9.a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new b(13), hashSet9);
        n0 b10 = s9.a.b(new r(d.class, Executor.class));
        b10.f = new b(14);
        return Arrays.asList(aVar, aVar2, aVar3, b10.b());
    }
}
