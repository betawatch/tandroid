package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gt extends LinearLayout {
    public final org.telegram.ui.Components.o9 a;
    public final org.telegram.ui.ActionBar.h5 b;
    public final org.telegram.ui.ActionBar.b6 c;
    public TLRPC.StickerSetCovered d;

    public gt(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.c = b6Var;
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.a = o9Var;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.b = h5Var;
        h5Var.setTextSize(16);
        h5Var.setTextColor(-1);
        setOrientation(0);
        addView(o9Var, g7.e6.t(24, 24, 17, 17, 0, 17, 0));
        addView(h5Var, g7.e6.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
