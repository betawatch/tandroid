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
        zzvc zza2;
        zzul zzc;
        zzvz zzm;
        zztf zza3;
        zzus zza4;
        zzvz zzm2;
        zztf zza5;
        zzvk.zzp(cls);
        zzuu zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            if (zztp.class.isAssignableFrom(cls)) {
                zzm2 = zzvk.zzn();
                zza5 = zzth.zzb();
            } else {
                zzm2 = zzvk.zzm();
                zza5 = zzth.zza();
            }
            return zzvb.zzi(zzm2, zza5, zzb.zza());
        }
        if (zztp.class.isAssignableFrom(cls)) {
            boolean zzb2 = zzb(zzb);
            zza2 = zzvd.zzb();
            zzc = zzul.zzd();
            zzm = zzvk.zzn();
            zza3 = zzb2 ? zzth.zzb() : null;
            zza4 = zzut.zzb();
        } else {
            boolean zzb3 = zzb(zzb);
            zza2 = zzvd.zza();
            zzc = zzul.zzc();
            zzm = zzvk.zzm();
            zza3 = zzb3 ? zzth.zza() : null;
            zza4 = zzut.zza();
        }
        return zzva.zzi(cls, zzb, zza2, zzc, zzm, zza3, zza4);
    }
}
