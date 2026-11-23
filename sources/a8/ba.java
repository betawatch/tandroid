package a8;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class ba {
    public static void a(kf.s sVar, kf.s sVar2, int i7) {
        if (sVar == null || sVar2 == null || sVar == sVar2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i7);
        sb2.append(sVar.g);
        kf.p pVar = (kf.p) sVar.f;
        kf.p pVar2 = (kf.p) sVar2.f;
        while (pVar != pVar2) {
            sb2.append(((kf.s) pVar).g);
            kf.p pVar3 = (kf.p) pVar.f;
            pVar.g();
            pVar = pVar3;
        }
        sVar.g = sb2.toString();
    }

    public static void b(kf.p pVar, kf.p pVar2) {
        kf.s sVar = null;
        kf.s sVar2 = null;
        int i7 = 0;
        while (pVar != null) {
            if (pVar instanceof kf.s) {
                sVar2 = (kf.s) pVar;
                if (sVar == null) {
                    sVar = sVar2;
                }
                i7 = sVar2.g.length() + i7;
            } else {
                a(sVar, sVar2, i7);
                sVar = null;
                sVar2 = null;
                i7 = 0;
            }
            if (pVar == pVar2) {
                break;
            } else {
                pVar = (kf.p) pVar.f;
            }
        }
        a(sVar, sVar2, i7);
    }
}
