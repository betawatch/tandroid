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
import u9.i;
import u9.q;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int d = 0;
    public final q a = new q(a.class, ExecutorService.class);
    public final q b = new q(b.class, ExecutorService.class);
    public final q c = new q(c.class, ExecutorService.class);

    static {
        d dVar = d.a;
        Map map = hb.c.b;
        if (map.containsKey(dVar)) {
            Log.d("FirebaseSessions", "Dependency " + dVar + " already added.");
            return;
        }
        map.put(dVar, new hb.a(new CountDownLatch(1)));
        Log.d("FirebaseSessions", "Dependency to " + dVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        j0 a10 = u9.a.a(w9.b.class);
        a10.d = "fire-cls";
        a10.a(i.a(g.class));
        a10.a(i.a(va.d.class));
        a10.a(new i(this.a, 1, 0));
        a10.a(new i(this.b, 1, 0));
        a10.a(new i(this.c, 1, 0));
        a10.a(new i(0, 2, x9.a.class));
        a10.a(new i(0, 2, p9.a.class));
        a10.a(new i(0, 2, fb.a.class));
        a10.f = new e(this, 3);
        a10.c(2);
        return Arrays.asList(a10.b(), h8.a("fire-cls", "20.1.1"));
    }
}
