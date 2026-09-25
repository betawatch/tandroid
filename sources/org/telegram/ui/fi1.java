package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
