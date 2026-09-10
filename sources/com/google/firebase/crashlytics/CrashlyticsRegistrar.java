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
import w7.o8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        a2.f = new b(this, 21);
        a2.c(2);
        return Arrays.asList(a2.b(), o8.a("fire-cls", "18.6.0"));
    }
}
