package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class v60 extends i90 {
    public final /* synthetic */ z60 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v60(z60 z60Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.e3 e3Var, boolean z10) {
        super(context, m2Var, e3Var, false, z10);
        this.L = z60Var;
    }

    @Override // org.telegram.ui.Components.i90
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.d6 d6Var;
        e70 e70Var = this.L.c;
        org.telegram.ui.ActionBar.c3 c3Var = e70Var.container;
        d6Var = ((org.telegram.ui.ActionBar.e3) e70Var).resourcesProvider;
        qc Q = new xc(c3Var, d6Var).Q(i10, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
