package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j51 extends zf.b1 {
    public final /* synthetic */ k51 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j51(k51 k51Var, Context context) {
        super(context, 2, null);
        this.I = k51Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        k51 k51Var = this.I;
        if (k51Var.getParent() instanceof View) {
            ((View) k51Var.getParent()).invalidate();
        }
    }
}
