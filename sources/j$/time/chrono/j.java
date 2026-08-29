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
    public final /* synthetic */ long F() {
        return j$.com.android.tools.r8.a.x(this);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int j(j$.time.temporal.o oVar) {
        return j$.com.android.tools.r8.a.l(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object m(j$.time.format.a aVar) {
        return j$.com.android.tools.r8.a.u(this, aVar);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return j$.com.android.tools.r8.a.g(this, chronoZonedDateTime);
    }

    public static j G(ZoneId zoneId, ZoneOffset zoneOffset, f fVar) {
        Objects.requireNonNull(fVar, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new j(zoneId, (ZoneOffset) zoneId, fVar);
        }
        ZoneRules rules = zoneId.getRules();
        LocalDateTime H = LocalDateTime.H(fVar);
        List f9 = rules.f(H);
        if (f9.size() == 1) {
            zoneOffset = (ZoneOffset) f9.get(0);
        } else if (f9.size() == 0) {
            j$.time.zone.b e10 = rules.e(H);
            fVar = fVar.I(fVar.a, 0L, 0L, Duration.j(e10.d.getTotalSeconds() - e10.c.getTotalSeconds(), 0).getSeconds(), 0L);
            zoneOffset = e10.d;
        } else {
            if (zoneOffset == null || !f9.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) f9.get(0);
            }
            fVar = fVar;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new j(zoneId, zoneOffset, fVar);
    }

    public static j H(k kVar, Instant instant, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(instant);
        Objects.requireNonNull(offset, "offset");
        return new j(zoneId, offset, (f) kVar.B(LocalDateTime.K(instant.a, instant.b, offset)));
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (oVar != j$.time.temporal.a.INSTANT_SECONDS && oVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return ((f) r()).l(oVar);
            }
            return ((j$.time.temporal.a) oVar).b;
        }
        return oVar.k(this);
    }

    public static j q(k kVar, Temporal temporal) {
        j jVar = (j) temporal;
        if (kVar.equals(jVar.a())) {
            return jVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + kVar.getId() + ", actual: " + jVar.a().getId());
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            int i10 = h.a[((j$.time.temporal.a) oVar).ordinal()];
            if (i10 == 1) {
                return F();
            }
            if (i10 == 2) {
                return h().getTotalSeconds();
            }
            return ((f) r()).y(oVar);
        }
        return oVar.m(this);
    }

    public j(ZoneId zoneId, ZoneOffset zoneOffset, f fVar) {
        this.a = (f) Objects.requireNonNull(fVar, "dateTime");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
        this.c = (ZoneId) Objects.requireNonNull(zoneId, "zone");
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset h() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final b f() {
        return ((f) r()).f();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.h b() {
        return ((f) r()).b();
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime r() {
        return this.a;
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

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId getZone() {
        return this.c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final k a() {
        return f().a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime v(ZoneId zoneId) {
        return G(zoneId, this.b, this.a);
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
        return H(a(), j$.com.android.tools.r8.a.y(fVar, zoneOffset), zoneId);
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return true;
        }
        return oVar != null && oVar.j(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal c(long j10, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return q(a(), oVar.q(this, j10));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        int i10 = i.a[aVar.ordinal()];
        if (i10 == 1) {
            return d(j10 - j$.com.android.tools.r8.a.x(this), ChronoUnit.SECONDS);
        }
        if (i10 != 2) {
            return G(this.c, this.b, this.a.c(j10, oVar));
        }
        ZoneOffset O = ZoneOffset.O(aVar.b.a(j10, aVar));
        f fVar = this.a;
        fVar.getClass();
        return H(a(), j$.com.android.tools.r8.a.y(fVar, O), this.c);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final j d(long j10, j$.time.temporal.q qVar) {
        if (qVar instanceof ChronoUnit) {
            return q(a(), this.a.d(j10, qVar).q(this));
        }
        return q(a(), qVar.j(this, j10));
    }

    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoZonedDateTime p10 = a().p(temporal);
        if (qVar instanceof ChronoUnit) {
            return this.a.g(p10.i(this.b).r(), qVar);
        }
        Objects.requireNonNull(qVar, "unit");
        return qVar.between(this, p10);
    }

    private Object writeReplace() {
        return new d0((byte) 3, this);
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

    @Override // j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        return q(a(), localDate.q(this));
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal w(long j10, ChronoUnit chronoUnit) {
        return q(a(), j$.time.temporal.p.b(this, j10, chronoUnit));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.I(F(), b().d);
    }
}
