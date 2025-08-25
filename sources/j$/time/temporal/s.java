package j$.time.temporal;

import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;

/* loaded from: classes2.dex */
final class s implements t {
    public final /* synthetic */ int a;

    public /* synthetic */ s(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.t
    public final Object a(o oVar) {
        switch (this.a) {
            case 0:
                return (ZoneId) oVar.u(n.a);
            case 1:
                return (j$.time.chrono.l) oVar.u(n.b);
            case 2:
                return (u) oVar.u(n.c);
            case 3:
                a aVar = a.OFFSET_SECONDS;
                if (oVar.f(aVar)) {
                    return ZoneOffset.I(oVar.j(aVar));
                }
                return null;
            case 4:
                ZoneId zoneId = (ZoneId) oVar.u(n.a);
                return zoneId != null ? zoneId : (ZoneId) oVar.u(n.d);
            case 5:
                a aVar2 = a.EPOCH_DAY;
                if (oVar.f(aVar2)) {
                    return LocalDate.N(oVar.r(aVar2));
                }
                return null;
            default:
                a aVar3 = a.NANO_OF_DAY;
                if (oVar.f(aVar3)) {
                    return j$.time.j.J(oVar.r(aVar3));
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "ZoneId";
            case 1:
                return "Chronology";
            case 2:
                return "Precision";
            case 3:
                return "ZoneOffset";
            case 4:
                return "Zone";
            case 5:
                return "LocalDate";
            default:
                return "LocalTime";
        }
    }
}
