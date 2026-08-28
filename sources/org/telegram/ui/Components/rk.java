package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class rk extends of.q0 {
    public final /* synthetic */ xk J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk(xk xkVar, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context, b6Var, z10, false);
        this.J = xkVar;
    }

    @Override // f2.r0
    public final void l() {
        xk xkVar = this.J;
        rk rkVar = xkVar.N;
        org.telegram.ui.ActionBar.w0 w0Var = xkVar.A;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(rkVar.F);
        }
        TextView textView = xkVar.y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, rkVar.x)));
        }
        super.l();
    }
}
