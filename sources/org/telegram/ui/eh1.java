package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class eh1 extends org.telegram.ui.Components.voip.a1 {
    public final /* synthetic */ lh1 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh1(lh1 lh1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.R = lh1Var;
    }

    @Override // org.telegram.ui.Components.voip.a1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        lh1 lh1Var = this.R;
        lh1Var.U.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], lh1Var.U.getMeasuredWidth()};
    }
}
