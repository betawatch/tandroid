package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class vj0 extends t00 {
    public final /* synthetic */ ak0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj0(ak0 ak0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.U = ak0Var;
    }

    @Override // org.telegram.ui.Components.t00
    public final int getAdditionalHeight() {
        cb0 cb0Var;
        ak0 ak0Var = this.U;
        if (ak0Var.H.isEmpty() || (cb0Var = ak0Var.J) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + cb0Var.getMeasuredHeight();
    }
}
