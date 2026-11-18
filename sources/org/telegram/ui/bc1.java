package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
