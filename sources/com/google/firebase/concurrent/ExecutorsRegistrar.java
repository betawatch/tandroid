package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import c8.wc;
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
import u9.m;
import u9.q;
import ug.x;
import v9.a;
import v9.f;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final m a = new m(new ab.m(3));
    public static final m b = new m(new ab.m(4));
    public static final m c = new m(new ab.m(5));
    public static final m d = new m(new ab.m(6));

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
        q qVar = new q(q9.a.class, ScheduledExecutorService.class);
        q[] qVarArr = {new q(q9.a.class, ExecutorService.class), new q(q9.a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            wc.a(qVar2, "Null interface");
        }
        Collections.addAll(hashSet, qVarArr);
        u9.a aVar = new u9.a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new x(8), hashSet3);
        q qVar3 = new q(b.class, ScheduledExecutorService.class);
        q[] qVarArr2 = {new q(b.class, ExecutorService.class), new q(b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(qVar3);
        for (q qVar4 : qVarArr2) {
            wc.a(qVar4, "Null interface");
        }
        Collections.addAll(hashSet4, qVarArr2);
        u9.a aVar2 = new u9.a(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new x(9), hashSet6);
        q qVar5 = new q(c.class, ScheduledExecutorService.class);
        q[] qVarArr3 = {new q(c.class, ExecutorService.class), new q(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(qVar5);
        for (q qVar6 : qVarArr3) {
            wc.a(qVar6, "Null interface");
        }
        Collections.addAll(hashSet7, qVarArr3);
        u9.a aVar3 = new u9.a(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new x(10), hashSet9);
        j0 b10 = u9.a.b(new q(d.class, Executor.class));
        b10.f = new x(11);
        return Arrays.asList(aVar, aVar2, aVar3, b10.b());
    }
}
