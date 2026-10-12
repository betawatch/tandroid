package org.telegram.ui.Cells;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.m90;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class h7 extends FrameLayout {
    public final org.telegram.ui.Components.z9 a;
    public final e7 b;
    public final TextView c;
    public long d;
    public long e;
    public final int f;
    public final org.telegram.ui.ActionBar.c6 h;

    public h7(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f = UserConfig.selectedAccount;
        this.h = c6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        this.a = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(z9Var, w7.a6.a(56.0f, 0.0f, 7.0f, 0.0f, 0.0f, 56, 49));
        TextView textView = new TextView(context);
        this.c = textView;
        yh.n(org.telegram.ui.ActionBar.g6.j5, c6Var, textView, 1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.a6.a(-2.0f, 6.0f, 66.0f, 6.0f, 0.0f, -1, 51));
        this.b = new e7(this, c6Var, 1);
        setBackground(org.telegram.ui.ActionBar.g6.Z(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.i6, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
    }

    public long getCurrentDialog() {
        return this.d;
    }

    public long getCurrentTopic() {
        return this.e;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(103.0f), TLObject.FLAG_30));
    }

    public void setAsNewBotForumTopic(boolean z10) {
        this.c.setText(LocaleController.getString(z10 ? R.string.ShareSendToNewTopic : R.string.ShareSendToOffTopic));
        org.telegram.ui.Components.z9 z9Var = this.a;
        z9Var.setAnimatedEmojiDrawable(null);
        og.a aVar = new og.a(og.a.k[0]);
        m90 m90Var = new m90(1, null);
        m90Var.a("");
        m90Var.i = 1.8f;
        cr crVar = new cr(aVar, m90Var, 0, 0);
        crVar.w = true;
        z9Var.setImageDrawable(crVar);
    }
}
