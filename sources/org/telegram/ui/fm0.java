package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fm0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ sm0 a;

    public fm0(sm0 sm0Var) {
        this.a = sm0Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        sm0 sm0Var = this.a;
        if (i10 == -1) {
            if (sm0Var.P0) {
                return;
            }
            sm0Var.finishFragment();
            return;
        }
        if (i10 != 1 || sm0Var.P0) {
            return;
        }
        if (sm0Var.u0 != 3) {
            org.telegram.messenger.i0.v1(sm0Var.getParentActivity().getCurrentFocus());
        }
        int i11 = sm0Var.u0;
        if (i11 == 0) {
            sm0Var.I0(true);
            sm0.q0(sm0Var);
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            while (true) {
                org.telegram.ui.Cells.m6[] m6VarArr = sm0Var.h;
                if (i12 >= m6VarArr.length) {
                    break;
                }
                if (m6VarArr[i12].b.f) {
                    sm0Var.G0 = sm0Var.E0.shipping_options.get(i12);
                    break;
                }
                i12++;
            }
            sm0Var.y0();
            return;
        }
        if (i11 == 2) {
            sm0.n0(sm0Var);
        } else if (i11 == 3) {
            sm0.o0(sm0Var);
        } else {
            if (i11 != 6) {
                return;
            }
            sm0Var.F0(false);
        }
    }
}
