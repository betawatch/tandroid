package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class zzjv implements zzjt {
    public static final zzjv zza = new zzjv();

    private zzjv() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i7, zziz zzizVar, zzzt... zzztVarArr) {
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
            if (zza2 instanceof String) {
                zza2 = zzizVar.zzh().zza((String) zza2);
            }
            zzizVar.zzc().zze(i7, zziy.zza(zza2));
        } catch (zzdm e10) {
            throw e10;
        } catch (Exception e11) {
            throw new zzdm(6, 8, e11);
        }
    }
}
