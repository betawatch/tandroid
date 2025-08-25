package j$.time.chrono;

import java.io.Serializable;
import org.telegram.messenger.MediaDataController;

/* loaded from: classes2.dex */
abstract class d implements b, j$.time.temporal.m, j$.time.temporal.p, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    abstract b E(long j);

    abstract b F(long j);

    abstract b G(long j);

    @Override // j$.time.chrono.b, j$.time.temporal.o
    public /* synthetic */ boolean f(j$.time.temporal.r rVar) {
        return h.h(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int j(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public /* synthetic */ j$.time.temporal.w m(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ Object u(j$.time.temporal.t tVar) {
        return h.j(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final /* synthetic */ j$.time.temporal.m v(j$.time.temporal.m mVar) {
        return h.a(this, mVar);
    }

    @Override // java.lang.Comparable
    /* renamed from: y */
    public final /* synthetic */ int compareTo(b bVar) {
        return h.b(this, bVar);
    }

    static b B(l lVar, j$.time.temporal.m mVar) {
        b bVar = (b) mVar;
        a aVar = (a) lVar;
        if (aVar.equals(bVar.a())) {
            return bVar;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + aVar.getId() + ", actual: " + bVar.a().getId());
    }

    d() {
    }

    @Override // j$.time.temporal.m
    public b e(long j, j$.time.temporal.u uVar) {
        boolean z = uVar instanceof j$.time.temporal.b;
        if (!z) {
            if (!z) {
                return B(a(), uVar.i(this, j));
            }
            throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
        switch (c.a[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return E(j);
            case 2:
                return E(j$.com.android.tools.r8.a.l(j, 7));
            case 3:
                return F(j);
            case 4:
                return G(j);
            case 5:
                return G(j$.com.android.tools.r8.a.l(j, 10));
            case 6:
                return G(j$.com.android.tools.r8.a.l(j, 100));
            case 7:
                return G(j$.com.android.tools.r8.a.l(j, MediaDataController.MAX_STYLE_RUNS_COUNT));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return d(j$.com.android.tools.r8.a.f(r(aVar), j), (j$.time.temporal.r) aVar);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    public m C() {
        return a().z(j$.time.temporal.n.a(this, j$.time.temporal.a.ERA));
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

    @Override // j$.time.temporal.m
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public b l(j$.time.temporal.p pVar) {
        return B(a(), pVar.v(this));
    }

    @Override // j$.time.chrono.b
    public String toString() {
        long r = r(j$.time.temporal.a.YEAR_OF_ERA);
        long r2 = r(j$.time.temporal.a.MONTH_OF_YEAR);
        long r3 = r(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(((a) a()).getId());
        sb.append(" ");
        sb.append(C());
        sb.append(" ");
        sb.append(r);
        sb.append(r2 < 10 ? "-0" : "-");
        sb.append(r2);
        sb.append(r3 < 10 ? "-0" : "-");
        sb.append(r3);
        return sb.toString();
    }

    @Override // j$.time.temporal.m
    public b d(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
        return B(a(), rVar.m(this, j));
    }

    @Override // j$.time.temporal.m
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public b i(long j, j$.time.temporal.u uVar) {
        return B(a(), j$.time.temporal.n.b(this, j, uVar));
    }

    @Override // j$.time.chrono.b
    public ChronoLocalDateTime t(j$.time.j jVar) {
        return f.C(this, jVar);
    }

    @Override // j$.time.chrono.b
    public long s() {
        return r(j$.time.temporal.a.EPOCH_DAY);
    }
}
