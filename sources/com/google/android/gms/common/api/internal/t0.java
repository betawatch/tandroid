package com.google.android.gms.common.api.internal;

import java.util.Set;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class t0 implements n6.b {
    public final com.google.android.gms.common.api.c a;
    public final b b;
    public n6.h c = null;
    public Set d = null;
    public boolean e = false;
    public final /* synthetic */ h f;

    public t0(h hVar, com.google.android.gms.common.api.c cVar, b bVar) {
        this.f = hVar;
        this.a = cVar;
        this.b = bVar;
    }

    @Override // n6.b
    public final void a(k6.a aVar) {
        this.f.y.post(new s0(this, aVar, 0));
    }

    public final void b(k6.a aVar) {
        q0 q0Var = (q0) this.f.s.get(this.b);
        if (q0Var != null) {
            q0Var.n(aVar);
        }
    }
}
