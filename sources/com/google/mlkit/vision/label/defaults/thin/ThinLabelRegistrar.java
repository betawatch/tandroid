package com.google.mlkit.vision.label.defaults.thin;

import c9.a;
import c9.b;
import c9.m;
import cb.h;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import l7.q;
import l7.s;
import l7.w;
import lb.d;
import lb.e;
import lb.g;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        b12.a(m.b(cb.d.class));
        b12.g = g.c;
        b b13 = b12.b();
        a b14 = b.b(ib.b.class);
        b14.c = 1;
        b14.a(new m(1, 1, d.class));
        b14.g = g.d;
        b b15 = b14.b();
        q qVar = s.b;
        Object[] objArr = {b11, b13, b15};
        k7.g.a(3, objArr);
        return new w(3, objArr);
    }
}
