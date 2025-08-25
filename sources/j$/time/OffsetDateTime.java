package j$.time;

import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class OffsetDateTime implements j$.time.temporal.m, j$.time.temporal.p, Comparable<OffsetDateTime>, Serializable {
    private static final long serialVersionUID = 2287754244819255394L;
    private final LocalDateTime a;
    private final ZoneOffset b;

    @Override // java.lang.Comparable
    public final int compareTo(OffsetDateTime offsetDateTime) {
        int G;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        ZoneOffset zoneOffset = offsetDateTime2.b;
        ZoneOffset zoneOffset2 = this.b;
        if (zoneOffset2.equals(zoneOffset)) {
            G = toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime());
        } else {
            LocalDateTime localDateTime = this.a;
            localDateTime.getClass();
            long n = j$.time.chrono.h.n(localDateTime, zoneOffset2);
            LocalDateTime localDateTime2 = offsetDateTime2.a;
            localDateTime2.getClass();
            int compare = Long.compare(n, j$.time.chrono.h.n(localDateTime2, offsetDateTime2.b));
            G = compare == 0 ? localDateTime.b().G() - localDateTime2.b().G() : compare;
        }
        return G == 0 ? toLocalDateTime().compareTo(offsetDateTime2.toLocalDateTime()) : G;
    }

    static {
        LocalDateTime localDateTime = LocalDateTime.c;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localDateTime.getClass();
        B(localDateTime, zoneOffset);
        LocalDateTime localDateTime2 = LocalDateTime.d;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localDateTime2.getClass();
        B(localDateTime2, zoneOffset2);
    }

    public static OffsetDateTime B(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return new OffsetDateTime(localDateTime, zoneOffset);
    }

    public static OffsetDateTime C(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        return new OffsetDateTime(LocalDateTime.K(instant.D(), instant.E(), offset), offset);
    }

    private OffsetDateTime(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        this.a = (LocalDateTime) Objects.requireNonNull(localDateTime, "dateTime");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    private OffsetDateTime F(LocalDateTime localDateTime, ZoneOffset zoneOffset) {
        return (this.a == localDateTime && this.b.equals(zoneOffset)) ? this : new OffsetDateTime(localDateTime, zoneOffset);
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
            int i = o.a[((j$.time.temporal.a) rVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.v("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.b.getTotalSeconds();
            }
            return this.a.j(rVar);
        }
        return j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.j(this);
        }
        int i = o.a[((j$.time.temporal.a) rVar).ordinal()];
        ZoneOffset zoneOffset = this.b;
        LocalDateTime localDateTime = this.a;
        if (i != 1) {
            return i != 2 ? localDateTime.r(rVar) : zoneOffset.getTotalSeconds();
        }
        localDateTime.getClass();
        return j$.time.chrono.h.n(localDateTime, zoneOffset);
    }

    public final ZoneOffset g() {
        return this.b;
    }

    public LocalDateTime toLocalDateTime() {
        return this.a;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m l(LocalDate localDate) {
        boolean z = localDate instanceof LocalDate;
        LocalDateTime localDateTime = this.a;
        ZoneOffset zoneOffset = this.b;
        if (z) {
            return F(localDateTime.l(localDate), zoneOffset);
        }
        localDate.getClass();
        return (OffsetDateTime) j$.time.chrono.h.a(localDate, this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i = o.a[aVar.ordinal()];
            ZoneOffset zoneOffset = this.b;
            LocalDateTime localDateTime = this.a;
            if (i == 1) {
                return C(Instant.G(j, localDateTime.D()), zoneOffset);
            }
            if (i == 2) {
                return F(localDateTime, ZoneOffset.I(aVar.v(j)));
            }
            return F(localDateTime.d(j, rVar), zoneOffset);
        }
        return (OffsetDateTime) rVar.m(this, j);
    }

    @Override // j$.time.temporal.m
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final OffsetDateTime e(long j, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            return F(this.a.e(j, uVar), this.b);
        }
        return (OffsetDateTime) uVar.i(this, j);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.b bVar) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, bVar).e(1L, bVar) : e(-j, bVar);
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.j()) {
            return this.b;
        }
        if (tVar == j$.time.temporal.n.k()) {
            return null;
        }
        j$.time.temporal.t f = j$.time.temporal.n.f();
        LocalDateTime localDateTime = this.a;
        if (tVar == f) {
            return localDateTime.O();
        }
        if (tVar == j$.time.temporal.n.g()) {
            return localDateTime.b();
        }
        if (tVar == j$.time.temporal.n.e()) {
            return j$.time.chrono.s.d;
        }
        if (tVar == j$.time.temporal.n.i()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.a(this);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        LocalDateTime localDateTime = this.a;
        return mVar.d(localDateTime.O().s(), aVar).d(localDateTime.b().R(), j$.time.temporal.a.NANO_OF_DAY).d(this.b.getTotalSeconds(), j$.time.temporal.a.OFFSET_SECONDS);
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

    private Object writeReplace() {
        return new q((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.a.S(objectOutput);
        this.b.L(objectOutput);
    }

    static OffsetDateTime E(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.c;
        LocalDate localDate = LocalDate.d;
        return new OffsetDateTime(LocalDateTime.J(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.Q(objectInput)), ZoneOffset.K(objectInput));
    }
}
