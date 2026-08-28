package g7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class x {
    public static void a(ie.s sVar, ie.s sVar2, int i9) {
        if (sVar == null || sVar2 == null || sVar == sVar2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i9);
        sb2.append(sVar.g);
        ie.p pVar = (ie.p) sVar.f;
        ie.p pVar2 = (ie.p) sVar2.f;
        while (pVar != pVar2) {
            sb2.append(((ie.s) pVar).g);
            ie.p pVar3 = (ie.p) pVar.f;
            pVar.g();
            pVar = pVar3;
        }
        sVar.g = sb2.toString();
    }

    public static void b(ie.p pVar, ie.p pVar2) {
        ie.s sVar = null;
        ie.s sVar2 = null;
        int i9 = 0;
        while (pVar != null) {
            if (pVar instanceof ie.s) {
                sVar2 = (ie.s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i9 = sVar2.g.length() + i9;
            } else {
                a(sVar, sVar2, i9);
                sVar = null;
                sVar2 = null;
                i9 = 0;
            }
            if (pVar == pVar2) {
                break;
            } else {
                pVar = (ie.p) pVar.f;
            }
        }
        a(sVar, sVar2, i9);
    }
}
