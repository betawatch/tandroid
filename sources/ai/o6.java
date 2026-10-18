package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
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
    public final org.telegram.ui.Components.f6 m;
    public int n = -1;

    public o6(Runnable runnable, ArrayList arrayList, n6 n6Var, n6 n6Var2, float f7, int i10) {
        this.f = 0.0f;
        this.a = runnable;
        this.g = arrayList;
        this.h = n6Var;
        this.i = n6Var2;
        this.j = f7;
        this.k = i10;
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(runnable, 300L, bs.h);
        this.m = f6Var;
        f6Var.a(true);
        this.f = -0.5f;
        this.e = 1;
        this.l = i10;
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

    public final boolean b(float f7) {
        return this.c == this.i && this.f + f7 >= ((float) this.e) + 0.5f;
    }

    public final boolean c() {
        return this.c == this.i && this.f >= ((float) this.e) + 0.5f;
    }

    public final n6 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            n6 n6Var = this.i;
            if (n6Var.b()) {
                int i10 = this.l;
                if (i10 <= 0) {
                    return n6Var;
                }
                this.l = i10 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = this.g;
            if (i11 >= arrayList.size()) {
                break;
            }
            if (i11 != this.n && ((n6) arrayList.get(i11)).b()) {
                arrayList2.add(Integer.valueOf(i11));
            }
            i11++;
        }
        if (arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((n6) arrayList.get(i12)).b()) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        int intValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
        this.n = intValue;
        return (n6) arrayList.get(intValue);
    }

    public final void e() {
        this.b = this.c;
        this.c = this.i;
        this.d = null;
        int i10 = this.e + 1;
        this.e = i10;
        this.f = i10 + 0.5f;
    }

    public final float f(float f7, boolean z10) {
        long j10;
        n6 n6Var;
        int i10 = this.l;
        int i11 = this.k;
        if (i10 >= i11) {
            j10 = 450;
        } else {
            j10 = i11 == 3 ? 4500 : 2500;
        }
        org.telegram.ui.Components.f6 f6Var = this.m;
        f6Var.g = j10;
        float lerp = (f7 * AndroidUtilities.lerp(i11 == 3 ? 0.75f : 2.0f, 7.5f, f6Var.e(i10 >= i11)) * this.j) + this.f;
        this.f = lerp;
        n6 n6Var2 = this.i;
        if (lerp >= 0.0f) {
            double d = lerp;
            if (Math.floor(d) + 1.0d > this.e && (n6Var = this.c) != n6Var2) {
                this.b = n6Var;
                n6 n6Var3 = this.d;
                this.c = n6Var3;
                this.d = n6Var3 == n6Var2 ? null : d(z10);
                this.e = ((int) Math.floor(d)) + 1;
            }
        }
        return this.c == n6Var2 ? Math.min(lerp, this.e + 0.5f) : lerp;
    }
}
