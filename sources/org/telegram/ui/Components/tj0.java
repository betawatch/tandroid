package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class tj0 extends t00 {
    public final /* synthetic */ yj0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj0(yj0 yj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.R = yj0Var;
    }

    @Override // org.telegram.ui.Components.t00
    public final int getAdditionalHeight() {
        va0 va0Var;
        yj0 yj0Var = this.R;
        if (yj0Var.E.isEmpty() || (va0Var = yj0Var.G) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + va0Var.getMeasuredHeight();
    }
}
