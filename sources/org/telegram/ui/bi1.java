package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class bi1 extends org.telegram.ui.Components.voip.b1 {
    public final /* synthetic */ ii1 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi1(ii1 ii1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.S = ii1Var;
    }

    @Override // org.telegram.ui.Components.voip.b1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        ii1 ii1Var = this.S;
        ii1Var.V.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], ii1Var.V.getMeasuredWidth()};
    }
}
