package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class q1 implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public final com.google.android.gms.common.api.e a;
    public final boolean b;
    public m0 c;

    public q1(com.google.android.gms.common.api.e eVar, boolean z4) {
        this.a = eVar;
        this.b = z4;
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        b6.m.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(y5.a aVar) {
        com.google.android.gms.common.api.e eVar = this.a;
        boolean z4 = this.b;
        b6.m.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        m0 m0Var = this.c;
        m0Var.a.lock();
        try {
            m0Var.m.h(aVar, eVar, z4);
        } finally {
            m0Var.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i10) {
        b6.m.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnectionSuspended(i10);
    }
}
