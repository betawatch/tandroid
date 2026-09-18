package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class cd0 extends gg.u0 {
    public final /* synthetic */ jd0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cd0(jd0 jd0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, false, z10);
        this.N = jd0Var;
    }

    @Override // s4.h0
    public final void l() {
        jd0 jd0Var = this.N;
        org.telegram.ui.ActionBar.v0 v0Var = jd0Var.w;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(jd0Var.W.J);
        }
        TextView textView = jd0Var.r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, jd0Var.W.x)));
        }
        super.l();
    }
}
