package dg;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.DispatchQueue;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class y1 {
    public static final DispatchQueue m = new DispatchQueue("ShapeDetector");
    public static final double n = Math.sqrt(125000.0d) / 2.0d;
    public int a;
    public ArrayList b;
    public ArrayList c;
    public boolean d;
    public h0 e;
    public Context f;
    public SharedPreferences g;
    public boolean h;
    public ArrayList i;
    public AtomicBoolean j;
    public AtomicBoolean k;
    public s1 l;

    public static w1 a(ArrayList arrayList) {
        if (arrayList.size() <= 0) {
            return null;
        }
        double d = ((v1) arrayList.get(0)).a;
        double d10 = ((v1) arrayList.get(0)).b;
        w1 w1Var = new w1();
        w1Var.a = d;
        w1Var.b = d10;
        w1Var.c = d;
        w1Var.d = d10;
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            v1 v1Var = (v1) arrayList.get(i10);
            double d11 = v1Var.a;
            double d12 = v1Var.b;
            if (w1Var.a >= d11) {
                w1Var.a = d11;
            }
            if (w1Var.b >= d12) {
                w1Var.b = d12;
            }
            if (w1Var.c <= d11) {
                w1Var.c = d11;
            }
            if (w1Var.d <= d12) {
                w1Var.d = d12;
            }
        }
        return w1Var;
    }

    public static v1 b(ArrayList arrayList) {
        v1 v1Var = new v1(0.0d, 0.0d);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            v1 v1Var2 = (v1) arrayList.get(i10);
            v1Var.a += v1Var2.a;
            v1Var.b += v1Var2.b;
        }
        v1Var.a /= arrayList.size();
        v1Var.b /= arrayList.size();
        return v1Var;
    }

    public static double d(ArrayList arrayList, v1 v1Var, ArrayList arrayList2, double d) {
        v1 v1Var2 = v1Var;
        double cos = Math.cos(d);
        double sin = Math.sin(d);
        int min = Math.min(arrayList.size(), arrayList2.size());
        double d10 = 0.0d;
        int i10 = 0;
        while (i10 < min) {
            v1 v1Var3 = (v1) arrayList.get(i10);
            v1 v1Var4 = (v1) arrayList2.get(i10);
            double d11 = v1Var3.a;
            double d12 = cos;
            double d13 = v1Var2.a;
            double d14 = d11 - d13;
            double d15 = v1Var3.b;
            double d16 = v1Var2.b;
            double d17 = d15 - d16;
            d10 += v1Var4.a(((d14 * d12) - (d17 * sin)) + d13, (d17 * d12) + (d14 * sin) + d16);
            i10++;
            v1Var2 = v1Var;
            cos = d12;
        }
        return d10 / arrayList.size();
    }

    public static int e(int i10, ArrayList arrayList) {
        int max = Math.max(1, arrayList.size() / 4);
        while (max < arrayList.size() - 1) {
            v1 v1Var = (v1) arrayList.get(max - 1);
            v1 v1Var2 = (v1) arrayList.get(max);
            int i11 = max + 1;
            v1 v1Var3 = (v1) arrayList.get(i11);
            v1Var.getClass();
            double a2 = v1Var.a(v1Var2.a, v1Var2.b);
            double a10 = v1Var.a(v1Var3.a, v1Var3.b);
            double a11 = v1Var2.a(v1Var3.a, v1Var3.b);
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
            v1 v1Var = (v1) arrayList.get(i10);
            arrayList2.add(new v1(v1Var.a, v1Var.b));
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
        alertDialog$Builder.a.O = "Shape?";
        alertDialog$Builder.f(new String[]{"Log all", "Circle", "Rectangle", "Star", "Bubble", "Arrow", "None"}, new t1(0, this, arrayList));
        alertDialog$Builder.o();
        this.i = null;
    }
}
