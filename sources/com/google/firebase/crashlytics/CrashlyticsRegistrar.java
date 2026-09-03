package com.google.firebase.crashlytics;

import android.util.Log;
import androidx.emoji2.text.w;
import c9.b;
import c9.l;
import com.google.firebase.components.ComponentRegistrar;
import j7.m8;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import ma.a;
import ma.c;
import ma.d;
import w8.g;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        b10.g = new w(this, 26);
        b10.c(2);
        return Arrays.asList(b10.b(), m8.a("fire-cls", "18.6.0"));
    }
}
