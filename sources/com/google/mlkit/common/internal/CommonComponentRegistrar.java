package com.google.mlkit.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import d2.l0;
import java.util.List;
import lb.c;
import mb.b;
import mb.d;
import mb.g;
import mb.h;
import mb.k;
import ra.e;
import t9.a;
import t9.j;
import v7.s;
import x7.i5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        l0 a10 = a.a(nb.a.class);
        a10.a(j.a(g.class));
        a10.f = new b(11);
        a b10 = a10.b();
        l0 a11 = a.a(h.class);
        a11.f = new nb.a(11);
        a b11 = a11.b();
        l0 a12 = a.a(c.class);
        a12.a(new j(2, 0, lb.b.class));
        a12.f = new e(11);
        a b12 = a12.b();
        l0 a13 = a.a(d.class);
        a13.a(new j(1, 1, h.class));
        a13.f = new s(11);
        a b13 = a13.b();
        l0 a14 = a.a(mb.a.class);
        a14.f = new kb.a(12);
        a b14 = a14.b();
        l0 a15 = a.a(b.class);
        a15.a(j.a(mb.a.class));
        a15.f = new b(12);
        a b15 = a15.b();
        l0 a16 = a.a(kb.a.class);
        a16.a(j.a(g.class));
        a16.f = new nb.a(12);
        a b16 = a16.b();
        l0 a17 = a.a(lb.b.class);
        a17.b = 1;
        a17.a(new j(1, 1, kb.a.class));
        a17.f = new e(12);
        a b17 = a17.b();
        v7.b bVar = v7.d.b;
        Object[] objArr = {k.b, b10, b11, b12, b13, b14, b15, b16, b17};
        i5.a(9, objArr);
        return new v7.g(9, objArr);
    }
}
