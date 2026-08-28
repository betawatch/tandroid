package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;
import m.t3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d1 extends y7.c implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public static final b7.d k = x7.b.a;
    public final Context b;
    public final Handler c;
    public final b7.d d = k;
    public final Set e;
    public final t3 f;
    public y7.a i;
    public s0 j;

    public d1(Context context, c2.u0 u0Var, t3 t3Var) {
        this.b = context;
        this.c = u0Var;
        this.f = t3Var;
        this.e = (Set) t3Var.a;
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        this.i.H(this);
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(u5.a aVar) {
        this.j.b(aVar);
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i9) {
        s0 s0Var = this.j;
        p0 p0Var = (p0) s0Var.f.s.get(s0Var.b);
        if (p0Var != null) {
            if (p0Var.k) {
                p0Var.n(new u5.a(17));
            } else {
                p0Var.onConnectionSuspended(i9);
            }
        }
    }

    @Override // y7.d
    public final void s0(y7.h hVar) {
        this.c.post(new r0(this, hVar, 2));
    }
}
