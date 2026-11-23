package c8;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.w10;
import org.telegram.ui.cd0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public abstract class hb {
    public static boolean a;
    public static boolean b;
    public static ArrayList c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(w10 w10Var) {
        boolean z10;
        if (w10Var == null || b) {
            z10 = false;
        } else {
            if (e == null) {
                e = new ArrayList();
            }
            e.add(w10Var);
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
