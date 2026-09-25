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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.w80;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class h7 extends FrameLayout {
    public final org.telegram.ui.Components.w9 a;
    public final e7 b;
    public final TextView c;
    public long d;
    public long e;
    public final int f;
    public final org.telegram.ui.ActionBar.d6 h;

    public h7(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f = UserConfig.selectedAccount;
        this.h = d6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(w9Var, w7.y5.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        ok.n(org.telegram.ui.ActionBar.h6.j5, d6Var, textView, 1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, w7.y5.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.b = new e7(this, d6Var, 1);
        setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.i6, false), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
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
        org.telegram.ui.Components.w9 w9Var = this.a;
        w9Var.setAnimatedEmojiDrawable(null);
        ng.a aVar = new ng.a(ng.a.k[0]);
        w80 w80Var = new w80(1, null);
        w80Var.a("");
        w80Var.i = 1.8f;
        qq qqVar = new qq(aVar, w80Var, 0, 0);
        qqVar.w = true;
        w9Var.setImageDrawable(qqVar);
    }
}
