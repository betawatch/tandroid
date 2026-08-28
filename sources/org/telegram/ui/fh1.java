package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fh1 extends org.telegram.ui.Components.voip.a1 {
    public final /* synthetic */ mh1 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh1(mh1 mh1Var, Context context, float f10, float f11) {
        super(context, f10, f11);
        this.R = mh1Var;
    }

    @Override // org.telegram.ui.Components.voip.a1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        mh1 mh1Var = this.R;
        mh1Var.U.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], mh1Var.U.getMeasuredWidth()};
    }
}
