package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class kj0 extends t00 {
    public final /* synthetic */ pj0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj0(pj0 pj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.U = pj0Var;
    }

    @Override // org.telegram.ui.Components.t00
    public final int getAdditionalHeight() {
        ta0 ta0Var;
        pj0 pj0Var = this.U;
        if (pj0Var.H.isEmpty() || (ta0Var = pj0Var.J) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + ta0Var.getMeasuredHeight();
    }
}
