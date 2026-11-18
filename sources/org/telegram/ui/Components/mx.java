package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class mx extends e51 {
    public mx(Context context, int i7, org.telegram.messenger.q10 q10Var, org.telegram.messenger.v10 v10Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, -1, false, q10Var, v10Var, null, i6Var, -1, 0);
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
            org.telegram.messenger.g0.J(this, new h01(this, view, i7, 24));
        }
    }
}
