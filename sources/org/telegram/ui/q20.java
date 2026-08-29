package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class q20 extends f2.v {
    public final /* synthetic */ r50 c;

    public q20(r50 r50Var) {
        this.c = r50Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        l50 l50Var;
        int i11;
        int i12;
        int i13 = r50.B3 ? 6 : 2;
        if (r50.C3 || i10 < (i11 = (l50Var = this.c.L).C) || i10 >= (i12 = l50Var.D)) {
            return i13;
        }
        int i14 = i12 - i11;
        int i15 = (i10 != i12 - 1 || (!r50.B3 && i14 % 2 == 0)) ? 1 : 2;
        if (!r50.B3) {
            return i15;
        }
        if (i14 == 1) {
            return 6;
        }
        return i14 == 2 ? 3 : 2;
    }
}
