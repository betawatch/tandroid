package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<xq2> getComponents() {
        wq2 a = xq2.a(new yy8(me0.class, fy2.class));
        a.a(new if3(new yy8(me0.class, Executor.class), 1, 0));
        a.f = k1f.c;
        xq2 b = a.b();
        wq2 a2 = xq2.a(new yy8(i36.class, fy2.class));
        a2.a(new if3(new yy8(i36.class, Executor.class), 1, 0));
        a2.f = k4f.c;
        xq2 b2 = a2.b();
        wq2 a3 = xq2.a(new yy8(nl0.class, fy2.class));
        a3.a(new if3(new yy8(nl0.class, Executor.class), 1, 0));
        a3.f = q7f.c;
        xq2 b3 = a3.b();
        wq2 a4 = xq2.a(new yy8(n6c.class, fy2.class));
        a4.a(new if3(new yy8(n6c.class, Executor.class), 1, 0));
        a4.f = fgf.c;
        return lm2.b(b, b2, b3, a4.b());
    }
}
