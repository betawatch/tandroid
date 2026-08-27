package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class i51 extends ag.k2 {
    public final /* synthetic */ j51 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i51(j51 j51Var, Context context) {
        super(context, 2, null);
        this.I = j51Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        j51 j51Var = this.I;
        if (j51Var.getParent() instanceof View) {
            ((View) j51Var.getParent()).invalidate();
        }
    }
}
