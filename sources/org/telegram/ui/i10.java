package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
