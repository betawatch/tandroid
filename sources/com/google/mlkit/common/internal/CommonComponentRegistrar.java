package com.google.mlkit.common.internal;

import c8.dd;
import com.google.firebase.components.ComponentRegistrar;
import e2.j0;
import java.util.List;
import ob.b;
import ob.c;
import pb.d;
import pb.g;
import pb.h;
import pb.k;
import u9.a;
import u9.i;
import w7.s;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        j0 a10 = a.a(qb.a.class);
        a10.a(i.a(g.class));
        a10.f = new s(14, false);
        a b10 = a10.b();
        j0 a11 = a.a(h.class);
        a11.f = new nb.a(15);
        a b11 = a11.b();
        j0 a12 = a.a(c.class);
        a12.a(new i(2, 0, b.class));
        a12.f = new pb.b(15);
        a b12 = a12.b();
        j0 a13 = a.a(d.class);
        a13.a(new i(1, 1, h.class));
        a13.f = new qb.a(15);
        a b13 = a13.b();
        j0 a14 = a.a(pb.a.class);
        a14.f = new sa.d(15);
        a b14 = a14.b();
        j0 a15 = a.a(pb.b.class);
        a15.a(i.a(pb.a.class));
        a15.f = new s(15, false);
        a b15 = a15.b();
        j0 a16 = a.a(nb.a.class);
        a16.a(i.a(g.class));
        a16.f = new nb.a(16);
        a b16 = a16.b();
        j0 a17 = a.a(b.class);
        a17.b = 1;
        a17.a(new i(1, 1, nb.a.class));
        a17.f = new pb.b(16);
        a b17 = a17.b();
        w7.b bVar = w7.d.b;
        Object[] objArr = {k.b, b10, b11, b12, b13, b14, b15, b16, b17};
        dd.a(9, objArr);
        return new w7.g(9, objArr);
    }
}
