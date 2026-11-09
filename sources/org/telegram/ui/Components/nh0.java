package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class nh0 extends mz {
    public final /* synthetic */ sh0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh0(sh0 sh0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.U = sh0Var;
    }

    @Override // org.telegram.ui.Components.mz
    public final int getAdditionalHeight() {
        m90 m90Var;
        sh0 sh0Var = this.U;
        if (sh0Var.H.isEmpty() || (m90Var = sh0Var.J) == null) {
            return 0;
        }
        return org.telegram.messenger.g0.L(8.0f) + m90Var.getMeasuredHeight();
    }
}
