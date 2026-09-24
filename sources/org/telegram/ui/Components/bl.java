package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
        org.telegram.ui.ActionBar.u0 u0Var = hlVar.E;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(blVar.J);
        }
        TextView textView = hlVar.y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, blVar.x)));
        }
        super.l();
    }
}
