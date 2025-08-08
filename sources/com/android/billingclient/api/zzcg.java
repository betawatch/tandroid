package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzbf;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzkb;
import com.google.android.gms.internal.play_billing.zzkd;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzki;

/* loaded from: classes.dex */
public abstract /* synthetic */ class zzcg {
    static {
        int i = zzch.$r8$clinit;
    }

    public static String zza(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + zzbf.zzb(exc.getMessage());
            int i = zze.zza;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    public static zzjz zzb(int i, int i2, BillingResult billingResult) {
        try {
            zzjx zzc = zzjz.zzc();
            zzke zzc2 = zzki.zzc();
            zzc2.zzn(billingResult.getResponseCode());
            zzc2.zzm(billingResult.getDebugMessage());
            zzc2.zzo(i);
            zzc.zza(zzc2);
            zzc.zzn(i2);
            return (zzjz) zzc.zzf();
        } catch (Exception e) {
            zze.zzm("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }

    public static zzjz zzc(int i, int i2, BillingResult billingResult, String str) {
        try {
            zzke zzc = zzki.zzc();
            zzc.zzn(billingResult.getResponseCode());
            zzc.zzm(billingResult.getDebugMessage());
            zzc.zzo(i);
            if (str != null) {
                zzc.zza(str);
            }
            zzjx zzc2 = zzjz.zzc();
            zzc2.zza(zzc);
            zzc2.zzn(i2);
            return (zzjz) zzc2.zzf();
        } catch (Throwable th) {
            zze.zzm("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static zzkd zzd(int i) {
        try {
            zzkb zzc = zzkd.zzc();
            zzc.zzn(i);
            return (zzkd) zzc.zzf();
        } catch (Exception e) {
            zze.zzm("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
