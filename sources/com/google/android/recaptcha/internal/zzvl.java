package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
        if (zze && zzf >= 0 && zzf < 1000000000) {
            return zzutVar;
        }
        lq5.j(zzmg.zza("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(zzg), Integer.valueOf(zzf)));
        return null;
    }

    public static zzut zzb(long j) {
        long j2 = j / 1000;
        if (!zze(j2)) {
            lq5.j(zzmg.zza("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", Long.valueOf(j2)));
            return null;
        }
        int i = (int) ((j % 1000) * 1000000);
        if (i <= -1000000000 || i >= 1000000000) {
            j2 = zzps.zza(j2, i / 1000000000);
            i %= 1000000000;
        }
        if (i < 0) {
            i += 1000000000;
            j2 = zzps.zzb(j2, 1L);
        }
        zzur zzi = zzut.zzi();
        zzi.zzf(j2);
        zzi.zze(i);
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
            sb.append(zzf % 1000000 == 0 ? String.format(Locale.ENGLISH, "%1$03d", Integer.valueOf(zzf / 1000000)) : zzf % 1000 == 0 ? String.format(Locale.ENGLISH, "%1$06d", Integer.valueOf(zzf / 1000)) : String.format(Locale.ENGLISH, "%1$09d", Integer.valueOf(zzf)));
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

    private static boolean zze(long j) {
        return j >= -62135596800L && j <= 253402300799L;
    }
}
