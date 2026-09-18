package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class o61 extends rg.b1 {
    public final /* synthetic */ p61 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o61(p61 p61Var, Context context) {
        super(context, 2, null);
        this.M = p61Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        p61 p61Var = this.M;
        if (p61Var.getParent() instanceof View) {
            ((View) p61Var.getParent()).invalidate();
        }
    }
}
