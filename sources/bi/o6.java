package bi;

import android.graphics.Typeface;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class o6 {
    public final Runnable a;
    public n6 b;
    public n6 c;
    public n6 d;
    public int e;
    public float f;
    public final ArrayList g;
    public final n6 h;
    public final n6 i;
    public final float j;
    public final int k;
    public int l;
    public final org.telegram.ui.Components.w5 m;
    public int n = -1;

    public o6(Runnable runnable, ArrayList arrayList, n6 n6Var, n6 n6Var2, float f10, int i7) {
        this.f = 0.0f;
        this.a = runnable;
        this.g = arrayList;
        this.h = n6Var;
        this.i = n6Var2;
        this.j = f10;
        this.k = i7;
        org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5(runnable, 300L, xq.h);
        this.m = w5Var;
        w5Var.a(true);
        this.f = -0.5f;
        this.e = 1;
        this.l = i7;
        this.b = n6Var;
        this.c = d(false);
        this.d = d(false);
    }

    public final void a() {
        n6 n6Var = this.h;
        if (n6Var != null) {
            n6Var.a();
        }
        n6 n6Var2 = this.i;
        if (n6Var2 != null) {
            n6Var2.a();
        }
    }

    public final boolean b(float f10) {
        return this.c == this.i && this.f + f10 >= ((float) this.e) + 0.5f;
    }

    public final boolean c() {
        return this.c == this.i && this.f >= ((float) this.e) + 0.5f;
    }

    public final n6 d(boolean z9) {
        ArrayList arrayList;
        if (z9) {
            n6 n6Var = this.i;
            if (n6Var.b()) {
                int i7 = this.l;
                if (i7 <= 0) {
                    return n6Var;
                }
                this.l = i7 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            arrayList = this.g;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (i10 != this.n && ((n6) arrayList.get(i10)).b()) {
                arrayList2.add(Integer.valueOf(i10));
            }
            i10++;
        }
        if (arrayList2.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((n6) arrayList.get(i11)).b()) {
                    arrayList2.add(Integer.valueOf(i11));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        Typeface typeface = org.telegram.messenger.g0.a;
        int intValue = ((Integer) (arrayList2.isEmpty() ? null : arrayList2.get(Math.abs(((int) Utilities.c.nextLong()) % arrayList2.size())))).intValue();
        this.n = intValue;
        return (n6) arrayList.get(intValue);
    }

    public final void e() {
        this.b = this.c;
        this.c = this.i;
        this.d = null;
        int i7 = this.e + 1;
        this.e = i7;
        this.f = i7 + 0.5f;
    }

    public final float f(boolean z9, float f10) {
        long j3;
        n6 n6Var;
        int i7 = this.l;
        int i10 = this.k;
        if (i7 >= i10) {
            j3 = 450;
        } else {
            j3 = i10 == 3 ? 4500 : 2500;
        }
        org.telegram.ui.Components.w5 w5Var = this.m;
        w5Var.g = j3;
        float T1 = (f10 * org.telegram.messenger.g0.T1(i10 == 3 ? 0.75f : 2.0f, 7.5f, w5Var.d(i7 >= i10)) * this.j) + this.f;
        this.f = T1;
        n6 n6Var2 = this.i;
        if (T1 >= 0.0f) {
            double d = T1;
            if (Math.floor(d) + 1.0d > this.e && (n6Var = this.c) != n6Var2) {
                this.b = n6Var;
                n6 n6Var3 = this.d;
                this.c = n6Var3;
                this.d = n6Var3 == n6Var2 ? null : d(z9);
                this.e = ((int) Math.floor(d)) + 1;
            }
        }
        return this.c == n6Var2 ? Math.min(T1, this.e + 0.5f) : T1;
    }
}
