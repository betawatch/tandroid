package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mq;
import org.telegram.ui.v41;
import org.telegram.ui.z41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class x7 extends FrameLayout {
    public final v7 a;
    public final w7 b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final Paint h;
    public final org.telegram.ui.Components.b9 n;
    public final fi.e7 r;
    public final org.telegram.ui.ActionBar.i6 s;
    public z41 w;
    public final TLRPC.ChatFull x;
    public boolean y;

    public x7(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.h = new Paint(1);
        this.n = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        this.r = new fi.e7(null, false);
        this.x = chatFull;
        this.s = i6Var;
        v7 v7Var = new v7(this, context, i6Var);
        this.a = v7Var;
        setClipChildren(false);
        boolean z10 = gd.a0;
        addView(v7Var, c8.ma.d(46, 46.0f, (!z10 ? 8388611 : 8388613) | 16, !z10 ? 12.0f : 16.0f, 0.0f, !z10 ? 16.0f : 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 0);
        w7 w7Var = new w7(context);
        this.b = w7Var;
        ks.i(w7Var);
        w7Var.setTypeface(org.telegram.messenger.g0.o());
        w7Var.setTextSize(16);
        w7Var.setMaxLines(1);
        w7Var.setTextColor(-16777216);
        w7Var.setGravity(gd.a0 ? 5 : 3);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (gd.a0) {
            g10.addView(textView, c8.ma.r(-2, -2, 80));
            g10.addView(w7Var, c8.ma.q(0, -2, 1.0f, 0, 16, 0, 0, 0));
        } else {
            g10.addView(w7Var, c8.ma.q(0, -2, 1.0f, 0, 0, 0, 16, 0));
            g10.addView(textView, c8.ma.r(-2, -2, 80));
        }
        linearLayout.addView(g10, c8.ma.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setTextColor(-16777216);
        textView2.setLines(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView3 = new TextView(context);
        this.d = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(-16777216);
        textView3.setGravity(16);
        TextView textView4 = new TextView(context);
        this.f = textView4;
        textView4.setTextSize(1, 13.0f);
        textView4.setTextColor(-16777216);
        textView4.setGravity(16);
        LinearLayout g11 = org.telegram.messenger.f3.g(context, 0);
        if (gd.a0) {
            g11.addView(textView3, c8.ma.t(-2, -2, 16, 0, 0, 10, 0));
            g11.addView(textView4, c8.ma.r(-2, -2, 16));
            g11.addView(textView2, c8.ma.q(0, -2, 1.0f, 0, 8, 0, 0, 0));
        } else {
            g11.addView(textView2, c8.ma.q(0, -2, 1.0f, 0, 0, 0, 8, 0));
            g11.addView(textView4, c8.ma.r(-2, -2, 16));
            g11.addView(textView3, c8.ma.t(-2, -2, 16, 10, 0, 0, 0));
        }
        linearLayout.addView(g11, c8.ma.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z11 = gd.a0;
        addView(linearLayout, c8.ma.d(-1, -2.0f, 0, !z11 ? 72.0f : 18.0f, 0.0f, !z11 ? 18.0f : 72.0f, 0.0f));
        int i7 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.u6.X(w7Var, i7, null);
        org.telegram.ui.ActionBar.u6.U(textView, i7, null);
        int i10 = org.telegram.ui.ActionBar.n6.A6;
        org.telegram.ui.ActionBar.u6.U(textView2, i10, null);
        org.telegram.ui.ActionBar.u6.U(textView3, i10, null);
        org.telegram.ui.ActionBar.u6.U(textView4, i10, null);
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.u6.x(textView4, mutate, i10, null, mode);
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        org.telegram.ui.ActionBar.u6.x(textView3, mutate2, i10, null, mode);
        mq mqVar = new mq(null, mutate, 0, org.telegram.messenger.g0.L(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        mqVar.h = intrinsicWidth;
        mqVar.n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(mqVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        mq mqVar2 = new mq(null, mutate2, 0, org.telegram.messenger.g0.L(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        mqVar2.h = intrinsicWidth2;
        mqVar2.n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(mqVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.y) {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.d7, this.s);
            Paint paint = this.h;
            paint.setColor(w02);
            if (gd.a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(72), getHeight(), paint);
            } else {
                canvas.drawRect(org.telegram.messenger.g0.L(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.q9 getImageView() {
        return this.a;
    }

    public z41 getPostInfo() {
        return this.w;
    }

    public fi.e7 getStoryAvatarParams() {
        return this.r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.g();
    }

    public void setData(v41 v41Var) {
        TLRPC.User user = v41Var.a;
        org.telegram.ui.Components.b9 b9Var = this.n;
        b9Var.r(user);
        TLRPC.User user2 = v41Var.a;
        v7 v7Var = this.a;
        v7Var.f(user2, b9Var);
        v7Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f) >> 1);
        this.b.k(v41Var.a.first_name);
        this.e.setText(v41Var.b);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
