package org.telegram.messenger;

import android.os.Bundle;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class z9 implements com.google.android.gms.common.api.k {
    public final /* synthetic */ oa a;

    public z9(oa oaVar) {
        this.a = oaVar;
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnected(Bundle bundle) {
        rd rdVar = (rd) this.a;
        rdVar.M = true;
        try {
            ((h6.m) t0.j()).checkLocationSettings(rdVar.O, new ld(rdVar, 1));
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
    }

    @Override // com.google.android.gms.common.api.k
    public final void onConnectionSuspended(int i7) {
        this.a.getClass();
    }
}
