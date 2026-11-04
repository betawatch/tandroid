package com.google.firebase.crashlytics;

import android.util.Log;
import b8.r1;
import com.google.firebase.components.ComponentRegistrar;
import d2.l0;
import eb.d;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import n9.h;
import org.telegram.ui.ActionBar.e3;
import p9.a;
import p9.b;
import p9.c;
import t9.j;
import t9.r;
import ua.e;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int d = 0;
    public final r a = new r(a.class, ExecutorService.class);
    public final r b = new r(b.class, ExecutorService.class);
    public final r c = new r(c.class, ExecutorService.class);

    static {
        d dVar = d.a;
        Map map = eb.c.b;
        if (map.containsKey(dVar)) {
            Log.d("FirebaseSessions", "Dependency " + dVar + " already added.");
            return;
        }
        map.put(dVar, new eb.a(new CountDownLatch(1)));
        Log.d("FirebaseSessions", "Dependency to " + dVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        l0 a10 = t9.a.a(v9.b.class);
        a10.d = "fire-cls";
        a10.a(j.a(h.class));
        a10.a(j.a(e.class));
        a10.a(new j(this.a, 1, 0));
        a10.a(new j(this.b, 1, 0));
        a10.a(new j(this.c, 1, 0));
        a10.a(new j(0, 2, w9.a.class));
        a10.a(new j(0, 2, o9.a.class));
        a10.a(new j(0, 2, cb.a.class));
        a10.f = new e3(this, 26);
        a10.c(2);
        return Arrays.asList(a10.b(), r1.a("fire-cls", "20.1.1"));
    }
}
