package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class bl extends gg.u0 {
    public final /* synthetic */ hl N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(hl hlVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, z10, false);
        this.N = hlVar;
    }

    @Override // s4.h0
    public final void l() {
        hl hlVar = this.N;
        bl blVar = hlVar.R;
        org.telegram.ui.ActionBar.v0 v0Var = hlVar.E;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(blVar.J);
        }
        TextView textView = hlVar.y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, blVar.x)));
        }
        super.l();
    }
}
