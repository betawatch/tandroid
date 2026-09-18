package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class li1 extends org.telegram.ui.Components.voip.d1 {
    public final /* synthetic */ si1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li1(si1 si1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = si1Var;
    }

    @Override // org.telegram.ui.Components.voip.d1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        si1 si1Var = this.V;
        si1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], si1Var.Y.getMeasuredWidth()};
    }
}
