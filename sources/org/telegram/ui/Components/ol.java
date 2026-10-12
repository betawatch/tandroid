package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ol extends hg.t0 {
    public final /* synthetic */ ul N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol(ul ulVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, z10, false);
        this.N = ulVar;
    }

    @Override // s4.g0
    public final void l() {
        ul ulVar = this.N;
        ol olVar = ulVar.R;
        org.telegram.ui.ActionBar.u0 u0Var = ulVar.E;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(olVar.J);
        }
        TextView textView = ulVar.y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, olVar.x)));
        }
        super.l();
    }
}
