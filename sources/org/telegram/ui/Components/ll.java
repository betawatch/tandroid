package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ll extends hg.t0 {
    public final /* synthetic */ rl N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll(rl rlVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, z10, false);
        this.N = rlVar;
    }

    @Override // s4.g0
    public final void l() {
        rl rlVar = this.N;
        ll llVar = rlVar.R;
        org.telegram.ui.ActionBar.u0 u0Var = rlVar.E;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(llVar.J);
        }
        TextView textView = rlVar.y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, llVar.x)));
        }
        super.l();
    }
}
