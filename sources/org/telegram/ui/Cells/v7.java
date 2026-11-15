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
import org.telegram.messenger.ns;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fq;
import org.telegram.ui.s41;
import org.telegram.ui.w41;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class v7 extends FrameLayout {
    public final t7 a;
    public final u7 b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final Paint h;
    public final org.telegram.ui.Components.t8 n;
    public final fi.h7 r;
    public final org.telegram.ui.ActionBar.e6 s;
    public w41 w;
    public final TLRPC.ChatFull x;
    public boolean y;

    public v7(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.h = new Paint(1);
        this.n = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.r = new fi.h7(null, false);
        this.x = chatFull;
        this.s = e6Var;
        t7 t7Var = new t7(this, context, e6Var);
        this.a = t7Var;
        setClipChildren(false);
        boolean z10 = hd.a0;
        addView(t7Var, c8.ja.d(46, 46.0f, (!z10 ? 8388611 : 8388613) | 16, !z10 ? 12.0f : 16.0f, 0.0f, !z10 ? 16.0f : 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 0);
        u7 u7Var = new u7(context);
        this.b = u7Var;
        ns.i(u7Var);
        u7Var.setTypeface(org.telegram.messenger.g0.o());
        u7Var.setTextSize(16);
        u7Var.setMaxLines(1);
        u7Var.setTextColor(-16777216);
        u7Var.setGravity(hd.a0 ? 5 : 3);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (hd.a0) {
            f10.addView(textView, c8.ja.r(-2, -2, 80));
            f10.addView(u7Var, c8.ja.q(0, -2, 1.0f, 0, 16, 0, 0, 0));
        } else {
            f10.addView(u7Var, c8.ja.q(0, -2, 1.0f, 0, 0, 0, 16, 0));
            f10.addView(textView, c8.ja.r(-2, -2, 80));
        }
        linearLayout.addView(f10, c8.ja.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
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
            f11.addView(textView3, c8.ja.t(-2, -2, 16, 0, 0, 10, 0));
            f11.addView(textView4, c8.ja.r(-2, -2, 16));
            f11.addView(textView2, c8.ja.q(0, -2, 1.0f, 0, 8, 0, 0, 0));
        } else {
            f11.addView(textView2, c8.ja.q(0, -2, 1.0f, 0, 0, 0, 8, 0));
            f11.addView(textView4, c8.ja.r(-2, -2, 16));
            f11.addView(textView3, c8.ja.t(-2, -2, 16, 10, 0, 0, 0));
        }
        linearLayout.addView(f11, c8.ja.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z11 = hd.a0;
        addView(linearLayout, c8.ja.d(-1, -2.0f, 0, !z11 ? 72.0f : 18.0f, 0.0f, !z11 ? 18.0f : 72.0f, 0.0f));
        int i7 = org.telegram.ui.ActionBar.j6.j5;
        org.telegram.ui.ActionBar.q6.X(u7Var, i7, null);
        org.telegram.ui.ActionBar.q6.U(textView, i7, null);
        int i10 = org.telegram.ui.ActionBar.j6.A6;
        org.telegram.ui.ActionBar.q6.U(textView2, i10, null);
        org.telegram.ui.ActionBar.q6.U(textView3, i10, null);
        org.telegram.ui.ActionBar.q6.U(textView4, i10, null);
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.q6.x(textView4, mutate, i10, null, mode);
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        org.telegram.ui.ActionBar.q6.x(textView3, mutate2, i10, null, mode);
        fq fqVar = new fq(null, mutate, 0, org.telegram.messenger.g0.L(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        fqVar.h = intrinsicWidth;
        fqVar.n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(fqVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        fq fqVar2 = new fq(null, mutate2, 0, org.telegram.messenger.g0.L(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        fqVar2.h = intrinsicWidth2;
        fqVar2.n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(fqVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(org.telegram.messenger.g0.L(2.0f));
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.y) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.d7, this.s);
            Paint paint = this.h;
            paint.setColor(w02);
            if (hd.a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.g0.L(72), getHeight(), paint);
            } else {
                canvas.drawRect(org.telegram.messenger.g0.L(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.i9 getImageView() {
        return this.a;
    }

    public w41 getPostInfo() {
        return this.w;
    }

    public fi.h7 getStoryAvatarParams() {
        return this.r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.g();
    }

    public void setData(s41 s41Var) {
        TLRPC.User user = s41Var.a;
        org.telegram.ui.Components.t8 t8Var = this.n;
        t8Var.r(user);
        TLRPC.User user2 = s41Var.a;
        t7 t7Var = this.a;
        t7Var.f(user2, t8Var);
        t7Var.setRoundRadius(org.telegram.messenger.g0.L(46.0f) >> 1);
        this.b.k(s41Var.a.first_name);
        this.e.setText(s41Var.b);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
