package k7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class p6 {
    public static void a(ne.s sVar, ne.s sVar2, int i10) {
        if (sVar == null || sVar2 == null || sVar == sVar2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i10);
        sb.append(sVar.g);
        ne.p pVar = (ne.p) sVar.f;
        ne.p pVar2 = (ne.p) sVar2.f;
        while (pVar != pVar2) {
            sb.append(((ne.s) pVar).g);
            ne.p pVar3 = (ne.p) pVar.f;
            pVar.g();
            pVar = pVar3;
        }
        sVar.g = sb.toString();
    }

    public static void b(ne.p pVar, ne.p pVar2) {
        ne.s sVar = null;
        ne.s sVar2 = null;
        int i10 = 0;
        while (pVar != null) {
            if (pVar instanceof ne.s) {
                sVar2 = (ne.s) pVar;
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
                pVar = (ne.p) pVar.f;
            }
        }
        a(sVar, sVar2, i10);
    }
}
