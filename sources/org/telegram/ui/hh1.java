package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class hh1 extends org.telegram.ui.Components.voip.b1 {
    public final /* synthetic */ oh1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh1(oh1 oh1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = oh1Var;
    }

    @Override // org.telegram.ui.Components.voip.b1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        oh1 oh1Var = this.V;
        oh1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], oh1Var.Y.getMeasuredWidth()};
    }
}
