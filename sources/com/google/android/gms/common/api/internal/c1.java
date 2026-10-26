package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;
import m.r3;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class c1 extends p8.c implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public static final b8.d k = o8.b.a;
    public final Context b;
    public final Handler c;
    public final b8.d d = k;
    public final Set e;
    public final r3 f;
    public p8.a i;
    public r0 j;

    public c1(Context context, com.google.android.gms.internal.cast.y yVar, r3 r3Var) {
        this.b = context;
        this.c = yVar;
        this.f = r3Var;
        this.e = (Set) r3Var.a;
    }

    @Override // p8.d
    public final void m(p8.h hVar) {
        this.c.post(new q0(this, hVar, 2));
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        this.i.H(this);
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(l6.a aVar) {
        this.j.b(aVar);
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i10) {
        r0 r0Var = this.j;
        o0 o0Var = (o0) r0Var.f.s.get(r0Var.b);
        if (o0Var != null) {
            if (o0Var.k) {
                o0Var.n(new l6.a(17));
            } else {
                o0Var.onConnectionSuspended(i10);
            }
        }
    }
}
