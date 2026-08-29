package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class kc0 extends rf.j0 {
    public final /* synthetic */ rc0 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc0(rc0 rc0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, false, z10);
        this.J = rc0Var;
    }

    @Override // f2.p0
    public final void l() {
        rc0 rc0Var = this.J;
        org.telegram.ui.ActionBar.w0 w0Var = rc0Var.w;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(rc0Var.S.F);
        }
        TextView textView = rc0Var.r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, rc0Var.S.x)));
        }
        super.l();
    }
}
