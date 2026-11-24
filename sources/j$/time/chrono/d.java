package j$.time.chrono;

import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.util.Objects;
import java.io.Serializable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public abstract class d implements b, Temporal, j$.time.temporal.m, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    public static b o(a aVar, Temporal temporal) {
        b bVar = (b) temporal;
        if (aVar.equals(bVar.a())) {
            return bVar;
        }
        j$.time.g.k("Chronology mismatch, expected: ", aVar.n(), bVar.a().n());
        return null;
    }

    @Override // j$.time.chrono.b
    public ChronoLocalDateTime A(j$.time.j jVar) {
        return new f(this, jVar);
    }

    public abstract b C(long j);

    @Override // java.lang.Comparable
    /* renamed from: D */
    public final /* synthetic */ int compareTo(b bVar) {
        return j$.time.a.d(this, bVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public b k(j$.time.temporal.m mVar) {
        return o(a(), mVar.n(this));
    }

    @Override // j$.time.temporal.Temporal
    public b c(long j, j$.time.temporal.o oVar) {
        if (oVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(j$.time.d.a("Unsupported field: ", oVar));
        }
        return o(a(), oVar.n(this, j));
    }

    @Override // j$.time.temporal.Temporal
    public b d(long j, j$.time.temporal.q qVar) {
        boolean z = qVar instanceof ChronoUnit;
        if (!z) {
            if (!z) {
                return o(a(), qVar.j(this, j));
            }
            j$.time.g.b(qVar, "Unsupported unit: ");
            return null;
        }
        switch (c.a[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return w(j);
            case 2:
                return w(j$.time.a.R(j, 7L));
            case 3:
                return x(j);
            case 4:
                return C(j);
            case 5:
                return C(j$.time.a.R(j, 10L));
            case 6:
                return C(j$.time.a.R(j, 100L));
            case 7:
                return C(j$.time.a.R(j, 1000L));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(j$.time.a.N(y(aVar), j), (j$.time.temporal.o) aVar);
            default:
                j$.time.g.b(qVar, "Unsupported unit: ");
                return null;
        }
    }

    @Override // j$.time.chrono.b, j$.time.temporal.l
    public /* synthetic */ boolean e(j$.time.temporal.o oVar) {
        return j$.time.a.p(this, oVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j$.time.a.d(this, (b) obj) == 0;
    }

    @Override // j$.time.chrono.b, j$.time.temporal.Temporal
    public final long g(Temporal temporal, j$.time.temporal.q qVar) {
        Objects.requireNonNull(temporal, "endExclusive");
        b j = a().j(temporal);
        if (!(qVar instanceof ChronoUnit)) {
            Objects.requireNonNull(qVar, "unit");
            return qVar.between(this, j);
        }
        switch (c.a[((ChronoUnit) qVar).ordinal()]) {
            case 1:
                return j.z() - z();
            case 2:
                return (j.z() - z()) / 7;
            case 3:
                return v(j);
            case 4:
                return v(j) / 12;
            case 5:
                return v(j) / 120;
            case 6:
                return v(j) / 1200;
            case 7:
                return v(j) / 12000;
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return j.y(aVar) - y(aVar);
            default:
                j$.time.g.b(qVar, "Unsupported unit: ");
                return 0L;
        }
    }

    @Override // j$.time.chrono.b
    public int hashCode() {
        long z = z();
        return a().hashCode() ^ ((int) (z ^ (z >>> 32)));
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int j(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public /* synthetic */ j$.time.temporal.s l(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.d(this, oVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ Temporal n(Temporal temporal) {
        return j$.time.a.a(this, temporal);
    }

    public k q() {
        return a().k(j$.time.temporal.p.a(this, j$.time.temporal.a.ERA));
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object r(j$.time.format.a aVar) {
        return j$.time.a.r(this, aVar);
    }

    @Override // j$.time.temporal.Temporal
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public b u(long j, j$.time.temporal.q qVar) {
        return o(a(), j$.time.temporal.p.b(this, j, qVar));
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        long y = y(j$.time.temporal.a.YEAR_OF_ERA);
        long y2 = y(j$.time.temporal.a.MONTH_OF_YEAR);
        long y3 = y(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(a().toString());
        sb.append(" ");
        sb.append(q());
        sb.append(" ");
        sb.append(y);
        sb.append(y2 < 10 ? "-0" : "-");
        sb.append(y2);
        sb.append(y3 < 10 ? "-0" : "-");
        sb.append(y3);
        return sb.toString();
    }

    public final long v(b bVar) {
        if (a().r(j$.time.temporal.a.MONTH_OF_YEAR).d != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        long y = y(aVar) << 5;
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_MONTH;
        return (((bVar.y(aVar) << 5) + bVar.j(aVar2)) - (y + j$.time.temporal.p.a(this, aVar2))) / 32;
    }

    public abstract b w(long j);

    public abstract b x(long j);

    @Override // j$.time.chrono.b
    public long z() {
        return y(j$.time.temporal.a.EPOCH_DAY);
    }
}
