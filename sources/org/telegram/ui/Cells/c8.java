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
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.oq;
import org.telegram.ui.ua1;
import org.telegram.ui.ya1;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public abstract class c8 extends FrameLayout {
    public final a8 a;
    public final b8 b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final Paint h;
    public final org.telegram.ui.Components.i9 n;
    public final bi.j9 r;
    public final org.telegram.ui.ActionBar.f6 s;
    public ya1 v;
    public final TLRPC.ChatFull w;
    public boolean x;

    public c8(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = new Paint(1);
        this.n = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        this.r = new bi.j9(null, false);
        this.w = chatFull;
        this.s = f6Var;
        a8 a8Var = new a8(this, context, f6Var);
        this.a = a8Var;
        setClipChildren(false);
        boolean z10 = LocaleController.isRTL;
        addView(a8Var, w7.x5.d(46, 46.0f, (!z10 ? 8388611 : 8388613) | 16, !z10 ? 12.0f : 16.0f, 0.0f, !z10 ? 16.0f : 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f7 = vl.f(context, 0);
        b8 b8Var = new b8(context);
        this.b = b8Var;
        NotificationCenter.listenEmojiLoading(b8Var);
        b8Var.setTypeface(AndroidUtilities.bold());
        b8Var.setTextSize(16);
        b8Var.setMaxLines(1);
        b8Var.setTextColor(-16777216);
        b8Var.setGravity(LocaleController.isRTL ? 5 : 3);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (LocaleController.isRTL) {
            f7.addView(textView, w7.x5.q(-2, -2, 80));
            f7.addView(b8Var, w7.x5.p(0, -2, 1.0f, 0, 16, 0, 0, 0));
        } else {
            f7.addView(b8Var, w7.x5.p(0, -2, 1.0f, 0, 0, 0, 16, 0));
            f7.addView(textView, w7.x5.q(-2, -2, 80));
        }
        linearLayout.addView(f7, w7.x5.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
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
        LinearLayout f10 = vl.f(context, 0);
        if (LocaleController.isRTL) {
            f10.addView(textView3, w7.x5.t(-2, -2, 16, 0, 0, 10, 0));
            f10.addView(textView4, w7.x5.q(-2, -2, 16));
            f10.addView(textView2, w7.x5.p(0, -2, 1.0f, 0, 8, 0, 0, 0));
        } else {
            f10.addView(textView2, w7.x5.p(0, -2, 1.0f, 0, 0, 0, 8, 0));
            f10.addView(textView4, w7.x5.q(-2, -2, 16));
            f10.addView(textView3, w7.x5.t(-2, -2, 16, 10, 0, 0, 0));
        }
        linearLayout.addView(f10, w7.x5.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z11 = LocaleController.isRTL;
        addView(linearLayout, w7.x5.d(-1, -2.0f, 0, !z11 ? 72.0f : 18.0f, 0.0f, !z11 ? 18.0f : 72.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        b8Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.j6.A6;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        mutate.setTint(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        mutate2.setTint(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        oq oqVar = new oq(null, mutate, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        oqVar.h = intrinsicWidth;
        oqVar.n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(oqVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        oq oqVar2 = new oq(null, mutate2, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        oqVar2.h = intrinsicWidth2;
        oqVar2.n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(oqVar2, (Drawable) null, (Drawable) null, (Drawable) null);
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

    public org.telegram.ui.Components.x9 getImageView() {
        return this.a;
    }

    public ya1 getPostInfo() {
        return this.v;
    }

    public bi.j9 getStoryAvatarParams() {
        return this.r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.g();
    }

    public void setData(ua1 ua1Var) {
        TLRPC.User user = ua1Var.a;
        org.telegram.ui.Components.i9 i9Var = this.n;
        i9Var.r(user);
        TLRPC.User user2 = ua1Var.a;
        a8 a8Var = this.a;
        a8Var.e(user2, i9Var);
        a8Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        this.b.k(ua1Var.a.first_name);
        this.e.setText(ua1Var.b);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
