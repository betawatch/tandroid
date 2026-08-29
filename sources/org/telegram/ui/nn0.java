package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class nn0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ bo0 a;

    public nn0(bo0 bo0Var) {
        this.a = bo0Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        bo0 bo0Var = this.a;
        if (i10 == -1) {
            if (bo0Var.L0) {
                return;
            }
            bo0Var.finishFragment();
            return;
        }
        if (i10 != 1 || bo0Var.L0) {
            return;
        }
        if (bo0Var.q0 != 3) {
            AndroidUtilities.hideKeyboard(bo0Var.getParentActivity().getCurrentFocus());
        }
        int i11 = bo0Var.q0;
        if (i11 == 0) {
            bo0Var.D0(true);
            bo0.m0(bo0Var);
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            while (true) {
                org.telegram.ui.Cells.h6[] h6VarArr = bo0Var.h;
                if (i12 >= h6VarArr.length) {
                    break;
                }
                if (h6VarArr[i12].b.f) {
                    bo0Var.C0 = bo0Var.A0.shipping_options.get(i12);
                    break;
                }
                i12++;
            }
            bo0Var.t0();
            return;
        }
        if (i11 == 2) {
            bo0.j0(bo0Var);
        } else if (i11 == 3) {
            bo0.k0(bo0Var);
        } else {
            if (i11 != 6) {
                return;
            }
            bo0Var.A0(false);
        }
    }
}
