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
import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;
import org.telegram.ui.n61;
import org.telegram.ui.r61;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class a8 extends FrameLayout {
    public final y7 a;
    public final z7 b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final Paint h;
    public final org.telegram.ui.Components.r8 n;
    public final th.t5 r;
    public final org.telegram.ui.ActionBar.p6 s;
    public r61 w;
    public final TLRPC.ChatFull x;
    public boolean y;

    public a8(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.h = new Paint(1);
        this.n = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.r = new th.t5(null, false);
        this.x = chatFull;
        this.s = p6Var;
        y7 y7Var = new y7(this, context, p6Var);
        this.a = y7Var;
        setClipChildren(false);
        boolean z10 = cd.X;
        addView(y7Var, w7.b6.d(46, 46.0f, (!z10 ? 8388611 : 8388613) | 16, !z10 ? 12.0f : 16.0f, 0.0f, !z10 ? 16.0f : 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 0);
        z7 z7Var = new z7(context);
        this.b = z7Var;
        zs.i(z7Var);
        z7Var.setTypeface(org.telegram.messenger.i0.o());
        z7Var.setTextSize(16);
        z7Var.setMaxLines(1);
        z7Var.setTextColor(-16777216);
        z7Var.setGravity(cd.X ? 5 : 3);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (cd.X) {
            f7.addView(textView, w7.b6.r(-2, -2, 80));
            f7.addView(z7Var, w7.b6.q(0, -2, 1.0f, 0, 16, 0, 0, 0));
        } else {
            f7.addView(z7Var, w7.b6.q(0, -2, 1.0f, 0, 0, 0, 16, 0));
            f7.addView(textView, w7.b6.r(-2, -2, 80));
        }
        linearLayout.addView(f7, w7.b6.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
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
        LinearLayout f10 = org.telegram.messenger.m5.f(context, 0);
        if (cd.X) {
            f10.addView(textView3, w7.b6.t(-2, -2, 16, 0, 0, 10, 0));
            f10.addView(textView4, w7.b6.r(-2, -2, 16));
            f10.addView(textView2, w7.b6.q(0, -2, 1.0f, 0, 8, 0, 0, 0));
        } else {
            f10.addView(textView2, w7.b6.q(0, -2, 1.0f, 0, 0, 0, 8, 0));
            f10.addView(textView4, w7.b6.r(-2, -2, 16));
            f10.addView(textView3, w7.b6.t(-2, -2, 16, 10, 0, 0, 0));
        }
        linearLayout.addView(f10, w7.b6.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z11 = cd.X;
        addView(linearLayout, w7.b6.d(-1, -2.0f, 0, !z11 ? 72.0f : 18.0f, 0.0f, !z11 ? 18.0f : 72.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.Y(z7Var, i10, null);
        org.telegram.ui.ActionBar.a7.V(textView, i10, null);
        int i11 = org.telegram.ui.ActionBar.t6.A6;
        org.telegram.ui.ActionBar.a7.V(textView2, i11, null);
        org.telegram.ui.ActionBar.a7.V(textView3, i11, null);
        org.telegram.ui.ActionBar.a7.V(textView4, i11, null);
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.a7.y(textView4, mutate, i11, null, mode);
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        org.telegram.ui.ActionBar.a7.y(textView3, mutate2, i11, null, mode);
        eq eqVar = new eq(null, mutate, 0, org.telegram.messenger.i0.L(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        eqVar.h = intrinsicWidth;
        eqVar.n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(eqVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(org.telegram.messenger.i0.L(2.0f));
        eq eqVar2 = new eq(null, mutate2, 0, org.telegram.messenger.i0.L(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        eqVar2.h = intrinsicWidth2;
        eqVar2.n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(eqVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(org.telegram.messenger.i0.L(2.0f));
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.y) {
            int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d7, this.s);
            Paint paint = this.h;
            paint.setColor(w02);
            if (cd.X) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - org.telegram.messenger.i0.L(72), getHeight(), paint);
            } else {
                canvas.drawRect(org.telegram.messenger.i0.L(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.g9 getImageView() {
        return this.a;
    }

    public r61 getPostInfo() {
        return this.w;
    }

    public th.t5 getStoryAvatarParams() {
        return this.r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.g();
    }

    public void setData(n61 n61Var) {
        TLRPC.User user = n61Var.a;
        org.telegram.ui.Components.r8 r8Var = this.n;
        r8Var.r(user);
        TLRPC.User user2 = n61Var.a;
        y7 y7Var = this.a;
        y7Var.e(user2, r8Var);
        y7Var.setRoundRadius(org.telegram.messenger.i0.L(46.0f) >> 1);
        this.b.k(n61Var.a.first_name);
        this.e.setText(n61Var.b);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
