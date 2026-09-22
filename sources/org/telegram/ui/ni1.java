package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ni1 extends org.telegram.ui.Components.voip.d1 {
    public final /* synthetic */ ui1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni1(ui1 ui1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = ui1Var;
    }

    @Override // org.telegram.ui.Components.voip.d1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        ui1 ui1Var = this.V;
        ui1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], ui1Var.Y.getMeasuredWidth()};
    }
}
