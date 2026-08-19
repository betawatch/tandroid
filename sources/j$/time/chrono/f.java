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

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object r(j$.time.format.a aVar) {
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

    @Override // java.lang.Comparable
    /* renamed from: z */
    public final /* synthetic */ int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return j$.com.android.tools.r8.a.f(this, chronoLocalDateTime);
    }

    public static f E(k kVar, Temporal temporal) {
        f fVar = (f) temporal;
        if (kVar.equals(fVar.a.b())) {
            return fVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + kVar.getId() + ", actual: " + fVar.a.b().getId());
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final k b() {
        return this.a.b();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal l(long j, ChronoUnit chronoUnit) {
        return E(this.a.b(), j$.time.temporal.p.b(this, j, chronoUnit));
    }

    public f(b bVar, j$.time.h hVar) {
        Objects.requireNonNull(bVar, "date");
        Objects.requireNonNull(hVar, "time");
        this.a = bVar;
        this.b = hVar;
    }

    public final f K(Temporal temporal, j$.time.h hVar) {
        b bVar = this.a;
        return (bVar == temporal && this.b == hVar) ? this : new f(d.E(bVar.b(), temporal), hVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final b d() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.h c() {
        return this.b;
    }

    @Override // j$.time.temporal.l
    public final boolean h(j$.time.temporal.o oVar) {
        if (!(oVar instanceof j$.time.temporal.a)) {
            return oVar != null && oVar.p(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) oVar;
        return aVar.u() || aVar.E();
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s q(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            if (!((j$.time.temporal.a) oVar).E()) {
                return this.a.q(oVar);
            }
            j$.time.h hVar = this.b;
            hVar.getClass();
            return j$.time.temporal.p.d(hVar, oVar);
        }
        return oVar.r(this);
    }

    @Override // j$.time.temporal.l
    public final int o(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) oVar).E() ? this.b.o(oVar) : this.a.o(oVar);
        }
        return q(oVar).a(u(oVar), oVar);
    }

    @Override // j$.time.temporal.l
    public final long u(j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) oVar).E() ? this.b.u(oVar) : this.a.u(oVar);
        }
        return oVar.o(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal p(LocalDate localDate) {
        if (j$.time.c.b(localDate)) {
            return K(localDate, this.b);
        }
        k b = this.a.b();
        localDate.getClass();
        return E(b, (f) j$.com.android.tools.r8.a.a(localDate, this));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final f e(long j, j$.time.temporal.o oVar) {
        boolean z = oVar instanceof j$.time.temporal.a;
        b bVar = this.a;
        if (z) {
            boolean E = ((j$.time.temporal.a) oVar).E();
            j$.time.h hVar = this.b;
            if (E) {
                return K(bVar, hVar.e(j, oVar));
            }
            return K(bVar.e(j, oVar), hVar);
        }
        return E(bVar.b(), oVar.q(this, j));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final f f(long j, j$.time.temporal.q qVar) {
        boolean z = qVar instanceof ChronoUnit;
        b bVar = this.a;
        if (z) {
            int i = e.a[((ChronoUnit) qVar).ordinal()];
            j$.time.h hVar = this.b;
            switch (i) {
                case 1:
                    return I(this.a, 0L, 0L, 0L, j);
                case 2:
                    f K = K(bVar.f(j / 86400000000L, (j$.time.temporal.q) ChronoUnit.DAYS), hVar);
                    return K.I(K.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    f K2 = K(bVar.f(j / 86400000, (j$.time.temporal.q) ChronoUnit.DAYS), hVar);
                    return K2.I(K2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return I(this.a, 0L, 0L, j, 0L);
                case 5:
                    return I(this.a, 0L, j, 0L, 0L);
                case 6:
                    return I(this.a, j, 0L, 0L, 0L);
                case 7:
                    f K3 = K(bVar.f(j / 256, (j$.time.temporal.q) ChronoUnit.DAYS), hVar);
                    return K3.I(K3.a, (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return K(bVar.f(j, qVar), hVar);
            }
        }
        return E(bVar.b(), qVar.l(this, j));
    }

    public final f I(b bVar, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j$.time.h hVar = this.b;
        if (j5 == 0) {
            return K(bVar, hVar);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long R = hVar.R();
        long j10 = j9 + R;
        long S = j$.com.android.tools.r8.a.S(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long R2 = j$.com.android.tools.r8.a.R(j10, 86400000000000L);
        if (R2 != R) {
            hVar = j$.time.h.K(R2);
        }
        return K(bVar.f(S, (j$.time.temporal.q) ChronoUnit.DAYS), hVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime t(ZoneOffset zoneOffset) {
        return j.E(zoneOffset, null, this);
    }

    @Override // j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        Objects.requireNonNull(temporal, "endExclusive");
        b bVar = this.a;
        ChronoLocalDateTime s = bVar.b().s(temporal);
        if (!(qVar instanceof ChronoUnit)) {
            Objects.requireNonNull(qVar, "unit");
            return qVar.between(this, s);
        }
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        boolean z = ((ChronoUnit) qVar).compareTo(chronoUnit) < 0;
        j$.time.h hVar = this.b;
        if (!z) {
            b d = s.d();
            if (s.c().compareTo(hVar) < 0) {
                d = d.l(1L, chronoUnit);
            }
            return bVar.g(d, qVar);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        long u = s.u(aVar) - bVar.u(aVar);
        switch (e.a[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                u = j$.com.android.tools.r8.a.T(u, 86400000000000L);
                break;
            case 2:
                u = j$.com.android.tools.r8.a.T(u, 86400000000L);
                break;
            case 3:
                u = j$.com.android.tools.r8.a.T(u, 86400000L);
                break;
            case 4:
                u = j$.com.android.tools.r8.a.T(u, 86400);
                break;
            case 5:
                u = j$.com.android.tools.r8.a.T(u, 1440);
                break;
            case 6:
                u = j$.com.android.tools.r8.a.T(u, 24);
                break;
            case 7:
                u = j$.com.android.tools.r8.a.T(u, 2);
                break;
        }
        return j$.com.android.tools.r8.a.O(u, hVar.g(s.c(), qVar));
    }

    @Override // j$.time.temporal.m
    public final Temporal x(Temporal temporal) {
        return temporal.e(d().v(), j$.time.temporal.a.EPOCH_DAY).e(c().R(), j$.time.temporal.a.NANO_OF_DAY);
    }

    private Object writeReplace() {
        return new D((byte) 2, this);
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

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }
}
