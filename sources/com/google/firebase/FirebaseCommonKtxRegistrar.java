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
import q9.r;
import zd.a0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        i0 b10 = a.b(new r(m9.a.class, a0.class));
        b10.a(new j(new r(m9.a.class, Executor.class), 1, 0));
        b10.f = i.b;
        a b11 = b10.b();
        i0 b12 = a.b(new r(c.class, a0.class));
        b12.a(new j(new r(c.class, Executor.class), 1, 0));
        b12.f = i.c;
        a b13 = b12.b();
        i0 b14 = a.b(new r(b.class, a0.class));
        b14.a(new j(new r(b.class, Executor.class), 1, 0));
        b14.f = i.d;
        a b15 = b14.b();
        i0 b16 = a.b(new r(d.class, a0.class));
        b16.a(new j(new r(d.class, Executor.class), 1, 0));
        b16.f = i.e;
        return h.c(b11, b13, b15, b16.b());
    }
}
