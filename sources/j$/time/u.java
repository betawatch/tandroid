package j$.time;

/* loaded from: classes2.dex */
final class u implements j$.time.temporal.o {
    final /* synthetic */ ZoneId a;

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        return false;
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int j(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ j$.time.temporal.w m(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.d(this, rVar);
    }

    u(ZoneId zoneId) {
        this.a = zoneId;
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.k()) {
            return this.a;
        }
        return j$.time.temporal.n.c(this, tVar);
    }
}
