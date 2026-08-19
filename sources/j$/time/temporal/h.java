package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes2.dex */
public enum h implements q {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");

    public final String a;

    static {
        Duration duration = Duration.c;
    }

    h(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.q
    public final Temporal l(Temporal temporal, long j) {
        int i = b.a[ordinal()];
        if (i == 1) {
            return temporal.e(j$.com.android.tools.r8.a.O(temporal.o(r0), j), i.c);
        }
        if (i == 2) {
            return temporal.f(j / 4, ChronoUnit.YEARS).f((j % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.q
    public final long between(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.g(temporal2, this);
        }
        int i = b.a[ordinal()];
        if (i == 1) {
            g gVar = i.c;
            return j$.com.android.tools.r8.a.U(temporal2.u(gVar), temporal.u(gVar));
        }
        if (i == 2) {
            return temporal.g(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
