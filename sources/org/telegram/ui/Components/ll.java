package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ll extends ig.t0 {
    public final /* synthetic */ sl N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll(sl slVar, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context, u6Var, z10, false);
        this.N = slVar;
    }

    @Override // s4.h0
    public final void l() {
        sl slVar = this.N;
        ll llVar = slVar.P;
        org.telegram.ui.ActionBar.w0 w0Var = slVar.x;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(llVar.J);
        }
        TextView textView = slVar.w;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, llVar.x)));
        }
        super.l();
    }
}
