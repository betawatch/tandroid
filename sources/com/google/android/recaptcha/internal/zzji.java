package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class zzji implements zzjt {
    public static final zzji zza = new zzji();

    private zzji() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i7, zziz zzizVar, zzzt... zzztVarArr) {
        boolean z9 = true;
        if (zzztVarArr.length != 1) {
            throw new zzdm(4, 3, null);
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (zza2 == null) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzdm(4, 5, null);
        }
        try {
            try {
                if (zza2 instanceof String) {
                    zza2 = zzizVar.zzh().zza((String) zza2);
                }
                zzja zzc = zzizVar.zzc();
                try {
                    zziy.zza(zza2);
                } catch (zzdm e10) {
                    if (e10.zzb() == 8 || e10.zzb() == 6) {
                        z9 = false;
                    } else if (e10.zzb() != 47) {
                        throw e10;
                    }
                }
                zzc.zze(i7, Boolean.valueOf(z9));
            } catch (zzdm e11) {
                throw e11;
            }
        } catch (Exception e12) {
            throw new zzdm(6, 8, e12);
        }
    }
}
