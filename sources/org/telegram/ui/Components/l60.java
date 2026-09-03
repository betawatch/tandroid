package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class l60 extends y80 {
    public final /* synthetic */ p60 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l60(p60 p60Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.h3 h3Var, boolean z4) {
        super(context, p2Var, h3Var, false, z4);
        this.I = p60Var;
    }

    @Override // org.telegram.ui.Components.y80
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.g6 g6Var;
        u60 u60Var = this.I.c;
        org.telegram.ui.ActionBar.f3 f3Var = u60Var.container;
        g6Var = ((org.telegram.ui.ActionBar.h3) u60Var).resourcesProvider;
        ic Q = new qc(f3Var, g6Var).Q(i10, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
