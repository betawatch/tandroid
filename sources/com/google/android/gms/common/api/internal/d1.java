package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;
import m.t3;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d1 extends z7.c implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public static final a6.b k = y7.b.a;
    public final Context b;
    public final Handler c;
    public final a6.b d = k;
    public final Set e;
    public final t3 f;
    public z7.a i;
    public s0 j;

    public d1(Context context, c2.t0 t0Var, t3 t3Var) {
        this.b = context;
        this.c = t0Var;
        this.f = t3Var;
        this.e = (Set) t3Var.a;
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        this.i.H(this);
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(v5.a aVar) {
        this.j.b(aVar);
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i10) {
        s0 s0Var = this.j;
        p0 p0Var = (p0) s0Var.f.s.get(s0Var.b);
        if (p0Var != null) {
            if (p0Var.k) {
                p0Var.n(new v5.a(17));
            } else {
                p0Var.onConnectionSuspended(i10);
            }
        }
    }

    @Override // z7.d
    public final void p0(z7.h hVar) {
        this.c.post(new r0(this, hVar, 2));
    }
}
