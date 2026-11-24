package com.google.firebase.crashlytics;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int d = 0;
    public final yy8 a = new yy8(me0.class, ExecutorService.class);
    public final yy8 b = new yy8(nl0.class, ExecutorService.class);
    public final yy8 c = new yy8(i36.class, ExecutorService.class);

    static {
        Map map = pj4.b;
        s8a s8aVar = s8a.a;
        if (map.containsKey(s8aVar)) {
            Log.d("FirebaseSessions", "Dependency " + s8aVar + " already added.");
            return;
        }
        map.put(s8aVar, new nj4(new CountDownLatch(1)));
        StringBuilder sb = new StringBuilder("Dependency to ");
        sb.append(s8aVar);
        ts2.w(sb, " added.", "FirebaseSessions");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        wq2 b = xq2.b(ni4.class);
        b.a = "fire-cls";
        b.a(if3.b(li4.class));
        b.a(if3.b(ti4.class));
        b.a(new if3(this.a, 1, 0));
        b.a(new if3(this.b, 1, 0));
        b.a(new if3(this.c, 1, 0));
        b.a(new if3(0, 2, qz2.class));
        b.a(new if3(0, 2, qk.class));
        b.a(new if3(0, 2, fj4.class));
        b.f = new wm2(this, (byte) 5);
        b.c(2);
        return Arrays.asList(b.b(), rpe.a("fire-cls", "20.1.1"));
    }
}
