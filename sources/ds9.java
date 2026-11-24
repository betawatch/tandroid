// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ds9 extends zde {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ ArrayList i;
    public final /* synthetic */ hs9 j;

    public ds9(hs9 hs9Var, int i, int i2, int i3, int i4, int i5, ArrayList arrayList, int i6, int i7, ArrayList arrayList2) {
        this.j = hs9Var;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = arrayList;
        this.g = i6;
        this.h = i7;
        this.i = arrayList2;
    }

    @Override // zde
    public final boolean a(int i, int i2) {
        return b(i, i2);
    }

    @Override // zde
    public final boolean b(int i, int i2) {
        k27 k27Var;
        hs9 hs9Var = this.j;
        if (i >= 0 && i2 >= 0) {
            if (i == this.b && i2 == hs9Var.s) {
                return true;
            }
            if (i == this.c && i2 == hs9Var.y) {
                return true;
            }
        }
        k27 k27Var2 = null;
        int i3 = this.d;
        if (i < i3 || i >= this.e) {
            int i4 = this.g;
            k27Var = (i < i4 || i >= this.h) ? null : (k27) this.i.get(i - i4);
        } else {
            k27Var = (k27) this.f.get(i - i3);
        }
        int i5 = hs9Var.w;
        if (i2 < i5 || i2 >= hs9Var.x) {
            int i6 = hs9Var.E;
            if (i2 >= i6 && i2 < hs9Var.F) {
                k27Var2 = (k27) hs9Var.f.get(i2 - i6);
            }
        } else {
            k27Var2 = (k27) hs9Var.e.get(i2 - i5);
        }
        return (k27Var2 == null || k27Var == null || k27Var2.F0() == null || k27Var.F0() == null || k27Var2.F0().id != k27Var.F0().id) ? false : true;
    }

    @Override // zde
    public final int c() {
        return this.j.r;
    }

    @Override // zde
    public final int d() {
        return this.a;
    }
}
