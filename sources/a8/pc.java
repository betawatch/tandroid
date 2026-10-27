package a8;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class pc {
    public static void a(ef.s sVar, ef.s sVar2, int i10) {
        if (sVar == null || sVar2 == null || sVar == sVar2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(sVar.g);
        ef.p pVar = (ef.p) sVar.f;
        ef.p pVar2 = (ef.p) sVar2.f;
        while (pVar != pVar2) {
            sb2.append(((ef.s) pVar).g);
            ef.p pVar3 = (ef.p) pVar.f;
            pVar.g();
            pVar = pVar3;
        }
        sVar.g = sb2.toString();
    }

    public static void b(ef.p pVar, ef.p pVar2) {
        ef.s sVar = null;
        ef.s sVar2 = null;
        int i10 = 0;
        while (pVar != null) {
            if (pVar instanceof ef.s) {
                sVar2 = (ef.s) pVar;
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
                pVar = (ef.p) pVar.f;
            }
        }
        a(sVar, sVar2, i10);
    }
}
