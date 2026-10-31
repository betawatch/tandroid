package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class p1 implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public final com.google.android.gms.common.api.e a;
    public final boolean b;
    public n0 c;

    public p1(com.google.android.gms.common.api.e eVar, boolean z10) {
        this.a = eVar;
        this.b = z10;
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        n6.l.h(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(k6.a aVar) {
        com.google.android.gms.common.api.e eVar = this.a;
        boolean z10 = this.b;
        n6.l.h(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        n0 n0Var = this.c;
        n0Var.a.lock();
        try {
            n0Var.m.I(aVar, eVar, z10);
        } finally {
            n0Var.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i10) {
        n6.l.h(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnectionSuspended(i10);
    }
}
