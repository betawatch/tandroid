package com.google.firebase.ktx;

import c9.a;
import c9.b;
import c9.l;
import c9.t;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import ld.a0;
import tc.h;
import y8.c;
import y8.d;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        a a2 = b.a(new t(y8.a.class, a0.class));
        a2.a(new l(new t(y8.a.class, Executor.class), 1, 0));
        a2.g = ha.a.b;
        b b10 = a2.b();
        a a10 = b.a(new t(c.class, a0.class));
        a10.a(new l(new t(c.class, Executor.class), 1, 0));
        a10.g = ha.a.c;
        b b11 = a10.b();
        a a11 = b.a(new t(y8.b.class, a0.class));
        a11.a(new l(new t(y8.b.class, Executor.class), 1, 0));
        a11.g = ha.a.d;
        b b12 = a11.b();
        a a12 = b.a(new t(d.class, a0.class));
        a12.a(new l(new t(d.class, Executor.class), 1, 0));
        a12.g = ha.a.e;
        return h.c(b10, b11, b12, a12.b());
    }
}
