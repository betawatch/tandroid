package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pn0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ do0 a;

    public pn0(do0 do0Var) {
        this.a = do0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        do0 do0Var = this.a;
        if (i10 == -1) {
            if (do0Var.L0) {
                return;
            }
            do0Var.finishFragment();
            return;
        }
        if (i10 != 1 || do0Var.L0) {
            return;
        }
        if (do0Var.q0 != 3) {
            AndroidUtilities.hideKeyboard(do0Var.getParentActivity().getCurrentFocus());
        }
        int i11 = do0Var.q0;
        if (i11 == 0) {
            do0Var.D0(true);
            do0.m0(do0Var);
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            while (true) {
                org.telegram.ui.Cells.g6[] g6VarArr = do0Var.h;
                if (i12 >= g6VarArr.length) {
                    break;
                }
                if (g6VarArr[i12].b.f) {
                    do0Var.C0 = do0Var.A0.shipping_options.get(i12);
                    break;
                }
                i12++;
            }
            do0Var.t0();
            return;
        }
        if (i11 == 2) {
            do0.j0(do0Var);
        } else if (i11 == 3) {
            do0.k0(do0Var);
        } else {
            if (i11 != 6) {
                return;
            }
            do0Var.A0(false);
        }
    }
}
