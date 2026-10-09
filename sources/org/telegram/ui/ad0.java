package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ad0 extends gg.t0 {
    public final /* synthetic */ hd0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad0(hd0 hd0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, false, z10);
        this.N = hd0Var;
    }

    @Override // s4.i0
    public final void l() {
        hd0 hd0Var = this.N;
        org.telegram.ui.ActionBar.v0 v0Var = hd0Var.w;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(hd0Var.W.J);
        }
        TextView textView = hd0Var.r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, hd0Var.W.x)));
        }
        super.l();
    }
}
