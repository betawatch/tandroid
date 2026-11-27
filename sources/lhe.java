// default package

import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class lhe {
    public static int a(int i) {
        if (i >= 100 || i < 0) {
            return i;
        }
        if (z3f.G == null) {
            z3f.G = new z3f((byte) 15);
        }
        return Integer.parseInt(String.format(Locale.US, "%s%02d", bs2.n(2, 0, String.valueOf(Calendar.getInstance().get(1))), Integer.valueOf(i)));
    }
}
