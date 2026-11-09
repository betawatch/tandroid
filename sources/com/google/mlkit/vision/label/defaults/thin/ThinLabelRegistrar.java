package com.google.mlkit.vision.label.defaults.thin;

import a8.a0;
import a8.s;
import a8.u;
import a8.u0;
import com.google.firebase.components.ComponentRegistrar;
import e2.j0;
import java.util.List;
import pb.g;
import u9.a;
import u9.j;
import vb.b;
import yb.c;
import yb.d;
import yb.f;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public class ThinLabelRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        j0 a10 = a.a(d.class);
        a10.a(j.a(g.class));
        a10.f = f.b;
        a b10 = a10.b();
        j0 a11 = a.a(c.class);
        a11.a(j.a(d.class));
        a11.a(j.a(pb.d.class));
        a11.f = f.c;
        a b11 = a11.b();
        j0 a12 = a.a(b.class);
        a12.b = 1;
        a12.a(new j(1, 1, c.class));
        a12.f = f.d;
        a b12 = a12.b();
        s sVar = u.b;
        Object[] objArr = {b10, b11, b12};
        u0.a(3, objArr);
        return new a0(3, objArr);
    }
}
