package j$.time;

import j$.time.chrono.ChronoZonedDateTime;
import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.zone.ZoneRules;
import j$.util.A;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class ZonedDateTime implements j$.time.temporal.k, ChronoZonedDateTime<LocalDate>, Serializable {
    private final LocalDateTime a;
    private final ZoneOffset b;
    private final ZoneId c;

    @Override // java.lang.Comparable
    public final int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        ChronoZonedDateTime<?> chronoZonedDateTime2 = chronoZonedDateTime;
        int compare = Long.compare(k(), chronoZonedDateTime2.k());
        if (compare != 0) {
            return compare;
        }
        LocalDateTime localDateTime = this.a;
        int n = localDateTime.a().n() - chronoZonedDateTime2.a().n();
        if (n != 0) {
            return n;
        }
        int compareTo = localDateTime.compareTo(chronoZonedDateTime2.d());
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = this.c.getId().compareTo(chronoZonedDateTime2.e().getId());
        if (compareTo2 != 0) {
            return compareTo2;
        }
        j$.time.chrono.e b = b();
        j$.time.chrono.e b2 = chronoZonedDateTime2.b();
        ((j$.time.chrono.a) b).getClass();
        b2.getClass();
        return 0;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final LocalDateTime d() {
        return this.a;
    }

    public static ZonedDateTime m(LocalDateTime localDateTime, ZoneId zoneId) {
        ZoneOffset zoneOffset;
        A.z(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, (ZoneOffset) zoneId, zoneId);
        }
        ZoneRules rules = zoneId.getRules();
        List f = rules.f(localDateTime);
        if (f.size() == 1) {
            zoneOffset = (ZoneOffset) f.get(0);
        } else if (f.size() == 0) {
            j$.time.zone.a e = rules.e(localDateTime);
            localDateTime = localDateTime.u(e.h().g());
            zoneOffset = e.i();
        } else {
            zoneOffset = (ZoneOffset) f.get(0);
            A.z(zoneOffset, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneOffset, zoneId);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.r(k(), a().n());
    }

    private ZonedDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneId zoneId) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    @Override // j$.time.temporal.k
    public final boolean j(j$.time.temporal.l lVar) {
        return (lVar instanceof j$.time.temporal.a) || (lVar != null && lVar.g(this));
    }

    @Override // j$.time.temporal.k
    public final q i(j$.time.temporal.a aVar) {
        if (aVar instanceof j$.time.temporal.a) {
            if (aVar == j$.time.temporal.a.INSTANT_SECONDS || aVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return aVar.m();
            }
            return this.a.i(aVar);
        }
        aVar.getClass();
        return i(aVar);
    }

    @Override // j$.time.temporal.k
    public final int h(j$.time.temporal.a aVar) {
        if (aVar instanceof j$.time.temporal.a) {
            int i = o.a[aVar.ordinal()];
            if (i == 1) {
                throw new p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.b.getTotalSeconds();
            }
            return this.a.h(aVar);
        }
        return j$.time.chrono.c.a(this, aVar);
    }

    @Override // j$.time.temporal.k
    public final long f(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            int i = o.a[((j$.time.temporal.a) lVar).ordinal()];
            if (i == 1) {
                return k();
            }
            if (i == 2) {
                return this.b.getTotalSeconds();
            }
            return this.a.f(lVar);
        }
        return lVar.f(this);
    }

    public final ZoneOffset l() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId e() {
        return this.c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.e b() {
        this.a.w().getClass();
        return j$.time.chrono.f.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final long k() {
        return ((this.a.w().x() * 86400) + r0.a().s()) - this.b.getTotalSeconds();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final h a() {
        return this.a.a();
    }

    @Override // j$.time.temporal.k
    public final Object g(j$.time.temporal.n nVar) {
        j$.time.temporal.m e = j$.time.temporal.j.e();
        LocalDateTime localDateTime = this.a;
        if (nVar != e) {
            if (nVar == j$.time.temporal.j.i() || nVar == j$.time.temporal.j.j()) {
                return this.c;
            }
            if (nVar == j$.time.temporal.j.g()) {
                return this.b;
            }
            if (nVar != j$.time.temporal.j.f()) {
                if (nVar == j$.time.temporal.j.d()) {
                    return b();
                }
                if (nVar == j$.time.temporal.j.h()) {
                    return j$.time.temporal.b.NANOS;
                }
                return nVar.a(this);
            }
            return localDateTime.a();
        }
        return localDateTime.w();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZonedDateTime)) {
            return false;
        }
        ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
        return this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c);
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.toString());
        ZoneOffset zoneOffset = this.b;
        sb.append(zoneOffset.toString());
        String sb2 = sb.toString();
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return sb2;
        }
        return sb2 + '[' + zoneId.toString() + ']';
    }
}
