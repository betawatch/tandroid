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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.jq;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class d7 extends FrameLayout {
    public final org.telegram.ui.Components.t9 a;
    public final a7 b;
    public final TextView c;
    public long d;
    public long e;
    public final int f;
    public final org.telegram.ui.ActionBar.c6 h;

    public d7(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f = UserConfig.selectedAccount;
        this.h = c6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.a = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(t9Var, i7.f6.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.j5, c6Var, textView, 1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, i7.f6.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.b = new a7(this, c6Var, 1);
        setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
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
        org.telegram.ui.Components.t9 t9Var = this.a;
        t9Var.setAnimatedEmojiDrawable(null);
        yf.b bVar = new yf.b(yf.b.k[0]);
        h80 h80Var = new h80(1, null);
        h80Var.a("");
        h80Var.i = 1.8f;
        jq jqVar = new jq(bVar, h80Var, 0, 0);
        jqVar.w = true;
        t9Var.setImageDrawable(jqVar);
    }
}
