package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class lk0 extends c10 {
    public final /* synthetic */ qk0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk0(qk0 qk0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.U = qk0Var;
    }

    @Override // org.telegram.ui.Components.c10
    public final int getAdditionalHeight() {
        nb0 nb0Var;
        qk0 qk0Var = this.U;
        if (qk0Var.H.isEmpty() || (nb0Var = qk0Var.J) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + nb0Var.getMeasuredHeight();
    }
}
