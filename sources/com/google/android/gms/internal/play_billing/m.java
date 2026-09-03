package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class m {
    public final h a;
    public boolean b;
    public long c;
    public long d;

    public m(h hVar) {
        if (hVar == null) {
            throw new NullPointerException("ticker");
        }
        this.a = hVar;
    }

    public final void a() {
        if (this.b) {
            throw new IllegalStateException("This stopwatch is already running.");
        }
        this.b = true;
        this.d = this.a.a();
    }

    public final String toString() {
        String str;
        long a2 = this.b ? (this.a.a() - this.d) + this.c : this.c;
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(a2, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(a2, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(a2, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(a2, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(a2, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(a2, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        String format = String.format(Locale.ROOT, "%.4g", Double.valueOf(a2 / timeUnit2.convert(1L, timeUnit)));
        switch (l.a[timeUnit.ordinal()]) {
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
        return android.support.v4.media.a.z(format, " ", str);
    }
}
