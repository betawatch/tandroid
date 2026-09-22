package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class bd0 extends gg.u0 {
    public final /* synthetic */ id0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd0(id0 id0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, false, z10);
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
