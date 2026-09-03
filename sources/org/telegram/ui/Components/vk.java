package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class vk extends uf.i0 {
    public final /* synthetic */ cl K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk(cl clVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context, g6Var, z4, false);
        this.K = clVar;
    }

    @Override // f2.p0
    public final void l() {
        cl clVar = this.K;
        vk vkVar = clVar.O;
        org.telegram.ui.ActionBar.w0 w0Var = clVar.B;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(vkVar.G);
        }
        TextView textView = clVar.y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, vkVar.x)));
        }
        super.l();
    }
}
