package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
