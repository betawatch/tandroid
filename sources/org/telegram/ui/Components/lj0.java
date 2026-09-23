package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class lj0 extends u00 {
    public final /* synthetic */ qj0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj0(qj0 qj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.U = qj0Var;
    }

    @Override // org.telegram.ui.Components.u00
    public final int getAdditionalHeight() {
        ua0 ua0Var;
        qj0 qj0Var = this.U;
        if (qj0Var.H.isEmpty() || (ua0Var = qj0Var.J) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + ua0Var.getMeasuredHeight();
    }
}
