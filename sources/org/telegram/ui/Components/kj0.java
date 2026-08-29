package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class kj0 extends p00 {
    public final /* synthetic */ pj0 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj0(pj0 pj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.Q = pj0Var;
    }

    @Override // org.telegram.ui.Components.p00
    public final int getAdditionalHeight() {
        qa0 qa0Var;
        pj0 pj0Var = this.Q;
        if (pj0Var.D.isEmpty() || (qa0Var = pj0Var.F) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + qa0Var.getMeasuredHeight();
    }
}
