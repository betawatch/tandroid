package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hh1 extends org.telegram.ui.Components.voip.b1 {
    public final /* synthetic */ oh1 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh1(oh1 oh1Var, Context context, float f9, float f10) {
        super(context, f9, f10);
        this.R = oh1Var;
    }

    @Override // org.telegram.ui.Components.voip.b1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        oh1 oh1Var = this.R;
        oh1Var.U.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], oh1Var.U.getMeasuredWidth()};
    }
}
