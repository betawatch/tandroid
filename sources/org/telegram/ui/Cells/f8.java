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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.r91;
import org.telegram.ui.v91;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class f8 extends FrameLayout {
    public final d8 a;
    public final e8 b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final Paint h;
    public final org.telegram.ui.Components.j9 n;
    public final di.w7 r;
    public final org.telegram.ui.ActionBar.u6 s;
    public v91 v;
    public final TLRPC.ChatFull w;
    public boolean x;

    public f8(Context context, TLRPC.ChatFull chatFull, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.h = new Paint(1);
        this.n = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
        this.r = new di.w7(null, false);
        this.w = chatFull;
        this.s = u6Var;
        d8 d8Var = new d8(this, context, u6Var);
        this.a = d8Var;
        setClipChildren(false);
        boolean z10 = LocaleController.isRTL;
        addView(d8Var, kb1.h(46, 46.0f, (!z10 ? 8388611 : 8388613) | 16, !z10 ? 12.0f : 16.0f, 0.0f, !z10 ? 16.0f : 12.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout d = wh.d(context, 0);
        e8 e8Var = new e8(context);
        this.b = e8Var;
        NotificationCenter.listenEmojiLoading(e8Var);
        e8Var.setTypeface(AndroidUtilities.bold());
        e8Var.setTextSize(16);
        e8Var.setMaxLines(1);
        e8Var.setTextColor(-16777216);
        e8Var.setGravity(LocaleController.isRTL ? 5 : 3);
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-16777216);
        if (LocaleController.isRTL) {
            d.addView(textView, kb1.u(-2, -2, 80));
            d.addView(e8Var, kb1.t(0, -2, 1.0f, 0, 16, 0, 0, 0));
        } else {
            d.addView(e8Var, kb1.t(0, -2, 1.0f, 0, 0, 0, 16, 0));
            d.addView(textView, kb1.u(-2, -2, 80));
        }
        linearLayout.addView(d, kb1.h(-1, -2.0f, 8388659, 0.0f, 7.0f, 0.0f, 0.0f));
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
        LinearLayout d10 = wh.d(context, 0);
        if (LocaleController.isRTL) {
            d10.addView(textView3, kb1.x(-2, -2, 16, 0, 0, 10, 0));
            d10.addView(textView4, kb1.u(-2, -2, 16));
            d10.addView(textView2, kb1.t(0, -2, 1.0f, 0, 8, 0, 0, 0));
        } else {
            d10.addView(textView2, kb1.t(0, -2, 1.0f, 0, 0, 0, 8, 0));
            d10.addView(textView4, kb1.u(-2, -2, 16));
            d10.addView(textView3, kb1.x(-2, -2, 16, 10, 0, 0, 0));
        }
        linearLayout.addView(d10, kb1.h(-1, -2.0f, 8388659, 0.0f, 3.0f, 0.0f, 9.0f));
        boolean z11 = LocaleController.isRTL;
        addView(linearLayout, kb1.h(-1, -2.0f, 0, !z11 ? 72.0f : 18.0f, 0.0f, !z11 ? 18.0f : 72.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.f7.Y(e8Var, i10, null);
        org.telegram.ui.ActionBar.f7.V(textView, i10, null);
        int i11 = org.telegram.ui.ActionBar.y6.A6;
        org.telegram.ui.ActionBar.f7.V(textView2, i11, null);
        org.telegram.ui.ActionBar.f7.V(textView3, i11, null);
        org.telegram.ui.ActionBar.f7.V(textView4, i11, null);
        Drawable mutate = context.getDrawable(R.drawable.mini_stats_likes).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.f7.y(textView4, mutate, i11, null, mode);
        Drawable mutate2 = context.getDrawable(R.drawable.mini_stats_shares).mutate();
        org.telegram.ui.ActionBar.f7.y(textView3, mutate2, i11, null, mode);
        ar arVar = new ar(null, mutate, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth = mutate2.getIntrinsicWidth();
        int intrinsicHeight = mutate2.getIntrinsicHeight();
        arVar.h = intrinsicWidth;
        arVar.n = intrinsicHeight;
        textView4.setCompoundDrawablesWithIntrinsicBounds(arVar, (Drawable) null, (Drawable) null, (Drawable) null);
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        ar arVar2 = new ar(null, mutate2, 0, AndroidUtilities.dp(1.0f));
        int intrinsicWidth2 = mutate2.getIntrinsicWidth();
        int intrinsicHeight2 = mutate2.getIntrinsicHeight();
        arVar2.h = intrinsicWidth2;
        arVar2.n = intrinsicHeight2;
        textView3.setCompoundDrawablesWithIntrinsicBounds(arVar2, (Drawable) null, (Drawable) null, (Drawable) null);
        textView3.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.x) {
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.d7, this.s);
            Paint paint = this.h;
            paint.setColor(w02);
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - AndroidUtilities.dp(72), getHeight(), paint);
            } else {
                canvas.drawRect(AndroidUtilities.dp(72), getHeight() - 1, getWidth(), getHeight(), paint);
            }
        }
    }

    public org.telegram.ui.Components.y9 getImageView() {
        return this.a;
    }

    public v91 getPostInfo() {
        return this.v;
    }

    public di.w7 getStoryAvatarParams() {
        return this.r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.g();
    }

    public void setData(r91 r91Var) {
        TLRPC.User user = r91Var.a;
        org.telegram.ui.Components.j9 j9Var = this.n;
        j9Var.r(user);
        TLRPC.User user2 = r91Var.a;
        d8 d8Var = this.a;
        d8Var.f(user2, j9Var);
        d8Var.setRoundRadius(AndroidUtilities.dp(46.0f) >> 1);
        this.b.k(r91Var.a.first_name);
        this.e.setText(r91Var.b);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        this.f.setVisibility(8);
    }

    public void setImageViewAction(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
