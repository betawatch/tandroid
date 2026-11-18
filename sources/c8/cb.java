package c8;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.x10;
import org.telegram.ui.dd0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class cb {
    public static boolean a;
    public static boolean b;
    public static ArrayList c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(x10 x10Var) {
        boolean z10;
        if (x10Var == null || b) {
            z10 = false;
        } else {
            if (e == null) {
                e = new ArrayList();
            }
            e.add(x10Var);
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
        Utilities.e.c(new dd0(14));
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
        org.telegram.messenger.g0.r(new dd0(i7));
        org.telegram.messenger.g0.h3(new dd0(i7), 1000L);
    }
}
