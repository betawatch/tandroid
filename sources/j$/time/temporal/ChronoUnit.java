package j$.time.temporal;

import j$.time.Duration;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
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
        Duration.k(1L);
        Duration.k(1000L);
        Duration.k(1000000L);
        Duration.j(1L, 0);
        Duration.j(60L, 0);
        Duration.j(3600L, 0);
        Duration.j(43200L, 0);
        Duration.j(86400L, 0);
        Duration.j(604800L, 0);
        Duration.j(2629746L, 0);
        Duration.j(31556952L, 0);
        Duration.j(315569520L, 0);
        Duration.j(3155695200L, 0);
        Duration.j(31556952000L, 0);
        Duration.j(31556952000000000L, 0);
        Duration.j(j$.time.a.N(Long.MAX_VALUE, j$.time.a.Q(999999999L, 1000000000L)), (int) j$.time.a.P(999999999L, 1000000000L));
    }

    ChronoUnit(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.q
    public long between(Temporal temporal, Temporal temporal2) {
        return temporal.g(temporal2, this);
    }

    @Override // j$.time.temporal.q
    public final Temporal j(Temporal temporal, long j) {
        return temporal.d(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
