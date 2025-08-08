package j$.time;

import j$.time.temporal.p;
import j$.time.temporal.q;

/* loaded from: classes2.dex */
final class m implements j$.time.temporal.k {
    final /* synthetic */ ZoneId a;

    @Override // j$.time.temporal.k
    public final /* synthetic */ int h(j$.time.temporal.a aVar) {
        return j$.time.temporal.j.a(this, aVar);
    }

    @Override // j$.time.temporal.k
    public final /* synthetic */ q i(j$.time.temporal.a aVar) {
        return j$.time.temporal.j.c(this, aVar);
    }

    @Override // j$.time.temporal.k
    public final boolean j(j$.time.temporal.l lVar) {
        return false;
    }

    m(ZoneId zoneId) {
        this.a = zoneId;
    }

    @Override // j$.time.temporal.k
    public final long f(j$.time.temporal.l lVar) {
        throw new p("Unsupported field: " + lVar);
    }

    @Override // j$.time.temporal.k
    public final Object g(j$.time.temporal.n nVar) {
        if (nVar == j$.time.temporal.j.j()) {
            return this.a;
        }
        return j$.time.temporal.j.b(this, nVar);
    }
}
