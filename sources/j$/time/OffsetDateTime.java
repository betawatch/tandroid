package j$.time;

import j$.time.temporal.p;
import j$.time.temporal.q;
import j$.time.zone.ZoneRules;
import j$.util.A;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class OffsetDateTime implements j$.time.temporal.k, Comparable<OffsetDateTime>, Serializable {
    private final LocalDateTime a;
    private final ZoneOffset b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int n;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.b;
        ZoneOffset zoneOffset2 = this.b;
        if (zoneOffset2.equals(zoneOffset)) {
            n = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.a;
            long v = localDateTime.v(zoneOffset2);
            ZoneOffset zoneOffset3 = offsetDateTime2.b;
            LocalDateTime localDateTime2 = offsetDateTime2.a;
            int compare = Long.compare(v, localDateTime2.v(zoneOffset3));
            n = compare == 0 ? localDateTime.a().n() - localDateTime2.a().n() : compare;
        }
        return n == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : n;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.c;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        l(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.d;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        l(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime l(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime m(Instant instant, ZoneOffset zoneOffset) {
        A.z(instant, "instant");
        A.z(zoneOffset, "zone");
        ZoneOffset offset = ZoneRules.h(zoneOffset).getOffset(instant);
        return new OffsetDateTime(LocalDateTime.t(instant.o(), instant.p(), offset), offset);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        A.z(localDateTime, "dateTime");
        this.a = localDateTime;
        A.z(zoneOffset, "offset");
        this.b = zoneOffset;
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
            int i = k.a[aVar.ordinal()];
            if (i == 1) {
                throw new p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.b.getTotalSeconds();
            }
            return this.a.h(aVar);
        }
        return j$.time.temporal.j.a(this, aVar);
    }

    @Override // j$.time.temporal.k
    public final long f(j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            int i = k.a[((j$.time.temporal.a) lVar).ordinal()];
            ZoneOffset zoneOffset = this.b;
            LocalDateTime localDateTime = this.a;
            if (i == 1) {
                return localDateTime.v(zoneOffset);
            }
            if (i == 2) {
                return zoneOffset.getTotalSeconds();
            }
            return localDateTime.f(lVar);
        }
        return lVar.f(this);
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.temporal.k
    public final Object g(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.g() || nVar == j$.time.temporal.j.i()) {
            return this.b;
        }
        if (nVar == j$.time.temporal.j.j()) {
            return null;
        }
        j$.time.temporal.m e = j$.time.temporal.j.e();
        LocalDateTime localDateTime = this.a;
        if (nVar == e) {
            return localDateTime.w();
        }
        if (nVar == j$.time.temporal.j.f()) {
            return localDateTime.a();
        }
        if (nVar == j$.time.temporal.j.d()) {
            return j$.time.chrono.f.a;
        }
        if (nVar == j$.time.temporal.j.h()) {
            return j$.time.temporal.b.NANOS;
        }
        return nVar.a(this);
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

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + this.b.toString();
    }
}
