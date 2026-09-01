package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class zzvl {
    public static final /* synthetic */ int zza = 0;
    private static final ThreadLocal zzb;

    static {
        zzur zzi = zzut.zzi();
        zzi.zzf(-62135596800L);
        zzi.zze(0);
        zzur zzi2 = zzut.zzi();
        zzi2.zzf(253402300799L);
        zzi2.zze(999999999);
        zzur zzi3 = zzut.zzi();
        zzi3.zzf(0L);
        zzi3.zze(0);
        zzb = new zzvk();
        zzd("now");
        zzd("getEpochSecond");
        zzd("getNano");
    }

    public static zzut zza(zzut zzutVar) {
        long zzg = zzutVar.zzg();
        boolean zze = zze(zzg);
        int zzf = zzutVar.zzf();
        if (!zze || zzf < 0 || zzf >= 1000000000) {
            throw new IllegalArgumentException(zzmg.zza("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(zzg), Integer.valueOf(zzf)));
        }
        return zzutVar;
    }

    public static zzut zzb(long j10) {
        long j11 = j10 / 1000;
        if (!zze(j11)) {
            throw new IllegalArgumentException(zzmg.zza("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", Long.valueOf(j11)));
        }
        int i10 = (int) ((j10 % 1000) * 1000000);
        if (i10 <= -1000000000 || i10 >= 1000000000) {
            j11 = zzps.zza(j11, i10 / 1000000000);
            i10 %= 1000000000;
        }
        if (i10 < 0) {
            i10 += 1000000000;
            j11 = zzps.zzb(j11, 1L);
        }
        zzur zzi = zzut.zzi();
        zzi.zzf(j11);
        zzi.zze(i10);
        zzut zzutVar = (zzut) zzi.zzk();
        zza(zzutVar);
        return zzutVar;
    }

    public static String zzc(zzut zzutVar) {
        zza(zzutVar);
        long zzg = zzutVar.zzg();
        int zzf = zzutVar.zzf();
        StringBuilder sb = new StringBuilder();
        sb.append(((SimpleDateFormat) zzb.get()).format(new Date(zzg * 1000)));
        if (zzf != 0) {
            sb.append(".");
            sb.append(zzf % MediaController.VIDEO_BITRATE_480 == 0 ? String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(zzf / MediaController.VIDEO_BITRATE_480)) : zzf % MediaDataController.MAX_STYLE_RUNS_COUNT == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(zzf / MediaDataController.MAX_STYLE_RUNS_COUNT)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(zzf)));
        }
        sb.append("Z");
        return sb.toString();
    }

    private static Method zzd(String str) {
        try {
            return Class.forName("j$.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean zze(long j10) {
        return j10 >= -62135596800L && j10 <= 253402300799L;
    }
}
