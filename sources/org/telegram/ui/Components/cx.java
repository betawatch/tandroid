package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class cx extends q41 {
    public cx(Context context, int i7, org.telegram.messenger.v10 v10Var, org.telegram.messenger.a20 a20Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i7, -1, false, v10Var, a20Var, null, f6Var, -1, 0);
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
            org.telegram.messenger.g0.J(this, new org.telegram.ui.d10(this, view, i7, 20));
        }
    }
}
