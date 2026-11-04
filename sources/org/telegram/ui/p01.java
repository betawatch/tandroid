package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p01 extends vg.y0 {
    public final /* synthetic */ q01 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p01(q01 q01Var, Context context) {
        super(2, context, null);
        this.N = q01Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        q01 q01Var = this.N;
        if (q01Var.getParent() instanceof View) {
            ((View) q01Var.getParent()).invalidate();
        }
    }
}
