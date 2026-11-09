package com.google.firebase.crashlytics;

import a8.h8;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import e2.j0;
import hb.d;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import o9.g;
import q9.a;
import q9.b;
import q9.c;
import u5.e;
import u9.j;
import u9.r;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int d = 0;
    public final r a = new r(a.class, ExecutorService.class);
    public final r b = new r(b.class, ExecutorService.class);
    public final r c = new r(c.class, ExecutorService.class);

    static {
        d dVar = d.a;
        Map map = hb.c.b;
        if (map.containsKey(dVar)) {
            Log.d("FirebaseSessions", "Dependency " + dVar + " already added.");
            return;
        }
        map.put(dVar, new hb.a(new CountDownLatch(1)));
        StringBuilder sb2 = new StringBuilder("Dependency to ");
        sb2.append(dVar);
        rf.b.p(sb2, " added.", "FirebaseSessions");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        j0 a10 = u9.a.a(w9.b.class);
        a10.d = "fire-cls";
        a10.a(j.a(g.class));
        a10.a(j.a(va.d.class));
        a10.a(new j(this.a, 1, 0));
        a10.a(new j(this.b, 1, 0));
        a10.a(new j(this.c, 1, 0));
        a10.a(new j(0, 2, x9.a.class));
        a10.a(new j(0, 2, p9.a.class));
        a10.a(new j(0, 2, fb.a.class));
        a10.f = new e(this, 3);
        a10.c(2);
        return Arrays.asList(a10.b(), h8.a("fire-cls", "20.1.1"));
    }
}
