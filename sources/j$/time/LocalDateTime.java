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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class LocalDateTime implements Temporal, j$.time.temporal.m, ChronoLocalDateTime<LocalDate>, Serializable {
    public static final LocalDateTime c = w(LocalDate.d, j.e);
    public static final LocalDateTime d = w(LocalDate.e, j.f);
    private static final long serialVersionUID = 6207766400415563566L;
    public final LocalDate a;
    public final j b;

    public LocalDateTime(LocalDate localDate, j jVar) {
        this.a = localDate;
        this.b = jVar;
    }

    public static LocalDateTime q(Temporal temporal) {
        if (temporal instanceof LocalDateTime) {
            return (LocalDateTime) temporal;
        }
        if (temporal instanceof ZonedDateTime) {
            return ((ZonedDateTime) temporal).p();
        }
        if (temporal instanceof OffsetDateTime) {
            return ((OffsetDateTime) temporal).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.v(temporal), j.v(temporal));
        } catch (c e) {
            g.g("Unable to obtain LocalDateTime from TemporalAccessor: ", temporal, temporal.getClass().getName(), e);
            return null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static LocalDateTime w(LocalDate localDate, j jVar) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(jVar, "time");
        return new LocalDateTime(localDate, jVar);
    }

    private Object writeReplace() {
        return new r((byte) 5, this);
    }

    public static LocalDateTime x(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        j$.time.temporal.a.NANO_OF_SECOND.o(j2);
        return new LocalDateTime(LocalDate.K(a.Q(j + zoneOffset.getTotalSeconds(), 86400L)), j.x((((int) a.P(r5, 86400L)) * 1000000000) + j2));
    }

    @Override // java.lang.Comparable
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return chronoLocalDateTime instanceof LocalDateTime ? o((LocalDateTime) chronoLocalDateTime) : a.e(this, chronoLocalDateTime);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (LocalDateTime) qVar.j(this, j);
        }
        switch (h.a[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return G(this.a, 0L, 0L, 0L, j);
            case 2:
                LocalDateTime J = J(this.a.plusDays(j / 86400000000L), this.b);
                return J.G(J.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                LocalDateTime J2 = J(this.a.plusDays(j / 86400000), this.b);
                return J2.G(J2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return F(j);
            case 5:
                return G(this.a, 0L, j, 0L, 0L);
            case 6:
                return G(this.a, j, 0L, 0L, 0L);
            case 7:
                LocalDateTime J3 = J(this.a.plusDays(j / 256), this.b);
                return J3.G(J3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return J(this.a.d(j, qVar), this.b);
        }
    }

    public final LocalDateTime F(long j) {
        return G(this.a, 0L, 0L, j, 0L);
    }

    public final LocalDateTime G(LocalDate localDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j jVar = this.b;
        if (j5 == 0) {
            return J(localDate, jVar);
        }
        long j6 = j / 24;
        long K = jVar.K();
        long j7 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L) + K;
        long Q = a.Q(j7, 86400000000000L) + j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long P = a.P(j7, 86400000000000L);
        return J(localDate.plusDays(Q), P == K ? this.b : j.x(P));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime c(long j, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (LocalDateTime) oVar.n(this, j);
        }
        boolean q = ((j$.time.temporal.a) oVar).q();
        LocalDate localDate = this.a;
        return q ? J(localDate, this.b.c(j, oVar)) : J(localDate.c(j, oVar), this.b);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime k(LocalDate localDate) {
        if (d.b(localDate)) {
            return J(localDate, this.b);
        }
        localDate.getClass();
        return (LocalDateTime) a.a(localDate, this);
    }

    public final LocalDateTime J(LocalDate localDate, j jVar) {
        return (this.a == localDate && this.b == jVar) ? this : new LocalDateTime(localDate, jVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.a a() {
        return ((LocalDate) f()).a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j b() {
        return this.b;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar != null && oVar.j(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        return aVar.isDateBased() || aVar.q();
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

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.b f() {
        return this.a;
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bd, code lost:
    
        if (r0.o(r1) > 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        if (r0.z() > r1.z()) goto L33;
     */
    @Override // j$.time.temporal.Temporal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        long j;
        long j2;
        LocalDateTime q = q(temporal);
        if (!(qVar instanceof ChronoUnit)) {
            return qVar.between(this, q);
        }
        ChronoUnit chronoUnit = (ChronoUnit) qVar;
        if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0) {
            LocalDate localDate = q.a;
            LocalDate localDate2 = this.a;
            boolean z = false;
            if (localDate2 != null) {
                localDate.getClass();
            }
            if (z && q.b.compareTo(this.b) < 0) {
                localDate = localDate.plusDays(-1L);
            } else if (localDate.G(this.a) && q.b.compareTo(this.b) > 0) {
                localDate = localDate.plusDays(1L);
            }
            return this.a.g(localDate, qVar);
        }
        LocalDate localDate3 = this.a;
        LocalDate localDate4 = q.a;
        localDate3.getClass();
        long z2 = localDate4.z() - localDate3.z();
        if (z2 == 0) {
            return this.b.g(q.b, qVar);
        }
        long K = q.b.K() - this.b.K();
        if (z2 > 0) {
            j = z2 - 1;
            j2 = K + 86400000000000L;
        } else {
            j = z2 + 1;
            j2 = K - 86400000000000L;
        }
        switch (h.a[chronoUnit.ordinal()]) {
            case 1:
                j = a.R(j, 86400000000000L);
                break;
            case 2:
                j = a.R(j, 86400000000L);
                j2 /= 1000;
                break;
            case 3:
                j = a.R(j, 86400000L);
                j2 /= 1000000;
                break;
            case 4:
                j = a.R(j, 86400L);
                j2 /= 1000000000;
                break;
            case 5:
                j = a.R(j, 1440L);
                j2 /= 60000000000L;
                break;
            case 6:
                j = a.R(j, 24L);
                j2 /= 3600000000000L;
                break;
            case 7:
                j = a.R(j, 2L);
                j2 /= 43200000000000L;
                break;
        }
        return a.N(j, j2);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) oVar).q() ? this.b.j(oVar) : this.a.j(oVar) : j$.time.temporal.p.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.k(this);
        }
        if (!((j$.time.temporal.a) oVar).q()) {
            return this.a.l(oVar);
        }
        j jVar = this.b;
        jVar.getClass();
        return j$.time.temporal.p.d(jVar, oVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime m(ZoneOffset zoneOffset) {
        return ZonedDateTime.q(this, zoneOffset, null);
    }

    @Override // j$.time.temporal.m
    public final Temporal n(Temporal temporal) {
        return temporal.c(((LocalDate) f()).z(), j$.time.temporal.a.EPOCH_DAY).c(b().K(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int o(LocalDateTime localDateTime) {
        int o = this.a.o(localDateTime.a);
        return o == 0 ? this.b.compareTo(localDateTime.b) : o;
    }

    @Override // j$.time.temporal.l
    public final Object r(j$.time.format.a aVar) {
        return aVar == j$.time.temporal.p.f ? this.a : a.s(this, aVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return a.v(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ Instant toInstant(ZoneOffset zoneOffset) {
        return a.x(this, zoneOffset);
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal u(long j, ChronoUnit chronoUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            this = d(Long.MAX_VALUE, chronoUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return this.d(j2, chronoUnit);
    }

    public final boolean v(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return o((LocalDateTime) chronoLocalDateTime) < 0;
        }
        long z = this.a.z();
        long z2 = chronoLocalDateTime.f().z();
        if (z >= z2) {
            return z == z2 && this.b.K() < chronoLocalDateTime.b().K();
        }
        return true;
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) oVar).q() ? this.b.y(oVar) : this.a.y(oVar) : oVar.l(this);
    }
}
