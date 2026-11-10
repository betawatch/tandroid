package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class az extends org.telegram.ui.Cells.n4 {
    public final org.telegram.ui.Cells.w3 r;

    public az(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, true, true, true, 3);
        this.r = w3Var;
        w3Var.setGravity(org.telegram.messenger.id.a0 ? 3 : 5);
        org.telegram.ui.ActionBar.t6.Y(w3Var, org.telegram.ui.ActionBar.m6.L6, h6Var);
        w3Var.setTextSize(org.telegram.messenger.g0.N(15.0f));
        addView(w3Var, c8.ha.d(-1, 18.0f, (org.telegram.messenger.id.a0 ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        c8.ka.b(w3Var, 0.04f, 1.2f);
    }
}
