package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ho0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ wo0 a;

    public ho0(wo0 wo0Var) {
        this.a = wo0Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        wo0 wo0Var = this.a;
        if (i10 == -1) {
            if (wo0Var.P0) {
                return;
            }
            wo0Var.finishFragment();
            return;
        }
        if (i10 != 1 || wo0Var.P0) {
            return;
        }
        if (wo0Var.u0 != 3) {
            AndroidUtilities.hideKeyboard(wo0Var.getParentActivity().getCurrentFocus());
        }
        int i11 = wo0Var.u0;
        if (i11 == 0) {
            wo0Var.D0(true);
            wo0.m0(wo0Var);
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            while (true) {
                org.telegram.ui.Cells.l6[] l6VarArr = wo0Var.h;
                if (i12 >= l6VarArr.length) {
                    break;
                }
                if (l6VarArr[i12].b.f) {
                    wo0Var.G0 = wo0Var.E0.shipping_options.get(i12);
                    break;
                }
                i12++;
            }
            wo0Var.t0();
            return;
        }
        if (i11 == 2) {
            wo0.j0(wo0Var);
        } else if (i11 == 3) {
            wo0.k0(wo0Var);
        } else {
            if (i11 != 6) {
                return;
            }
            wo0Var.A0(false);
        }
    }
}
