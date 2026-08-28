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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u4 extends FrameLayout {
    public static e00 x;
    public final org.telegram.ui.Components.j6 a;
    public final org.telegram.ui.Components.j6 b;
    public final org.telegram.ui.Components.o9 c;
    public final ShapeDrawable d;
    public boolean e;
    public final org.telegram.ui.ActionBar.b6 f;
    public boolean h;
    public CharSequence n;
    public String r;
    public String s;
    public float v;
    public ValueAnimator w;

    public u4(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.v = 0.0f;
        this.f = b6Var;
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.c = o9Var;
        ShapeDrawable K = org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(42.0f), -1);
        this.d = K;
        o9Var.setBackground(K);
        o9Var.s(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));
        boolean z10 = LocaleController.isRTL;
        addView(o9Var, g7.e6.d(42, 42.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 15.0f, 11.0f, z10 ? 15.0f : 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, true);
        this.a = j6Var;
        gr grVar = gr.h;
        j6Var.b(0.4f, 350L, grVar);
        j6Var.setScaleProperty(0.6f);
        j6Var.setTextSize(AndroidUtilities.dp(16.0f));
        j6Var.setEllipsizeByGradient(true);
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        j6Var.getDrawable().G = AndroidUtilities.displaySize.x;
        NotificationCenter.listenEmojiLoading(j6Var);
        boolean z11 = LocaleController.isRTL;
        addView(j6Var, g7.e6.d(-1, 22.0f, (z11 ? 5 : 3) | 48, z11 ? 16 : 73, 10.0f, z11 ? 73 : 16, 0.0f));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(context, true, true, true);
        this.b = j6Var2;
        j6Var2.setScaleProperty(0.6f);
        j6Var2.b(0.4f, 350L, grVar);
        j6Var2.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var2.setEllipsizeByGradient(true);
        j6Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, b6Var));
        j6Var2.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z12 = LocaleController.isRTL;
        addView(j6Var2, g7.e6.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 16 : 73, 35.0f, z12 ? 73 : 16, 0.0f));
        o9Var.setAlpha(this.v);
        j6Var.setAlpha(this.v);
        j6Var2.setAlpha(this.v);
    }

    public static int a(int i9) {
        int i10 = i9 % 7;
        if (i10 == 0) {
            return -1351584;
        }
        if (i10 == 1) {
            return -868277;
        }
        if (i10 == 2) {
            return -12214795;
        }
        if (i10 == 3) {
            return -13187226;
        }
        if (i10 != 4) {
            return i10 != 5 ? -1285237 : -12338729;
        }
        return -7900675;
    }

    public final void b(TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i9, boolean z10, boolean z11) {
        String str;
        CharSequence charSequence;
        this.e = z10;
        org.telegram.ui.Components.j6 j6Var = this.a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.s, tL_messageMediaVenue.title)) {
                charSequence = this.n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = Emoji.replaceEmoji(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), j6Var.getPaint().getFontMetricsInt(), false);
                }
                this.r = tL_messageMediaVenue.emoji;
                this.s = tL_messageMediaVenue.title;
                this.n = charSequence;
            }
            j6Var.c(charSequence, this.h && !LocaleController.isRTL && z11, true);
        }
        org.telegram.ui.Components.j6 j6Var2 = this.b;
        if (tL_messageMediaVenue != null) {
            j6Var2.c(tL_messageMediaVenue.address, this.h && !LocaleController.isRTL && z11, true);
        }
        int a2 = a(i9);
        org.telegram.ui.Components.o9 o9Var = this.c;
        if (tL_messageMediaVenue != null && (str = tL_messageMediaVenue.icon) != null) {
            if ("pin".equals(str) || tL_messageMediaVenue.icon.startsWith("emoji")) {
                Drawable mutate = getResources().getDrawable(R.drawable.pin).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ni, this.f), PorterDuff.Mode.MULTIPLY));
                fq fqVar = new fq(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(42.0f), 0), mutate);
                int dp = AndroidUtilities.dp(42.0f);
                int dp2 = AndroidUtilities.dp(42.0f);
                fqVar.h = dp;
                fqVar.n = dp2;
                int dp3 = AndroidUtilities.dp(24.0f);
                int dp4 = AndroidUtilities.dp(24.0f);
                fqVar.e = dp3;
                fqVar.f = dp4;
                o9Var.setImageDrawable(fqVar);
            } else {
                o9Var.f(tL_messageMediaVenue.icon, null, null);
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
        final float f10 = this.v;
        final float f11 = z12 ? 0.0f : 1.0f;
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
        if (z12) {
            abs = Long.MAX_VALUE;
        }
        valueAnimator2.setDuration(abs);
        this.w.start();
        o9Var.setAlpha(f10);
        j6Var.setAlpha(f10);
        j6Var2.setAlpha(f10);
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

    public org.telegram.ui.Components.o9 getImageView() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        e00 e00Var = x;
        org.telegram.ui.ActionBar.b6 b6Var = this.f;
        if (e00Var == null) {
            e00 e00Var2 = new e00(getContext(), b6Var);
            x = e00Var2;
            e00Var2.setIsSingleCell(true);
        }
        int indexOfChild = getParent() instanceof ViewGroup ? ((ViewGroup) getParent()).indexOfChild(this) : 0;
        e00 e00Var3 = x;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int dp = AndroidUtilities.dp(56.0f);
        e00Var3.K = measuredWidth;
        e00Var3.L = measuredHeight;
        e00Var3.M = dp * (-indexOfChild);
        x.setViewType(4);
        x.d();
        x.h();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.v) * 255.0f), 31);
        canvas.translate(AndroidUtilities.dp(2.0f), ll.y(56.0f, getMeasuredHeight(), 2));
        x.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.e) {
            Paint O = b6Var == null ? null : b6Var.O("paintDivider");
            if (O == null) {
                O = org.telegram.ui.ActionBar.f6.k0;
            }
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(72.0f), getHeight() - 1, LocaleController.isRTL ? getWidth() - AndroidUtilities.dp(72.0f) : getWidth(), getHeight() - 1, O);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.e ? 1 : 0), TLObject.FLAG_30));
    }

    public void setAllowTextAnimation(boolean z10) {
        this.h = z10;
    }
}
