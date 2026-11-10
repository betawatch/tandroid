package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class zzkh implements zzjt {
    public static final zzkh zza = new zzkh();

    private zzkh() {
    }

    @Override // com.google.android.recaptcha.internal.zzjt
    public final void zza(int i7, zziz zzizVar, zzzt... zzztVarArr) {
        if (zzztVarArr.length != 1) {
            throw new zzdm(4, 3, null);
        }
        zzizVar.zzc().zze(i7, zzizVar.zzc().zza(zzztVarArr[0]));
    }
}
