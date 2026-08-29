package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vk extends rf.j0 {
    public final /* synthetic */ bl J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk(bl blVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, z10, false);
        this.J = blVar;
    }

    @Override // f2.p0
    public final void l() {
        bl blVar = this.J;
        vk vkVar = blVar.N;
        org.telegram.ui.ActionBar.w0 w0Var = blVar.A;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(vkVar.F);
        }
        TextView textView = blVar.y;
        if (textView != null) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, vkVar.x)));
        }
        super.l();
    }
}
