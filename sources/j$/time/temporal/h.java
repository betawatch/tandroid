package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes2.dex */
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
    public final Temporal j(Temporal temporal, long j10) {
        int i9 = b.a[ordinal()];
        if (i9 == 1) {
            return temporal.c(j$.com.android.tools.r8.a.O(temporal.j(r0), j10), i.c);
        }
        if (i9 == 2) {
            return temporal.d(j10 / 4, ChronoUnit.YEARS).d((j10 % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.q
    public final long between(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.g(temporal2, this);
        }
        int i9 = b.a[ordinal()];
        if (i9 == 1) {
            g gVar = i.c;
            return j$.com.android.tools.r8.a.U(temporal2.y(gVar), temporal.y(gVar));
        }
        if (i9 == 2) {
            return temporal.g(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
