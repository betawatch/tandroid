package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class i9 extends FrameLayout {
    public final org.telegram.ui.Cells.e6 a;
    public final org.telegram.ui.Components.lh0 b;
    public TLRPC.Chat c;

    public i9(Context context) {
        super(context);
        String string = LocaleController.getString(R.string.VoipChatJoin);
        org.telegram.ui.Components.lh0 lh0Var = new org.telegram.ui.Components.lh0(context);
        this.b = lh0Var;
        int ceil = (int) Math.ceil(lh0Var.getPaint().measureText(string));
        org.telegram.ui.Cells.e6 e6Var = new org.telegram.ui.Cells.e6(context, null);
        this.a = e6Var;
        e6Var.I0 = true;
        e6Var.A0 = true;
        e6Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(44.0f) + ceil : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(44.0f) + ceil, 0);
        int i10 = -AndroidUtilities.dp(4.0f);
        e6Var.U = 0;
        e6Var.V = i10;
        addView(e6Var, h7.z5.c(-1.0f, -1));
        lh0Var.setText(string);
        lh0Var.setTextSize(1, 14.0f);
        lh0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
        lh0Var.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Nh, false));
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hl, false);
        org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Qh, false);
        lh0Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{16.0f}, w02));
        lh0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(lh0Var, h7.z5.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }
}
