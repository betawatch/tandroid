package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
