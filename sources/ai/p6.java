package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class p6 {
    public final Runnable a;
    public o6 b;
    public o6 c;
    public o6 d;
    public int e;
    public float f;
    public final ArrayList g;
    public final o6 h;
    public final o6 i;
    public final float j;
    public final int k;
    public int l;
    public final org.telegram.ui.Components.f6 m;
    public int n = -1;

    public p6(Runnable runnable, ArrayList arrayList, o6 o6Var, o6 o6Var2, float f7, int i10) {
        this.f = 0.0f;
        this.a = runnable;
        this.g = arrayList;
        this.h = o6Var;
        this.i = o6Var2;
        this.j = f7;
        this.k = i10;
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(runnable, 300L, bs.h);
        this.m = f6Var;
        f6Var.a(true);
        this.f = -0.5f;
        this.e = 1;
        this.l = i10;
        this.b = o6Var;
        this.c = d(false);
        this.d = d(false);
    }

    public final void a() {
        o6 o6Var = this.h;
        if (o6Var != null) {
            o6Var.a();
        }
        o6 o6Var2 = this.i;
        if (o6Var2 != null) {
            o6Var2.a();
        }
    }

    public final boolean b(float f7) {
        return this.c == this.i && this.f + f7 >= ((float) this.e) + 0.5f;
    }

    public final boolean c() {
        return this.c == this.i && this.f >= ((float) this.e) + 0.5f;
    }

    public final o6 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            o6 o6Var = this.i;
            if (o6Var.b()) {
                int i10 = this.l;
                if (i10 <= 0) {
                    return o6Var;
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
            if (i11 != this.n && ((o6) arrayList.get(i11)).b()) {
                arrayList2.add(Integer.valueOf(i11));
            }
            i11++;
        }
        if (arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((o6) arrayList.get(i12)).b()) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        int intValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
        this.n = intValue;
        return (o6) arrayList.get(intValue);
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
        o6 o6Var;
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
        o6 o6Var2 = this.i;
        if (lerp >= 0.0f) {
            double d = lerp;
            if (Math.floor(d) + 1.0d > this.e && (o6Var = this.c) != o6Var2) {
                this.b = o6Var;
                o6 o6Var3 = this.d;
                this.c = o6Var3;
                this.d = o6Var3 == o6Var2 ? null : d(z10);
                this.e = ((int) Math.floor(d)) + 1;
            }
        }
        return this.c == o6Var2 ? Math.min(lerp, this.e + 0.5f) : lerp;
    }
}
