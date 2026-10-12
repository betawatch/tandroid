package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class no0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ cp0 a;

    public no0(cp0 cp0Var) {
        this.a = cp0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        cp0 cp0Var = this.a;
        if (i10 == -1) {
            if (cp0Var.P0) {
                return;
            }
            cp0Var.finishFragment();
            return;
        }
        if (i10 != 1 || cp0Var.P0) {
            return;
        }
        if (cp0Var.u0 != 3) {
            AndroidUtilities.hideKeyboard(cp0Var.getParentActivity().getCurrentFocus());
        }
        int i11 = cp0Var.u0;
        if (i11 == 0) {
            cp0Var.D0(true);
            cp0.m0(cp0Var);
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            while (true) {
                org.telegram.ui.Cells.k6[] k6VarArr = cp0Var.h;
                if (i12 >= k6VarArr.length) {
                    break;
                }
                if (k6VarArr[i12].b.f) {
                    cp0Var.G0 = cp0Var.E0.shipping_options.get(i12);
                    break;
                }
                i12++;
            }
            cp0Var.t0();
            return;
        }
        if (i11 == 2) {
            cp0.j0(cp0Var);
        } else if (i11 == 3) {
            cp0.k0(cp0Var);
        } else {
            if (i11 != 6) {
                return;
            }
            cp0Var.A0(false);
        }
    }
}
