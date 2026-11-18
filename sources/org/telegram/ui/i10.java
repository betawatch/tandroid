package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class i10 extends g.p {
    public final /* synthetic */ f40 c;

    public i10(f40 f40Var) {
        this.c = f40Var;
    }

    @Override // g.p
    public final int i(int i7) {
        z30 z30Var;
        int i10;
        int i11;
        int i12 = f40.E5 ? 6 : 2;
        if (f40.F5 || i7 < (i10 = (z30Var = this.c.K1).H) || i7 >= (i11 = z30Var.I)) {
            return i12;
        }
        int i13 = i11 - i10;
        int i14 = (i7 != i11 - 1 || (!f40.E5 && i13 % 2 == 0)) ? 1 : 2;
        if (!f40.E5) {
            return i14;
        }
        if (i13 == 1) {
            return 6;
        }
        return i13 == 2 ? 3 : 2;
    }
}
