package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class w60 extends j90 {
    public final /* synthetic */ a70 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w60(a70 a70Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10) {
        super(context, n2Var, f3Var, false, z10);
        this.L = a70Var;
    }

    @Override // org.telegram.ui.Components.j90
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.d6 d6Var;
        f70 f70Var = this.L.c;
        org.telegram.ui.ActionBar.d3 d3Var = f70Var.container;
        d6Var = ((org.telegram.ui.ActionBar.f3) f70Var).resourcesProvider;
        rc Q = new yc(d3Var, d6Var).Q(i10, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
