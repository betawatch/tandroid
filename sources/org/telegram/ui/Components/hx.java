package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class hx extends u41 {
    public hx(Context context, int i7, org.telegram.messenger.s10 s10Var, org.telegram.messenger.x10 x10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i7, -1, false, s10Var, x10Var, null, e6Var, -1, 0);
        this.z2 = true;
        setOverScrollMode(2);
    }

    public final void L1(View view) {
        if (view == null) {
            return;
        }
        float L = org.telegram.messenger.g0.L(92.0f);
        float width = getWidth() - L;
        float x10 = view.getX();
        float width2 = view.getWidth() + x10;
        int i7 = x10 < L ? (int) (x10 - L) : width2 > width ? (int) (width2 - width) : 0;
        if (i7 != 0) {
            org.telegram.messenger.g0.J(this, new u11(this, view, i7, 23));
        }
    }
}
