package org.telegram.ui;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class h30 extends g.p {
    public final /* synthetic */ h60 c;

    public h30(h60 h60Var) {
        this.c = h60Var;
    }

    @Override // g.p
    public final int i(int i10) {
        b60 b60Var;
        int i11;
        int i12;
        int i13 = h60.F3 ? 6 : 2;
        if (h60.G3 || i10 < (i11 = (b60Var = this.c.P).G) || i10 >= (i12 = b60Var.H)) {
            return i13;
        }
        int i14 = i12 - i11;
        int i15 = (i10 != i12 - 1 || (!h60.F3 && i14 % 2 == 0)) ? 1 : 2;
        if (!h60.F3) {
            return i15;
        }
        if (i14 == 1) {
            return 6;
        }
        return i14 == 2 ? 3 : 2;
    }
}
