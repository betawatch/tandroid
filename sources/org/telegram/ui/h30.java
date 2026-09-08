package org.telegram.ui;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class h30 extends g.p {
    public final /* synthetic */ j60 c;

    public h30(j60 j60Var) {
        this.c = j60Var;
    }

    @Override // g.p
    public final int i(int i10) {
        d60 d60Var;
        int i11;
        int i12;
        int i13 = j60.F3 ? 6 : 2;
        if (j60.G3 || i10 < (i11 = (d60Var = this.c.P).G) || i10 >= (i12 = d60Var.H)) {
            return i13;
        }
        int i14 = i12 - i11;
        int i15 = (i10 != i12 - 1 || (!j60.F3 && i14 % 2 == 0)) ? 1 : 2;
        if (!j60.F3) {
            return i15;
        }
        if (i14 == 1) {
            return 6;
        }
        return i14 == 2 ? 3 : 2;
    }
}
