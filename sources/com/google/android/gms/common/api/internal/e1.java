package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;
import m.p3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e1 extends o8.c implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public static final a8.d k = n8.b.a;
    public final Context b;
    public final Handler c;
    public final a8.d d = k;
    public final Set e;
    public final p3 f;
    public o8.a i;
    public t0 j;

    public e1(Context context, com.google.android.gms.internal.cast.z zVar, p3 p3Var) {
        this.b = context;
        this.c = zVar;
        this.f = p3Var;
        this.e = (Set) p3Var.a;
    }

    @Override // o8.d
    public final void C(o8.h hVar) {
        this.c.post(new s0(this, hVar, 2));
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        this.i.I(this);
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(k6.a aVar) {
        this.j.b(aVar);
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i10) {
        t0 t0Var = this.j;
        q0 q0Var = (q0) t0Var.f.s.get(t0Var.b);
        if (q0Var != null) {
            if (q0Var.k) {
                q0Var.n(new k6.a(17));
            } else {
                q0Var.onConnectionSuspended(i10);
            }
        }
    }
}
