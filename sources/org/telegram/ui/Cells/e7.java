package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class e7 extends FrameLayout {
    public final org.telegram.ui.Components.l9 a;
    public final b7 b;
    public final TextView c;
    public long d;
    public long e;
    public final int f;
    public final org.telegram.ui.ActionBar.f6 h;

    public e7(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f = p10.s0;
        this.h = f6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.a = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        addView(l9Var, c8.ha.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, f6Var);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.ha.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.b = new b7(this, f6Var, 1);
        int i7 = org.telegram.ui.ActionBar.k6.i6;
        Drawable a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.x0(null, i7, false), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(this, a02, null, N, null);
    }

    public long getCurrentDialog() {
        return this.d;
    }

    public long getCurrentTopic() {
        return this.e;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(103.0f), TLObject.FLAG_30));
    }

    public void setAsNewBotForumTopic(boolean z9) {
        this.c.setText(hd.M0(z9 ? 2131745436 : 2131745435, null));
        org.telegram.ui.Components.l9 l9Var = this.a;
        l9Var.setAnimatedEmojiDrawable(null);
        qg.a aVar = new qg.a(qg.a.k[0]);
        g70 g70Var = new g70(1, null);
        g70Var.a("");
        g70Var.i = 1.8f;
        xp xpVar = new xp(aVar, g70Var, 0, 0);
        xpVar.x = true;
        l9Var.setImageDrawable(xpVar);
    }
}
