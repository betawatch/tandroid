package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class r50 extends g80 {
    public final /* synthetic */ v50 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r50(v50 v50Var, Context context, org.telegram.ui.ActionBar.g2 g2Var, org.telegram.ui.ActionBar.w2 w2Var, boolean z10) {
        super(context, g2Var, w2Var, false, z10);
        this.N = v50Var;
    }

    @Override // org.telegram.ui.Components.g80
    public final void e(SpannableStringBuilder spannableStringBuilder) {
        a60 a60Var = this.N.c;
        org.telegram.ui.ActionBar.m2 m2Var = a60Var.c;
        int i7 = a60.i2;
        gc Q = new lc(m2Var, a60Var.J0).Q(R.raw.forward, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
