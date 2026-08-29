package jh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class o4 {
    public final Runnable a;
    public n4 b;
    public n4 c;
    public n4 d;
    public int e;
    public float f;
    public final ArrayList g;
    public final n4 h;
    public final n4 i;
    public final float j;
    public final int k;
    public int l;
    public final org.telegram.ui.Components.d6 m;
    public int n = -1;

    public o4(Runnable runnable, ArrayList arrayList, n4 n4Var, n4 n4Var2, float f9, int i10) {
        this.f = 0.0f;
        this.a = runnable;
        this.g = arrayList;
        this.h = n4Var;
        this.i = n4Var2;
        this.j = f9;
        this.k = i10;
        org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(runnable, 300L, jr.h);
        this.m = d6Var;
        d6Var.a(true);
        this.f = -0.5f;
        this.e = 1;
        this.l = i10;
        this.b = n4Var;
        this.c = d(false);
        this.d = d(false);
    }

    public final void a() {
        n4 n4Var = this.h;
        if (n4Var != null) {
            n4Var.a();
        }
        n4 n4Var2 = this.i;
        if (n4Var2 != null) {
            n4Var2.a();
        }
    }

    public final boolean b(float f9) {
        return this.c == this.i && this.f + f9 >= ((float) this.e) + 0.5f;
    }

    public final boolean c() {
        return this.c == this.i && this.f >= ((float) this.e) + 0.5f;
    }

    public final n4 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            n4 n4Var = this.i;
            if (n4Var.b()) {
                int i10 = this.l;
                if (i10 <= 0) {
                    return n4Var;
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
            if (i11 != this.n && ((n4) arrayList.get(i11)).b()) {
                arrayList2.add(Integer.valueOf(i11));
            }
            i11++;
        }
        if (arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((n4) arrayList.get(i12)).b()) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        int intValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
        this.n = intValue;
        return (n4) arrayList.get(intValue);
    }

    public final void e() {
        this.b = this.c;
        this.c = this.i;
        this.d = null;
        int i10 = this.e + 1;
        this.e = i10;
        this.f = i10 + 0.5f;
    }

    public final float f(float f9, boolean z10) {
        long j10;
        n4 n4Var;
        int i10 = this.l;
        int i11 = this.k;
        if (i10 >= i11) {
            j10 = 450;
        } else {
            j10 = i11 == 3 ? 4500 : 2500;
        }
        org.telegram.ui.Components.d6 d6Var = this.m;
        d6Var.g = j10;
        float lerp = (f9 * AndroidUtilities.lerp(i11 == 3 ? 0.75f : 2.0f, 7.5f, d6Var.e(i10 >= i11)) * this.j) + this.f;
        this.f = lerp;
        n4 n4Var2 = this.i;
        if (lerp >= 0.0f) {
            double d = lerp;
            if (Math.floor(d) + 1.0d > this.e && (n4Var = this.c) != n4Var2) {
                this.b = n4Var;
                n4 n4Var3 = this.d;
                this.c = n4Var3;
                this.d = n4Var3 == n4Var2 ? null : d(z10);
                this.e = ((int) Math.floor(d)) + 1;
            }
        }
        return this.c == n4Var2 ? Math.min(lerp, this.e + 0.5f) : lerp;
    }
}
