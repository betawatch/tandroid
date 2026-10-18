package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class et0 extends FragmentContextView {
    public final /* synthetic */ sv0 R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et0(sv0 sv0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, sv0 sv0Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, n2Var, sv0Var2, false, d6Var);
        this.R0 = sv0Var;
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        sv0 sv0Var = this.R0;
        sv0Var.P0.i(sv0Var.Q0, i10 == 0, true);
    }
}
