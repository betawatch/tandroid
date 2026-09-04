package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ni1 extends org.telegram.ui.Components.voip.b1 {
    public final /* synthetic */ ui1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni1(ui1 ui1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = ui1Var;
    }

    @Override // org.telegram.ui.Components.voip.b1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        ui1 ui1Var = this.V;
        ui1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], ui1Var.Y.getMeasuredWidth()};
    }
}
