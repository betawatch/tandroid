package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class io0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ xo0 a;

    public io0(xo0 xo0Var) {
        this.a = xo0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        xo0 xo0Var = this.a;
        if (i10 == -1) {
            if (xo0Var.P0) {
                return;
            }
            xo0Var.finishFragment();
            return;
        }
        if (i10 != 1 || xo0Var.P0) {
            return;
        }
        if (xo0Var.u0 != 3) {
            AndroidUtilities.hideKeyboard(xo0Var.getParentActivity().getCurrentFocus());
        }
        int i11 = xo0Var.u0;
        if (i11 == 0) {
            xo0Var.D0(true);
            xo0.m0(xo0Var);
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            while (true) {
                org.telegram.ui.Cells.k6[] k6VarArr = xo0Var.h;
                if (i12 >= k6VarArr.length) {
                    break;
                }
                if (k6VarArr[i12].b.f) {
                    xo0Var.G0 = xo0Var.E0.shipping_options.get(i12);
                    break;
                }
                i12++;
            }
            xo0Var.t0();
            return;
        }
        if (i11 == 2) {
            xo0.j0(xo0Var);
        } else if (i11 == 3) {
            xo0.k0(xo0Var);
        } else {
            if (i11 != 6) {
                return;
            }
            xo0Var.A0(false);
        }
    }
}
