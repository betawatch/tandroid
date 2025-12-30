package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
final class zztk implements zzuh {
    private static final zztq zza = new zzti();
    private final zztq zzb;

    public zztk() {
        zzsg zza2 = zzsg.zza();
        int i = zzuc.zza;
        zztj zztjVar = new zztj(zza2, zza);
        byte[] bArr = zzsv.zzb;
        this.zzb = zztjVar;
    }

    @Override // com.google.android.recaptcha.internal.zzuh
    public final zzug zza(Class cls) {
        int i = zzui.zza;
        if (!zzsn.class.isAssignableFrom(cls)) {
            int i2 = zzuc.zza;
        }
        zztp zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            int i3 = zzuc.zza;
            return zztw.zzc(zzui.zzm(), zzsb.zza(), zzb.zza());
        }
        int i4 = zzuc.zza;
        return zztv.zzm(cls, zzb, zztz.zza(), zztg.zza(), zzui.zzm(), zzb.zzc() + (-1) != 1 ? zzsb.zza() : null, zzto.zza());
    }
}
