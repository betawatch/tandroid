package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class zzko implements zzjt {
    public static final zzko zza = new zzko();

    private zzko() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i7, zziz zzizVar, zzzt... zzztVarArr) {
        int length = zzztVarArr.length;
        if (length != 2) {
            if (length != 0) {
                throw new zzdm(4, 3, null);
            }
            zzizVar.zzc().zze(i7, new zzcs());
            return;
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (zza2 instanceof String)) {
            zza2 = null;
        }
        String str = (String) zza2;
        if (str == null) {
            throw new zzdm(4, 5, null);
        }
        Object zza3 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (true != (zza3 instanceof zzcs)) {
            zza3 = null;
        }
        zzcs zzcsVar = (zzcs) zza3;
        if (zzcsVar == null) {
            throw new zzdm(4, 5, null);
        }
        byte[] zzd = zzhd.zza(zzizVar.zzb(), zzcsVar).zzd();
        zzizVar.zzi().zzb(str, zzpp.zzh().zzi(zzd, 0, zzd.length));
    }
}
