package com.google.firebase.crashlytics;

import android.util.Log;
import androidx.emoji2.text.w;
import c9.b;
import c9.l;
import com.google.firebase.components.ComponentRegistrar;
import j7.l8;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import ma.a;
import ma.c;
import ma.d;
import w8.g;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        map.put(dVar, new a(new ud.d(true)));
        Log.d("SessionsDependencies", "Dependency to " + dVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        c9.a b10 = b.b(e9.c.class);
        b10.a = "fire-cls";
        b10.a(l.b(g.class));
        b10.a(l.b(ca.d.class));
        b10.a(new l(0, 2, f9.a.class));
        b10.a(new l(0, 2, x8.a.class));
        b10.a(new l(0, 2, ka.a.class));
        b10.g = new w(this, 27);
        b10.c(2);
        return Arrays.asList(b10.b(), l8.a("fire-cls", "18.6.0"));
    }
}
