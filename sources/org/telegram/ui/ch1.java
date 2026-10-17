package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
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
