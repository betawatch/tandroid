package com.google.firebase.crashlytics;

import a9.b;
import a9.f;
import a9.m;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import h7.v7;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import ka.a;
import ka.c;
import ka.d;
import u8.g;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        map.put(dVar, new a(new sd.d(true)));
        Log.d("SessionsDependencies", "Dependency to " + dVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a9.a b10 = b.b(c9.c.class);
        b10.c = "fire-cls";
        b10.a(m.b(g.class));
        b10.a(m.b(aa.d.class));
        b10.a(new m(0, 2, d9.b.class));
        b10.a(new m(0, 2, v8.a.class));
        b10.a(new m(0, 2, ia.a.class));
        b10.g = new f(this, 19);
        b10.c(2);
        return Arrays.asList(b10.b(), v7.a("fire-cls", "18.6.0"));
    }
}
