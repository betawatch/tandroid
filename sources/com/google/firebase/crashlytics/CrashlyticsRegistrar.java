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
import l9.h;
import r9.j;
import rh.x6;
import w7.v9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        map.put(dVar, new a(new ce.d(true)));
        Log.d("SessionsDependencies", "Dependency to " + dVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        n0 a2 = r9.a.a(t9.c.class);
        a2.d = "fire-cls";
        a2.a(j.a(h.class));
        a2.a(j.a(ra.d.class));
        a2.a(new j(0, 2, u9.a.class));
        a2.a(new j(0, 2, m9.a.class));
        a2.a(new j(0, 2, ab.a.class));
        a2.f = new x6(this, 23);
        a2.c(2);
        return Arrays.asList(a2.b(), v9.a("fire-cls", "18.6.0"));
    }
}
