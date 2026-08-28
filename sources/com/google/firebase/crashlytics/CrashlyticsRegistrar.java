package com.google.firebase.crashlytics;

import a9.e;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import f7.c7;
import ia.a;
import ia.c;
import ia.d;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import s8.h;
import tg.b;
import y8.j;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        map.put(dVar, new a(new qd.d(true)));
        Log.d("SessionsDependencies", "Dependency to " + dVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        b a2 = y8.a.a(e.class);
        a2.c = "fire-cls";
        a2.a(j.a(h.class));
        a2.a(j.a(y9.d.class));
        a2.a(new j(0, 2, b9.b.class));
        a2.a(new j(0, 2, t8.a.class));
        a2.a(new j(0, 2, ga.a.class));
        a2.f = new a9.b(this, 1);
        a2.c(2);
        return Arrays.asList(a2.b(), c7.a("fire-cls", "18.6.0"));
    }
}
