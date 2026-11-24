// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class hje {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(ja3 ja3Var, boolean z) {
        int i;
        xu7 xu7Var = new xu7(16);
        boolean z2 = true;
        while (true) {
            xu7Var.K(8);
            if (!ja3Var.d(xu7Var.a, 0, 8, true)) {
                break;
            }
            long C = xu7Var.C();
            int m = xu7Var.m();
            if (C != 1) {
                i = 8;
            } else {
                if (!ja3Var.d(xu7Var.a, 8, 8, true)) {
                    break;
                }
                xu7Var.M(16);
                C = xu7Var.G();
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
                xu7Var.K(4);
                ja3Var.d(xu7Var.a, 0, 4, false);
                if (xu7Var.m() != 1751476579) {
                    break;
                }
                if (!z) {
                    break;
                }
                ja3Var.a(i2 - 4, false);
                z2 = false;
            } else {
                if (m == 1836086884) {
                    break;
                }
                if (i2 != 0) {
                    ja3Var.a(i2, false);
                }
            }
        }
        return false;
    }
}
