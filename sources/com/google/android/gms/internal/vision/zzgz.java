package com.google.android.gms.internal.vision;

/* loaded from: classes.dex */
public enum zzgz implements zzje {
    zza(0),
    zzb(1),
    zzc(2),
    zzd(3),
    zze(4),
    zzf(5),
    zzg(6),
    zzh(7),
    zzi(8),
    zzj(9),
    zzk(10),
    zzl(11),
    zzm(12),
    zzn(13),
    zzo(14),
    zzp(16);

    private static final zzjh zzq = new zzjh() { // from class: com.google.android.gms.internal.vision.zzgy
    };
    private final int zzr;

    zzgz(int i) {
        this.zzr = i;
    }

    public static zzgz zza(int i) {
        switch (i) {
            case 0:
                return zza;
            case 1:
                return zzb;
            case 2:
                return zzc;
            case 3:
                return zzd;
            case 4:
                return zze;
            case 5:
                return zzf;
            case 6:
                return zzg;
            case 7:
                return zzh;
            case 8:
                return zzi;
            case 9:
                return zzj;
            case 10:
                return zzk;
            case 11:
                return zzl;
            case 12:
                return zzm;
            case 13:
                return zzn;
            case 14:
                return zzo;
            case 15:
            default:
                return null;
            case 16:
                return zzp;
        }
    }

    public static zzjg zzb() {
        return zzhb.zza;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "<" + zzgz.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzr + " name=" + name() + '>';
    }

    @Override // com.google.android.gms.internal.vision.zzje
    public final int zza() {
        return this.zzr;
    }
}
