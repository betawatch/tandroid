package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public abstract class zznr {
    private static String zza = "com.google.android.recaptcha.internal.zznv";
    private static String zzb = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String zzc = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final String[] zzd = {"com.google.android.recaptcha.internal.zznv", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int zza() {
        return zzov.zza();
    }

    public static long zzb() {
        zznr zznrVar;
        zznrVar = zznp.zza;
        return zznrVar.zzc();
    }

    public static zznb zzd(String str) {
        zznr zznrVar;
        zznrVar = zznp.zza;
        return zznrVar.zze(str);
    }

    public static zznd zzf() {
        return zzi().zza();
    }

    public static zznq zzg() {
        zznr zznrVar;
        zznrVar = zznp.zza;
        return zznrVar.zzh();
    }

    public static zzof zzi() {
        zznr zznrVar;
        zznrVar = zznp.zza;
        return zznrVar.zzj();
    }

    public static zzor zzk() {
        return zzi().zzc();
    }

    public static String zzl() {
        zznr zznrVar;
        zznrVar = zznp.zza;
        return zznrVar.zzm();
    }

    public static boolean zzn(String str, Level level, boolean z10) {
        zzi().zzd(str, level, z10);
        return false;
    }

    public long zzc() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public abstract zznb zze(String str);

    public abstract zznq zzh();

    public zzof zzj() {
        return zzof.zze();
    }

    public abstract String zzm();
}
