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
import org.telegram.messenger.hd;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xp;
import org.telegram.ui.v41;
import org.telegram.ui.z41;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class w7 extends FrameLayout {
    public final u7 a;
    public final v7 b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final Paint h;
    public final org.telegram.ui.Components.w8 n;
    public final di.n7 r;
    public final org.telegram.ui.ActionBar.f6 s;
    public z41 w;
    public final TLRPC.ChatFull x;
    public boolean y;

    public w7(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = new Paint(1);
        this.n = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        this.r = new di.n7(null, false);
        this.x = chatFull;
        this.s = f6Var;
        u7 u7Var = new u7(this, context, f6Var);
        this.a = u7Var;
        setClipChildren(false);
        boolean z9 = hd.a0;
        addView(u7Var, c8.ha.d(46, 46.0f, (!z9 ? 8388611 : 8388613) | 16, !z9 ? 12.0f : 16.0f, 0.0f, !z9 ? 16.0f : 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        v7 v7Var = new v7(context);
        this.b = v7Var;
        qs.i(v7Var);
        v7Var.setTypeface(org.telegram.messenger.g0.o());
        v7Var.setTextSize(16);
        v7Var.setMaxLines(1);
        v7Var.setTextColor(-16777216);
        v7Var.setGravity(hd.a0 ? 5 : 3);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (hd.a0) {
            f10.addView(textView, c8.ha.r(-2, -2, 80));
            f10.addView(v7Var, c8.ha.q(0, -2, 1.0f, 0, 16, 0, 0, 0));
        } else {
            f10.addView(v7Var, c8.ha.q(0, -2, 1.0f, 0, 0, 0, 16, 0));
            f10.addView(textView, c8.ha.r(-2, -2, 80));
        }
        linearLayout.addView(f10, c8.ha.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
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
        LinearLayout f11 = org.telegram.messenger.k5.f(context, 0);
        if (hd.a0) {
            f11.addView(textView3, c8.ha.t(-2, -2, 16, 0, 0, 10, 0));
            f11.addView(textView4, c8.ha.r(-2, -2, 16));
            f11.addView(textView2, c8.ha.q(0, -2, 1.0f, 0, 8, 0, 0, 0));
        } else {
            f11.addView(textView2, c8.ha.q(0, -2, 1.0f, 0, 0, 0, 8, 0));
            f11.addView(textView4, c8.ha.r(-2, -2, 16));
            f11.addView(textView3, c8.ha.t(-2, -2, 16, 10, 0, 0, 0));
        }
        linearLayout.addView(f11, c8.ha.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z10 = hd.a0;
        addView(linearLayout, c8.ha.d(-1, -2.0f, 0, !z10 ? 72.0f : 18.0f, 0.0f, !z10 ? 18.0f : 72.0f, 0.0f));
        int i7 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.Y(v7Var, i7, null);
        org.telegram.ui.ActionBar.r6.V(textView, i7, null);
        int i10 = org.telegram.ui.ActionBar.k6.A6;
        org.telegram.ui.ActionBar.r6.V(textView2, i10, null);
        org.telegram.ui.ActionBar.r6.V(textView3, i10, null);
        org.telegram.ui.ActionBar.r6.V(textView4, i10, null);
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.y(textView4, mutate, i10, null, mode);
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        org.telegram.ui.ActionBar.r6.y(textView3, mutate2, i10, null, mode);
        xp xpVar = new xp(null, mutate, 0, org.telegram.messenger.g0.L(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        xpVar.h = intrinsicWidth;
        xpVar.n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(xpVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        xp xpVar2 = new xp(null, mutate2, 0, org.telegram.messenger.g0.L(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        xpVar2.h = intrinsicWidth2;
        xpVar2.n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(xpVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.y) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d7, this.s);
            Paint paint = this.h;
            paint.setColor(w02);
            if (hd.a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(72), getHeight(), paint);
            } else {
                canvas.drawRect(org.telegram.messenger.g0.L(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.l9 getImageView() {
        return this.a;
    }

    public z41 getPostInfo() {
        return this.w;
    }

    public di.n7 getStoryAvatarParams() {
        return this.r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.g();
    }

    public void setData(v41 v41Var) {
        TLRPC.User user = v41Var.a;
        org.telegram.ui.Components.w8 w8Var = this.n;
        w8Var.r(user);
        TLRPC.User user2 = v41Var.a;
        u7 u7Var = this.a;
        u7Var.e(user2, w8Var);
        u7Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f) >> 1);
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
