package j$.time.temporal;

/* loaded from: classes2.dex */
enum j implements p {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;
    private final transient String a;
    private final transient u b;
    private final transient long c;

    @Override // j$.time.temporal.p
    public final boolean v() {
        return true;
    }

    static {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
    }

    j(String str, long j) {
        this.a = str;
        this.b = u.j((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    @Override // j$.time.temporal.p
    public final u k() {
        return this.b;
    }

    @Override // j$.time.temporal.p
    public final boolean n(m mVar) {
        return mVar.g(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.p
    public final u r(m mVar) {
        if (!mVar.g(a.EPOCH_DAY)) {
            throw new j$.time.c("Unsupported field: " + this);
        }
        return this.b;
    }

    @Override // j$.time.temporal.p
    public final long l(m mVar) {
        return mVar.r(a.EPOCH_DAY) + this.c;
    }

    @Override // j$.time.temporal.p
    public final Temporal o(Temporal temporal, long j) {
        if (!this.b.i(j)) {
            throw new j$.time.c("Invalid value: " + this.a + " " + j);
        }
        return temporal.d(j$.com.android.tools.r8.a.m(j, this.c), a.EPOCH_DAY);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
