package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w50 extends i80 {
    public final /* synthetic */ a60 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w50(a60 a60Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e3 e3Var, boolean z10) {
        super(context, n2Var, e3Var, false, z10);
        this.H = a60Var;
    }

    @Override // org.telegram.ui.Components.i80
    public final void e(int i10, SpannableStringBuilder spannableStringBuilder) {
        org.telegram.ui.ActionBar.c6 c6Var;
        f60 f60Var = this.H.c;
        org.telegram.ui.ActionBar.c3 c3Var = f60Var.container;
        c6Var = ((org.telegram.ui.ActionBar.e3) f60Var).resourcesProvider;
        ec Q = new mc(c3Var, c6Var).Q(i10, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
