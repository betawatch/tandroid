package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class rt0 extends org.telegram.ui.yn {
    public final /* synthetic */ lv0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt0(lv0 lv0Var, Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context, b5Var, bundle);
        this.f = lv0Var;
    }

    @Override // org.telegram.ui.yn
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.u0 u0Var = this.f.n0;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
    }
}
