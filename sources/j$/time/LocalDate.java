package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes2.dex */
public final class LocalDate implements Temporal, j$.time.temporal.m, j$.time.chrono.b, Serializable {
    public static final LocalDate d = of(-999999999, 1, 1);
    public static final LocalDate e = of(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        of(1970, 1, 1);
    }

    public static LocalDate now() {
        ZoneId systemDefault = ZoneId.systemDefault();
        Objects.requireNonNull(new a(systemDefault), "clock");
        Instant ofEpochMilli = Instant.ofEpochMilli(System.currentTimeMillis());
        Objects.requireNonNull(ofEpochMilli, "instant");
        Objects.requireNonNull(systemDefault, "zone");
        return R(j$.com.android.tools.r8.a.S(ofEpochMilli.a + systemDefault.getRules().getOffset(ofEpochMilli).getTotalSeconds(), 86400));
    }

    public static LocalDate of(int i10, int i11, int i12) {
        j$.time.temporal.a.YEAR.w(i10);
        j$.time.temporal.a.MONTH_OF_YEAR.w(i11);
        j$.time.temporal.a.DAY_OF_MONTH.w(i12);
        return H(i10, i11, i12);
    }

    public static LocalDate R(long j10) {
        long j11;
        j$.time.temporal.a.EPOCH_DAY.w(j10);
        long j12 = 719468 + j10;
        if (j12 < 0) {
            long j13 = ((j10 + 719469) / 146097) - 1;
            j11 = j13 * 400;
            j12 += (-j13) * 146097;
        } else {
            j11 = 0;
        }
        long j14 = ((j12 * 400) + 591) / 146097;
        long j15 = j12 - ((j14 / 400) + (((j14 / 4) + (j14 * 365)) - (j14 / 100)));
        if (j15 < 0) {
            j14--;
            j15 = j12 - ((j14 / 400) + (((j14 / 4) + (365 * j14)) - (j14 / 100)));
        }
        int i10 = (int) j15;
        int i11 = ((i10 * 5) + 2) / 153;
        int i12 = ((i11 + 2) % 12) + 1;
        int i13 = (i10 - (((i11 * 306) + 5) / 10)) + 1;
        long j16 = j14 + j11 + (i11 / 10);
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new LocalDate(aVar.b.a(j16, aVar), i12, i13);
    }

