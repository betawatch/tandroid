package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t50 extends j80 {
    public final /* synthetic */ x50 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t50(x50 x50Var, Context context, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.ActionBar.z2 z2Var, boolean z10) {
        super(context, k2Var, z2Var, false, z10);
        this.M = x50Var;
    }

    @Override // org.telegram.ui.Components.j80
    public final void e(SpannableStringBuilder spannableStringBuilder) {
        c60 c60Var = this.M.c;
        org.telegram.ui.ActionBar.p2 p2Var = c60Var.c;
        int i10 = c60.e2;
        wb Q = new cc(p2Var, c60Var.I0).Q(R.raw.forward, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
