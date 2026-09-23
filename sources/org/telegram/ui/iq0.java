package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class iq0 extends s4.s0 {
    public final /* synthetic */ uq0 a;

    public iq0(uq0 uq0Var) {
        this.a = uq0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.getParentActivity().getCurrentFocus());
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        uq0 uq0Var = this.a;
        if (uq0Var.J == null) {
            int L0 = uq0Var.M.L0();
            int abs = L0 == -1 ? 0 : Math.abs(uq0Var.M.N0() - L0) + 1;
            if (abs <= 0 || L0 + abs <= uq0Var.M.B() - 2 || uq0Var.r || uq0Var.s) {
                return;
            }
            uq0Var.d0(uq0Var.v, uq0Var.w, uq0Var.a == 1, true);
        }
    }
}
