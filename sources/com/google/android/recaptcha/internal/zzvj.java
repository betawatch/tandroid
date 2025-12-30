package com.google.android.recaptcha.internal;

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

    public static zzrv zza(long j) {
        int i = (int) (j % 1000000000);
        long j2 = j / 1000000000;
        if (i <= -1000000000 || i >= 1000000000) {
            j2 = zzps.zza(j2, i / 1000000000);
            i %= 1000000000;
        }
        if (j2 > 0 && i < 0) {
            i += 1000000000;
            j2--;
        }
        if (j2 < 0 && i > 0) {
            i -= 1000000000;
            j2++;
        }
        zzrt zzi = zzrv.zzi();
        zzi.zzf(j2);
        zzi.zze(i);
        zzrv zzrvVar = (zzrv) zzi.zzk();
        long zzg = zzrvVar.zzg();
        int zzf = zzrvVar.zzf();
        if (zzg < -315576000000L || zzg > 315576000000L || zzf < -999999999 || zzf >= 1000000000 || ((zzg < 0 || zzf < 0) && (zzg > 0 || zzf > 0))) {
            throw new IllegalArgumentException(zzmg.zza("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(zzg), Integer.valueOf(zzf)));
        }
        return zzrvVar;
    }
}
