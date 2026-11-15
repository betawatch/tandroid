package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ms extends LinearLayout {
    public final org.telegram.ui.Components.i9 a;
    public final org.telegram.ui.ActionBar.j5 b;
    public final org.telegram.ui.ActionBar.e6 c;
    public TLRPC.StickerSetCovered d;

    public ms(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.c = e6Var;
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.a = i9Var;
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.b = j5Var;
        j5Var.setTextSize(16);
        j5Var.setTextColor(-1);
        setOrientation(0);
        addView(i9Var, c8.ja.t(24, 24, 17, 17, 0, 17, 0));
        addView(j5Var, c8.ja.t(-2, -2, 17, 0, 0, 12, 0));
    }
}
