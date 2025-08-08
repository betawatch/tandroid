package com.google.android.gms.internal.cast;

/* loaded from: classes.dex */
final class zzup implements zzvj {
    private static final zzuv zza = new zzun();
    private final zzuv zzb;

    public zzup() {
        zzuv zzuvVar;
        zztl zza2 = zztl.zza();
        try {
            zzuvVar = (zzuv) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            zzuvVar = zza;
        }
        zzuo zzuoVar = new zzuo(zza2, zzuvVar);
        byte[] bArr = zzty.zzd;
        this.zzb = zzuoVar;
    }

    private static boolean zzb(zzuu zzuuVar) {
        return zzuuVar.zzc() + (-1) != 1;
    }

    @Override // com.google.android.gms.internal.cast.zzvj
    public final zzvi zza(Class cls) {
        zzvk.zzp(cls);
        zzuu zzb = this.zzb.zzb(cls);
        return zzb.zzb() ? zztp.class.isAssignableFrom(cls) ? zzvb.zzi(zzvk.zzn(), zzth.zzb(), zzb.zza()) : zzvb.zzi(zzvk.zzm(), zzth.zza(), zzb.zza()) : zztp.class.isAssignableFrom(cls) ? zzb(zzb) ? zzva.zzi(cls, zzb, zzvd.zzb(), zzul.zzd(), zzvk.zzn(), zzth.zzb(), zzut.zzb()) : zzva.zzi(cls, zzb, zzvd.zzb(), zzul.zzd(), zzvk.zzn(), null, zzut.zzb()) : zzb(zzb) ? zzva.zzi(cls, zzb, zzvd.zza(), zzul.zzc(), zzvk.zzm(), zzth.zza(), zzut.zza()) : zzva.zzi(cls, zzb, zzvd.zza(), zzul.zzc(), zzvk.zzm(), null, zzut.zza());
    }
}
