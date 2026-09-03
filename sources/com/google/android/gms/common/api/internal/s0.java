package com.google.android.gms.common.api.internal;

import java.util.Set;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class s0 implements b6.b {
    public final com.google.android.gms.common.api.c a;
    public final b b;
    public b6.i c = null;
    public Set d = null;
    public boolean e = false;
    public final /* synthetic */ h f;

    public s0(h hVar, com.google.android.gms.common.api.c cVar, b bVar) {
        this.f = hVar;
        this.a = cVar;
        this.b = bVar;
    }

    @Override // b6.b
    public final void a(y5.a aVar) {
        this.f.x.post(new r0(this, aVar, 0));
    }

    public final void b(y5.a aVar) {
        p0 p0Var = (p0) this.f.s.get(this.b);
        if (p0Var != null) {
            p0Var.n(aVar);
        }
    }
}
