package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class h10 extends g.p {
    public final /* synthetic */ e40 c;

    public h10(e40 e40Var) {
        this.c = e40Var;
    }

    @Override // g.p
    public final int i(int i7) {
        y30 y30Var;
        int i10;
        int i11;
        int i12 = e40.E5 ? 6 : 2;
        if (e40.F5 || i7 < (i10 = (y30Var = this.c.K1).H) || i7 >= (i11 = y30Var.I)) {
            return i12;
        }
        int i13 = i11 - i10;
        int i14 = (i7 != i11 - 1 || (!e40.E5 && i13 % 2 == 0)) ? 1 : 2;
        if (!e40.E5) {
            return i14;
        }
        if (i13 == 1) {
            return 6;
        }
        return i13 == 2 ? 3 : 2;
    }
}
