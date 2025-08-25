package j$.time.temporal;

/* loaded from: classes2.dex */
enum i implements u {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");

    private final String a;

    static {
        j$.time.e eVar = j$.time.e.c;
    }

    i(String str) {
        this.a = str;
    }

    @Override // j$.time.temporal.u
    public final m i(m mVar, long j) {
        int i = c.a[ordinal()];
        if (i == 1) {
            return mVar.d(j$.com.android.tools.r8.a.f(mVar.j(r0), j), j.c);
        }
        if (i == 2) {
            return mVar.e(j / 4, b.YEARS).e((j % 4) * 3, b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
