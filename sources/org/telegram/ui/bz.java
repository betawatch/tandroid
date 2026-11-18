package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class bz extends org.telegram.ui.Cells.n4 {
    public final org.telegram.ui.Cells.w3 r;

    public bz(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, true, true, true, 3);
        this.r = w3Var;
        w3Var.setGravity(org.telegram.messenger.gd.a0 ? 3 : 5);
        org.telegram.ui.ActionBar.u6.Y(w3Var, org.telegram.ui.ActionBar.n6.L6, i6Var);
        w3Var.setTextSize(org.telegram.messenger.g0.N(15.0f));
        addView(w3Var, c8.ma.d(-1, 18.0f, (org.telegram.messenger.gd.a0 ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        c8.ra.b(w3Var, 0.04f, 1.2f);
    }
}
