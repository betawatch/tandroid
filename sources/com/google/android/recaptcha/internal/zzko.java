package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class zzko implements zzjt {
    public static final zzko zza = new zzko();

    private zzko() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i10, zziz zzizVar, zzzt... zzztVarArr) {
        int length = zzztVarArr.length;
        if (length != 2) {
            if (length != 0) {
                throw new zzdm(4, 3, null);
            }
            zzizVar.zzc().zze(i10, new zzcs());
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
