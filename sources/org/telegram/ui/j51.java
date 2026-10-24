package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class j51 extends sg.c1 {
    public final /* synthetic */ k51 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j51(k51 k51Var, Context context) {
        super(context, 2, null);
        this.M = k51Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        k51 k51Var = this.M;
        if (k51Var.getParent() instanceof View) {
            ((View) k51Var.getParent()).invalidate();
        }
    }
}
