package com.google.mlkit.vision.label.defaults.thin;

import com.google.firebase.components.ComponentRegistrar;
import d2.l0;
import java.util.List;
import mb.g;
import sb.b;
import t9.a;
import t9.j;
import vb.c;
import vb.d;
import vb.f;
import x7.u6;
import z7.l;
import z7.n;
import z7.r;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class ThinLabelRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        l0 a10 = a.a(d.class);
        a10.a(j.a(g.class));
        a10.f = f.b;
        a b10 = a10.b();
        l0 a11 = a.a(c.class);
        a11.a(j.a(d.class));
        a11.a(j.a(mb.d.class));
        a11.f = f.c;
        a b11 = a11.b();
        l0 a12 = a.a(b.class);
        a12.b = 1;
        a12.a(new j(1, 1, c.class));
        a12.f = f.d;
        a b12 = a12.b();
        l lVar = n.b;
        Object[] objArr = {b10, b11, b12};
        u6.a(3, objArr);
        return new r(3, objArr);
    }
}
