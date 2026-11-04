package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z40 extends m70 {
    public final /* synthetic */ d50 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z40(d50 d50Var, Context context, org.telegram.ui.ActionBar.d2 d2Var, org.telegram.ui.ActionBar.t2 t2Var, boolean z10) {
        super(context, d2Var, t2Var, false, z10);
        this.N = d50Var;
    }

    @Override // org.telegram.ui.Components.m70
    public final void e(SpannableStringBuilder spannableStringBuilder) {
        i50 i50Var = this.N.c;
        org.telegram.ui.ActionBar.j2 j2Var = i50Var.c;
        int i3 = i50.f2;
        ac Q = new fc(j2Var, i50Var.J0).Q(R.raw.forward, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
