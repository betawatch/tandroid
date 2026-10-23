package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class aq0 extends s4.r0 {
    public final /* synthetic */ mq0 a;

    public aq0(mq0 mq0Var) {
        this.a = mq0Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.getParentActivity().getCurrentFocus());
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        mq0 mq0Var = this.a;
        if (mq0Var.J == null) {
            int L0 = mq0Var.M.L0();
            int abs = L0 == -1 ? 0 : Math.abs(mq0Var.M.N0() - L0) + 1;
            if (abs <= 0 || L0 + abs <= mq0Var.M.B() - 2 || mq0Var.r || mq0Var.s) {
                return;
            }
            mq0Var.d0(mq0Var.v, mq0Var.w, mq0Var.a == 1, true);
        }
    }
}
