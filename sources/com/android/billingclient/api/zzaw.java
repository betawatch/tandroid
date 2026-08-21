package com.android.billingclient.api;

import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzie;
import j$.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class zzaw implements Callable {
    final /* synthetic */ PurchasesResponseListener zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ BillingClientImpl zzc;

    zzaw(BillingClientImpl billingClientImpl, PurchasesResponseListener purchasesResponseListener, String str, boolean z) {
        this.zza = purchasesResponseListener;
        this.zzb = str;
        Objects.requireNonNull(billingClientImpl);
        this.zzc = billingClientImpl;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        boolean zzaX;
        zzcw zzbb;
        BillingClientImpl billingClientImpl = this.zzc;
        zzaX = billingClientImpl.zzaX(30000L);
        if (!zzaX) {
            zzie zzieVar = zzie.zzb;
            BillingResult billingResult = zzcj.zzj;
            billingClientImpl.zzbd(zzieVar, 9, billingResult);
            this.zza.onQueryPurchasesResponse(billingResult, com.google.android.gms.internal.play_billing.zzbt.zzk());
            return null;
        }
        String str = this.zzb;
        if (TextUtils.isEmpty(str)) {
            zzc.zzn("BillingClient", "Please provide a valid product type.");
            zzie zzieVar2 = zzie.zzX;
            BillingResult billingResult2 = zzcj.zze;
            billingClientImpl.zzbd(zzieVar2, 9, billingResult2);
            this.zza.onQueryPurchasesResponse(billingResult2, com.google.android.gms.internal.play_billing.zzbt.zzk());
            return null;
        }
        zzbb = billingClientImpl.zzbb(str, false, 9);
        if (zzbb.zzb() != null) {
            this.zza.onQueryPurchasesResponse(zzbb.zza(), zzbb.zzb());
            return null;
        }
        this.zza.onQueryPurchasesResponse(zzbb.zza(), com.google.android.gms.internal.play_billing.zzbt.zzk());
        return null;
    }
}
