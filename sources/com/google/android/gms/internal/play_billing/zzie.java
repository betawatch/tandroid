package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class zzie implements zziy {
    private static final zzik zza = new zzic();
    private final zzik zzb;

    public zzie() {
        zzhf zza2 = zzhf.zza();
        int i = zziu.$r8$clinit;
        zzid zzidVar = new zzid(zza2, zza);
        byte[] bArr = zzhp.zzb;
        this.zzb = zzidVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zziy
    public final zzix zza(Class cls) {
        int i = zziz.$r8$clinit;
        if (!zzhk.class.isAssignableFrom(cls)) {
            int i2 = zziu.$r8$clinit;
        }
        zzij zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            int i3 = zziu.$r8$clinit;
            return zziq.zzc(zziz.zzm(), zzgz.zza(), zzb.zza());
        }
        int i4 = zziu.$r8$clinit;
        return zzip.zzl(cls, zzb, zzis.zza(), zzia.zza(), zziz.zzm(), zzb.zzc() + (-1) != 1 ? zzgz.zza() : null, zzii.zza());
    }
}
