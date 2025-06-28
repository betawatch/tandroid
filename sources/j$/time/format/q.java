package j$.time.format;

import j$.time.LocalDate;
import j$.time.ZoneId;

/* loaded from: classes2.dex */
final class q implements j$.time.temporal.k {
    final /* synthetic */ j$.time.chrono.b a;
    final /* synthetic */ j$.time.temporal.k b;
    final /* synthetic */ j$.time.chrono.e c;
    final /* synthetic */ ZoneId d;

    q(LocalDate localDate, j$.time.temporal.k kVar, j$.time.chrono.e eVar, ZoneId zoneId) {
        this.a = localDate;
        this.b = kVar;
        this.c = eVar;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q f(j$.time.temporal.l lVar) {
        j$.time.chrono.b bVar = this.a;
        return (bVar == null || !lVar.k()) ? this.b.f(lVar) : ((LocalDate) bVar).f(lVar);
    }

    @Override // j$.time.temporal.k
    public final long h(j$.time.temporal.l lVar) {
        j$.time.chrono.b bVar = this.a;
        return (bVar == null || !lVar.k()) ? this.b.h(lVar) : ((LocalDate) bVar).h(lVar);
    }

    @Override // j$.time.temporal.k
    public final Object i(j$.time.temporal.n nVar) {
        return nVar == j$.time.temporal.j.d() ? this.c : nVar == j$.time.temporal.j.j() ? this.d : nVar == j$.time.temporal.j.h() ? this.b.i(nVar) : nVar.a(this);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int j(j$.time.temporal.a aVar) {
        return j$.time.temporal.j.a(this, aVar);
    }

    @Override // j$.time.temporal.k
    public final boolean k(j$.time.temporal.l lVar) {
        j$.time.chrono.b bVar = this.a;
        return (bVar == null || !lVar.k()) ? this.b.k(lVar) : ((LocalDate) bVar).k(lVar);
    }
}
