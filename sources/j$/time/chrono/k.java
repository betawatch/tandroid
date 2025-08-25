package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
final class k implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    private final transient f a;
    private final transient ZoneOffset b;
    private final transient ZoneId c;

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long A() {
        return h.o(this);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int j(j$.time.temporal.r rVar) {
        return h.e(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ Object u(j$.time.temporal.t tVar) {
        return h.l(this, tVar);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return h.d(this, chronoZonedDateTime);
    }

    static ChronoZonedDateTime B(ZoneId zoneId, ZoneOffset zoneOffset, f fVar) {
        Objects.requireNonNull(fVar, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new k(zoneId, (ZoneOffset) zoneId, fVar);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime C = LocalDateTime.C(fVar);
        List f = rules.f(C);
        if (f.size() == 1) {
            zoneOffset = (ZoneOffset) f.get(0);
        } else if (f.size() == 0) {
            j$.time.zone.b e = rules.e(C);
            fVar = fVar.E(e.l().j());
            zoneOffset = e.m();
        } else if (zoneOffset == null || !f.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) f.get(0);
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new k(zoneId, zoneOffset, fVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) rVar).i();
            }
            return ((f) x()).m(rVar);
        }
        return rVar.r(this);
    }

    static k v(l lVar, j$.time.temporal.m mVar) {
        k kVar = (k) mVar;
        a aVar = (a) lVar;
        if (aVar.equals(kVar.a())) {
            return kVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + aVar.getId() + ", actual: " + kVar.a().getId());
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i = i.a[((j$.time.temporal.a) rVar).ordinal()];
            if (i == 1) {
                return A();
            }
            if (i == 2) {
                return g().getTotalSeconds();
            }
            return ((f) x()).r(rVar);
        }
        return rVar.j(this);
    }

    private k(ZoneId zoneId, ZoneOffset zoneOffset, f fVar) {
        this.a = (f) Objects.requireNonNull(fVar, "dateTime");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
        this.c = (ZoneId) Objects.requireNonNull(zoneId, "zone");
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset g() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final b c() {
        return ((f) x()).c();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.j b() {
        return ((f) x()).b();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime x() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId p() {
        return this.c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final l a() {
        return c().a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime h(ZoneId zoneId) {
        return B(zoneId, this.b, this.a);
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return (rVar instanceof j$.time.temporal.a) || (rVar != null && rVar.l(this));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m d(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return v(a(), rVar.m(this, j));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        int i = j.a[aVar.ordinal()];
        if (i == 1) {
            return e(j - h.o(this), j$.time.temporal.b.SECONDS);
        }
        ZoneId zoneId = this.c;
        f fVar = this.a;
        if (i != 2) {
            return B(zoneId, this.b, fVar.d(j, rVar));
        }
        ZoneOffset I = ZoneOffset.I(aVar.v(j));
        fVar.getClass();
        Instant G = Instant.G(fVar.G(I), fVar.b().G());
        l a = a();
        ZoneOffset offset = zoneId.getRules().getOffset(G);
        Objects.requireNonNull(offset, "offset");
        return new k(zoneId, offset, (f) a.n(LocalDateTime.K(G.D(), G.E(), offset)));
    }

    @Override // j$.time.temporal.m
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final ChronoZonedDateTime e(long j, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            return v(a(), this.a.e(j, uVar).v(this));
        }
        return v(a(), uVar.i(this, j));
    }

    private Object writeReplace() {
        return new E((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(this.b);
        objectOutput.writeObject(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && h.d(this, (ChronoZonedDateTime) obj) == 0;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.hashCode()) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    public final String toString() {
        String fVar = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = fVar + zoneOffset.toString();
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m l(LocalDate localDate) {
        return v(a(), localDate.v(this));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.b bVar) {
        return v(a(), j$.time.temporal.n.b(this, j, bVar));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.G(A(), b().G());
    }
}
