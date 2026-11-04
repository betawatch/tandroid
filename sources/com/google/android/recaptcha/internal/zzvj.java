package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class zzvj {
    static {
        zzrt zzi = zzrv.zzi();
        zzi.zzf(-315576000000L);
        zzi.zze(-999999999);
        zzrt zzi2 = zzrv.zzi();
        zzi2.zzf(315576000000L);
        zzi2.zze(999999999);
        zzrt zzi3 = zzrv.zzi();
        zzi3.zzf(0L);
        zzi3.zze(0);
    }

    public static zzrv zza(long j10) {
        int i3 = (int) (j10 % 1000000000);
        long j11 = j10 / 1000000000;
        if (i3 <= -1000000000 || i3 >= 1000000000) {
            j11 = zzps.zza(j11, i3 / 1000000000);
            i3 %= 1000000000;
        }
        if (j11 > 0 && i3 < 0) {
            i3 += 1000000000;
            j11--;
        }
        if (j11 < 0 && i3 > 0) {
            i3 -= 1000000000;
            j11++;
        }
        zzrt zzi = zzrv.zzi();
        zzi.zzf(j11);
        zzi.zze(i3);
        zzrv zzrvVar = (zzrv) zzi.zzk();
        long zzg = zzrvVar.zzg();
        int zzf = zzrvVar.zzf();
        if (zzg < -315576000000L || zzg > 315576000000L || zzf < -999999999 || zzf >= 1000000000 || ((zzg < 0 || zzf < 0) && (zzg > 0 || zzf > 0))) {
            throw new IllegalArgumentException(zzmg.zza("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(zzg), Integer.valueOf(zzf)));
        }
        return zzrvVar;
    }
}
