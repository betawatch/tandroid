package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.Serializable;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes2.dex */
abstract class d implements b, Temporal, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    @Override // java.lang.Comparable
    /* renamed from: D */
    public final /* synthetic */ int compareTo(b bVar) {
        return h.b(this, bVar);
    }

    abstract b J(long j);

    abstract b K(long j);

    abstract b L(long j);

    @Override // j$.time.chrono.b, j$.time.temporal.m
    public /* synthetic */ boolean g(j$.time.temporal.p pVar) {
        return h.h(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ int l(j$.time.temporal.p pVar) {
        return j$.time.temporal.l.a(this, pVar);
    }

    @Override // j$.time.temporal.m
    public /* synthetic */ j$.time.temporal.u o(j$.time.temporal.p pVar) {
        return j$.time.temporal.l.d(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Object v(j$.time.temporal.r rVar) {
        return h.j(this, rVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ Temporal x(Temporal temporal) {
        return h.a(this, temporal);
    }

    static b G(l lVar, Temporal temporal) {
        b bVar = (b) temporal;
        a aVar = (a) lVar;
        if (aVar.equals(bVar.a())) {
            return bVar;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + aVar.getId() + ", actual: " + bVar.a().getId());
    }

    d() {
    }

    @Override // j$.time.temporal.Temporal
    public b e(long j, j$.time.temporal.s sVar) {
        boolean z = sVar instanceof ChronoUnit;
        if (!z) {
            if (!z) {
                return G(a(), sVar.k(this, j));
            }
            throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
        switch (c.a[((ChronoUnit) sVar).ordinal()]) {
            case 1:
                return J(j);
            case 2:
                return J(j$.com.android.tools.r8.a.l(j, 7));
            case 3:
                return K(j);
            case 4:
                return L(j);
            case 5:
                return L(j$.com.android.tools.r8.a.l(j, 10));
            case 6:
                return L(j$.com.android.tools.r8.a.l(j, 100));
            case 7:
                return L(j$.com.android.tools.r8.a.l(j, MediaDataController.MAX_STYLE_RUNS_COUNT));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.f(r(aVar), j), (j$.time.temporal.p) aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public m H() {
        return a().E(j$.time.temporal.l.a(this, j$.time.temporal.a.ERA));
    }

    @Override // j$.time.chrono.b, j$.time.temporal.Temporal
    public long f(Temporal temporal, j$.time.temporal.s sVar) {
        Objects.requireNonNull(temporal, "endExclusive");
        b m = a().m(temporal);
        if (!(sVar instanceof ChronoUnit)) {
            Objects.requireNonNull(sVar, "unit");
            return sVar.between(this, m);
        }
        switch (c.a[((ChronoUnit) sVar).ordinal()]) {
            case 1:
                return m.s() - s();
            case 2:
                return (m.s() - s()) / 7;
            case 3:
                return I(m);
            case 4:
                return I(m) / 12;
            case 5:
                return I(m) / 120;
            case 6:
                return I(m) / 1200;
            case 7:
                return I(m) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return m.r(aVar) - r(aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    private long I(b bVar) {
        if (a().A(j$.time.temporal.a.MONTH_OF_YEAR).d() != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        long r = r(aVar) * 32;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_MONTH;
        return (((bVar.r(aVar) * 32) + bVar.l(aVar2)) - (r + j$.time.temporal.l.a(this, aVar2))) / 32;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && h.b(this, (b) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public int hashCode() {
        long s = s();
        return ((a) a()).hashCode() ^ ((int) (s ^ (s >>> 32)));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public b n(j$.time.temporal.n nVar) {
        return G(a(), nVar.x(this));
    }

    @Override // j$.time.chrono.b
    public String toString() {
        long r = r(j$.time.temporal.a.YEAR_OF_ERA);
        long r2 = r(j$.time.temporal.a.MONTH_OF_YEAR);
        long r3 = r(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(((a) a()).getId());
        sb.append(" ");
        sb.append(H());
        sb.append(" ");
        sb.append(r);
        sb.append(r2 < 10 ? "-0" : "-");
        sb.append(r2);
        sb.append(r3 < 10 ? "-0" : "-");
        sb.append(r3);
        return sb.toString();
    }

    @Override // j$.time.temporal.Temporal
    public b d(long j, j$.time.temporal.p pVar) {
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.d.a("Unsupported field: ", pVar));
        }
        return G(a(), pVar.o(this, j));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public b k(long j, j$.time.temporal.s sVar) {
        return G(a(), j$.time.temporal.l.b(this, j, sVar));
    }

    @Override // j$.time.chrono.b
    public ChronoLocalDateTime t(j$.time.i iVar) {
        return f.H(this, iVar);
    }

    @Override // j$.time.chrono.b
    public long s() {
        return r(j$.time.temporal.a.EPOCH_DAY);
    }
}
