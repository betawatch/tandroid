package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class h30 extends g.p {
    public final /* synthetic */ i60 c;

    public h30(i60 i60Var) {
        this.c = i60Var;
    }

    @Override // g.p
    public final int i(int i10) {
        c60 c60Var;
        int i11;
        int i12;
        int i13 = i60.F3 ? 6 : 2;
        if (i60.G3 || i10 < (i11 = (c60Var = this.c.P).G) || i10 >= (i12 = c60Var.H)) {
            return i13;
        }
        int i14 = i12 - i11;
        int i15 = (i10 != i12 - 1 || (!i60.F3 && i14 % 2 == 0)) ? 1 : 2;
        if (!i60.F3) {
            return i15;
        }
        if (i14 == 1) {
            return 6;
        }
        return i14 == 2 ? 3 : 2;
    }
}
