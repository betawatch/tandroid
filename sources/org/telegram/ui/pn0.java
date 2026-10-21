package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class pn0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ eo0 a;

    public pn0(eo0 eo0Var) {
        this.a = eo0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        eo0 eo0Var = this.a;
        if (i10 == -1) {
            if (eo0Var.P0) {
                return;
            }
            eo0Var.finishFragment();
            return;
        }
        if (i10 != 1 || eo0Var.P0) {
            return;
        }
        if (eo0Var.u0 != 3) {
            AndroidUtilities.hideKeyboard(eo0Var.getParentActivity().getCurrentFocus());
        }
        int i11 = eo0Var.u0;
        if (i11 == 0) {
            eo0Var.D0(true);
            eo0.m0(eo0Var);
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            while (true) {
                org.telegram.ui.Cells.j6[] j6VarArr = eo0Var.h;
                if (i12 >= j6VarArr.length) {
                    break;
                }
                if (j6VarArr[i12].b.f) {
                    eo0Var.G0 = eo0Var.E0.shipping_options.get(i12);
                    break;
                }
                i12++;
            }
            eo0Var.t0();
            return;
        }
        if (i11 == 2) {
            eo0.j0(eo0Var);
        } else if (i11 == 3) {
            eo0.k0(eo0Var);
        } else {
            if (i11 != 6) {
                return;
            }
            eo0Var.A0(false);
        }
    }
}
