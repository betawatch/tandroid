package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class kh1 extends org.telegram.ui.Components.voip.b1 {
    public final /* synthetic */ rh1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh1(rh1 rh1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = rh1Var;
    }

    @Override // org.telegram.ui.Components.voip.b1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        rh1 rh1Var = this.V;
        rh1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], rh1Var.Y.getMeasuredWidth()};
    }
}
