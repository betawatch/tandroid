package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class do0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ so0 a;

    public do0(so0 so0Var) {
        this.a = so0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        so0 so0Var = this.a;
        if (i10 == -1) {
            if (so0Var.P0) {
                return;
            }
            so0Var.finishFragment();
            return;
        }
        if (i10 != 1 || so0Var.P0) {
            return;
        }
        if (so0Var.u0 != 3) {
            AndroidUtilities.hideKeyboard(so0Var.getParentActivity().getCurrentFocus());
        }
        int i11 = so0Var.u0;
        if (i11 == 0) {
            so0Var.D0(true);
            so0.m0(so0Var);
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            while (true) {
                org.telegram.ui.Cells.k6[] k6VarArr = so0Var.h;
                if (i12 >= k6VarArr.length) {
                    break;
                }
                if (k6VarArr[i12].b.f) {
                    so0Var.G0 = so0Var.E0.shipping_options.get(i12);
                    break;
                }
                i12++;
            }
            so0Var.t0();
            return;
        }
        if (i11 == 2) {
            so0.j0(so0Var);
        } else if (i11 == 3) {
            so0.k0(so0Var);
        } else {
            if (i11 != 6) {
                return;
            }
            so0Var.A0(false);
        }
    }
}
