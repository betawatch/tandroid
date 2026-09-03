package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class uj0 extends u00 {
    public final /* synthetic */ zj0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj0(zj0 zj0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.R = zj0Var;
    }

    @Override // org.telegram.ui.Components.u00
    public final int getAdditionalHeight() {
        xa0 xa0Var;
        zj0 zj0Var = this.R;
        if (zj0Var.E.isEmpty() || (xa0Var = zj0Var.G) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + xa0Var.getMeasuredHeight();
    }
}
