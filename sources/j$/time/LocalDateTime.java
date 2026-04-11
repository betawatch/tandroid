package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class LocalDateTime implements Temporal, j$.time.temporal.n, ChronoLocalDateTime<LocalDate>, Serializable {
    public static final LocalDateTime c = Q(LocalDate.d, j.e);
    public static final LocalDateTime d = Q(LocalDate.e, j.f);
    private static final long serialVersionUID = 6207766400415563566L;
    private final LocalDate a;
    private final j b;

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ Instant toInstant(ZoneOffset zoneOffset) {
        return j$.time.chrono.h.p(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ long y(ZoneOffset zoneOffset) {
        return j$.time.chrono.h.n(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.b c() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.l a() {
        return ((LocalDate) c()).a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime p(ZoneOffset zoneOffset) {
        return ZonedDateTime.K(this, zoneOffset, null);
    }

    public static LocalDateTime P(int i) {
        return new LocalDateTime(LocalDate.of(i, 12, 31), j.P(0));
    }

    public static LocalDateTime Q(LocalDate localDate, j jVar) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(jVar, "time");
        return new LocalDateTime(localDate, jVar);
    }

    @Override // j$.time.temporal.n
    public final Temporal z(Temporal temporal) {
        return temporal.d(((LocalDate) c()).t(), j$.time.temporal.a.EPOCH_DAY).d(b().Y(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public static LocalDateTime R(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.I(j2);
        return new LocalDateTime(LocalDate.V(j$.com.android.tools.r8.a.k(j + zoneOffset.getTotalSeconds(), 86400)), j.Q((((int) j$.com.android.tools.r8.a.j(r5, r7)) * 1000000000) + j2));
    }

    public static LocalDateTime J(Temporal temporal) {
        if (temporal instanceof LocalDateTime) {
            return (LocalDateTime) temporal;
        }
        if (temporal instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporal).O();
        }
        if (temporal instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporal).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.K(temporal), j.K(temporal));
        } catch (c e) {
            throw new c("Unable to obtain LocalDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
        }
    }

    private LocalDateTime(LocalDate localDate, j jVar) {
        this.a = localDate;
        this.b = jVar;
    }

    private LocalDateTime Y(LocalDate localDate, j jVar) {
        return (this.a == localDate && this.b == jVar) ? this : new LocalDateTime(localDate, jVar);
    }

    @Override // j$.time.temporal.m
    public final boolean g(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar != null && pVar.n(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        return aVar.w() || aVar.J();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) pVar).J()) {
                j jVar = this.b;
                jVar.getClass();
                return j$.time.temporal.l.d(jVar, pVar);
            }
            return this.a.o(pVar);
        }
        return pVar.s(this);
    }

    @Override // j$.time.temporal.m
    public final int l(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).J() ? this.b.l(pVar) : this.a.l(pVar);
        }
        return j$.time.temporal.l.a(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final long s(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).J() ? this.b.s(pVar) : this.a.s(pVar);
        }
        return pVar.l(this);
    }

    private int I(LocalDateTime localDateTime) {
        int I = this.a.I(localDateTime.a);
        return I == 0 ? this.b.compareTo(localDateTime.b) : I;
    }

    public final LocalDate V() {
        return this.a;
    }

    public final int M() {
        return this.a.getYear();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j b() {
        return this.b;
    }

    public final int L() {
        return this.b.O();
    }

    public final int K() {
        return this.b.N();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime n(LocalDate localDate) {
        if (localDate instanceof LocalDate) {
            return Y(localDate, this.b);
        }
        localDate.getClass();
        return (LocalDateTime) j$.time.chrono.h.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            boolean J = ((j$.time.temporal.a) pVar).J();
            j jVar = this.b;
            LocalDate localDate = this.a;
            if (J) {
                return Y(localDate, jVar.d(j, pVar));
            }
            return Y(localDate.d(j, pVar), jVar);
        }
        return (LocalDateTime) pVar.o(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime e(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof ChronoUnit) {
            int i = h.a[((ChronoUnit) sVar).ordinal()];
            j jVar = this.b;
            LocalDate localDate = this.a;
            switch (i) {
                case 1:
                    return U(this.a, 0L, 0L, 0L, j);
                case 2:
                    LocalDateTime Y = Y(localDate.plusDays(j / 86400000000L), jVar);
                    return Y.U(Y.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    LocalDateTime Y2 = Y(localDate.plusDays(j / 86400000), jVar);
                    return Y2.U(Y2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return T(j);
                case 5:
                    return U(this.a, 0L, j, 0L, 0L);
                case 6:
                    return U(this.a, j, 0L, 0L, 0L);
                case 7:
                    LocalDateTime Y3 = Y(localDate.plusDays(j / 256), jVar);
                    return Y3.U(Y3.a, (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return Y(localDate.e(j, sVar), jVar);
            }
        }
        return (LocalDateTime) sVar.k(this, j);
    }

    public final LocalDateTime T(long j) {
        return U(this.a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    private LocalDateTime U(LocalDate localDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j jVar = this.b;
        if (j5 == 0) {
            return Y(localDate, jVar);
        }
        long j6 = j / 24;
        long j7 = j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j8 = 1;
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long Y = jVar.Y();
        long j10 = (j9 * j8) + Y;
        long k = j$.com.android.tools.r8.a.k(j10, 86400000000000L) + (j7 * j8);
        long j11 = j$.com.android.tools.r8.a.j(j10, 86400000000000L);
        if (j11 != Y) {
            jVar = j.Q(j11);
        }
        return Y(localDate.plusDays(k), jVar);
    }

    @Override // j$.time.temporal.m
    public final Object w(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.f()) {
            return this.a;
        }
        return j$.time.chrono.h.k(this, rVar);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, j$.time.temporal.s sVar) {
        LocalDate localDate;
        long j;
        long j2;
        LocalDateTime J = J(temporal);
        if (!(sVar instanceof ChronoUnit)) {
            return sVar.between(this, J);
        }
        boolean z = ((ChronoUnit) sVar).compareTo(ChronoUnit.DAYS) < 0;
        j jVar = this.b;
        LocalDate localDate2 = this.a;
        if (!z) {
            LocalDate localDate3 = J.a;
            localDate3.getClass();
            boolean z2 = localDate2 instanceof LocalDate;
            j jVar2 = J.b;
            if (!z2 ? localDate3.t() > localDate2.t() : localDate3.I(localDate2) > 0) {
                if (jVar2.compareTo(jVar) < 0) {
                    localDate = localDate3.plusDays(-1L);
                    return localDate2.f(localDate, sVar);
                }
            }
            boolean Q = localDate3.Q(localDate2);
            localDate = localDate3;
            if (Q) {
                localDate = localDate3;
                if (jVar2.compareTo(jVar) > 0) {
                    localDate = localDate3.plusDays(1L);
                }
            }
            return localDate2.f(localDate, sVar);
        }
        LocalDate localDate4 = J.a;
        localDate2.getClass();
        long t = localDate4.t() - localDate2.t();
        j jVar3 = J.b;
        if (t == 0) {
            return jVar.f(jVar3, sVar);
        }
        long Y = jVar3.Y() - jVar.Y();
        if (t > 0) {
            j = t - 1;
            j2 = Y + 86400000000000L;
        } else {
            j = t + 1;
            j2 = Y - 86400000000000L;
        }
        switch (h.a[((ChronoUnit) sVar).ordinal()]) {
            case 1:
                j = j$.com.android.tools.r8.a.l(j, 86400000000000L);
                break;
            case 2:
                j = j$.com.android.tools.r8.a.l(j, 86400000000L);
                j2 /= 1000;
                break;
            case 3:
                j = j$.com.android.tools.r8.a.l(j, 86400000L);
                j2 /= 1000000;
                break;
            case 4:
                j = j$.com.android.tools.r8.a.l(j, 86400);
                j2 /= 1000000000;
                break;
            case 5:
                j = j$.com.android.tools.r8.a.l(j, 1440);
                j2 /= 60000000000L;
                break;
            case 6:
                j = j$.com.android.tools.r8.a.l(j, 24);
                j2 /= 3600000000000L;
                break;
            case 7:
                j = j$.com.android.tools.r8.a.l(j, 2);
                j2 /= 43200000000000L;
                break;
        }
        return j$.com.android.tools.r8.a.f(j, j2);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return I((LocalDateTime) chronoLocalDateTime);
        }
        return j$.time.chrono.h.c(this, chronoLocalDateTime);
    }

    public final boolean N(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return I(localDateTime) > 0;
        }
        long t = this.a.t();
        long t2 = localDateTime.a.t();
        return t > t2 || (t == t2 && this.b.Y() > localDateTime.b.Y());
    }

    public final boolean O(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return I(localDateTime) < 0;
        }
        long t = this.a.t();
        long t2 = localDateTime.a.t();
        return t < t2 || (t == t2 && this.b.Y() < localDateTime.b.Y());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalDateTime)) {
            return false;
        }
        LocalDateTime localDateTime = (LocalDateTime) obj;
        return this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    private Object writeReplace() {
        return new r((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void Z(DataOutput dataOutput) {
        this.a.e0(dataOutput);
        this.b.c0(dataOutput);
    }
}
