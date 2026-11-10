package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;
import m.q3;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class v0 extends r8.c implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public static final a9.e k = q8.b.a;
    public final Context b;
    public final Handler c;
    public final a9.e d = k;
    public final Set e;
    public final q3 f;
    public r8.a i;
    public m0 j;

    public v0(Context context, com.google.android.gms.internal.cast.y yVar, q3 q3Var) {
        this.b = context;
        this.c = yVar;
        this.f = q3Var;
        this.e = (Set) q3Var.a;
    }

    @Override // r8.d
    public final void V0(r8.h hVar) {
        this.c.post(new l0(this, hVar, 2));
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        this.i.B(this);
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(n6.a aVar) {
        this.j.b(aVar);
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i7) {
        m0 m0Var = this.j;
        j0 j0Var = (j0) m0Var.f.s.get(m0Var.b);
        if (j0Var != null) {
            if (j0Var.k) {
                j0Var.k(new n6.a(17, null, null));
            } else {
                j0Var.onConnectionSuspended(i7);
            }
        }
    }
}
