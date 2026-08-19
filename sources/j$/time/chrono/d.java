package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.Serializable;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes2.dex */
public abstract class d implements b, Temporal, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    @Override // java.lang.Comparable
    /* renamed from: F */
    public final /* synthetic */ int compareTo(b bVar) {
        return j$.com.android.tools.r8.a.e(this, bVar);
    }

    public abstract b J(long j);

    public abstract b K(long j);

    public abstract b L(long j);

    @Override // j$.time.chrono.b, j$.time.temporal.l
    public /* synthetic */ boolean h(j$.time.temporal.o oVar) {
        return j$.com.android.tools.r8.a.q(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int o(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public /* synthetic */ j$.time.temporal.s q(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.d(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object r(j$.time.format.a aVar) {
        return j$.com.android.tools.r8.a.s(this, aVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Temporal x(Temporal temporal) {
        return j$.com.android.tools.r8.a.a(this, temporal);
    }

    public static b E(k kVar, Temporal temporal) {
        b bVar = (b) temporal;
        if (kVar.equals(bVar.b())) {
            return bVar;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + kVar.getId() + ", actual: " + bVar.b().getId());
    }

    @Override // j$.time.chrono.b
    public ChronoLocalDateTime w(j$.time.h hVar) {
        return new f(this, hVar);
    }

    @Override // j$.time.temporal.Temporal
    public b f(long j, j$.time.temporal.q qVar) {
        boolean z = qVar instanceof ChronoUnit;
        if (!z) {
            if (!z) {
                return E(b(), qVar.l(this, j));
            }
            throw new j$.time.temporal.r("Unsupported unit: " + qVar);
        }
        switch (c.a[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return J(j);
            case 2:
                return J(j$.com.android.tools.r8.a.T(j, 7));
            case 3:
                return K(j);
            case 4:
                return L(j);
            case 5:
                return L(j$.com.android.tools.r8.a.T(j, 10));
            case 6:
                return L(j$.com.android.tools.r8.a.T(j, 100));
            case 7:
                return L(j$.com.android.tools.r8.a.T(j, MediaDataController.MAX_STYLE_RUNS_COUNT));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return e(j$.com.android.tools.r8.a.O(u(aVar), j), (j$.time.temporal.o) aVar);
            default:
                throw new j$.time.temporal.r("Unsupported unit: " + qVar);
        }
    }

    public l H() {
        return b().C(j$.time.temporal.p.a(this, j$.time.temporal.a.ERA));
    }

    @Override // j$.time.chrono.b, j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        Objects.requireNonNull(temporal, "endExclusive");
        b a = b().a(temporal);
        if (!(qVar instanceof ChronoUnit)) {
            Objects.requireNonNull(qVar, "unit");
            return qVar.between(this, a);
        }
        switch (c.a[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return a.v() - v();
            case 2:
                return (a.v() - v()) / 7;
            case 3:
                return I(a);
            case 4:
                return I(a) / 12;
            case 5:
                return I(a) / 120;
            case 6:
                return I(a) / 1200;
            case 7:
                return I(a) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return a.u(aVar) - u(aVar);
            default:
                throw new j$.time.temporal.r("Unsupported unit: " + qVar);
        }
    }

    public final long I(b bVar) {
        if (b().y(j$.time.temporal.a.MONTH_OF_YEAR).d != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        long u = u(aVar) * 32;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_MONTH;
        return (((bVar.u(aVar) * 32) + bVar.o(aVar2)) - (u + j$.time.temporal.p.a(this, aVar2))) / 32;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j$.com.android.tools.r8.a.e(this, (b) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public int hashCode() {
        long v = v();
        return b().hashCode() ^ ((int) (v ^ (v >>> 32)));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public b p(j$.time.temporal.m mVar) {
        return E(b(), mVar.x(this));
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        long u = u(j$.time.temporal.a.YEAR_OF_ERA);
        long u2 = u(j$.time.temporal.a.MONTH_OF_YEAR);
        long u3 = u(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(b().toString());
        sb.append(" ");
        sb.append(H());
        sb.append(" ");
        sb.append(u);
        sb.append(u2 < 10 ? "-0" : "-");
        sb.append(u2);
        sb.append(u3 < 10 ? "-0" : "-");
        sb.append(u3);
        return sb.toString();
    }

    @Override // j$.time.temporal.Temporal
    public b e(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", oVar));
        }
        return E(b(), oVar.q(this, j));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public b l(long j, j$.time.temporal.q qVar) {
        return E(b(), j$.time.temporal.p.b(this, j, qVar));
    }

    @Override // j$.time.chrono.b
    public long v() {
        return u(j$.time.temporal.a.EPOCH_DAY);
    }
}
