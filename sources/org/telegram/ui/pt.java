package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class pt extends LinearLayout {
    public final org.telegram.ui.Components.p9 a;
    public final org.telegram.ui.ActionBar.l5 b;
    public final org.telegram.ui.ActionBar.g6 c;
    public TLRPC.StickerSetCovered d;

    public pt(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.c = g6Var;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.a = p9Var;
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.b = l5Var;
        l5Var.setTextSize(16);
        l5Var.setTextColor(-1);
        setOrientation(0);
        addView(p9Var, k7.c6.t(24, 24, 17, 17, 0, 17, 0));
        addView(l5Var, k7.c6.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
