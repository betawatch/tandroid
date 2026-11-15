package c8;

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.z10;
import org.telegram.ui.ah0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public abstract class za {
    public static boolean a;
    public static boolean b;
    public static ArrayList c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(z10 z10Var) {
        boolean z10;
        if (z10Var == null || b) {
            z10 = false;
        } else {
            if (e == null) {
                e = new ArrayList();
            }
            e.add(z10Var);
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
        Utilities.e.c(new ah0(12));
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
        int i7 = 11;
        org.telegram.messenger.g0.r(new ah0(i7));
        org.telegram.messenger.g0.i3(new ah0(i7), 1000L);
    }
}
