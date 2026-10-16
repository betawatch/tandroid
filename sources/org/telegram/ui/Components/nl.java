package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class nl extends hg.t0 {
    public final /* synthetic */ tl N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nl(tl tlVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, z10, false);
        this.N = tlVar;
    }

    @Override // s4.g0
    public final void l() {
        tl tlVar = this.N;
        nl nlVar = tlVar.R;
        org.telegram.ui.ActionBar.u0 u0Var = tlVar.E;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(nlVar.J);
        }
        TextView textView = tlVar.y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, nlVar.x)));
        }
        super.l();
    }
}
