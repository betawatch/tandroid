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
    public final /* synthetic */ long F() {
        return j$.com.android.tools.r8.a.x(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return j$.com.android.tools.r8.a.g(this, chronoZonedDateTime);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.k a() {
        return ((LocalDate) f()).a();
    }

    public static ZonedDateTime H(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        List f10 = rules.f(localDateTime);
        if (f10.size() == 1) {
            zoneOffset = (ZoneOffset) f10.get(0);
        } else if (f10.size() == 0) {
            j$.time.zone.b e = rules.e(localDateTime);
            localDateTime = localDateTime.M(Duration.j(e.d.getTotalSeconds() - e.c.getTotalSeconds(), 0).getSeconds());
            zoneOffset = e.d;
        } else if (zoneOffset == null || !f10.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) Objects.requireNonNull((ZoneOffset) f10.get(0), "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime q(long j10, int i10, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(Instant.I(j10, i10));
        return new ZonedDateTime(LocalDateTime.K(j10, i10, offset), zoneId, offset);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.I(F(), b().d);
    }

    public static ZonedDateTime G(j$.time.temporal.l lVar) {
        if (lVar instanceof ZonedDateTime) {
            return (ZonedDateTime) lVar;
        }
        try {
            ZoneId G = ZoneId.G(lVar);
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            if (!lVar.e(aVar)) {
                return H(LocalDateTime.J(LocalDate.I(lVar), h.I(lVar)), G, null);
            }
            return q(lVar.y(aVar), lVar.j(j$.time.temporal.a.NANO_OF_SECOND), G);
        } catch (b e) {
            throw new b("Unable to obtain ZonedDateTime from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName(), e);
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

    public final ZonedDateTime K(ZoneOffset zoneOffset) {
        return (zoneOffset.equals(this.b) || !this.c.getRules().f(this.a).contains(zoneOffset)) ? this : new ZonedDateTime(this.a, this.c, zoneOffset);
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
            if (oVar == j$.time.temporal.a.INSTANT_SECONDS || oVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) oVar).b;
            }
            return this.a.l(oVar);
        }
        return oVar.k(this);
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i10 = v.a[((j$.time.temporal.a) oVar).ordinal()];
            if (i10 == 1) {
                throw new j$.time.temporal.r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 == 2) {
                return this.b.getTotalSeconds();
            }
            return this.a.j(oVar);
        }
        return j$.com.android.tools.r8.a.l(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.m(this);
        }
        int i10 = v.a[((j$.time.temporal.a) oVar).ordinal()];
        return i10 != 1 ? i10 != 2 ? this.a.y(oVar) : this.b.getTotalSeconds() : j$.com.android.tools.r8.a.x(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset h() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public ZoneId getZone() {
        return this.c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime v(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.c.equals(zoneId) ? this : H(this.a, zoneId, this.b);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime i(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        LocalDateTime localDateTime = this.a;
        ZoneOffset zoneOffset = this.b;
        localDateTime.getClass();
        return q(j$.com.android.tools.r8.a.w(localDateTime, zoneOffset), this.a.b.d, zoneId);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: toLocalDateTime, reason: merged with bridge method [inline-methods] */
    public LocalDateTime r() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public LocalDate f() {
        return this.a.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final h b() {
        return this.a.b;
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        if (c.b(localDate)) {
            return J(LocalDateTime.J(localDate, this.a.b));
        }
        return (ZonedDateTime) localDate.q(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j10, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
            int i10 = v.a[aVar.ordinal()];
            if (i10 == 1) {
                return q(j10, this.a.b.d, this.c);
            }
            if (i10 == 2) {
                return K(ZoneOffset.O(aVar.b.a(j10, aVar)));
            }
            return J(this.a.c(j10, oVar));
        }
        return (ZonedDateTime) oVar.q(this, j10);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime d(long j10, j$.time.temporal.q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return (ZonedDateTime) qVar.j(this, j10);
        }
        ChronoUnit chronoUnit = (ChronoUnit) qVar;
        if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER) {
            return J(this.a.d(j10, qVar));
        }
        LocalDateTime d = this.a.d(j10, qVar);
        ZoneOffset zoneOffset = this.b;
        ZoneId zoneId = this.c;
        Objects.requireNonNull(d, "localDateTime");
        Objects.requireNonNull(zoneOffset, "offset");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId.getRules().f(d).contains(zoneOffset)) {
            return new ZonedDateTime(d, zoneId, zoneOffset);
        }
        d.getClass();
        return q(j$.com.android.tools.r8.a.w(d, zoneOffset), d.b.d, zoneId);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal w(long j10, ChronoUnit chronoUnit) {
        return j10 == Long.MIN_VALUE ? d(Long.MAX_VALUE, chronoUnit).d(1L, chronoUnit) : d(-j10, chronoUnit);
    }

    @Override // j$.time.temporal.l
    public final Object m(j$.time.format.a aVar) {
        if (aVar == j$.time.temporal.p.f) {
            return f();
        }
        return j$.com.android.tools.r8.a.u(this, aVar);
    }

    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        ZonedDateTime G = G(temporal);
        if (qVar instanceof ChronoUnit) {
            ZonedDateTime i10 = G.i(this.c);
            ChronoUnit chronoUnit = (ChronoUnit) qVar;
            if (chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return this.a.g(i10.a, qVar);
            }
            return new OffsetDateTime(this.a, this.b).g(new OffsetDateTime(i10.a, i10.b), qVar);
        }
        return qVar.between(this, G);
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
        String str = this.a.toString() + this.b.c;
        ZoneOffset zoneOffset = this.b;
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
