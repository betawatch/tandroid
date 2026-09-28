package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class cl extends gg.u0 {
    public final /* synthetic */ il N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(il ilVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, z10, false);
        this.N = ilVar;
    }

    @Override // s4.h0
    public final void l() {
        il ilVar = this.N;
        cl clVar = ilVar.R;
        org.telegram.ui.ActionBar.u0 u0Var = ilVar.E;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(clVar.J);
        }
        TextView textView = ilVar.y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, clVar.x)));
        }
        super.l();
    }
}
