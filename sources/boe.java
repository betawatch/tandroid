// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class boe {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(cb3 cb3Var, boolean z) {
        int i;
        ey7 ey7Var = new ey7(16);
        boolean z2 = true;
        while (true) {
            ey7Var.K(8);
            if (!cb3Var.d(ey7Var.a, 0, 8, true)) {
                break;
            }
            long C = ey7Var.C();
            int m = ey7Var.m();
            if (C != 1) {
                i = 8;
            } else {
                if (!cb3Var.d(ey7Var.a, 8, 8, true)) {
                    break;
                }
                ey7Var.M(16);
                C = ey7Var.G();
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
                ey7Var.K(4);
                cb3Var.d(ey7Var.a, 0, 4, false);
                if (ey7Var.m() != 1751476579) {
                    break;
                }
                if (!z) {
                    break;
                }
                cb3Var.a(i2 - 4, false);
                z2 = false;
            } else {
                if (m == 1836086884) {
                    break;
                }
                if (i2 != 0) {
                    cb3Var.a(i2, false);
                }
            }
        }
        return false;
    }
}
