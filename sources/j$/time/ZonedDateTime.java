package j$.time;

import j$.time.chrono.ChronoZonedDateTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class ZonedDateTime implements Temporal, ChronoZonedDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    public final LocalDateTime a;
    public final ZoneOffset b;
    public final ZoneId c;

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long G() {
        return j$.com.android.tools.r8.a.x(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return j$.com.android.tools.r8.a.g(this, chronoZonedDateTime);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.k b() {
        return ((LocalDate) d()).b();
    }

    public static ZonedDateTime H(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        List f = rules.f(localDateTime);
        if (f.size() == 1) {
            zoneOffset = (ZoneOffset) f.get(0);
        } else if (f.size() == 0) {
            j$.time.zone.b e = rules.e(localDateTime);
            localDateTime = localDateTime.M(Duration.l(e.d.getTotalSeconds() - e.c.getTotalSeconds(), 0).getSeconds());
            zoneOffset = e.d;
        } else if (zoneOffset == null || !f.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) Objects.requireNonNull((ZoneOffset) f.get(0), "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime x(long j, int i, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(Instant.I(j, i));
        return new ZonedDateTime(LocalDateTime.K(j, i, offset), zoneId, offset);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.I(G(), c().d);
    }

    public static ZonedDateTime E(Temporal temporal) {
        if (temporal instanceof ZonedDateTime) {
            return (ZonedDateTime) temporal;
        }
        try {
            ZoneId E = ZoneId.E(temporal);
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            if (!temporal.h(aVar)) {
                return H(LocalDateTime.J(LocalDate.I(temporal), h.I(temporal)), E, null);
            }
            return x(temporal.u(aVar), temporal.o(j$.time.temporal.a.NANO_OF_SECOND), E);
        } catch (b e) {
            throw new b("Unable to obtain ZonedDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
        }
    }

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    public final ZonedDateTime J(LocalDateTime localDateTime) {
        return H(localDateTime, this.c, this.b);
    }

    @Override // j$.time.temporal.l
    public final boolean h(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return true;
        }
        return oVar != null && oVar.p(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public LocalDate d() {
        return this.a.a;
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s q(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar == j$.time.temporal.a.INSTANT_SECONDS || oVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) oVar).b;
            }
            return this.a.q(oVar);
        }
        return oVar.r(this);
    }

    @Override // j$.time.temporal.l
    public final int o(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i = v.a[((j$.time.temporal.a) oVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.b.getTotalSeconds();
            }
            return this.a.o(oVar);
        }
        return j$.com.android.tools.r8.a.l(this, oVar);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final h c() {
        return this.a.b;
    }

    @Override // j$.time.temporal.l
    public final long u(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.o(this);
        }
        int i = v.a[((j$.time.temporal.a) oVar).ordinal()];
        return i != 1 ? i != 2 ? this.a.u(oVar) : this.b.getTotalSeconds() : j$.com.android.tools.r8.a.x(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset i() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public ZoneId getZone() {
        return this.c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime k(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.c.equals(zoneId) ? this : H(this.a, zoneId, this.b);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime j(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        LocalDateTime localDateTime = this.a;
        localDateTime.getClass();
        return x(j$.com.android.tools.r8.a.w(localDateTime, this.b), localDateTime.b.d, zoneId);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: toLocalDateTime, reason: merged with bridge method [inline-methods] */
    public LocalDateTime B() {
        return this.a;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal p(LocalDate localDate) {
        boolean b = c.b(localDate);
        LocalDateTime localDateTime = this.a;
        if (b) {
            return J(LocalDateTime.J(localDate, localDateTime.b));
        }
        localDate.getClass();
        return (ZonedDateTime) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal e(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            int i = v.a[aVar.ordinal()];
            ZoneId zoneId = this.c;
            LocalDateTime localDateTime = this.a;
            if (i == 1) {
                return x(j, localDateTime.b.d, zoneId);
            }
            if (i == 2) {
                ZoneOffset O = ZoneOffset.O(aVar.b.a(j, aVar));
                return (O.equals(this.b) || !zoneId.getRules().f(localDateTime).contains(O)) ? this : new ZonedDateTime(localDateTime, zoneId, O);
            }
            return J(localDateTime.e(j, oVar));
        }
        return (ZonedDateTime) oVar.q(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime f(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (ZonedDateTime) qVar.l(this, j);
        }
        ChronoUnit chronoUnit = (ChronoUnit) qVar;
        boolean z = chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER;
        LocalDateTime localDateTime = this.a;
        if (z) {
            return J(localDateTime.f(j, qVar));
        }
        LocalDateTime f = localDateTime.f(j, qVar);
        Objects.requireNonNull(f, "localDateTime");
        ZoneOffset zoneOffset = this.b;
        Objects.requireNonNull(zoneOffset, "offset");
        ZoneId zoneId = this.c;
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId.getRules().f(f).contains(zoneOffset)) {
            return new ZonedDateTime(f, zoneId, zoneOffset);
        }
        f.getClass();
        return x(j$.com.android.tools.r8.a.w(f, zoneOffset), f.b.d, zoneId);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? f(Long.MAX_VALUE, chronoUnit).f(1L, chronoUnit) : f(-j, chronoUnit);
    }

    @Override // j$.time.temporal.l
    public final Object r(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.p.f) {
            return d();
        }
        return j$.com.android.tools.r8.a.u(this, aVar);
    }

    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        ZonedDateTime E = E(temporal);
        if (qVar instanceof ChronoUnit) {
            ZonedDateTime j = E.j(this.c);
            ChronoUnit chronoUnit = (ChronoUnit) qVar;
            int compareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
            LocalDateTime localDateTime = this.a;
            LocalDateTime localDateTime2 = j.a;
            if (compareTo >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return localDateTime.g(localDateTime2, qVar);
            }
            return new OffsetDateTime(localDateTime, this.b).g(new OffsetDateTime(localDateTime2, j.b), qVar);
        }
        return qVar.between(this, E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    public final String toString() {
        String localDateTime = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = localDateTime + zoneOffset.c;
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    private Object writeReplace() {
        return new p((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
