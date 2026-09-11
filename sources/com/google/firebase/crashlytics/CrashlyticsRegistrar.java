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
import r9.i;
import w7.o8;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
        a2.f = new i(this, 26);
        a2.c(2);
        return Arrays.asList(a2.b(), o8.a("fire-cls", "18.6.0"));
    }
}
