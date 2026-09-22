package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class oq0 extends s4.s0 {
    public final /* synthetic */ ar0 a;

    public oq0(ar0 ar0Var) {
        this.a = ar0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.getParentActivity().getCurrentFocus());
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        ar0 ar0Var = this.a;
        if (ar0Var.J == null) {
            int L0 = ar0Var.M.L0();
            int abs = L0 == -1 ? 0 : Math.abs(ar0Var.M.N0() - L0) + 1;
            if (abs <= 0 || L0 + abs <= ar0Var.M.B() - 2 || ar0Var.r || ar0Var.s) {
                return;
            }
            ar0Var.d0(ar0Var.v, ar0Var.w, ar0Var.a == 1, true);
        }
    }
}
