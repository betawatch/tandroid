package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import hd.a0;
import java.util.List;
import java.util.concurrent.Executor;
import pc.h;
import s8.i;
import tg.b;
import u8.c;
import u8.d;
import y8.a;
import y8.j;
import y8.r;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        b b10 = a.b(new r(u8.a.class, a0.class));
        b10.a(new j(new r(u8.a.class, Executor.class), 1, 0));
        b10.f = i.b;
        a b11 = b10.b();
        b b12 = a.b(new r(c.class, a0.class));
        b12.a(new j(new r(c.class, Executor.class), 1, 0));
        b12.f = i.c;
        a b13 = b12.b();
        b b14 = a.b(new r(u8.b.class, a0.class));
        b14.a(new j(new r(u8.b.class, Executor.class), 1, 0));
        b14.f = i.d;
        a b15 = b14.b();
        b b16 = a.b(new r(d.class, a0.class));
        b16.a(new j(new r(d.class, Executor.class), 1, 0));
        b16.f = i.e;
        return h.c(b11, b13, b15, b16.b());
    }
}
