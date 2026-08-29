package j$.time.temporal;

/* loaded from: classes2.dex */
public enum a implements o {
    NANO_OF_SECOND("NanoOfSecond", s.e(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", s.e(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", s.e(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", s.e(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", s.e(0, 999)),
    MILLI_OF_DAY("MilliOfDay", s.e(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", s.e(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", s.e(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", s.e(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", s.e(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", s.e(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", s.e(1, 12)),
    HOUR_OF_DAY("HourOfDay", s.e(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", s.e(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", s.e(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", s.e(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", s.e(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", s.e(1, 7)),
    DAY_OF_MONTH("DayOfMonth", s.f(28, 31), 0),
    DAY_OF_YEAR("DayOfYear", s.f(365, 366)),
    EPOCH_DAY("EpochDay", s.e(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", s.f(4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", s.e(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", s.e(1, 12), 0),
    PROLEPTIC_MONTH("ProlepticMonth", s.e(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", s.f(999999999, 1000000000)),
    YEAR("Year", s.e(-999999999, 999999999), 0),
    ERA("Era", s.e(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", s.e(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", s.e(-64800, 64800));

    public final String a;
    public final s b;

    static {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
    }

    a(String str, s sVar) {
        this.a = str;
        this.b = sVar;
    }

    a(String str, s sVar, int i10) {
        this.a = str;
        this.b = sVar;
    }

    @Override // j$.time.temporal.o
    public final s l() {
        return this.b;
    }

    public final void w(long j10) {
        this.b.b(j10, this);
    }

    @Override // j$.time.temporal.o
    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public final boolean y() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // j$.time.temporal.o
    public final boolean j(l lVar) {
        return lVar.e(this);
    }

    @Override // j$.time.temporal.o
    public final s k(l lVar) {
        return lVar.l(this);
    }

    @Override // j$.time.temporal.o
    public final long m(l lVar) {
        return lVar.y(this);
    }

    @Override // j$.time.temporal.o
    public final Temporal q(Temporal temporal, long j10) {
        return temporal.c(j10, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
