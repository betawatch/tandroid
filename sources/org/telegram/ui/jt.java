package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class jt extends LinearLayout {
    public final org.telegram.ui.Components.g9 a;
    public final org.telegram.ui.ActionBar.u5 b;
    public final org.telegram.ui.ActionBar.p6 c;
    public TLRPC.StickerSetCovered d;

    public jt(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.c = p6Var;
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.a = g9Var;
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.b = u5Var;
        u5Var.setTextSize(16);
        u5Var.setTextColor(-1);
        setOrientation(0);
        addView(g9Var, w7.b6.t(24, 24, 17, 17, 0, 17, 0));
        addView(u5Var, w7.b6.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
