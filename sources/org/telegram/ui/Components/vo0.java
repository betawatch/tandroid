package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vo0 extends p40 {
    public final /* synthetic */ org.telegram.ui.mx e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo0(org.telegram.ui.mx mxVar, nm0 nm0Var, Context context, int i10) {
        super(nm0Var, context, i10);
        this.e0 = mxVar;
    }

    @Override // org.telegram.ui.Components.k71
    public final void O(boolean z10) {
        super.O(z10);
        ro0 ro0Var = this.e0.u0;
        ro0Var.e(false, z10);
        ro0Var.d.setText(LocaleController.getString(R.string.NoResult));
        ro0Var.e.setVisibility(8);
    }
}
