package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ao0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ po0 a;

    public ao0(po0 po0Var) {
        this.a = po0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        po0 po0Var = this.a;
        if (i10 == -1) {
            if (po0Var.P0) {
                return;
            }
            po0Var.finishFragment();
            return;
        }
        if (i10 != 1 || po0Var.P0) {
            return;
        }
        if (po0Var.u0 != 3) {
            AndroidUtilities.hideKeyboard(po0Var.getParentActivity().getCurrentFocus());
        }
        int i11 = po0Var.u0;
        if (i11 == 0) {
            po0Var.E0(true);
            po0.n0(po0Var);
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            while (true) {
                org.telegram.ui.Cells.o6[] o6VarArr = po0Var.h;
                if (i12 >= o6VarArr.length) {
                    break;
                }
                if (o6VarArr[i12].b.f) {
                    po0Var.G0 = po0Var.E0.shipping_options.get(i12);
                    break;
                }
                i12++;
            }
            po0Var.u0();
            return;
        }
        if (i11 == 2) {
            po0.k0(po0Var);
        } else if (i11 == 3) {
            po0.l0(po0Var);
        } else {
            if (i11 != 6) {
                return;
            }
            po0Var.B0(false);
        }
    }
}
