package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class bi0 extends yz {
    public final /* synthetic */ gi0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi0(gi0 gi0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.V = gi0Var;
    }

    @Override // org.telegram.ui.Components.yz
    public final int getAdditionalHeight() {
        aa0 aa0Var;
        gi0 gi0Var = this.V;
        if (gi0Var.I.isEmpty() || (aa0Var = gi0Var.K) == null) {
            return 0;
        }
        return org.telegram.messenger.g0.L(8.0f) + aa0Var.getMeasuredHeight();
    }
}
