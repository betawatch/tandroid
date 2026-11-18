package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;
import m.o3;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class x0 extends r8.c implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public static final a9.e k = q8.b.a;
    public final Context b;
    public final Handler c;
    public final a9.e d = k;
    public final Set e;
    public final o3 f;
    public r8.a i;
    public o0 j;

    public x0(Context context, com.google.android.gms.internal.cast.y yVar, o3 o3Var) {
        this.b = context;
        this.c = yVar;
        this.f = o3Var;
        this.e = (Set) o3Var.a;
    }

    @Override // r8.d
    public final void W0(r8.h hVar) {
        this.c.post(new n0(this, hVar, 2));
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
        o0 o0Var = this.j;
        l0 l0Var = (l0) o0Var.f.s.get(o0Var.b);
        if (l0Var != null) {
            if (l0Var.k) {
                l0Var.k(new n6.a(17, null, null));
            } else {
                l0Var.onConnectionSuspended(i7);
            }
        }
    }
}
