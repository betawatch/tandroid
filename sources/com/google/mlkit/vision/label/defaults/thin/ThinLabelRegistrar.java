package com.google.mlkit.vision.label.defaults.thin;

import b2.n0;
import bc.d;
import bc.e;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import s9.a;
import s9.k;
import sb.g;
import w7.f5;
import y7.l;
import y7.n;
import y7.r;
import yb.b;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class ThinLabelRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        n0 a2 = a.a(e.class);
        a2.a(k.a(g.class));
        a2.f = bc.g.b;
        a b10 = a2.b();
        n0 a10 = a.a(d.class);
        a10.a(k.a(e.class));
        a10.a(k.a(sb.d.class));
        a10.f = bc.g.c;
        a b11 = a10.b();
        n0 a11 = a.a(b.class);
        a11.b = 1;
        a11.a(new k(1, 1, d.class));
        a11.f = bc.g.d;
        a b12 = a11.b();
        l lVar = n.b;
        Object[] objArr = {b10, b11, b12};
        f5.a(3, objArr);
        return new r(3, objArr);
    }
}
