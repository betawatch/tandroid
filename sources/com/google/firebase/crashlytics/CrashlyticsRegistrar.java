package com.google.firebase.crashlytics;

import android.util.Log;
import b2.n0;
import bb.a;
import bb.c;
import bb.d;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import l9.h;
import r9.j;
import w7.w8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        map.put(dVar, new a(new ke.d(true)));
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
        a2.a(new j(0, 2, za.a.class));
        a2.f = new t0.a(this, 2);
        a2.c(2);
        return Arrays.asList(a2.b(), w8.a("fire-cls", "18.6.0"));
    }
}
