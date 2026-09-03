package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class k60 extends x80 {
    public final /* synthetic */ o60 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k60(o60 o60Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g3 g3Var, boolean z4) {
        super(context, p2Var, g3Var, false, z4);
        this.I = o60Var;
    }

    @Override // org.telegram.ui.Components.x80
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.f6 f6Var;
        t60 t60Var = this.I.c;
        org.telegram.ui.ActionBar.e3 e3Var = t60Var.container;
        f6Var = ((org.telegram.ui.ActionBar.g3) t60Var).resourcesProvider;
        ic Q = new qc(e3Var, f6Var).Q(i10, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
