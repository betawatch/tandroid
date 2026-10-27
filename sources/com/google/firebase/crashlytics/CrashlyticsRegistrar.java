package com.google.firebase.crashlytics;

import android.util.Log;
import b2.n0;
import cb.a;
import cb.c;
import cb.d;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import m9.h;
import s0.b;
import s9.k;
import w7.p5;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int a = 0;

    static {
        c cVar = c.a;
        Map map = c.b;
        d dVar = d.a;
        if (map.containsKey(dVar)) {
            Log.d("SessionsDependencies", "Dependency " + dVar + " already added.");
            return;
        }
        map.put(dVar, new a(new le.d(true)));
        Log.d("SessionsDependencies", "Dependency to " + dVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        n0 a2 = s9.a.a(u9.c.class);
        a2.d = "fire-cls";
        a2.a(k.a(h.class));
        a2.a(k.a(sa.d.class));
        a2.a(new k(0, 2, v9.a.class));
        a2.a(new k(0, 2, n9.a.class));
        a2.a(new k(0, 2, ab.a.class));
        a2.f = new b(this, 22);
        a2.c(2);
        return Arrays.asList(a2.b(), p5.a("fire-cls", "18.6.0"));
    }
}
