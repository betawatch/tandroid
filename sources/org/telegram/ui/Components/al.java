package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class al extends gg.u0 {
    public final /* synthetic */ gl N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(gl glVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var, z10, false);
        this.N = glVar;
    }

    @Override // s4.h0
    public final void l() {
        gl glVar = this.N;
        al alVar = glVar.R;
        org.telegram.ui.ActionBar.w0 w0Var = glVar.E;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(alVar.J);
        }
        TextView textView = glVar.y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, alVar.x)));
        }
        super.l();
    }
}
