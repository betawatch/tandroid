package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class vj0 extends u00 {
    public final /* synthetic */ ak0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj0(ak0 ak0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.U = ak0Var;
    }

    @Override // org.telegram.ui.Components.u00
    public final int getAdditionalHeight() {
        fb0 fb0Var;
        ak0 ak0Var = this.U;
        if (ak0Var.H.isEmpty() || (fb0Var = ak0Var.J) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + fb0Var.getMeasuredHeight();
    }
}
