package com.google.mlkit.common.internal;

import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import ib.b;
import ib.c;
import java.util.List;
import jb.g;
import jb.h;
import jb.k;
import oa.d;
import r9.a;
import r9.j;
import t7.u;
import w7.s7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        n0 a2 = a.a(kb.a.class);
        a2.a(j.a(g.class));
        a2.f = new d(6);
        a b10 = a2.b();
        n0 a10 = a.a(h.class);
        a10.f = new u(6);
        a b11 = a10.b();
        n0 a11 = a.a(c.class);
        a11.a(new j(2, 0, b.class));
        a11.f = new hb.a(7);
        a b12 = a11.b();
        n0 a12 = a.a(jb.d.class);
        a12.a(new j(1, 1, h.class));
        a12.f = new jb.b(7);
        a b13 = a12.b();
        n0 a13 = a.a(jb.a.class);
        a13.f = new kb.a(7);
        a b14 = a13.b();
        n0 a14 = a.a(jb.b.class);
        a14.a(j.a(jb.a.class));
        a14.f = new d(7);
        a b15 = a14.b();
        n0 a15 = a.a(hb.a.class);
        a15.a(j.a(g.class));
        a15.f = new u(7);
        a b16 = a15.b();
        n0 a16 = a.a(b.class);
        a16.b = 1;
        a16.a(new j(1, 1, hb.a.class));
        a16.f = new hb.a(8);
        a b17 = a16.b();
        t7.b bVar = t7.d.b;
        Object[] objArr = {k.b, b10, b11, b12, b13, b14, b15, b16, b17};
        s7.a(9, objArr);
        return new t7.g(9, objArr);
    }
}
