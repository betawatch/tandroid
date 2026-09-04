package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class kj0 extends t00 {
    public final /* synthetic */ pj0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj0(pj0 pj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.U = pj0Var;
    }

    @Override // org.telegram.ui.Components.t00
    public final int getAdditionalHeight() {
        ua0 ua0Var;
        pj0 pj0Var = this.U;
        if (pj0Var.H.isEmpty() || (ua0Var = pj0Var.J) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + ua0Var.getMeasuredHeight();
    }
}
