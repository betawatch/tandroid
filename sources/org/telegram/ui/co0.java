package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class co0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ro0 a;

    public co0(ro0 ro0Var) {
        this.a = ro0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        ro0 ro0Var = this.a;
        if (i10 == -1) {
            if (ro0Var.P0) {
                return;
            }
            ro0Var.finishFragment();
            return;
        }
        if (i10 != 1 || ro0Var.P0) {
            return;
        }
        if (ro0Var.u0 != 3) {
            AndroidUtilities.hideKeyboard(ro0Var.getParentActivity().getCurrentFocus());
        }
        int i11 = ro0Var.u0;
        if (i11 == 0) {
            ro0Var.E0(true);
            ro0.n0(ro0Var);
            return;
        }
        int i12 = 0;
        if (i11 == 1) {
            while (true) {
                org.telegram.ui.Cells.o6[] o6VarArr = ro0Var.h;
                if (i12 >= o6VarArr.length) {
                    break;
                }
                if (o6VarArr[i12].b.f) {
                    ro0Var.G0 = ro0Var.E0.shipping_options.get(i12);
                    break;
                }
                i12++;
            }
            ro0Var.u0();
            return;
        }
        if (i11 == 2) {
            ro0.k0(ro0Var);
        } else if (i11 == 3) {
            ro0.l0(ro0Var);
        } else {
            if (i11 != 6) {
                return;
            }
            ro0Var.B0(false);
        }
    }
}
