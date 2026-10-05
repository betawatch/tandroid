package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class xj0 extends w00 {
    public final /* synthetic */ ck0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj0(ck0 ck0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.U = ck0Var;
    }

    @Override // org.telegram.ui.Components.w00
    public final int getAdditionalHeight() {
        hb0 hb0Var;
        ck0 ck0Var = this.U;
        if (ck0Var.H.isEmpty() || (hb0Var = ck0Var.J) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + hb0Var.getMeasuredHeight();
    }
}
