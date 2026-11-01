package org.telegram.messenger;

import android.os.Bundle;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class ca implements com.google.android.gms.common.api.k {
    public final /* synthetic */ qa a;

    public ca(qa qaVar) {
        this.a = qaVar;
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        od odVar = (od) this.a;
        odVar.L = true;
        try {
            ((li.k) w0.j()).checkLocationSettings(odVar.N, new id(odVar, 1));
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i10) {
        this.a.getClass();
    }
}
