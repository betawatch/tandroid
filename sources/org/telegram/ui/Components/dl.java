package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class dl extends gg.u0 {
    public final /* synthetic */ jl N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl(jl jlVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, z10, false);
        this.N = jlVar;
    }

    @Override // s4.h0
    public final void l() {
        jl jlVar = this.N;
        dl dlVar = jlVar.R;
        org.telegram.ui.ActionBar.v0 v0Var = jlVar.E;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(dlVar.J);
        }
        TextView textView = jlVar.y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, dlVar.x)));
        }
        super.l();
    }
}
