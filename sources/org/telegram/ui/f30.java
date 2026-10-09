package org.telegram.ui;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class f30 extends g.o {
    public final /* synthetic */ g60 c;

    public f30(g60 g60Var) {
        this.c = g60Var;
    }

    @Override // g.o
    public final int i(int i10) {
        a60 a60Var;
        int i11;
        int i12;
        int i13 = g60.F3 ? 6 : 2;
        if (g60.G3 || i10 < (i11 = (a60Var = this.c.P).G) || i10 >= (i12 = a60Var.H)) {
            return i13;
        }
        int i14 = i12 - i11;
        int i15 = (i10 != i12 - 1 || (!g60.F3 && i14 % 2 == 0)) ? 1 : 2;
        if (!g60.F3) {
            return i15;
        }
        if (i14 == 1) {
            return 6;
        }
        return i14 == 2 ? 3 : 2;
    }
}
