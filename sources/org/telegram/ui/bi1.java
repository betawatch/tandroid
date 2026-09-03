package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class bi1 extends org.telegram.ui.Components.voip.a1 {
    public final /* synthetic */ ii1 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi1(ii1 ii1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.S = ii1Var;
    }

    @Override // org.telegram.ui.Components.voip.a1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        ii1 ii1Var = this.S;
        ii1Var.V.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], ii1Var.V.getMeasuredWidth()};
    }
}
