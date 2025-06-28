package j$.time;

import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.util.A;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class OffsetDateTime implements j$.time.temporal.k, Comparable<OffsetDateTime>, Serializable {
    private final LocalDateTime a;
    private final ZoneOffset b;

    static {
        LocalDateTime localDateTime = LocalDateTime.c;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        m(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.d;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        m(localDateTime2, zoneOffset2);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        A.z(zoneOffset, "offset");
        this.b = zoneOffset;
    }

    public static OffsetDateTime m(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime n(Instant instant, ZoneId zoneId) {
        A.z(instant, "instant");
        A.z(zoneId, "zone");
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        return new OffsetDateTime(LocalDateTime.u(instant.p(), instant.q(), offset), offset);
    }

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int o;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.b;
        ZoneOffset zoneOffset2 = this.b;
        if (zoneOffset2.equals(zoneOffset)) {
            o = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.a;
            long w = localDateTime.w(zoneOffset2);
            ZoneOffset zoneOffset3 = offsetDateTime2.b;
            LocalDateTime localDateTime2 = offsetDateTime2.a;
            int compare = Long.compare(w, localDateTime2.w(zoneOffset3));
            o = compare == 0 ? localDateTime.a().o() - localDateTime2.a().o() : compare;
        }
        return o == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetDateTime)) {
            return false;
        }
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        return this.a.equals(offsetDateTime.a) && this.b.equals(offsetDateTime.b);
    }

    @Override // j$.time.temporal.k
    public final q f(j$.time.temporal.l lVar) {
        return lVar instanceof j$.time.temporal.a ? (lVar == j$.time.temporal.a.INSTANT_SECONDS || lVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) lVar).f() : this.a.f(lVar) : lVar.j(this);
    }

    @Override // j$.time.temporal.k
    public final long h(j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.h(this);
        }
        int i = k.a[((j$.time.temporal.a) lVar).ordinal()];
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        return i != 1 ? i != 2 ? localDateTime.h(lVar) : zoneOffset.getTotalSeconds() : localDateTime.w(zoneOffset);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.k
    public final Object i(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.g() || nVar == j$.time.temporal.j.i()) {
            return this.b;
        }
        if (nVar == j$.time.temporal.j.j()) {
            return null;
        }
        j$.time.temporal.m e = j$.time.temporal.j.e();
        LocalDateTime localDateTime = this.a;
        return nVar == e ? localDateTime.x() : nVar == j$.time.temporal.j.f() ? localDateTime.a() : nVar == j$.time.temporal.j.d() ? j$.time.chrono.f.a : nVar == j$.time.temporal.j.h() ? j$.time.temporal.b.NANOS : nVar.a(this);
    }

    @Override // j$.time.temporal.k
    public final int j(j$.time.temporal.a aVar) {
        if (!(aVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.j.a(this, aVar);
        }
        int i = k.a[aVar.ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.j(aVar) : this.b.getTotalSeconds();
        }
        throw new p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    @Override // j$.time.temporal.k
    public final boolean k(j$.time.temporal.l lVar) {
        return (lVar instanceof j$.time.temporal.a) || (lVar != null && lVar.i(this));
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    public final String toString() {
        return this.a.toString() + this.b.toString();
    }
}
