package org.telegram.messenger;

import android.os.Bundle;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
