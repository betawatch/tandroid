package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ic0 extends ig.t0 {
    public final /* synthetic */ pc0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic0(pc0 pc0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context, u6Var, false, z10);
        this.N = pc0Var;
    }

    @Override // s4.h0
    public final void l() {
        pc0 pc0Var = this.N;
        org.telegram.ui.ActionBar.w0 w0Var = pc0Var.w;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(pc0Var.W.J);
        }
        TextView textView = pc0Var.r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, pc0Var.W.x)));
        }
        super.l();
    }
}
