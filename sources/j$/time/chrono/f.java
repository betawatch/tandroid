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

/* loaded from: classes2.dex */
public final class f implements ChronoLocalDateTime, Temporal, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient b a;
    public final transient j$.time.h b;

    @Override // java.lang.Comparable
    /* renamed from: C */
    public final /* synthetic */ int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return j$.com.android.tools.r8.a.f(this, chronoLocalDateTime);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object m(j$.time.format.a aVar) {
        return j$.com.android.tools.r8.a.t(this, aVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return j$.com.android.tools.r8.a.w(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ Instant toInstant(ZoneOffset zoneOffset) {
        return j$.com.android.tools.r8.a.y(this, zoneOffset);
    }

    public static f G(k kVar, Temporal temporal) {
        f fVar = (f) temporal;
        if (kVar.equals(fVar.a.a())) {
            return fVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + kVar.getId() + ", actual: " + fVar.a.a().getId());
    }

    public f(b bVar, j$.time.h hVar) {
        Objects.requireNonNull(bVar, "date");
        Objects.requireNonNull(hVar, "time");
        this.a = bVar;
        this.b = hVar;
    }

    public final f K(Temporal temporal, j$.time.h hVar) {
        b bVar = this.a;
        return (bVar == temporal && this.b == hVar) ? this : new f(d.G(bVar.a(), temporal), hVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final k a() {
        return this.a.a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final b f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal w(long j10, ChronoUnit chronoUnit) {
        return G(this.a.a(), j$.time.temporal.p.b(this, j10, chronoUnit));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.h b() {
        return this.b;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar != null && oVar.j(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        return aVar.isDateBased() || aVar.y();
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (!((j$.time.temporal.a) oVar).y()) {
                return this.a.l(oVar);
            }
            j$.time.h hVar = this.b;
            hVar.getClass();
            return j$.time.temporal.p.d(hVar, oVar);
        }
        return oVar.k(this);
    }

    @Override // j$.time.temporal.l
    public final int j(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) oVar).y() ? this.b.j(oVar) : this.a.j(oVar);
        }
        return l(oVar).a(y(oVar), oVar);
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) oVar).y() ? this.b.y(oVar) : this.a.y(oVar);
        }
        return oVar.m(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(LocalDate localDate) {
        if (j$.time.c.b(localDate)) {
            return K(localDate, this.b);
        }
        k a2 = this.a.a();
        localDate.getClass();
        return G(a2, (f) j$.com.android.tools.r8.a.a(localDate, this));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final f c(long j10, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (((j$.time.temporal.a) oVar).y()) {
                return K(this.a, this.b.c(j10, oVar));
            }
            return K(this.a.c(j10, oVar), this.b);
        }
        return G(this.a.a(), oVar.q(this, j10));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final f d(long j10, j$.time.temporal.q qVar) {
        if (!(qVar instanceof ChronoUnit)) {
            return G(this.a.a(), qVar.j(this, j10));
        }
        switch (e.a[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return I(this.a, 0L, 0L, 0L, j10);
            case 2:
                f K = K(this.a.d(j10 / 86400000000L, (j$.time.temporal.q) ChronoUnit.DAYS), this.b);
                return K.I(K.a, 0L, 0L, 0L, (j10 % 86400000000L) * 1000);
            case 3:
                f K2 = K(this.a.d(j10 / 86400000, (j$.time.temporal.q) ChronoUnit.DAYS), this.b);
                return K2.I(K2.a, 0L, 0L, 0L, (j10 % 86400000) * 1000000);
            case 4:
                return I(this.a, 0L, 0L, j10, 0L);
            case 5:
                return I(this.a, 0L, j10, 0L, 0L);
            case 6:
                return I(this.a, j10, 0L, 0L, 0L);
            case 7:
                f K3 = K(this.a.d(j10 / 256, (j$.time.temporal.q) ChronoUnit.DAYS), this.b);
                return K3.I(K3.a, (j10 % 256) * 12, 0L, 0L, 0L);
            default:
                return K(this.a.d(j10, qVar), this.b);
        }
    }

    public final f I(b bVar, long j10, long j11, long j12, long j13) {
        if ((j10 | j11 | j12 | j13) == 0) {
            return K(bVar, this.b);
        }
        long j14 = j10 / 24;
        long j15 = ((j10 % 24) * 3600000000000L) + ((j11 % 1440) * 60000000000L) + ((j12 % 86400) * 1000000000) + (j13 % 86400000000000L);
        long R = this.b.R();
        long j16 = j15 + R;
        long S = j$.com.android.tools.r8.a.S(j16, 86400000000000L) + j14 + (j11 / 1440) + (j12 / 86400) + (j13 / 86400000000000L);
        long R2 = j$.com.android.tools.r8.a.R(j16, 86400000000000L);
        return K(bVar.d(S, (j$.time.temporal.q) ChronoUnit.DAYS), R2 == R ? this.b : j$.time.h.K(R2));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime n(ZoneOffset zoneOffset) {
        return j.G(zoneOffset, null, this);
    }

    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        Objects.requireNonNull(temporal, "endExclusive");
        ChronoLocalDateTime B = this.a.a().B(temporal);
        if (!(qVar instanceof ChronoUnit)) {
            Objects.requireNonNull(qVar, "unit");
            return qVar.between(this, B);
        }
        ChronoUnit chronoUnit = (ChronoUnit) qVar;
        ChronoUnit chronoUnit2 = ChronoUnit.DAYS;
        if (chronoUnit.compareTo(chronoUnit2) >= 0) {
            b f9 = B.f();
            if (B.b().compareTo(this.b) < 0) {
                f9 = f9.w(1L, chronoUnit2);
            }
            return this.a.g(f9, qVar);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        long y8 = B.y(aVar) - this.a.y(aVar);
        switch (e.a[chronoUnit.ordinal()]) {
            case 1:
                y8 = j$.com.android.tools.r8.a.T(y8, 86400000000000L);
                break;
            case 2:
                y8 = j$.com.android.tools.r8.a.T(y8, 86400000000L);
                break;
            case 3:
                y8 = j$.com.android.tools.r8.a.T(y8, 86400000L);
                break;
            case 4:
                y8 = j$.com.android.tools.r8.a.T(y8, 86400);
                break;
            case 5:
                y8 = j$.com.android.tools.r8.a.T(y8, 1440);
                break;
            case 6:
                y8 = j$.com.android.tools.r8.a.T(y8, 24);
                break;
            case 7:
                y8 = j$.com.android.tools.r8.a.T(y8, 2);
                break;
        }
        return j$.com.android.tools.r8.a.O(y8, this.b.g(B.b(), qVar));
    }

    @Override // j$.time.temporal.m
    public final Temporal q(Temporal temporal) {
        return temporal.c(f().z(), j$.time.temporal.a.EPOCH_DAY).c(b().R(), j$.time.temporal.a.NANO_OF_DAY);
    }

    private Object writeReplace() {
        return new d0((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && j$.com.android.tools.r8.a.f(this, (ChronoLocalDateTime) obj) == 0;
    }
}
