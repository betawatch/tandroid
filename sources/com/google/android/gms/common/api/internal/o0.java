package com.google.android.gms.common.api.internal;

import j$.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class o0 implements q6.b {
    public final com.google.android.gms.common.api.c a;
    public final a b;
    public q6.i c;
    public Set d;
    public boolean e;
    public final /* synthetic */ g f;

    public o0(g gVar, com.google.android.gms.common.api.c cVar, a aVar) {
        Objects.requireNonNull(gVar);
        this.f = gVar;
        this.c = null;
        this.d = null;
        this.e = false;
        this.a = cVar;
        this.b = aVar;
    }

    @Override // q6.b
    public final void a(n6.a aVar) {
        this.f.y.post(new n0(this, aVar, 0));
    }

    public final void b(n6.a aVar) {
        l0 l0Var = (l0) this.f.s.get(this.b);
        if (l0Var != null) {
            l0Var.k(aVar);
        }
    }
}
