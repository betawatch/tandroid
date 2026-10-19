package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class zt0 extends org.telegram.ui.sn {
    public final /* synthetic */ tv0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt0(tv0 tv0Var, Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context, d5Var, bundle);
        this.f = tv0Var;
    }

    @Override // org.telegram.ui.sn
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.u0 u0Var = this.f.n0;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
    }
}
