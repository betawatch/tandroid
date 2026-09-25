package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
