package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o1 implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public final com.google.android.gms.common.api.e a;
    public final boolean b;
    public m0 c;

    public o1(com.google.android.gms.common.api.e eVar, boolean z10) {
        this.a = eVar;
        this.b = z10;
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        x5.l.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(u5.a aVar) {
        com.google.android.gms.common.api.e eVar = this.a;
        boolean z10 = this.b;
        x5.l.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        m0 m0Var = this.c;
        m0Var.a.lock();
        try {
            m0Var.m.p(aVar, eVar, z10);
        } finally {
            m0Var.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i9) {
        x5.l.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnectionSuspended(i9);
    }
}
