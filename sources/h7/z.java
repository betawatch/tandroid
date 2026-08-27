package h7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class z {
    public static void a(je.s sVar, je.s sVar2, int i10) {
        if (sVar == null || sVar2 == null || sVar == sVar2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(sVar.g);
        je.p pVar = (je.p) sVar.f;
        je.p pVar2 = (je.p) sVar2.f;
        while (pVar != pVar2) {
            sb2.append(((je.s) pVar).g);
            je.p pVar3 = (je.p) pVar.f;
            pVar.g();
            pVar = pVar3;
        }
        sVar.g = sb2.toString();
    }

    public static void b(je.p pVar, je.p pVar2) {
        je.s sVar = null;
        je.s sVar2 = null;
        int i10 = 0;
        while (pVar != null) {
            if (pVar instanceof je.s) {
                sVar2 = (je.s) pVar;
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
                pVar = (je.p) pVar.f;
            }
        }
        a(sVar, sVar2, i10);
    }
}
