package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes2.dex */
public enum ChronoUnit implements q {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");

    public final String a;

    static {
        Duration duration = Duration.c;
        Duration.l(j$.com.android.tools.r8.a.O(Long.MAX_VALUE, j$.com.android.tools.r8.a.S(999999999L, 1000000000L)), (int) j$.com.android.tools.r8.a.R(999999999L, 1000000000L));
    }

    ChronoUnit(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.q
    public final Temporal l(Temporal temporal, long j) {
        return temporal.f(j, this);
    }

    @Override // j$.time.temporal.q
    public long between(Temporal temporal, Temporal temporal2) {
        return temporal.g(temporal2, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
