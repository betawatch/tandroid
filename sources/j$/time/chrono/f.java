package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes4.dex */
public final class f implements ChronoLocalDateTime, Temporal, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient b a;
    public final transient j$.time.j b;

    public f(b bVar, j$.time.j jVar) {
        Objects.requireNonNull(bVar, "date");
        Objects.requireNonNull(jVar, "time");
        this.a = bVar;
        this.b = jVar;
    }

    public static f o(a aVar, Temporal temporal) {
        f fVar = (f) temporal;
        if (aVar.equals(fVar.a.a())) {
            return fVar;
        }
        j$.time.g.k("Chronology mismatch, required: ", aVar.n(), fVar.a.a().n());
        return null;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new c0((byte) 2, this);
    }

    @Override // java.lang.Comparable
    /* renamed from: B */
    public final /* synthetic */ int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return j$.time.a.e(this, chronoLocalDateTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final a a() {
        return this.a.a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.j b() {
        return this.b;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar != null && oVar.j(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        return aVar.isDateBased() || aVar.q();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && j$.time.a.e(this, (ChronoLocalDateTime) obj) == 0;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final b f() {
        return this.a;
    }

    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoLocalDateTime o = this.a.a().o(temporal);
        if (!(qVar instanceof ChronoUnit)) {
            Objects.requireNonNull(qVar, "unit");
            return qVar.between(this, o);
        }
        ChronoUnit chronoUnit = (ChronoUnit) qVar;
        ChronoUnit chronoUnit2 = ChronoUnit.DAYS;
        if (chronoUnit.compareTo(chronoUnit2) >= 0) {
            b f = o.f();
            if (o.b().compareTo(this.b) < 0) {
                f = f.u(1L, chronoUnit2);
            }
            return this.a.g(f, qVar);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        long y = o.y(aVar) - this.a.y(aVar);
        switch (e.a[chronoUnit.ordinal()]) {
            case 1:
                y = j$.time.a.R(y, 86400000000000L);
                break;
            case 2:
                y = j$.time.a.R(y, 86400000000L);
                break;
            case 3:
                y = j$.time.a.R(y, 86400000L);
                break;
            case 4:
                y = j$.time.a.R(y, 86400L);
                break;
            case 5:
                y = j$.time.a.R(y, 1440L);
                break;
            case 6:
                y = j$.time.a.R(y, 24L);
                break;
            case 7:
                y = j$.time.a.R(y, 2L);
                break;
        }
        return j$.time.a.N(y, this.b.g(o.b(), qVar));
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) oVar).q() ? this.b.j(oVar) : this.a.j(oVar) : l(oVar).a(y(oVar), oVar);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        if (j$.time.d.b(localDate)) {
            return x(localDate, this.b);
        }
        a a = this.a.a();
        localDate.getClass();
        return o(a, (f) j$.time.a.a(localDate, this));
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar.k(this);
        }
        if (!((j$.time.temporal.a) oVar).q()) {
            return this.a.l(oVar);
        }
        j$.time.j jVar = this.b;
        jVar.getClass();
        return j$.time.temporal.p.d(jVar, oVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime m(ZoneOffset zoneOffset) {
        return j.o(zoneOffset, null, this);
    }

    @Override // j$.time.temporal.m
    public final Temporal n(Temporal temporal) {
        return temporal.c(f().z(), j$.time.temporal.a.EPOCH_DAY).c(b().K(), j$.time.temporal.a.NANO_OF_DAY);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final f d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return o(this.a.a(), qVar.j(this, j));
        }
        switch (e.a[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return v(this.a, 0L, 0L, 0L, j);
            case 2:
                f x = x(this.a.d(j / 86400000000L, (j$.time.temporal.q) ChronoUnit.DAYS), this.b);
                return x.v(x.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                f x2 = x(this.a.d(j / 86400000, (j$.time.temporal.q) ChronoUnit.DAYS), this.b);
                return x2.v(x2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return v(this.a, 0L, 0L, j, 0L);
            case 5:
                return v(this.a, 0L, j, 0L, 0L);
            case 6:
                return v(this.a, j, 0L, 0L, 0L);
            case 7:
                f x3 = x(this.a.d(j / 256, (j$.time.temporal.q) ChronoUnit.DAYS), this.b);
                return x3.v(x3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return x(this.a.d(j, qVar), this.b);
        }
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object r(j$.time.format.a aVar) {
        return j$.time.a.s(this, aVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return j$.time.a.v(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ Instant toInstant(ZoneOffset zoneOffset) {
        return j$.time.a.x(this, zoneOffset);
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal u(long j, ChronoUnit chronoUnit) {
        return o(this.a.a(), j$.time.temporal.p.b(this, j, chronoUnit));
    }

    public final f v(b bVar, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j$.time.j jVar = this.b;
        if (j5 == 0) {
            return x(bVar, jVar);
        }
        long j6 = j / 24;
        long K = jVar.K();
        long j7 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L) + K;
        long Q = j$.time.a.Q(j7, 86400000000000L) + j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long P = j$.time.a.P(j7, 86400000000000L);
        return x(bVar.d(Q, (j$.time.temporal.q) ChronoUnit.DAYS), P == K ? this.b : j$.time.j.x(P));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final f c(long j, j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return o(this.a.a(), oVar.n(this, j));
        }
        boolean q = ((j$.time.temporal.a) oVar).q();
        b bVar = this.a;
        return q ? x(bVar, this.b.c(j, oVar)) : x(bVar.c(j, oVar), this.b);
    }

    public final f x(Temporal temporal, j$.time.j jVar) {
        b bVar = this.a;
        return (bVar == temporal && this.b == jVar) ? this : new f(d.o(bVar.a(), temporal), jVar);
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        return oVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) oVar).q() ? this.b.y(oVar) : this.a.y(oVar) : oVar.l(this);
    }
}
