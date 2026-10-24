package com.google.firebase;

import b2.m0;
import be.a0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import jd.h;
import l9.i;
import n9.b;
import n9.c;
import n9.d;
import r9.a;
import r9.j;
import r9.r;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        m0 b10 = a.b(new r(n9.a.class, a0.class));
        b10.a(new j(new r(n9.a.class, Executor.class), 1, 0));
        b10.f = i.b;
        a b11 = b10.b();
        m0 b12 = a.b(new r(c.class, a0.class));
        b12.a(new j(new r(c.class, Executor.class), 1, 0));
        b12.f = i.c;
        a b13 = b12.b();
        m0 b14 = a.b(new r(b.class, a0.class));
        b14.a(new j(new r(b.class, Executor.class), 1, 0));
        b14.f = i.d;
        a b15 = b14.b();
        m0 b16 = a.b(new r(d.class, a0.class));
        b16.a(new j(new r(d.class, Executor.class), 1, 0));
        b16.f = i.e;
        return h.c(b11, b13, b15, b16.b());
    }
}
