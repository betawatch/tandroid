package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ih1 extends org.telegram.ui.Components.voip.b1 {
    public final /* synthetic */ ph1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih1(ph1 ph1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = ph1Var;
    }

    @Override // org.telegram.ui.Components.voip.b1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        ph1 ph1Var = this.V;
        ph1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], ph1Var.Y.getMeasuredWidth()};
    }
}
