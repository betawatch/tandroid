package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class k9 extends FrameLayout {
    public final org.telegram.ui.Cells.j6 a;
    public final org.telegram.ui.Components.ki0 b;
    public TLRPC.Chat c;

    public k9(Context context) {
        super(context);
        String string = LocaleController.getString(R.string.VoipChatJoin);
        org.telegram.ui.Components.ki0 ki0Var = new org.telegram.ui.Components.ki0(context);
        this.b = ki0Var;
        int ceil = (int) Math.ceil(ki0Var.getPaint().measureText(string));
        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, null);
        this.a = j6Var;
        j6Var.M0 = true;
        j6Var.E0 = true;
        j6Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(44.0f) + ceil : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(44.0f) + ceil, 0);
        int i10 = -AndroidUtilities.dp(4.0f);
        j6Var.b0 = 0;
        j6Var.c0 = i10;
        addView(j6Var, w7.y5.c(-1.0f, -1));
        ki0Var.setText(string);
        ki0Var.setTextSize(1, 14.0f);
        ki0Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
        ki0Var.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Nh, false));
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hl, false);
        org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Qh, false);
        ki0Var.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{16.0f}, w02));
        ki0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(ki0Var, w7.y5.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }
}
