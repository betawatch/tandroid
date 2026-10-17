package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class ic0 extends hg.t0 {
    public final /* synthetic */ pc0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic0(pc0 pc0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, false, z10);
        this.N = pc0Var;
    }

    @Override // s4.g0
    public final void l() {
        pc0 pc0Var = this.N;
        org.telegram.ui.ActionBar.u0 u0Var = pc0Var.w;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(pc0Var.W.J);
        }
        TextView textView = pc0Var.r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, pc0Var.W.x)));
        }
        super.l();
    }
}
