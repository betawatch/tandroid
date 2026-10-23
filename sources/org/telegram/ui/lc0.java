package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class lc0 extends hg.t0 {
    public final /* synthetic */ sc0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc0(sc0 sc0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context, g6Var, false, z10);
        this.N = sc0Var;
    }

    @Override // s4.g0
    public final void l() {
        sc0 sc0Var = this.N;
        org.telegram.ui.ActionBar.u0 u0Var = sc0Var.w;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(sc0Var.W.J);
        }
        TextView textView = sc0Var.r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, sc0Var.W.x)));
        }
        super.l();
    }
}
