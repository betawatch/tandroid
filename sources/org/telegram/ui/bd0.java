package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class bd0 extends hg.u0 {
    public final /* synthetic */ id0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd0(id0 id0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var, false, z10);
        this.N = id0Var;
    }

    @Override // s4.h0
    public final void l() {
        id0 id0Var = this.N;
        org.telegram.ui.ActionBar.v0 v0Var = id0Var.w;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(id0Var.W.J);
        }
        TextView textView = id0Var.r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, id0Var.W.x)));
        }
        super.l();
    }
}
