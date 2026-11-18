package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class al0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ml0 a;

    public al0(ml0 ml0Var) {
        this.a = ml0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        ml0 ml0Var = this.a;
        if (i7 == -1) {
            if (ml0Var.Q0) {
                return;
            }
            ml0Var.finishFragment();
            return;
        }
        if (i7 != 1 || ml0Var.Q0) {
            return;
        }
        if (ml0Var.v0 != 3) {
            org.telegram.messenger.g0.v1(ml0Var.getParentActivity().getCurrentFocus());
        }
        int i10 = ml0Var.v0;
        if (i10 == 0) {
            ml0Var.J0(true);
            ml0.r0(ml0Var);
            return;
        }
        int i11 = 0;
        if (i10 == 1) {
            while (true) {
                org.telegram.ui.Cells.i6[] i6VarArr = ml0Var.h;
                if (i11 >= i6VarArr.length) {
                    break;
                }
                if (i6VarArr[i11].b.f) {
                    ml0Var.H0 = ml0Var.F0.shipping_options.get(i11);
                    break;
                }
                i11++;
            }
            ml0Var.z0();
            return;
        }
        if (i10 == 2) {
            ml0.o0(ml0Var);
        } else if (i10 == 3) {
            ml0.p0(ml0Var);
        } else {
            if (i10 != 6) {
                return;
            }
            ml0Var.G0(false);
        }
    }
}
