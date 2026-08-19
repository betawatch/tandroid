package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzgw;
import com.google.android.gms.internal.play_billing.zzjz;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes.dex */
final class zzm extends BroadcastReceiver {
    final /* synthetic */ zzn zza;
    private boolean zzb;
    private final boolean zzc;

    zzm(zzn zznVar, boolean z) {
        this.zza = zznVar;
        this.zzc = z;
    }

    private final void zzd(Bundle bundle, BillingResult billingResult, int i) {
        zzch zzchVar;
        zzch zzchVar2;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                zzchVar2 = this.zza.zze;
                zzchVar2.zza(zzjz.zzC(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzgw.zza()));
            } else {
                zzchVar = this.zza.zze;
                zzchVar.zza(zzcg.zzb(23, i, billingResult));
            }
        } catch (Throwable unused) {
            zze.zzl("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        PurchasesUpdatedListener purchasesUpdatedListener;
        zzch zzchVar;
        zzch zzchVar2;
        PurchasesUpdatedListener purchasesUpdatedListener2;
        PurchasesUpdatedListener purchasesUpdatedListener3;
        zzch zzchVar3;
        PurchasesUpdatedListener purchasesUpdatedListener4;
        PurchasesUpdatedListener purchasesUpdatedListener5;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            zze.zzl("BillingBroadcastManager", "Bundle is null.");
            zzchVar3 = this.zza.zze;
            BillingResult billingResult = zzcj.zzk;
            zzchVar3.zza(zzcg.zzb(11, 1, billingResult));
            zzn zznVar = this.zza;
            purchasesUpdatedListener4 = zznVar.zzb;
            if (purchasesUpdatedListener4 != null) {
                purchasesUpdatedListener5 = zznVar.zzb;
                purchasesUpdatedListener5.onPurchasesUpdated(billingResult, null);
                return;
            }
            return;
        }
        BillingResult zzf = zze.zzf(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i = true == Objects.equals(extras.getString("INTENT_SOURCE"), "LAUNCH_BILLING_FLOW") ? 2 : 1;
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            List zzj = zze.zzj(extras);
            if (zzf.getResponseCode() == 0) {
                zzchVar = this.zza.zze;
                zzchVar.zzc(zzcg.zzd(i));
            } else {
                zzd(extras, zzf, i);
            }
            purchasesUpdatedListener = this.zza.zzb;
            purchasesUpdatedListener.onPurchasesUpdated(zzf, zzj);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (zzf.getResponseCode() != 0) {
                zzd(extras, zzf, i);
                purchasesUpdatedListener3 = this.zza.zzb;
                purchasesUpdatedListener3.onPurchasesUpdated(zzf, com.google.android.gms.internal.play_billing.zzco.zzl());
                return;
            }
            zzn zznVar2 = this.zza;
            zzn.zza(zznVar2);
            zzn.zze(zznVar2);
            zze.zzl("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
            zzchVar2 = this.zza.zze;
            BillingResult billingResult2 = zzcj.zzk;
            zzchVar2.zza(zzcg.zzb(77, i, billingResult2));
            purchasesUpdatedListener2 = this.zza.zzb;
            purchasesUpdatedListener2.onPurchasesUpdated(billingResult2, com.google.android.gms.internal.play_billing.zzco.zzl());
        }
    }

    public final synchronized void zza(Context context, IntentFilter intentFilter) {
        try {
            if (this.zzb) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.zzc ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.zzb = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(Context context, IntentFilter intentFilter, String str) {
        zzm zzmVar;
        try {
            try {
                if (this.zzb) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    zzmVar = this;
                    context.registerReceiver(zzmVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.zzc ? 4 : 2);
                } else {
                    zzmVar = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                zzmVar.zzb = true;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }
}
