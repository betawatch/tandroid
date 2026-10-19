package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class c70 extends q90 {
    public final /* synthetic */ g70 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c70(g70 g70Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10) {
        super(context, n2Var, f3Var, false, z10);
        this.L = g70Var;
    }

    @Override // org.telegram.ui.Components.q90
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.d6 d6Var;
        l70 l70Var = this.L.c;
        org.telegram.ui.ActionBar.d3 d3Var = l70Var.container;
        d6Var = ((org.telegram.ui.ActionBar.f3) l70Var).resourcesProvider;
        qc Q = new xc(d3Var, d6Var).Q(i10, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
