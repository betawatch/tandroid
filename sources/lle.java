// default package

import java.util.Arrays;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class lle {
    public static vf7 a(cb3 cb3Var, boolean z, boolean z2) {
        vf7 c0 = new aj3((byte) 12).c0(cb3Var, !z ? vl5.b : z2 ? vl5.c : null, 0);
        if (c0 == null || c0.a.length == 0) {
            return null;
        }
        return c0;
    }

    public static lh2 b(ey7 ey7Var) {
        ey7Var.O(1);
        int D = ey7Var.D();
        long j = ey7Var.b + D;
        int i = D / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long u = ey7Var.u();
            if (u == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = u;
            jArr2[i2] = ey7Var.u();
            ey7Var.O(2);
            i2++;
        }
        ey7Var.O((int) (j - ey7Var.b));
        return new lh2(jArr, jArr2, (byte) 29);
    }
}
