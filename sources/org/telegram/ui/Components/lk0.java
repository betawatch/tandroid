package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class lk0 extends f10 {
    public final /* synthetic */ qk0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk0(qk0 qk0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.U = qk0Var;
    }

    @Override // org.telegram.ui.Components.f10
    public final int getAdditionalHeight() {
        ub0 ub0Var;
        qk0 qk0Var = this.U;
        if (qk0Var.H.isEmpty() || (ub0Var = qk0Var.J) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + ub0Var.getMeasuredHeight();
    }
}
