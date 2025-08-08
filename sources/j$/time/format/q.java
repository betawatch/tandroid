package j$.time.format;

import j$.time.LocalDate;
import j$.time.ZoneId;

/* loaded from: classes2.dex */
final class q implements j$.time.temporal.k {
    final /* synthetic */ LocalDate a;
    final /* synthetic */ j$.time.temporal.k b;
    final /* synthetic */ j$.time.chrono.e c;
    final /* synthetic */ ZoneId d;

    @Override // j$.time.temporal.k
    public final /* synthetic */ int h(j$.time.temporal.a aVar) {
        return j$.time.temporal.j.a(this, aVar);
    }

    q(LocalDate localDate, j$.time.temporal.k kVar, j$.time.chrono.e eVar, ZoneId zoneId) {
        this.a = localDate;
        this.b = kVar;
        this.c = eVar;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.k
    public final boolean j(j$.time.temporal.l lVar) {
        LocalDate localDate = this.a;
        if (localDate != null && lVar.h()) {
            return localDate.j(lVar);
        }
        return this.b.j(lVar);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.q i(j$.time.temporal.a aVar) {
        LocalDate localDate = this.a;
        if (localDate != null && aVar.h()) {
            return localDate.i(aVar);
        }
        return this.b.i(aVar);
    }

    @Override // j$.time.temporal.k
    public final long f(j$.time.temporal.l lVar) {
        LocalDate localDate = this.a;
        if (localDate != null && lVar.h()) {
            return localDate.f(lVar);
        }
        return this.b.f(lVar);
    }

    @Override // j$.time.temporal.k
    public final Object g(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.d()) {
            return this.c;
        }
        if (nVar == j$.time.temporal.j.j()) {
            return this.d;
        }
        if (nVar == j$.time.temporal.j.h()) {
            return this.b.g(nVar);
        }
        return nVar.a(this);
    }
}
