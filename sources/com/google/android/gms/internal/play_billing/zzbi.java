package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzbi {
    private final zzbl zza;
    private boolean zzb;
    private long zzc;
    private long zzd;

    public static zzbi zzb(zzbl zzblVar) {
        zzbi zzbiVar = new zzbi(zzblVar);
        zzbiVar.zze();
        return zzbiVar;
    }

    public static zzbi zzc(zzbl zzblVar) {
        return new zzbi(zzblVar);
    }

    private final long zzh() {
        return this.zzb ? (this.zza.zza() - this.zzd) + this.zzc : this.zzc;
    }

    public final String toString() {
        String str;
        long zzh = zzh();
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(zzh, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(zzh, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(zzh, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(zzh, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(zzh, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(zzh, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        String format = String.format(Locale.ROOT, "%.4g", Double.valueOf(zzh / timeUnit2.convert(1L, timeUnit)));
        switch (zzbh.zza[timeUnit.ordinal()]) {
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
        return timeUnit.convert(zzh(), TimeUnit.NANOSECONDS);
    }

    public final zzbi zzd() {
        this.zzc = 0L;
        this.zzb = false;
        return this;
    }

    public final zzbi zze() {
        zzbg.zze(!this.zzb, "This stopwatch is already running.");
        this.zzb = true;
        this.zzd = this.zza.zza();
        return this;
    }

    public final zzbi zzf() {
        long zza = this.zza.zza();
        zzbg.zze(this.zzb, "This stopwatch is already stopped.");
        this.zzb = false;
        this.zzc += zza - this.zzd;
        return this;
    }

    public final boolean zzg() {
        return this.zzb;
    }

    zzbi(zzbl zzblVar) {
        zzbg.zzc(zzblVar, "ticker");
        this.zza = zzblVar;
    }
}
