package gh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r4 {
    public final Runnable a;
    public q4 b;
    public q4 c;
    public q4 d;
    public int e;
    public float f;
    public final ArrayList g;
    public final q4 h;
    public final q4 i;
    public final float j;
    public final int k;
    public int l;
    public final org.telegram.ui.Components.y5 m;
    public int n = -1;

    public r4(Runnable runnable, ArrayList arrayList, q4 q4Var, q4 q4Var2, float f10, int i9) {
        this.f = 0.0f;
        this.a = runnable;
        this.g = arrayList;
        this.h = q4Var;
        this.i = q4Var2;
        this.j = f10;
        this.k = i9;
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(runnable, 300L, gr.h);
        this.m = y5Var;
        y5Var.a(true);
        this.f = -0.5f;
        this.e = 1;
        this.l = i9;
        this.b = q4Var;
        this.c = d(false);
        this.d = d(false);
    }

    public final void a() {
        q4 q4Var = this.h;
        if (q4Var != null) {
            q4Var.a();
        }
        q4 q4Var2 = this.i;
        if (q4Var2 != null) {
            q4Var2.a();
        }
    }

    public final boolean b(float f10) {
        return this.c == this.i && this.f + f10 >= ((float) this.e) + 0.5f;
    }

    public final boolean c() {
        return this.c == this.i && this.f >= ((float) this.e) + 0.5f;
    }

    public final q4 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            q4 q4Var = this.i;
            if (q4Var.b()) {
                int i9 = this.l;
                if (i9 <= 0) {
                    return q4Var;
                }
                this.l = i9 - 1;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (true) {
            arrayList = this.g;
            if (i10 >= arrayList.size()) {
                break;
            }
            if (i10 != this.n && ((q4) arrayList.get(i10)).b()) {
                arrayList2.add(Integer.valueOf(i10));
            }
            i10++;
        }
        if (arrayList2.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (((q4) arrayList.get(i11)).b()) {
                    arrayList2.add(Integer.valueOf(i11));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        int intValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
        this.n = intValue;
        return (q4) arrayList.get(intValue);
    }

    public final void e() {
        this.b = this.c;
        this.c = this.i;
        this.d = null;
        int i9 = this.e + 1;
        this.e = i9;
        this.f = i9 + 0.5f;
    }

    public final float f(float f10, boolean z10) {
        long j10;
        q4 q4Var;
        int i9 = this.l;
        int i10 = this.k;
        if (i9 >= i10) {
            j10 = 450;
        } else {
            j10 = i10 == 3 ? 4500 : 2500;
        }
        org.telegram.ui.Components.y5 y5Var = this.m;
        y5Var.g = j10;
        float lerp = (f10 * AndroidUtilities.lerp(i10 == 3 ? 0.75f : 2.0f, 7.5f, y5Var.e(i9 >= i10)) * this.j) + this.f;
        this.f = lerp;
        q4 q4Var2 = this.i;
        if (lerp >= 0.0f) {
            double d = lerp;
            if (Math.floor(d) + 1.0d > this.e && (q4Var = this.c) != q4Var2) {
                this.b = q4Var;
                q4 q4Var3 = this.d;
                this.c = q4Var3;
                this.d = q4Var3 == q4Var2 ? null : d(z10);
                this.e = ((int) Math.floor(d)) + 1;
            }
        }
        return this.c == q4Var2 ? Math.min(lerp, this.e + 0.5f) : lerp;
    }
}
