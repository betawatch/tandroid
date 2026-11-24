package com.google.mlkit.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        wq2 b = xq2.b(kg7.class);
        b.a(if3.b(cg7.class));
        b.f = new b7d((byte) 0);
        xq2 b2 = b.b();
        wq2 b3 = xq2.b(eg7.class);
        b3.f = new ndd((byte) 0);
        xq2 b4 = b3.b();
        wq2 b5 = xq2.b(n89.class);
        b5.a(new if3(2, 0, m89.class));
        b5.f = new b7d((byte) 1);
        xq2 b6 = b5.b();
        wq2 b7 = xq2.b(f64.class);
        b7.a(new if3(1, 1, eg7.class));
        b7.f = new tad();
        xq2 b8 = b7.b();
        wq2 b9 = xq2.b(hj2.class);
        b9.f = new ndd((byte) 1);
        xq2 b10 = b9.b();
        wq2 b11 = xq2.b(jk2.class);
        b11.a(if3.b(hj2.class));
        b11.f = new jed();
        xq2 b12 = b11.b();
        wq2 b13 = xq2.b(f8e.class);
        b13.a(if3.b(cg7.class));
        b13.f = new h8d((byte) 2);
        xq2 b14 = b13.b();
        wq2 b15 = xq2.b(m89.class);
        b15.e = true;
        b15.a(new if3(1, 1, f8e.class));
        b15.f = new lfd();
        xq2 b16 = b15.b();
        d8d d8dVar = t8d.n;
        Object[] objArr = {uha.b, b2, b4, b6, b8, b10, b12, b14, b16};
        h1f.a(9, objArr);
        return new dad(9, objArr);
    }
}
