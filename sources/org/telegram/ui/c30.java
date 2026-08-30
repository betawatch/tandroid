package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class c30 extends f2.v {
    public final /* synthetic */ c60 c;

    public c30(c60 c60Var) {
        this.c = c60Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        w50 w50Var;
        int i11;
        int i12;
        int i13 = c60.C3 ? 6 : 2;
        if (c60.D3 || i10 < (i11 = (w50Var = this.c.M).D) || i10 >= (i12 = w50Var.E)) {
            return i13;
        }
        int i14 = i12 - i11;
        int i15 = (i10 != i12 - 1 || (!c60.C3 && i14 % 2 == 0)) ? 1 : 2;
        if (!c60.C3) {
            return i15;
        }
        if (i14 == 1) {
            return 6;
        }
        return i14 == 2 ? 3 : 2;
    }
}
