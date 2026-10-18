package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
