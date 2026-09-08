package org.telegram.ui;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class bd0 extends hg.u0 {
    public final /* synthetic */ id0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd0(id0 id0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var, false, z10);
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
