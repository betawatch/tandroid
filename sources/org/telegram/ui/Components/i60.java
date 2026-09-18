package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class i60 extends v80 {
    public final /* synthetic */ m60 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i60(m60 m60Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g3 g3Var, boolean z10) {
        super(context, o2Var, g3Var, false, z10);
        this.L = m60Var;
    }

    @Override // org.telegram.ui.Components.v80
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.f6 f6Var;
        r60 r60Var = this.L.c;
        org.telegram.ui.ActionBar.e3 e3Var = r60Var.container;
        f6Var = ((org.telegram.ui.ActionBar.g3) r60Var).resourcesProvider;
        oc Q = new vc(e3Var, f6Var).Q(i10, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
