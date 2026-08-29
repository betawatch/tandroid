package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        int i10 = (int) (j10 % 1000000000);
        long j11 = j10 / 1000000000;
        if (i10 <= -1000000000 || i10 >= 1000000000) {
            j11 = zzps.zza(j11, i10 / 1000000000);
            i10 %= 1000000000;
        }
        if (j11 > 0 && i10 < 0) {
            i10 += 1000000000;
            j11--;
        }
        if (j11 < 0 && i10 > 0) {
            i10 -= 1000000000;
            j11++;
        }
        zzrt zzi = zzrv.zzi();
        zzi.zzf(j11);
        zzi.zze(i10);
        zzrv zzrvVar = (zzrv) zzi.zzk();
        long zzg = zzrvVar.zzg();
        int zzf = zzrvVar.zzf();
        if (zzg < -315576000000L || zzg > 315576000000L || zzf < -999999999 || zzf >= 1000000000 || ((zzg < 0 || zzf < 0) && (zzg > 0 || zzf > 0))) {
            throw new IllegalArgumentException(zzmg.zza("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(zzg), Integer.valueOf(zzf)));
        }
        return zzrvVar;
    }
}
