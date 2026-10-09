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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class m7 extends View {
    public final /* synthetic */ n7 E;
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
    public String v;
    public float w;
    public boolean x;
    public ValueAnimator y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(n7 n7Var, Context context) {
        super(context);
        this.E = n7Var;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new char[1];
        this.c = new Random();
        this.d = new int[48];
        this.e = new float[48];
        paint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        paint.setTextSize(AndroidUtilities.dp(12.0f));
        this.f = paint.measureText("U");
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        this.s = fontMetrics;
        float f7 = fontMetrics.top;
        this.n = -f7;
        float f10 = fontMetrics.descent - fontMetrics.ascent;
        this.h = f10;
        this.r = (fontMetrics.bottom - f7) + f10;
        setImportantForAccessibility(1);
        setContentDescription(LocaleController.getString(R.string.Loading));
    }

    public final float a() {
        String str = this.v;
        int min = str != null ? Math.min(24, str.length()) : 24;
        return this.f * (Math.max(0, (min - 1) / 4) + min);
    }

    public final int b() {
        int max = Math.max(0, Math.min(24, this.v.length()) - 1);
        return (((max / 4) + max) * 18) + 560;
    }

    public final void c(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        if (z10 || !TextUtils.equals(this.v, str)) {
            ValueAnimator valueAnimator = this.y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.y = null;
            }
            this.v = str;
            this.w = 0.0f;
            Arrays.fill(this.d, -1);
            String str2 = this.v;
            this.x = str2 != null;
            if (str2 == null) {
                str2 = LocaleController.getString(R.string.Loading);
            }
            setContentDescription(str2);
            requestLayout();
            d();
            invalidate();
        }
    }

    public final void d() {
        if (this.x && isAttachedToWindow() && isShown()) {
            this.x = false;
            int b10 = b();
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                this.w = b10;
                invalidate();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, b10);
            this.y = ofFloat;
            ofFloat.setDuration(b10);
            this.y.setInterpolator(new LinearInterpolator());
            this.y.addUpdateListener(new s2(this, 6));
            this.y.start();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.y = null;
        }
        if (this.v != null && !this.x) {
            this.w = b();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        float f7;
        float f10;
        Paint paint;
        float f11;
        float f12;
        float f13;
        int i11;
        float f14;
        float cos;
        float f15;
        char charAt;
        float[] fArr;
        float f16;
        int i12;
        int i13;
        super.onDraw(canvas);
        int i14 = org.telegram.ui.ActionBar.i6.D6;
        org.telegram.ui.ActionBar.e6 e6Var = this.E.a;
        int w02 = org.telegram.ui.ActionBar.i6.w0(i14, e6Var);
        int w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var);
        String str = this.v;
        int min = str != null ? Math.min(48, str.length()) : 48;
        int i15 = 0;
        while (true) {
            int i16 = i15 * 4;
            if (i16 >= min) {
                return;
            }
            int i17 = i16 / 24;
            int i18 = (i15 % 6) * 5;
            float f17 = this.f;
            float f18 = i18 * f17;
            float f19 = i17 * this.h;
            float f20 = this.n;
            float f21 = f19 + f20;
            float max = this.v == null ? 1.0f : 1.0f - Math.max(0.0f, Math.min(1.0f, (this.w - (r1 * 90)) / 180.0f));
            float f22 = 0.0f;
            Paint.FontMetrics fontMetrics = this.s;
            int i19 = i15;
            Paint paint2 = this.a;
            if (max > 0.0f) {
                paint2.setColor(w02);
                paint2.setAlpha(Math.round(paint2.getAlpha() * 0.22f * max));
                float a2 = org.telegram.messenger.q.a(fontMetrics.ascent, fontMetrics.descent, 2.0f, f21);
                f7 = f17;
                f13 = f21;
                f11 = 1.0f;
                f10 = f20;
                i10 = i18;
                canvas2 = canvas;
                canvas2.drawRoundRect(f18, a2 - AndroidUtilities.dp(2.0f), (Math.min(4, min - i16) * f17) + f18, a2 + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint2);
                paint = paint2;
                f12 = f18;
            } else {
                canvas2 = canvas;
                i10 = i18;
                f7 = f17;
                f10 = f20;
                paint = paint2;
                f11 = 1.0f;
                f12 = f18;
                f13 = f21;
            }
            if (this.v != null) {
                int i20 = 0;
                int i21 = 4;
                while (i20 < i21) {
                    int i22 = i16 + i20;
                    if (i22 < min) {
                        float f23 = this.w - ((i10 + i20) * 18);
                        if (f23 <= f22) {
                            i13 = i21;
                            i11 = i16;
                            f16 = f22;
                            i12 = i20;
                        } else {
                            if (Math.max(f22, Math.min(f11, f23 / 560.0f)) >= f11) {
                                f14 = f23;
                                i11 = i16;
                                cos = 0.0f;
                            } else {
                                i11 = i16;
                                f14 = f23;
                                cos = (float) (Math.cos(r5 * 12.0f) * Math.exp((-8.0f) * r5));
                            }
                            int i23 = (int) (f14 / 50.0f);
                            boolean z10 = f14 < 260.0f;
                            if (z10) {
                                f15 = f14;
                                charAt = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(((i23 * 13) + (i22 * 17)) % 64);
                            } else {
                                f15 = f14;
                                charAt = this.v.charAt(i22);
                            }
                            this.b[0] = charAt;
                            float[] fArr2 = this.e;
                            if (z10) {
                                int[] iArr = this.d;
                                fArr = fArr2;
                                if (iArr[i22] != i23) {
                                    iArr[i22] = i23;
                                    fArr[i22] = this.c.nextFloat();
                                }
                            } else {
                                fArr = fArr2;
                            }
                            paint.setColor(z10 ? i0.a.d(fArr[i22], w02, w03) : (i19 + i17) % 2 == 0 ? w02 : w03);
                            paint.setAlpha(Math.round(Math.max(0.0f, Math.min(1.0f, f15 / 100.0f)) * paint.getAlpha()));
                            int save = canvas2.save();
                            float dp = AndroidUtilities.dp(1.0f) + f10 + fontMetrics.descent;
                            float f24 = i17 == 0 ? 0.0f : dp;
                            float width = getWidth();
                            if (i17 != 0) {
                                dp = getHeight();
                            }
                            f16 = 0.0f;
                            canvas2.clipRect(0.0f, f24, width, dp);
                            i12 = i20;
                            i13 = 4;
                            canvas2.drawText(this.b, 0, 1, (i20 * f7) + f12, f13 - (AndroidUtilities.dp(24.0f) * cos), paint);
                            canvas2.restoreToCount(save);
                        }
                        i20 = i12 + 1;
                        f22 = f16;
                        i21 = i13;
                        i16 = i11;
                        f11 = 1.0f;
                    }
                }
            }
            i15 = i19 + 1;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.resolveSize((int) Math.ceil(a()), i10), View.resolveSize((int) Math.ceil(this.r), i11));
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (isShown()) {
            d();
            return;
        }
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.y = null;
            }
            this.w = this.v == null ? 0.0f : b();
        }
    }
}
