package com.google.android.gms.common.api.internal;

import j$.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class n0 implements q6.b {
    public final com.google.android.gms.common.api.c a;
    public final a b;
    public q6.i c;
    public Set d;
    public boolean e;
    public final /* synthetic */ g f;

    public n0(g gVar, com.google.android.gms.common.api.c cVar, a aVar) {
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
        this.f.y.post(new m0(this, aVar, 0));
    }

    public final void b(n6.a aVar) {
        k0 k0Var = (k0) this.f.s.get(this.b);
        if (k0Var != null) {
            k0Var.k(aVar);
        }
    }
}
