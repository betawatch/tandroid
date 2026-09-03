package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.u00;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class u4 extends FrameLayout {
    public static u00 x;
    public final org.telegram.ui.Components.k6 a;
    public final org.telegram.ui.Components.k6 b;
    public final org.telegram.ui.Components.p9 c;
    public final ShapeDrawable d;
    public boolean e;
    public final org.telegram.ui.ActionBar.g6 f;
    public boolean h;
    public CharSequence n;
    public String r;
    public String s;
    public float v;
    public ValueAnimator w;

    public u4(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.v = 0.0f;
        this.f = g6Var;
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.c = p9Var;
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(42.0f), -1);
        this.d = K;
        p9Var.setBackground(K);
        p9Var.s(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        boolean z4 = LocaleController.isRTL;
        addView(p9Var, k7.c6.d(42, 42.0f, (z4 ? 5 : 3) | 48, z4 ? 0.0f : 15.0f, 11.0f, z4 ? 15.0f : 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, true, true);
        this.a = k6Var;
        pr prVar = pr.h;
        k6Var.b(0.4f, 350L, prVar);
        k6Var.setScaleProperty(0.6f);
        k6Var.setTextSize(AndroidUtilities.dp(16.0f));
        k6Var.setEllipsizeByGradient(true);
        k6Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        k6Var.getDrawable().G = AndroidUtilities.displaySize.x;
        NotificationCenter.listenEmojiLoading(k6Var);
        boolean z10 = LocaleController.isRTL;
        addView(k6Var, k7.c6.d(-1, 22.0f, (z10 ? 5 : 3) | 48, z10 ? 16 : 73, 10.0f, z10 ? 73 : 16, 0.0f));
        org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(context, true, true, true);
        this.b = k6Var2;
        k6Var2.setScaleProperty(0.6f);
        k6Var2.b(0.4f, 350L, prVar);
        k6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        k6Var2.setEllipsizeByGradient(true);
        k6Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A6, g6Var));
        k6Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z11 = LocaleController.isRTL;
        addView(k6Var2, k7.c6.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 16 : 73, 35.0f, z11 ? 73 : 16, 0.0f));
        p9Var.setAlpha(this.v);
        k6Var.setAlpha(this.v);
        k6Var2.setAlpha(this.v);
    }

    public static int a(int i10) {
        int i11 = i10 % 7;
        if (i11 == 0) {
            return -1351584;
        }
        if (i11 == 1) {
            return -868277;
        }
        if (i11 == 2) {
            return -12214795;
        }
        if (i11 == 3) {
            return -13187226;
        }
        if (i11 != 4) {
            return i11 != 5 ? -1285237 : -12338729;
        }
        return -7900675;
    }

    public final void b(TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10, boolean z4, boolean z10) {
        String str;
        CharSequence charSequence;
        this.e = z4;
        org.telegram.ui.Components.k6 k6Var = this.a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.s, tL_messageMediaVenue.title)) {
                charSequence = this.n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = Emoji.replaceEmoji(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), k6Var.getPaint().getFontMetricsInt(), false);
                }
                this.r = tL_messageMediaVenue.emoji;
                this.s = tL_messageMediaVenue.title;
                this.n = charSequence;
            }
            k6Var.c(charSequence, this.h && !LocaleController.isRTL && z10, true);
        }
        org.telegram.ui.Components.k6 k6Var2 = this.b;
        if (tL_messageMediaVenue != null) {
            k6Var2.c(tL_messageMediaVenue.address, this.h && !LocaleController.isRTL && z10, true);
        }
        int a2 = a(i10);
        org.telegram.ui.Components.p9 p9Var = this.c;
        if (tL_messageMediaVenue != null && (str = tL_messageMediaVenue.icon) != null) {
            if ("pin".equals(str) || tL_messageMediaVenue.icon.startsWith("emoji")) {
                Drawable mutate = getResources().getDrawable(R.drawable.pin).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ni, this.f), PorterDuff.Mode.MULTIPLY));
                pq pqVar = new pq(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(42.0f), 0), mutate);
                int dp = AndroidUtilities.dp(42.0f);
                int dp2 = AndroidUtilities.dp(42.0f);
                pqVar.h = dp;
                pqVar.n = dp2;
                int dp3 = AndroidUtilities.dp(24.0f);
                int dp4 = AndroidUtilities.dp(24.0f);
                pqVar.e = dp3;
                pqVar.f = dp4;
                p9Var.setImageDrawable(pqVar);
            } else {
                p9Var.f(tL_messageMediaVenue.icon, null, null);
            }
        }
        this.d.getPaint().setColor(a2);
        setWillNotDraw(false);
        setClickable(tL_messageMediaVenue == null);
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z11 = tL_messageMediaVenue == null;
        final float f10 = this.v;
        final float f11 = z11 ? 0.0f : 1.0f;
        final long abs = (long) (Math.abs(f10 - f11) * 150.0f);
        this.w = ValueAnimator.ofFloat(f10, f11);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.w.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Cells.t4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                u4 u4Var = u4.this;
                u4Var.getClass();
                float elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                long j10 = abs;
                float lerp = AndroidUtilities.lerp(f10, f11, j10 > 0 ? Math.min(Math.max(elapsedRealtime2 / j10, 0.0f), 1.0f) : 1.0f);
                u4Var.v = lerp;
                u4Var.c.setAlpha(lerp);
                u4Var.a.setAlpha(u4Var.v);
                u4Var.b.setAlpha(u4Var.v);
                u4Var.invalidate();
            }
        });
        ValueAnimator valueAnimator2 = this.w;
        if (z11) {
            abs = Long.MAX_VALUE;
        }
        valueAnimator2.setDuration(abs);
        this.w.start();
        p9Var.setAlpha(f10);
        k6Var.setAlpha(f10);
        k6Var2.setAlpha(f10);
        if (tL_messageMediaVenue == null) {
            try {
            } catch (Exception unused) {
                setContentDescription(null);
            }
            if (TextUtils.isEmpty(null)) {
                setContentDescription(null);
                invalidate();
            }
        }
        StringBuilder sb = new StringBuilder();
        if (tL_messageMediaVenue != null && !TextUtils.isEmpty(tL_messageMediaVenue.title)) {
            sb.append(tL_messageMediaVenue.title);
        }
        String str2 = (TextUtils.isEmpty(null) && tL_messageMediaVenue != null) ? tL_messageMediaVenue.address : null;
        if (!TextUtils.isEmpty(str2)) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append((CharSequence) str2);
        }
        setContentDescription(sb.length() > 0 ? sb.toString() : null);
        invalidate();
    }

    public org.telegram.ui.Components.p9 getImageView() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        u00 u00Var = x;
        org.telegram.ui.ActionBar.g6 g6Var = this.f;
        if (u00Var == null) {
            u00 u00Var2 = new u00(getContext(), g6Var);
            x = u00Var2;
            u00Var2.setIsSingleCell(true);
        }
        int indexOfChild = getParent() instanceof ViewGroup ? ((ViewGroup) getParent()).indexOfChild(this) : 0;
        u00 u00Var3 = x;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int dp = AndroidUtilities.dp(56.0f);
        u00Var3.L = measuredWidth;
        u00Var3.M = measuredHeight;
        u00Var3.N = dp * (-indexOfChild);
        x.setViewType(4);
        x.e();
        x.h();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.v) * 255.0f), 31);
        canvas.translate(AndroidUtilities.dp(2.0f), org.telegram.ui.b.x(56.0f, getMeasuredHeight(), 2));
        x.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.e) {
            Paint F = g6Var == null ? null : g6Var.F("paintDivider");
            if (F == null) {
                F = org.telegram.ui.ActionBar.k6.k0;
            }
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getHeight() - 1, LocaleController.isRTL ? getWidth() - AndroidUtilities.dp(72.0f) : getWidth(), getHeight() - 1, F);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }

    public void setAllowTextAnimation(boolean z4) {
        this.h = z4;
    }
}
