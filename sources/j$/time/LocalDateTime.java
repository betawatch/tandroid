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
    public static final LocalDateTime c = O(LocalDate.d, i.e);
    public static final LocalDateTime d = O(LocalDate.e, i.f);
    private static final long serialVersionUID = 6207766400415563566L;
    private final LocalDate a;
    private final i b;

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return j$.time.chrono.h.n(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ Instant toInstant(ZoneOffset zoneOffset) {
        return j$.time.chrono.h.p(this, zoneOffset);
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
        return ZonedDateTime.I(this, zoneOffset, null);
    }

    public static LocalDateTime N(int i) {
        return new LocalDateTime(LocalDate.of(i, 12, 31), i.N(0));
    }

    public static LocalDateTime O(LocalDate localDate, i iVar) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(iVar, "time");
        return new LocalDateTime(localDate, iVar);
    }

    @Override // j$.time.temporal.n
    public final Temporal x(Temporal temporal) {
        return temporal.d(((LocalDate) c()).s(), j$.time.temporal.a.EPOCH_DAY).d(b().W(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public static LocalDateTime P(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.G(j2);
        return new LocalDateTime(LocalDate.T(j$.com.android.tools.r8.a.k(j + zoneOffset.getTotalSeconds(), 86400)), i.O((((int) j$.com.android.tools.r8.a.j(r5, r7)) * 1000000000) + j2));
    }

    public static LocalDateTime H(Temporal temporal) {
        if (temporal instanceof LocalDateTime) {
            return (LocalDateTime) temporal;
        }
        if (temporal instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporal).z();
        }
        if (temporal instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporal).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.I(temporal), i.I(temporal));
        } catch (c e) {
            throw new c("Unable to obtain LocalDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
        }
    }

    private LocalDateTime(LocalDate localDate, i iVar) {
        this.a = localDate;
        this.b = iVar;
    }

    private LocalDateTime W(LocalDate localDate, i iVar) {
        return (this.a == localDate && this.b == iVar) ? this : new LocalDateTime(localDate, iVar);
    }

    @Override // j$.time.temporal.m
    public final boolean g(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar != null && pVar.n(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        return aVar.v() || aVar.H();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) pVar).H()) {
                i iVar = this.b;
                iVar.getClass();
                return j$.time.temporal.l.d(iVar, pVar);
            }
            return this.a.o(pVar);
        }
        return pVar.r(this);
    }

    @Override // j$.time.temporal.m
    public final int l(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).H() ? this.b.l(pVar) : this.a.l(pVar);
        }
        return j$.time.temporal.l.a(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final long r(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).H() ? this.b.r(pVar) : this.a.r(pVar);
        }
        return pVar.l(this);
    }

    private int G(LocalDateTime localDateTime) {
        int G = this.a.G(localDateTime.a);
        return G == 0 ? this.b.compareTo(localDateTime.b) : G;
    }

    public final LocalDate T() {
        return this.a;
    }

    public final int K() {
        return this.a.getYear();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final i b() {
        return this.b;
    }

    public final int J() {
        return this.b.M();
    }

    public final int I() {
        return this.b.L();
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime n(LocalDate localDate) {
        if (localDate instanceof LocalDate) {
            return W(localDate, this.b);
        }
        localDate.getClass();
        return (LocalDateTime) j$.time.chrono.h.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            boolean H = ((j$.time.temporal.a) pVar).H();
            i iVar = this.b;
            LocalDate localDate = this.a;
            if (H) {
                return W(localDate, iVar.d(j, pVar));
            }
            return W(localDate.d(j, pVar), iVar);
        }
        return (LocalDateTime) pVar.o(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime e(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof ChronoUnit) {
            int i = g.a[((ChronoUnit) sVar).ordinal()];
            i iVar = this.b;
            LocalDate localDate = this.a;
            switch (i) {
                case 1:
                    return S(this.a, 0L, 0L, 0L, j);
                case 2:
                    LocalDateTime W = W(localDate.plusDays(j / 86400000000L), iVar);
                    return W.S(W.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    LocalDateTime W2 = W(localDate.plusDays(j / 86400000), iVar);
                    return W2.S(W2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return R(j);
                case 5:
                    return S(this.a, 0L, j, 0L, 0L);
                case 6:
                    return S(this.a, j, 0L, 0L, 0L);
                case 7:
                    LocalDateTime W3 = W(localDate.plusDays(j / 256), iVar);
                    return W3.S(W3.a, (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return W(localDate.e(j, sVar), iVar);
            }
        }
        return (LocalDateTime) sVar.k(this, j);
    }

    public final LocalDateTime R(long j) {
        return S(this.a, 0L, 0L, j, 0L);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    private LocalDateTime S(LocalDate localDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        i iVar = this.b;
        if (j5 == 0) {
            return W(localDate, iVar);
        }
        long j6 = j / 24;
        long j7 = j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j8 = 1;
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long W = iVar.W();
        long j10 = (j9 * j8) + W;
        long k = j$.com.android.tools.r8.a.k(j10, 86400000000000L) + (j7 * j8);
        long j11 = j$.com.android.tools.r8.a.j(j10, 86400000000000L);
        if (j11 != W) {
            iVar = i.O(j11);
        }
        return W(localDate.plusDays(k), iVar);
    }

    @Override // j$.time.temporal.m
    public final Object v(j$.time.temporal.r rVar) {
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
        LocalDateTime H = H(temporal);
        if (!(sVar instanceof ChronoUnit)) {
            return sVar.between(this, H);
        }
        boolean z = ((ChronoUnit) sVar).compareTo(ChronoUnit.DAYS) < 0;
        i iVar = this.b;
        LocalDate localDate2 = this.a;
        if (!z) {
            LocalDate localDate3 = H.a;
            localDate3.getClass();
            boolean z2 = localDate2 instanceof LocalDate;
            i iVar2 = H.b;
            if (!z2 ? localDate3.s() > localDate2.s() : localDate3.G(localDate2) > 0) {
                if (iVar2.compareTo(iVar) < 0) {
                    localDate = localDate3.plusDays(-1L);
                    return localDate2.f(localDate, sVar);
                }
            }
            boolean O = localDate3.O(localDate2);
            localDate = localDate3;
            if (O) {
                localDate = localDate3;
                if (iVar2.compareTo(iVar) > 0) {
                    localDate = localDate3.plusDays(1L);
                }
            }
            return localDate2.f(localDate, sVar);
        }
        LocalDate localDate4 = H.a;
        localDate2.getClass();
        long s = localDate4.s() - localDate2.s();
        i iVar3 = H.b;
        if (s == 0) {
            return iVar.f(iVar3, sVar);
        }
        long W = iVar3.W() - iVar.W();
        if (s > 0) {
            j = s - 1;
            j2 = W + 86400000000000L;
        } else {
            j = s + 1;
            j2 = W - 86400000000000L;
        }
        switch (g.a[((ChronoUnit) sVar).ordinal()]) {
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
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return G((LocalDateTime) chronoLocalDateTime);
        }
        return j$.time.chrono.h.c(this, chronoLocalDateTime);
    }

    public final boolean L(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return G(localDateTime) > 0;
        }
        long s = this.a.s();
        long s2 = localDateTime.a.s();
        return s > s2 || (s == s2 && this.b.W() > localDateTime.b.W());
    }

    public final boolean M(LocalDateTime localDateTime) {
        if (localDateTime instanceof LocalDateTime) {
            return G(localDateTime) < 0;
        }
        long s = this.a.s();
        long s2 = localDateTime.a.s();
        return s < s2 || (s == s2 && this.b.W() < localDateTime.b.W());
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

    final void X(DataOutput dataOutput) {
        this.a.c0(dataOutput);
        this.b.a0(dataOutput);
    }
}
