package com.google.android.gms.common.api.internal;

import j$.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class m0 implements q6.b {
    public final com.google.android.gms.common.api.c a;
    public final a b;
    public q6.i c;
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

    @Override // q6.b
    public final void a(n6.a aVar) {
        this.f.y.post(new l0(this, aVar, 0));
    }

    public final void b(n6.a aVar) {
        j0 j0Var = (j0) this.f.s.get(this.b);
        if (j0Var != null) {
            j0Var.k(aVar);
        }
    }
}
