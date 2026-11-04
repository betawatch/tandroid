package com.google.android.gms.common.api.internal;

import j$.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class m0 implements p6.b {
    public final com.google.android.gms.common.api.c a;
    public final a b;
    public p6.i c;
    public Set d;
    public boolean e;
    public final /* synthetic */ g f;

    public m0(g gVar, com.google.android.gms.common.api.c cVar, a aVar) {
        Objects.requireNonNull(gVar);
        this.f = gVar;
        this.c = null;
        this.d = null;
        this.e = false;
        this.a = cVar;
        this.b = aVar;
    }

    @Override // p6.b
    public final void a(m6.a aVar) {
        this.f.y.post(new l0(this, aVar, 0));
    }

    public final void b(m6.a aVar) {
        j0 j0Var = (j0) this.f.s.get(this.b);
        if (j0Var != null) {
            j0Var.k(aVar);
        }
    }
}
