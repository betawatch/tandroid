package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.t70;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e7 extends FrameLayout {
    public final org.telegram.ui.Components.p9 a;
    public final b7 b;
    public final TextView c;
    public long d;
    public long e;
    public final int f;
    public final org.telegram.ui.ActionBar.i6 h;

    public e7(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f = i10.t0;
        this.h = i6Var;
        setWillNotDraw(false);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.a = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
        addView(p9Var, c8.na.d(56, 56.0f, 49, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, i6Var);
        textView.setTextSize(1, 12.0f);
        textView.setMaxLines(2);
        textView.setGravity(49);
        textView.setLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, c8.na.d(-1, -2.0f, 51, 6.0f, 66.0f, 6.0f, 0.0f));
        this.b = new b7(this, i6Var, 1);
        int i7 = org.telegram.ui.ActionBar.n6.i6;
        Drawable a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.x0(null, i7, false), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        setBackground(a02);
        org.telegram.ui.ActionBar.u6.j(this, a02, null, M, null);
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

    public void setAsNewBotForumTopic(boolean z10) {
        this.c.setText(gd.N0(z10 ? 2131745239 : 2131745238, null));
        org.telegram.ui.Components.p9 p9Var = this.a;
        p9Var.setAnimatedEmojiDrawable(null);
        qg.a aVar = new qg.a(qg.a.k[0]);
        t70 t70Var = new t70(1, null);
        t70Var.a("");
        t70Var.i = 1.8f;
        lq lqVar = new lq(aVar, t70Var, 0, 0);
        lqVar.x = true;
        p9Var.setImageDrawable(lqVar);
    }
}
