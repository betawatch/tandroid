package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class zzji implements zzjt {
    public static final zzji zza = new zzji();

    private zzji() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i10, zziz zzizVar, zzzt... zzztVarArr) {
        boolean z10 = true;
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
                } catch (zzdm e) {
                    if (e.zzb() == 8 || e.zzb() == 6) {
                        z10 = false;
                    } else if (e.zzb() != 47) {
                        throw e;
                    }
                }
                zzc.zze(i10, Boolean.valueOf(z10));
            } catch (zzdm e7) {
                throw e7;
            }
        } catch (Exception e10) {
            throw new zzdm(6, 8, e10);
        }
    }
}
