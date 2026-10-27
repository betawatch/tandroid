package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class f70 extends s90 {
    public final /* synthetic */ j70 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f70(j70 j70Var, Context context, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.k3 k3Var, boolean z10) {
        super(context, r2Var, k3Var, false, z10);
        this.M = j70Var;
    }

    @Override // org.telegram.ui.Components.s90
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.u6 u6Var;
        o70 o70Var = this.M.c;
        org.telegram.ui.ActionBar.h3 h3Var = o70Var.container;
        u6Var = ((org.telegram.ui.ActionBar.k3) o70Var).resourcesProvider;
        qc R = new wc(h3Var, u6Var).R(i10, 36, spannableStringBuilder);
        R.s = false;
        R.k(true);
    }
}
