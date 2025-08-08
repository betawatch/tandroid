package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public abstract class zzv {
    public static zzeu zza(com.android.billingclient.api.zzbs zzbsVar) {
        zzr zzrVar = new zzr();
        zzu zzuVar = new zzu(zzrVar);
        zzrVar.zzb = zzuVar;
        zzrVar.zza = zzbsVar.getClass();
        try {
            zzrVar.zza = zzbsVar.zza(zzrVar);
        } catch (Exception e) {
            zzuVar.zzc(e);
        }
        return zzuVar;
    }
}
