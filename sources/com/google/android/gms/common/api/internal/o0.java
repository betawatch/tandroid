package com.google.android.gms.common.api.internal;

import j$.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
