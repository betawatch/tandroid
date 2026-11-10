package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import e2.j0;
import hd.g;
import java.util.List;
import java.util.concurrent.Executor;
import o9.h;
import q9.b;
import q9.c;
import q9.d;
import u9.a;
import u9.j;
import u9.r;
import zd.x;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        j0 b10 = a.b(new r(q9.a.class, x.class));
        b10.a(new j(new r(q9.a.class, Executor.class), 1, 0));
        b10.f = h.b;
        a b11 = b10.b();
        j0 b12 = a.b(new r(c.class, x.class));
        b12.a(new j(new r(c.class, Executor.class), 1, 0));
        b12.f = h.c;
        a b13 = b12.b();
        j0 b14 = a.b(new r(b.class, x.class));
        b14.a(new j(new r(b.class, Executor.class), 1, 0));
        b14.f = h.d;
        a b15 = b14.b();
        j0 b16 = a.b(new r(d.class, x.class));
        b16.a(new j(new r(d.class, Executor.class), 1, 0));
        b16.f = h.e;
        return g.c(b11, b13, b15, b16.b());
    }
}
