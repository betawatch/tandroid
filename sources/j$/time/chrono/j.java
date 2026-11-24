package j$.time.chrono;

import j$.time.Duration;
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
import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes4.dex */
public final class j implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient f a;
    public final transient ZoneOffset b;
    public final transient ZoneId c;

    public j(ZoneId zoneId, ZoneOffset zoneOffset, f fVar) {
        this.a = (f) Objects.requireNonNull(fVar, "dateTime");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
        this.c = (ZoneId) Objects.requireNonNull(zoneId, "zone");
    }

    public static j n(a aVar, Temporal temporal) {
        j jVar = (j) temporal;
        if (aVar.equals(jVar.a())) {
            return jVar;
        }
        j$.time.g.k("Chronology mismatch, required: ", aVar.n(), jVar.a().n());
        return null;
    }

    public static j o(ZoneId zoneId, ZoneOffset zoneOffset, f fVar) {
        Objects.requireNonNull(fVar, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new j(zoneId, (ZoneOffset) zoneId, fVar);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime q = LocalDateTime.q(fVar);
        List f = rules.f(q);
        if (f.size() == 1) {
            zoneOffset = (ZoneOffset) f.get(0);
        } else if (f.size() == 0) {
            j$.time.zone.b e = rules.e(q);
            fVar = fVar.v(fVar.a, 0L, 0L, Duration.j(e.d.getTotalSeconds() - e.c.getTotalSeconds(), 0).getSeconds(), 0L);
            zoneOffset = e.d;
        } else {
            if (zoneOffset == null || !f.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) f.get(0);
            }
            fVar = fVar;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new j(zoneId, zoneOffset, fVar);
    }

    public static j q(a aVar, Instant instant, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        Objects.requireNonNull(offset, "offset");
        return new j(zoneId, offset, (f) aVar.o(LocalDateTime.x(instant.a, instant.b, offset)));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new c0((byte) 3, this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long E() {
        return j$.time.a.w(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final a a() {
        return this.a.a.a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.j b() {
        return ((f) p()).b();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return n(a(), oVar.n(this, j));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        int i = i.a[aVar.ordinal()];
        if (i == 1) {
            return d(j - j$.time.a.w(this), ChronoUnit.SECONDS);
        }
        if (i != 2) {
            return o(this.c, this.b, this.a.c(j, oVar));
        }
        ZoneOffset H = ZoneOffset.H(aVar.b.a(j, aVar));
        f fVar = this.a;
        fVar.getClass();
        return q(a(), j$.time.a.x(fVar, H), this.c);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return j$.time.a.f(this, chronoZonedDateTime);
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return true;
        }
        return oVar != null && oVar.j(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && j$.time.a.f(this, (ChronoZonedDateTime) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final b f() {
        return this.a.a;
    }

    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoZonedDateTime w = a().w(temporal);
        if (qVar instanceof ChronoUnit) {
            return this.a.g(w.i(this.b).p(), qVar);
        }
        Objects.requireNonNull(qVar, "unit");
        return qVar.between(this, w);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId getZone() {
        return this.c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset h() {
        return this.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime i(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        f fVar = this.a;
        ZoneOffset zoneOffset = this.b;
        fVar.getClass();
        return q(a(), j$.time.a.x(fVar, zoneOffset), zoneId);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int j(j$.time.temporal.o oVar) {
        return j$.time.a.k(this, oVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        return n(a(), localDate.n(this));
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? (oVar == j$.time.temporal.a.INSTANT_SECONDS || oVar == j$.time.temporal.a.OFFSET_SECONDS) ? ((j$.time.temporal.a) oVar).b : this.a.l(oVar) : oVar.k(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime p() {
        return this.a;
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object r(j$.time.format.a aVar) {
        return j$.time.a.t(this, aVar);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime t(ZoneId zoneId) {
        return o(zoneId, this.b, this.a);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.v(E(), b().d);
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

    @Override // j$.time.temporal.Temporal
    public final Temporal u(long j, ChronoUnit chronoUnit) {
        return n(a(), j$.time.temporal.p.b(this, j, chronoUnit));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final j d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return n(a(), qVar.j(this, j));
        }
        return n(a(), this.a.d(j, qVar).n(this));
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.l(this);
        }
        int i = h.a[((j$.time.temporal.a) oVar).ordinal()];
        return i != 1 ? i != 2 ? ((f) p()).y(oVar) : h().getTotalSeconds() : E();
    }
}
