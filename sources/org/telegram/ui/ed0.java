package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ed0 extends hg.t0 {
    public final /* synthetic */ ld0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed0(ld0 ld0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, false, z10);
        this.N = ld0Var;
    }

    @Override // s4.g0
    public final void l() {
        ld0 ld0Var = this.N;
        org.telegram.ui.ActionBar.u0 u0Var = ld0Var.w;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(ld0Var.W.J);
        }
        TextView textView = ld0Var.r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, ld0Var.W.x)));
        }
        super.l();
    }
}
