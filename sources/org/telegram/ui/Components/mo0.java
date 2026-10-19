package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class mo0 extends n40 {
    public final /* synthetic */ org.telegram.ui.lx c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo0(org.telegram.ui.lx lxVar, im0 im0Var, Context context, int i10) {
        super(im0Var, context, i10);
        this.c0 = lxVar;
    }

    @Override // org.telegram.ui.Components.t61
    public final void N(boolean z10) {
        super.N(z10);
        io0 io0Var = this.c0.s0;
        io0Var.e(false, z10);
        io0Var.d.setText(LocaleController.getString(R.string.NoResult));
        io0Var.e.setVisibility(8);
    }
}
