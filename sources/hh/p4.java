package hh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class p4 {
    public final Runnable a;
    public o4 b;
    public o4 c;
    public o4 d;
    public int e;
    public float f;
    public final ArrayList g;
    public final o4 h;
    public final o4 i;
    public final float j;
    public final int k;
    public int l;
    public final org.telegram.ui.Components.y5 m;
    public int n = -1;

    public p4(Runnable runnable, ArrayList arrayList, o4 o4Var, o4 o4Var2, float f10, int i10) {
        this.f = 0.0f;
        this.a = runnable;
        this.g = arrayList;
        this.h = o4Var;
        this.i = o4Var2;
        this.j = f10;
        this.k = i10;
        org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(runnable, 300L, er.h);
        this.m = y5Var;
        y5Var.a(true);
        this.f = -0.5f;
        this.e = 1;
        this.l = i10;
        this.b = o4Var;
        this.c = d(false);
        this.d = d(false);
    }

    public final void a() {
        o4 o4Var = this.h;
        if (o4Var != null) {
            o4Var.a();
        }
        o4 o4Var2 = this.i;
        if (o4Var2 != null) {
            o4Var2.a();
        }
    }

    public final boolean b(float f10) {
        return this.c == this.i && this.f + f10 >= ((float) this.e) + 0.5f;
    }

    public final boolean c() {
        return this.c == this.i && this.f >= ((float) this.e) + 0.5f;
    }

    public final o4 d(boolean z10) {
        ArrayList arrayList;
        if (z10) {
            o4 o4Var = this.i;
            if (o4Var.b()) {
                int i10 = this.l;
                if (i10 <= 0) {
                    return o4Var;
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
            if (i11 != this.n && ((o4) arrayList.get(i11)).b()) {
                arrayList2.add(Integer.valueOf(i11));
            }
            i11++;
        }
        if (arrayList2.isEmpty()) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (((o4) arrayList.get(i12)).b()) {
                    arrayList2.add(Integer.valueOf(i12));
                }
            }
            if (arrayList2.isEmpty()) {
                return this.h;
            }
        }
        int intValue = ((Integer) AndroidUtilities.randomOf(arrayList2)).intValue();
        this.n = intValue;
        return (o4) arrayList.get(intValue);
    }

    public final void e() {
        this.b = this.c;
        this.c = this.i;
        this.d = null;
        int i10 = this.e + 1;
        this.e = i10;
        this.f = i10 + 0.5f;
    }

    public final float f(float f10, boolean z10) {
        long j10;
        o4 o4Var;
        int i10 = this.l;
        int i11 = this.k;
        if (i10 >= i11) {
            j10 = 450;
        } else {
            j10 = i11 == 3 ? 4500 : 2500;
        }
        org.telegram.ui.Components.y5 y5Var = this.m;
        y5Var.g = j10;
        float lerp = (f10 * AndroidUtilities.lerp(i11 == 3 ? 0.75f : 2.0f, 7.5f, y5Var.e(i10 >= i11)) * this.j) + this.f;
        this.f = lerp;
        o4 o4Var2 = this.i;
        if (lerp >= 0.0f) {
            double d = lerp;
            if (Math.floor(d) + 1.0d > this.e && (o4Var = this.c) != o4Var2) {
                this.b = o4Var;
                o4 o4Var3 = this.d;
                this.c = o4Var3;
                this.d = o4Var3 == o4Var2 ? null : d(z10);
                this.e = ((int) Math.floor(d)) + 1;
            }
        }
        return this.c == o4Var2 ? Math.min(lerp, this.e + 0.5f) : lerp;
    }
}
