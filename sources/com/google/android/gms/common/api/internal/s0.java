package com.google.android.gms.common.api.internal;

import java.util.Set;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s0 implements x5.b {
    public final com.google.android.gms.common.api.c a;
    public final b b;
    public x5.h c = null;
    public Set d = null;
    public boolean e = false;
    public final /* synthetic */ h f;

    public s0(h hVar, com.google.android.gms.common.api.c cVar, b bVar) {
        this.f = hVar;
        this.a = cVar;
        this.b = bVar;
    }

    @Override // x5.b
    public final void a(u5.a aVar) {
        this.f.x.post(new r0(this, aVar, 0));
    }

    public final void b(u5.a aVar) {
        p0 p0Var = (p0) this.f.s.get(this.b);
        if (p0Var != null) {
            p0Var.n(aVar);
        }
    }
}
