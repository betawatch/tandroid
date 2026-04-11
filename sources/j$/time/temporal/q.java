package j$.time.temporal;

import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;

/* loaded from: classes2.dex */
final class q implements r {
    public final /* synthetic */ int a;

    public /* synthetic */ q(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.r
    public final Object a(m mVar) {
        switch (this.a) {
            case 0:
                return (ZoneId) mVar.w(l.a);
            case 1:
                return (j$.time.chrono.l) mVar.w(l.b);
            case 2:
                return (s) mVar.w(l.c);
            case 3:
                a aVar = a.OFFSET_SECONDS;
                if (mVar.g(aVar)) {
                    return ZoneOffset.R(mVar.l(aVar));
                }
                return null;
            case 4:
                ZoneId zoneId = (ZoneId) mVar.w(l.a);
                return zoneId != null ? zoneId : (ZoneId) mVar.w(l.d);
            case 5:
                a aVar2 = a.EPOCH_DAY;
                if (mVar.g(aVar2)) {
                    return LocalDate.V(mVar.s(aVar2));
                }
                return null;
            default:
                a aVar3 = a.NANO_OF_DAY;
                if (mVar.g(aVar3)) {
                    return j$.time.j.Q(mVar.s(aVar3));
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
