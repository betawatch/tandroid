package j$.time.temporal;

/* loaded from: classes2.dex */
public enum a implements p {
    NANO_OF_SECOND("NanoOfSecond", u.j(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", u.j(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", u.j(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", u.j(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", u.j(0, 999)),
    MILLI_OF_DAY("MilliOfDay", u.j(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", u.j(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", u.j(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", u.j(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", u.j(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", u.j(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", u.j(1, 12)),
    HOUR_OF_DAY("HourOfDay", u.j(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", u.j(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", u.j(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", u.j(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", u.j(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", u.j(1, 7)),
    DAY_OF_MONTH("DayOfMonth", u.k(28, 31), 0),
    DAY_OF_YEAR("DayOfYear", u.k(365, 366)),
    EPOCH_DAY("EpochDay", u.j(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", u.k(4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", u.j(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", u.j(1, 12), 0),
    PROLEPTIC_MONTH("ProlepticMonth", u.j(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", u.k(999999999, 1000000000)),
    YEAR("Year", u.j(-999999999, 999999999), 0),
    ERA("Era", u.j(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", u.j(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", u.j(-64800, 64800));

    private final String a;
    private final u b;

    static {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
    }

    a(String str, u uVar) {
        this.a = str;
        this.b = uVar;
    }

    a(String str, u uVar, int i) {
        this.a = str;
        this.b = uVar;
    }

    @Override // j$.time.temporal.p
    public final u k() {
        return this.b;
    }

    @Override // j$.time.temporal.p
    public final boolean v() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public final boolean H() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    public final void G(long j) {
        this.b.b(j, this);
    }

    public final int x(long j) {
        return this.b.a(j, this);
    }

    @Override // j$.time.temporal.p
    public final boolean n(m mVar) {
        return mVar.g(this);
    }

    @Override // j$.time.temporal.p
    public final u r(m mVar) {
        return mVar.o(this);
    }

    @Override // j$.time.temporal.p
    public final long l(m mVar) {
        return mVar.r(this);
    }

    @Override // j$.time.temporal.p
    public final Temporal o(Temporal temporal, long j) {
        return temporal.d(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
