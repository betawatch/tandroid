package org.telegram.messenger;

import android.os.Bundle;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u9 implements com.google.android.gms.common.api.k {
    public final /* synthetic */ ia a;

    public u9(ia iaVar) {
        this.a = iaVar;
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        ld ldVar = (ld) this.a;
        ldVar.M = true;
        try {
            ((k4.j) t0.j()).checkLocationSettings(ldVar.O, new fd(ldVar, 1));
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i3) {
        this.a.getClass();
    }
}
