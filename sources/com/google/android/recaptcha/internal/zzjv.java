package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class zzjv implements zzjt {
    public static final zzjv zza = new zzjv();

    private zzjv() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i10, zziz zzizVar, zzzt... zzztVarArr) {
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
            zzizVar.zzc().zze(i10, zziy.zza(zza2));
        } catch (zzdm e) {
            throw e;
        } catch (Exception e7) {
            throw new zzdm(6, 8, e7);
        }
    }
}
