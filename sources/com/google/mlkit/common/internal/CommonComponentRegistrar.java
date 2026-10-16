package com.google.mlkit.common.internal;

import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import oa.d;
import qb.b;
import qb.c;
import r9.a;
import r9.j;
import rb.g;
import rb.h;
import rb.k;
import t7.u;
import w7.p7;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        n0 a2 = a.a(sb.a.class);
        a2.a(j.a(g.class));
        a2.f = new d(15);
        a b10 = a2.b();
        n0 a10 = a.a(h.class);
        a10.f = new pb.a(15);
        a b11 = a10.b();
        n0 a11 = a.a(c.class);
        a11.a(new j(2, 0, b.class));
        a11.f = new rb.b(15);
        a b12 = a11.b();
        n0 a12 = a.a(rb.d.class);
        a12.a(new j(1, 1, h.class));
        a12.f = new sb.a(15);
        a b13 = a12.b();
        n0 a13 = a.a(rb.a.class);
        a13.f = new u(15);
        a b14 = a13.b();
        n0 a14 = a.a(rb.b.class);
        a14.a(j.a(rb.a.class));
        a14.f = new d(16);
        a b15 = a14.b();
        n0 a15 = a.a(pb.a.class);
        a15.a(j.a(g.class));
        a15.f = new pb.a(16);
        a b16 = a15.b();
        n0 a16 = a.a(b.class);
        a16.b = 1;
        a16.a(new j(1, 1, pb.a.class));
        a16.f = new rb.b(16);
        a b17 = a16.b();
        t7.b bVar = t7.d.b;
        Object[] objArr = {k.b, b10, b11, b12, b13, b14, b15, b16, b17};
        p7.a(9, objArr);
        return new t7.g(9, objArr);
    }
}
