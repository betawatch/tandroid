package com.google.android.recaptcha.internal;

import androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticNonNull0;

/* loaded from: classes.dex */
public final class zzji implements zzjt {
    public static final zzji zza = new zzji();

    private zzji() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        boolean z = true;
        if (zzztVarArr.length != 1) {
            throw new zzdm(4, 3, null);
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != OnBackPressedDispatcher$$ExternalSyntheticNonNull0.m(zza2)) {
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
                        z = false;
                    } else if (e.zzb() != 47) {
                        throw e;
                    }
                }
                zzc.zze(i, Boolean.valueOf(z));
            } catch (zzdm e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw new zzdm(6, 8, e3);
        }
    }
}
