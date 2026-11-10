package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class j10 extends g.p {
    public final /* synthetic */ f40 c;

    public j10(f40 f40Var) {
        this.c = f40Var;
    }

    @Override // g.p
    public final int i(int i7) {
        z30 z30Var;
        int i10;
        int i11;
        int i12 = f40.z5 ? 6 : 2;
        if (f40.A5 || i7 < (i10 = (z30Var = this.c.J1).G) || i7 >= (i11 = z30Var.H)) {
            return i12;
        }
        int i13 = i11 - i10;
        int i14 = (i7 != i11 - 1 || (!f40.z5 && i13 % 2 == 0)) ? 1 : 2;
        if (!f40.z5) {
            return i14;
        }
        if (i13 == 1) {
            return 6;
        }
        return i13 == 2 ? 3 : 2;
    }
}
