package c8;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y10;
import org.telegram.ui.cd0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class cb {
    public static boolean a;
    public static boolean b;
    public static ArrayList c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(y10 y10Var) {
        boolean z10;
        if (y10Var == null || b) {
            z10 = false;
        } else {
            if (e == null) {
                e = new ArrayList();
            }
            e.add(y10Var);
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
        Utilities.e.c(new cd0(14));
    }

    public static void c(org.telegram.ui.web.w0 w0Var) {
        if (w0Var == null || w0Var.d == null) {
            return;
        }
        b();
        org.telegram.ui.web.w0 w0Var2 = (org.telegram.ui.web.w0) d.get(w0Var.a);
        if (w0Var2 != null) {
            w0Var2.d = w0Var.d;
        } else {
            c.add(w0Var);
            d.put(w0Var.a, w0Var);
        }
        int i7 = 13;
        org.telegram.messenger.g0.r(new cd0(i7));
        org.telegram.messenger.g0.h3(new cd0(i7), 1000L);
    }
}
