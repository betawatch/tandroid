package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class xj0 extends t00 {
    public final /* synthetic */ ck0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj0(ck0 ck0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.U = ck0Var;
    }

    @Override // org.telegram.ui.Components.t00
    public final int getAdditionalHeight() {
        eb0 eb0Var;
        ck0 ck0Var = this.U;
        if (ck0Var.H.isEmpty() || (eb0Var = ck0Var.J) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + eb0Var.getMeasuredHeight();
    }
}
