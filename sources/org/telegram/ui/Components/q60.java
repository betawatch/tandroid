package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class q60 extends d90 {
    public final /* synthetic */ u60 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q60(u60 u60Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10) {
        super(context, n2Var, f3Var, false, z10);
        this.L = u60Var;
    }

    @Override // org.telegram.ui.Components.d90
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.f6 f6Var;
        z60 z60Var = this.L.c;
        org.telegram.ui.ActionBar.d3 d3Var = z60Var.container;
        f6Var = ((org.telegram.ui.ActionBar.f3) z60Var).resourcesProvider;
        pc Q = new xc(d3Var, f6Var).Q(i10, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
