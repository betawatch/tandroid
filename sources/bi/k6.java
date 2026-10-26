package bi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class k6 {
    public final Runnable a;
    public j6 b;
    public j6 c;
    public j6 d;
    public int e;
    public float f;
    public final ArrayList g;
    public final j6 h;
    public final j6 i;
    public final float j;
    public final int k;
    public int l;
    public final org.telegram.ui.Components.h6 m;
    public int n = -1;

    public k6(Runnable runnable, ArrayList arrayList, j6 j6Var, j6 j6Var2, float f7, int i10) {
        this.f = 0.0f;
        this.a = runnable;
        this.g = arrayList;
        this.h = j6Var;
        this.i = j6Var2;
        this.j = f7;
        this.k = i10;
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(runnable, 300L, ds.h);
        this.m = h6Var;
        h6Var.a(true);
        this.f = -0.5f;
        this.e = 1;
        this.l = i10;
        this.b = j6Var;
        this.c = d(false);
        this.d = d(false);
    }

    public final void a() {
        j6 j6Var = this.h;
        if (j6Var != null) {
            j6Var.a();
        }
        j6 j6Var2 = this.i;
        if (j6Var2 != null) {
            j6Var2.a();
        }
    }

    public final boolean b(float f7) {
        return this.c == this.i && this.f + f7 >= ((float) this.e) + 0.5f;
    }

    public final boolean c() {
        return this.c == this.i && this.f >= ((float) this.e) + 0.5f;
    }

    public final j6 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            j6 j6Var = this.i;
            if (j6Var.b()) {
                int i10 = this.l;
                if (i10 <= 0) {
                    return j6Var;
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
            if (i11 != this.n && ((j6) arrayList.get(i11)).b()) {
                arrayList2.add(Integer.valueOf(i11));
            }
            i11++;
        }
        if (arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((j6) arrayList.get(i12)).b()) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        int intValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
        this.n = intValue;
        return (j6) arrayList.get(intValue);
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
        j6 j6Var;
        int i10 = this.l;
        int i11 = this.k;
        if (i10 >= i11) {
            j10 = 450;
        } else {
            j10 = i11 == 3 ? 4500 : 2500;
        }
        org.telegram.ui.Components.h6 h6Var = this.m;
        h6Var.g = j10;
        float lerp = (f7 * AndroidUtilities.lerp(i11 == 3 ? 0.75f : 2.0f, 7.5f, h6Var.e(i10 >= i11)) * this.j) + this.f;
        this.f = lerp;
        j6 j6Var2 = this.i;
        if (lerp >= 0.0f) {
            double d = lerp;
            if (Math.floor(d) + 1.0d > this.e && (j6Var = this.c) != j6Var2) {
                this.b = j6Var;
                j6 j6Var3 = this.d;
                this.c = j6Var3;
                this.d = j6Var3 == j6Var2 ? null : d(z10);
                this.e = ((int) Math.floor(d)) + 1;
            }
        }
        return this.c == j6Var2 ? Math.min(lerp, this.e + 0.5f) : lerp;
    }
}
