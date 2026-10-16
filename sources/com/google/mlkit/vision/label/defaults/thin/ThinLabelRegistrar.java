package com.google.mlkit.vision.label.defaults.thin;

import ac.d;
import ac.e;
import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import r9.a;
import r9.j;
import rb.g;
import w7.k8;
import x7.m;
import x7.o;
import x7.s;
import xb.b;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public class ThinLabelRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        n0 a2 = a.a(e.class);
        a2.a(j.a(g.class));
        a2.f = ac.g.b;
        a b10 = a2.b();
        n0 a10 = a.a(d.class);
        a10.a(j.a(e.class));
        a10.a(j.a(rb.d.class));
        a10.f = ac.g.c;
        a b11 = a10.b();
        n0 a11 = a.a(b.class);
        a11.b = 1;
        a11.a(new j(1, 1, d.class));
        a11.f = ac.g.d;
        a b12 = a11.b();
        m mVar = o.b;
        Object[] objArr = {b10, b11, b12};
        k8.a(3, objArr);
        return new s(3, objArr);
    }
}
