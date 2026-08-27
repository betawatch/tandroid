package com.google.android.gms.common.api.internal;

import java.util.Set;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class s0 implements y5.b {
    public final com.google.android.gms.common.api.c a;
    public final b b;
    public y5.h c = null;
    public Set d = null;
    public boolean e = false;
    public final /* synthetic */ h f;

    public s0(h hVar, com.google.android.gms.common.api.c cVar, b bVar) {
        this.f = hVar;
        this.a = cVar;
        this.b = bVar;
    }

    @Override // y5.b
    public final void a(v5.a aVar) {
        this.f.x.post(new r0(this, aVar, 0));
    }

    public final void b(v5.a aVar) {
        p0 p0Var = (p0) this.f.s.get(this.b);
        if (p0Var != null) {
            p0Var.n(aVar);
        }
    }
}
