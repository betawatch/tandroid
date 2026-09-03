package com.google.mlkit.common.internal;

import c9.a;
import c9.b;
import c9.m;
import cb.d;
import cb.h;
import cb.i;
import cb.l;
import com.google.firebase.components.ComponentRegistrar;
import h7.g;
import h7.u;
import j7.s7;
import java.util.List;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        a b10 = b.b(db.a.class);
        b10.a(m.b(h.class));
        b10.g = new ab.a(26);
        b b11 = b10.b();
        a b12 = b.b(i.class);
        b12.g = new cb.b(26);
        b b13 = b12.b();
        a b14 = b.b(bb.b.class);
        b14.a(new m(2, 0, bb.a.class));
        b14.g = new db.a(26);
        b b15 = b14.b();
        a b16 = b.b(d.class);
        b16.a(new m(1, 1, i.class));
        b16.g = new u(26);
        b b17 = b16.b();
        a b18 = b.b(cb.a.class);
        b18.g = new z9.d(26);
        b b19 = b18.b();
        a b20 = b.b(cb.b.class);
        b20.a(m.b(cb.a.class));
        b20.g = new ab.a(27);
        b b21 = b20.b();
        a b22 = b.b(ab.a.class);
        b22.a(m.b(h.class));
        b22.g = new cb.b(27);
        b b23 = b22.b();
        a b24 = b.b(bb.a.class);
        b24.c = 1;
        b24.a(new m(1, 1, ab.a.class));
        b24.g = new db.a(27);
        b b25 = b24.b();
        h7.b bVar = h7.d.b;
        Object[] objArr = {l.b, b11, b13, b15, b17, b19, b21, b23, b25};
        s7.a(9, objArr);
        return new g(9, objArr);
    }
}
