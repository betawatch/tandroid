package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class kq0 extends s4.s0 {
    public final /* synthetic */ wq0 a;

    public kq0(wq0 wq0Var) {
        this.a = wq0Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.getParentActivity().getCurrentFocus());
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        wq0 wq0Var = this.a;
        if (wq0Var.J == null) {
            int L0 = wq0Var.M.L0();
            int abs = L0 == -1 ? 0 : Math.abs(wq0Var.M.N0() - L0) + 1;
            if (abs <= 0 || L0 + abs <= wq0Var.M.B() - 2 || wq0Var.r || wq0Var.s) {
                return;
            }
            wq0Var.d0(wq0Var.v, wq0Var.w, wq0Var.a == 1, true);
        }
    }
}
