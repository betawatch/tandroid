package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class al extends hg.u0 {
    public final /* synthetic */ gl N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(gl glVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var, z10, false);
        this.N = glVar;
    }

    @Override // s4.h0
    public final void l() {
        gl glVar = this.N;
        al alVar = glVar.R;
        org.telegram.ui.ActionBar.v0 v0Var = glVar.E;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(alVar.J);
        }
        TextView textView = glVar.y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, alVar.x)));
        }
        super.l();
    }
}
