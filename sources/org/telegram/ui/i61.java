package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class i61 extends rg.c1 {
    public final /* synthetic */ j61 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i61(j61 j61Var, Context context) {
        super(context, 2, null);
        this.M = j61Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        j61 j61Var = this.M;
        if (j61Var.getParent() instanceof View) {
            ((View) j61Var.getParent()).invalidate();
        }
    }
}
