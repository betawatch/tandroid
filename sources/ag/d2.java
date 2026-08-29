package ag;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.DispatchQueue;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class d2 {
    public static final DispatchQueue m = new DispatchQueue("ShapeDetector");
    public static final double n = Math.sqrt(125000.0d) / 2.0d;
    public int a;
    public ArrayList b;
    public ArrayList c;
    public boolean d;
    public i0 e;
    public Context f;
    public SharedPreferences g;
    public boolean h;
    public ArrayList i;
    public AtomicBoolean j;
    public AtomicBoolean k;
    public x1 l;

    public static b2 a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((a2) arrayList.get(0)).a;
        double d10 = ((a2) arrayList.get(0)).b;
        b2 b2Var = new b2();
        b2Var.a = d;
        b2Var.b = d10;
        b2Var.c = d;
        b2Var.d = d10;
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            a2 a2Var = (a2) arrayList.get(i10);
            double d11 = a2Var.a;
            double d12 = a2Var.b;
            if (b2Var.a >= d11) {
                b2Var.a = d11;
            }
            if (b2Var.b >= d12) {
                b2Var.b = d12;
            }
            if (b2Var.c <= d11) {
                b2Var.c = d11;
            }
            if (b2Var.d <= d12) {
                b2Var.d = d12;
            }
        }
        return b2Var;
    }

    public static a2 b(ArrayList arrayList) {
        a2 a2Var = new a2(0.0d, 0.0d);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            a2 a2Var2 = (a2) arrayList.get(i10);
            a2Var.a += a2Var2.a;
            a2Var.b += a2Var2.b;
        }
        a2Var.a /= arrayList.size();
        a2Var.b /= arrayList.size();
        return a2Var;
    }

    public static double d(ArrayList arrayList, a2 a2Var, ArrayList arrayList2, double d) {
        a2 a2Var2 = a2Var;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d10 = 0.0d;
        int i10 = 0;
        while (i10 < min) {
            a2 a2Var3 = (a2) arrayList.get(i10);
            a2 a2Var4 = (a2) arrayList2.get(i10);
            double d11 = a2Var3.a;
            double d12 = cos;
            double d13 = a2Var2.a;
            double d14 = d11 - d13;
            double d15 = a2Var3.b;
            double d16 = a2Var2.b;
            double d17 = d15 - d16;
            d10 += a2Var4.a(((d14 * d12) - (d17 * sin)) + d13, (d17 * d12) + (d14 * sin) + d16);
            i10++;
            a2Var2 = a2Var;
            cos = d12;
        }
        return d10 / arrayList.size();
    }

    public static int e(int i10, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            a2 a2Var = (a2) arrayList.get(max - 1);
            a2 a2Var2 = (a2) arrayList.get(max);
            int i11 = max + 1;
            a2 a2Var3 = (a2) arrayList.get(i11);
            a2Var.getClass();
            double a2 = a2Var.a(a2Var2.a, a2Var2.b);
            double a10 = a2Var.a(a2Var3.a, a2Var3.b);
            double a11 = a2Var2.a(a2Var3.a, a2Var3.b);
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
            a2 a2Var = (a2) arrayList.get(i10);
            arrayList2.add(new a2(a2Var.a, a2Var.b));
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
        alertDialog$Builder.a.N = "Shape?";
        alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new y1(0, this, arrayList));
        alertDialog$Builder.o();
        this.i = null;
    }
}
