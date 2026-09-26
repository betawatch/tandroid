package org.telegram.ui;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class c30 extends g.p {
    public final /* synthetic */ d60 c;

    public c30(d60 d60Var) {
        this.c = d60Var;
    }

    @Override // g.p
    public final int i(int i10) {
        x50 x50Var;
        int i11;
        int i12;
        int i13 = d60.F3 ? 6 : 2;
        if (d60.G3 || i10 < (i11 = (x50Var = this.c.P).G) || i10 >= (i12 = x50Var.H)) {
            return i13;
        }
        int i14 = i12 - i11;
        int i15 = (i10 != i12 - 1 || (!d60.F3 && i14 % 2 == 0)) ? 1 : 2;
        if (!d60.F3) {
            return i15;
        }
        if (i14 == 1) {
            return 6;
        }
        return i14 == 2 ? 3 : 2;
    }
}
