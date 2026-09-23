package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ot extends LinearLayout {
    public final org.telegram.ui.Components.w9 a;
    public final org.telegram.ui.ActionBar.i5 b;
    public final org.telegram.ui.ActionBar.d6 c;
    public TLRPC.StickerSetCovered d;

    public ot(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.c = d6Var;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.a = w9Var;
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.b = i5Var;
        i5Var.setTextSize(16);
        i5Var.setTextColor(-1);
        setOrientation(0);
        addView(w9Var, w7.x5.t(24, 24, 17, 17, 0, 17, 0));
        addView(i5Var, w7.x5.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
