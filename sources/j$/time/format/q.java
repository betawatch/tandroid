package j$.time.format;

import j$.time.ZoneId;

/* loaded from: classes2.dex */
final class q implements j$.time.temporal.m {
    final /* synthetic */ j$.time.chrono.b a;
    final /* synthetic */ j$.time.temporal.m b;
    final /* synthetic */ j$.time.chrono.l c;
    final /* synthetic */ ZoneId d;

    @Override // j$.time.temporal.m
    public final /* synthetic */ int l(j$.time.temporal.p pVar) {
        return j$.time.temporal.l.a(this, pVar);
    }

    q(j$.time.chrono.b bVar, j$.time.temporal.m mVar, j$.time.chrono.l lVar, ZoneId zoneId) {
        this.a = bVar;
        this.b = mVar;
        this.c = lVar;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.m
    public final boolean g(j$.time.temporal.p pVar) {
        j$.time.chrono.b bVar = this.a;
        if (bVar != null && pVar.w()) {
            return bVar.g(pVar);
        }
        return this.b.g(pVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.u o(j$.time.temporal.p pVar) {
        j$.time.chrono.b bVar = this.a;
        if (bVar != null && pVar.w()) {
            return bVar.o(pVar);
        }
        return this.b.o(pVar);
    }

    @Override // j$.time.temporal.m
    public final long s(j$.time.temporal.p pVar) {
        j$.time.chrono.b bVar = this.a;
        if (bVar != null && pVar.w()) {
            return bVar.s(pVar);
        }
        return this.b.s(pVar);
    }

    @Override // j$.time.temporal.m
    public final Object w(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.l.e()) {
            return this.c;
        }
        if (rVar == j$.time.temporal.l.k()) {
            return this.d;
        }
        if (rVar == j$.time.temporal.l.i()) {
            return this.b.w(rVar);
        }
        return rVar.a(this);
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
