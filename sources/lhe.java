// default package

import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
