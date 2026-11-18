package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ms extends LinearLayout {
    public final org.telegram.ui.Components.q9 a;
    public final org.telegram.ui.ActionBar.n5 b;
    public final org.telegram.ui.ActionBar.i6 c;
    public TLRPC.StickerSetCovered d;

    public ms(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.c = i6Var;
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.a = q9Var;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.b = n5Var;
        n5Var.setTextSize(16);
        n5Var.setTextColor(-1);
        setOrientation(0);
        addView(q9Var, c8.ma.t(24, 24, 17, 17, 0, 17, 0));
        addView(n5Var, c8.ma.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
