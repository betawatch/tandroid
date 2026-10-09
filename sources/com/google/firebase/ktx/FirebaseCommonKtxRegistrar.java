package com.google.firebase.ktx;

import ae.b0;
import b2.i0;
import com.google.firebase.components.ComponentRegistrar;
import id.h;
import java.util.List;
import java.util.concurrent.Executor;
import m9.b;
import m9.c;
import m9.d;
import q9.a;
import q9.j;
import q9.r;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        i0 b10 = a.b(new r(m9.a.class, b0.class));
        b10.a(new j(new r(m9.a.class, Executor.class), 1, 0));
        b10.f = va.a.b;
        a b11 = b10.b();
        i0 b12 = a.b(new r(c.class, b0.class));
        b12.a(new j(new r(c.class, Executor.class), 1, 0));
        b12.f = va.a.c;
        a b13 = b12.b();
        i0 b14 = a.b(new r(b.class, b0.class));
        b14.a(new j(new r(b.class, Executor.class), 1, 0));
        b14.f = va.a.d;
        a b15 = b14.b();
        i0 b16 = a.b(new r(d.class, b0.class));
        b16.a(new j(new r(d.class, Executor.class), 1, 0));
        b16.f = va.a.e;
        return h.c(b11, b13, b15, b16.b());
    }
}
