package j$.time.temporal;

import j$.time.Duration;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes4.dex */
public enum h implements q {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");

    public final String a;

    static {
        Duration.j(31556952L, 0);
        Duration.j(7889238L, 0);
    }

    h(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.q
    public final long between(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.g(temporal2, this);
        }
        int i = b.a[ordinal()];
        if (i == 1) {
            g gVar = i.c;
            return j$.time.a.S(temporal2.y(gVar), temporal.y(gVar));
        }
        if (i == 2) {
            return temporal.g(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.q
    public final Temporal j(Temporal temporal, long j) {
        int i = b.a[ordinal()];
        if (i == 1) {
            return temporal.c(j$.time.a.N(temporal.j(r4), j), i.c);
        }
        if (i == 2) {
            return temporal.d(j / 4, ChronoUnit.YEARS).d((j % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
