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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dq;
import org.telegram.ui.j91;
import org.telegram.ui.n91;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class x7 extends FrameLayout {
    public final v7 a;
    public final w7 b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final Paint h;
    public final org.telegram.ui.Components.y8 n;
    public final jh.h7 r;
    public final org.telegram.ui.ActionBar.c6 s;
    public n91 v;
    public final TLRPC.ChatFull w;
    public boolean x;

    public x7(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.h = new Paint(1);
        this.n = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        this.r = new jh.h7(null, false);
        this.w = chatFull;
        this.s = c6Var;
        v7 v7Var = new v7(this, context, c6Var);
        this.a = v7Var;
        setClipChildren(false);
        boolean z10 = LocaleController.isRTL;
        addView(v7Var, h7.z5.d(46, 46.0f, (!z10 ? 8388611 : 8388613) | 16, !z10 ? 12.0f : 16.0f, 0.0f, !z10 ? 16.0f : 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout g10 = org.telegram.messenger.y1.g(context, 0);
        w7 w7Var = new w7(context);
        this.b = w7Var;
        NotificationCenter.listenEmojiLoading(w7Var);
        w7Var.setTypeface(AndroidUtilities.bold());
        w7Var.setTextSize(16);
        w7Var.setMaxLines(1);
        w7Var.setTextColor(-16777216);
        w7Var.setGravity(LocaleController.isRTL ? 5 : 3);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (LocaleController.isRTL) {
            g10.addView(textView, h7.z5.q(-2, -2, 80));
            g10.addView(w7Var, h7.z5.p(0, -2, 1.0f, 0, 16, 0, 0, 0));
        } else {
            g10.addView(w7Var, h7.z5.p(0, -2, 1.0f, 0, 0, 0, 16, 0));
            g10.addView(textView, h7.z5.q(-2, -2, 80));
        }
        linearLayout.addView(g10, h7.z5.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
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
        LinearLayout g11 = org.telegram.messenger.y1.g(context, 0);
        if (LocaleController.isRTL) {
            g11.addView(textView3, h7.z5.t(-2, -2, 16, 0, 0, 10, 0));
            g11.addView(textView4, h7.z5.q(-2, -2, 16));
            g11.addView(textView2, h7.z5.p(0, -2, 1.0f, 0, 8, 0, 0, 0));
        } else {
            g11.addView(textView2, h7.z5.p(0, -2, 1.0f, 0, 0, 0, 8, 0));
            g11.addView(textView4, h7.z5.q(-2, -2, 16));
            g11.addView(textView3, h7.z5.t(-2, -2, 16, 10, 0, 0, 0));
        }
        linearLayout.addView(g11, h7.z5.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z11 = LocaleController.isRTL;
        addView(linearLayout, h7.z5.d(-1, -2.0f, 0, !z11 ? 72.0f : 18.0f, 0.0f, !z11 ? 18.0f : 72.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.g6.j5;
        w7Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.g6.A6;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        mutate.setTint(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        mutate2.setTint(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        dq dqVar = new dq(null, mutate, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        dqVar.h = intrinsicWidth;
        dqVar.n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(dqVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        dq dqVar2 = new dq(null, mutate2, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        dqVar2.h = intrinsicWidth2;
        dqVar2.n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(dqVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.x) {
            int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d7, this.s);
            Paint paint = this.h;
            paint.setColor(v02);
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(72), getHeight(), paint);
            } else {
                canvas.drawRect(AndroidUtilities.dp(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.n9 getImageView() {
        return this.a;
    }

    public n91 getPostInfo() {
        return this.v;
    }

    public jh.h7 getStoryAvatarParams() {
        return this.r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.g();
    }

    public void setData(j91 j91Var) {
        TLRPC.User user = j91Var.a;
        org.telegram.ui.Components.y8 y8Var = this.n;
        y8Var.r(user);
        TLRPC.User user2 = j91Var.a;
        v7 v7Var = this.a;
        v7Var.e(user2, y8Var);
        v7Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        this.b.k(j91Var.a.first_name);
        this.e.setText(j91Var.b);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
