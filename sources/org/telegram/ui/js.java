package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class js extends LinearLayout {
    public final org.telegram.ui.Components.l9 a;
    public final org.telegram.ui.ActionBar.k5 b;
    public final org.telegram.ui.ActionBar.f6 c;
    public TLRPC.StickerSetCovered d;

    public js(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.c = f6Var;
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.a = l9Var;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.b = k5Var;
        k5Var.setTextSize(16);
        k5Var.setTextColor(-1);
        setOrientation(0);
        addView(l9Var, c8.ha.t(24, 24, 17, 17, 0, 17, 0));
        addView(k5Var, c8.ha.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
