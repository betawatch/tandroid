package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class j9 extends FrameLayout {
    public final org.telegram.ui.Cells.h6 a;
    public final org.telegram.ui.Components.xh0 b;
    public TLRPC.Chat c;

    public j9(Context context) {
        super(context);
        String string = LocaleController.getString(R.string.VoipChatJoin);
        org.telegram.ui.Components.xh0 xh0Var = new org.telegram.ui.Components.xh0(context);
        this.b = xh0Var;
        int ceil = (int) Math.ceil(xh0Var.getPaint().measureText(string));
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
        this.a = h6Var;
        h6Var.M0 = true;
        h6Var.E0 = true;
        h6Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(44.0f) + ceil : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(44.0f) + ceil, 0);
        int i10 = -AndroidUtilities.dp(4.0f);
        h6Var.b0 = 0;
        h6Var.c0 = i10;
        addView(h6Var, w7.x5.c(-1.0f, -1));
        xh0Var.setText(string);
        xh0Var.setTextSize(1, 14.0f);
        xh0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        xh0Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Nh, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hl, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        xh0Var.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{16.0f}, w02));
        xh0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(xh0Var, w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }
}
