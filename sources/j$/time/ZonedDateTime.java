package j$.time;

import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
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
public final class ZonedDateTime implements Temporal, ChronoZonedDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    private final LocalDateTime a;
    private final ZoneOffset b;
    private final ZoneId c;

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long H() {
        return j$.time.chrono.h.o(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return j$.time.chrono.h.d(this, chronoZonedDateTime);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime B() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.l a() {
        return ((LocalDate) c()).a();
    }

    public static ZonedDateTime K(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
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
            localDateTime = localDateTime.T(e.n().l());
            zoneOffset = e.o();
        } else if (zoneOffset == null || !f.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) Objects.requireNonNull((ZoneOffset) f.get(0), "offset");
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public static ZonedDateTime J(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return z(instant.K(), instant.L(), zoneId);
    }

    private static ZonedDateTime z(long j, int i, ZoneId zoneId) {
        ZoneOffset offset = zoneId.getRules().getOffset(Instant.M(j, i));
        return new ZonedDateTime(LocalDateTime.R(j, i, offset), zoneId, offset);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final Instant toInstant() {
        return Instant.M(H(), b().N());
    }

    public static ZonedDateTime I(Temporal temporal) {
        if (temporal instanceof ZonedDateTime) {
            return (ZonedDateTime) temporal;
        }
        try {
            ZoneId I = ZoneId.I(temporal);
            j$.time.temporal.a aVar = j$.time.temporal.a.INSTANT_SECONDS;
            if (!temporal.g(aVar)) {
                return K(LocalDateTime.Q(LocalDate.K(temporal), j.K(temporal)), I, null);
            }
            return z(temporal.s(aVar), temporal.l(j$.time.temporal.a.NANO_OF_SECOND), I);
        } catch (c e) {
            throw new c("Unable to obtain ZonedDateTime from TemporalAccessor: " + temporal + " of type " + temporal.getClass().getName(), e);
        }
    }

    private ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    private ZonedDateTime N(LocalDateTime localDateTime) {
        return K(localDateTime, this.c, this.b);
    }

    @Override // j$.time.temporal.m
    public final boolean g(j$.time.temporal.p pVar) {
        return (pVar instanceof j$.time.temporal.a) || (pVar != null && pVar.n(this));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (pVar == j$.time.temporal.a.INSTANT_SECONDS || pVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) pVar).k();
            }
            return this.a.o(pVar);
        }
        return pVar.s(this);
    }

    @Override // j$.time.temporal.m
    public final int l(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            int i = x.a[((j$.time.temporal.a) pVar).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.t("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.b.getTotalSeconds();
            }
            return this.a.l(pVar);
        }
        return j$.time.chrono.h.e(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final long s(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar.l(this);
        }
        int i = x.a[((j$.time.temporal.a) pVar).ordinal()];
        return i != 1 ? i != 2 ? this.a.s(pVar) : this.b.getTotalSeconds() : j$.time.chrono.h.o(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset h() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId q() {
        return this.c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime j(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.c.equals(zoneId) ? this : K(this.a, zoneId, this.b);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime i(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        if (this.c.equals(zoneId)) {
            return this;
        }
        LocalDateTime localDateTime = this.a;
        localDateTime.getClass();
        return z(j$.time.chrono.h.n(localDateTime, this.b), localDateTime.K(), zoneId);
    }

    public final LocalDateTime O() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public LocalDate c() {
        return this.a.V();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j b() {
        return this.a.b();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(LocalDate localDate) {
        boolean z = localDate instanceof LocalDate;
        LocalDateTime localDateTime = this.a;
        if (z) {
            return N(LocalDateTime.Q(localDate, localDateTime.b()));
        }
        localDate.getClass();
        return (ZonedDateTime) j$.time.chrono.h.a(localDate, this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal d(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
            int i = x.a[aVar.ordinal()];
            ZoneId zoneId = this.c;
            LocalDateTime localDateTime = this.a;
            if (i == 1) {
                return z(j, localDateTime.K(), zoneId);
            }
            if (i == 2) {
                ZoneOffset R = ZoneOffset.R(aVar.z(j));
                return (R.equals(this.b) || !zoneId.getRules().f(localDateTime).contains(R)) ? this : new ZonedDateTime(localDateTime, zoneId, R);
            }
            return N(localDateTime.d(j, pVar));
        }
        return (ZonedDateTime) pVar.o(this, j);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime e(long j, j$.time.temporal.s sVar) {
        if (!(sVar instanceof ChronoUnit)) {
            return (ZonedDateTime) sVar.k(this, j);
        }
        ChronoUnit chronoUnit = (ChronoUnit) sVar;
        boolean z = chronoUnit.compareTo(ChronoUnit.DAYS) >= 0 && chronoUnit != ChronoUnit.FOREVER;
        LocalDateTime localDateTime = this.a;
        if (z) {
            return N(localDateTime.e(j, sVar));
        }
        LocalDateTime e = localDateTime.e(j, sVar);
        Objects.requireNonNull(e, "localDateTime");
        ZoneOffset zoneOffset = this.b;
        Objects.requireNonNull(zoneOffset, "offset");
        ZoneId zoneId = this.c;
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId.getRules().f(e).contains(zoneOffset)) {
            return new ZonedDateTime(e, zoneId, zoneOffset);
        }
        e.getClass();
        return z(j$.time.chrono.h.n(e, zoneOffset), e.K(), zoneId);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.m
    public final Object w(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.f()) {
            return c();
        }
        return j$.time.chrono.h.l(this, rVar);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, j$.time.temporal.s sVar) {
        ZonedDateTime I = I(temporal);
        if (sVar instanceof ChronoUnit) {
            ZonedDateTime i = I.i(this.c);
            ChronoUnit chronoUnit = (ChronoUnit) sVar;
            int compareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
            LocalDateTime localDateTime = this.a;
            LocalDateTime localDateTime2 = i.a;
            if (compareTo >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return localDateTime.f(localDateTime2, sVar);
            }
            return OffsetDateTime.I(localDateTime, this.b).f(OffsetDateTime.I(localDateTime2, i.b), sVar);
        }
        return sVar.between(this, I);
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
        return new r((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void Q(DataOutput dataOutput) {
        this.a.Z(dataOutput);
        this.b.U(dataOutput);
        this.c.M((ObjectOutput) dataOutput);
    }

    static ZonedDateTime M(ObjectInput objectInput) {
        LocalDateTime localDateTime = LocalDateTime.c;
        LocalDate localDate = LocalDate.d;
        LocalDateTime Q = LocalDateTime.Q(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.X(objectInput));
        ZoneOffset T = ZoneOffset.T(objectInput);
        ZoneId zoneId = (ZoneId) r.a(objectInput);
        Objects.requireNonNull(Q, "localDateTime");
        Objects.requireNonNull(T, "offset");
        Objects.requireNonNull(zoneId, "zone");
        if ((zoneId instanceof ZoneOffset) && !T.equals(zoneId)) {
            throw new IllegalArgumentException("ZoneId must match ZoneOffset");
        }
        return new ZonedDateTime(Q, zoneId, T);
    }
}
