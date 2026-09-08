package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class i60 extends w80 {
    public final /* synthetic */ m60 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i60(m60 m60Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10) {
        super(context, n2Var, f3Var, false, z10);
        this.L = m60Var;
    }

    @Override // org.telegram.ui.Components.w80
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.f6 f6Var;
        r60 r60Var = this.L.c;
        org.telegram.ui.ActionBar.d3 d3Var = r60Var.container;
        f6Var = ((org.telegram.ui.ActionBar.f3) r60Var).resourcesProvider;
        qc Q = new yc(d3Var, f6Var).Q(i10, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
