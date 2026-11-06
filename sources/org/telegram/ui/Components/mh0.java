package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class mh0 extends lz {
    public final /* synthetic */ rh0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh0(rh0 rh0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.U = rh0Var;
    }

    @Override // org.telegram.ui.Components.lz
    public final int getAdditionalHeight() {
        l90 l90Var;
        rh0 rh0Var = this.U;
        if (rh0Var.H.isEmpty() || (l90Var = rh0Var.J) == null) {
            return 0;
        }
        return org.telegram.messenger.g0.L(8.0f) + l90Var.getMeasuredHeight();
    }
}
