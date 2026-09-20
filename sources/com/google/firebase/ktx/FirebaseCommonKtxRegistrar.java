package com.google.firebase.ktx;

import b2.i0;
import com.google.firebase.components.ComponentRegistrar;
import hd.h;
import java.util.List;
import java.util.concurrent.Executor;
import m9.b;
import m9.c;
import m9.d;
import q9.a;
import q9.j;
import q9.s;
import zd.a0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        i0 b10 = a.b(new s(m9.a.class, a0.class));
        b10.a(new j(new s(m9.a.class, Executor.class), 1, 0));
        b10.f = va.a.b;
        a b11 = b10.b();
        i0 b12 = a.b(new s(c.class, a0.class));
        b12.a(new j(new s(c.class, Executor.class), 1, 0));
        b12.f = va.a.c;
        a b13 = b12.b();
        i0 b14 = a.b(new s(b.class, a0.class));
        b14.a(new j(new s(b.class, Executor.class), 1, 0));
        b14.f = va.a.d;
        a b15 = b14.b();
        i0 b16 = a.b(new s(d.class, a0.class));
        b16.a(new j(new s(d.class, Executor.class), 1, 0));
        b16.f = va.a.e;
        return h.c(b11, b13, b15, b16.b());
    }
}
