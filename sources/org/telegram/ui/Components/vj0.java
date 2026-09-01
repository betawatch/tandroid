package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class vj0 extends u00 {
    public final /* synthetic */ ak0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj0(ak0 ak0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.R = ak0Var;
    }

    @Override // org.telegram.ui.Components.u00
    public final int getAdditionalHeight() {
        xa0 xa0Var;
        ak0 ak0Var = this.R;
        if (ak0Var.E.isEmpty() || (xa0Var = ak0Var.G) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + xa0Var.getMeasuredHeight();
    }
}
