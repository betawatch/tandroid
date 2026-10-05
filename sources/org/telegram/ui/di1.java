package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class di1 extends org.telegram.ui.Components.voip.d1 {
    public final /* synthetic */ ki1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di1(ki1 ki1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = ki1Var;
    }

    @Override // org.telegram.ui.Components.voip.d1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        ki1 ki1Var = this.V;
        ki1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], ki1Var.Y.getMeasuredWidth()};
    }
}
