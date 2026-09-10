package og;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.DispatchQueue;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class p1 {
    public static final DispatchQueue m = new DispatchQueue("ShapeDetector");
    public static final double n = Math.sqrt(125000.0d) / 2.0d;
    public int a;
    public ArrayList b;
    public ArrayList c;
    public boolean d;
    public ai.b e;
    public Context f;
    public SharedPreferences g;
    public boolean h;
    public ArrayList i;
    public AtomicBoolean j;
    public AtomicBoolean k;
    public l1 l;

    public static n1 a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((m1) arrayList.get(0)).a;
        double d10 = ((m1) arrayList.get(0)).b;
        n1 n1Var = new n1();
        n1Var.a = d;
        n1Var.b = d10;
        n1Var.c = d;
        n1Var.d = d10;
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            m1 m1Var = (m1) arrayList.get(i10);
            double d11 = m1Var.a;
            double d12 = m1Var.b;
            if (n1Var.a >= d11) {
                n1Var.a = d11;
            }
            if (n1Var.b >= d12) {
                n1Var.b = d12;
            }
            if (n1Var.c <= d11) {
                n1Var.c = d11;
            }
            if (n1Var.d <= d12) {
                n1Var.d = d12;
            }
        }
        return n1Var;
    }

    public static m1 b(ArrayList arrayList) {
        m1 m1Var = new m1(0.0d, 0.0d);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            m1 m1Var2 = (m1) arrayList.get(i10);
            m1Var.a += m1Var2.a;
            m1Var.b += m1Var2.b;
        }
        m1Var.a /= arrayList.size();
        m1Var.b /= arrayList.size();
        return m1Var;
    }

    public static double d(ArrayList arrayList, m1 m1Var, ArrayList arrayList2, double d) {
        m1 m1Var2 = m1Var;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d10 = 0.0d;
        int i10 = 0;
        while (i10 < min) {
            m1 m1Var3 = (m1) arrayList.get(i10);
            m1 m1Var4 = (m1) arrayList2.get(i10);
            double d11 = m1Var3.a;
            double d12 = cos;
            double d13 = m1Var2.a;
            double d14 = d11 - d13;
            double d15 = m1Var3.b;
            double d16 = m1Var2.b;
            double d17 = d15 - d16;
            d10 += m1Var4.a(((d14 * d12) - (d17 * sin)) + d13, (d17 * d12) + (d14 * sin) + d16);
            i10++;
            m1Var2 = m1Var;
            cos = d12;
        }
        return d10 / arrayList.size();
    }

    public static int e(int i10, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            m1 m1Var = (m1) arrayList.get(max - 1);
            m1 m1Var2 = (m1) arrayList.get(max);
            int i11 = max + 1;
            m1 m1Var3 = (m1) arrayList.get(i11);
            m1Var.getClass();
            double a2 = m1Var.a(m1Var2.a, m1Var2.b);
            double a10 = m1Var.a(m1Var3.a, m1Var3.b);
            double a11 = m1Var2.a(m1Var3.a, m1Var3.b);
            if ((Math.acos((((a10 * a10) + (a2 * a2)) - (a11 * a11)) / ((a2 * 2.0d) * a10)) / 3.141592653589793d) * 180.0d > 18.0d) {
                if (i10 <= 0) {
                    return max;
                }
                i10--;
            }
            max = i11;
        }
        return -1;
    }

    public static ArrayList f(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            m1 m1Var = (m1) arrayList.get(i10);
            arrayList2.add(new m1(m1Var.a, m1Var.b));
        }
        return arrayList2;
    }

    public final void c() {
        ArrayList arrayList;
        synchronized (this) {
            this.b.clear();
        }
        m.cancelRunnable(this.l);
        this.k.set(false);
        this.d = false;
        if (!this.h || (arrayList = this.i) == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f);
        alertDialog$Builder.a.R = "Shape?";
        alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new kg.j(1, this, arrayList));
        alertDialog$Builder.o();
        this.i = null;
    }
}
