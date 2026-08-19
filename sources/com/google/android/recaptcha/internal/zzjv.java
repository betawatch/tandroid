package com.google.android.recaptcha.internal;

import androidx.activity.OnBackPressedDispatcher$$ExternalSyntheticNonNull0;

/* loaded from: classes.dex */
public final class zzjv implements zzjt {
    public static final zzjv zza = new zzjv();

    private zzjv() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
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
            if (zza2 instanceof String) {
                zza2 = zzizVar.zzh().zza((String) zza2);
            }
            zzizVar.zzc().zze(i, zziy.zza(zza2));
        } catch (zzdm e) {
            throw e;
        } catch (Exception e2) {
            throw new zzdm(6, 8, e2);
        }
    }
}
