package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class c11 extends ug.z0 {
    public final /* synthetic */ d11 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c11(d11 d11Var, Context context) {
        super(2, context, null);
        this.M = d11Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        d11 d11Var = this.M;
        if (d11Var.getParent() instanceof View) {
            ((View) d11Var.getParent()).invalidate();
        }
    }
}
