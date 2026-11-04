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
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.xp;
import org.telegram.ui.k41;
import org.telegram.ui.o41;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class v7 extends FrameLayout {
    public final t7 a;
    public final u7 b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final Paint h;
    public final org.telegram.ui.Components.u8 n;
    public final ei.o7 r;
    public final org.telegram.ui.ActionBar.e6 s;
    public o41 w;
    public final TLRPC.ChatFull x;
    public boolean y;

    public v7(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = new Paint(1);
        this.n = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.r = new ei.o7(null, false);
        this.x = chatFull;
        this.s = e6Var;
        t7 t7Var = new t7(this, context, e6Var);
        this.a = t7Var;
        setClipChildren(false);
        boolean z10 = bd.a0;
        addView(t7Var, mf.d(46, 46.0f, (!z10 ? 8388611 : 8388613) | 16, !z10 ? 12.0f : 16.0f, 0.0f, !z10 ? 16.0f : 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        u7 u7Var = new u7(context);
        this.b = u7Var;
        hs.i(u7Var);
        u7Var.setTypeface(org.telegram.messenger.g0.o());
        u7Var.setTextSize(16);
        u7Var.setMaxLines(1);
        u7Var.setTextColor(-16777216);
        u7Var.setGravity(bd.a0 ? 5 : 3);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (bd.a0) {
            f10.addView(textView, mf.r(-2, -2, 80));
            f10.addView(u7Var, mf.q(0, -2, 1.0f, 0, 16, 0, 0, 0));
        } else {
            f10.addView(u7Var, mf.q(0, -2, 1.0f, 0, 0, 0, 16, 0));
            f10.addView(textView, mf.r(-2, -2, 80));
        }
        linearLayout.addView(f10, mf.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
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
        if (bd.a0) {
            f11.addView(textView3, mf.t(-2, -2, 16, 0, 0, 10, 0));
            f11.addView(textView4, mf.r(-2, -2, 16));
            f11.addView(textView2, mf.q(0, -2, 1.0f, 0, 8, 0, 0, 0));
        } else {
            f11.addView(textView2, mf.q(0, -2, 1.0f, 0, 0, 0, 8, 0));
            f11.addView(textView4, mf.r(-2, -2, 16));
            f11.addView(textView3, mf.t(-2, -2, 16, 10, 0, 0, 0));
        }
        linearLayout.addView(f11, mf.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z11 = bd.a0;
        addView(linearLayout, mf.d(-1, -2.0f, 0, !z11 ? 72.0f : 18.0f, 0.0f, !z11 ? 18.0f : 72.0f, 0.0f));
        int i3 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.Y(u7Var, i3, null);
        org.telegram.ui.ActionBar.r6.V(textView, i3, null);
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
            if (bd.a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(72), getHeight(), paint);
            } else {
                canvas.drawRect(org.telegram.messenger.g0.L(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.k9 getImageView() {
        return this.a;
    }

    public o41 getPostInfo() {
        return this.w;
    }

    public ei.o7 getStoryAvatarParams() {
        return this.r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.g();
    }

    public void setData(k41 k41Var) {
        TLRPC.User user = k41Var.a;
        org.telegram.ui.Components.u8 u8Var = this.n;
        u8Var.r(user);
        TLRPC.User user2 = k41Var.a;
        t7 t7Var = this.a;
        t7Var.e(user2, u8Var);
        t7Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f) >> 1);
        this.b.k(k41Var.a.first_name);
        this.e.setText(k41Var.b);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
