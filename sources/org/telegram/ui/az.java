package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class az extends org.telegram.ui.Cells.o4 {
    public final org.telegram.ui.Cells.x3 r;

    public az(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(context, true, true, true, 3);
        this.r = x3Var;
        x3Var.setGravity(org.telegram.messenger.gd.a0 ? 3 : 5);
        org.telegram.ui.ActionBar.u6.Y(x3Var, org.telegram.ui.ActionBar.n6.L6, i6Var);
        x3Var.setTextSize(org.telegram.messenger.g0.N(15.0f));
        addView(x3Var, c8.na.d(-1, 18.0f, (org.telegram.messenger.gd.a0 ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        c8.sa.b(x3Var, 0.04f, 1.2f);
    }
}
