package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes2.dex */
public final class LocalDate implements Temporal, j$.time.temporal.m, j$.time.chrono.b, Serializable {
    public static final LocalDate d = of(-999999999, 1, 1);
    public static final LocalDate e = of(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    @Override // j$.time.chrono.b
    public final j$.time.chrono.b D(long j, j$.time.temporal.q qVar) {
        return f(-1L, (ChronoUnit) qVar);
    }

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

    public static LocalDate of(int i, int i2, int i3) {
        j$.time.temporal.a.YEAR.x(i);
        j$.time.temporal.a.MONTH_OF_YEAR.x(i2);
        j$.time.temporal.a.DAY_OF_MONTH.x(i3);
        return H(i, i2, i3);
    }

    public static LocalDate R(long j) {
        long j2;
        j$.time.temporal.a.EPOCH_DAY.x(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / NotificationCenter.messagePlayingGoingToStop;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * NotificationCenter.currentUserPremiumStatusChanged) + 5) / 10)) + 1;
        long j7 = j5 + j2 + (i2 / 10);
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return new LocalDate(aVar.b.a(j7, aVar), i3, i4);
    }

    public static LocalDate I(j$.time.temporal.l lVar) {
        Objects.requireNonNull(lVar, "temporal");
        LocalDate localDate = (LocalDate) lVar.r(j$.time.temporal.p.f);
        if (localDate != null) {
            return localDate;
        }
        throw new b("Unable to obtain LocalDate from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName());
    }

    public static LocalDate H(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.r.c.getClass();
                if (j$.time.chrono.r.o(i)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new b("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new b("Invalid date '" + j.J(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate V(int i, int i2, int i3) {
        if (i2 == 2) {
            j$.time.chrono.r.c.getClass();
            i3 = Math.min(i3, j$.time.chrono.r.o((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new LocalDate(i, i2, i3);
    }

    public LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    @Override // j$.time.temporal.l
    public final boolean h(j$.time.temporal.o oVar) {
        return j$.com.android.tools.r8.a.q(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s q(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.r(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        if (!aVar.u()) {
            throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
        }
        int i = e.a[aVar.ordinal()];
        if (i == 1) {
            return j$.time.temporal.s.e(1L, P());
        }
        if (i == 2) {
            return j$.time.temporal.s.e(1L, O() ? 366 : 365);
        }
        if (i != 3) {
            return i != 4 ? ((j$.time.temporal.a) oVar).b : getYear() <= 0 ? j$.time.temporal.s.e(1L, 1000000000L) : j$.time.temporal.s.e(1L, 999999999L);
        }
        return j$.time.temporal.s.e(1L, (j.J(this.b) != j.FEBRUARY || O()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.l
    public final int o(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return J(oVar);
        }
        return j$.time.temporal.p.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final long u(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar == j$.time.temporal.a.EPOCH_DAY) {
                return v();
            }
            if (oVar == j$.time.temporal.a.PROLEPTIC_MONTH) {
                return M();
            }
            return J(oVar);
        }
        return oVar.o(this);
    }

    public final int J(j$.time.temporal.o oVar) {
        int i;
        int i2 = e.a[((j$.time.temporal.a) oVar).ordinal()];
        short s = this.c;
        int i3 = this.a;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return L();
            case 3:
                i = (s - 1) / 7;
                break;
            case 4:
                return i3 >= 1 ? i3 : 1 - i3;
            case 5:
                return K().getValue();
            case 6:
                i = (s - 1) % 7;
                break;
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
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
        }
        return i + 1;
    }

    public final long M() {
        return ((this.a * 12) + this.b) - 1;
    }

    @Override // j$.time.chrono.b
    public final j$.time.chrono.k b() {
        return j$.time.chrono.r.c;
    }

    public int getYear() {
        return this.a;
    }

    public final int L() {
        return (j.J(this.b).E(O()) + this.c) - 1;
    }

    public final DayOfWeek K() {
        return DayOfWeek.E(((int) j$.com.android.tools.r8.a.R(v() + 3, 7)) + 1);
    }

    public final boolean O() {
        j$.time.chrono.r rVar = j$.time.chrono.r.c;
        long j = this.a;
        rVar.getClass();
        return j$.time.chrono.r.o(j);
    }

    public final int P() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : O() ? 29 : 28;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal p(LocalDate localDate) {
        return c.b(localDate) ? localDate : (LocalDate) localDate.x(this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final LocalDate e(long j, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (LocalDate) oVar.q(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        aVar.x(j);
        int i = e.a[aVar.ordinal()];
        short s = this.c;
        short s2 = this.b;
        int i2 = this.a;
        switch (i) {
            case 1:
                int i3 = (int) j;
                if (s != i3) {
                    return of(i2, s2, i3);
                }
                return this;
            case 2:
                return X((int) j);
            case 3:
                return plusDays(j$.com.android.tools.r8.a.T(j - u(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7));
            case 4:
                if (i2 < 1) {
                    j = 1 - j;
                }
                return Y((int) j);
            case 5:
                return plusDays(j - K().getValue());
            case 6:
                return plusDays(j - u(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return plusDays(j - u(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return R(j);
            case 9:
                return plusDays(j$.com.android.tools.r8.a.T(j - u(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7));
            case 10:
                int i4 = (int) j;
                if (s2 != i4) {
                    j$.time.temporal.a.MONTH_OF_YEAR.x(i4);
                    return V(i2, i4, s);
                }
                return this;
            case 11:
                return T(j - M());
            case 12:
                return Y((int) j);
            case 13:
                if (u(j$.time.temporal.a.ERA) != j) {
                    return Y(1 - i2);
                }
                return this;
            default:
                throw new j$.time.temporal.r(c.a("Unsupported field: ", oVar));
        }
    }

    public final LocalDate Y(int i) {
        if (this.a == i) {
            return this;
        }
        j$.time.temporal.a.YEAR.x(i);
        return V(i, this.b, this.c);
    }

    public final LocalDate X(int i) {
        if (L() == i) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int i2 = this.a;
        long j = i2;
        aVar.x(j);
        j$.time.temporal.a.DAY_OF_YEAR.x(i);
        j$.time.chrono.r.c.getClass();
        boolean o = j$.time.chrono.r.o(j);
        if (i == 366 && !o) {
            throw new b("Invalid date 'DayOfYear 366' as '" + i2 + "' is not a leap year");
        }
        j J = j.J(((i - 1) / 31) + 1);
        if (i > (J.H(o) + J.E(o)) - 1) {
            J = j.a[((((int) 1) + 12) + J.ordinal()) % 12];
        }
        return new LocalDate(i2, J.getValue(), (i - J.E(o)) + 1);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final LocalDate f(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (LocalDate) qVar.l(this, j);
        }
        switch (e.b[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return plusDays(j);
            case 2:
                return plusDays(j$.com.android.tools.r8.a.T(j, 7));
            case 3:
                return T(j);
            case 4:
                return U(j);
            case 5:
                return U(j$.com.android.tools.r8.a.T(j, 10));
            case 6:
                return U(j$.com.android.tools.r8.a.T(j, 100));
            case 7:
                return U(j$.com.android.tools.r8.a.T(j, MediaDataController.MAX_STYLE_RUNS_COUNT));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return e(j$.com.android.tools.r8.a.O(u(aVar), j), aVar);
            default:
                throw new j$.time.temporal.r("Unsupported unit: " + qVar);
        }
    }

    public final LocalDate U(long j) {
        if (j == 0) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        return V(aVar.b.a(this.a + j, aVar), this.b, this.c);
    }

    public final LocalDate T(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        long j3 = 12;
        return V(aVar.b.a(j$.com.android.tools.r8.a.S(j2, j3), aVar), ((int) j$.com.android.tools.r8.a.R(j2, j3)) + 1, this.c);
    }

    public LocalDate plusDays(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = this.c + j;
        if (j2 > 0) {
            short s = this.b;
            int i = this.a;
            if (j2 <= 28) {
                return new LocalDate(i, s, (int) j2);
            }
            if (j2 <= 59) {
                long P = P();
                if (j2 <= P) {
                    return new LocalDate(i, s, (int) j2);
                }
                if (s < 12) {
                    return new LocalDate(i, s + 1, (int) (j2 - P));
                }
                int i2 = i + 1;
                j$.time.temporal.a.YEAR.x(i2);
                return new LocalDate(i2, 1, (int) (j2 - P));
            }
        }
        return R(j$.com.android.tools.r8.a.O(v(), j));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? f(Long.MAX_VALUE, chronoUnit).f(1L, chronoUnit) : f(-j, chronoUnit);
    }

    @Override // j$.time.temporal.l
    public final Object r(j$.time.format.a aVar) {
        return aVar == j$.time.temporal.p.f ? this : j$.com.android.tools.r8.a.s(this, aVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal x(Temporal temporal) {
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
                return I.v() - v();
            case 2:
                return (I.v() - v()) / 7;
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
                return I.u(aVar) - u(aVar);
            default:
                throw new j$.time.temporal.r("Unsupported unit: " + qVar);
        }
    }

    public final long Q(LocalDate localDate) {
        return (((localDate.M() * 32) + localDate.c) - ((M() * 32) + this.c)) / 32;
    }

    @Override // j$.time.chrono.b
    public final ChronoLocalDateTime w(h hVar) {
        return LocalDateTime.J(this, hVar);
    }

    public LocalDateTime atStartOfDay() {
        return LocalDateTime.J(this, h.g);
    }

    public ZonedDateTime atStartOfDay(ZoneId zoneId) {
        j$.time.zone.b e2;
        Objects.requireNonNull(zoneId, "zone");
        LocalDateTime J = LocalDateTime.J(this, h.g);
        if (!(zoneId instanceof ZoneOffset) && (e2 = zoneId.getRules().e(J)) != null && e2.l()) {
            J = e2.b.M(e2.d.getTotalSeconds() - e2.c.getTotalSeconds());
        }
        return ZonedDateTime.H(J, zoneId, null);
    }

    @Override // j$.time.chrono.b
    public final long v() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (this.c - 1);
        if (j2 > 2) {
            j4 = !O() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    @Override // java.lang.Comparable
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.time.chrono.b bVar) {
        if (bVar instanceof LocalDate) {
            return E((LocalDate) bVar);
        }
        return j$.com.android.tools.r8.a.e(this, bVar);
    }

    public final int E(LocalDate localDate) {
        int i = this.a - localDate.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - localDate.b;
        return i2 == 0 ? this.c - localDate.c : i2;
    }

    public final boolean N(j$.time.chrono.b bVar) {
        return bVar instanceof LocalDate ? E((LocalDate) bVar) < 0 : v() < bVar.v();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && E((LocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        int i = this.a;
        int abs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (abs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        short s = this.b;
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        short s2 = this.c;
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    private Object writeReplace() {
        return new p((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
