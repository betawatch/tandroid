// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class ile {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(vb3 vb3Var, boolean z) {
        int i;
        yw7 yw7Var = new yw7(16);
        boolean z2 = true;
        while (true) {
            yw7Var.K(8);
            if (!vb3Var.d(yw7Var.a, 0, 8, true)) {
                break;
            }
            long C = yw7Var.C();
            int m = yw7Var.m();
            if (C != 1) {
                i = 8;
            } else {
                if (!vb3Var.d(yw7Var.a, 8, 8, true)) {
                    break;
                }
                yw7Var.M(16);
                C = yw7Var.G();
                i = 16;
            }
            long j = i;
            if (C < j) {
                break;
            }
            int i2 = (int) (C - j);
            if (z2) {
                if (m != 1718909296 || i2 < 8) {
                    break;
                }
                yw7Var.K(4);
                vb3Var.d(yw7Var.a, 0, 4, false);
                if (yw7Var.m() != 1751476579) {
                    break;
                }
                if (!z) {
                    break;
                }
                vb3Var.a(i2 - 4, false);
                z2 = false;
            } else {
                if (m == 1836086884) {
                    break;
                }
                if (i2 != 0) {
                    vb3Var.a(i2, false);
                }
            }
        }
        return false;
    }
}
