package com.google.mlkit.common.internal;

import b2.i0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import pb.c;
import q9.a;
import q9.j;
import qb.b;
import qb.d;
import qb.g;
import qb.h;
import qb.k;
import t7.u;
import w7.h7;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        i0 a2 = a.a(rb.a.class);
        a2.a(j.a(g.class));
        a2.f = new b(14);
        a b10 = a2.b();
        i0 a10 = a.a(h.class);
        a10.f = new rb.a(14);
        a b11 = a10.b();
        i0 a11 = a.a(c.class);
        a11.a(new j(2, 0, pb.b.class));
        a11.f = new u(14);
        a b12 = a11.b();
        i0 a12 = a.a(d.class);
        a12.a(new j(1, 1, h.class));
        a12.f = new na.d();
        a b13 = a12.b();
        i0 a13 = a.a(qb.a.class);
        a13.f = new ob.a(15);
        a b14 = a13.b();
        i0 a14 = a.a(b.class);
        a14.a(j.a(qb.a.class));
        a14.f = new b(15);
        a b15 = a14.b();
        i0 a15 = a.a(ob.a.class);
        a15.a(j.a(g.class));
        a15.f = new rb.a(15);
        a b16 = a15.b();
        i0 a16 = a.a(pb.b.class);
        a16.b = 1;
        a16.a(new j(1, 1, ob.a.class));
        a16.f = new u(15);
        a b17 = a16.b();
        t7.b bVar = t7.d.b;
        Object[] objArr = {k.b, b10, b11, b12, b13, b14, b15, b16, b17};
        h7.a(9, objArr);
        return new t7.g(9, objArr);
    }
}
