package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class pq0 extends s4.s0 {
    public final /* synthetic */ br0 a;

    public pq0(br0 br0Var) {
        this.a = br0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.getParentActivity().getCurrentFocus());
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        br0 br0Var = this.a;
        if (br0Var.J == null) {
            int L0 = br0Var.M.L0();
            int abs = L0 == -1 ? 0 : Math.abs(br0Var.M.N0() - L0) + 1;
            if (abs <= 0 || L0 + abs <= br0Var.M.B() - 2 || br0Var.r || br0Var.s) {
                return;
            }
            br0Var.d0(br0Var.v, br0Var.w, br0Var.a == 1, true);
        }
    }
}
