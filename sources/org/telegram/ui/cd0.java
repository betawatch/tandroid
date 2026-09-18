package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
