package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class j9 extends FrameLayout {
    public final org.telegram.ui.Cells.i6 a;
    public final org.telegram.ui.Components.yh0 b;
    public TLRPC.Chat c;

    public j9(Context context) {
        super(context);
        String string = LocaleController.getString(R.string.VoipChatJoin);
        org.telegram.ui.Components.yh0 yh0Var = new org.telegram.ui.Components.yh0(context);
        this.b = yh0Var;
        int ceil = (int) Math.ceil(yh0Var.getPaint().measureText(string));
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, null);
        this.a = i6Var;
        i6Var.M0 = true;
        i6Var.E0 = true;
        i6Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(44.0f) + ceil : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(44.0f) + ceil, 0);
        int i10 = -AndroidUtilities.dp(4.0f);
        i6Var.b0 = 0;
        i6Var.c0 = i10;
        addView(i6Var, w7.x5.c(-1.0f, -1));
        yh0Var.setText(string);
        yh0Var.setTextSize(1, 14.0f);
        yh0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Sh, false));
        yh0Var.setProgressColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Nh, false));
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.hl, false);
        org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Qh, false);
        yh0Var.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{16.0f}, w02));
        yh0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(yh0Var, w7.x5.i(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }
}
