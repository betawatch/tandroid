package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class gd0 extends hg.t0 {
    public final /* synthetic */ nd0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd0(nd0 nd0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, false, z10);
        this.N = nd0Var;
    }

    @Override // s4.g0
    public final void l() {
        nd0 nd0Var = this.N;
        org.telegram.ui.ActionBar.u0 u0Var = nd0Var.w;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(nd0Var.W.J);
        }
        TextView textView = nd0Var.r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, nd0Var.W.x)));
        }
        super.l();
    }
}
