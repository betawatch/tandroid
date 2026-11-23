package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class w0 extends r8.c implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public static final a9.e k = q8.b.a;
    public final Context b;
    public final Handler c;
    public final a9.e d = k;
    public final Set e;
    public final ga.d f;
    public r8.a i;
    public n0 j;

    public w0(Context context, com.google.android.gms.internal.cast.y yVar, ga.d dVar) {
        this.b = context;
        this.c = yVar;
        this.f = dVar;
        this.e = (Set) dVar.b;
    }

    @Override // r8.d
    public final void W0(r8.h hVar) {
        this.c.post(new m0(this, hVar, 2));
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        this.i.B(this);
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(n6.a aVar) {
        this.j.b(aVar);
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i7) {
        n0 n0Var = this.j;
        k0 k0Var = (k0) n0Var.f.s.get(n0Var.b);
        if (k0Var != null) {
            if (k0Var.k) {
                k0Var.k(new n6.a(17, null, null));
            } else {
                k0Var.onConnectionSuspended(i7);
            }
        }
    }
}
