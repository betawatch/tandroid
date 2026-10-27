package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class gt extends LinearLayout {
    public final org.telegram.ui.Components.y9 a;
    public final org.telegram.ui.ActionBar.b6 b;
    public final org.telegram.ui.ActionBar.u6 c;
    public TLRPC.StickerSetCovered d;

    public gt(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.c = u6Var;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.a = y9Var;
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.b = b6Var;
        b6Var.setTextSize(16);
        b6Var.setTextColor(-1);
        setOrientation(0);
        addView(y9Var, org.telegram.ui.Components.kb1.x(24, 24, 17, 17, 0, 17, 0));
        addView(b6Var, org.telegram.ui.Components.kb1.x(-2, -2, 17, 0, 0, 12, 0));
    }
}
