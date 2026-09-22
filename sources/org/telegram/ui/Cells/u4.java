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
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.t00;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class u4 extends FrameLayout {
    public static t00 x;
    public final org.telegram.ui.Components.n6 a;
    public final org.telegram.ui.Components.n6 b;
    public final org.telegram.ui.Components.u9 c;
    public final ShapeDrawable d;
    public boolean e;
    public final org.telegram.ui.ActionBar.e6 f;
    public boolean h;
    public CharSequence n;
    public String r;
    public String s;
    public float v;
    public ValueAnimator w;

    public u4(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.v = 0.0f;
        this.f = e6Var;
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.c = u9Var;
        ShapeDrawable K = org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(42.0f), -1);
        this.d = K;
        u9Var.setBackground(K);
        u9Var.s(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        boolean z10 = LocaleController.isRTL;
        addView(u9Var, w7.x5.d(42, 42.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 15.0f, 11.0f, z10 ? 15.0f : 0.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, true, true, true);
        this.a = n6Var;
        qr qrVar = qr.h;
        n6Var.b(0.4f, 350L, qrVar);
        n6Var.setScaleProperty(0.6f);
        n6Var.setTextSize(AndroidUtilities.dp(16.0f));
        n6Var.setEllipsizeByGradient(true);
        n6Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        n6Var.setTypeface(AndroidUtilities.bold());
        n6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        n6Var.getDrawable().G = AndroidUtilities.displaySize.x;
        NotificationCenter.listenEmojiLoading(n6Var);
        boolean z11 = LocaleController.isRTL;
        addView(n6Var, w7.x5.d(-1, 22.0f, (z11 ? 5 : 3) | 48, z11 ? 16 : 73, 10.0f, z11 ? 73 : 16, 0.0f));
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(context, true, true, true);
        this.b = n6Var2;
        n6Var2.setScaleProperty(0.6f);
        n6Var2.b(0.4f, 350L, qrVar);
        n6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        n6Var2.setEllipsizeByGradient(true);
        n6Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.A6, e6Var));
        n6Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z12 = LocaleController.isRTL;
        addView(n6Var2, w7.x5.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 16 : 73, 35.0f, z12 ? 73 : 16, 0.0f));
        u9Var.setAlpha(this.v);
        n6Var.setAlpha(this.v);
        n6Var2.setAlpha(this.v);
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

    public final void b(TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i10, boolean z10, boolean z11) {
        String str;
        CharSequence charSequence;
        this.e = z10;
        org.telegram.ui.Components.n6 n6Var = this.a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.s, tL_messageMediaVenue.title)) {
                charSequence = this.n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = Emoji.replaceEmoji(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), n6Var.getPaint().getFontMetricsInt(), false);
                }
                this.r = tL_messageMediaVenue.emoji;
                this.s = tL_messageMediaVenue.title;
                this.n = charSequence;
            }
            n6Var.c(charSequence, this.h && !LocaleController.isRTL && z11, true);
        }
        org.telegram.ui.Components.n6 n6Var2 = this.b;
        if (tL_messageMediaVenue != null) {
            n6Var2.c(tL_messageMediaVenue.address, this.h && !LocaleController.isRTL && z11, true);
        }
        int a2 = a(i10);
        org.telegram.ui.Components.u9 u9Var = this.c;
        if (tL_messageMediaVenue != null && (str = tL_messageMediaVenue.icon) != null) {
            if ("pin".equals(str) || tL_messageMediaVenue.icon.startsWith("emoji")) {
                Drawable mutate = getResources().getDrawable(R.drawable.pin).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.ni, this.f), PorterDuff.Mode.MULTIPLY));
                pq pqVar = new pq(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(42.0f), 0), mutate);
                int dp = AndroidUtilities.dp(42.0f);
                int dp2 = AndroidUtilities.dp(42.0f);
                pqVar.h = dp;
                pqVar.n = dp2;
                int dp3 = AndroidUtilities.dp(24.0f);
                int dp4 = AndroidUtilities.dp(24.0f);
                pqVar.e = dp3;
                pqVar.f = dp4;
                u9Var.setImageDrawable(pqVar);
            } else {
                u9Var.f(tL_messageMediaVenue.icon, null, null);
            }
        }
        this.d.getPaint().setColor(a2);
        setWillNotDraw(false);
        setClickable(tL_messageMediaVenue == null);
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z12 = tL_messageMediaVenue == null;
        final float f7 = this.v;
        final float f10 = z12 ? 0.0f : 1.0f;
        final long abs = (long) (Math.abs(f7 - f10) * 150.0f);
        this.w = ValueAnimator.ofFloat(f7, f10);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.w.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Cells.t4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                u4 u4Var = u4.this;
                u4Var.getClass();
                float elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                long j3 = abs;
                float lerp = AndroidUtilities.lerp(f7, f10, j3 > 0 ? Math.min(Math.max(elapsedRealtime2 / j3, 0.0f), 1.0f) : 1.0f);
                u4Var.v = lerp;
                u4Var.c.setAlpha(lerp);
                u4Var.a.setAlpha(u4Var.v);
                u4Var.b.setAlpha(u4Var.v);
                u4Var.invalidate();
            }
        });
        ValueAnimator valueAnimator2 = this.w;
        if (z12) {
            abs = Long.MAX_VALUE;
        }
        valueAnimator2.setDuration(abs);
        this.w.start();
        u9Var.setAlpha(f7);
        n6Var.setAlpha(f7);
        n6Var2.setAlpha(f7);
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
        StringBuilder sb2 = new StringBuilder();
        if (tL_messageMediaVenue != null && !TextUtils.isEmpty(tL_messageMediaVenue.title)) {
            sb2.append(tL_messageMediaVenue.title);
        }
        String str2 = (TextUtils.isEmpty(null) && tL_messageMediaVenue != null) ? tL_messageMediaVenue.address : null;
        if (!TextUtils.isEmpty(str2)) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append((CharSequence) str2);
        }
        setContentDescription(sb2.length() > 0 ? sb2.toString() : null);
        invalidate();
    }

    public org.telegram.ui.Components.u9 getImageView() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        t00 t00Var = x;
        org.telegram.ui.ActionBar.e6 e6Var = this.f;
        if (t00Var == null) {
            t00 t00Var2 = new t00(getContext(), e6Var);
            x = t00Var2;
            t00Var2.setIsSingleCell(true);
        }
        int indexOfChild = getParent() instanceof ViewGroup ? ((ViewGroup) getParent()).indexOfChild(this) : 0;
        t00 t00Var3 = x;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int dp = AndroidUtilities.dp(56.0f);
        t00Var3.O = measuredWidth;
        t00Var3.P = measuredHeight;
        t00Var3.Q = dp * (-indexOfChild);
        x.setViewType(4);
        x.e();
        x.h();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.v) * 255.0f), 31);
        canvas.translate(AndroidUtilities.dp(2.0f), vl.y(56.0f, getMeasuredHeight(), 2));
        x.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.e) {
            Paint G = e6Var == null ? null : e6Var.G("paintDivider");
            if (G == null) {
                G = org.telegram.ui.ActionBar.i6.k0;
            }
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getHeight() - 1, LocaleController.isRTL ? getWidth() - AndroidUtilities.dp(72.0f) : getWidth(), getHeight() - 1, G);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }

    public void setAllowTextAnimation(boolean z10) {
        this.h = z10;
    }
}
