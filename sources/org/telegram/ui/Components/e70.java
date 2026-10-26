package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class e70 extends r90 {
    public final /* synthetic */ i70 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e70(i70 i70Var, Context context, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.k3 k3Var, boolean z10) {
        super(context, r2Var, k3Var, false, z10);
        this.M = i70Var;
    }

    @Override // org.telegram.ui.Components.r90
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.u6 u6Var;
        n70 n70Var = this.M.c;
        org.telegram.ui.ActionBar.h3 h3Var = n70Var.container;
        u6Var = ((org.telegram.ui.ActionBar.k3) n70Var).resourcesProvider;
        qc R = new wc(h3Var, u6Var).R(i10, 36, spannableStringBuilder);
        R.s = false;
        R.k(true);
    }
}
