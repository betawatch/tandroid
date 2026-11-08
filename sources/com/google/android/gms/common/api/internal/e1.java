package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class e1 implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public final com.google.android.gms.common.api.e a;
    public final boolean b;
    public g0 c;

    public e1(com.google.android.gms.common.api.e eVar, boolean z9) {
        this.a = eVar;
        this.b = z9;
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        q6.m.h(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(n6.a aVar) {
        com.google.android.gms.common.api.e eVar = this.a;
        boolean z9 = this.b;
        q6.m.h(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        g0 g0Var = this.c;
        g0Var.a.lock();
        try {
            g0Var.m.q(aVar, eVar, z9);
        } finally {
            g0Var.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i7) {
        q6.m.h(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnectionSuspended(i7);
    }
}
