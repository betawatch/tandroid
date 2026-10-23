package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;
import m.s3;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class c1 extends o8.c implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public static final a8.d k = n8.b.a;
    public final Context b;
    public final Handler c;
    public final a8.d d = k;
    public final Set e;
    public final s3 f;
    public o8.a i;
    public r0 j;

    public c1(Context context, com.google.android.gms.internal.cast.a0 a0Var, s3 s3Var) {
        this.b = context;
        this.c = a0Var;
        this.f = s3Var;
        this.e = (Set) s3Var.a;
    }

    @Override // o8.d
    public final void B(o8.h hVar) {
        this.c.post(new q0(this, hVar, 2));
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
        r0 r0Var = this.j;
        o0 o0Var = (o0) r0Var.f.s.get(r0Var.b);
        if (o0Var != null) {
            if (o0Var.k) {
                o0Var.n(new k6.a(17));
            } else {
                o0Var.onConnectionSuspended(i10);
            }
        }
    }
}
