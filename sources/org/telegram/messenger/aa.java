package org.telegram.messenger;

import android.os.Bundle;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class aa implements com.google.android.gms.common.api.k {
    public final /* synthetic */ pa a;

    public aa(pa paVar) {
        this.a = paVar;
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        sd sdVar = (sd) this.a;
        sdVar.L = true;
        try {
            ((h6.m) t0.j()).checkLocationSettings(sdVar.N, new md(sdVar, 1));
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i7) {
        this.a.getClass();
    }
}
