package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class n51 extends tg.c1 {
    public final /* synthetic */ o51 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n51(o51 o51Var, Context context) {
        super(context, 2, null);
        this.M = o51Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        o51 o51Var = this.M;
        if (o51Var.getParent() instanceof View) {
            ((View) o51Var.getParent()).invalidate();
        }
    }
}
