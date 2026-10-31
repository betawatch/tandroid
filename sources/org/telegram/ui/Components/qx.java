package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qx extends u51 {
    public qx(Context context, int i10, org.telegram.messenger.j20 j20Var, org.telegram.messenger.o20 o20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, i10, -1, false, j20Var, o20Var, null, p6Var, -1, 0);
        this.y2 = true;
        setOverScrollMode(2);
    }

    public final void L1(View view) {
        if (view == null) {
            return;
        }
        float L = org.telegram.messenger.i0.L(92.0f);
        float width = getWidth() - L;
        float x10 = view.getX();
        float width2 = view.getWidth() + x10;
        int i10 = x10 < L ? (int) (x10 - L) : width2 > width ? (int) (width2 - width) : 0;
        if (i10 != 0) {
            org.telegram.messenger.i0.J(this, new ag.o0(this, view, i10, 4));
        }
    }
}
