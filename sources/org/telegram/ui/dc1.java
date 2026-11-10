package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class dc1 extends org.telegram.ui.Components.voip.z0 {
    public final /* synthetic */ jc1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc1(jc1 jc1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.V = jc1Var;
    }

    @Override // org.telegram.ui.Components.voip.z0
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        jc1 jc1Var = this.V;
        jc1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], jc1Var.Y.getMeasuredWidth()};
    }
}
