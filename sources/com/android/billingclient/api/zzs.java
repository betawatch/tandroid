package com.android.billingclient.api;

import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes.dex */
final class zzs {
    private final Context zza;
    private final PurchasesUpdatedListener zzb;
    private final zzch zze;
    private final zzr zzf = new zzr(this, true);
    private final zzr zzg = new zzr(this, false);
    private boolean zzh;

    zzs(Context context, PurchasesUpdatedListener purchasesUpdatedListener, zzco zzcoVar, zzb zzbVar, UserChoiceBillingListener userChoiceBillingListener, zzch zzchVar) {
        this.zza = context;
        this.zzb = purchasesUpdatedListener;
        this.zze = zzchVar;
    }

    static /* bridge */ /* synthetic */ zzb zza(zzs zzsVar) {
        zzsVar.getClass();
        return null;
    }

    static /* bridge */ /* synthetic */ UserChoiceBillingListener zze(zzs zzsVar) {
        zzsVar.getClass();
        return null;
    }

    final PurchasesUpdatedListener zzd() {
        return this.zzb;
    }

    final void zzg(boolean z) {
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.zzh = z;
        zzr zzrVar = this.zzg;
        Context context = this.zza;
        zzrVar.zza(context, intentFilter2);
        if (this.zzh) {
            this.zzf.zzb(context, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.zzf.zza(context, intentFilter);
        }
    }
}
