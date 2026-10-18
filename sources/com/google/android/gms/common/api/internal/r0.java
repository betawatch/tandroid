package com.google.android.gms.common.api.internal;

import java.util.Set;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class r0 implements n6.b {
    public final com.google.android.gms.common.api.c a;
    public final b b;
    public n6.h c = null;
    public Set d = null;
    public boolean e = false;
    public final /* synthetic */ h f;

    public r0(h hVar, com.google.android.gms.common.api.c cVar, b bVar) {
        this.f = hVar;
        this.a = cVar;
        this.b = bVar;
    }

    @Override // n6.b
    public final void a(k6.a aVar) {
        this.f.x.post(new q0(this, aVar, 0));
    }

    public final void b(k6.a aVar) {
        o0 o0Var = (o0) this.f.s.get(this.b);
        if (o0Var != null) {
            o0Var.n(aVar);
        }
    }
}
