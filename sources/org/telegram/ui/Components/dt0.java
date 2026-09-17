package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class dt0 extends org.telegram.ui.fo {
    public final /* synthetic */ xu0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt0(xu0 xu0Var, Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context, d5Var, bundle);
        this.f = xu0Var;
    }

    @Override // org.telegram.ui.fo
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.v0 v0Var = this.f.n0;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
    }
}
