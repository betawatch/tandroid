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
        int i;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.b;
        ZoneOffset zoneOffset2 = this.b;
        if (zoneOffset2.equals(zoneOffset)) {
            i = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.a;
            localDateTime.getClass();
            long w = j$.com.android.tools.r8.a.w(localDateTime, zoneOffset2);
            LocalDateTime localDateTime2 = offsetDateTime2.a;
            localDateTime2.getClass();
            int compare = Long.compare(w, j$.com.android.tools.r8.a.w(localDateTime2, offsetDateTime2.b));
            i = compare == 0 ? localDateTime.b.d - localDateTime2.b.d : compare;
        }
        return i == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : i;
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

    public static OffsetDateTime E(Instant instant, ZoneId zoneId) {
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
                LocalDate localDate = (LocalDate) temporal.r(j$.time.temporal.p.f);
                h hVar = (h) temporal.r(j$.time.temporal.p.g);
                if (localDate != null && hVar != null) {
                    temporal = new OffsetDateTime(LocalDateTime.J(localDate, hVar), L);
                } else {
                    temporal = E(Instant.H(temporal), L);
                }
            } catch (b e) {
                throw new b("Unable to obtain OffsetDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
            }
        }
        if (qVar instanceof ChronoUnit) {
            ZoneOffset zoneOffset = temporal.b;
            ZoneOffset zoneOffset2 = this.b;
            OffsetDateTime offsetDateTime = temporal;
            if (!zoneOffset2.equals(zoneOffset)) {
                offsetDateTime = new OffsetDateTime(temporal.a.M(zoneOffset2.getTotalSeconds() - zoneOffset.getTotalSeconds()), zoneOffset2);
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
    public final boolean h(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return true;
        }
        return oVar != null && oVar.p(this);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s q(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar != j$.time.temporal.a.INSTANT_SECONDS && oVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.a.q(oVar);
            }
            return ((j$.time.temporal.a) oVar).b;
        }
        return oVar.r(this);
    }

    @Override // j$.time.temporal.l
    public final int o(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i = m.a[((j$.time.temporal.a) oVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.b.getTotalSeconds();
            }
            return this.a.o(oVar);
        }
        return j$.time.temporal.p.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final long u(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.o(this);
        }
        int i = m.a[((j$.time.temporal.a) oVar).ordinal()];
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        if (i != 1) {
            return i != 2 ? localDateTime.u(oVar) : zoneOffset.getTotalSeconds();
        }
        localDateTime.getClass();
        return j$.com.android.tools.r8.a.w(localDateTime, zoneOffset);
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal p(LocalDate localDate) {
        boolean b = c.b(localDate);
        LocalDateTime localDateTime = this.a;
        ZoneOffset zoneOffset = this.b;
        if (b) {
            return I(localDateTime.p(localDate), zoneOffset);
        }
        localDate.getClass();
        return (OffsetDateTime) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal e(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            int i = m.a[aVar.ordinal()];
            ZoneOffset zoneOffset = this.b;
            LocalDateTime localDateTime = this.a;
            if (i == 1) {
                return E(Instant.I(j, localDateTime.b.d), zoneOffset);
            }
            if (i == 2) {
                return I(localDateTime, ZoneOffset.O(aVar.b.a(j, aVar)));
            }
            return I(localDateTime.e(j, oVar), zoneOffset);
        }
        return (OffsetDateTime) oVar.q(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime f(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof ChronoUnit) {
            return I(this.a.f(j, qVar), this.b);
        }
        return (OffsetDateTime) qVar.l(this, j);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? f(Long.MAX_VALUE, chronoUnit).f(1L, chronoUnit) : f(-j, chronoUnit);
    }

    @Override // j$.time.temporal.l
    public final Object r(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.p.d || aVar == j$.time.temporal.p.e) {
            return this.b;
        }
        if (aVar == j$.time.temporal.p.a) {
            return null;
        }
        j$.time.format.a aVar2 = j$.time.temporal.p.f;
        LocalDateTime localDateTime = this.a;
        if (aVar == aVar2) {
            return localDateTime.a;
        }
        if (aVar == j$.time.temporal.p.g) {
            return localDateTime.b;
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
    public final Temporal x(Temporal temporal) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.a;
        return temporal.e(localDateTime.a.v(), aVar).e(localDateTime.b.R(), j$.time.temporal.a.NANO_OF_DAY).e(this.b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
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
