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
import u9.i;
import vb.b;
import yb.c;
import yb.d;
import yb.f;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class ThinLabelRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        j0 a10 = a.a(d.class);
        a10.a(i.a(g.class));
        a10.f = f.b;
        a b10 = a10.b();
        j0 a11 = a.a(c.class);
        a11.a(i.a(d.class));
        a11.a(i.a(pb.d.class));
        a11.f = f.c;
        a b11 = a11.b();
        j0 a12 = a.a(b.class);
        a12.b = 1;
        a12.a(new i(1, 1, c.class));
        a12.f = f.d;
        a b12 = a12.b();
        s sVar = u.b;
        Object[] objArr = {b10, b11, b12};
        u0.a(3, objArr);
        return new a0(3, objArr);
    }
}
