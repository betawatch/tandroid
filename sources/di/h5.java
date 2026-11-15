package di;

import android.graphics.Typeface;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class h5 {
    public final Runnable a;
    public g5 b;
    public g5 c;
    public g5 d;
    public int e;
    public float f;
    public final ArrayList g;
    public final g5 h;
    public final g5 i;
    public final float j;
    public final int k;
    public int l;
    public final org.telegram.ui.Components.u5 m;
    public int n = -1;

    public h5(Runnable runnable, ArrayList arrayList, g5 g5Var, g5 g5Var2, float f10, int i7) {
        this.f = 0.0f;
        this.a = runnable;
        this.g = arrayList;
        this.h = g5Var;
        this.i = g5Var2;
        this.j = f10;
        this.k = i7;
        org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(runnable, 300L, er.h);
        this.m = u5Var;
        u5Var.a(true);
        this.f = -0.5f;
        this.e = 1;
        this.l = i7;
        this.b = g5Var;
        this.c = d(false);
        this.d = d(false);
    }

    public final void a() {
        g5 g5Var = this.h;
        if (g5Var != null) {
            g5Var.a();
        }
        g5 g5Var2 = this.i;
        if (g5Var2 != null) {
            g5Var2.a();
        }
    }

    public final boolean b(float f10) {
        return this.c == this.i && this.f + f10 >= ((float) this.e) + 0.5f;
    }

    public final boolean c() {
        return this.c == this.i && this.f >= ((float) this.e) + 0.5f;
    }

    public final g5 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            g5 g5Var = this.i;
            if (g5Var.b()) {
                int i7 = this.l;
                if (i7 <= 0) {
                    return g5Var;
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
            if (i10 != this.n && ((g5) arrayList.get(i10)).b()) {
                arrayList2.add(Integer.valueOf(i10));
            }
            i10++;
        }
        if (arrayList2.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((g5) arrayList.get(i11)).b()) {
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
        return (g5) arrayList.get(intValue);
    }

    public final void e() {
        this.b = this.c;
        this.c = this.i;
        this.d = null;
        int i7 = this.e + 1;
        this.e = i7;
        this.f = i7 + 0.5f;
    }

    public final float f(boolean z10, float f10) {
        long j3;
        g5 g5Var;
        int i7 = this.l;
        int i10 = this.k;
        if (i7 >= i10) {
            j3 = 450;
        } else {
            j3 = i10 == 3 ? 4500 : 2500;
        }
        org.telegram.ui.Components.u5 u5Var = this.m;
        u5Var.g = j3;
        float T1 = (f10 * org.telegram.messenger.g0.T1(i10 == 3 ? 0.75f : 2.0f, 7.5f, u5Var.d(i7 >= i10)) * this.j) + this.f;
        this.f = T1;
        g5 g5Var2 = this.i;
        if (T1 >= 0.0f) {
            double d = T1;
            if (Math.floor(d) + 1.0d > this.e && (g5Var = this.c) != g5Var2) {
                this.b = g5Var;
                g5 g5Var3 = this.d;
                this.c = g5Var3;
                this.d = g5Var3 == g5Var2 ? null : d(z10);
                this.e = ((int) Math.floor(d)) + 1;
            }
        }
        return this.c == g5Var2 ? Math.min(T1, this.e + 0.5f) : T1;
    }
}
