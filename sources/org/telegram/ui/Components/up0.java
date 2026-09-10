package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class up0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ sq0 d;

    public /* synthetic */ up0(sq0 sq0Var, int i10) {
        this.c = i10;
        this.d = sq0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        switch (this.c) {
            case 0:
                if (i10 == 0) {
                    return this.d.H.J;
                }
                return 1;
            case 1:
                oq0 oq0Var = this.d.M;
                return (i10 == oq0Var.w || i10 == oq0Var.x || i10 == oq0Var.y || i10 == oq0Var.F || oq0Var.j(i10) == 0) ? 4 : 1;
            default:
                if (i10 == 0) {
                    return this.d.I.J;
                }
                return 1;
        }
    }
}
