package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class r60 extends e90 {
    public final /* synthetic */ v60 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r60(v60 v60Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10) {
        super(context, n2Var, f3Var, false, z10);
        this.L = v60Var;
    }

    @Override // org.telegram.ui.Components.e90
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.e6 e6Var;
        a70 a70Var = this.L.c;
        org.telegram.ui.ActionBar.d3 d3Var = a70Var.container;
        e6Var = ((org.telegram.ui.ActionBar.f3) a70Var).resourcesProvider;
        qc Q = new xc(d3Var, e6Var).Q(i10, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
