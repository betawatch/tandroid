package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b10 extends g.p {
    public final /* synthetic */ x30 c;

    public b10(x30 x30Var) {
        this.c = x30Var;
    }

    @Override // g.p
    public final int i(int i3) {
        r30 r30Var;
        int i10;
        int i11;
        int i12 = x30.x5 ? 6 : 2;
        if (x30.y5 || i3 < (i10 = (r30Var = this.c.H1).H) || i3 >= (i11 = r30Var.I)) {
            return i12;
        }
        int i13 = i11 - i10;
        int i14 = (i3 != i11 - 1 || (!x30.x5 && i13 % 2 == 0)) ? 1 : 2;
        if (!x30.x5) {
            return i14;
        }
        if (i13 == 1) {
            return 6;
        }
        return i13 == 2 ? 3 : 2;
    }
}
