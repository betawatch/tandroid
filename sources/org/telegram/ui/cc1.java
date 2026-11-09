package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class cc1 extends org.telegram.ui.Components.voip.z0 {
    public final /* synthetic */ ic1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc1(ic1 ic1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.V = ic1Var;
    }

    @Override // org.telegram.ui.Components.voip.z0
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        ic1 ic1Var = this.V;
        ic1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], ic1Var.Y.getMeasuredWidth()};
    }
}
