package com.google.android.recaptcha.internal;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzfh {
    private final zzfk zza = zzfk.zza();
    private boolean zzb;
    private long zzc;
    private long zzd;

    zzfh() {
    }

    public static zzfh zzb() {
        zzfh zzfhVar = new zzfh();
        zzfhVar.zze();
        return zzfhVar;
    }

    public static zzfh zzc() {
        return new zzfh();
    }

    private final long zzg() {
        return this.zzb ? (System.nanoTime() - this.zzd) + this.zzc : this.zzc;
    }

    public final String toString() {
        String str;
        long zzg = zzg();
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(zzg, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(zzg, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(zzg, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(zzg, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(zzg, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(zzg, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        String format = String.format(Locale.ROOT, "%.4g", Double.valueOf(zzg / timeUnit2.convert(1L, timeUnit)));
        switch (zzfg.zza[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return format + " " + str;
    }

    public final long zza(TimeUnit timeUnit) {
        return timeUnit.convert(zzg(), TimeUnit.NANOSECONDS);
    }

    public final zzfh zzd() {
        this.zzc = 0L;
        this.zzb = false;
        return this;
    }

    public final zzfh zze() {
        zzff.zze(!this.zzb, "This stopwatch is already running.");
        this.zzb = true;
        this.zzd = System.nanoTime();
        return this;
    }

    public final zzfh zzf() {
        long nanoTime = System.nanoTime();
        zzff.zze(this.zzb, "This stopwatch is already stopped.");
        this.zzb = false;
        this.zzc += nanoTime - this.zzd;
        return this;
    }
}
