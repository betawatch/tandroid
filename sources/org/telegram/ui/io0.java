package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                org.telegram.ui.Cells.j6[] j6VarArr = xo0Var.h;
                if (i12 >= j6VarArr.length) {
                    break;
                }
                if (j6VarArr[i12].b.f) {
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
