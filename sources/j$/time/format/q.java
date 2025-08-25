package j$.time.format;

import j$.time.ZoneId;

/* loaded from: classes2.dex */
final class q implements j$.time.temporal.o {
    final /* synthetic */ j$.time.chrono.b a;
    final /* synthetic */ j$.time.temporal.o b;
    final /* synthetic */ j$.time.chrono.l c;
    final /* synthetic */ ZoneId d;

    @Override // j$.time.temporal.o
    public final /* synthetic */ int j(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.a(this, rVar);
    }

    q(j$.time.chrono.b bVar, j$.time.temporal.o oVar, j$.time.chrono.l lVar, ZoneId zoneId) {
        this.a = bVar;
        this.b = oVar;
        this.c = lVar;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        j$.time.chrono.b bVar = this.a;
        if (bVar != null && rVar.u()) {
            return bVar.f(rVar);
        }
        return this.b.f(rVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        j$.time.chrono.b bVar = this.a;
        if (bVar != null && rVar.u()) {
            return bVar.m(rVar);
        }
        return this.b.m(rVar);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        j$.time.chrono.b bVar = this.a;
        if (bVar != null && rVar.u()) {
            return bVar.r(rVar);
        }
        return this.b.r(rVar);
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.e()) {
            return this.c;
        }
        if (tVar == j$.time.temporal.n.k()) {
            return this.d;
        }
        if (tVar == j$.time.temporal.n.i()) {
            return this.b.u(tVar);
        }
        return tVar.a(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.l lVar = this.c;
        if (lVar != null) {
            str = " with chronology " + lVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.b + str + str2;
    }
}
