package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class lo0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ap0 a;

    public lo0(ap0 ap0Var) {
        this.a = ap0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        ap0 ap0Var = this.a;
        if (i10 == -1) {
            if (ap0Var.P0) {
                return;
            }
            ap0Var.finishFragment();
            return;
        }
        if (i10 != 1 || ap0Var.P0) {
            return;
        }
        if (ap0Var.u0 != 3) {
            AndroidUtilities.hideKeyboard(ap0Var.getParentActivity().getCurrentFocus());
        }
        int i11 = ap0Var.u0;
        if (i11 == 0) {
            ap0Var.D0(true);
            ap0.m0(ap0Var);
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            while (true) {
                org.telegram.ui.Cells.k6[] k6VarArr = ap0Var.h;
                if (i12 >= k6VarArr.length) {
                    break;
                }
                if (k6VarArr[i12].b.f) {
                    ap0Var.G0 = ap0Var.E0.shipping_options.get(i12);
                    break;
                }
                i12++;
            }
            ap0Var.t0();
            return;
        }
        if (i11 == 2) {
            ap0.j0(ap0Var);
        } else if (i11 == 3) {
            ap0.k0(ap0Var);
        } else {
            if (i11 != 6) {
                return;
            }
            ap0Var.A0(false);
        }
    }
}
