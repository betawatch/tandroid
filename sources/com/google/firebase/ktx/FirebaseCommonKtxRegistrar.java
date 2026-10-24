package com.google.firebase.ktx;

import b2.m0;
import be.a0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import jd.h;
import n9.b;
import n9.c;
import n9.d;
import r9.a;
import r9.j;
import r9.r;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        m0 b10 = a.b(new r(n9.a.class, a0.class));
        b10.a(new j(new r(n9.a.class, Executor.class), 1, 0));
        b10.f = wa.a.b;
        a b11 = b10.b();
        m0 b12 = a.b(new r(c.class, a0.class));
        b12.a(new j(new r(c.class, Executor.class), 1, 0));
        b12.f = wa.a.c;
        a b13 = b12.b();
        m0 b14 = a.b(new r(b.class, a0.class));
        b14.a(new j(new r(b.class, Executor.class), 1, 0));
        b14.f = wa.a.d;
        a b15 = b14.b();
        m0 b16 = a.b(new r(d.class, a0.class));
        b16.a(new j(new r(d.class, Executor.class), 1, 0));
        b16.f = wa.a.e;
        return h.c(b11, b13, b15, b16.b());
    }
}
