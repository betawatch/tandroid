package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class d50 extends q70 {
    public final /* synthetic */ h50 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d50(h50 h50Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, org.telegram.ui.ActionBar.v2 v2Var, boolean z9) {
        super(context, f2Var, v2Var, false, z9);
        this.M = h50Var;
    }

    @Override // org.telegram.ui.Components.q70
    public final void e(SpannableStringBuilder spannableStringBuilder) {
        m50 m50Var = this.M.c;
        org.telegram.ui.ActionBar.l2 l2Var = m50Var.c;
        int i7 = m50.e2;
        cc Q = new hc(l2Var, m50Var.I0).Q(R.raw.forward, 36, spannableStringBuilder);
        Q.r = false;
        Q.k(true);
    }
}
