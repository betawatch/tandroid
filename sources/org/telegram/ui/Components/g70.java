package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class g70 extends w90 {
    public final /* synthetic */ k70 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g70(k70 k70Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.e3 e3Var, boolean z10) {
        super(context, m2Var, e3Var, false, z10);
        this.L = k70Var;
    }

    @Override // org.telegram.ui.Components.w90
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.c6 c6Var;
        p70 p70Var = this.L.c;
        org.telegram.ui.ActionBar.c3 c3Var = p70Var.container;
        c6Var = ((org.telegram.ui.ActionBar.e3) p70Var).resourcesProvider;
        sc Q = new zc(c3Var, c6Var).Q(i10, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
