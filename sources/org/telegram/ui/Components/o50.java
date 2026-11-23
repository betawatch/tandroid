package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class o50 extends d80 {
    public final /* synthetic */ s50 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o50(s50 s50Var, Context context, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.w2 w2Var, boolean z10) {
        super(context, g2Var, w2Var, false, z10);
        this.N = s50Var;
    }

    @Override // org.telegram.ui.Components.d80
    public final void e(SpannableStringBuilder spannableStringBuilder) {
        x50 x50Var = this.N.c;
        org.telegram.ui.ActionBar.m2 m2Var = x50Var.c;
        int i7 = x50.i2;
        fc Q = new kc(m2Var, x50Var.J0).Q(R.raw.forward, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
