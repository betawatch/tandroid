package i7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class a6 {
    public static void a(le.s sVar, le.s sVar2, int i10) {
        if (sVar == null || sVar2 == null || sVar == sVar2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(sVar.g);
        le.p pVar = (le.p) sVar.f;
        le.p pVar2 = (le.p) sVar2.f;
        while (pVar != pVar2) {
            sb2.append(((le.s) pVar).g);
            le.p pVar3 = (le.p) pVar.f;
            pVar.g();
            pVar = pVar3;
        }
        sVar.g = sb2.toString();
    }

    public static void b(le.p pVar, le.p pVar2) {
        le.s sVar = null;
        le.s sVar2 = null;
        int i10 = 0;
        while (pVar != null) {
            if (pVar instanceof le.s) {
                sVar2 = (le.s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i10 = sVar2.g.length() + i10;
            } else {
                a(sVar, sVar2, i10);
                sVar = null;
                sVar2 = null;
                i10 = 0;
            }
            if (pVar == pVar2) {
                break;
            } else {
                pVar = (le.p) pVar.f;
            }
        }
        a(sVar, sVar2, i10);
    }
}
