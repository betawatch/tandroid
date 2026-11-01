package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class p21 extends kg.l1 {
    public final /* synthetic */ q21 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p21(q21 q21Var, Context context) {
        super(2, context, null);
        this.M = q21Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        q21 q21Var = this.M;
        if (q21Var.getParent() instanceof View) {
            ((View) q21Var.getParent()).invalidate();
        }
    }
}
