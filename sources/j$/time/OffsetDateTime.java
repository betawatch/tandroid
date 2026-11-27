package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes4.dex */
public final class OffsetDateTime implements Temporal, j$.time.temporal.m, Comparable<OffsetDateTime>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 2287754244819255394L;
    public final LocalDateTime a;
    public final ZoneOffset b;

    static {
        LocalDateTime localDateTime = LocalDateTime.c;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        new OffsetDateTime(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.d;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        new OffsetDateTime(localDateTime2, zoneOffset2);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.a = (LocalDateTime) Objects.requireNonNull(localDateTime, "dateTime");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public static OffsetDateTime o(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        return new OffsetDateTime(LocalDateTime.x(instant.a, instant.b, offset), offset);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new r((byte) 10, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return (OffsetDateTime) oVar.n(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        int i = o.a[aVar.ordinal()];
        LocalDateTime localDateTime = this.a;
        return i != 1 ? i != 2 ? v(localDateTime.c(j, oVar), this.b) : v(localDateTime, ZoneOffset.H(aVar.b.a(j, aVar))) : o(Instant.v(j, localDateTime.b.d), this.b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int compare;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        if (this.b.equals(offsetDateTime2.b)) {
            compare = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.a;
            ZoneOffset zoneOffset = this.b;
            localDateTime.getClass();
            long v = a.v(localDateTime, zoneOffset);
            LocalDateTime localDateTime2 = offsetDateTime2.a;
            ZoneOffset zoneOffset2 = offsetDateTime2.b;
            localDateTime2.getClass();
            compare = Long.compare(v, a.v(localDateTime2, zoneOffset2));
            if (compare == 0) {
                compare = this.a.b.d - offsetDateTime2.a.b.d;
            }
        }
        return compare == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : compare;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return true;
        }
        return oVar != null && oVar.j(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetDateTime) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
            if (this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [j$.time.OffsetDateTime] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        if (temporal instanceof OffsetDateTime) {
            temporal = (OffsetDateTime) temporal;
        } else {
            try {
                ZoneOffset C = ZoneOffset.C(temporal);
                LocalDate localDate = (LocalDate) temporal.r(j$.time.temporal.p.f);
                j jVar = (j) temporal.r(j$.time.temporal.p.g);
                temporal = (localDate == null || jVar == null) ? o(Instant.q(temporal), C) : new OffsetDateTime(LocalDateTime.w(localDate, jVar), C);
            } catch (c e) {
                g.g("Unable to obtain OffsetDateTime from TemporalAccessor: ", temporal, temporal.getClass().getName(), e);
                return 0L;
            }
        }
        if (!(qVar instanceof ChronoUnit)) {
            return qVar.between(this, temporal);
        }
        ZoneOffset zoneOffset = this.b;
        boolean equals = zoneOffset.equals(temporal.b);
        OffsetDateTime offsetDateTime = temporal;
        if (!equals) {
            offsetDateTime = new OffsetDateTime(temporal.a.F(zoneOffset.getTotalSeconds() - temporal.b.getTotalSeconds()), zoneOffset);
        }
        return this.a.g(offsetDateTime.a, qVar);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.b;
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.p.a(this, oVar);
        }
        int i = o.a[((j$.time.temporal.a) oVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.j(oVar) : this.b.getTotalSeconds();
        }
        throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        if (d.b(localDate)) {
            return v(this.a.k(localDate), this.b);
        }
        localDate.getClass();
        return (OffsetDateTime) a.a(localDate, this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? (oVar == j$.time.temporal.a.INSTANT_SECONDS || oVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) oVar).b : this.a.l(oVar) : oVar.k(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal n(Temporal temporal) {
        return temporal.c(this.a.a.z(), j$.time.temporal.a.EPOCH_DAY).c(this.a.b.K(), j$.time.temporal.a.NANO_OF_DAY).c(this.b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime d(long j, j$.time.temporal.q qVar) {
        return qVar instanceof ChronoUnit ? v(this.a.d(j, qVar), this.b) : (OffsetDateTime) qVar.j(this, j);
    }

    @Override // j$.time.temporal.l
    public final Object r(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.p.d || aVar == j$.time.temporal.p.e) {
            return this.b;
        }
        if (aVar == j$.time.temporal.p.a) {
            return null;
        }
        return aVar == j$.time.temporal.p.f ? this.a.a : aVar == j$.time.temporal.p.g ? this.a.b : aVar == j$.time.temporal.p.b ? j$.time.chrono.q.c : aVar == j$.time.temporal.p.c ? ChronoUnit.NANOS : aVar.a(this);
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
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

    public final OffsetDateTime v(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.a == localDateTime && this.b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.l(this);
        }
        int i = o.a[((j$.time.temporal.a) oVar).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.y(oVar) : this.b.getTotalSeconds();
        }
        LocalDateTime localDateTime = this.a;
        ZoneOffset zoneOffset = this.b;
        localDateTime.getClass();
        return a.v(localDateTime, zoneOffset);
    }
}
