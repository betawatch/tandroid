package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class qh0 extends pz {
    public final /* synthetic */ vh0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh0(vh0 vh0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.V = vh0Var;
    }

    @Override // org.telegram.ui.Components.pz
    public final int getAdditionalHeight() {
        o90 o90Var;
        vh0 vh0Var = this.V;
        if (vh0Var.I.isEmpty() || (o90Var = vh0Var.K) == null) {
            return 0;
        }
        return org.telegram.messenger.g0.L(8.0f) + o90Var.getMeasuredHeight();
    }
}
