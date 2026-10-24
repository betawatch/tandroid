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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.sl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.yq;
import org.telegram.ui.n91;
import org.telegram.ui.r91;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public abstract class b8 extends FrameLayout {
    public final z7 a;
    public final a8 b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final Paint h;
    public final org.telegram.ui.Components.h9 n;
    public final ci.x7 r;
    public final org.telegram.ui.ActionBar.g6 s;
    public r91 v;
    public final TLRPC.ChatFull w;
    public boolean x;

    public b8(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.h = new Paint(1);
        this.n = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.g6) null);
        this.r = new ci.x7(null, false);
        this.w = chatFull;
        this.s = g6Var;
        z7 z7Var = new z7(this, context, g6Var);
        this.a = z7Var;
        setClipChildren(false);
        boolean z10 = LocaleController.isRTL;
        addView(z7Var, w7.z5.d(46, 46.0f, (!z10 ? 8388611 : 8388613) | 16, !z10 ? 12.0f : 16.0f, 0.0f, !z10 ? 16.0f : 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout e = sl.e(context, 0);
        a8 a8Var = new a8(context);
        this.b = a8Var;
        NotificationCenter.listenEmojiLoading(a8Var);
        a8Var.setTypeface(AndroidUtilities.bold());
        a8Var.setTextSize(16);
        a8Var.setMaxLines(1);
        a8Var.setTextColor(-16777216);
        a8Var.setGravity(LocaleController.isRTL ? 5 : 3);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (LocaleController.isRTL) {
            e.addView(textView, w7.z5.q(-2, -2, 80));
            e.addView(a8Var, w7.z5.p(0, -2, 1.0f, 0, 16, 0, 0, 0));
        } else {
            e.addView(a8Var, w7.z5.p(0, -2, 1.0f, 0, 0, 0, 16, 0));
            e.addView(textView, w7.z5.q(-2, -2, 80));
        }
        linearLayout.addView(e, w7.z5.d(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
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
        LinearLayout e7 = sl.e(context, 0);
        if (LocaleController.isRTL) {
            e7.addView(textView3, w7.z5.t(-2, -2, 16, 0, 0, 10, 0));
            e7.addView(textView4, w7.z5.q(-2, -2, 16));
            e7.addView(textView2, w7.z5.p(0, -2, 1.0f, 0, 8, 0, 0, 0));
        } else {
            e7.addView(textView2, w7.z5.p(0, -2, 1.0f, 0, 0, 0, 8, 0));
            e7.addView(textView4, w7.z5.q(-2, -2, 16));
            e7.addView(textView3, w7.z5.t(-2, -2, 16, 10, 0, 0, 0));
        }
        linearLayout.addView(e7, w7.z5.d(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z11 = LocaleController.isRTL;
        addView(linearLayout, w7.z5.d(-1, -2.0f, 0, !z11 ? 72.0f : 18.0f, 0.0f, !z11 ? 18.0f : 72.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.Z(a8Var, i10, null);
        org.telegram.ui.ActionBar.r6.W(textView, i10, null);
        int i11 = org.telegram.ui.ActionBar.k6.A6;
        org.telegram.ui.ActionBar.r6.W(textView2, i11, null);
        org.telegram.ui.ActionBar.r6.W(textView3, i11, null);
        org.telegram.ui.ActionBar.r6.W(textView4, i11, null);
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.z(textView4, mutate, i11, null, mode);
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        org.telegram.ui.ActionBar.r6.z(textView3, mutate2, i11, null, mode);
        yq yqVar = new yq(null, mutate, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        yqVar.h = intrinsicWidth;
        yqVar.n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(yqVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        yq yqVar2 = new yq(null, mutate2, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        yqVar2.h = intrinsicWidth2;
        yqVar2.n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(yqVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.x) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d7, this.s);
            Paint paint = this.h;
            paint.setColor(w02);
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

    public r91 getPostInfo() {
        return this.v;
    }

    public ci.x7 getStoryAvatarParams() {
        return this.r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.g();
    }

    public void setData(n91 n91Var) {
        TLRPC.User user = n91Var.a;
        org.telegram.ui.Components.h9 h9Var = this.n;
        h9Var.r(user);
        TLRPC.User user2 = n91Var.a;
        z7 z7Var = this.a;
        z7Var.e(user2, h9Var);
        z7Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        this.b.k(n91Var.a.first_name);
        this.e.setText(n91Var.b);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
