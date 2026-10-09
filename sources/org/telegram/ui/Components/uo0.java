package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class uo0 extends v40 {
    public final /* synthetic */ org.telegram.ui.dy c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo0(org.telegram.ui.dy dyVar, qm0 qm0Var, Context context, int i10) {
        super(qm0Var, context, i10);
        this.c0 = dyVar;
    }

    @Override // org.telegram.ui.Components.c71
    public final void N(boolean z10) {
        super.N(z10);
        qo0 qo0Var = this.c0.s0;
        qo0Var.e(false, z10);
        qo0Var.d.setText(LocaleController.getString(R.string.NoResult));
        qo0Var.e.setVisibility(8);
    }
}
