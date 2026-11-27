// default package

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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class jtc extends View {
    public ValueAnimator E;
    public final /* synthetic */ ktc F;
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
    public jtc(ktc ktcVar, Context context) {
        super(context);
        this.F = ktcVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new char[1];
        this.c = new Random();
        this.d = new int[48];
        this.e = new float[48];
        paint.setTypeface(hl.n1("fonts/rmono.ttf"));
        paint.setTextSize(hl.L(12.0f));
        this.f = paint.measureText("U");
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        this.s = fontMetrics;
        float f = fontMetrics.top;
        this.n = -f;
        float f2 = fontMetrics.descent - fontMetrics.ascent;
        this.h = f2;
        this.r = (fontMetrics.bottom - f) + f2;
        setImportantForAccessibility(1);
        setContentDescription(ob6.M0(2131748533, null));
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

    public final void c(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        if (z || !TextUtils.equals(this.w, str)) {
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
                str2 = ob6.M0(2131748533, null);
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
            int b = b();
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                this.x = b;
                invalidate();
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, b);
            this.E = ofFloat;
            ofFloat.setDuration(b);
            this.E.setInterpolator(new LinearInterpolator());
            this.E.addUpdateListener(new pzb(this, (byte) 16));
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
        int i;
        float f;
        float f2;
        Paint paint;
        int i2;
        float f3;
        float f4;
        float f5;
        int i3;
        float f6;
        float cos;
        float f7;
        char charAt;
        float[] fArr;
        float f8;
        int i4;
        int i5;
        super.onDraw(canvas);
        int i6 = aob.D6;
        vnb vnbVar = this.F.a;
        int v0 = aob.v0(i6, vnbVar);
        int v02 = aob.v0(aob.G6, vnbVar);
        String str = this.w;
        int min = str != null ? Math.min(48, str.length()) : 48;
        int i7 = 0;
        while (true) {
            int i8 = i7 << 2;
            if (i8 >= min) {
                return;
            }
            int i9 = i8 / 24;
            int i10 = (i7 % 6) * 5;
            float f9 = this.f;
            float f10 = i10 * f9;
            float f11 = i9 * this.h;
            float f12 = this.n;
            float f13 = f11 + f12;
            float max = this.w == null ? 1.0f : 1.0f - Math.max(0.0f, Math.min(1.0f, (this.x - (r1 * 90)) / 180.0f));
            float f14 = 0.0f;
            Paint.FontMetrics fontMetrics = this.s;
            Paint paint2 = this.a;
            if (max > 0.0f) {
                paint2.setColor(v0);
                paint2.setAlpha(Math.round(paint2.getAlpha() * 0.22f * max));
                i = i10;
                float e = qd4.e(fontMetrics.ascent, fontMetrics.descent, 2.0f, f13);
                f = f9;
                f2 = f12;
                i2 = i7;
                f3 = 1.0f;
                f5 = f13;
                canvas2 = canvas;
                canvas2.drawRoundRect(f10, e - hl.L(2.0f), (Math.min(4, min - i8) * f9) + f10, e + hl.L(2.0f), hl.L(2.0f), hl.L(2.0f), paint2);
                paint = paint2;
                f4 = f10;
            } else {
                canvas2 = canvas;
                i = i10;
                f = f9;
                f2 = f12;
                paint = paint2;
                i2 = i7;
                f3 = 1.0f;
                f4 = f10;
                f5 = f13;
            }
            if (this.w != null) {
                int i11 = 0;
                int i12 = 4;
                while (i11 < i12) {
                    int i13 = i8 + i11;
                    if (i13 < min) {
                        float f15 = this.x - ((i + i11) * 18);
                        if (f15 <= f14) {
                            i5 = i12;
                            i3 = i8;
                            f8 = f14;
                            i4 = i11;
                        } else {
                            if (qu6.w(f15, 560.0f, f3, f14) >= f3) {
                                f6 = f15;
                                i3 = i8;
                                cos = 0.0f;
                            } else {
                                i3 = i8;
                                f6 = f15;
                                cos = (float) (Math.cos(r5 * 12.0f) * Math.exp((-8.0f) * r5));
                            }
                            int i14 = (int) (f6 / 50.0f);
                            boolean z = f6 < 260.0f;
                            if (z) {
                                f7 = f6;
                                charAt = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(((i14 * 13) + (i13 * 17)) % 64);
                            } else {
                                f7 = f6;
                                charAt = this.w.charAt(i13);
                            }
                            this.b[0] = charAt;
                            float[] fArr2 = this.e;
                            if (z) {
                                int[] iArr = this.d;
                                fArr = fArr2;
                                if (iArr[i13] != i14) {
                                    iArr[i13] = i14;
                                    fArr[i13] = this.c.nextFloat();
                                }
                            } else {
                                fArr = fArr2;
                            }
                            paint.setColor(z ? vm2.f(fArr[i13], v0, v02) : (i2 + i9) % 2 == 0 ? v0 : v02);
                            paint.setAlpha(Math.round(Math.max(0.0f, Math.min(1.0f, f7 / 100.0f)) * paint.getAlpha()));
                            int save = canvas2.save();
                            float L = hl.L(1.0f) + f2 + fontMetrics.descent;
                            float f16 = i9 == 0 ? 0.0f : L;
                            float width = getWidth();
                            if (i9 != 0) {
                                L = getHeight();
                            }
                            f8 = 0.0f;
                            canvas2.clipRect(0.0f, f16, width, L);
                            i4 = i11;
                            i5 = 4;
                            canvas2.drawText(this.b, 0, 1, (i11 * f) + f4, f5 - (hl.L(24.0f) * cos), paint);
                            canvas2.restoreToCount(save);
                        }
                        i11 = i4 + 1;
                        f14 = f8;
                        i12 = i5;
                        i8 = i3;
                        f3 = 1.0f;
                    }
                }
            }
            i7 = i2 + 1;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize((int) Math.ceil(a()), i), View.resolveSize((int) Math.ceil(this.r), i2));
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
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
