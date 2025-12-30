package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzjx implements zzjt {
    public static final zzjx zza = new zzjx();

    private zzjx() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        if (zzztVarArr.length != 2) {
            throw new zzdm(4, 3, null);
        }
        Class<?> zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzdm(4, 5, null);
        }
        Class<?> cls = zza2 instanceof Class ? zza2 : zza2.getClass();
        Object zza3 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (true != (zza3 instanceof String)) {
            zza3 = null;
        }
        String str = (String) zza3;
        if (str == null) {
            throw new zzdm(4, 5, null);
        }
        try {
            zzizVar.zzc().zze(i, cls.getField(zzizVar.zzh().zza(str)));
        } catch (Exception e) {
            throw new zzdm(6, 10, e);
        }
    }
}
