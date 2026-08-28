package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h9 extends FrameLayout {
    public final org.telegram.ui.Cells.h6 a;
    public final org.telegram.ui.Components.jh0 b;
    public TLRPC.Chat c;

    public h9(Context context) {
        super(context);
        String string = LocaleController.getString(R.string.VoipChatJoin);
        org.telegram.ui.Components.jh0 jh0Var = new org.telegram.ui.Components.jh0(context);
        this.b = jh0Var;
        int ceil = (int) Math.ceil(jh0Var.getPaint().measureText(string));
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
        this.a = h6Var;
        h6Var.I0 = true;
        h6Var.A0 = true;
        h6Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(44.0f) + ceil : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(44.0f) + ceil, 0);
        int i9 = -AndroidUtilities.dp(4.0f);
        h6Var.U = 0;
        h6Var.V = i9;
        addView(h6Var, g7.e6.c(-1.0f, -1));
        jh0Var.setText(string);
        jh0Var.setTextSize(1, 14.0f);
        jh0Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
        jh0Var.setProgressColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Nh, false));
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.hl, false);
        org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Qh, false);
        jh0Var.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{16.0f}, w02));
        jh0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(jh0Var, g7.e6.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }
}
