package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class h51 extends sg.b1 {
    public final /* synthetic */ i51 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h51(i51 i51Var, Context context) {
        super(context, 2, null);
        this.M = i51Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        i51 i51Var = this.M;
        if (i51Var.getParent() instanceof View) {
            ((View) i51Var.getParent()).invalidate();
        }
    }
}
