package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class j60 extends x80 {
    public final /* synthetic */ n60 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j60(n60 n60Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g3 g3Var, boolean z4) {
        super(context, p2Var, g3Var, false, z4);
        this.I = n60Var;
    }

    @Override // org.telegram.ui.Components.x80
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.f6 f6Var;
        s60 s60Var = this.I.c;
        org.telegram.ui.ActionBar.e3 e3Var = s60Var.container;
        f6Var = ((org.telegram.ui.ActionBar.g3) s60Var).resourcesProvider;
        ic Q = new qc(e3Var, f6Var).Q(i10, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
