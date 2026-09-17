package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
