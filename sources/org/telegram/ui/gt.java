package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class gt extends LinearLayout {
    public final org.telegram.ui.Components.w9 a;
    public final org.telegram.ui.ActionBar.n5 b;
    public final org.telegram.ui.ActionBar.g6 c;
    public TLRPC.StickerSetCovered d;

    public gt(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.c = g6Var;
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.a = w9Var;
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.b = n5Var;
        n5Var.setTextSize(16);
        n5Var.setTextColor(-1);
        setOrientation(0);
        addView(w9Var, w7.z5.t(24, 24, 17, 17, 0, 17, 0));
        addView(n5Var, w7.z5.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
