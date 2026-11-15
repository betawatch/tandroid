package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g50 extends t70 {
    public final /* synthetic */ k50 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g50(k50 k50Var, Context context, org.telegram.ui.ActionBar.e2 e2Var, org.telegram.ui.ActionBar.u2 u2Var, boolean z10) {
        super(context, e2Var, u2Var, false, z10);
        this.N = k50Var;
    }

    @Override // org.telegram.ui.Components.t70
    public final void e(SpannableStringBuilder spannableStringBuilder) {
        p50 p50Var = this.N.c;
        org.telegram.ui.ActionBar.k2 k2Var = p50Var.c;
        int i7 = p50.i2;
        xb Q = new cc(k2Var, p50Var.J0).Q(R.raw.forward, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
