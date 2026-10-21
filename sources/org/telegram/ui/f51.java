package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class f51 extends sg.c1 {
    public final /* synthetic */ g51 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f51(g51 g51Var, Context context) {
        super(context, 2, null);
        this.M = g51Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        g51 g51Var = this.M;
        if (g51Var.getParent() instanceof View) {
            ((View) g51Var.getParent()).invalidate();
        }
    }
}
