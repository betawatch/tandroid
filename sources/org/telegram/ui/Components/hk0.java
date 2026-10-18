package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class hk0 extends b10 {
    public final /* synthetic */ mk0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk0(mk0 mk0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.U = mk0Var;
    }

    @Override // org.telegram.ui.Components.b10
    public final int getAdditionalHeight() {
        ob0 ob0Var;
        mk0 mk0Var = this.U;
        if (mk0Var.H.isEmpty() || (ob0Var = mk0Var.J) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + ob0Var.getMeasuredHeight();
    }
}
