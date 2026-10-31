package com.google.mlkit.vision.label.defaults.thin;

import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import jb.g;
import pb.b;
import r9.a;
import r9.j;
import sb.c;
import sb.d;
import sb.f;
import w7.s8;
import x7.m;
import x7.o;
import x7.s;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class ThinLabelRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        n0 a2 = a.a(d.class);
        a2.a(j.a(g.class));
        a2.f = f.b;
        a b10 = a2.b();
        n0 a10 = a.a(c.class);
        a10.a(j.a(d.class));
        a10.a(j.a(jb.d.class));
        a10.f = f.c;
        a b11 = a10.b();
        n0 a11 = a.a(b.class);
        a11.b = 1;
        a11.a(new j(1, 1, c.class));
        a11.f = f.d;
        a b12 = a11.b();
        m mVar = o.b;
        Object[] objArr = {b10, b11, b12};
        s8.a(3, objArr);
        return new s(3, objArr);
    }
}
