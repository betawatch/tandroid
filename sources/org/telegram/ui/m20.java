package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class m20 extends f2.x {
    public final /* synthetic */ o50 c;

    public m20(o50 o50Var) {
        this.c = o50Var;
    }

    @Override // f2.x
    public final int i(int i9) {
        i50 i50Var;
        int i10;
        int i11;
        int i12 = o50.B3 ? 6 : 2;
        if (o50.C3 || i9 < (i10 = (i50Var = this.c.L).C) || i9 >= (i11 = i50Var.D)) {
            return i12;
        }
        int i13 = i11 - i10;
        int i14 = (i9 != i11 - 1 || (!o50.B3 && i13 % 2 == 0)) ? 1 : 2;
        if (!o50.B3) {
            return i14;
        }
        if (i13 == 1) {
            return 6;
        }
        return i13 == 2 ? 3 : 2;
    }
}
