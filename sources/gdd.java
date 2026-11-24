// default package

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class gdd {
    public final mad a;
    public boolean b;
    public long c;
    public long d;

    public gdd(mad madVar) {
        if (madVar != null) {
            this.a = madVar;
        } else {
            fvc.f("ticker");
            throw null;
        }
    }

    public final void a() {
        if (this.b) {
            sc8.j("This stopwatch is already running.");
        } else {
            this.b = true;
            this.d = this.a.a();
        }
    }

    public final String toString() {
        String str;
        long a = this.b ? (this.a.a() - this.d) + this.c : this.c;
        TimeUnit timeUnit = a / 86400000000000L > 0 ? TimeUnit.DAYS : a / 3600000000000L > 0 ? TimeUnit.HOURS : a / 60000000000L > 0 ? TimeUnit.MINUTES : a / 1000000000 > 0 ? TimeUnit.SECONDS : a / 1000000 > 0 ? TimeUnit.MILLISECONDS : a / 1000 > 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
        String format = String.format(Locale.ROOT, "%.4g", Double.valueOf(a / r2.convert(1L, timeUnit)));
        switch (bdd.a[timeUnit.ordinal()]) {
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
                wn4.f();
                return null;
        }
        return tb4.y(format, " ", str);
    }
}
