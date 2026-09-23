package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class j60 extends w80 {
    public final /* synthetic */ n60 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j60(n60 n60Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10) {
        super(context, n2Var, f3Var, false, z10);
        this.L = n60Var;
    }

    @Override // org.telegram.ui.Components.w80
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.d6 d6Var;
        s60 s60Var = this.L.c;
        org.telegram.ui.ActionBar.d3 d3Var = s60Var.container;
        d6Var = ((org.telegram.ui.ActionBar.f3) s60Var).resourcesProvider;
        qc Q = new xc(d3Var, d6Var).Q(i10, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
