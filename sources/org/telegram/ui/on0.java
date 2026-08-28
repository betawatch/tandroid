package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class on0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ co0 a;

    public on0(co0 co0Var) {
        this.a = co0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        co0 co0Var = this.a;
        if (i9 == -1) {
            if (co0Var.L0) {
                return;
            }
            co0Var.finishFragment();
            return;
        }
        if (i9 != 1 || co0Var.L0) {
            return;
        }
        if (co0Var.q0 != 3) {
            AndroidUtilities.hideKeyboard(co0Var.getParentActivity().getCurrentFocus());
        }
        int i10 = co0Var.q0;
        if (i10 == 0) {
            co0Var.C0(true);
            co0.l0(co0Var);
            return;
        }
        int i11 = 0;
        if (i10 == 1) {
            while (true) {
                org.telegram.ui.Cells.j6[] j6VarArr = co0Var.h;
                if (i11 >= j6VarArr.length) {
                    break;
                }
                if (j6VarArr[i11].b.f) {
                    co0Var.C0 = co0Var.A0.shipping_options.get(i11);
                    break;
                }
                i11++;
            }
            co0Var.s0();
            return;
        }
        if (i10 == 2) {
            co0.i0(co0Var);
        } else if (i10 == 3) {
            co0.j0(co0Var);
        } else {
            if (i10 != 6) {
                return;
            }
            co0Var.z0(false);
        }
    }
}
