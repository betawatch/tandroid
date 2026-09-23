package com.google.android.gms.common.api.internal;

import java.util.Set;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class s0 implements n6.b {
    public final com.google.android.gms.common.api.c a;
    public final b b;
    public n6.h c = null;
    public Set d = null;
    public boolean e = false;
    public final /* synthetic */ h f;

    public s0(h hVar, com.google.android.gms.common.api.c cVar, b bVar) {
        this.f = hVar;
        this.a = cVar;
        this.b = bVar;
    }

    @Override // n6.b
    public final void a(k6.a aVar) {
        this.f.x.post(new r0(this, aVar, 0));
    }

    public final void b(k6.a aVar) {
        p0 p0Var = (p0) this.f.s.get(this.b);
        if (p0Var != null) {
            p0Var.n(aVar);
        }
    }
}
