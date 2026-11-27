// default package

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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class dy2 {
    public float A;
    public float B;
    public boolean C;
    public float D;
    public final boolean E;
    public boolean F;
    public View G;
    public final vnb I;
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
    public int v = aob.jg;
    public int w = aob.kg;
    public int z = 17;
    public byte H = 0;

    public dy2(View view, boolean z, vnb vnbVar) {
        this.G = view;
        this.I = vnbVar;
        this.E = z;
        if (z) {
            Paint paint = new Paint(1);
            this.d = paint;
            paint.setColor(-16777216);
        }
        this.e.setTypeface(hl.o());
        this.e.setTextSize(hl.L(13.0f));
    }

    public final void a(Canvas canvas) {
        float f;
        boolean z;
        Paint paint;
        byte b = this.H;
        if (b != 1 && b != 2) {
            int i = this.v;
            vnb vnbVar = this.I;
            int v0 = aob.v0(i, vnbVar);
            int v02 = aob.v0(this.w, vnbVar);
            if (this.u != v0) {
                this.u = v0;
                this.e.setColor(v0);
            }
            Paint paint2 = this.d;
            if (paint2 != null && this.t != v02) {
                this.t = v02;
                paint2.setColor(v02);
            }
        }
        float f2 = this.l;
        if (f2 == 1.0f) {
            b(canvas);
            return;
        }
        int i2 = this.c;
        if (i2 == 0 || i2 == 1) {
            e(this.s);
            float f3 = (this.s / 2.0f) + this.A;
            float f4 = this.x / 2.0f;
            canvas.save();
            int i3 = this.c;
            float f5 = this.l;
            if (i3 != 0) {
                f5 = 1.0f - f5;
            }
            canvas.scale(f5, f5, f3, f4);
            b(canvas);
            canvas.restore();
            return;
        }
        float f6 = f2 * 2.0f;
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        float L = (this.x - hl.L(23.0f)) / 2.0f;
        int i4 = this.s;
        int i5 = this.r;
        float A = i4 == i5 ? i4 : qd4.A(1.0f, f6, i5, i4 * f6);
        e(A);
        if (this.j) {
            float f7 = this.l;
            f = ((f7 <= 0.5f ? k43.g.getInterpolation(f7 * 2.0f) : k43.i.getInterpolation(1.0f - ((f7 - 0.5f) * 2.0f))) * 0.1f) + 1.0f;
        } else {
            f = 1.0f;
        }
        float f8 = this.B;
        RectF rectF = this.f;
        rectF.set(f8, L, A + f8 + hl.L(11.0f), hl.L(23.0f) + L);
        canvas.save();
        canvas.scale(f, f, rectF.centerX(), rectF.centerY());
        if (this.b != 1.0f) {
            canvas.save();
            float f9 = this.b;
            canvas.scale(f9, f9, rectF.centerX(), rectF.centerY());
            z = true;
        } else {
            z = false;
        }
        if (this.E && (paint = this.d) != null) {
            float f10 = hl.p * 11.5f;
            canvas.drawRoundRect(rectF, f10, f10, paint);
            if (this.g && aob.b1()) {
                float f11 = 11.5f * hl.p;
                canvas.drawRoundRect(rectF, f11, f11, aob.h2);
            }
        }
        if (z) {
            canvas.restore();
        }
        canvas.clipRect(rectF);
        boolean z2 = this.C != this.j;
        if (this.q != null) {
            canvas.save();
            float f12 = this.A;
            float L2 = hl.L(4.0f) + L;
            int L3 = hl.L(13.0f);
            if (!z2) {
                L3 = -L3;
            }
            canvas.translate(f12, qd4.A(1.0f, f6, L3, L2));
            this.e.setAlpha((int) (f6 * 255.0f));
            this.q.draw(canvas);
            canvas.restore();
        } else if (this.n != null) {
            canvas.save();
            float f13 = this.A;
            float L4 = hl.L(4.0f) + L;
            int L5 = hl.L(13.0f);
            if (!z2) {
                L5 = -L5;
            }
            canvas.translate(f13, qd4.A(1.0f, f6, L5, L4));
            this.e.setAlpha((int) (f6 * 255.0f));
            this.n.draw(canvas);
            canvas.restore();
        }
        if (this.o != null) {
            canvas.save();
            canvas.translate(this.A, ((z2 ? -hl.L(13.0f) : hl.L(13.0f)) * f6) + hl.L(4.0f) + L);
            this.e.setAlpha((int) ((1.0f - f6) * 255.0f));
            this.o.draw(canvas);
            canvas.restore();
        }
        if (this.p != null) {
            canvas.save();
            canvas.translate(this.A, L + hl.L(4.0f));
            this.e.setAlpha(jn7.d4);
            this.p.draw(canvas);
            canvas.restore();
        }
        this.e.setAlpha(jn7.d4);
        canvas.restore();
    }

    public final void b(Canvas canvas) {
        boolean z;
        float L = (this.x - hl.L(23.0f)) / 2.0f;
        e(this.s);
        float f = this.B;
        RectF rectF = this.f;
        rectF.set(f, L, this.s + f + hl.L(11.0f), hl.L(23.0f) + L);
        if (this.d != null && this.E) {
            if (this.b != 1.0f) {
                canvas.save();
                float f2 = this.b;
                canvas.scale(f2, f2, rectF.centerX(), rectF.centerY());
                z = true;
            } else {
                z = false;
            }
            float f3 = hl.p * 11.5f;
            canvas.drawRoundRect(rectF, f3, f3, this.d);
            if (this.g && aob.b1()) {
                float f4 = 11.5f * hl.p;
                canvas.drawRoundRect(rectF, f4, f4, aob.h2);
            }
            if (z) {
                canvas.restore();
            }
        }
        if (this.n != null) {
            canvas.save();
            canvas.translate(this.A, L + hl.L(4.0f));
            this.n.draw(canvas);
            canvas.restore();
        }
    }

    public final void c(int i, boolean z) {
        View view;
        View view2;
        String o0 = this.a ? hl.o0(i, 0) : String.valueOf(i);
        if (TextUtils.equals(o0, this.i)) {
            return;
        }
        ValueAnimator valueAnimator = this.k;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (i > 0 && this.F && (view2 = this.G) != null) {
            view2.setVisibility(0);
        }
        boolean z2 = Math.abs(i - this.h) > 99 ? false : z;
        byte b = 1;
        if (!z2) {
            this.h = i;
            this.i = o0;
            if (i == 0) {
                if (!this.F || (view = this.G) == null) {
                    return;
                }
                view.setVisibility(8);
                return;
            }
            this.s = Math.max(hl.L(12.0f), (int) Math.ceil(this.e.measureText(o0.toString())));
            StaticLayout staticLayout = new StaticLayout(o0, this.e, this.s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.n = staticLayout;
            this.m = staticLayout.getLineCount() >= 1 ? this.n.getLineWidth(0) : 0.0f;
            View view3 = this.G;
            if (view3 != null) {
                view3.invalidate();
                return;
            }
            return;
        }
        if (z2) {
            ValueAnimator valueAnimator2 = this.k;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.l = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.k = ofFloat;
            ofFloat.addUpdateListener(new az1(this, (byte) 15));
            this.k.addListener(new cn2(this, b));
            if (this.h <= 0) {
                this.c = 0;
                this.k.setDuration(220L);
                this.k.setInterpolator(new OvershootInterpolator());
            } else if (i == 0) {
                this.c = 1;
                this.k.setDuration(150L);
                this.k.setInterpolator(k43.f);
            } else {
                this.c = 2;
                this.k.setDuration(430L);
                this.k.setInterpolator(k43.f);
            }
            if (this.n != null) {
                String str = this.i;
                if (str.length() == o0.length()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(o0);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(o0);
                    for (int i2 = 0; i2 < str.length(); i2++) {
                        if (str.charAt(i2) == o0.charAt(i2)) {
                            int i3 = i2 + 1;
                            spannableStringBuilder.setSpan(new fy2(b), i2, i3, 0);
                            spannableStringBuilder2.setSpan(new fy2(b), i2, i3, 0);
                        } else {
                            spannableStringBuilder3.setSpan(new fy2(b), i2, i2 + 1, 0);
                        }
                    }
                    int max = Math.max(hl.L(12.0f), (int) Math.ceil(this.e.measureText(str.toString())));
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
            this.j = i > this.h;
            this.k.start();
        }
        if (i > 0) {
            this.s = Math.max(hl.L(12.0f), (int) Math.ceil(this.e.measureText(o0.toString())));
            StaticLayout staticLayout2 = new StaticLayout(o0, this.e, this.s, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.n = staticLayout2;
            this.m = staticLayout2.getLineCount() >= 1 ? this.n.getLineWidth(0) : 0.0f;
        }
        this.h = i;
        this.i = o0;
        View view4 = this.G;
        if (view4 != null) {
            view4.invalidate();
        }
    }

    public final void d(int i, int i2) {
        if (i != this.x) {
            int i3 = this.h;
            this.h = -1;
            c(i3, this.c == 0);
            this.x = i;
        }
        this.y = i2;
    }

    public final void e(float f) {
        float f2;
        float L = this.E ? hl.L(5.5f) : 0.0f;
        int i = this.z;
        if (i == 5) {
            float f3 = this.y - L;
            this.A = f3;
            float f4 = this.D;
            if (f4 != 0.0f) {
                f2 = f3 - Math.max((f / 2.0f) + f4, f);
                this.A = f2;
            } else {
                f2 = f3 - f;
                this.A = f2;
            }
        } else if (i == 3) {
            this.A = L;
            f2 = L;
        } else {
            f2 = (int) ((this.y - f) / 2.0f);
            this.A = f2;
        }
        this.B = f2 - L;
    }
}
