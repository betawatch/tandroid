package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class LocalDateTime implements Temporal, j$.time.temporal.m, ChronoLocalDateTime<LocalDate>, Serializable {
    public static final LocalDateTime c = J(LocalDate.d, h.e);
    public static final LocalDateTime d = J(LocalDate.e, h.f);
    private static final long serialVersionUID = 6207766400415563566L;
    public final LocalDate a;
    public final h b;

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return j$.com.android.tools.r8.a.w(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ Instant toInstant(ZoneOffset zoneOffset) {
        return j$.com.android.tools.r8.a.y(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.k b() {
        return ((LocalDate) d()).b();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime t(ZoneOffset zoneOffset) {
        return ZonedDateTime.H(this, zoneOffset, null);
    }

    public static LocalDateTime J(LocalDate localDate, h hVar) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(hVar, "time");
        return new LocalDateTime(localDate, hVar);
    }

    @Override // j$.time.temporal.m
    public final Temporal x(Temporal temporal) {
        return temporal.e(((LocalDate) d()).v(), j$.time.temporal.a.EPOCH_DAY).e(c().R(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public static LocalDateTime K(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.x(j2);
        return new LocalDateTime(LocalDate.R(j$.com.android.tools.r8.a.S(j + zoneOffset.getTotalSeconds(), 86400)), h.K((((int) j$.com.android.tools.r8.a.R(r5, r7)) * 1000000000) + j2));
    }

    public static LocalDateTime H(Temporal temporal) {
        if (temporal instanceof LocalDateTime) {
            return (LocalDateTime) temporal;
        }
        if (temporal instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporal).B();
        }
        if (temporal instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporal).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.I(temporal), h.I(temporal));
        } catch (b e) {
            throw new b("Unable to obtain LocalDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
        }
    }

    public LocalDateTime(LocalDate localDate, h hVar) {
        this.a = localDate;
        this.b = hVar;
    }

    public final LocalDateTime Q(LocalDate localDate, h hVar) {
        return (this.a == localDate && this.b == hVar) ? this : new LocalDateTime(localDate, hVar);
    }

    @Override // j$.time.temporal.l
    public final boolean h(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar != null && oVar.p(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        return aVar.u() || aVar.E();
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s q(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) oVar).E()) {
                h hVar = this.b;
                hVar.getClass();
                return j$.time.temporal.p.d(hVar, oVar);
            }
            return this.a.q(oVar);
        }
        return oVar.r(this);
    }

    @Override // j$.time.temporal.l
    public final int o(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) oVar).E() ? this.b.o(oVar) : this.a.o(oVar);
        }
        return j$.time.temporal.p.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final long u(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) oVar).E() ? this.b.u(oVar) : this.a.u(oVar);
        }
        return oVar.o(this);
    }

    public final int E(LocalDateTime localDateTime) {
        int E = this.a.E(localDateTime.a);
        return E == 0 ? this.b.compareTo(localDateTime.b) : E;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.b d() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final h c() {
        return this.b;
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime p(LocalDate localDate) {
        if (c.b(localDate)) {
            return Q(localDate, this.b);
        }
        localDate.getClass();
        return (LocalDateTime) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime e(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            boolean E = ((j$.time.temporal.a) oVar).E();
            h hVar = this.b;
            LocalDate localDate = this.a;
            if (E) {
                return Q(localDate, hVar.e(j, oVar));
            }
            return Q(localDate.e(j, oVar), hVar);
        }
        return (LocalDateTime) oVar.q(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime f(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof ChronoUnit) {
            int i = f.a[((ChronoUnit) qVar).ordinal()];
            h hVar = this.b;
            LocalDate localDate = this.a;
            switch (i) {
                case 1:
                    return N(this.a, 0L, 0L, 0L, j);
                case 2:
                    LocalDateTime Q = Q(localDate.plusDays(j / 86400000000L), hVar);
                    return Q.N(Q.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    LocalDateTime Q2 = Q(localDate.plusDays(j / 86400000), hVar);
                    return Q2.N(Q2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return M(j);
                case 5:
                    return N(this.a, 0L, j, 0L, 0L);
                case 6:
                    return N(this.a, j, 0L, 0L, 0L);
                case 7:
                    LocalDateTime Q3 = Q(localDate.plusDays(j / 256), hVar);
                    return Q3.N(Q3.a, (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return Q(localDate.f(j, qVar), hVar);
            }
        }
        return (LocalDateTime) qVar.l(this, j);
    }

    public final LocalDateTime M(long j) {
        return N(this.a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? f(Long.MAX_VALUE, chronoUnit).f(1L, chronoUnit) : f(-j, chronoUnit);
    }

    public final LocalDateTime N(LocalDate localDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        h hVar = this.b;
        if (j5 == 0) {
            return Q(localDate, hVar);
        }
        long j6 = j / 24;
        long j7 = j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j8 = 1;
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long R = hVar.R();
        long j10 = (j9 * j8) + R;
        long S = j$.com.android.tools.r8.a.S(j10, 86400000000000L) + (j7 * j8);
        long R2 = j$.com.android.tools.r8.a.R(j10, 86400000000000L);
        if (R2 != R) {
            hVar = h.K(R2);
        }
        return Q(localDate.plusDays(S), hVar);
    }

    @Override // j$.time.temporal.l
    public final Object r(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.p.f) {
            return this.a;
        }
        return j$.com.android.tools.r8.a.t(this, aVar);
    }

    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        LocalDate localDate;
        long j;
        long j2;
        LocalDateTime H = H(temporal);
        if (!(qVar instanceof ChronoUnit)) {
            return qVar.between(this, H);
        }
        boolean z = ((ChronoUnit) qVar).compareTo(ChronoUnit.DAYS) < 0;
        h hVar = this.b;
        LocalDate localDate2 = this.a;
        if (!z) {
            LocalDate localDate3 = H.a;
            localDate3.getClass();
            boolean z2 = localDate2 != null;
            h hVar2 = H.b;
            if (!z2 ? localDate3.v() > localDate2.v() : localDate3.E(localDate2) > 0) {
                if (hVar2.compareTo(hVar) < 0) {
                    localDate = localDate3.plusDays(-1L);
                    return localDate2.g(localDate, qVar);
                }
            }
            boolean N = localDate3.N(localDate2);
            localDate = localDate3;
            if (N) {
                localDate = localDate3;
                if (hVar2.compareTo(hVar) > 0) {
                    localDate = localDate3.plusDays(1L);
                }
            }
            return localDate2.g(localDate, qVar);
        }
        LocalDate localDate4 = H.a;
        localDate2.getClass();
        long v = localDate4.v() - localDate2.v();
        h hVar3 = H.b;
        if (v == 0) {
            return hVar.g(hVar3, qVar);
        }
        long R = hVar3.R() - hVar.R();
        if (v > 0) {
            j = v - 1;
            j2 = R + 86400000000000L;
        } else {
            j = v + 1;
            j2 = R - 86400000000000L;
        }
        switch (f.a[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                j = j$.com.android.tools.r8.a.T(j, 86400000000000L);
                break;
            case 2:
                j = j$.com.android.tools.r8.a.T(j, 86400000000L);
                j2 /= 1000;
                break;
            case 3:
                j = j$.com.android.tools.r8.a.T(j, 86400000L);
                j2 /= 1000000;
                break;
            case 4:
                j = j$.com.android.tools.r8.a.T(j, 86400);
                j2 /= 1000000000;
                break;
            case 5:
                j = j$.com.android.tools.r8.a.T(j, 1440);
                j2 /= 60000000000L;
                break;
            case 6:
                j = j$.com.android.tools.r8.a.T(j, 24);
                j2 /= 3600000000000L;
                break;
            case 7:
                j = j$.com.android.tools.r8.a.T(j, 2);
                j2 /= 43200000000000L;
                break;
        }
        return j$.com.android.tools.r8.a.O(j, j2);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return E((LocalDateTime) chronoLocalDateTime);
        }
        return j$.com.android.tools.r8.a.f(this, chronoLocalDateTime);
    }

    public final boolean I(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return E((LocalDateTime) chronoLocalDateTime) < 0;
        }
        long v = this.a.v();
        long v2 = chronoLocalDateTime.d().v();
        if (v >= v2) {
            return v == v2 && this.b.R() < chronoLocalDateTime.c().R();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    private Object writeReplace() {
        return new p((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
