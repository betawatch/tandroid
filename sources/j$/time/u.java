package j$.time;

/* loaded from: classes2.dex */
final class u implements j$.time.temporal.m {
    final /* synthetic */ ZoneId a;

    @Override // j$.time.temporal.m
    public final boolean g(j$.time.temporal.p pVar) {
        return false;
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ int l(j$.time.temporal.p pVar) {
        return j$.time.temporal.l.a(this, pVar);
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ j$.time.temporal.u o(j$.time.temporal.p pVar) {
        return j$.time.temporal.l.d(this, pVar);
    }

    u(ZoneId zoneId) {
        this.a = zoneId;
    }

    @Override // j$.time.temporal.m
    public final long r(j$.time.temporal.p pVar) {
        throw new j$.time.temporal.t(d.a("Unsupported field: ", pVar));
    }

    @Override // j$.time.temporal.m
    public final Object v(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.k()) {
            return this.a;
        }
        return j$.time.temporal.l.c(this, rVar);
    }
}
