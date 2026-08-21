package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
enum zzb {
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

    private static final zzbw zzp;
    private final int zzr;

    static {
        zzbv zzbvVar = new zzbv();
        for (zzb zzbVar : values()) {
            zzbvVar.zza(Integer.valueOf(zzbVar.zzr), zzbVar);
        }
        zzp = zzbvVar.zzb();
    }

    zzb(int i) {
        this.zzr = i;
    }

    static zzb zza(int i) {
        zzbw zzbwVar = zzp;
        Integer valueOf = Integer.valueOf(i);
        return !zzbwVar.containsKey(valueOf) ? zza : (zzb) zzbwVar.get(valueOf);
    }
}
