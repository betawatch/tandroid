package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class n9 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Cells.m6 a;
    public final org.telegram.ui.Components.xi0 b;
    public TLRPC.Chat c;

    public n9(Context context) {
        super(context);
        String string = LocaleController.getString(R.string.VoipChatJoin);
        org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(context);
        this.b = xi0Var;
        int ceil = (int) Math.ceil(xi0Var.getPaint().measureText(string));
        org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(context, null);
        this.a = m6Var;
        m6Var.M0 = true;
        m6Var.E0 = true;
        m6Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(44.0f) + ceil : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(44.0f) + ceil, 0);
        int i10 = -AndroidUtilities.dp(4.0f);
        m6Var.b0 = 0;
        m6Var.c0 = i10;
        addView(m6Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        xi0Var.setText(string);
        xi0Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(xi0Var, org.telegram.ui.ActionBar.y6.Sh, null);
        xi0Var.setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Nh, false));
        int i11 = org.telegram.ui.ActionBar.y6.hl;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
        org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qh, false);
        xi0Var.setBackground(org.telegram.ui.ActionBar.o6.e(new float[]{16.0f}, x02));
        Drawable background = xi0Var.getBackground();
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        xi0Var.setBackground(background);
        org.telegram.ui.ActionBar.f7.k(xi0Var, background, N, null, null);
        xi0Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        addView(xi0Var, org.telegram.ui.Components.kb1.m(-2.0f, 28.0f, 8388661, 0.0f, 16.0f, 14.0f, 0.0f));
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        try {
            this.b.setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Nh, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
