package com.google.android.gms.common.api.internal;

import java.util.Set;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
