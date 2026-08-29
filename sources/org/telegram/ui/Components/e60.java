package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e60 extends r80 {
    public final /* synthetic */ i60 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e60(i60 i60Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.f3 f3Var, boolean z10) {
        super(context, o2Var, f3Var, false, z10);
        this.H = i60Var;
    }

    @Override // org.telegram.ui.Components.r80
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.c6 c6Var;
        n60 n60Var = this.H.c;
        org.telegram.ui.ActionBar.d3 d3Var = n60Var.container;
        c6Var = ((org.telegram.ui.ActionBar.f3) n60Var).resourcesProvider;
        mc Q = new tc(d3Var, c6Var).Q(i10, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
