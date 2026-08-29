package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;
import m.s3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d1 extends a8.c implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public static final b6.b k = z7.b.a;
    public final Context b;
    public final Handler c;
    public final b6.b d = k;
    public final Set e;
    public final s3 f;
    public a8.a i;
    public s0 j;

    public d1(Context context, c2.v0 v0Var, s3 s3Var) {
        this.b = context;
        this.c = v0Var;
        this.f = s3Var;
        this.e = (Set) s3Var.a;
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        this.i.H(this);
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(w5.a aVar) {
        this.j.b(aVar);
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i10) {
        s0 s0Var = this.j;
        p0 p0Var = (p0) s0Var.f.s.get(s0Var.b);
        if (p0Var != null) {
            if (p0Var.k) {
                p0Var.n(new w5.a(17));
            } else {
                p0Var.onConnectionSuspended(i10);
            }
        }
    }

    @Override // a8.d
    public final void t0(a8.h hVar) {
        this.c.post(new r0(this, hVar, 2));
    }
}
