package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;
import m.s3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class e1 extends c8.c implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public static final a8.j k = b8.b.a;
    public final Context b;
    public final Handler c;
    public final a8.j d = k;
    public final Set e;
    public final s3 f;
    public c8.a i;
    public s0 j;

    public e1(Context context, a7.e eVar, s3 s3Var) {
        this.b = context;
        this.c = eVar;
        this.f = s3Var;
        this.e = (Set) s3Var.a;
    }

    @Override // c8.d
    public final void h(c8.h hVar) {
        this.c.post(new r0(this, hVar, 2));
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        this.i.H(this);
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(y5.a aVar) {
        this.j.b(aVar);
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i10) {
        s0 s0Var = this.j;
        p0 p0Var = (p0) s0Var.f.s.get(s0Var.b);
        if (p0Var != null) {
            if (p0Var.k) {
                p0Var.n(new y5.a(17));
            } else {
                p0Var.onConnectionSuspended(i10);
            }
        }
    }
}
