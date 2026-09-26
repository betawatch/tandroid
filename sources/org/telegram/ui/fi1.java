package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class fi1 extends org.telegram.ui.Components.voip.d1 {
    public final /* synthetic */ mi1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi1(mi1 mi1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = mi1Var;
    }

    @Override // org.telegram.ui.Components.voip.d1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        mi1 mi1Var = this.V;
        mi1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], mi1Var.Y.getMeasuredWidth()};
    }
}
