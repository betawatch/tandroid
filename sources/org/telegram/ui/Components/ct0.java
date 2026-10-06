package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class ct0 extends FragmentContextView {
    public final /* synthetic */ qv0 Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct0(qv0 qv0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, qv0 qv0Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, n2Var, qv0Var2, false, d6Var);
        this.Q0 = qv0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        qv0 qv0Var = this.Q0;
        qv0Var.P0.i(qv0Var.Q0, i10 == 0, true);
    }
}
