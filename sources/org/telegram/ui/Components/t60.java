package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class t60 extends g90 {
    public final /* synthetic */ x60 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t60(x60 x60Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.e3 e3Var, boolean z10) {
        super(context, m2Var, e3Var, false, z10);
        this.L = x60Var;
    }

    @Override // org.telegram.ui.Components.g90
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.d6 d6Var;
        c70 c70Var = this.L.c;
        org.telegram.ui.ActionBar.c3 c3Var = c70Var.container;
        d6Var = ((org.telegram.ui.ActionBar.e3) c70Var).resourcesProvider;
        qc Q = new xc(c3Var, d6Var).Q(i10, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
