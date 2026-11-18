package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class o50 extends e80 {
    public final /* synthetic */ s50 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o50(s50 s50Var, Context context, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.ActionBar.x2 x2Var, boolean z10) {
        super(context, h2Var, x2Var, false, z10);
        this.N = s50Var;
    }

    @Override // org.telegram.ui.Components.e80
    public final void e(SpannableStringBuilder spannableStringBuilder) {
        x50 x50Var = this.N.c;
        org.telegram.ui.ActionBar.n2 n2Var = x50Var.c;
        int i7 = x50.i2;
        gc Q = new lc(n2Var, x50Var.J0).Q(R.raw.forward, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
