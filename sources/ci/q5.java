package ci;

import android.graphics.Typeface;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q5 {
    public final Runnable a;
    public p5 b;
    public p5 c;
    public p5 d;
    public int e;
    public float f;
    public final ArrayList g;
    public final p5 h;
    public final p5 i;
    public final float j;
    public final int k;
    public int l;
    public final org.telegram.ui.Components.u5 m;
    public int n = -1;

    public q5(Runnable runnable, ArrayList arrayList, p5 p5Var, p5 p5Var2, float f10, int i3) {
        this.f = 0.0f;
        this.a = runnable;
        this.g = arrayList;
        this.h = p5Var;
        this.i = p5Var2;
        this.j = f10;
        this.k = i3;
        org.telegram.ui.Components.u5 u5Var = new org.telegram.ui.Components.u5(runnable, 300L, xq.h);
        this.m = u5Var;
        u5Var.a(true);
        this.f = -0.5f;
        this.e = 1;
        this.l = i3;
        this.b = p5Var;
        this.c = d(false);
        this.d = d(false);
    }

    public final void a() {
        p5 p5Var = this.h;
        if (p5Var != null) {
            p5Var.a();
        }
        p5 p5Var2 = this.i;
        if (p5Var2 != null) {
            p5Var2.a();
        }
    }

    public final boolean b(float f10) {
        return this.c == this.i && this.f + f10 >= ((float) this.e) + 0.5f;
    }

    public final boolean c() {
        return this.c == this.i && this.f >= ((float) this.e) + 0.5f;
    }

    public final p5 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            p5 p5Var = this.i;
            if (p5Var.b()) {
                int i3 = this.l;
                if (i3 <= 0) {
                    return p5Var;
                }
                this.l = i3 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            arrayList = this.g;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (i10 != this.n && ((p5) arrayList.get(i10)).b()) {
                arrayList2.add(Integer.valueOf(i10));
            }
            i10++;
        }
        if (arrayList2.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((p5) arrayList.get(i11)).b()) {
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
        return (p5) arrayList.get(intValue);
    }

    public final void e() {
        this.b = this.c;
        this.c = this.i;
        this.d = null;
        int i3 = this.e + 1;
        this.e = i3;
        this.f = i3 + 0.5f;
    }

    public final float f(boolean z10, float f10) {
        long j10;
        p5 p5Var;
        int i3 = this.l;
        int i10 = this.k;
        if (i3 >= i10) {
            j10 = 450;
        } else {
            j10 = i10 == 3 ? 4500 : 2500;
        }
        org.telegram.ui.Components.u5 u5Var = this.m;
        u5Var.g = j10;
        float T1 = (f10 * org.telegram.messenger.g0.T1(i10 == 3 ? 0.75f : 2.0f, 7.5f, u5Var.d(i3 >= i10)) * this.j) + this.f;
        this.f = T1;
        p5 p5Var2 = this.i;
        if (T1 >= 0.0f) {
            double d = T1;
            if (Math.floor(d) + 1.0d > this.e && (p5Var = this.c) != p5Var2) {
                this.b = p5Var;
                p5 p5Var3 = this.d;
                this.c = p5Var3;
                this.d = p5Var3 == p5Var2 ? null : d(z10);
                this.e = ((int) Math.floor(d)) + 1;
            }
        }
        return this.c == p5Var2 ? Math.min(T1, this.e + 0.5f) : T1;
    }
}
