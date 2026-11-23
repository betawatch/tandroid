package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class bi0 extends vz {
    public final /* synthetic */ gi0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi0(gi0 gi0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.V = gi0Var;
    }

    @Override // org.telegram.ui.Components.vz
    public final int getAdditionalHeight() {
        x90 x90Var;
        gi0 gi0Var = this.V;
        if (gi0Var.I.isEmpty() || (x90Var = gi0Var.K) == null) {
            return 0;
        }
        return org.telegram.messenger.g0.L(8.0f) + x90Var.getMeasuredHeight();
    }
}
