package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.OvershootInterpolator;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class bq {
    public float A;
    public float B;
    public boolean D;
    public float E;
    public final boolean F;
    public boolean G;
    public View H;
    public final org.telegram.ui.ActionBar.f6 J;
    public boolean a;
    public Paint d;
    public boolean g;
    public int h;
    public String i;
    public boolean j;
    public ValueAnimator k;
    public float m;
    public StaticLayout n;
    public StaticLayout o;
    public StaticLayout p;
    public StaticLayout q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int x;
    public int y;
    public float b = 1.0f;
    public int c = -1;
    public TextPaint e = new TextPaint(1);
    public final RectF f = new RectF();
    public float l = 1.0f;
    public int v = org.telegram.ui.ActionBar.k6.gg;
    public int w = org.telegram.ui.ActionBar.k6.hg;
    public int z = 17;
    public final float C = 11.5f;
    public int I = 0;

    public bq(View view, boolean z9, org.telegram.ui.ActionBar.f6 f6Var) {
        this.H = view;
        this.J = f6Var;
        this.F = z9;
        if (z9) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(-16777216);
        }
        this.e.setTypeface(org.telegram.messenger.g0.o());
        this.e.setTextSize(org.telegram.messenger.g0.L(13.0f));
    }

    public final void a(Canvas canvas) {
        float f10;
        boolean z9;
        Paint paint;
        int i7 = this.I;
        if (i7 != 1 && i7 != 2) {
            int i10 = this.v;
            org.telegram.ui.ActionBar.f6 f6Var = this.J;
            int w02 = org.telegram.ui.ActionBar.k6.w0(i10, f6Var);
            int w03 = org.telegram.ui.ActionBar.k6.w0(this.w, f6Var);
            if (this.u != w02) {
                this.u = w02;
                this.e.setColor(w02);
            }
            Paint paint2 = this.d;
            if (paint2 != null && this.t != w03) {
                this.t = w03;
                paint2.setColor(w03);
            }
        }
        float f11 = this.l;
        if (f11 == 1.0f) {
            b(canvas);
            return;
        }
        int i11 = this.c;
        if (i11 == 0 || i11 == 1) {
            e(this.s);
            float f12 = (this.s / 2.0f) + this.A;
            float f13 = this.x / 2.0f;
            canvas.save();
            float f14 = this.c == 0 ? this.l : 1.0f - this.l;
            canvas.scale(f14, f14, f12, f13);
            b(canvas);
            canvas.restore();
            return;
        }
        float f15 = f11 * 2.0f;
        if (f15 > 1.0f) {
            f15 = 1.0f;
        }
        int i12 = this.x;
        float f16 = this.C;
        float f17 = f16 * 2.0f;
        float L = (i12 - org.telegram.messenger.g0.L(f17)) / 2.0f;
        int i13 = this.s;
        int i14 = this.r;
        float z10 = i13 == i14 ? i13 : com.google.android.recaptcha.internal.a.z(1.0f, f15, i14, i13 * f15);
        e(z10);
        if (this.j) {
            float f18 = this.l;
            f10 = ((f18 <= 0.5f ? xq.g.getInterpolation(f18 * 2.0f) : xq.i.getInterpolation(1.0f - ((f18 - 0.5f) * 2.0f))) * 0.1f) + 1.0f;
        } else {
            f10 = 1.0f;
        }
        float f19 = this.B;
        RectF rectF = this.f;
        rectF.set(f19, L, z10 + f19 + org.telegram.messenger.g0.L(f16 - 0.5f), org.telegram.messenger.g0.L(f17) + L);
        canvas.save();
        canvas.scale(f10, f10, rectF.centerX(), rectF.centerY());
        if (this.b != 1.0f) {
            canvas.save();
            float f20 = this.b;
            canvas.scale(f20, f20, rectF.centerX(), rectF.centerY());
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.F && (paint = this.d) != null) {
            float f21 = org.telegram.messenger.g0.p * f16;
            canvas.drawRoundRect(rectF, f21, f21, paint);
            if (this.g && org.telegram.ui.ActionBar.k6.d1()) {
                float f22 = f16 * org.telegram.messenger.g0.p;
                canvas.drawRoundRect(rectF, f22, f22, org.telegram.ui.ActionBar.k6.h2);
            }
        }
        if (z9) {
            canvas.restore();
        }
        canvas.clipRect(rectF);
        boolean z11 = this.D != this.j;
        if (this.q != null) {
            canvas.save();
            float f23 = this.A;
            float L2 = org.telegram.messenger.g0.L(4.0f) + L;
            int L3 = org.telegram.messenger.g0.L(13.0f);
            if (!z11) {
                L3 = -L3;
            }
            canvas.translate(f23, com.google.android.recaptcha.internal.a.z(1.0f, f15, L3, L2));
            this.e.setAlpha((int) (f15 * 255.0f));
            this.q.draw(canvas);
            canvas.restore();
        } else if (this.n != null) {
            canvas.save();
            float f24 = this.A;
            float L4 = org.telegram.messenger.g0.L(4.0f) + L;
            int L5 = org.telegram.messenger.g0.L(13.0f);
            if (!z11) {
                L5 = -L5;
            }
            canvas.translate(f24, com.google.android.recaptcha.internal.a.z(1.0f, f15, L5, L4));
            this.e.setAlpha((int) (f15 * 255.0f));
            this.n.draw(canvas);
            canvas.restore();
        }
        if (this.o != null) {
            canvas.save();
            canvas.translate(this.A, ((z11 ? -org.telegram.messenger.g0.L(13.0f) : org.telegram.messenger.g0.L(13.0f)) * f15) + org.telegram.messenger.g0.L(4.0f) + L);
            this.e.setAlpha((int) ((1.0f - f15) * 255.0f));
            this.o.draw(canvas);
            canvas.restore();
        }
        if (this.p != null) {
            canvas.save();
            canvas.translate(this.A, L + org.telegram.messenger.g0.L(4.0f));
            this.e.setAlpha(org.telegram.messenger.qs.e4);
            this.p.draw(canvas);
            canvas.restore();
        }
        this.e.setAlpha(org.telegram.messenger.qs.e4);
        canvas.restore();
    }

    public final void b(Canvas canvas) {
        boolean z9;
        float f10 = this.C;
        float f11 = f10 * 2.0f;
        float L = (this.x - org.telegram.messenger.g0.L(f11)) / 2.0f;
        e(this.s);
        float f12 = this.B;
        RectF rectF = this.f;
        rectF.set(f12, L, this.s + f12 + org.telegram.messenger.g0.L(f10 - 0.5f), org.telegram.messenger.g0.L(f11) + L);
        if (this.d != null && this.F) {
            if (this.b != 1.0f) {
                canvas.save();
                float f13 = this.b;
                canvas.scale(f13, f13, rectF.centerX(), rectF.centerY());
                z9 = true;
            } else {
                z9 = false;
            }
            float f14 = org.telegram.messenger.g0.p * f10;
            canvas.drawRoundRect(rectF, f14, f14, this.d);
            if (this.g && org.telegram.ui.ActionBar.k6.d1()) {
                float f15 = f10 * org.telegram.messenger.g0.p;
                canvas.drawRoundRect(rectF, f15, f15, org.telegram.ui.ActionBar.k6.h2);
            }
            if (z9) {
                canvas.restore();
            }
        }
        if (this.n != null) {
            canvas.save();
            canvas.translate(this.A, L + org.telegram.messenger.g0.L(4.0f));
            this.n.draw(canvas);
            canvas.restore();
        }
    }

    public final void c(int i7, boolean z9) {
        View view;
        View view2;
        boolean z10 = false;
        String o02 = this.a ? org.telegram.messenger.g0.o0(i7, 0) : String.valueOf(i7);
        if (TextUtils.equals(o02, this.i)) {
            return;
        }
        ValueAnimator valueAnimator = this.k;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (i7 > 0 && this.G && (view2 = this.H) != null) {
            view2.setVisibility(0);
        }
        boolean z11 = Math.abs(i7 - this.h) > 99 ? false : z9;
        if (!z11) {
            this.h = i7;
            this.i = o02;
            if (i7 == 0) {
                if (!this.G || (view = this.H) == null) {
                    return;
                }
                view.setVisibility(8);
                return;
            }
            this.s = Math.max(org.telegram.messenger.g0.L(12.0f), (int) Math.ceil(this.e.measureText(o02.toString())));
            StaticLayout staticLayout = new StaticLayout(o02, this.e, this.s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.n = staticLayout;
            this.m = staticLayout.getLineCount() >= 1 ? this.n.getLineWidth(0) : 0.0f;
            View view3 = this.H;
            if (view3 != null) {
                view3.invalidate();
                return;
            }
            return;
        }
        if (z11) {
            ValueAnimator valueAnimator2 = this.k;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.k = ofFloat;
            ofFloat.addUpdateListener(new e6(this, 15));
            this.k.addListener(new z5(this, 20));
            if (this.h <= 0) {
                this.c = 0;
                this.k.setDuration(220L);
                this.k.setInterpolator(new OvershootInterpolator());
            } else if (i7 == 0) {
                this.c = 1;
                this.k.setDuration(150L);
                this.k.setInterpolator(xq.f);
            } else {
                this.c = 2;
                this.k.setDuration(430L);
                this.k.setInterpolator(xq.f);
            }
            if (this.n != null) {
                String str = this.i;
                if (str.length() == o02.length()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(o02);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(o02);
                    for (int i10 = 0; i10 < str.length(); i10++) {
                        if (str.charAt(i10) == o02.charAt(i10)) {
                            int i11 = i10 + 1;
                            spannableStringBuilder.setSpan(new iy(z10), i10, i11, 0);
                            spannableStringBuilder2.setSpan(new iy(z10), i10, i11, 0);
                        } else {
                            spannableStringBuilder3.setSpan(new iy(z10), i10, i10 + 1, 0);
                        }
                    }
                    int max = Math.max(org.telegram.messenger.g0.L(12.0f), (int) Math.ceil(this.e.measureText(str.toString())));
                    TextPaint textPaint = this.e;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    this.o = new StaticLayout(spannableStringBuilder, textPaint, max, alignment, 1.0f, 0.0f, false);
                    this.p = new StaticLayout(spannableStringBuilder3, this.e, max, alignment, 1.0f, 0.0f, false);
                    this.q = new StaticLayout(spannableStringBuilder2, this.e, max, alignment, 1.0f, 0.0f, false);
                } else {
                    this.o = this.n;
                }
            }
            this.r = this.s;
            this.j = i7 > this.h;
            this.k.start();
        }
        if (i7 > 0) {
            this.s = Math.max(org.telegram.messenger.g0.L(12.0f), (int) Math.ceil(this.e.measureText(o02.toString())));
            StaticLayout staticLayout2 = new StaticLayout(o02, this.e, this.s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.n = staticLayout2;
            this.m = staticLayout2.getLineCount() >= 1 ? this.n.getLineWidth(0) : 0.0f;
        }
        this.h = i7;
        this.i = o02;
        View view4 = this.H;
        if (view4 != null) {
            view4.invalidate();
        }
    }

    public final void d(int i7, int i10) {
        if (i7 != this.x) {
            int i11 = this.h;
            this.h = -1;
            c(i11, this.c == 0);
            this.x = i7;
        }
        this.y = i10;
    }

    public final void e(float f10) {
        float L = this.F ? org.telegram.messenger.g0.L(5.5f) : 0.0f;
        int i7 = this.z;
        if (i7 == 5) {
            float f11 = this.y - L;
            this.A = f11;
            float f12 = this.E;
            if (f12 != 0.0f) {
                this.A = f11 - Math.max((f10 / 2.0f) + f12, f10);
            } else {
                this.A = f11 - f10;
            }
        } else if (i7 == 3) {
            this.A = L;
        } else {
            this.A = (int) ((this.y - f10) / 2.0f);
        }
        this.B = this.A - L;
    }
}
