package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import d2.l0;
import ed.h;
import java.util.List;
import java.util.concurrent.Executor;
import n9.i;
import p9.b;
import p9.c;
import p9.d;
import t9.a;
import t9.j;
import t9.r;
import wd.x;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        l0 b10 = a.b(new r(p9.a.class, x.class));
        b10.a(new j(new r(p9.a.class, Executor.class), 1, 0));
        b10.f = i.b;
        a b11 = b10.b();
        l0 b12 = a.b(new r(c.class, x.class));
        b12.a(new j(new r(c.class, Executor.class), 1, 0));
        b12.f = i.c;
        a b13 = b12.b();
        l0 b14 = a.b(new r(b.class, x.class));
        b14.a(new j(new r(b.class, Executor.class), 1, 0));
        b14.f = i.d;
        a b15 = b14.b();
        l0 b16 = a.b(new r(d.class, x.class));
        b16.a(new j(new r(d.class, Executor.class), 1, 0));
        b16.f = i.e;
        return h.c(b11, b13, b15, b16.b());
    }
}
