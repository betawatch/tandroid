package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class pk0 extends j10 {
    public final /* synthetic */ uk0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk0(uk0 uk0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.U = uk0Var;
    }

    @Override // org.telegram.ui.Components.j10
    public final int getAdditionalHeight() {
        vb0 vb0Var;
        uk0 uk0Var = this.U;
        if (uk0Var.H.isEmpty() || (vb0Var = uk0Var.J) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + vb0Var.getMeasuredHeight();
    }
}
