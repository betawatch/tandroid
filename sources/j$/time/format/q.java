package j$.time.format;

import j$.time.ZoneId;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public final class q implements j$.time.temporal.l {
    public final /* synthetic */ j$.time.chrono.b a;
    public final /* synthetic */ j$.time.temporal.l b;
    public final /* synthetic */ j$.time.chrono.a c;
    public final /* synthetic */ ZoneId d;

    public q(j$.time.chrono.b bVar, j$.time.temporal.l lVar, j$.time.chrono.a aVar, ZoneId zoneId) {
        this.a = bVar;
        this.b = lVar;
        this.c = aVar;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.l
    public final boolean e(j$.time.temporal.o oVar) {
        j$.time.chrono.b bVar = this.a;
        return (bVar == null || !oVar.isDateBased()) ? this.b.e(oVar) : bVar.e(oVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int j(j$.time.temporal.o oVar) {
        return j$.time.temporal.p.a(this, oVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.s l(j$.time.temporal.o oVar) {
        j$.time.chrono.b bVar = this.a;
        return (bVar == null || !oVar.isDateBased()) ? this.b.l(oVar) : bVar.l(oVar);
    }

    @Override // j$.time.temporal.l
    public final Object r(a aVar) {
        return aVar == j$.time.temporal.p.b ? this.c : aVar == j$.time.temporal.p.a ? this.d : aVar == j$.time.temporal.p.c ? this.b.r(aVar) : aVar.a(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.a aVar = this.c;
        if (aVar != null) {
            str = " with chronology " + aVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.b + str + str2;
    }

    @Override // j$.time.temporal.l
    public final long y(j$.time.temporal.o oVar) {
        j$.time.chrono.b bVar = this.a;
        return (bVar == null || !oVar.isDateBased()) ? this.b.y(oVar) : bVar.y(oVar);
    }
}
