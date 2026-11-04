package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;
import java.util.Random;
import org.telegram.messenger.bd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p8 extends View {
    public ValueAnimator E;
    public final /* synthetic */ q8 F;
    public final Paint a;
    public final char[] b;
    public final Random c;
    public final int[] d;
    public final float[] e;
    public final float f;
    public final float h;
    public final float n;
    public final float r;
    public final Paint.FontMetrics s;
    public String w;
    public float x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8(q8 q8Var, Context context) {
        super(context);
        this.F = q8Var;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new char[1];
        this.c = new Random();
        this.d = new int[48];
        this.e = new float[48];
        paint.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        paint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        this.f = paint.measureText("U");
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        this.s = fontMetrics;
        float f10 = fontMetrics.top;
        this.n = -f10;
        float f11 = fontMetrics.descent - fontMetrics.ascent;
        this.h = f11;
        this.r = (fontMetrics.bottom - f10) + f11;
        setImportantForAccessibility(1);
        setContentDescription(bd.M0(2131748787, null));
    }

    public final float a() {
        String str = this.w;
        int min = str != null ? Math.min(24, str.length()) : 24;
        return this.f * (Math.max(0, (min - 1) / 4) + min);
    }

    public final int b() {
        int max = Math.max(0, Math.min(24, this.w.length()) - 1);
        return (((max / 4) + max) * 18) + 560;
    }

    public final void c(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        if (z10 || !TextUtils.equals(this.w, str)) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.E = null;
            }
            this.w = str;
            this.x = 0.0f;
            Arrays.fill(this.d, -1);
            String str2 = this.w;
            this.y = str2 != null;
            if (str2 == null) {
                str2 = bd.M0(2131748787, null);
            }
            setContentDescription(str2);
            requestLayout();
            d();
            invalidate();
        }
    }

    public final void d() {
        if (this.y && isAttachedToWindow() && isShown()) {
            this.y = false;
            int b10 = b();
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                this.x = b10;
                invalidate();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, b10);
            this.E = ofFloat;
            ofFloat.setDuration(b10);
            this.E.setInterpolator(new LinearInterpolator());
            this.E.addUpdateListener(new p3(this, 6));
            this.E.start();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E = null;
        }
        if (this.w != null && !this.y) {
            this.x = b();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i3;
        float f10;
        float f11;
        Paint paint;
        float f12;
        float f13;
        float f14;
        int i10;
        float f15;
        float cos;
        float f16;
        char charAt;
        float[] fArr;
        float f17;
        int i11;
        int i12;
        super.onDraw(canvas);
        int i13 = org.telegram.ui.ActionBar.k6.D6;
        org.telegram.ui.ActionBar.e6 e6Var = this.F.a;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i13, e6Var);
        int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var);
        String str = this.w;
        int min = str != null ? Math.min(48, str.length()) : 48;
        int i14 = 0;
        while (true) {
            int i15 = i14 * 4;
            if (i15 >= min) {
                return;
            }
            int i16 = i15 / 24;
            int i17 = (i14 % 6) * 5;
            float f18 = this.f;
            float f19 = i17 * f18;
            float f20 = i16 * this.h;
            float f21 = this.n;
            float f22 = f20 + f21;
            float max = this.w == null ? 1.0f : 1.0f - Math.max(0.0f, Math.min(1.0f, (this.x - (r1 * 90)) / 180.0f));
            float f23 = 0.0f;
            Paint.FontMetrics fontMetrics = this.s;
            int i18 = i14;
            Paint paint2 = this.a;
            if (max > 0.0f) {
                paint2.setColor(w02);
                paint2.setAlpha(Math.round(paint2.getAlpha() * 0.22f * max));
                float a10 = org.telegram.messenger.k5.a(fontMetrics.ascent, fontMetrics.descent, 2.0f, f22);
                f10 = f18;
                f14 = f22;
                f12 = 1.0f;
                f11 = f21;
                i3 = i17;
                canvas2 = canvas;
                canvas2.drawRoundRect(f19, a10 - org.telegram.messenger.g0.L(2.0f), (Math.min(4, min - i15) * f18) + f19, a10 + org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paint2);
                paint = paint2;
                f13 = f19;
            } else {
                canvas2 = canvas;
                i3 = i17;
                f10 = f18;
                f11 = f21;
                paint = paint2;
                f12 = 1.0f;
                f13 = f19;
                f14 = f22;
            }
            if (this.w != null) {
                int i19 = 0;
                int i20 = 4;
                while (i19 < i20) {
                    int i21 = i15 + i19;
                    if (i21 < min) {
                        float f24 = this.x - ((i3 + i19) * 18);
                        if (f24 <= f23) {
                            i12 = i20;
                            i10 = i15;
                            f17 = f23;
                            i11 = i19;
                        } else {
                            if (Math.max(f23, Math.min(f12, f24 / 560.0f)) >= f12) {
                                f15 = f24;
                                i10 = i15;
                                cos = 0.0f;
                            } else {
                                i10 = i15;
                                f15 = f24;
                                cos = (float) (Math.cos(r5 * 12.0f) * Math.exp((-8.0f) * r5));
                            }
                            int i22 = (int) (f15 / 50.0f);
                            boolean z10 = f15 < 260.0f;
                            if (z10) {
                                f16 = f15;
                                charAt = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(((i22 * 13) + (i21 * 17)) % 64);
                            } else {
                                f16 = f15;
                                charAt = this.w.charAt(i21);
                            }
                            this.b[0] = charAt;
                            float[] fArr2 = this.e;
                            if (z10) {
                                int[] iArr = this.d;
                                fArr = fArr2;
                                if (iArr[i21] != i22) {
                                    iArr[i21] = i22;
                                    fArr[i21] = this.c.nextFloat();
                                }
                            } else {
                                fArr = fArr2;
                            }
                            paint.setColor(z10 ? i0.a.f(fArr[i21], w02, w03) : (i18 + i16) % 2 == 0 ? w02 : w03);
                            paint.setAlpha(Math.round(Math.max(0.0f, Math.min(1.0f, f16 / 100.0f)) * paint.getAlpha()));
                            int save = canvas2.save();
                            float L = org.telegram.messenger.g0.L(1.0f) + f11 + fontMetrics.descent;
                            float f25 = i16 == 0 ? 0.0f : L;
                            float width = getWidth();
                            if (i16 != 0) {
                                L = getHeight();
                            }
                            f17 = 0.0f;
                            canvas2.clipRect(0.0f, f25, width, L);
                            i11 = i19;
                            i12 = 4;
                            canvas2.drawText(this.b, 0, 1, (i19 * f10) + f13, f14 - (org.telegram.messenger.g0.L(24.0f) * cos), paint);
                            canvas2.restoreToCount(save);
                        }
                        i19 = i11 + 1;
                        f23 = f17;
                        i20 = i12;
                        i15 = i10;
                        f12 = 1.0f;
                    }
                }
            }
            i14 = i18 + 1;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.resolveSize((int) Math.ceil(a()), i3), View.resolveSize((int) Math.ceil(this.r), i10));
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i3) {
        super.onVisibilityChanged(view, i3);
        if (isShown()) {
            d();
            return;
        }
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.E = null;
            }
            this.x = this.w == null ? 0.0f : b();
        }
    }
}
