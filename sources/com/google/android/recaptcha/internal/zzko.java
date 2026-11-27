package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zzko implements zzjt {
    public static final zzko zza = new zzko();

    private zzko() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        int length = zzztVarArr.length;
        if (length != 2) {
            if (length == 0) {
                zzizVar.zzc().zze(i, new zzcs());
                return;
            } else {
                p3d.d(4, 3, null);
                return;
            }
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (true != (zza2 instanceof String)) {
            zza2 = null;
        }
        String str = (String) zza2;
        if (str == null) {
            p3d.d(4, 5, null);
            return;
        }
        Object zza3 = zzizVar.zzc().zza(zzztVarArr[1]);
        if (true != (zza3 instanceof zzcs)) {
            zza3 = null;
        }
        zzcs zzcsVar = (zzcs) zza3;
        if (zzcsVar == null) {
            p3d.d(4, 5, null);
            return;
        }
        byte[] zzd = zzhd.zza(zzizVar.zzb(), zzcsVar).zzd();
        zzizVar.zzi().zzb(str, zzpp.zzh().zzi(zzd, 0, zzd.length));
    }
}
