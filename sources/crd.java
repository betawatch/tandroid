// default package

import android.util.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class crd {
    public static boolean a;
    public static boolean b;
    public static ArrayList c;
    public static LongSparseArray d;
    public static ArrayList e;

    public static ArrayList a(qac qacVar) {
        boolean z;
        if (qacVar == null || b) {
            z = false;
        } else {
            ArrayList arrayList = e;
            if (arrayList == null) {
                arrayList = new ArrayList();
                e = arrayList;
            }
            arrayList.add(qacVar);
            z = true;
        }
        b();
        if (z) {
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
        Utilities.e.c(new jd((byte) 12));
    }

    public static void c(m11 m11Var) {
        if (m11Var == null || m11Var.d == null) {
            return;
        }
        b();
        m11 m11Var2 = (m11) d.get(m11Var.a);
        if (m11Var2 != null) {
            m11Var2.d = m11Var.d;
        } else {
            c.add(m11Var);
            d.put(m11Var.a, m11Var);
        }
        byte b2 = 11;
        gm.r(new jd(b2));
        gm.d3(new jd(b2), 1000L);
    }
}
