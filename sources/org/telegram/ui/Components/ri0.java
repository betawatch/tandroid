package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ri0 extends zz {
    public final /* synthetic */ wi0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri0(wi0 wi0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.U = wi0Var;
    }

    @Override // org.telegram.ui.Components.zz
    public final int getAdditionalHeight() {
        da0 da0Var;
        wi0 wi0Var = this.U;
        if (wi0Var.H.isEmpty() || (da0Var = wi0Var.J) == null) {
            return 0;
        }
        return org.telegram.messenger.i0.L(8.0f) + da0Var.getMeasuredHeight();
    }
}
