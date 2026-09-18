package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class lj0 extends t00 {
    public final /* synthetic */ qj0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj0(qj0 qj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.U = qj0Var;
    }

    @Override // org.telegram.ui.Components.t00
    public final int getAdditionalHeight() {
        ta0 ta0Var;
        qj0 qj0Var = this.U;
        if (qj0Var.H.isEmpty() || (ta0Var = qj0Var.J) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + ta0Var.getMeasuredHeight();
    }
}
