package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class tk extends tf.i0 {
    public final /* synthetic */ al K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(al alVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context, f6Var, z4, false);
        this.K = alVar;
    }

    @Override // f2.o0
    public final void l() {
        al alVar = this.K;
        tk tkVar = alVar.O;
        org.telegram.ui.ActionBar.w0 w0Var = alVar.B;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(tkVar.G);
        }
        TextView textView = alVar.y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, tkVar.x)));
        }
        super.l();
    }
}
