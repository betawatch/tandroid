package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
final class zzgd implements zzgw {
    private static final zzgj zza = new zzgb();
    private final zzgj zzb;

    public zzgd() {
        zzfd zza2 = zzfd.zza();
        int i = zzgs.$r8$clinit;
        zzgc zzgcVar = new zzgc(zza2, zza);
        byte[] bArr = zzfo.zzb;
        this.zzb = zzgcVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgw
    public final zzgv zza(Class cls) {
        int i = zzgx.$r8$clinit;
        if (!zzfi.class.isAssignableFrom(cls)) {
            int i2 = zzgs.$r8$clinit;
        }
        zzgi zzb = this.zzb.zzb(cls);
        if (zzb.zzb()) {
            int i3 = zzgs.$r8$clinit;
            return zzgp.zzc(zzgx.zzm(), zzex.zza(), zzb.zza());
        }
        int i4 = zzgs.$r8$clinit;
        return zzgo.zzl(cls, zzb, zzgr.zza(), zzfz.zza(), zzgx.zzm(), zzb.zzc() + (-1) != 1 ? zzex.zza() : null, zzgh.zza());
    }
}
