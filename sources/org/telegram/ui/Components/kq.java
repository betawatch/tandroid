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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kq {
    public float A;
    public float B;
    public boolean D;
    public float E;
    public final boolean F;
    public boolean G;
    public View H;
    public final org.telegram.ui.ActionBar.p6 J;
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
    public int v = org.telegram.ui.ActionBar.t6.gg;
    public int w = org.telegram.ui.ActionBar.t6.hg;
    public int z = 17;
    public final float C = 11.5f;
    public int I = 0;

    public kq(View view, boolean z10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.H = view;
        this.J = p6Var;
        this.F = z10;
        if (z10) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(-16777216);
        }
        this.e.setTypeface(org.telegram.messenger.i0.o());
        this.e.setTextSize(org.telegram.messenger.i0.L(13.0f));
    }

    public final void a(Canvas canvas) {
        float f7;
        boolean z10;
        Paint paint;
        int i10 = this.I;
        if (i10 != 1 && i10 != 2) {
            int i11 = this.v;
            org.telegram.ui.ActionBar.p6 p6Var = this.J;
            int w02 = org.telegram.ui.ActionBar.t6.w0(i11, p6Var);
            int w03 = org.telegram.ui.ActionBar.t6.w0(this.w, p6Var);
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
        float f10 = this.l;
        if (f10 == 1.0f) {
            b(canvas);
            return;
        }
        int i12 = this.c;
        if (i12 == 0 || i12 == 1) {
            e(this.s);
            float f11 = (this.s / 2.0f) + this.A;
            float f12 = this.x / 2.0f;
            canvas.save();
            float f13 = this.c == 0 ? this.l : 1.0f - this.l;
            canvas.scale(f13, f13, f11, f12);
            b(canvas);
            canvas.restore();
            return;
        }
        float f14 = f10 * 2.0f;
        if (f14 > 1.0f) {
            f14 = 1.0f;
        }
        int i13 = this.x;
        float f15 = this.C;
        float f16 = f15 * 2.0f;
        float L = (i13 - org.telegram.messenger.i0.L(f16)) / 2.0f;
        int i14 = this.s;
        int i15 = this.r;
        float z11 = i14 == i15 ? i14 : c3.i0.z(1.0f, f14, i15, i14 * f14);
        e(z11);
        if (this.j) {
            float f17 = this.l;
            f7 = ((f17 <= 0.5f ? gr.g.getInterpolation(f17 * 2.0f) : gr.i.getInterpolation(1.0f - ((f17 - 0.5f) * 2.0f))) * 0.1f) + 1.0f;
        } else {
            f7 = 1.0f;
        }
        float f18 = this.B;
        RectF rectF = this.f;
        rectF.set(f18, L, z11 + f18 + org.telegram.messenger.i0.L(f15 - 0.5f), org.telegram.messenger.i0.L(f16) + L);
        canvas.save();
        canvas.scale(f7, f7, rectF.centerX(), rectF.centerY());
        if (this.b != 1.0f) {
            canvas.save();
            float f19 = this.b;
            canvas.scale(f19, f19, rectF.centerX(), rectF.centerY());
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.F && (paint = this.d) != null) {
            float f20 = org.telegram.messenger.i0.p * f15;
            canvas.drawRoundRect(rectF, f20, f20, paint);
            if (this.g && org.telegram.ui.ActionBar.t6.d1()) {
                float f21 = f15 * org.telegram.messenger.i0.p;
                canvas.drawRoundRect(rectF, f21, f21, org.telegram.ui.ActionBar.t6.h2);
            }
        }
        if (z10) {
            canvas.restore();
        }
        canvas.clipRect(rectF);
        boolean z12 = this.D != this.j;
        if (this.q != null) {
            canvas.save();
            float f22 = this.A;
            float L2 = org.telegram.messenger.i0.L(4.0f) + L;
            int L3 = org.telegram.messenger.i0.L(13.0f);
            if (!z12) {
                L3 = -L3;
            }
            canvas.translate(f22, c3.i0.z(1.0f, f14, L3, L2));
            this.e.setAlpha((int) (f14 * 255.0f));
            this.q.draw(canvas);
            canvas.restore();
        } else if (this.n != null) {
            canvas.save();
            float f23 = this.A;
            float L4 = org.telegram.messenger.i0.L(4.0f) + L;
            int L5 = org.telegram.messenger.i0.L(13.0f);
            if (!z12) {
                L5 = -L5;
            }
            canvas.translate(f23, c3.i0.z(1.0f, f14, L5, L4));
            this.e.setAlpha((int) (f14 * 255.0f));
            this.n.draw(canvas);
            canvas.restore();
        }
        if (this.o != null) {
            canvas.save();
            canvas.translate(this.A, ((z12 ? -org.telegram.messenger.i0.L(13.0f) : org.telegram.messenger.i0.L(13.0f)) * f14) + org.telegram.messenger.i0.L(4.0f) + L);
            this.e.setAlpha((int) ((1.0f - f14) * 255.0f));
            this.o.draw(canvas);
            canvas.restore();
        }
        if (this.p != null) {
            canvas.save();
            canvas.translate(this.A, L + org.telegram.messenger.i0.L(4.0f));
            this.e.setAlpha(org.telegram.messenger.zs.e4);
            this.p.draw(canvas);
            canvas.restore();
        }
        this.e.setAlpha(org.telegram.messenger.zs.e4);
        canvas.restore();
    }

    public final void b(Canvas canvas) {
        boolean z10;
        float f7 = this.C;
        float f10 = f7 * 2.0f;
        float L = (this.x - org.telegram.messenger.i0.L(f10)) / 2.0f;
        e(this.s);
        float f11 = this.B;
        RectF rectF = this.f;
        rectF.set(f11, L, this.s + f11 + org.telegram.messenger.i0.L(f7 - 0.5f), org.telegram.messenger.i0.L(f10) + L);
        if (this.d != null && this.F) {
            if (this.b != 1.0f) {
                canvas.save();
                float f12 = this.b;
                canvas.scale(f12, f12, rectF.centerX(), rectF.centerY());
                z10 = true;
            } else {
                z10 = false;
            }
            float f13 = org.telegram.messenger.i0.p * f7;
            canvas.drawRoundRect(rectF, f13, f13, this.d);
            if (this.g && org.telegram.ui.ActionBar.t6.d1()) {
                float f14 = f7 * org.telegram.messenger.i0.p;
                canvas.drawRoundRect(rectF, f14, f14, org.telegram.ui.ActionBar.t6.h2);
            }
            if (z10) {
                canvas.restore();
            }
        }
        if (this.n != null) {
            canvas.save();
            canvas.translate(this.A, L + org.telegram.messenger.i0.L(4.0f));
            this.n.draw(canvas);
            canvas.restore();
        }
    }

    public final void c(int i10, boolean z10) {
        View view;
        View view2;
        boolean z11 = false;
        String o02 = this.a ? org.telegram.messenger.i0.o0(i10, 0) : String.valueOf(i10);
        if (TextUtils.equals(o02, this.i)) {
            return;
        }
        ValueAnimator valueAnimator = this.k;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (i10 > 0 && this.G && (view2 = this.H) != null) {
            view2.setVisibility(0);
        }
        boolean z12 = Math.abs(i10 - this.h) > 99 ? false : z10;
        if (!z12) {
            this.h = i10;
            this.i = o02;
            if (i10 == 0) {
                if (!this.G || (view = this.H) == null) {
                    return;
                }
                view.setVisibility(8);
                return;
            }
            this.s = Math.max(org.telegram.messenger.i0.L(12.0f), (int) Math.ceil(this.e.measureText(o02.toString())));
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
        if (z12) {
            ValueAnimator valueAnimator2 = this.k;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.k = ofFloat;
            ofFloat.addUpdateListener(new a6(this, 15));
            this.k.addListener(new w5(this, 20));
            if (this.h <= 0) {
                this.c = 0;
                this.k.setDuration(220L);
                this.k.setInterpolator(new OvershootInterpolator());
            } else if (i10 == 0) {
                this.c = 1;
                this.k.setDuration(150L);
                this.k.setInterpolator(gr.f);
            } else {
                this.c = 2;
                this.k.setDuration(430L);
                this.k.setInterpolator(gr.f);
            }
            if (this.n != null) {
                String str = this.i;
                if (str.length() == o02.length()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(o02);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(o02);
                    for (int i11 = 0; i11 < str.length(); i11++) {
                        if (str.charAt(i11) == o02.charAt(i11)) {
                            int i12 = i11 + 1;
                            spannableStringBuilder.setSpan(new wy(z11), i11, i12, 0);
                            spannableStringBuilder2.setSpan(new wy(z11), i11, i12, 0);
                        } else {
                            spannableStringBuilder3.setSpan(new wy(z11), i11, i11 + 1, 0);
                        }
                    }
                    int max = Math.max(org.telegram.messenger.i0.L(12.0f), (int) Math.ceil(this.e.measureText(str.toString())));
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
            this.j = i10 > this.h;
            this.k.start();
        }
        if (i10 > 0) {
            this.s = Math.max(org.telegram.messenger.i0.L(12.0f), (int) Math.ceil(this.e.measureText(o02.toString())));
            StaticLayout staticLayout2 = new StaticLayout(o02, this.e, this.s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.n = staticLayout2;
            this.m = staticLayout2.getLineCount() >= 1 ? this.n.getLineWidth(0) : 0.0f;
        }
        this.h = i10;
        this.i = o02;
        View view4 = this.H;
        if (view4 != null) {
            view4.invalidate();
        }
    }

    public final void d(int i10, int i11) {
        if (i10 != this.x) {
            int i12 = this.h;
            this.h = -1;
            c(i12, this.c == 0);
            this.x = i10;
        }
        this.y = i11;
    }

    public final void e(float f7) {
        float L = this.F ? org.telegram.messenger.i0.L(5.5f) : 0.0f;
        int i10 = this.z;
        if (i10 == 5) {
            float f10 = this.y - L;
            this.A = f10;
            float f11 = this.E;
            if (f11 != 0.0f) {
                this.A = f10 - Math.max((f7 / 2.0f) + f11, f7);
            } else {
                this.A = f10 - f7;
            }
        } else if (i10 == 3) {
            this.A = L;
        } else {
            this.A = (int) ((this.y - f7) / 2.0f);
        }
        this.B = this.A - L;
    }
}
