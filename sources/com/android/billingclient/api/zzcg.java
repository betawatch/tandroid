package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzbj;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzhv;
import com.google.android.gms.internal.play_billing.zzhx;
import com.google.android.gms.internal.play_billing.zzhz;
import com.google.android.gms.internal.play_billing.zzib;
import com.google.android.gms.internal.play_billing.zzic;
import com.google.android.gms.internal.play_billing.zzie;
import com.google.android.gms.internal.play_billing.zzig;
import com.google.android.gms.internal.play_billing.zzil;

/* loaded from: classes.dex */
public abstract /* synthetic */ class zzcg {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        int i = zzch.$r8$clinit;
    }

    public static String zza(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + zzbj.zzb(exc.getMessage());
            int i = zzc.zza;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static zzhx zzb(zzie zzieVar, int i, BillingResult billingResult, String str, zzil zzilVar) {
        try {
            zzic zzc = zzig.zzc();
            zzc.zzo(billingResult.getResponseCode());
            zzc.zzl(billingResult.getDebugMessage());
            if (billingResult.getOnPurchasesUpdatedSubResponseCode() != 0) {
                zzc.zzm(billingResult.getOnPurchasesUpdatedSubResponseCode());
            }
            if (zzieVar != null) {
                zzc.zzn(zzieVar);
            }
            if (str != null) {
                zzc.zza(str);
            }
            zzhv zzc2 = zzhx.zzc();
            zzc2.zzl(zzc);
            zzc2.zzp(i);
            if (!zzilVar.equals(zzil.zza)) {
                zzc2.zza(zzilVar);
            }
            return (zzhx) zzc2.zze();
        } catch (Throwable th) {
            zzc.zzo("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static zzib zzc(int i, zzil zzilVar) {
        try {
            zzhz zzc = zzib.zzc();
            zzc.zzo(i);
            if (!zzilVar.equals(zzil.zza)) {
                zzc.zza(zzilVar);
            }
            return (zzib) zzc.zze();
        } catch (Exception e) {
            zzc.zzo("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
