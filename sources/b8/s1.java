package b8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class s1 {
    public static void a(gf.s sVar, gf.s sVar2, int i3) {
        if (sVar == null || sVar2 == null || sVar == sVar2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i3);
        sb2.append(sVar.g);
        gf.p pVar = (gf.p) sVar.f;
        gf.p pVar2 = (gf.p) sVar2.f;
        while (pVar != pVar2) {
            sb2.append(((gf.s) pVar).g);
            gf.p pVar3 = (gf.p) pVar.f;
            pVar.g();
            pVar = pVar3;
        }
        sVar.g = sb2.toString();
    }

    public static void b(gf.p pVar, gf.p pVar2) {
        gf.s sVar = null;
        gf.s sVar2 = null;
        int i3 = 0;
        while (pVar != null) {
            if (pVar instanceof gf.s) {
                sVar2 = (gf.s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i3 = sVar2.g.length() + i3;
            } else {
                a(sVar, sVar2, i3);
                sVar = null;
                sVar2 = null;
                i3 = 0;
            }
            if (pVar == pVar2) {
                break;
            } else {
                pVar = (gf.p) pVar.f;
            }
        }
        a(sVar, sVar2, i3);
    }
}
