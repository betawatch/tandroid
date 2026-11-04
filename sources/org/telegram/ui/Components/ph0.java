package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ph0 extends iz {
    public final /* synthetic */ uh0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph0(uh0 uh0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.V = uh0Var;
    }

    @Override // org.telegram.ui.Components.iz
    public final int getAdditionalHeight() {
        h90 h90Var;
        uh0 uh0Var = this.V;
        if (uh0Var.I.isEmpty() || (h90Var = uh0Var.K) == null) {
            return 0;
        }
        return org.telegram.messenger.g0.L(8.0f) + h90Var.getMeasuredHeight();
    }
}
