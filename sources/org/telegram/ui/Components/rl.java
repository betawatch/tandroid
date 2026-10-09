package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class rl extends gg.t0 {
    public final /* synthetic */ xl N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(xl xlVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, z10, false);
        this.N = xlVar;
    }

    @Override // s4.i0
    public final void l() {
        xl xlVar = this.N;
        rl rlVar = xlVar.R;
        org.telegram.ui.ActionBar.v0 v0Var = xlVar.E;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(rlVar.J);
        }
        TextView textView = xlVar.y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, rlVar.x)));
        }
        super.l();
    }
}
