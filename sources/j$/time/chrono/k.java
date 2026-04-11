package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
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
    public final /* synthetic */ long H() {
        return h.o(this);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ int l(j$.time.temporal.p pVar) {
        return h.e(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Object w(j$.time.temporal.r rVar) {
        return h.l(this, rVar);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return h.d(this, chronoZonedDateTime);
    }

    static ChronoZonedDateTime I(ZoneId zoneId, ZoneOffset zoneOffset, f fVar) {
        Objects.requireNonNull(fVar, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new k(zoneId, (ZoneOffset) zoneId, fVar);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime J = LocalDateTime.J(fVar);
        List f = rules.f(J);
        if (f.size() == 1) {
            zoneOffset = (ZoneOffset) f.get(0);
        } else if (f.size() == 0) {
            j$.time.zone.b e = rules.e(J);
            fVar = fVar.L(e.n().l());
            zoneOffset = e.o();
        } else if (zoneOffset == null || !f.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) f.get(0);
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new k(zoneId, zoneOffset, fVar);
    }

    static k J(l lVar, Instant instant, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        Objects.requireNonNull(offset, "offset");
        return new k(zoneId, offset, (f) lVar.x(LocalDateTime.R(instant.K(), instant.L(), offset)));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) pVar).k();
            }
            return ((f) B()).o(pVar);
        }
        return pVar.s(this);
    }

    static k z(l lVar, Temporal temporal) {
        k kVar = (k) temporal;
        a aVar = (a) lVar;
        if (aVar.equals(kVar.a())) {
            return kVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + aVar.getId() + ", actual: " + kVar.a().getId());
    }

    @Override // j$.time.temporal.m
    public final long s(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i = i.a[((j$.time.temporal.a) pVar).ordinal()];
            if (i == 1) {
                return H();
            }
            if (i == 2) {
                return h().getTotalSeconds();
            }
            return ((f) B()).s(pVar);
        }
        return pVar.l(this);
    }

    private k(ZoneId zoneId, ZoneOffset zoneOffset, f fVar) {
        this.a = (f) Objects.requireNonNull(fVar, "dateTime");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
        this.c = (ZoneId) Objects.requireNonNull(zoneId, "zone");
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset h() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final b c() {
        return ((f) B()).c();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.j b() {
        return ((f) B()).b();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime B() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId q() {
        return this.c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final l a() {
        return c().a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime j(ZoneId zoneId) {
        return I(zoneId, this.b, this.a);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime i(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        f fVar = this.a;
        fVar.getClass();
        return J(a(), h.p(fVar, this.b), zoneId);
    }

    @Override // j$.time.temporal.m
    public final boolean g(j$.time.temporal.p pVar) {
        return (pVar instanceof j$.time.temporal.a) || (pVar != null && pVar.n(this));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return z(a(), pVar.o(this, j));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        int i = j.a[aVar.ordinal()];
        if (i == 1) {
            return e(j - h.o(this), ChronoUnit.SECONDS);
        }
        ZoneId zoneId = this.c;
        f fVar = this.a;
        if (i != 2) {
            return I(zoneId, this.b, fVar.d(j, pVar));
        }
        ZoneOffset R = ZoneOffset.R(aVar.z(j));
        fVar.getClass();
        return J(a(), h.p(fVar, R), zoneId);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final ChronoZonedDateTime e(long j, j$.time.temporal.s sVar) {
        if (sVar instanceof ChronoUnit) {
            return z(a(), this.a.e(j, sVar).z(this));
        }
        return z(a(), sVar.k(this, j));
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, j$.time.temporal.s sVar) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoZonedDateTime v = a().v(temporal);
        if (sVar instanceof ChronoUnit) {
            return this.a.f(v.i(this.b).B(), sVar);
        }
        Objects.requireNonNull(sVar, "unit");
        return sVar.between(this, v);
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

    @Override // j$.time.temporal.Temporal
    public final Temporal n(LocalDate localDate) {
        return z(a(), localDate.z(this));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        return z(a(), j$.time.temporal.l.b(this, j, chronoUnit));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.M(H(), b().N());
    }
}
