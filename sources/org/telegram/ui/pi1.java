package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class pi1 extends org.telegram.ui.Components.voip.d1 {
    public final /* synthetic */ wi1 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi1(wi1 wi1Var, Context context, float f7, float f10) {
        super(context, f7, f10);
        this.V = wi1Var;
    }

    @Override // org.telegram.ui.Components.voip.d1
    public final int[] getFloatingViewLocation() {
        int[] iArr = new int[2];
        wi1 wi1Var = this.V;
        wi1Var.Y.getLocationOnScreen(iArr);
        return new int[]{iArr[0], iArr[1], wi1Var.Y.getMeasuredWidth()};
    }
}
