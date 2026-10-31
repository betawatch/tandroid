package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qi0 extends zz {
    public final /* synthetic */ vi0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi0(vi0 vi0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.U = vi0Var;
    }

    @Override // org.telegram.ui.Components.zz
    public final int getAdditionalHeight() {
        da0 da0Var;
        vi0 vi0Var = this.U;
        if (vi0Var.H.isEmpty() || (da0Var = vi0Var.J) == null) {
            return 0;
        }
        return org.telegram.messenger.i0.L(8.0f) + da0Var.getMeasuredHeight();
    }
}
