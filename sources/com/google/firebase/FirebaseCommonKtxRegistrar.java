package com.google.firebase;

import a9.a;
import a9.b;
import a9.m;
import a9.v;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import jd.a0;
import u8.h;
import w8.c;
import w8.d;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        a a2 = b.a(new v(w8.a.class, a0.class));
        a2.a(new m(new v(w8.a.class, Executor.class), 1, 0));
        a2.g = h.b;
        b b10 = a2.b();
        a a10 = b.a(new v(c.class, a0.class));
        a10.a(new m(new v(c.class, Executor.class), 1, 0));
        a10.g = h.c;
        b b11 = a10.b();
        a a11 = b.a(new v(w8.b.class, a0.class));
        a11.a(new m(new v(w8.b.class, Executor.class), 1, 0));
        a11.g = h.d;
        b b12 = a11.b();
        a a12 = b.a(new v(d.class, a0.class));
        a12.a(new m(new v(d.class, Executor.class), 1, 0));
        a12.g = h.e;
        return rc.h.c(b10, b11, b12, a12.b());
    }
}
