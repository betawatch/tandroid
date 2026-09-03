package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class tn0 extends h40 {
    public final /* synthetic */ org.telegram.ui.zx Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn0(org.telegram.ui.zx zxVar, rl0 rl0Var, Context context, int i10) {
        super(rl0Var, context, i10);
        this.Z = zxVar;
    }

    @Override // org.telegram.ui.Components.w51
    public final void N(boolean z4) {
        super.N(z4);
        pn0 pn0Var = this.Z.p0;
        pn0Var.e(false, z4);
        pn0Var.d.setText(LocaleController.getString(R.string.NoResult));
        pn0Var.e.setVisibility(8);
    }
}
