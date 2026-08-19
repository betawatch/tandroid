package j$.time.temporal;

/* loaded from: classes2.dex */
public enum j implements o {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient s b;
    public final transient long c;

    @Override // j$.time.temporal.o
    public final boolean u() {
        return true;
    }

    static {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
    }

    j(String str, long j) {
        this.a = str;
        this.b = s.e((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    @Override // j$.time.temporal.o
    public final s l() {
        return this.b;
    }

    @Override // j$.time.temporal.o
    public final boolean p(l lVar) {
        return lVar.h(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.o
    public final s r(l lVar) {
        if (lVar.h(a.EPOCH_DAY)) {
            return this.b;
        }
        throw new j$.time.b("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.o
    public final long o(l lVar) {
        return lVar.u(a.EPOCH_DAY) + this.c;
    }

    @Override // j$.time.temporal.o
    public final Temporal q(Temporal temporal, long j) {
        if (!this.b.d(j)) {
            throw new j$.time.b("Invalid value: " + this.a + " " + j);
        }
        return temporal.e(j$.com.android.tools.r8.a.U(j, this.c), a.EPOCH_DAY);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
