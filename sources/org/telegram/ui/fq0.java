package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fq0 extends s4.u0 {
    public final /* synthetic */ rq0 a;

    public fq0(rq0 rq0Var) {
        this.a = rq0Var;
    }

    @Override // s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.getParentActivity().getCurrentFocus());
        }
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        rq0 rq0Var = this.a;
        if (rq0Var.J == null) {
            int L0 = rq0Var.M.L0();
            int abs = L0 == -1 ? 0 : Math.abs(rq0Var.M.N0() - L0) + 1;
            if (abs <= 0 || L0 + abs <= rq0Var.M.B() - 2 || rq0Var.r || rq0Var.s) {
                return;
            }
            rq0Var.e0(rq0Var.v, rq0Var.w, rq0Var.a == 1, true);
        }
    }
}
