package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;
import m.p3;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class d1 extends o8.c implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public static final a8.d k = n8.b.a;
    public final Context b;
    public final Handler c;
    public final a8.d d = k;
    public final Set e;
    public final p3 f;
    public o8.a i;
    public s0 j;

    public d1(Context context, com.google.android.gms.internal.cast.c0 c0Var, p3 p3Var) {
        this.b = context;
        this.c = c0Var;
        this.f = p3Var;
        this.e = (Set) p3Var.a;
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
