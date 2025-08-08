package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzat implements Callable {
    final /* synthetic */ String zza;
    final /* synthetic */ PurchasesResponseListener zzb;
    final /* synthetic */ BillingClientImpl zzc;

    zzat(BillingClientImpl billingClientImpl, String str, PurchasesResponseListener purchasesResponseListener) {
        this.zza = str;
        this.zzb = purchasesResponseListener;
        this.zzc = billingClientImpl;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzcv zzaR;
        zzaR = this.zzc.zzaR(this.zza, 9);
        if (zzaR.zzb() != null) {
            this.zzb.onQueryPurchasesResponse(zzaR.zza(), zzaR.zzb());
            return null;
        }
        this.zzb.onQueryPurchasesResponse(zzaR.zza(), com.google.android.gms.internal.play_billing.zzco.zzl());
        return null;
    }
}
