package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
