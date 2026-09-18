package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class zzkh implements zzjt {
    public static final zzkh zza = new zzkh();

    private zzkh() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i10, zziz zzizVar, zzzt... zzztVarArr) {
        if (zzztVarArr.length != 1) {
            throw new zzdm(4, 3, null);
        }
        zzizVar.zzc().zze(i10, zzizVar.zzc().zza(zzztVarArr[0]));
    }
}
