package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class g1 implements com.google.android.gms.common.api.k, com.google.android.gms.common.api.l {
    public final com.google.android.gms.common.api.e a;
    public final boolean b;
    public i0 c;

    public g1(com.google.android.gms.common.api.e eVar, boolean z10) {
        this.a = eVar;
        this.b = z10;
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        q6.m.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnected(bundle);
    }

    @Override // com.google.android.gms.common.api.l
    public final void onConnectionFailed(n6.a aVar) {
        com.google.android.gms.common.api.e eVar = this.a;
        boolean z10 = this.b;
        q6.m.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        i0 i0Var = this.c;
        i0Var.a.lock();
        try {
            i0Var.m.l(aVar, eVar, z10);
        } finally {
            i0Var.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i7) {
        q6.m.i(this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.onConnectionSuspended(i7);
    }
}
