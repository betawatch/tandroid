package b8;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class sd {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(e3.l lVar, boolean z10) {
        int i3;
        g2.y yVar = new g2.y(16);
        boolean z11 = true;
        while (true) {
            yVar.K(8);
            if (!lVar.h(yVar.a, 0, 8, true)) {
                break;
            }
            long C = yVar.C();
            int m10 = yVar.m();
            if (C != 1) {
                i3 = 8;
            } else {
                if (!lVar.h(yVar.a, 8, 8, true)) {
                    break;
                }
                C = yVar.G();
                i3 = 16;
            }
            long j10 = i3;
            if (C < j10) {
                break;
            }
            int i10 = (int) (C - j10);
            if (z11) {
                if (m10 != 1718909296 || i10 < 8) {
                    break;
                }
                yVar.K(4);
                lVar.h(yVar.a, 0, 4, false);
                if (yVar.m() != 1751476579) {
                    break;
                }
                if (!z10) {
                    break;
                }
                lVar.w(i10 - 4, false);
                z11 = false;
            } else {
                if (m10 == 1836086884) {
                    break;
                }
                if (i10 != 0) {
                    lVar.w(i10, false);
                }
            }
        }
        return false;
    }
}
