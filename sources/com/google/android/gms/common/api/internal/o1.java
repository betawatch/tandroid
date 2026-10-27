package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class o1 implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public final com.google.android.gms.common.api.e a;
    public final boolean b;
    public l0 c;

    public o1(com.google.android.gms.common.api.e eVar, boolean z10) {
        this.a = eVar;
        this.b = z10;
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        o6.l.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(l6.a aVar) {
        com.google.android.gms.common.api.e eVar = this.a;
        boolean z10 = this.b;
        o6.l.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        l0 l0Var = this.c;
        l0Var.a.lock();
        try {
            l0Var.m.e(aVar, eVar, z10);
        } finally {
            l0Var.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i10) {
        o6.l.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnectionSuspended(i10);
    }
}
