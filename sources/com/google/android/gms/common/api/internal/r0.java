package com.google.android.gms.common.api.internal;

import java.util.Set;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class r0 implements o6.b {
    public final com.google.android.gms.common.api.c a;
    public final b b;
    public o6.h c = null;
    public Set d = null;
    public boolean e = false;
    public final /* synthetic */ h f;

    public r0(h hVar, com.google.android.gms.common.api.c cVar, b bVar) {
        this.f = hVar;
        this.a = cVar;
        this.b = bVar;
    }

    @Override // o6.b
    public final void a(l6.a aVar) {
        this.f.x.post(new q0(this, aVar, 0));
    }

    public final void b(l6.a aVar) {
        o0 o0Var = (o0) this.f.s.get(this.b);
        if (o0Var != null) {
            o0Var.n(aVar);
        }
    }
}
