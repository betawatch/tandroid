package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class zzjf implements zzjt {
    public static final zzjf zza = new zzjf();

    private zzjf() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i7, zziz zzizVar, zzzt... zzztVarArr) {
        if (zzztVarArr.length != 3) {
            throw new zzdm(4, 3, null);
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (zza2 instanceof Integer)) {
            zza2 = null;
        }
        Integer num = (Integer) zza2;
        if (num == null) {
            throw new zzdm(4, 5, null);
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            throw new zzdm(4, 6, null);
        }
        Object zza3 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (zza3 == null) {
            zza3 = null;
        }
        if (zza3 == null) {
            throw new zzdm(4, 5, null);
        }
        Object zza4 = zzizVar.zzc().zza(zzztVarArr[2]);
        if (zza4 == null) {
            zza4 = null;
        }
        if (zza4 == null) {
            throw new zzdm(4, 5, null);
        }
        if (zza3.equals(zza4)) {
            zzizVar.zzg(zzizVar.zza() + intValue);
        }
    }
}
