package com.google.firebase;

import b2.i0;
import com.google.firebase.components.ComponentRegistrar;
import hd.h;
import java.util.List;
import java.util.concurrent.Executor;
import k9.i;
import m9.b;
import m9.c;
import m9.d;
import q9.a;
import q9.j;
import q9.s;
import zd.a0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        i0 b10 = a.b(new s(m9.a.class, a0.class));
        b10.a(new j(new s(m9.a.class, Executor.class), 1, 0));
        b10.f = i.b;
        a b11 = b10.b();
        i0 b12 = a.b(new s(c.class, a0.class));
        b12.a(new j(new s(c.class, Executor.class), 1, 0));
        b12.f = i.c;
        a b13 = b12.b();
        i0 b14 = a.b(new s(b.class, a0.class));
        b14.a(new j(new s(b.class, Executor.class), 1, 0));
        b14.f = i.d;
        a b15 = b14.b();
        i0 b16 = a.b(new s(d.class, a0.class));
        b16.a(new j(new s(d.class, Executor.class), 1, 0));
        b16.f = i.e;
        return h.c(b11, b13, b15, b16.b());
    }
}
