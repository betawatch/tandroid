package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ll extends hg.t0 {
    public final /* synthetic */ rl N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll(rl rlVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context, g6Var, z10, false);
        this.N = rlVar;
    }

    @Override // s4.g0
    public final void l() {
        rl rlVar = this.N;
        ll llVar = rlVar.P;
        org.telegram.ui.ActionBar.u0 u0Var = rlVar.x;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(llVar.J);
        }
        TextView textView = rlVar.w;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, llVar.x)));
        }
        super.l();
    }
}
