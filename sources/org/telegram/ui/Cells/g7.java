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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.oq;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class g7 extends FrameLayout {
    public final org.telegram.ui.Components.x9 a;
    public final d7 b;
    public final TextView c;
    public long d;
    public long e;
    public final int f;
    public final org.telegram.ui.ActionBar.f6 h;

    public g7(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f = UserConfig.selectedAccount;
        this.h = f6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        this.a = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(x9Var, w7.x5.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        wl.n(org.telegram.ui.ActionBar.j6.j5, f6Var, textView, 1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.x5.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.b = new d7(this, f6Var, 1);
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
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
        org.telegram.ui.Components.x9 x9Var = this.a;
        x9Var.setAnimatedEmojiDrawable(null);
        og.a aVar = new og.a(og.a.k[0]);
        l80 l80Var = new l80(1, null);
        l80Var.a("");
        l80Var.i = 1.8f;
        oq oqVar = new oq(aVar, l80Var, 0, 0);
        oqVar.w = true;
        x9Var.setImageDrawable(oqVar);
    }
}
