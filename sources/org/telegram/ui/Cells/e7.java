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
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.n80;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class e7 extends FrameLayout {
    public final org.telegram.ui.Components.p9 a;
    public final b7 b;
    public final TextView c;
    public long d;
    public long e;
    public final int f;
    public final org.telegram.ui.ActionBar.f6 h;

    public e7(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f = UserConfig.selectedAccount;
        this.h = f6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(p9Var, k7.b6.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.j5, f6Var, textView, 1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, k7.b6.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.b = new b7(this, f6Var, 1);
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

    public void setAsNewBotForumTopic(boolean z4) {
        this.c.setText(LocaleController.getString(z4 ? R.string.ShareSendToNewTopic : R.string.ShareSendToOffTopic));
        org.telegram.ui.Components.p9 p9Var = this.a;
        p9Var.setAnimatedEmojiDrawable(null);
        ag.b bVar = new ag.b(ag.b.k[0]);
        n80 n80Var = new n80(1, null);
        n80Var.a("");
        n80Var.i = 1.8f;
        mq mqVar = new mq(bVar, n80Var, 0, 0);
        mqVar.w = true;
        p9Var.setImageDrawable(mqVar);
    }
}
