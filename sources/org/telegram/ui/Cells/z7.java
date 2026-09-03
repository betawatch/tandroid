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
import org.telegram.ui.Components.mq;
import org.telegram.ui.ha1;
import org.telegram.ui.la1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class z7 extends FrameLayout {
    public final x7 a;
    public final y7 b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final Paint h;
    public final org.telegram.ui.Components.z8 n;
    public final nh.i7 r;
    public final org.telegram.ui.ActionBar.f6 s;
    public la1 v;
    public final TLRPC.ChatFull w;
    public boolean x;

    public z7(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.h = new Paint(1);
        this.n = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        this.r = new nh.i7(null, false);
        this.w = chatFull;
        this.s = f6Var;
        x7 x7Var = new x7(this, context, f6Var);
        this.a = x7Var;
        setClipChildren(false);
        boolean z4 = LocaleController.isRTL;
        addView(x7Var, k7.b6.d(46, 46.0f, (!z4 ? 8388611 : 8388613) | 16, !z4 ? 12.0f : 16.0f, 0.0f, !z4 ? 16.0f : 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 0);
        y7 y7Var = new y7(context);
        this.b = y7Var;
        NotificationCenter.listenEmojiLoading(y7Var);
        y7Var.setTypeface(AndroidUtilities.bold());
        y7Var.setTextSize(16);
        y7Var.setMaxLines(1);
        y7Var.setTextColor(-16777216);
        y7Var.setGravity(LocaleController.isRTL ? 5 : 3);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (LocaleController.isRTL) {
            f10.addView(textView, k7.b6.q(-2, -2, 80));
            f10.addView(y7Var, k7.b6.p(0, -2, 1.0f, 0, 16, 0, 0, 0));
        } else {
            f10.addView(y7Var, k7.b6.p(0, -2, 1.0f, 0, 0, 0, 16, 0));
            f10.addView(textView, k7.b6.q(-2, -2, 80));
        }
        linearLayout.addView(f10, k7.b6.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
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
        LinearLayout f11 = org.telegram.messenger.y3.f(context, 0);
        if (LocaleController.isRTL) {
            f11.addView(textView3, k7.b6.t(-2, -2, 16, 0, 0, 10, 0));
            f11.addView(textView4, k7.b6.q(-2, -2, 16));
            f11.addView(textView2, k7.b6.p(0, -2, 1.0f, 0, 8, 0, 0, 0));
        } else {
            f11.addView(textView2, k7.b6.p(0, -2, 1.0f, 0, 0, 0, 8, 0));
            f11.addView(textView4, k7.b6.q(-2, -2, 16));
            f11.addView(textView3, k7.b6.t(-2, -2, 16, 10, 0, 0, 0));
        }
        linearLayout.addView(f11, k7.b6.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z10 = LocaleController.isRTL;
        addView(linearLayout, k7.b6.d(-1, -2.0f, 0, !z10 ? 72.0f : 18.0f, 0.0f, !z10 ? 18.0f : 72.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        y7Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.j6.A6;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        mutate.setTint(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        mutate2.setTint(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        mq mqVar = new mq(null, mutate, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        mqVar.h = intrinsicWidth;
        mqVar.n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(mqVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        mq mqVar2 = new mq(null, mutate2, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        mqVar2.h = intrinsicWidth2;
        mqVar2.n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(mqVar2, (Drawable) null, (Drawable) null, (Drawable) null);
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

    public org.telegram.ui.Components.p9 getImageView() {
        return this.a;
    }

    public la1 getPostInfo() {
        return this.v;
    }

    public nh.i7 getStoryAvatarParams() {
        return this.r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.g();
    }

    public void setData(ha1 ha1Var) {
        TLRPC.User user = ha1Var.a;
        org.telegram.ui.Components.z8 z8Var = this.n;
        z8Var.r(user);
        TLRPC.User user2 = ha1Var.a;
        x7 x7Var = this.a;
        x7Var.e(user2, z8Var);
        x7Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        this.b.k(ha1Var.a.first_name);
        this.e.setText(ha1Var.b);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
