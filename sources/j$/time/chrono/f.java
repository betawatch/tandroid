package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* loaded from: classes2.dex */
final class f implements ChronoLocalDateTime, Temporal, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    private final transient b a;
    private final transient j$.time.j b;

    @Override // java.lang.Comparable
    /* renamed from: A */
    public final /* synthetic */ int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return h.c(this, chronoLocalDateTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ Instant toInstant(ZoneOffset zoneOffset) {
        return h.p(this, zoneOffset);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Object w(j$.time.temporal.r rVar) {
        return h.k(this, rVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ long y(ZoneOffset zoneOffset) {
        return h.n(this, zoneOffset);
    }

    static f J(b bVar, j$.time.j jVar) {
        return new f(bVar, jVar);
    }

    static f I(l lVar, Temporal temporal) {
        f fVar = (f) temporal;
        a aVar = (a) lVar;
        if (aVar.equals(fVar.a.a())) {
            return fVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + aVar.getId() + ", actual: " + fVar.a.a().getId());
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final l a() {
        return this.a.a();
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal k(long j, ChronoUnit chronoUnit) {
        return I(this.a.a(), j$.time.temporal.l.b(this, j, chronoUnit));
    }

    private f(b bVar, j$.time.j jVar) {
        Objects.requireNonNull(bVar, "date");
        Objects.requireNonNull(jVar, "time");
        this.a = bVar;
        this.b = jVar;
    }

    private f O(Temporal temporal, j$.time.j jVar) {
        b bVar = this.a;
        return (bVar == temporal && this.b == jVar) ? this : new f(d.I(bVar.a(), temporal), jVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final b c() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.j b() {
        return this.b;
    }

    @Override // j$.time.temporal.m
    public final boolean g(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar != null && pVar.n(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        return aVar.w() || aVar.J();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (!((j$.time.temporal.a) pVar).J()) {
                return this.a.o(pVar);
            }
            j$.time.j jVar = this.b;
            jVar.getClass();
            return j$.time.temporal.l.d(jVar, pVar);
        }
        return pVar.s(this);
    }

    @Override // j$.time.temporal.m
    public final int l(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).J() ? this.b.l(pVar) : this.a.l(pVar);
        }
        return o(pVar).a(s(pVar), pVar);
    }

    @Override // j$.time.temporal.m
    public final long s(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).J() ? this.b.s(pVar) : this.a.s(pVar);
        }
        return pVar.l(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(LocalDate localDate) {
        if (localDate instanceof b) {
            return O(localDate, this.b);
        }
        l a = this.a.a();
        localDate.getClass();
        return I(a, (f) h.a(localDate, this));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final f d(long j, j$.time.temporal.p pVar) {
        boolean z = pVar instanceof j$.time.temporal.a;
        b bVar = this.a;
        if (z) {
            boolean J = ((j$.time.temporal.a) pVar).J();
            j$.time.j jVar = this.b;
            if (J) {
                return O(bVar, jVar.d(j, pVar));
            }
            return O(bVar.d(j, pVar), jVar);
        }
        return I(bVar.a(), pVar.o(this, j));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final f e(long j, j$.time.temporal.s sVar) {
        boolean z = sVar instanceof ChronoUnit;
        b bVar = this.a;
        if (z) {
            int i = e.a[((ChronoUnit) sVar).ordinal()];
            j$.time.j jVar = this.b;
            switch (i) {
                case 1:
                    return M(this.a, 0L, 0L, 0L, j);
                case 2:
                    f O = O(bVar.e(j / 86400000000L, (j$.time.temporal.s) ChronoUnit.DAYS), jVar);
                    return O.M(O.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    f O2 = O(bVar.e(j / 86400000, (j$.time.temporal.s) ChronoUnit.DAYS), jVar);
                    return O2.M(O2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return L(j);
                case 5:
                    return M(this.a, 0L, j, 0L, 0L);
                case 6:
                    return M(this.a, j, 0L, 0L, 0L);
                case 7:
                    f O3 = O(bVar.e(j / 256, (j$.time.temporal.s) ChronoUnit.DAYS), jVar);
                    return O3.M(O3.a, (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return O(bVar.e(j, sVar), jVar);
            }
        }
        return I(bVar.a(), sVar.k(this, j));
    }

    final f L(long j) {
        return M(this.a, 0L, 0L, j, 0L);
    }

    private f M(b bVar, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j$.time.j jVar = this.b;
        if (j5 == 0) {
            return O(bVar, jVar);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long Y = jVar.Y();
        long j10 = j9 + Y;
        long k = j$.com.android.tools.r8.a.k(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long j11 = j$.com.android.tools.r8.a.j(j10, 86400000000000L);
        if (j11 != Y) {
            jVar = j$.time.j.Q(j11);
        }
        return O(bVar.e(k, (j$.time.temporal.s) ChronoUnit.DAYS), jVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime p(ZoneOffset zoneOffset) {
        return k.I(zoneOffset, null, this);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, j$.time.temporal.s sVar) {
        Objects.requireNonNull(temporal, "endExclusive");
        b bVar = this.a;
        ChronoLocalDateTime x = bVar.a().x(temporal);
        if (!(sVar instanceof ChronoUnit)) {
            Objects.requireNonNull(sVar, "unit");
            return sVar.between(this, x);
        }
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        boolean z = ((ChronoUnit) sVar).compareTo(chronoUnit) < 0;
        j$.time.j jVar = this.b;
        if (!z) {
            b c = x.c();
            if (x.b().compareTo(jVar) < 0) {
                c = c.k(1L, chronoUnit);
            }
            return bVar.f(c, sVar);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        long s = x.s(aVar) - bVar.s(aVar);
        switch (e.a[((ChronoUnit) sVar).ordinal()]) {
            case 1:
                s = j$.com.android.tools.r8.a.l(s, 86400000000000L);
                break;
            case 2:
                s = j$.com.android.tools.r8.a.l(s, 86400000000L);
                break;
            case 3:
                s = j$.com.android.tools.r8.a.l(s, 86400000L);
                break;
            case 4:
                s = j$.com.android.tools.r8.a.l(s, 86400);
                break;
            case 5:
                s = j$.com.android.tools.r8.a.l(s, 1440);
                break;
            case 6:
                s = j$.com.android.tools.r8.a.l(s, 24);
                break;
            case 7:
                s = j$.com.android.tools.r8.a.l(s, 2);
                break;
        }
        return j$.com.android.tools.r8.a.f(s, jVar.f(x.b(), sVar));
    }

    @Override // j$.time.temporal.n
    public final Temporal z(Temporal temporal) {
        return temporal.d(c().t(), j$.time.temporal.a.EPOCH_DAY).d(b().Y(), j$.time.temporal.a.NANO_OF_DAY);
    }

    private Object writeReplace() {
        return new E((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeObject(this.a);
        objectOutput.writeObject(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && h.c(this, (ChronoLocalDateTime) obj) == 0;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }
}
