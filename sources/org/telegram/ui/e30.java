package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class e30 extends g.p {
    public final /* synthetic */ f60 c;

    public e30(f60 f60Var) {
        this.c = f60Var;
    }

    @Override // g.p
    public final int i(int i10) {
        z50 z50Var;
        int i11;
        int i12;
        int i13 = f60.F3 ? 6 : 2;
        if (f60.G3 || i10 < (i11 = (z50Var = this.c.P).G) || i10 >= (i12 = z50Var.H)) {
            return i13;
        }
        int i14 = i12 - i11;
        int i15 = (i10 != i12 - 1 || (!f60.F3 && i14 % 2 == 0)) ? 1 : 2;
        if (!f60.F3) {
            return i15;
        }
        if (i14 == 1) {
            return 6;
        }
        return i14 == 2 ? 3 : 2;
    }
}
