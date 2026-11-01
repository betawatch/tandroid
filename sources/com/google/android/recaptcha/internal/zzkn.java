package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class zzkn implements zzjt {
    public static final zzkn zza = new zzkn();

    private zzkn() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i10, zziz zzizVar, zzzt... zzztVarArr) {
        if (zzztVarArr.length != 2) {
            throw new zzdm(4, 3, null);
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (zza2 instanceof int[])) {
            zza2 = null;
        }
        int[] iArr = (int[]) zza2;
        if (iArr == null) {
            throw new zzdm(4, 5, null);
        }
        Object zza3 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (true != (zza3 instanceof String)) {
            zza3 = null;
        }
        String str = (String) zza3;
        if (str == null) {
            throw new zzdm(4, 5, null);
        }
        zzja zzc = zzizVar.zzc();
        StringBuilder sb2 = new StringBuilder();
        try {
            for (int i11 : iArr) {
                sb2.append(str.charAt(i11));
            }
            zzc.zze(i10, sb2.toString());
        } catch (Exception e) {
            throw new zzdm(4, 22, e);
        }
    }
}
