package j$.time.format;

import j$.time.ZoneId;

/* loaded from: classes2.dex */
public final class q implements j$.time.temporal.l {
    public final /* synthetic */ j$.time.chrono.b a;
    public final /* synthetic */ j$.time.temporal.l b;
    public final /* synthetic */ j$.time.chrono.k c;
    public final /* synthetic */ ZoneId d;

    @Override // j$.time.temporal.l
    public final /* synthetic */ int o(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.a(this, oVar);
    }

    public q(j$.time.chrono.b bVar, j$.time.temporal.l lVar, j$.time.chrono.k kVar, ZoneId zoneId) {
        this.a = bVar;
        this.b = lVar;
        this.c = kVar;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.l
    public final boolean h(j$.time.temporal.o oVar) {
        j$.time.chrono.b bVar = this.a;
        if (bVar != null && oVar.u()) {
            return bVar.h(oVar);
        }
        return this.b.h(oVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s q(j$.time.temporal.o oVar) {
        j$.time.chrono.b bVar = this.a;
        if (bVar != null && oVar.u()) {
            return bVar.q(oVar);
        }
        return this.b.q(oVar);
    }

    @Override // j$.time.temporal.l
    public final long u(j$.time.temporal.o oVar) {
        j$.time.chrono.b bVar = this.a;
        if (bVar != null && oVar.u()) {
            return bVar.u(oVar);
        }
        return this.b.u(oVar);
    }

    @Override // j$.time.temporal.l
    public final Object r(a aVar) {
        if (aVar == j$.time.temporal.p.b) {
            return this.c;
        }
        if (aVar == j$.time.temporal.p.a) {
            return this.d;
        }
        if (aVar == j$.time.temporal.p.c) {
            return this.b.r(aVar);
        }
        return aVar.a(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.k kVar = this.c;
        if (kVar != null) {
            str = " with chronology " + kVar;
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
