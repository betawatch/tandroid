package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ic0 extends of.q0 {
    public final /* synthetic */ pc0 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic0(pc0 pc0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context, b6Var, false, z10);
        this.J = pc0Var;
    }

    @Override // f2.r0
    public final void l() {
        pc0 pc0Var = this.J;
        org.telegram.ui.ActionBar.w0 w0Var = pc0Var.w;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(pc0Var.S.F);
        }
        TextView textView = pc0Var.r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, pc0Var.S.x)));
        }
        super.l();
    }
}
