package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class r60 extends f90 {
    public final /* synthetic */ v60 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r60(v60 v60Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.h3 h3Var, boolean z10) {
        super(context, p2Var, h3Var, false, z10);
        this.L = v60Var;
    }

    @Override // org.telegram.ui.Components.f90
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.f6 f6Var;
        a70 a70Var = this.L.c;
        org.telegram.ui.ActionBar.f3 f3Var = a70Var.container;
        f6Var = ((org.telegram.ui.ActionBar.h3) a70Var).resourcesProvider;
        pc Q = new wc(f3Var, f6Var).Q(i10, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
