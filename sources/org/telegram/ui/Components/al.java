package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class al extends gg.u0 {
    public final /* synthetic */ gl N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(gl glVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, z10, false);
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
