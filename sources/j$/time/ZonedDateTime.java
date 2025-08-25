package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class ZonedDateTime implements j$.time.temporal.m, ChronoZonedDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    private final LocalDateTime a;
    private final ZoneOffset b;
    private final ZoneId c;

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long A() {
        return j$.time.chrono.h.o(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return j$.time.chrono.h.d(this, chronoZonedDateTime);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime x() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.l a() {
        return ((LocalDate) c()).a();
    }

    public static ZonedDateTime B(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
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
            localDateTime = localDateTime.M(e.l().j());
            zoneOffset = e.m();
        } else if (zoneOffset == null || !f.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) Objects.requireNonNull((ZoneOffset) f.get(0), "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    private static ZonedDateTime v(long j, int i, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(Instant.G(j, i));
        return new ZonedDateTime(LocalDateTime.K(j, i, offset), zoneId, offset);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.G(A(), b().G());
    }

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    private ZonedDateTime E(LocalDateTime localDateTime) {
        return B(localDateTime, this.c, this.b);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return (rVar instanceof j$.time.temporal.a) || (rVar != null && rVar.l(this));
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) rVar).i();
            }
            return this.a.m(rVar);
        }
        return rVar.r(this);
    }

    @Override // j$.time.temporal.o
    public final int j(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i = w.a[((j$.time.temporal.a) rVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.v("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.b.getTotalSeconds();
            }
            return this.a.j(rVar);
        }
        return j$.time.chrono.h.e(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.j(this);
        }
        int i = w.a[((j$.time.temporal.a) rVar).ordinal()];
        return i != 1 ? i != 2 ? this.a.r(rVar) : this.b.getTotalSeconds() : j$.time.chrono.h.o(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset g() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId p() {
        return this.c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime h(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.c.equals(zoneId) ? this : B(this.a, zoneId, this.b);
    }

    public final LocalDateTime F() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.b c() {
        return this.a.O();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j b() {
        return this.a.b();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m l(LocalDate localDate) {
        boolean z = localDate instanceof LocalDate;
        LocalDateTime localDateTime = this.a;
        if (z) {
            return E(LocalDateTime.J(localDate, localDateTime.b()));
        }
        localDate.getClass();
        return (ZonedDateTime) j$.time.chrono.h.a(localDate, this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i = w.a[aVar.ordinal()];
            ZoneId zoneId = this.c;
            LocalDateTime localDateTime = this.a;
            if (i == 1) {
                return v(j, localDateTime.D(), zoneId);
            }
            if (i == 2) {
                ZoneOffset I = ZoneOffset.I(aVar.v(j));
                return (I.equals(this.b) || !zoneId.getRules().f(localDateTime).contains(I)) ? this : new ZonedDateTime(localDateTime, zoneId, I);
            }
            return E(localDateTime.d(j, rVar));
        }
        return (ZonedDateTime) rVar.m(this, j);
    }

    @Override // j$.time.temporal.m
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime e(long j, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (ZonedDateTime) uVar.i(this, j);
        }
        j$.time.temporal.b bVar = (j$.time.temporal.b) uVar;
        int compareTo = bVar.compareTo(j$.time.temporal.b.DAYS);
        LocalDateTime localDateTime = this.a;
        if (compareTo >= 0 && bVar != j$.time.temporal.b.FOREVER) {
            return E(localDateTime.e(j, uVar));
        }
        LocalDateTime e = localDateTime.e(j, uVar);
        Objects.requireNonNull(e, "localDateTime");
        ZoneOffset zoneOffset = this.b;
        Objects.requireNonNull(zoneOffset, "offset");
        ZoneId zoneId = this.c;
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId.getRules().f(e).contains(zoneOffset)) {
            return new ZonedDateTime(e, zoneId, zoneOffset);
        }
        e.getClass();
        return v(j$.time.chrono.h.n(e, zoneOffset), e.D(), zoneId);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j, bVar);
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.f()) {
            return this.a.O();
        }
        return j$.time.chrono.h.l(this, tVar);
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
        String localDateTime = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = localDateTime + zoneOffset.toString();
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    private Object writeReplace() {
        return new q((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void G(DataOutput dataOutput) {
        this.a.S(dataOutput);
        this.b.L(dataOutput);
        this.c.E((ObjectOutput) dataOutput);
    }

    static ZonedDateTime D(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.c;
        LocalDate localDate = LocalDate.d;
        LocalDateTime J = LocalDateTime.J(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.Q(objectInput));
        ZoneOffset K = ZoneOffset.K(objectInput);
        ZoneId zoneId = (ZoneId) q.a(objectInput);
        Objects.requireNonNull(J, "localDateTime");
        Objects.requireNonNull(K, "offset");
        Objects.requireNonNull(zoneId, "zone");
        if ((zoneId instanceof ZoneOffset) && !K.equals(zoneId)) {
            throw new IllegalArgumentException("ZoneId must match ZoneOffset");
        }
        return new ZonedDateTime(J, zoneId, K);
    }
}
