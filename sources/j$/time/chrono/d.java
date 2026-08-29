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
    /* renamed from: E */
    public final /* synthetic */ int compareTo(b bVar) {
        return j$.com.android.tools.r8.a.e(this, bVar);
    }

    public abstract b J(long j10);

    public abstract b K(long j10);

    public abstract b L(long j10);

    @Override // j$.time.chrono.b, j$.time.temporal.l
    public /* synthetic */ boolean e(j$.time.temporal.o oVar) {
        return j$.com.android.tools.r8.a.q(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int j(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public /* synthetic */ j$.time.temporal.s l(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.d(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object m(j$.time.format.a aVar) {
        return j$.com.android.tools.r8.a.s(this, aVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Temporal q(Temporal temporal) {
        return j$.com.android.tools.r8.a.a(this, temporal);
    }

    public static b G(k kVar, Temporal temporal) {
        b bVar = (b) temporal;
        if (kVar.equals(bVar.a())) {
            return bVar;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + kVar.getId() + ", actual: " + bVar.a().getId());
    }

    @Override // j$.time.chrono.b
    public ChronoLocalDateTime A(j$.time.h hVar) {
        return new f(this, hVar);
    }

    @Override // j$.time.temporal.Temporal
    public b d(long j10, j$.time.temporal.q qVar) {
        boolean z10 = qVar instanceof ChronoUnit;
        if (!z10) {
            if (!z10) {
                return G(a(), qVar.j(this, j10));
            }
            throw new j$.time.temporal.r("Unsupported unit: " + qVar);
        }
        switch (c.a[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return J(j10);
            case 2:
                return J(j$.com.android.tools.r8.a.T(j10, 7));
            case 3:
                return K(j10);
            case 4:
                return L(j10);
            case 5:
                return L(j$.com.android.tools.r8.a.T(j10, 10));
            case 6:
                return L(j$.com.android.tools.r8.a.T(j10, 100));
            case 7:
                return L(j$.com.android.tools.r8.a.T(j10, MediaDataController.MAX_STYLE_RUNS_COUNT));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(j$.com.android.tools.r8.a.O(y(aVar), j10), (j$.time.temporal.o) aVar);
            default:
                throw new j$.time.temporal.r("Unsupported unit: " + qVar);
        }
    }

    public l H() {
        return a().u(j$.time.temporal.p.a(this, j$.time.temporal.a.ERA));
    }

    @Override // j$.time.chrono.b, j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        Objects.requireNonNull(temporal, "endExclusive");
        b x4 = a().x(temporal);
        if (!(qVar instanceof ChronoUnit)) {
            Objects.requireNonNull(qVar, "unit");
            return qVar.between(this, x4);
        }
        switch (c.a[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return x4.z() - z();
            case 2:
                return (x4.z() - z()) / 7;
            case 3:
                return I(x4);
            case 4:
                return I(x4) / 12;
            case 5:
                return I(x4) / 120;
            case 6:
                return I(x4) / 1200;
            case 7:
                return I(x4) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return x4.y(aVar) - y(aVar);
            default:
                throw new j$.time.temporal.r("Unsupported unit: " + qVar);
        }
    }

    public final long I(b bVar) {
        if (a().s(j$.time.temporal.a.MONTH_OF_YEAR).d != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        long y8 = y(aVar) * 32;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_MONTH;
        return (((bVar.y(aVar) * 32) + bVar.j(aVar2)) - (y8 + j$.time.temporal.p.a(this, aVar2))) / 32;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j$.com.android.tools.r8.a.e(this, (b) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public int hashCode() {
        long z10 = z();
        return a().hashCode() ^ ((int) (z10 ^ (z10 >>> 32)));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public b k(j$.time.temporal.m mVar) {
        return G(a(), mVar.q(this));
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        long y8 = y(j$.time.temporal.a.YEAR_OF_ERA);
        long y10 = y(j$.time.temporal.a.MONTH_OF_YEAR);
        long y11 = y(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(a().toString());
        sb2.append(" ");
        sb2.append(H());
        sb2.append(" ");
        sb2.append(y8);
        sb2.append(y10 < 10 ? "-0" : "-");
        sb2.append(y10);
        sb2.append(y11 < 10 ? "-0" : "-");
        sb2.append(y11);
        return sb2.toString();
    }

    @Override // j$.time.temporal.Temporal
    public b c(long j10, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(j$.time.c.a("Unsupported field: ", oVar));
        }
        return G(a(), oVar.q(this, j10));
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public b w(long j10, j$.time.temporal.q qVar) {
        return G(a(), j$.time.temporal.p.b(this, j10, qVar));
    }

    @Override // j$.time.chrono.b
    public long z() {
        return y(j$.time.temporal.a.EPOCH_DAY);
    }
}
