package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.vq;
import org.telegram.ui.cb1;
import org.telegram.ui.ya1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class d8 extends FrameLayout {
    public final b8 a;
    public final c8 b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final Paint h;
    public final org.telegram.ui.Components.g9 n;
    public final zh.x5 r;
    public final org.telegram.ui.ActionBar.f6 s;
    public cb1 v;
    public final TLRPC.ChatFull w;
    public boolean x;

    public d8(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = new Paint(1);
        this.n = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
        this.r = new zh.x5(null, false);
        this.w = chatFull;
        this.s = f6Var;
        b8 b8Var = new b8(this, context, f6Var);
        this.a = b8Var;
        setClipChildren(false);
        boolean z10 = LocaleController.isRTL;
        addView(b8Var, w7.a6.d(46, 46.0f, (!z10 ? 8388611 : 8388613) | 16, !z10 ? 12.0f : 16.0f, 0.0f, !z10 ? 16.0f : 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f7 = em.f(context, 0);
        c8 c8Var = new c8(context);
        this.b = c8Var;
        NotificationCenter.listenEmojiLoading(c8Var);
        c8Var.setTypeface(AndroidUtilities.bold());
        c8Var.setTextSize(16);
        c8Var.setMaxLines(1);
        c8Var.setTextColor(-16777216);
        c8Var.setGravity(LocaleController.isRTL ? 5 : 3);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (LocaleController.isRTL) {
            f7.addView(textView, w7.a6.q(-2, -2, 80));
            f7.addView(c8Var, w7.a6.p(0, -2, 1.0f, 0, 16, 0, 0, 0));
        } else {
            f7.addView(c8Var, w7.a6.p(0, -2, 1.0f, 0, 0, 0, 16, 0));
            f7.addView(textView, w7.a6.q(-2, -2, 80));
        }
        linearLayout.addView(f7, w7.a6.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
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
        LinearLayout f10 = em.f(context, 0);
        if (LocaleController.isRTL) {
            f10.addView(textView3, w7.a6.t(-2, -2, 16, 0, 0, 10, 0));
            f10.addView(textView4, w7.a6.q(-2, -2, 16));
            f10.addView(textView2, w7.a6.p(0, -2, 1.0f, 0, 8, 0, 0, 0));
        } else {
            f10.addView(textView2, w7.a6.p(0, -2, 1.0f, 0, 0, 0, 8, 0));
            f10.addView(textView4, w7.a6.q(-2, -2, 16));
            f10.addView(textView3, w7.a6.t(-2, -2, 16, 10, 0, 0, 0));
        }
        linearLayout.addView(f10, w7.a6.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z11 = LocaleController.isRTL;
        addView(linearLayout, w7.a6.d(-1, -2.0f, 0, !z11 ? 72.0f : 18.0f, 0.0f, !z11 ? 18.0f : 72.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        c8Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.j6.A6;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        mutate.setTint(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        mutate2.setTint(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        vq vqVar = new vq(null, mutate, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        vqVar.h = intrinsicWidth;
        vqVar.n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(vqVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        vq vqVar2 = new vq(null, mutate2, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        vqVar2.h = intrinsicWidth2;
        vqVar2.n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(vqVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.x) {
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, this.s);
            Paint paint = this.h;
            paint.setColor(v02);
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(72), getHeight(), paint);
            } else {
                canvas.drawRect(AndroidUtilities.dp(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.w9 getImageView() {
        return this.a;
    }

    public cb1 getPostInfo() {
        return this.v;
    }

    public zh.x5 getStoryAvatarParams() {
        return this.r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.g();
    }

    public void setData(ya1 ya1Var) {
        TLRPC.User user = ya1Var.a;
        org.telegram.ui.Components.g9 g9Var = this.n;
        g9Var.r(user);
        TLRPC.User user2 = ya1Var.a;
        b8 b8Var = this.a;
        b8Var.e(user2, g9Var);
        b8Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        this.b.k(ya1Var.a.first_name);
        this.e.setText(ya1Var.b);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
