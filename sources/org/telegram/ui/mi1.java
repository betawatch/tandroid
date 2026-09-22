package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class mi1 extends org.telegram.ui.Components.voip.d1 {
    public final /* synthetic */ ti1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi1(ti1 ti1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = ti1Var;
    }

    @Override // org.telegram.ui.Components.voip.d1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        ti1 ti1Var = this.V;
        ti1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], ti1Var.Y.getMeasuredWidth()};
    }
}
