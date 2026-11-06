package org.telegram.messenger;

import android.os.Bundle;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
            ((h6.m) t0.j()).checkLocationSettings(sdVar.N, new ld(sdVar, 1));
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i7) {
        this.a.getClass();
    }
}
