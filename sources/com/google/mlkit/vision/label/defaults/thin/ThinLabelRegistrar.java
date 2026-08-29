package com.google.mlkit.vision.label.defaults.thin;

import a9.a;
import a9.b;
import a9.m;
import ab.h;
import com.google.firebase.components.ComponentRegistrar;
import h7.r8;
import j7.q;
import j7.s;
import j7.w;
import java.util.List;
import jb.d;
import jb.e;
import jb.g;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class ThinLabelRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a b10 = b.b(e.class);
        b10.a(m.b(h.class));
        b10.g = g.b;
        b b11 = b10.b();
        a b12 = b.b(d.class);
        b12.a(m.b(e.class));
        b12.a(m.b(ab.d.class));
        b12.g = g.c;
        b b13 = b12.b();
        a b14 = b.b(gb.b.class);
        b14.b = 1;
        b14.a(new m(1, 1, d.class));
        b14.g = g.d;
        b b15 = b14.b();
        q qVar = s.b;
        Object[] objArr = {b11, b13, b15};
        r8.a(3, objArr);
        return new w(3, objArr);
    }
}
