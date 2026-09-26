package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class pt0 extends org.telegram.ui.yn {
    public final /* synthetic */ jv0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt0(jv0 jv0Var, Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context, b5Var, bundle);
        this.f = jv0Var;
    }

    @Override // org.telegram.ui.yn
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.u0 u0Var = this.f.n0;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
    }
}