    public static LocalDate I(j$.time.temporal.l lVar) {
        Objects.requireNonNull(lVar, "temporal");
        LocalDate localDate = (LocalDate) lVar.m(j$.time.temporal.p.f);
        if (localDate != null) {
            return localDate;
        }
        throw new b("Unable to obtain LocalDate from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName());
    }

    public static LocalDate H(int i10, int i11, int i12) {
        int i13 = 28;
        if (i12 > 28) {
            if (i11 != 2) {
                i13 = (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.r.c.getClass();
                if (j$.time.chrono.r.k(i10)) {
                    i13 = 29;
                }
            }
            if (i12 > i13) {
                if (i12 == 29) {
                    throw new b("Invalid date 'February 29' as '" + i10 + "' is not a leap year");
                }
                throw new b("Invalid date '" + j.J(i11).name() + " " + i12 + "'");
            }
        }
        return new LocalDate(i10, i11, i12);
    }

    public static LocalDate V(int i10, int i11, int i12) {
        if (i11 == 2) {
            j$.time.chrono.r.c.getClass();
            i12 = Math.min(i12, j$.time.chrono.r.k((long) i10) ? 29 : 28);
        } else if (i11 == 4 || i11 == 6 || i11 == 9 || i11 == 11) {
            i12 = Math.min(i12, 30);
        }
        return new LocalDate(i10, i11, i12);
    }

    public LocalDate(int i10, int i11, int i12) {
        this.a = i10;
        this.b = (short) i11;
        this.c = (short) i12;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        return j$.com.android.tools.r8.a.q(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.k(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        if (!aVar.isDateBased()) {
            throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
        }
        int i10 = e.a[aVar.ordinal()];
        if (i10 == 1) {
            return j$.time.temporal.s.e(1L, P());
        }
        if (i10 == 2) {
            return j$.time.temporal.s.e(1L, O() ? 366 : 365);
        }
        if (i10 != 3) {
            return i10 != 4 ? aVar.b : getYear() <= 0 ? j$.time.temporal.s.e(1L, 1000000000L) : j$.time.temporal.s.e(1L, 999999999L);
        }
        return j$.time.temporal.s.e(1L, (j.J(this.b) != j.FEBRUARY || O()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return J(oVar);
        }
        return j$.time.temporal.p.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar == j$.time.temporal.a.EPOCH_DAY) {
                return z();
            }
            if (oVar == j$.time.temporal.a.PROLEPTIC_MONTH) {
                return M();
            }
            return J(oVar);
        }
        return oVar.m(this);
    }

    public final int J(j$.time.temporal.o oVar) {
        switch (e.a[((j$.time.temporal.a) oVar).ordinal()]) {
            case 1:
                return this.c;
            case 2:
                return L();
            case 3:
                return ((this.c - 1) / 7) + 1;
            case 4:
                int i10 = this.a;
                return i10 >= 1 ? i10 : 1 - i10;
            case 5:
                return K().getValue();
            case 6:
                return ((this.c - 1) % 7) + 1;
            case 7:
                return ((L() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.r("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((L() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.r("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.a;
            case 13:
                return this.a >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
        }
    }

    public final long M() {
        return ((this.a * 12) + this.b) - 1;
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.k a() {
        return j$.time.chrono.r.c;
    }

    public int getYear() {
        return this.a;
    }

    public final int L() {
        return (j.J(this.b).G(O()) + this.c) - 1;
    }

    public final DayOfWeek K() {
        return DayOfWeek.G(((int) j$.com.android.tools.r8.a.R(z() + 3, 7)) + 1);
    }

    public final boolean O() {
        j$.time.chrono.r rVar = j$.time.chrono.r.c;
        long j10 = this.a;
        rVar.getClass();
        return j$.time.chrono.r.k(j10);
    }

    public final int P() {
        short s10 = this.b;
        return s10 != 2 ? (s10 == 4 || s10 == 6 || s10 == 9 || s10 == 11) ? 30 : 31 : O() ? 29 : 28;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        return c.b(localDate) ? localDate : (LocalDate) localDate.q(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final LocalDate c(long j10, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (LocalDate) oVar.q(this, j10);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        aVar.w(j10);
        switch (e.a[aVar.ordinal()]) {
            case 1:
                int i10 = (int) j10;
                if (this.c != i10) {
                    return of(this.a, this.b, i10);
                }
                return this;
            case 2:
                return X((int) j10);
            case 3:
                return plusDays(j$.com.android.tools.r8.a.T(j10 - y(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7));
            case 4:
                if (this.a < 1) {
                    j10 = 1 - j10;
                }
                return Y((int) j10);
            case 5:
                return plusDays(j10 - K().getValue());
            case 6:
                return plusDays(j10 - y(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return plusDays(j10 - y(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return R(j10);
            case 9:
                return plusDays(j$.com.android.tools.r8.a.T(j10 - y(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7));
            case 10:
                int i11 = (int) j10;
                if (this.b != i11) {
                    j$.time.temporal.a.MONTH_OF_YEAR.w(i11);
                    return V(this.a, i11, this.c);
                }
                return this;
            case 11:
                return T(j10 - M());
            case 12:
                return Y((int) j10);
            case 13:
                if (y(j$.time.temporal.a.ERA) != j10) {
                    return Y(1 - this.a);
                }
                return this;
            default:
                throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
        }
    }

    public final LocalDate Y(int i10) {
        if (this.a == i10) {
            return this;
        }
        j$.time.temporal.a.YEAR.w(i10);
        return V(i10, this.b, this.c);
    }

    public final LocalDate X(int i10) {
        if (L() == i10) {
            return this;
        }
        int i11 = this.a;
        long j10 = i11;
        j$.time.temporal.a.YEAR.w(j10);
        j$.time.temporal.a.DAY_OF_YEAR.w(i10);
        j$.time.chrono.r.c.getClass();
        boolean k10 = j$.time.chrono.r.k(j10);
        if (i10 == 366 && !k10) {
            throw new b("Invalid date 'DayOfYear 366' as '" + i11 + "' is not a leap year");
        }
        j J = j.J(((i10 - 1) / 31) + 1);
        if (i10 > (J.H(k10) + J.G(k10)) - 1) {
            J = j.a[((((int) 1) + 12) + J.ordinal()) % 12];
        }
        return new LocalDate(i11, J.getValue(), (i10 - J.G(k10)) + 1);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final LocalDate d(long j10, j$.time.temporal.q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (LocalDate) qVar.j(this, j10);
        }
        switch (e.b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return plusDays(j10);
            case 2:
                return plusDays(j$.com.android.tools.r8.a.T(j10, 7));
            case 3:
                return T(j10);
            case 4:
                return U(j10);
            case 5:
                return U(j$.com.android.tools.r8.a.T(j10, 10));
            case 6:
                return U(j$.com.android.tools.r8.a.T(j10, 100));
            case 7:
                return U(j$.com.android.tools.r8.a.T(j10, MediaDataController.MAX_STYLE_RUNS_COUNT));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(j$.com.android.tools.r8.a.O(y(aVar), j10), aVar);
            default:
                throw new j$.time.temporal.r("Unsupported unit: " + qVar);
        }
    }

    public final LocalDate U(long j10) {
        if (j10 == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return V(aVar.b.a(this.a + j10, aVar), this.b, this.c);
    }

    public final LocalDate T(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = (this.a * 12) + (this.b - 1) + j10;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j12 = 12;
        return V(aVar.b.a(j$.com.android.tools.r8.a.S(j11, j12), aVar), ((int) j$.com.android.tools.r8.a.R(j11, j12)) + 1, this.c);
    }

    public LocalDate plusDays(long j10) {
        if (j10 == 0) {
            return this;
        }
        long j11 = this.c + j10;
        if (j11 > 0) {
            if (j11 <= 28) {
                return new LocalDate(this.a, this.b, (int) j11);
            }
            if (j11 <= 59) {
                long P = P();
                if (j11 <= P) {
                    return new LocalDate(this.a, this.b, (int) j11);
                }
                short s10 = this.b;
                if (s10 < 12) {
                    return new LocalDate(this.a, s10 + 1, (int) (j11 - P));
                }
                j$.time.temporal.a.YEAR.w(this.a + 1);
                return new LocalDate(this.a + 1, 1, (int) (j11 - P));
            }
        }
        return R(j$.com.android.tools.r8.a.O(z(), j10));
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.b t(long j10, j$.time.temporal.q qVar) {
        return d(-1L, qVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal w(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j10, chronoUnit);
    }

    @Override // j$.time.temporal.l
    public final Object m(j$.time.format.a aVar) {
        return aVar == j$.time.temporal.p.f ? this : j$.com.android.tools.r8.a.s(this, aVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal q(Temporal temporal) {
        return j$.com.android.tools.r8.a.a(this, temporal);
    }

    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        LocalDate I = I(temporal);
        if (!(qVar instanceof ChronoUnit)) {
            return qVar.between(this, I);
        }
        switch (e.b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return I.z() - z();
            case 2:
                return (I.z() - z()) / 7;
            case 3:
                return Q(I);
            case 4:
                return Q(I) / 12;
            case 5:
                return Q(I) / 120;
            case 6:
                return Q(I) / 1200;
            case 7:
                return Q(I) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return I.y(aVar) - y(aVar);
            default:
                throw new j$.time.temporal.r("Unsupported unit: " + qVar);
        }
    }

    public final long Q(LocalDate localDate) {
        return (((localDate.M() * 32) + localDate.c) - ((M() * 32) + this.c)) / 32;
    }

    @Override // j$.time.chrono.b
    public final ChronoLocalDateTime A(h hVar) {
        return LocalDateTime.J(this, hVar);
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.J(this, h.g);
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        j$.time.zone.b e9;
        Objects.requireNonNull(zoneId, "zone");
        LocalDateTime J = LocalDateTime.J(this, h.g);
        if (!(zoneId instanceof ZoneOffset) && (e9 = zoneId.getRules().e(J)) != null && e9.j()) {
            J = e9.b.M(e9.d.getTotalSeconds() - e9.c.getTotalSeconds());
        }
        return ZonedDateTime.H(J, zoneId, null);
    }

    @Override // j$.time.chrono.b
    public final long z() {
        long j10 = this.a;
        long j11 = this.b;
        long j12 = 365 * j10;
        long j13 = (((367 * j11) - 362) / 12) + (j10 >= 0 ? ((j10 + 399) / 400) + (((3 + j10) / 4) - ((99 + j10) / 100)) + j12 : j12 - ((j10 / (-400)) + ((j10 / (-4)) - (j10 / (-100))))) + (this.c - 1);
        if (j11 > 2) {
            j13 = !O() ? j13 - 2 : j13 - 1;
        }
        return j13 - 719528;
    }

    @Override // java.lang.Comparable
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.b bVar) {
        if (bVar instanceof LocalDate) {
            return G((LocalDate) bVar);
        }
        return j$.com.android.tools.r8.a.e(this, bVar);
    }

    public final int G(LocalDate localDate) {
        int i10 = this.a - localDate.a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.b - localDate.b;
        return i11 == 0 ? this.c - localDate.c : i11;
    }

    public final boolean N(j$.time.chrono.b bVar) {
        return bVar instanceof LocalDate ? G((LocalDate) bVar) < 0 : z() < bVar.z();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && G((LocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public final int hashCode() {
        int i10 = this.a;
        return (((i10 << 11) + (this.b << 6)) + this.c) ^ (i10 & (-2048));
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        int i10 = this.a;
        short s10 = this.b;
        short s11 = this.c;
        int abs = Math.abs(i10);
        StringBuilder sb2 = new StringBuilder(10);
        if (abs >= 1000) {
            if (i10 > 9999) {
                sb2.append('+');
            }
            sb2.append(i10);
        } else if (i10 < 0) {
            sb2.append(i10 - 10000);
            sb2.deleteCharAt(1);
        } else {
            sb2.append(i10 + 10000);
            sb2.deleteCharAt(0);
        }
        sb2.append(s10 < 10 ? "-0" : "-");
        sb2.append((int) s10);
        sb2.append(s11 < 10 ? "-0" : "-");
        sb2.append((int) s11);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new p((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
