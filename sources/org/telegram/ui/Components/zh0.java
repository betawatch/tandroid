package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class zh0 extends wz {
    public final /* synthetic */ ei0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh0(ei0 ei0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.V = ei0Var;
    }

    @Override // org.telegram.ui.Components.wz
    public final int getAdditionalHeight() {
        y90 y90Var;
        ei0 ei0Var = this.V;
        if (ei0Var.I.isEmpty() || (y90Var = ei0Var.K) == null) {
            return 0;
        }
        return org.telegram.messenger.g0.L(8.0f) + y90Var.getMeasuredHeight();
    }
}
