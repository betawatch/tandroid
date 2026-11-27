// default package

import android.os.Build;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public abstract class nrd {
    public static int a(ij0 ij0Var, hj0 hj0Var) {
        byte b = ij0Var.d;
        if (b != 0) {
            return b;
        }
        if (hj0Var != null) {
            return 15;
        }
        return jn7.d4;
    }

    public static boolean b(int i) {
        return (i & 32768) != 0;
    }

    public static boolean c(int i) {
        if (i == 15 || i == 255) {
            return true;
        }
        if (i == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        }
        if (i != 32783) {
            return i == 33023 || i == 0;
        }
        int i2 = Build.VERSION.SDK_INT;
        return i2 < 28 || i2 > 29;
    }
}
