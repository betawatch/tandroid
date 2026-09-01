package com.google.mlkit.vision.label.defaults.thin;

import c9.a;
import c9.b;
import c9.l;
import cb.h;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import l7.q;
import l7.s;
import l7.w;
import lb.d;
import lb.e;
import lb.g;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class ThinLabelRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a b10 = b.b(e.class);
        b10.a(l.b(h.class));
        b10.g = g.b;
        b b11 = b10.b();
        a b12 = b.b(d.class);
        b12.a(l.b(e.class));
        b12.a(l.b(cb.d.class));
        b12.g = g.c;
        b b13 = b12.b();
        a b14 = b.b(ib.b.class);
        b14.c = 1;
        b14.a(new l(1, 1, d.class));
        b14.g = g.d;
        b b15 = b14.b();
        q qVar = s.b;
        Object[] objArr = {b11, b13, b15};
        k7.h.a(3, objArr);
        return new w(3, objArr);
    }
}
