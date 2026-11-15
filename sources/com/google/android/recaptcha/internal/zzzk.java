package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public enum zzzk implements zzsp {
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
    zzk(-1);

    private final int zzm;

    zzzk(int i7) {
        this.zzm = i7;
    }

    public static zzzk zzb(int i7) {
        switch (i7) {
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
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzm);
    }

    @Override // com.google.android.recaptcha.internal.zzsp
    public final int zza() {
        if (this != zzk) {
            return this.zzm;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
