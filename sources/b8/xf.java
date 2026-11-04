package b8;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.u10;
import org.telegram.ui.hb1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class xf {
    public static boolean a;
    public static boolean b;
    public static ArrayList c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(u10 u10Var) {
        boolean z10;
        if (u10Var == null || b) {
            z10 = false;
        } else {
            if (e == null) {
                e = new ArrayList();
            }
            e.add(u10Var);
            z10 = true;
        }
        b();
        if (z10) {
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
        Utilities.e.c(new hb1(7));
    }

    public static void c(org.telegram.ui.web.x0 x0Var) {
        if (x0Var == null || x0Var.d == null) {
            return;
        }
        b();
        org.telegram.ui.web.x0 x0Var2 = (org.telegram.ui.web.x0) d.get(x0Var.a);
        if (x0Var2 != null) {
            x0Var2.d = x0Var.d;
        } else {
            c.add(x0Var);
            d.put(x0Var.a, x0Var);
        }
        int i3 = 6;
        org.telegram.messenger.g0.r(new hb1(i3));
        org.telegram.messenger.g0.i3(new hb1(i3), 1000L);
    }
}
