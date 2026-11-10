package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class d50 extends q70 {
    public final /* synthetic */ h50 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d50(h50 h50Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.w2 w2Var, boolean z9) {
        super(context, f2Var, w2Var, false, z9);
        this.M = h50Var;
    }

    @Override // org.telegram.ui.Components.q70
    public final void e(SpannableStringBuilder spannableStringBuilder) {
        m50 m50Var = this.M.c;
        org.telegram.ui.ActionBar.m2 m2Var = m50Var.c;
        int i7 = m50.h2;
        bc Q = new gc(m2Var, m50Var.I0).Q(R.raw.forward, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
