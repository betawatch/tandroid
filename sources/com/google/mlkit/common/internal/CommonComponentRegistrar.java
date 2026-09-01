package com.google.mlkit.common.internal;

import bb.c;
import c9.a;
import c9.b;
import c9.l;
import cb.d;
import cb.h;
import cb.i;
import com.google.firebase.components.ComponentRegistrar;
import h7.g;
import h7.u;
import j7.t7;
import java.util.List;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a b10 = b.b(db.a.class);
        b10.a(l.b(h.class));
        b10.g = new cb.b(26);
        b b11 = b10.b();
        a b12 = b.b(i.class);
        b12.g = new db.a(26);
        b b13 = b12.b();
        a b14 = b.b(c.class);
        b14.a(new l(2, 0, bb.b.class));
        b14.g = new u(26);
        b b15 = b14.b();
        a b16 = b.b(d.class);
        b16.a(new l(1, 1, i.class));
        b16.g = new z9.d(26);
        b b17 = b16.b();
        a b18 = b.b(cb.a.class);
        b18.g = new ab.a(27);
        b b19 = b18.b();
        a b20 = b.b(cb.b.class);
        b20.a(l.b(cb.a.class));
        b20.g = new cb.b(27);
        b b21 = b20.b();
        a b22 = b.b(ab.a.class);
        b22.a(l.b(h.class));
        b22.g = new db.a(27);
        b b23 = b22.b();
        a b24 = b.b(bb.b.class);
        b24.c = 1;
        b24.a(new l(1, 1, ab.a.class));
        b24.g = new u(27);
        b b25 = b24.b();
        h7.b bVar = h7.d.b;
        Object[] objArr = {cb.l.b, b11, b13, b15, b17, b19, b21, b23, b25};
        t7.a(9, objArr);
        return new g(9, objArr);
    }
}
