package com.google.firebase.ktx;

import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import n9.b;
import n9.c;
import n9.d;
import r9.a;
import r9.j;
import r9.r;
import td.a0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        n0 b10 = a.b(new r(n9.a.class, a0.class));
        b10.a(new j(new r(n9.a.class, Executor.class), 1, 0));
        b10.f = wa.a.b;
        a b11 = b10.b();
        n0 b12 = a.b(new r(c.class, a0.class));
        b12.a(new j(new r(c.class, Executor.class), 1, 0));
        b12.f = wa.a.c;
        a b13 = b12.b();
        n0 b14 = a.b(new r(b.class, a0.class));
        b14.a(new j(new r(b.class, Executor.class), 1, 0));
        b14.f = wa.a.d;
        a b15 = b14.b();
        n0 b16 = a.b(new r(d.class, a0.class));
        b16.a(new j(new r(d.class, Executor.class), 1, 0));
        b16.f = wa.a.e;
        return bd.j.c(b11, b13, b15, b16.b());
    }
}
