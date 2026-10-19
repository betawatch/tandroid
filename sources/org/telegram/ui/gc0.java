package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class gc0 extends hg.t0 {
    public final /* synthetic */ nc0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc0(nc0 nc0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, false, z10);
        this.N = nc0Var;
    }

    @Override // s4.g0
    public final void l() {
        nc0 nc0Var = this.N;
        org.telegram.ui.ActionBar.u0 u0Var = nc0Var.w;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(nc0Var.W.J);
        }
        TextView textView = nc0Var.r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, nc0Var.W.x)));
        }
        super.l();
    }
}
