package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class tj0 extends u00 {
    public final /* synthetic */ yj0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj0(yj0 yj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.R = yj0Var;
    }

    @Override // org.telegram.ui.Components.u00
    public final int getAdditionalHeight() {
        wa0 wa0Var;
        yj0 yj0Var = this.R;
        if (yj0Var.E.isEmpty() || (wa0Var = yj0Var.G) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + wa0Var.getMeasuredHeight();
    }
}
