package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class bx extends r41 {
    public bx(Context context, int i7, org.telegram.messenger.v10 v10Var, org.telegram.messenger.a20 a20Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, -1, false, v10Var, a20Var, null, h6Var, -1, 0);
        this.y2 = true;
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
            org.telegram.messenger.g0.J(this, new org.telegram.ui.h10(this, view, i7, 20));
        }
    }
}
