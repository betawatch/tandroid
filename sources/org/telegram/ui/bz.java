package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class bz extends org.telegram.ui.Cells.o4 {
    public final org.telegram.ui.Cells.x3 r;

    public bz(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(context, true, true, true, 3);
        this.r = x3Var;
        x3Var.setGravity(org.telegram.messenger.hd.a0 ? 3 : 5);
        org.telegram.ui.ActionBar.t6.Y(x3Var, org.telegram.ui.ActionBar.m6.L6, h6Var);
        x3Var.setTextSize(org.telegram.messenger.g0.N(15.0f));
        addView(x3Var, c8.ma.d(-1, 18.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        c8.ra.b(x3Var, 0.04f, 1.2f);
    }
}
