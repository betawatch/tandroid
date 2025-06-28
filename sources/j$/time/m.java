package j$.time;

import j$.time.temporal.p;
import j$.time.temporal.q;

/* loaded from: classes2.dex */
final class m implements j$.time.temporal.k {
    final /* synthetic */ ZoneId a;

    m(ZoneId zoneId) {
        this.a = zoneId;
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ q f(j$.time.temporal.l lVar) {
        return j$.time.temporal.j.c(this, lVar);
    }

    @Override // j$.time.temporal.k
    public final long h(j$.time.temporal.l lVar) {
        throw new p("Unsupported field: " + lVar);
    }

    @Override // j$.time.temporal.k
    public final Object i(j$.time.temporal.n nVar) {
        return nVar == j$.time.temporal.j.j() ? this.a : j$.time.temporal.j.b(this, nVar);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ int j(j$.time.temporal.a aVar) {
        return j$.time.temporal.j.a(this, aVar);
    }

    @Override // j$.time.temporal.k
    public final boolean k(j$.time.temporal.l lVar) {
        return false;
    }
}
