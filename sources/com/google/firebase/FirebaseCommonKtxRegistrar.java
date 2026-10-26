package com.google.firebase;

import b2.n0;
import ce.a0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kd.h;
import m9.i;
import o9.b;
import o9.c;
import o9.d;
import s9.a;
import s9.j;
import s9.r;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        n0 b10 = a.b(new r(o9.a.class, a0.class));
        b10.a(new j(new r(o9.a.class, Executor.class), 1, 0));
        b10.f = i.b;
        a b11 = b10.b();
        n0 b12 = a.b(new r(c.class, a0.class));
        b12.a(new j(new r(c.class, Executor.class), 1, 0));
        b12.f = i.c;
        a b13 = b12.b();
        n0 b14 = a.b(new r(b.class, a0.class));
        b14.a(new j(new r(b.class, Executor.class), 1, 0));
        b14.f = i.d;
        a b15 = b14.b();
        n0 b16 = a.b(new r(d.class, a0.class));
        b16.a(new j(new r(d.class, Executor.class), 1, 0));
        b16.f = i.e;
        return h.c(b11, b13, b15, b16.b());
    }
}
