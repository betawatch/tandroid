package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class k70 extends x90 {
    public final /* synthetic */ o70 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k70(o70 o70Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10) {
        super(context, n2Var, f3Var, false, z10);
        this.L = o70Var;
    }

    @Override // org.telegram.ui.Components.x90
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.e6 e6Var;
        t70 t70Var = this.L.c;
        org.telegram.ui.ActionBar.d3 d3Var = t70Var.container;
        e6Var = ((org.telegram.ui.ActionBar.f3) t70Var).resourcesProvider;
        tc Q = new ad(d3Var, e6Var).Q(i10, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
