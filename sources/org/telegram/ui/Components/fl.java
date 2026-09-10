package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class fl extends fg.u0 {
    public final /* synthetic */ ll N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl(ll llVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var, z10, false);
        this.N = llVar;
    }

    @Override // s4.h0
    public final void l() {
        ll llVar = this.N;
        fl flVar = llVar.R;
        org.telegram.ui.ActionBar.w0 w0Var = llVar.E;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(flVar.J);
        }
        TextView textView = llVar.y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, flVar.x)));
        }
        super.l();
    }
}
