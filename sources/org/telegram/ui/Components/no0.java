package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class no0 extends n40 {
    public final /* synthetic */ org.telegram.ui.lx c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no0(org.telegram.ui.lx lxVar, jm0 jm0Var, Context context, int i10) {
        super(jm0Var, context, i10);
        this.c0 = lxVar;
    }

    @Override // org.telegram.ui.Components.u61
    public final void N(boolean z10) {
        super.N(z10);
        jo0 jo0Var = this.c0.s0;
        jo0Var.e(false, z10);
        jo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        jo0Var.e.setVisibility(8);
    }
}
