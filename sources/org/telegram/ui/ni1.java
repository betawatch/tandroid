package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ni1 extends org.telegram.ui.Components.voip.b1 {
    public final /* synthetic */ ui1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni1(ui1 ui1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = ui1Var;
    }

    @Override // org.telegram.ui.Components.voip.b1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        ui1 ui1Var = this.V;
        ui1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], ui1Var.Y.getMeasuredWidth()};
    }
}
