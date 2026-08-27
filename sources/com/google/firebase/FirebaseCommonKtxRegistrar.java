package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import id.a0;
import java.util.List;
import java.util.concurrent.Executor;
import qc.h;
import ug.b;
import v8.c;
import v8.d;
import z8.a;
import z8.i;
import z8.q;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        b b10 = a.b(new q(v8.a.class, a0.class));
        b10.a(new i(new q(v8.a.class, Executor.class), 1, 0));
        b10.f = t8.i.b;
        a b11 = b10.b();
        b b12 = a.b(new q(c.class, a0.class));
        b12.a(new i(new q(c.class, Executor.class), 1, 0));
        b12.f = t8.i.c;
        a b13 = b12.b();
        b b14 = a.b(new q(v8.b.class, a0.class));
        b14.a(new i(new q(v8.b.class, Executor.class), 1, 0));
        b14.f = t8.i.d;
        a b15 = b14.b();
        b b16 = a.b(new q(d.class, a0.class));
        b16.a(new i(new q(d.class, Executor.class), 1, 0));
        b16.f = t8.i.e;
        return h.c(b11, b13, b15, b16.b());
    }
}
