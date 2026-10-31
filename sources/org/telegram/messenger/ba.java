package org.telegram.messenger;

import android.os.Bundle;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ba implements com.google.android.gms.common.api.k {
    public final /* synthetic */ pa a;

    public ba(pa paVar) {
        this.a = paVar;
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        nd ndVar = (nd) this.a;
        ndVar.L = true;
        try {
            ((li.k) w0.j()).checkLocationSettings(ndVar.N, new hd(ndVar, 1));
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i10) {
        this.a.getClass();
    }
}
