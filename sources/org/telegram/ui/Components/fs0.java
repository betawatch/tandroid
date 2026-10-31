package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fs0 extends org.telegram.ui.wn {
    public final /* synthetic */ zt0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs0(zt0 zt0Var, Context context, org.telegram.ui.ActionBar.z4 z4Var, Bundle bundle) {
        super(context, z4Var, bundle);
        this.f = zt0Var;
    }

    @Override // org.telegram.ui.wn
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.t0 t0Var = this.f.p0;
        if (t0Var != null) {
            t0Var.setShowSearchProgress(z10);
        }
    }
}
