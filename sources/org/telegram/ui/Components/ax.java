package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ax extends l41 {
    public ax(Context context, int i3, org.telegram.messenger.n10 n10Var, org.telegram.messenger.s10 s10Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i3, -1, false, n10Var, s10Var, null, e6Var, -1, 0);
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
        int i3 = x10 < L ? (int) (x10 - L) : width2 > width ? (int) (width2 - width) : 0;
        if (i3 != 0) {
            org.telegram.messenger.g0.J(this, new org.telegram.ui.rw(this, view, i3, 23));
        }
    }
}
