package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzeu;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzil;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes.dex */
final class zzr extends BroadcastReceiver {
    final /* synthetic */ zzs zza;
    private boolean zzb;
    private final boolean zzc;

    zzr(zzs zzsVar, boolean z) {
        Objects.requireNonNull(zzsVar);
        this.zza = zzsVar;
        this.zzc = z;
    }

    private final void zzd(Bundle bundle, BillingResult billingResult, int i, zzil zzilVar, long j, boolean z) {
        zzch zzchVar;
        zzch zzchVar2;
        try {
            if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") != null) {
                zzchVar2 = this.zza.zze;
                zzchVar2.zzd(zzhx.zzA(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), zzeu.zza()), j, z);
            } else {
                zzchVar = this.zza.zze;
                zzchVar.zzd(zzcg.zzb(zzie.zzw, i, billingResult, null, zzilVar), j, z);
            }
        } catch (Throwable unused) {
            zzc.zzn("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        char c;
        BillingResult zzh;
        PurchasesUpdatedListener purchasesUpdatedListener;
        zzch zzchVar;
        zzch zzchVar2;
        PurchasesUpdatedListener purchasesUpdatedListener2;
        PurchasesUpdatedListener purchasesUpdatedListener3;
        int intValue;
        zzch zzchVar3;
        PurchasesUpdatedListener purchasesUpdatedListener4;
        PurchasesUpdatedListener purchasesUpdatedListener5;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode == -1484087650) {
            if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -337612916) {
            if (hashCode == 345207161 && action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                c = 1;
            }
            c = 65535;
        }
        zzil zzilVar = c != 0 ? c != 1 ? c != 2 ? zzil.zza : zzil.zzd : zzil.zzc : zzil.zzb;
        zzil zzilVar2 = zzil.zzc;
        int i = (zzilVar.equals(zzilVar2) || zzilVar.equals(zzil.zzd)) ? 2 : zzilVar.equals(zzil.zzb) ? 32 : 1;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            zzc.zzn("BillingBroadcastManager", "Bundle is null.");
            zzs zzsVar = this.zza;
            zzchVar3 = zzsVar.zze;
            zzie zzieVar = zzie.zzk;
            BillingResult billingResult = zzcj.zzh;
            zzchVar3.zza(zzcg.zzb(zzieVar, i, billingResult, null, zzilVar));
            purchasesUpdatedListener4 = zzsVar.zzb;
            if (purchasesUpdatedListener4 != null) {
                purchasesUpdatedListener5 = zzsVar.zzb;
                purchasesUpdatedListener5.onPurchasesUpdated(billingResult, null);
            }
        } else {
            if (i == 2) {
                int i2 = zzc.zza;
                BillingResult.Builder newBuilder = BillingResult.newBuilder();
                newBuilder.setResponseCode(zzc.zzb(intent.getExtras(), "BillingBroadcastManager"));
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    zzc.zzn("BillingBroadcastManager", "Unexpected null bundle received!");
                } else {
                    Object obj = extras2.get("SUB_RESPONSE_CODE");
                    if (obj == null) {
                        zzc.zzm("BillingBroadcastManager", "getLaunchBillingFlowSubResponseCodeFromBundle() got null response code, assuming OK");
                    } else if (obj instanceof Integer) {
                        intValue = ((Integer) obj).intValue();
                        newBuilder.setOnPurchasesUpdatedSubResponseCode(intValue);
                        newBuilder.setDebugMessage(zzc.zzj(intent.getExtras(), "BillingBroadcastManager"));
                        zzh = newBuilder.build();
                    } else {
                        zzc.zzn("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj.getClass().getName()));
                    }
                }
                intValue = 0;
                newBuilder.setOnPurchasesUpdatedSubResponseCode(intValue);
                newBuilder.setDebugMessage(zzc.zzj(intent.getExtras(), "BillingBroadcastManager"));
                zzh = newBuilder.build();
            } else {
                zzh = zzc.zzh(intent, "BillingBroadcastManager");
            }
            BillingResult billingResult2 = zzh;
            long j = extras.getLong("billingClientTransactionId", 0L);
            boolean z = extras.getBoolean("wasServiceAutoReconnected", false);
            if (zzilVar.equals(zzil.zzb) || zzilVar.equals(zzilVar2)) {
                List zzl = zzc.zzl(extras);
                if (billingResult2.getResponseCode() == 0) {
                    zzchVar = this.zza.zze;
                    zzchVar.zzh(zzcg.zzc(i, zzilVar), j, z);
                } else {
                    zzd(extras, billingResult2, i, zzilVar, j, z);
                }
                purchasesUpdatedListener = this.zza.zzb;
                purchasesUpdatedListener.onPurchasesUpdated(billingResult2, zzl);
                return;
            }
            if (zzilVar.equals(zzil.zzd)) {
                if (billingResult2.getResponseCode() != 0) {
                    zzd(extras, billingResult2, i, zzilVar, j, z);
                    purchasesUpdatedListener3 = this.zza.zzb;
                    purchasesUpdatedListener3.onPurchasesUpdated(billingResult2, com.google.android.gms.internal.play_billing.zzbt.zzk());
                    return;
                }
                zzs zzsVar2 = this.zza;
                zzs.zza(zzsVar2);
                zzs.zze(zzsVar2);
                zzc.zzn("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                zzs zzsVar3 = this.zza;
                zzchVar2 = zzsVar3.zze;
                zzie zzieVar2 = zzie.zzay;
                BillingResult billingResult3 = zzcj.zzh;
                zzchVar2.zzd(zzcg.zzb(zzieVar2, i, billingResult3, null, zzilVar), j, z);
                purchasesUpdatedListener2 = zzsVar3.zzb;
                purchasesUpdatedListener2.onPurchasesUpdated(billingResult3, com.google.android.gms.internal.play_billing.zzbt.zzk());
            }
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
        zzr zzrVar;
        try {
            try {
                if (this.zzb) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    zzrVar = this;
                    context.registerReceiver(zzrVar, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, true != this.zzc ? 4 : 2);
                } else {
                    zzrVar = this;
                    context.registerReceiver(this, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null);
                }
                zzrVar.zzb = true;
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
