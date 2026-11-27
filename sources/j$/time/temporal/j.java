package j$.time.temporal;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public enum j implements o {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient s b;
    public final transient int c;

    static {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
    }

    j(String str, long j) {
        this.a = str;
        this.b = s.e((-365243219162L) + j, 365241780471L + j);
        this.c = (int) j;
    }

    @Override // j$.time.temporal.o
    public final boolean isDateBased() {
        return true;
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
        j$.time.g.i(this, "Unsupported field: ");
        return null;
    }

    @Override // j$.time.temporal.o
    public final long l(l lVar) {
        return lVar.y(a.EPOCH_DAY) + this.c;
    }

    @Override // j$.time.temporal.o
    public final Temporal n(Temporal temporal, long j) {
        if (this.b.d(j)) {
            return temporal.c(j$.time.a.S(j, this.c), a.EPOCH_DAY);
        }
        throw new j$.time.c("Invalid value: " + this.a + " " + j);
    }

    @Override // j$.time.temporal.o
    public final s range() {
        return this.b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
