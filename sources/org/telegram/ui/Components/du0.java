package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class du0 extends org.telegram.ui.un {
    public final /* synthetic */ xv0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du0(xv0 xv0Var, Context context, org.telegram.ui.ActionBar.h5 h5Var, Bundle bundle) {
        super(context, h5Var, bundle);
        this.f = xv0Var;
    }

    @Override // org.telegram.ui.un
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.u0 u0Var = this.f.n0;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
    }
}
