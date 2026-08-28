package com.google.mlkit.vision.label.defaults.thin;

import com.google.firebase.components.ComponentRegistrar;
import f7.y7;
import h7.q;
import h7.s;
import h7.w;
import hb.d;
import hb.e;
import java.util.List;
import tg.b;
import y8.a;
import y8.j;
import ya.g;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class ThinLabelRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        b a2 = a.a(e.class);
        a2.a(j.a(g.class));
        a2.f = hb.g.b;
        a b10 = a2.b();
        b a3 = a.a(d.class);
        a3.a(j.a(e.class));
        a3.a(j.a(ya.d.class));
        a3.f = hb.g.c;
        a b11 = a3.b();
        b a10 = a.a(eb.b.class);
        a10.b = 1;
        a10.a(new j(1, 1, d.class));
        a10.f = hb.g.d;
        a b12 = a10.b();
        q qVar = s.b;
        Object[] objArr = {b10, b11, b12};
        y7.a(3, objArr);
        return new w(3, objArr);
    }
}
