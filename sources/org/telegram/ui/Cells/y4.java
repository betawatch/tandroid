package org.telegram.ui.Cells;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class y4 extends FrameLayout {
    public static c10 x;
    public final org.telegram.ui.Components.s6 a;
    public final org.telegram.ui.Components.s6 b;
    public final org.telegram.ui.Components.y9 c;
    public final ShapeDrawable d;
    public boolean e;
    public final org.telegram.ui.ActionBar.u6 f;
    public boolean h;
    public CharSequence n;
    public String r;
    public String s;
    public float v;
    public ValueAnimator w;

    public y4(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.v = 0.0f;
        this.f = u6Var;
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.c = y9Var;
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(42.0f), -1);
        this.d = K;
        y9Var.setBackground(K);
        y9Var.s(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        boolean z10 = LocaleController.isRTL;
        addView(y9Var, kb1.h(42, 42.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 15.0f, 11.0f, z10 ? 15.0f : 0.0f, 0.0f));
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, true, true, true);
        this.a = s6Var;
        ds dsVar = ds.h;
        s6Var.b(0.4f, 350L, dsVar);
        s6Var.setScaleProperty(0.6f);
        s6Var.setTextSize(AndroidUtilities.dp(16.0f));
        s6Var.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.f7.Z(s6Var, org.telegram.ui.ActionBar.y6.G6, u6Var);
        s6Var.setTypeface(AndroidUtilities.bold());
        s6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        s6Var.getDrawable().M = AndroidUtilities.displaySize.x;
        NotificationCenter.listenEmojiLoading(s6Var);
        boolean z11 = LocaleController.isRTL;
        addView(s6Var, kb1.h(-1, 22.0f, (z11 ? 5 : 3) | 48, z11 ? 16 : 73, 10.0f, z11 ? 73 : 16, 0.0f));
        org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(context, true, true, true);
        this.b = s6Var2;
        s6Var2.setScaleProperty(0.6f);
        s6Var2.b(0.4f, 350L, dsVar);
        s6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        s6Var2.setEllipsizeByGradient(true);
        org.telegram.ui.ActionBar.f7.Z(s6Var2, org.telegram.ui.ActionBar.y6.A6, u6Var);
        s6Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z12 = LocaleController.isRTL;
        addView(s6Var2, kb1.h(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 16 : 73, 35.0f, z12 ? 73 : 16, 0.0f));
        y9Var.setAlpha(this.v);
        s6Var.setAlpha(this.v);
        s6Var2.setAlpha(this.v);
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
        org.telegram.ui.Components.s6 s6Var = this.a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.s, tL_messageMediaVenue.title)) {
                charSequence = this.n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = Emoji.replaceEmoji(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), s6Var.getPaint().getFontMetricsInt(), false);
                }
                this.r = tL_messageMediaVenue.emoji;
                this.s = tL_messageMediaVenue.title;
                this.n = charSequence;
            }
            s6Var.c(charSequence, this.h && !LocaleController.isRTL && z11, true);
        }
        org.telegram.ui.Components.s6 s6Var2 = this.b;
        if (tL_messageMediaVenue != null) {
            s6Var2.c(tL_messageMediaVenue.address, this.h && !LocaleController.isRTL && z11, true);
        }
        int a2 = a(i10);
        org.telegram.ui.Components.y9 y9Var = this.c;
        if (tL_messageMediaVenue != null && (str = tL_messageMediaVenue.icon) != null) {
            if ("pin".equals(str) || tL_messageMediaVenue.icon.startsWith("emoji")) {
                Drawable mutate = getResources().getDrawable(R.drawable.pin).mutate();
                org.telegram.ui.ActionBar.f7.y(this, mutate, org.telegram.ui.ActionBar.y6.ni, this.f, PorterDuff.Mode.MULTIPLY);
                ar arVar = new ar(org.telegram.ui.ActionBar.y6.K(AndroidUtilities.dp(42.0f), 0), mutate);
                int dp = AndroidUtilities.dp(42.0f);
                int dp2 = AndroidUtilities.dp(42.0f);
                arVar.h = dp;
                arVar.n = dp2;
                int dp3 = AndroidUtilities.dp(24.0f);
                int dp4 = AndroidUtilities.dp(24.0f);
                arVar.e = dp3;
                arVar.f = dp4;
                y9Var.setImageDrawable(arVar);
            } else {
                y9Var.g(tL_messageMediaVenue.icon, null, null);
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
        this.w.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Cells.x4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                y4 y4Var = y4.this;
                y4Var.getClass();
                float elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                long j10 = abs;
                float lerp = AndroidUtilities.lerp(f7, f10, j10 > 0 ? Math.min(Math.max(elapsedRealtime2 / j10, 0.0f), 1.0f) : 1.0f);
                y4Var.v = lerp;
                y4Var.c.setAlpha(lerp);
                y4Var.a.setAlpha(y4Var.v);
                y4Var.b.setAlpha(y4Var.v);
                y4Var.invalidate();
            }
        });
        ValueAnimator valueAnimator2 = this.w;
        if (z12) {
            abs = Long.MAX_VALUE;
        }
        valueAnimator2.setDuration(abs);
        this.w.start();
        y9Var.setAlpha(f7);
        s6Var.setAlpha(f7);
        s6Var2.setAlpha(f7);
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

    public org.telegram.ui.Components.y9 getImageView() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        c10 c10Var = x;
        org.telegram.ui.ActionBar.u6 u6Var = this.f;
        if (c10Var == null) {
            c10 c10Var2 = new c10(getContext(), u6Var);
            x = c10Var2;
            c10Var2.setIsSingleCell(true);
        }
        int indexOfChild = getParent() instanceof ViewGroup ? ((ViewGroup) getParent()).indexOfChild(this) : 0;
        c10 c10Var3 = x;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int dp = AndroidUtilities.dp(56.0f);
        c10Var3.O = measuredWidth;
        c10Var3.P = measuredHeight;
        c10Var3.Q = dp * (-indexOfChild);
        x.setViewType(4);
        x.updateColors();
        x.f();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.v) * 255.0f), 31);
        canvas.translate(AndroidUtilities.dp(2.0f), wh.B(56.0f, getMeasuredHeight(), 2));
        x.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.e) {
            Paint d = u6Var == null ? null : u6Var.d("paintDivider");
            if (d == null) {
                d = org.telegram.ui.ActionBar.y6.k0;
            }
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getHeight() - 1, LocaleController.isRTL ? getWidth() - AndroidUtilities.dp(72.0f) : getWidth(), getHeight() - 1, d);
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
