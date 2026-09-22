package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class dd0 extends gg.u0 {
    public final /* synthetic */ kd0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd0(kd0 kd0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var, false, z10);
        this.N = kd0Var;
    }

    @Override // s4.h0
    public final void l() {
        kd0 kd0Var = this.N;
        org.telegram.ui.ActionBar.v0 v0Var = kd0Var.w;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(kd0Var.W.J);
        }
        TextView textView = kd0Var.r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, kd0Var.W.x)));
        }
        super.l();
    }
}
