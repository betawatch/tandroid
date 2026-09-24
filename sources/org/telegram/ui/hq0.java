package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class hq0 extends s4.s0 {
    public final /* synthetic */ tq0 a;

    public hq0(tq0 tq0Var) {
        this.a = tq0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.getParentActivity().getCurrentFocus());
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        tq0 tq0Var = this.a;
        if (tq0Var.J == null) {
            int L0 = tq0Var.M.L0();
            int abs = L0 == -1 ? 0 : Math.abs(tq0Var.M.N0() - L0) + 1;
            if (abs <= 0 || L0 + abs <= tq0Var.M.B() - 2 || tq0Var.r || tq0Var.s) {
                return;
            }
            tq0Var.d0(tq0Var.v, tq0Var.w, tq0Var.a == 1, true);
        }
    }
}
