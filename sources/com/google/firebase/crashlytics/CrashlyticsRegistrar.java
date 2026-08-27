package com.google.firebase.crashlytics;

import a9.m;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import g7.i7;
import ja.a;
import ja.c;
import ja.d;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import t8.h;
import ug.b;
import z8.i;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        map.put(dVar, new a(new rd.d(true)));
        Log.d("SessionsDependencies", "Dependency to " + dVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        b a2 = z8.a.a(b9.c.class);
        a2.c = "fire-cls";
        a2.a(i.a(h.class));
        a2.a(i.a(z9.d.class));
        a2.a(new i(0, 2, c9.a.class));
        a2.a(new i(0, 2, u8.a.class));
        a2.a(new i(0, 2, ha.a.class));
        a2.f = new m(this, 11);
        a2.c(2);
        return Arrays.asList(a2.b(), i7.a("fire-cls", "18.6.0"));
    }
}
