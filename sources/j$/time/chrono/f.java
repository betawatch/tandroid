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
    private final transient j$.time.i b;

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ long toEpochSecond(ZoneOffset zoneOffset) {
        return h.n(this, zoneOffset);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ Instant toInstant(ZoneOffset zoneOffset) {
        return h.p(this, zoneOffset);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Object v(j$.time.temporal.r rVar) {
        return h.k(this, rVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: y */
    public final /* synthetic */ int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return h.c(this, chronoLocalDateTime);
    }

    static f H(b bVar, j$.time.i iVar) {
        return new f(bVar, iVar);
    }

    static f G(l lVar, Temporal temporal) {
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
        return G(this.a.a(), j$.time.temporal.l.b(this, j, chronoUnit));
    }

    private f(b bVar, j$.time.i iVar) {
        Objects.requireNonNull(bVar, "date");
        Objects.requireNonNull(iVar, "time");
        this.a = bVar;
        this.b = iVar;
    }

    private f M(Temporal temporal, j$.time.i iVar) {
        b bVar = this.a;
        return (bVar == temporal && this.b == iVar) ? this : new f(d.G(bVar.a(), temporal), iVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final b c() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.i b() {
        return this.b;
    }

    @Override // j$.time.temporal.m
    public final boolean g(j$.time.temporal.p pVar) {
        if (!(pVar instanceof j$.time.temporal.a)) {
            return pVar != null && pVar.n(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) pVar;
        return aVar.v() || aVar.H();
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            if (!((j$.time.temporal.a) pVar).H()) {
                return this.a.o(pVar);
            }
            j$.time.i iVar = this.b;
            iVar.getClass();
            return j$.time.temporal.l.d(iVar, pVar);
        }
        return pVar.r(this);
    }

    @Override // j$.time.temporal.m
    public final int l(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).H() ? this.b.l(pVar) : this.a.l(pVar);
        }
        return o(pVar).a(r(pVar), pVar);
    }

    @Override // j$.time.temporal.m
    public final long r(j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) pVar).H() ? this.b.r(pVar) : this.a.r(pVar);
        }
        return pVar.l(this);
    }

    @Override // j$.time.temporal.Temporal
    public final Temporal n(LocalDate localDate) {
        if (localDate instanceof b) {
            return M(localDate, this.b);
        }
        l a = this.a.a();
        localDate.getClass();
        return G(a, (f) h.a(localDate, this));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final f d(long j, j$.time.temporal.p pVar) {
        boolean z = pVar instanceof j$.time.temporal.a;
        b bVar = this.a;
        if (z) {
            boolean H = ((j$.time.temporal.a) pVar).H();
            j$.time.i iVar = this.b;
            if (H) {
                return M(bVar, iVar.d(j, pVar));
            }
            return M(bVar.d(j, pVar), iVar);
        }
        return G(bVar.a(), pVar.o(this, j));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final f e(long j, j$.time.temporal.s sVar) {
        boolean z = sVar instanceof ChronoUnit;
        b bVar = this.a;
        if (z) {
            int i = e.a[((ChronoUnit) sVar).ordinal()];
            j$.time.i iVar = this.b;
            switch (i) {
                case 1:
                    return K(this.a, 0L, 0L, 0L, j);
                case 2:
                    f M = M(bVar.e(j / 86400000000L, (j$.time.temporal.s) ChronoUnit.DAYS), iVar);
                    return M.K(M.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    f M2 = M(bVar.e(j / 86400000, (j$.time.temporal.s) ChronoUnit.DAYS), iVar);
                    return M2.K(M2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return J(j);
                case 5:
                    return K(this.a, 0L, j, 0L, 0L);
                case 6:
                    return K(this.a, j, 0L, 0L, 0L);
                case 7:
                    f M3 = M(bVar.e(j / 256, (j$.time.temporal.s) ChronoUnit.DAYS), iVar);
                    return M3.K(M3.a, (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return M(bVar.e(j, sVar), iVar);
            }
        }
        return G(bVar.a(), sVar.k(this, j));
    }

    final f J(long j) {
        return K(this.a, 0L, 0L, j, 0L);
    }

    private f K(b bVar, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        j$.time.i iVar = this.b;
        if (j5 == 0) {
            return M(bVar, iVar);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long W = iVar.W();
        long j10 = j9 + W;
        long k = j$.com.android.tools.r8.a.k(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long j11 = j$.com.android.tools.r8.a.j(j10, 86400000000000L);
        if (j11 != W) {
            iVar = j$.time.i.O(j11);
        }
        return M(bVar.e(k, (j$.time.temporal.s) ChronoUnit.DAYS), iVar);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime p(ZoneOffset zoneOffset) {
        return k.G(zoneOffset, null, this);
    }

    @Override // j$.time.temporal.Temporal
    public final long f(Temporal temporal, j$.time.temporal.s sVar) {
        Objects.requireNonNull(temporal, "endExclusive");
        b bVar = this.a;
        ChronoLocalDateTime w = bVar.a().w(temporal);
        if (!(sVar instanceof ChronoUnit)) {
            Objects.requireNonNull(sVar, "unit");
            return sVar.between(this, w);
        }
        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        boolean z = ((ChronoUnit) sVar).compareTo(chronoUnit) < 0;
        j$.time.i iVar = this.b;
        if (!z) {
            b c = w.c();
            if (w.b().compareTo(iVar) < 0) {
                c = c.k(1L, chronoUnit);
            }
            return bVar.f(c, sVar);
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        long r = w.r(aVar) - bVar.r(aVar);
        switch (e.a[((ChronoUnit) sVar).ordinal()]) {
            case 1:
                r = j$.com.android.tools.r8.a.l(r, 86400000000000L);
                break;
            case 2:
                r = j$.com.android.tools.r8.a.l(r, 86400000000L);
                break;
            case 3:
                r = j$.com.android.tools.r8.a.l(r, 86400000L);
                break;
            case 4:
                r = j$.com.android.tools.r8.a.l(r, 86400);
                break;
            case 5:
                r = j$.com.android.tools.r8.a.l(r, 1440);
                break;
            case 6:
                r = j$.com.android.tools.r8.a.l(r, 24);
                break;
            case 7:
                r = j$.com.android.tools.r8.a.l(r, 2);
                break;
        }
        return j$.com.android.tools.r8.a.f(r, iVar.f(w.b(), sVar));
    }

    @Override // j$.time.temporal.n
    public final Temporal x(Temporal temporal) {
        return temporal.d(c().s(), j$.time.temporal.a.EPOCH_DAY).d(b().W(), j$.time.temporal.a.NANO_OF_DAY);
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
