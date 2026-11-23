package c8;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class o9 {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(f3.l lVar, boolean z10) {
        int i7;
        h2.x xVar = new h2.x(16);
        boolean z11 = true;
        while (true) {
            xVar.K(8);
            if (!lVar.k(xVar.a, 0, 8, true)) {
                break;
            }
            long C = xVar.C();
            int m10 = xVar.m();
            if (C != 1) {
                i7 = 8;
            } else {
                if (!lVar.k(xVar.a, 8, 8, true)) {
                    break;
                }
                C = xVar.G();
                i7 = 16;
            }
            long j3 = i7;
            if (C < j3) {
                break;
            }
            int i10 = (int) (C - j3);
            if (z11) {
                if (m10 != 1718909296 || i10 < 8) {
                    break;
                }
                xVar.K(4);
                lVar.k(xVar.a, 0, 4, false);
                if (xVar.m() != 1751476579) {
                    break;
                }
                if (!z10) {
                    break;
                }
                lVar.t(i10 - 4, false);
                z11 = false;
            } else {
                if (m10 == 1836086884) {
                    break;
                }
                if (i10 != 0) {
                    lVar.t(i10, false);
                }
            }
        }
        return false;
    }
}
