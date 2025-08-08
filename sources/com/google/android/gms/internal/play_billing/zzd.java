package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
enum zzd {
    zza(-999),
    zzb(-3),
    zzc(-2),
    zzd(-1),
    zze(0),
    zzf(1),
    zzg(2),
    zzh(3),
    zzi(4),
    zzj(5),
    zzk(6),
    zzl(7),
    zzm(8),
    zzn(11),
    zzo(12);

    private static final zzcr zzp;
    private final int zzr;

    static {
        zzcq zzcqVar = new zzcq();
        for (zzd zzdVar : values()) {
            zzcqVar.zza(Integer.valueOf(zzdVar.zzr), zzdVar);
        }
        zzp = zzcqVar.zzb();
    }

    zzd(int i) {
        this.zzr = i;
    }

    static zzd zza(int i) {
        zzcr zzcrVar = zzp;
        Integer valueOf = Integer.valueOf(i);
        return !zzcrVar.containsKey(valueOf) ? zza : (zzd) zzcrVar.get(valueOf);
    }
}
