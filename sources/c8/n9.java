package c8;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public abstract class n9 {
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
            if (!lVar.g(xVar.a, 0, 8, true)) {
                break;
            }
            long C = xVar.C();
            int m10 = xVar.m();
            if (C != 1) {
                i7 = 8;
            } else {
                if (!lVar.g(xVar.a, 8, 8, true)) {
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
                lVar.g(xVar.a, 0, 4, false);
                if (xVar.m() != 1751476579) {
                    break;
                }
                if (!z10) {
                    break;
                }
                lVar.x(i10 - 4, false);
                z11 = false;
            } else {
                if (m10 == 1836086884) {
                    break;
                }
                if (i10 != 0) {
                    lVar.x(i10, false);
                }
            }
        }
        return false;
    }
}
