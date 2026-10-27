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
import s9.k;
import s9.s;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        n0 b10 = a.b(new s(o9.a.class, a0.class));
        b10.a(new k(new s(o9.a.class, Executor.class), 1, 0));
        b10.f = i.b;
        a b11 = b10.b();
        n0 b12 = a.b(new s(c.class, a0.class));
        b12.a(new k(new s(c.class, Executor.class), 1, 0));
        b12.f = i.c;
        a b13 = b12.b();
        n0 b14 = a.b(new s(b.class, a0.class));
        b14.a(new k(new s(b.class, Executor.class), 1, 0));
        b14.f = i.d;
        a b15 = b14.b();
        n0 b16 = a.b(new s(d.class, a0.class));
        b16.a(new k(new s(d.class, Executor.class), 1, 0));
        b16.f = i.e;
        return h.c(b11, b13, b15, b16.b());
    }
}
