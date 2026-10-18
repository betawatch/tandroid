package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ch1 extends org.telegram.ui.Components.voip.b1 {
    public final /* synthetic */ jh1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch1(jh1 jh1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = jh1Var;
    }

    @Override // org.telegram.ui.Components.voip.b1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        jh1 jh1Var = this.V;
        jh1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], jh1Var.Y.getMeasuredWidth()};
    }
}
