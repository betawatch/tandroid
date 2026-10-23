package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ah1 extends org.telegram.ui.Components.voip.b1 {
    public final /* synthetic */ hh1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah1(hh1 hh1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = hh1Var;
    }

    @Override // org.telegram.ui.Components.voip.b1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        hh1 hh1Var = this.V;
        hh1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], hh1Var.Y.getMeasuredWidth()};
    }
}
