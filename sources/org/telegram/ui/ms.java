package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ms extends LinearLayout {
    public final org.telegram.ui.Components.k9 a;
    public final org.telegram.ui.ActionBar.m5 b;
    public final org.telegram.ui.ActionBar.h6 c;
    public TLRPC.StickerSetCovered d;

    public ms(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.c = h6Var;
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.a = k9Var;
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.b = m5Var;
        m5Var.setTextSize(16);
        m5Var.setTextColor(-1);
        setOrientation(0);
        addView(k9Var, c8.ha.t(24, 24, 17, 17, 0, 17, 0));
        addView(m5Var, c8.ha.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
