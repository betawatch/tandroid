package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class zzjv implements zzjt {
    public static final zzjv zza = new zzjv();

    private zzjv() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i, zziz zzizVar, zzzt... zzztVarArr) {
        if (zzztVarArr.length != 1) {
            p3d.d(4, 3, null);
            return;
        }
        Object zza2 = zzizVar.zzc().zza(zzztVarArr[0]);
        if (zza2 == null) {
            zza2 = null;
        }
        if (zza2 == null) {
            p3d.d(4, 5, null);
            return;
        }
        try {
            if (zza2 instanceof String) {
                zza2 = zzizVar.zzh().zza((String) zza2);
            }
            zzizVar.zzc().zze(i, zziy.zza(zza2));
        } catch (zzdm e) {
            throw e;
        } catch (Exception e2) {
            p3d.d(6, 8, e2);
        }
    }
}
