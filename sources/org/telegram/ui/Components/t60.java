package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class t60 extends g90 {
    public final /* synthetic */ x60 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t60(x60 x60Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10) {
        super(context, n2Var, f3Var, false, z10);
        this.L = x60Var;
    }

    @Override // org.telegram.ui.Components.g90
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.f6 f6Var;
        c70 c70Var = this.L.c;
        org.telegram.ui.ActionBar.d3 d3Var = c70Var.container;
        f6Var = ((org.telegram.ui.ActionBar.f3) c70Var).resourcesProvider;
        pc Q = new xc(d3Var, f6Var).Q(i10, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
