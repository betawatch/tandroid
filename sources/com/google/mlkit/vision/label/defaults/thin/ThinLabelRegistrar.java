package com.google.mlkit.vision.label.defaults.thin;

import b2.i0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import q9.a;
import q9.j;
import qb.g;
import w7.j8;
import wb.b;
import x7.m;
import x7.o;
import x7.s;
import zb.d;
import zb.e;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public class ThinLabelRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        i0 a2 = a.a(e.class);
        a2.a(j.a(g.class));
        a2.f = zb.g.b;
        a b10 = a2.b();
        i0 a10 = a.a(d.class);
        a10.a(j.a(e.class));
        a10.a(j.a(qb.d.class));
        a10.f = zb.g.c;
        a b11 = a10.b();
        i0 a11 = a.a(b.class);
        a11.b = 1;
        a11.a(new j(1, 1, d.class));
        a11.f = zb.g.d;
        a b12 = a11.b();
        m mVar = o.b;
        Object[] objArr = {b10, b11, b12};
        j8.a(3, objArr);
        return new s(3, objArr);
    }
}
