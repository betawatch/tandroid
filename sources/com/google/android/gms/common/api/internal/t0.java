package com.google.android.gms.common.api.internal;

import java.util.Set;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
