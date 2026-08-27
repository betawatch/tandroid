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
    public final boolean isDateBased() {
        return true;
    }

    static {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
    }

    j(String str, long j10) {
        this.a = str;
        this.b = s.e((-365243219162L) + j10, 365241780471L + j10);
        this.c = j10;
    }

    @Override // j$.time.temporal.o
    public final s l() {
        return this.b;
    }

    @Override // j$.time.temporal.o
    public final Temporal q(Temporal temporal, long j10) {
        if (!this.b.d(j10)) {
            throw new j$.time.b("Invalid value: " + this.a + " " + j10);
        }
        return temporal.c(j$.com.android.tools.r8.a.U(j10, this.c), a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.o
    public final boolean j(l lVar) {
        return lVar.e(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.o
    public final s k(l lVar) {
        if (lVar.e(a.EPOCH_DAY)) {
            return this.b;
        }
        throw new j$.time.b("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.o
    public final long m(l lVar) {
        return lVar.y(a.EPOCH_DAY) + this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
