package org.telegram.messenger;

import android.os.Bundle;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class y9 implements com.google.android.gms.common.api.k {
    public final /* synthetic */ na a;

    public y9(na naVar) {
        this.a = naVar;
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        qd qdVar = (qd) this.a;
        qdVar.M = true;
        try {
            ((h6.m) t0.j()).checkLocationSettings(qdVar.O, new kd(qdVar, 1));
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i7) {
        this.a.getClass();
    }
}
