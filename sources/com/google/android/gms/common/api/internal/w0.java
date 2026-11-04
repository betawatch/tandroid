package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;
import m.o3;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w0 extends q8.c implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public static final a6.b k = p8.b.a;
    public final Context b;
    public final Handler c;
    public final a6.b d = k;
    public final Set e;
    public final o3 f;
    public q8.a i;
    public m0 j;

    public w0(Context context, com.google.android.gms.internal.cast.z zVar, o3 o3Var) {
        this.b = context;
        this.c = zVar;
        this.f = o3Var;
        this.e = (Set) o3Var.a;
    }

    @Override // q8.d
    public final void Y(q8.h hVar) {
        this.c.post(new l0(this, hVar, 2));
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        this.i.A(this);
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(m6.a aVar) {
        this.j.b(aVar);
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i3) {
        m0 m0Var = this.j;
        j0 j0Var = (j0) m0Var.f.s.get(m0Var.b);
        if (j0Var != null) {
            if (j0Var.k) {
                j0Var.k(new m6.a(17, null, null));
            } else {
                j0Var.onConnectionSuspended(i3);
            }
        }
    }
}
