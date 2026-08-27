package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pp0 extends f2.b1 {
    public final /* synthetic */ aq0 a;

    public pp0(aq0 aq0Var) {
        this.a = aq0Var;
    }

    @Override // f2.b1
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            AndroidUtilities.hideKeyboard(this.a.getParentActivity().getCurrentFocus());
        }
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        aq0 aq0Var = this.a;
        if (aq0Var.F == null) {
            int L0 = aq0Var.I.L0();
            int abs = L0 == -1 ? 0 : Math.abs(aq0Var.I.N0() - L0) + 1;
            if (abs <= 0 || L0 + abs <= aq0Var.I.B() - 2 || aq0Var.r || aq0Var.s) {
                return;
            }
            aq0Var.d0(aq0Var.v, aq0Var.w, aq0Var.a == 1, true);
        }
    }
}
