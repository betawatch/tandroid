package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class bj0 extends h00 {
    public final /* synthetic */ gj0 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj0(gj0 gj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.Q = gj0Var;
    }

    @Override // org.telegram.ui.Components.h00
    public final int getAdditionalHeight() {
        ga0 ga0Var;
        gj0 gj0Var = this.Q;
        if (gj0Var.D.isEmpty() || (ga0Var = gj0Var.F) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + ga0Var.getMeasuredHeight();
    }
}
