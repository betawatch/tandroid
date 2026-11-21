package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class bc1 extends org.telegram.ui.Components.voip.c1 {
    public final /* synthetic */ hc1 W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc1(hc1 hc1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.W = hc1Var;
    }

    @Override // org.telegram.ui.Components.voip.c1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        hc1 hc1Var = this.W;
        hc1Var.Z.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], hc1Var.Z.getMeasuredWidth()};
    }
}
