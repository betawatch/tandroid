package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class uj0 extends t00 {
    public final /* synthetic */ zj0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uj0(zj0 zj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.U = zj0Var;
    }

    @Override // org.telegram.ui.Components.t00
    public final int getAdditionalHeight() {
        bb0 bb0Var;
        zj0 zj0Var = this.U;
        if (zj0Var.H.isEmpty() || (bb0Var = zj0Var.J) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + bb0Var.getMeasuredHeight();
    }
}
