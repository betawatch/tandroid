package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class d70 extends r90 {
    public final /* synthetic */ h70 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d70(h70 h70Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.h3 h3Var, boolean z10) {
        super(context, o2Var, h3Var, false, z10);
        this.M = h70Var;
    }

    @Override // org.telegram.ui.Components.r90
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.g6 g6Var;
        m70 m70Var = this.M.c;
        org.telegram.ui.ActionBar.e3 e3Var = m70Var.container;
        g6Var = ((org.telegram.ui.ActionBar.h3) m70Var).resourcesProvider;
        qc Q = new xc(e3Var, g6Var).Q(i10, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
