package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;
import m.q3;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class d1 extends o8.c implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public static final a8.d k = n8.b.a;
    public final Context b;
    public final Handler c;
    public final a8.d d = k;
    public final Set e;
    public final q3 f;
    public o8.a i;
    public s0 j;

    public d1(Context context, com.google.android.gms.internal.cast.a0 a0Var, q3 q3Var) {
        this.b = context;
        this.c = a0Var;
        this.f = q3Var;
        this.e = (Set) q3Var.a;
    }

    @Override // o8.d
    public final void B(o8.h hVar) {
        this.c.post(new r0(this, hVar, 2));
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        this.i.H(this);
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(k6.a aVar) {
        this.j.b(aVar);
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i10) {
        s0 s0Var = this.j;
        p0 p0Var = (p0) s0Var.f.s.get(s0Var.b);
        if (p0Var != null) {
            if (p0Var.k) {
                p0Var.n(new k6.a(17));
            } else {
                p0Var.onConnectionSuspended(i10);
            }
        }
    }
}
