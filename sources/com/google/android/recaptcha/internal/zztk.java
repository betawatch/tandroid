package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
final class zztk implements zzuh {
    private static final zztq zza = new zzti();
    private final zztq zzb;

    public zztk() {
        zzsg zza2 = zzsg.zza();
        int i10 = zzuc.zza;
        zztj zztjVar = new zztj(zza2, zza);
        byte[] bArr = zzsv.zzb;
        this.zzb = zztjVar;
    }

    @Override // com.google.android.recaptcha.internal.zzuh
    public final zzug zza(Class cls) {
        int i10 = zzui.zza;
        if (!zzsn.class.isAssignableFrom(cls)) {
            int i11 = zzuc.zza;
        }
        zztp zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            int i12 = zzuc.zza;
            return zztw.zzc(zzui.zzm(), zzsb.zza(), zzb.zza());
        }
        int i13 = zzuc.zza;
        return zztv.zzm(cls, zzb, zztz.zza(), zztg.zza(), zzui.zzm(), zzb.zzc() + (-1) != 1 ? zzsb.zza() : null, zzto.zza());
    }
}
