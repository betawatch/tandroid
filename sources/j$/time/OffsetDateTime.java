package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class OffsetDateTime implements Temporal, j$.time.temporal.m, Comparable<OffsetDateTime>, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 2287754244819255394L;
    public final LocalDateTime a;
    public final ZoneOffset b;

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
            long w10 = j$.com.android.tools.r8.a.w(localDateTime, zoneOffset);
            LocalDateTime localDateTime2 = offsetDateTime2.a;
            ZoneOffset zoneOffset2 = offsetDateTime2.b;
            localDateTime2.getClass();
            compare = Long.compare(w10, j$.com.android.tools.r8.a.w(localDateTime2, zoneOffset2));
            if (compare == 0) {
                compare = this.a.b.d - offsetDateTime2.a.b.d;
            }
        }
        return compare == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : compare;
    }

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

    public static OffsetDateTime G(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        return new OffsetDateTime(LocalDateTime.K(instant.a, instant.b, offset), offset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [j$.time.OffsetDateTime] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        if (temporal instanceof OffsetDateTime) {
            temporal = (OffsetDateTime) temporal;
        } else {
            try {
                ZoneOffset L = ZoneOffset.L(temporal);
                LocalDate localDate = (LocalDate) temporal.m(j$.time.temporal.p.f);
                h hVar = (h) temporal.m(j$.time.temporal.p.g);
                if (localDate != null && hVar != null) {
                    temporal = new OffsetDateTime(LocalDateTime.J(localDate, hVar), L);
                } else {
                    temporal = G(Instant.H(temporal), L);
                }
            } catch (b e) {
                throw new b("Unable to obtain OffsetDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (qVar instanceof ChronoUnit) {
            ZoneOffset zoneOffset = this.b;
            boolean equals = zoneOffset.equals(temporal.b);
            OffsetDateTime offsetDateTime = temporal;
            if (!equals) {
                offsetDateTime = new OffsetDateTime(temporal.a.M(zoneOffset.getTotalSeconds() - temporal.b.getTotalSeconds()), zoneOffset);
            }
            return this.a.g(offsetDateTime.a, qVar);
        }
        return qVar.between(this, temporal);
    }

    public OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.a = (LocalDateTime) Objects.requireNonNull(localDateTime, "dateTime");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public final OffsetDateTime I(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.a == localDateTime && this.b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return true;
        }
        return oVar != null && oVar.j(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar != j$.time.temporal.a.INSTANT_SECONDS && oVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.a.l(oVar);
            }
            return ((j$.time.temporal.a) oVar).b;
        }
        return oVar.k(this);
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i10 = m.a[((j$.time.temporal.a) oVar).ordinal()];
            if (i10 == 1) {
                throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 == 2) {
                return this.b.getTotalSeconds();
            }
            return this.a.j(oVar);
        }
        return j$.time.temporal.p.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.m(this);
        }
        int i10 = m.a[((j$.time.temporal.a) oVar).ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? this.a.y(oVar) : this.b.getTotalSeconds();
        }
        LocalDateTime localDateTime = this.a;
        ZoneOffset zoneOffset = this.b;
        localDateTime.getClass();
        return j$.com.android.tools.r8.a.w(localDateTime, zoneOffset);
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        if (c.b(localDate)) {
            return I(this.a.k(localDate), this.b);
        }
        localDate.getClass();
        return (OffsetDateTime) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j10, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            int i10 = m.a[aVar.ordinal()];
            if (i10 == 1) {
                return G(Instant.I(j10, this.a.b.d), this.b);
            }
            if (i10 == 2) {
                return I(this.a, ZoneOffset.O(aVar.b.a(j10, aVar)));
            }
            return I(this.a.c(j10, oVar), this.b);
        }
        return (OffsetDateTime) oVar.q(this, j10);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime d(long j10, j$.time.temporal.q qVar) {
        if (qVar instanceof ChronoUnit) {
            return I(this.a.d(j10, qVar), this.b);
        }
        return (OffsetDateTime) qVar.j(this, j10);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal w(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j10, chronoUnit);
    }

    @Override // j$.time.temporal.l
    public final Object m(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.p.d || aVar == j$.time.temporal.p.e) {
            return this.b;
        }
        if (aVar == j$.time.temporal.p.a) {
            return null;
        }
        if (aVar == j$.time.temporal.p.f) {
            return this.a.a;
        }
        if (aVar == j$.time.temporal.p.g) {
            return this.a.b;
        }
        if (aVar == j$.time.temporal.p.b) {
            return j$.time.chrono.r.c;
        }
        if (aVar == j$.time.temporal.p.c) {
            return ChronoUnit.NANOS;
        }
        return aVar.a(this);
    }

    @Override // j$.time.temporal.m
    public final Temporal q(Temporal temporal) {
        return temporal.c(this.a.a.z(), j$.time.temporal.a.EPOCH_DAY).c(this.a.b.R(), j$.time.temporal.a.NANO_OF_DAY).c(this.b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
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

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.b;
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }

    private Object writeReplace() {
        return new p((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
