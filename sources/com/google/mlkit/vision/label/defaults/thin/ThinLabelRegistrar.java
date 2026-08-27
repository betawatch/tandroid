package com.google.mlkit.vision.label.defaults.thin;

import com.google.firebase.components.ComponentRegistrar;
import g7.b8;
import i7.q;
import i7.s;
import i7.w;
import ib.d;
import ib.e;
import java.util.List;
import ug.b;
import z8.a;
import z8.i;
import za.g;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public class ThinLabelRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        b a2 = a.a(e.class);
        a2.a(i.a(g.class));
        a2.f = ib.g.b;
        a b10 = a2.b();
        b a3 = a.a(d.class);
        a3.a(i.a(e.class));
        a3.a(i.a(za.d.class));
        a3.f = ib.g.c;
        a b11 = a3.b();
        b a10 = a.a(fb.b.class);
        a10.b = 1;
        a10.a(new i(1, 1, d.class));
        a10.f = ib.g.d;
        a b12 = a10.b();
        q qVar = s.b;
        Object[] objArr = {b10, b11, b12};
        b8.a(3, objArr);
        return new w(3, objArr);
    }
}
