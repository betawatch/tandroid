package com.google.firebase.crashlytics;

import ab.a;
import ab.c;
import ab.d;
import android.util.Log;
import b2.i0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import k9.h;
import q9.j;
import s0.b;
import w7.p8;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
        map.put(dVar, new a(new ie.d(true)));
        Log.d("SessionsDependencies", "Dependency to " + dVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        i0 a2 = q9.a.a(s9.c.class);
        a2.d = "fire-cls";
        a2.a(j.a(h.class));
        a2.a(j.a(qa.d.class));
        a2.a(new j(0, 2, t9.a.class));
        a2.a(new j(0, 2, l9.a.class));
        a2.a(new j(0, 2, ya.a.class));
        a2.f = new b(this, 18);
        a2.c(2);
        return Arrays.asList(a2.b(), p8.a("fire-cls", "18.6.0"));
    }
}
