package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class bd0 extends fg.u0 {
    public final /* synthetic */ id0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd0(id0 id0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var, false, z10);
        this.N = id0Var;
    }

    @Override // s4.h0
    public final void l() {
        id0 id0Var = this.N;
        org.telegram.ui.ActionBar.w0 w0Var = id0Var.w;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(id0Var.W.J);
        }
        TextView textView = id0Var.r;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, id0Var.W.x)));
        }
        super.l();
    }
}
