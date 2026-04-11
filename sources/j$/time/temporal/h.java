package j$.time.temporal;

/* loaded from: classes2.dex */
enum h implements s {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");

    private final String a;

    static {
        j$.time.e eVar = j$.time.e.c;
    }

    h(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.s
    public final Temporal k(Temporal temporal, long j) {
        int i = b.a[ordinal()];
        if (i == 1) {
            return temporal.d(j$.com.android.tools.r8.a.f(temporal.l(r0), j), i.c);
        }
        if (i == 2) {
            return temporal.e(j / 4, ChronoUnit.YEARS).e((j % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.s
    public final long between(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.f(temporal2, this);
        }
        int i = b.a[ordinal()];
        if (i == 1) {
            p pVar = i.c;
            return j$.com.android.tools.r8.a.m(temporal2.s(pVar), temporal.s(pVar));
        }
        if (i == 2) {
            return temporal.f(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
