package j$.time.temporal;

/* loaded from: classes2.dex */
public enum ChronoUnit implements s {
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

    private final String a;

    static {
        j$.time.e eVar = j$.time.e.c;
        j$.time.e.o(Long.MAX_VALUE, 999999999L);
    }

    ChronoUnit(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.s
    public final Temporal k(Temporal temporal, long j) {
        return temporal.e(j, this);
    }

    @Override // j$.time.temporal.s
    public long between(Temporal temporal, Temporal temporal2) {
        return temporal.f(temporal2, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
