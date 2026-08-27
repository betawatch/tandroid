package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class mc0 extends pf.i0 {
    public final /* synthetic */ tc0 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc0(tc0 tc0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, false, z10);
        this.J = tc0Var;
    }

    @Override // f2.q0
    public final void l() {
        tc0 tc0Var = this.J;
        org.telegram.ui.ActionBar.v0 v0Var = tc0Var.w;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(tc0Var.S.F);
        }
        TextView textView = tc0Var.r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, tc0Var.S.x)));
        }
        super.l();
    }
}
