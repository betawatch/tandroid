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

/* loaded from: classes2.dex */
public final class j implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient f a;
    public final transient ZoneOffset b;
    public final transient ZoneId c;

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long G() {
        return j$.com.android.tools.r8.a.x(this);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int o(j$.time.temporal.o oVar) {
        return j$.com.android.tools.r8.a.l(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object r(j$.time.format.a aVar) {
        return j$.com.android.tools.r8.a.u(this, aVar);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return j$.com.android.tools.r8.a.g(this, chronoZonedDateTime);
    }

    public static j E(ZoneId zoneId, ZoneOffset zoneOffset, f fVar) {
        Objects.requireNonNull(fVar, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new j(zoneId, (ZoneOffset) zoneId, fVar);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime H = LocalDateTime.H(fVar);
        List f = rules.f(H);
        if (f.size() == 1) {
            zoneOffset = (ZoneOffset) f.get(0);
        } else if (f.size() == 0) {
            j$.time.zone.b e = rules.e(H);
            fVar = fVar.I(fVar.a, 0L, 0L, Duration.l(e.d.getTotalSeconds() - e.c.getTotalSeconds(), 0).getSeconds(), 0L);
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

    public static j H(k kVar, Instant instant, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        Objects.requireNonNull(offset, "offset");
        return new j(zoneId, offset, (f) kVar.s(LocalDateTime.K(instant.a, instant.b, offset)));
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s q(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar != j$.time.temporal.a.INSTANT_SECONDS && oVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return ((f) B()).q(oVar);
            }
            return ((j$.time.temporal.a) oVar).b;
        }
        return oVar.r(this);
    }

    public static j x(k kVar, Temporal temporal) {
        j jVar = (j) temporal;
        if (kVar.equals(jVar.b())) {
            return jVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + kVar.getId() + ", actual: " + jVar.b().getId());
    }

    @Override // j$.time.temporal.l
    public final long u(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i = h.a[((j$.time.temporal.a) oVar).ordinal()];
            if (i == 1) {
                return G();
            }
            if (i == 2) {
                return i().getTotalSeconds();
            }
            return ((f) B()).u(oVar);
        }
        return oVar.o(this);
    }

    public j(ZoneId zoneId, ZoneOffset zoneOffset, f fVar) {
        this.a = (f) Objects.requireNonNull(fVar, "dateTime");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
        this.c = (ZoneId) Objects.requireNonNull(zoneId, "zone");
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset i() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final b d() {
        return ((f) B()).d();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.h c() {
        return ((f) B()).c();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime B() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId getZone() {
        return this.c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final k b() {
        return d().b();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime k(ZoneId zoneId) {
        return E(zoneId, this.b, this.a);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime j(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        f fVar = this.a;
        fVar.getClass();
        return H(b(), j$.com.android.tools.r8.a.y(fVar, this.b), zoneId);
    }

    @Override // j$.time.temporal.l
    public final boolean h(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return true;
        }
        return oVar != null && oVar.p(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal e(long j, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return x(b(), oVar.q(this, j));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        int i = i.a[aVar.ordinal()];
        if (i == 1) {
            return f(j - j$.com.android.tools.r8.a.x(this), ChronoUnit.SECONDS);
        }
        ZoneId zoneId = this.c;
        f fVar = this.a;
        if (i != 2) {
            return E(zoneId, this.b, fVar.e(j, oVar));
        }
        ZoneOffset O = ZoneOffset.O(aVar.b.a(j, aVar));
        fVar.getClass();
        return H(b(), j$.com.android.tools.r8.a.y(fVar, O), zoneId);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final j f(long j, j$.time.temporal.q qVar) {
        if (qVar instanceof ChronoUnit) {
            return x(b(), this.a.f(j, qVar).x(this));
        }
        return x(b(), qVar.l(this, j));
    }

    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoZonedDateTime n = b().n(temporal);
        if (qVar instanceof ChronoUnit) {
            return this.a.g(n.j(this.b).B(), qVar);
        }
        Objects.requireNonNull(qVar, "unit");
        return qVar.between(this, n);
    }

    private Object writeReplace() {
        return new D((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && j$.com.android.tools.r8.a.g(this, (ChronoZonedDateTime) obj) == 0;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    public final String toString() {
        String fVar = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = fVar + zoneOffset.c;
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal p(LocalDate localDate) {
        return x(b(), localDate.x(this));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(long j, ChronoUnit chronoUnit) {
        return x(b(), j$.time.temporal.p.b(this, j, chronoUnit));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.I(G(), c().d);
    }
}
