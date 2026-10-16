package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class l30 extends g.o {
    public final /* synthetic */ n60 c;

    public l30(n60 n60Var) {
        this.c = n60Var;
    }

    @Override // g.o
    public final int i(int i10) {
        h60 h60Var;
        int i11;
        int i12;
        int i13 = n60.F3 ? 6 : 2;
        if (n60.G3 || i10 < (i11 = (h60Var = this.c.P).G) || i10 >= (i12 = h60Var.H)) {
            return i13;
        }
        int i14 = i12 - i11;
        int i15 = (i10 != i12 - 1 || (!n60.F3 && i14 % 2 == 0)) ? 1 : 2;
        if (!n60.F3) {
            return i15;
        }
        if (i14 == 1) {
            return 6;
        }
        return i14 == 2 ? 3 : 2;
    }
}
