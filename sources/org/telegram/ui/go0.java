package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class go0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ vo0 a;

    public go0(vo0 vo0Var) {
        this.a = vo0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        vo0 vo0Var = this.a;
        if (i10 == -1) {
            if (vo0Var.P0) {
                return;
            }
            vo0Var.finishFragment();
            return;
        }
        if (i10 != 1 || vo0Var.P0) {
            return;
        }
        if (vo0Var.u0 != 3) {
            AndroidUtilities.hideKeyboard(vo0Var.getParentActivity().getCurrentFocus());
        }
        int i11 = vo0Var.u0;
        if (i11 == 0) {
            vo0Var.D0(true);
            vo0.m0(vo0Var);
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            while (true) {
                org.telegram.ui.Cells.k6[] k6VarArr = vo0Var.h;
                if (i12 >= k6VarArr.length) {
                    break;
                }
                if (k6VarArr[i12].b.f) {
                    vo0Var.G0 = vo0Var.E0.shipping_options.get(i12);
                    break;
                }
                i12++;
            }
            vo0Var.t0();
            return;
        }
        if (i11 == 2) {
            vo0.j0(vo0Var);
        } else if (i11 == 3) {
            vo0.k0(vo0Var);
        } else {
            if (i11 != 6) {
                return;
            }
            vo0Var.A0(false);
        }
    }
}
