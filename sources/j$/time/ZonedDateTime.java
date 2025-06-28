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

    private ZonedDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneId zoneId) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    public static ZonedDateTime n(LocalDateTime localDateTime, ZoneId zoneId) {
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
            localDateTime = localDateTime.v(e.i().h());
            zoneOffset = e.j();
        } else {
            zoneOffset = (ZoneOffset) f.get(0);
            A.z(zoneOffset, "offset");
        }
        return new ZonedDateTime(localDateTime, zoneOffset, zoneId);
    }

    public static ZonedDateTime o(Instant instant, ZoneId zoneId) {
        A.z(instant, "instant");
        long p = instant.p();
        int q = instant.q();
        ZoneOffset offset = zoneId.getRules().getOffset(Instant.s(p, q));
        return new ZonedDateTime(LocalDateTime.u(p, q, offset), offset, zoneId);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final h a() {
        return this.a.a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.e b() {
        this.a.x().getClass();
        return j$.time.chrono.f.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset c() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final LocalDateTime e() {
        return this.a;
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

    @Override // j$.time.temporal.k
    public final q f(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? (lVar == j$.time.temporal.a.INSTANT_SECONDS || lVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) lVar).f() : this.a.f(lVar) : lVar.j(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId g() {
        return this.c;
    }

    @Override // j$.time.temporal.k
    public final long h(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.h(this);
        }
        int i = o.a[((j$.time.temporal.a) lVar).ordinal()];
        return i != 1 ? i != 2 ? this.a.h(lVar) : this.b.getTotalSeconds() : l();
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.temporal.k
    public final Object i(j$.time.temporal.n nVar) {
        j$.time.temporal.m e = j$.time.temporal.j.e();
        LocalDateTime localDateTime = this.a;
        return nVar == e ? localDateTime.x() : (nVar == j$.time.temporal.j.i() || nVar == j$.time.temporal.j.j()) ? this.c : nVar == j$.time.temporal.j.g() ? this.b : nVar == j$.time.temporal.j.f() ? localDateTime.a() : nVar == j$.time.temporal.j.d() ? b() : nVar == j$.time.temporal.j.h() ? j$.time.temporal.b.NANOS : nVar.a(this);
    }

    @Override // j$.time.temporal.k
    public final int j(j$.time.temporal.a aVar) {
        if (!(aVar instanceof j$.time.temporal.a)) {
            return j$.time.chrono.c.a(this, aVar);
        }
        int i = o.a[aVar.ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.j(aVar) : this.b.getTotalSeconds();
        }
        throw new p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.k
    public final boolean k(j$.time.temporal.l lVar) {
        return (lVar instanceof j$.time.temporal.a) || (lVar != null && lVar.i(this));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final long l() {
        return ((this.a.x().y() * 86400) + r0.a().t()) - this.b.getTotalSeconds();
    }

    @Override // java.lang.Comparable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        int compare = Long.compare(l(), chronoZonedDateTime.l());
        if (compare != 0) {
            return compare;
        }
        LocalDateTime localDateTime = this.a;
        int o = localDateTime.a().o() - chronoZonedDateTime.a().o();
        if (o != 0) {
            return o;
        }
        int compareTo = localDateTime.compareTo(chronoZonedDateTime.e());
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = this.c.getId().compareTo(chronoZonedDateTime.g().getId());
        if (compareTo2 != 0) {
            return compareTo2;
        }
        j$.time.chrono.e b = b();
        j$.time.chrono.e b2 = chronoZonedDateTime.b();
        ((j$.time.chrono.a) b).getClass();
        b2.getClass();
        return 0;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.s(l(), a().o());
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
