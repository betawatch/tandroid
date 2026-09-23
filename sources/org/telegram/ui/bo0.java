package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class bo0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ qo0 a;

    public bo0(qo0 qo0Var) {
        this.a = qo0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        qo0 qo0Var = this.a;
        if (i10 == -1) {
            if (qo0Var.P0) {
                return;
            }
            qo0Var.finishFragment();
            return;
        }
        if (i10 != 1 || qo0Var.P0) {
            return;
        }
        if (qo0Var.u0 != 3) {
            AndroidUtilities.hideKeyboard(qo0Var.getParentActivity().getCurrentFocus());
        }
        int i11 = qo0Var.u0;
        if (i11 == 0) {
            qo0Var.D0(true);
            qo0.m0(qo0Var);
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            while (true) {
                org.telegram.ui.Cells.k6[] k6VarArr = qo0Var.h;
                if (i12 >= k6VarArr.length) {
                    break;
                }
                if (k6VarArr[i12].b.f) {
                    qo0Var.G0 = qo0Var.E0.shipping_options.get(i12);
                    break;
                }
                i12++;
            }
            qo0Var.t0();
            return;
        }
        if (i11 == 2) {
            qo0.j0(qo0Var);
        } else if (i11 == 3) {
            qo0.k0(qo0Var);
        } else {
            if (i11 != 6) {
                return;
            }
            qo0Var.A0(false);
        }
    }
}
