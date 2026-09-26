package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class i61 extends rg.b1 {
    public final /* synthetic */ j61 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i61(j61 j61Var, Context context) {
        super(context, 2, null);
        this.M = j61Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        j61 j61Var = this.M;
        if (j61Var.getParent() instanceof View) {
            ((View) j61Var.getParent()).invalidate();
        }
    }
}
