package c8;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.ui.o61;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public abstract class xa {
    public static boolean a;
    public static boolean b;
    public static ArrayList c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(c20 c20Var) {
        boolean z9;
        if (c20Var == null || b) {
            z9 = false;
        } else {
            if (e == null) {
                e = new ArrayList();
            }
            e.add(c20Var);
            z9 = true;
        }
        b();
        if (z9) {
            return null;
        }
        return c;
    }

    public static void b() {
        if (a || b) {
            return;
        }
        a = true;
        c = new ArrayList();
        d = new LongSparseArray();
        Utilities.e.c(new o61(8));
    }

    public static void c(org.telegram.ui.web.y0 y0Var) {
        if (y0Var == null || y0Var.d == null) {
            return;
        }
        b();
        org.telegram.ui.web.y0 y0Var2 = (org.telegram.ui.web.y0) d.get(y0Var.a);
        if (y0Var2 != null) {
            y0Var2.d = y0Var.d;
        } else {
            c.add(y0Var);
            d.put(y0Var.a, y0Var);
        }
        int i7 = 7;
        org.telegram.messenger.g0.r(new o61(i7));
        org.telegram.messenger.g0.i3(new o61(i7), 1000L);
    }
}
