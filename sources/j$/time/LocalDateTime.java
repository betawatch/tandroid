package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.format.DateTimeFormatter;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.m, j$.time.temporal.p, ChronoLocalDateTime<LocalDate>, Serializable {
    public static final LocalDateTime c = J(LocalDate.d, j.e);
    public static final LocalDateTime d = J(LocalDate.e, j.f);
    private static final long serialVersionUID = 6207766400415563566L;
    private final LocalDate a;
    private final j b;

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.b c() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.l a() {
        return ((LocalDate) c()).a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime o(ZoneOffset zoneOffset) {
        return ZonedDateTime.B(this, zoneOffset, null);
    }

    public static LocalDateTime I(int i) {
        return new LocalDateTime(LocalDate.of(i, 12, 31), j.I(0));
    }

    public static LocalDateTime J(LocalDate localDate, j jVar) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(jVar, "time");
        return new LocalDateTime(localDate, jVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        return mVar.d(((LocalDate) c()).s(), j$.time.temporal.a.EPOCH_DAY).d(b().R(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public static LocalDateTime K(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.B(j2);
        return new LocalDateTime(LocalDate.N(j$.com.android.tools.r8.a.k(j + zoneOffset.getTotalSeconds(), 86400)), j.J((((int) j$.com.android.tools.r8.a.j(r5, r7)) * 1000000000) + j2));
    }

    public static LocalDateTime C(j$.time.temporal.o oVar) {
        if (oVar instanceof LocalDateTime) {
            return (LocalDateTime) oVar;
        }
        if (oVar instanceof ZonedDateTime) {
            return ((ZonedDateTime) oVar).F();
        }
        if (oVar instanceof OffsetDateTime) {
            return ((OffsetDateTime) oVar).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.D(oVar), j.D(oVar));
        } catch (c e) {
            throw new c("Unable to obtain LocalDateTime from TemporalAccessor: " + oVar + " of type " + oVar.getClass().getName(), e);
        }
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final Instant toInstant(ZoneOffset zoneOffset) {
        return Instant.G(j$.time.chrono.h.n(this, zoneOffset), b().G());
    }

    private LocalDateTime(LocalDate localDate, j jVar) {
        this.a = localDate;
        this.b = jVar;
    }

    private LocalDateTime R(LocalDate localDate, j jVar) {
        return (this.a == localDate && this.b == jVar) ? this : new LocalDateTime(localDate, jVar);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar != null && rVar.l(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        return aVar.u() || aVar.C();
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) rVar).C()) {
                j jVar = this.b;
                jVar.getClass();
                return j$.time.temporal.n.d(jVar, rVar);
            }
            return this.a.m(rVar);
        }
        return rVar.r(this);
    }

    @Override // j$.time.temporal.o
    public final int j(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).C() ? this.b.j(rVar) : this.a.j(rVar);
        }
        return j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).C() ? this.b.r(rVar) : this.a.r(rVar);
        }
        return rVar.j(this);
    }

    private int B(LocalDateTime localDateTime) {
        int B = this.a.B(localDateTime.a);
        return B == 0 ? this.b.compareTo(localDateTime.b) : B;
    }

    public final LocalDate O() {
        return this.a;
    }

    public final int F() {
        return this.a.getYear();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j b() {
        return this.b;
    }

    public final int E() {
        return this.b.H();
    }

    public final int D() {
        return this.b.G();
    }

    @Override // j$.time.temporal.m
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime l(LocalDate localDate) {
        if (localDate instanceof LocalDate) {
            return R(localDate, this.b);
        }
        localDate.getClass();
        return (LocalDateTime) j$.time.chrono.h.a(localDate, this);
    }

    @Override // j$.time.temporal.m
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            boolean C = ((j$.time.temporal.a) rVar).C();
            j jVar = this.b;
            LocalDate localDate = this.a;
            if (C) {
                return R(localDate, jVar.d(j, rVar));
            }
            return R(localDate.d(j, rVar), jVar);
        }
        return (LocalDateTime) rVar.m(this, j);
    }

    @Override // j$.time.temporal.m
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime e(long j, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            int i = h.a[((j$.time.temporal.b) uVar).ordinal()];
            j jVar = this.b;
            LocalDate localDate = this.a;
            switch (i) {
                case 1:
                    return N(this.a, 0L, 0L, 0L, j);
                case 2:
                    LocalDateTime R = R(localDate.plusDays(j / 86400000000L), jVar);
                    return R.N(R.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    LocalDateTime R2 = R(localDate.plusDays(j / 86400000), jVar);
                    return R2.N(R2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return M(j);
                case 5:
                    return N(this.a, 0L, j, 0L, 0L);
                case 6:
                    return N(this.a, j, 0L, 0L, 0L);
                case 7:
                    LocalDateTime R3 = R(localDate.plusDays(j / 256), jVar);
                    return R3.N(R3.a, (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return R(localDate.e(j, uVar), jVar);
            }
        }
        return (LocalDateTime) uVar.i(this, j);
    }

    public final LocalDateTime M(long j) {
        return N(this.a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j, bVar);
    }

    private LocalDateTime N(LocalDate localDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j jVar = this.b;
        if (j5 == 0) {
            return R(localDate, jVar);
        }
        long j6 = j / 24;
        long j7 = j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j8 = 1;
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long R = jVar.R();
        long j10 = (j9 * j8) + R;
        long k = j$.com.android.tools.r8.a.k(j10, 86400000000000L) + (j7 * j8);
        long j11 = j$.com.android.tools.r8.a.j(j10, 86400000000000L);
        if (j11 != R) {
            jVar = j.J(j11);
        }
        return R(localDate.plusDays(k), jVar);
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.f()) {
            return this.a;
        }
        return j$.time.chrono.h.k(this, tVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return B((LocalDateTime) chronoLocalDateTime);
        }
        return j$.time.chrono.h.c(this, chronoLocalDateTime);
    }

    public final boolean G(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return B(localDateTime) > 0;
        }
        long s = this.a.s();
        long s2 = localDateTime.a.s();
        return s > s2 || (s == s2 && this.b.R() > localDateTime.b.R());
    }

    public final boolean H(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return B(localDateTime) < 0;
        }
        long s = this.a.s();
        long s2 = localDateTime.a.s();
        return s < s2 || (s == s2 && this.b.R() < localDateTime.b.R());
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
        return new q((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void S(DataOutput dataOutput) {
        this.a.W(dataOutput);
        this.b.V(dataOutput);
    }
}
