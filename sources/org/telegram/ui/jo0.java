package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class jo0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ yo0 a;

    public jo0(yo0 yo0Var) {
        this.a = yo0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        yo0 yo0Var = this.a;
        if (i10 == -1) {
            if (yo0Var.P0) {
                return;
            }
            yo0Var.finishFragment();
            return;
        }
        if (i10 != 1 || yo0Var.P0) {
            return;
        }
        if (yo0Var.u0 != 3) {
            AndroidUtilities.hideKeyboard(yo0Var.getParentActivity().getCurrentFocus());
        }
        int i11 = yo0Var.u0;
        if (i11 == 0) {
            yo0Var.D0(true);
            yo0.m0(yo0Var);
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            while (true) {
                org.telegram.ui.Cells.j6[] j6VarArr = yo0Var.h;
                if (i12 >= j6VarArr.length) {
                    break;
                }
                if (j6VarArr[i12].b.f) {
                    yo0Var.G0 = yo0Var.E0.shipping_options.get(i12);
                    break;
                }
                i12++;
            }
            yo0Var.t0();
            return;
        }
        if (i11 == 2) {
            yo0.j0(yo0Var);
        } else if (i11 == 3) {
            yo0.k0(yo0Var);
        } else {
            if (i11 != 6) {
                return;
            }
            yo0Var.A0(false);
        }
    }
}
