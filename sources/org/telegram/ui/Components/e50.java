package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class e50 extends r70 {
    public final /* synthetic */ i50 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e50(i50 i50Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.v2 v2Var, boolean z9) {
        super(context, f2Var, v2Var, false, z9);
        this.M = i50Var;
    }

    @Override // org.telegram.ui.Components.r70
    public final void e(SpannableStringBuilder spannableStringBuilder) {
        n50 n50Var = this.M.c;
        org.telegram.ui.ActionBar.l2 l2Var = n50Var.c;
        int i7 = n50.e2;
        cc Q = new hc(l2Var, n50Var.I0).Q(R.raw.forward, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
