package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class bq0 extends f2.z0 {
    public final /* synthetic */ mq0 a;

    public bq0(mq0 mq0Var) {
        this.a = mq0Var;
    }

    @Override // f2.z0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.getParentActivity().getCurrentFocus());
        }
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        mq0 mq0Var = this.a;
        if (mq0Var.G == null) {
            int L0 = mq0Var.J.L0();
            int abs = L0 == -1 ? 0 : Math.abs(mq0Var.J.N0() - L0) + 1;
            if (abs <= 0 || L0 + abs <= mq0Var.J.B() - 2 || mq0Var.r || mq0Var.s) {
                return;
            }
            mq0Var.d0(mq0Var.v, mq0Var.w, mq0Var.a == 1, true);
        }
    }
}
