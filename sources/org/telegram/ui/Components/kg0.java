package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.beta.R;
import org.telegram.ui.t91;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public abstract class kg0 {
    public ValueAnimator A;
    public AnimatorSet B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.Cells.t2 H;
    public pj0 I;
    public float J;
    public float K;
    public float L;
    public float M;
    public final CharSequence N;
    public StaticLayout O;
    public float P;
    public float Q;
    public float R;
    public final CharSequence S;
    public StaticLayout T;
    public float U;
    public float V;
    public float W;
    public boolean X;
    public boolean Y;
    public final float Z;
    public int a;
    public final jg0 a0;
    public final jg0 b0;
    public int c0;
    public final et d0;
    public boolean e0;
    public final TextPaint k;
    public final di.j0 l;
    public final Drawable m;
    public final Path n;
    public float o;
    public float p;
    public boolean q;
    public boolean r;
    public ValueAnimator s;
    public ValueAnimator t;
    public ValueAnimator u;
    public float v;
    public float w;
    public float x;
    public boolean y;
    public ValueAnimator z;
    public final int b = org.telegram.ui.ActionBar.k6.R9;
    public final int c = org.telegram.ui.ActionBar.k6.S9;
    public final int d = org.telegram.ui.ActionBar.k6.N7;
    public final boolean e = true;
    public final Paint f = new Paint(1);
    public final Paint g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint i = new Paint();
    public final RectF j = new RectF();

    public kg0(CharSequence charSequence, CharSequence charSequence2) {
        TextPaint textPaint = new TextPaint(1);
        this.k = textPaint;
        di.j0 j0Var = new di.j0();
        j0Var.b = new Path();
        j0Var.d = new Paint(1);
        j0Var.f();
        this.l = j0Var;
        this.n = new Path();
        this.o = 1.0f;
        this.p = 1.0f;
        this.v = 1.0f;
        this.w = 1.0f;
        this.P = 1.0f;
        this.U = 1.0f;
        this.a0 = new jg0(this, 3);
        this.b0 = new jg0(this, 4);
        this.d0 = new et(this, 9);
        this.e0 = false;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(16.0f));
        this.Z = ViewConfiguration.get(org.telegram.messenger.t0.b).getScaledTouchSlop();
        this.N = charSequence;
        this.S = charSequence2;
        try {
            this.m = org.telegram.messenger.t0.b.getResources().getDrawable(R.drawable.msg_filled_general).mutate();
        } catch (Exception unused) {
        }
    }

    public final void a(boolean z9) {
        if (this.G != z9) {
            this.G = z9;
            if (z9) {
                ValueAnimator valueAnimator = this.t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.t = null;
                }
                this.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.t = ofFloat;
                ofFloat.addUpdateListener(new jg0(this, 0));
                this.t.setInterpolator(org.telegram.messenger.g0.G);
                this.t.setDuration(230L);
                this.t.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.u;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.u = null;
            }
            this.w = 0.0f;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.u = ofFloat2;
            ofFloat2.addUpdateListener(new jg0(this, 1));
            this.u.setInterpolator(org.telegram.messenger.g0.G);
            this.u.setDuration(230L);
            this.u.start();
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.z;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        org.telegram.ui.Cells.t2 t2Var = this.H;
        if (t2Var != null) {
            t2Var.removeCallbacks(this.d0);
        }
        ValueAnimator valueAnimator3 = this.t;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.o = 1.0f;
        this.p = 1.0f;
        this.q = false;
        this.r = false;
        this.y = false;
        this.e0 = false;
        this.x = 0.0f;
        this.Y = true;
        e(1.0f);
        this.G = false;
        this.v = 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(Canvas canvas, boolean z9) {
        org.telegram.ui.Cells.t2 t2Var;
        int i7;
        int i10;
        int i11;
        boolean z10;
        int i12;
        float f10;
        int i13;
        float f11;
        int i14;
        float f12;
        int i15;
        int i16;
        int x02;
        int i17;
        float f13;
        float f14;
        if (!this.X || this.Y || (t2Var = this.H) == null || this.I == null) {
            return;
        }
        boolean z11 = t2Var instanceof t91;
        int L = org.telegram.messenger.g0.L(z11 ? 15.0f : 28.0f);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int L3 = org.telegram.messenger.g0.L(9.0f);
        int L4 = org.telegram.messenger.g0.L(18.0f);
        int d = (int) d();
        int height = (int) (this.H.getHeight() * this.J);
        float f15 = this.F ? (this.D * 0.07f) - 0.05f : this.D * 0.02f;
        int width = (this.H.getWidth() - (L * 4)) - org.telegram.messenger.g0.L(16.0f);
        if (width != this.c0) {
            int i18 = org.telegram.messenger.g0.q.x;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            i10 = 0;
            CharSequence charSequence = this.N;
            TextPaint textPaint = this.k;
            this.O = new StaticLayout(charSequence, textPaint, i18, alignment, 1.0f, 0.0f, false);
            float f16 = 0.0f;
            for (int i19 = 0; i19 < this.O.getLineCount(); i19++) {
                f16 = Math.max(f16, this.O.getLineWidth(i19));
            }
            float f17 = width;
            this.P = Math.min(1.0f, f17 / f16);
            int ceil = (int) Math.ceil(f16);
            if (this.P < 0.8f) {
                this.P = 0.8f;
                ceil = fi.m3.a(this.N, textPaint);
            }
            int i20 = ceil;
            this.O = new StaticLayout(this.N, textPaint, i20, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.Q = i20;
            this.R = 0.0f;
            for (int i21 = 0; i21 < this.O.getLineCount(); i21++) {
                this.Q = Math.min(this.Q, this.O.getLineLeft(i21));
                this.R = Math.max(this.R, this.O.getLineWidth(i21));
            }
            this.T = new StaticLayout(this.S, textPaint, org.telegram.messenger.g0.q.x, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            float f18 = 0.0f;
            for (int i22 = 0; i22 < this.T.getLineCount(); i22++) {
                f18 = Math.max(f18, this.T.getLineWidth(i22));
            }
            this.U = Math.min(1.0f, f17 / f18);
            i7 = L4;
            int ceil2 = (int) Math.ceil(f18);
            if (this.U < 0.8f) {
                this.U = 0.8f;
                ceil2 = fi.m3.a(this.S, textPaint);
            }
            int i23 = ceil2;
            this.T = new StaticLayout(this.S, textPaint, i23, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.V = i23;
            this.W = 0.0f;
            for (int i24 = 0; i24 < this.T.getLineCount(); i24++) {
                this.V = Math.min(this.V, this.T.getLineLeft(i24));
                this.W = Math.max(this.W, this.T.getLineWidth(i24));
            }
            this.c0 = width;
        } else {
            i7 = L4;
            i10 = 0;
        }
        boolean z12 = this.J > 0.85f ? 1 : i10;
        if (this.q != z12) {
            this.q = z12;
            if (this.x == 0.0f) {
                ValueAnimator valueAnimator = this.s;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.o = z12 != 0 ? 0.0f : 1.0f;
            } else {
                ValueAnimator valueAnimator2 = this.s;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                float f19 = this.o;
                float f20 = z12 != 0 ? 0.0f : 1.0f;
                float[] fArr = new float[2];
                fArr[i10] = f19;
                fArr[1] = f20;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                this.s = ofFloat;
                ofFloat.addUpdateListener(this.a0);
                this.s.setInterpolator(new LinearInterpolator());
                this.s.setDuration(170L);
                this.s.start();
            }
        }
        if (z12 != this.r) {
            this.r = z12;
            ValueAnimator valueAnimator3 = this.A;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            float f21 = this.p;
            float f22 = this.r ? 0.0f : 1.0f;
            float[] fArr2 = new float[2];
            fArr2[i10] = f21;
            fArr2[1] = f22;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
            this.A = ofFloat2;
            ofFloat2.addUpdateListener(new jg0(this, 2));
            this.A.setInterpolator(xq.j);
            this.A.setDuration(250L);
            this.A.start();
        }
        float f23 = this.C * 2.0f;
        if (f23 > 1.0f) {
            f23 = 1.0f;
        }
        float f24 = this.L;
        float f25 = this.K;
        if (z9) {
            f25 += d;
        }
        int i25 = L + L3;
        int measuredHeight = (this.H.getMeasuredHeight() - L2) - L3;
        if (z9) {
            measuredHeight += d;
        }
        int i26 = (L2 * 2) + i7;
        float f26 = f23;
        float f27 = height > i26 ? 1.0f : height / i26;
        canvas.save();
        float f28 = f27;
        if (z9) {
            i11 = d;
            z10 = z11;
            int i27 = i10;
            canvas.clipRect(i27, i27, this.I.getMeasuredWidth(), i11 + 1);
        } else {
            i11 = d;
            z10 = z11;
        }
        float f29 = this.C;
        Paint paint = this.i;
        RectF rectF = this.j;
        if (f29 == 0.0f) {
            if (this.v != 1.0f && this.w != 1.0f) {
                canvas.drawPaint(paint);
            }
            f11 = f25;
            i12 = i7;
            i13 = L3;
            f10 = f15;
        } else {
            float f30 = this.M;
            i12 = i7;
            f10 = f15;
            i13 = L3;
            float z13 = com.google.android.recaptcha.internal.a.z(1.0f, this.C, this.H.getWidth() - this.M, (f30 * f15) + f30);
            if (this.v != 1.0f && this.w != 1.0f) {
                canvas.drawCircle(f24, f25, z13, paint);
            }
            Path path = this.n;
            path.reset();
            f11 = f25;
            rectF.set(f24 - z13, f25 - z13, f24 + z13, f11 + z13);
            path.addOval(rectF, Path.Direction.CW);
            canvas.clipPath(path);
        }
        boolean z14 = this.G;
        Paint paint2 = this.h;
        if (z14) {
            if (this.w > this.v) {
                canvas.save();
                float f31 = i25;
                float f32 = this.C;
                float f33 = measuredHeight;
                canvas.translate((f24 - f31) * f32, f32 * (f11 - f33));
                canvas.drawCircle(f31, f33, this.H.getWidth() * this.w, paint);
                canvas.restore();
            }
            if (this.v > 0.0f) {
                canvas.save();
                float f34 = i25;
                float f35 = this.C;
                float f36 = measuredHeight;
                canvas.translate((f24 - f34) * f35, (f11 - f36) * f35);
                canvas.drawCircle(f34, f36, this.H.getWidth() * this.v, paint2);
                canvas.restore();
            }
        } else {
            if (this.v > this.w) {
                canvas.save();
                float f37 = i25;
                float f38 = this.C;
                float f39 = measuredHeight;
                canvas.translate((f24 - f37) * f38, f38 * (f11 - f39));
                canvas.drawCircle(f37, f39, this.H.getWidth() * this.v, paint2);
                canvas.restore();
            }
            if (this.w > 0.0f) {
                canvas.save();
                float f40 = i25;
                float f41 = this.C;
                float f42 = measuredHeight;
                canvas.translate((f24 - f40) * f41, f41 * (f11 - f42));
                canvas.drawCircle(f40, f42, this.H.getWidth() * this.w, paint);
                canvas.restore();
            }
        }
        if (height > i26) {
            Paint paint3 = this.f;
            paint3.setAlpha((int) ((1.0f - f26) * 0.4f * f28 * 255.0f));
            if (z9) {
                rectF.set(L, L2, L + i12, L2 + i11 + i13);
            } else {
                rectF.set(L, ((this.H.getHeight() - height) + L2) - i11, L + i12, this.H.getHeight() - L2);
            }
            i14 = i13;
            float f43 = i14;
            canvas.drawRoundRect(rectF, f43, f43, paint3);
        } else {
            i14 = i13;
        }
        if (z9) {
            canvas.restore();
            return;
        }
        if (z10) {
            measuredHeight = (int) (measuredHeight - ((this.H.getMeasuredHeight() - org.telegram.messenger.g0.L(41.0f)) * this.C));
        }
        float f44 = this.C;
        if (f44 == 0.0f || z10) {
            Paint paint4 = this.g;
            paint4.setAlpha((int) ((1.0f - f44) * f28 * 255.0f));
            float f45 = i25;
            float f46 = measuredHeight;
            canvas.drawCircle(f45, f46, i14, paint4);
            di.j0 j0Var = this.l;
            j0Var.getClass();
            int L5 = org.telegram.messenger.g0.L(18.0f);
            int L6 = org.telegram.messenger.g0.L(18.0f) >> 1;
            f12 = 255.0f;
            int i28 = L5 >> 1;
            i15 = L;
            j0Var.setBounds(i25 - L6, measuredHeight - i28, i25 + L6, measuredHeight + i28);
            float f47 = 1.0f - this.p;
            if (f47 < 0.0f) {
                f47 = 0.0f;
            }
            float f48 = 1.0f - f47;
            canvas.save();
            canvas.rotate(180.0f * f48, f45, f46);
            canvas.translate(0.0f, (org.telegram.messenger.g0.N(1.0f) * 1.0f) - f48);
            if (this.G) {
                x02 = paint2.getColor();
                i16 = 0;
            } else {
                i16 = 0;
                x02 = org.telegram.ui.ActionBar.k6.x0(null, this.b, false);
            }
            ((Paint) j0Var.d).setColor(x02);
            j0Var.draw(canvas);
            canvas.restore();
        } else {
            i15 = L;
            f12 = 255.0f;
            i16 = 0;
        }
        if (this.J > 0.0f && !this.y) {
            if (Math.abs(this.a) >= this.Z * 0.5f) {
                this.e0 = true;
                org.telegram.ui.Cells.t2 t2Var2 = this.H;
                et etVar = this.d0;
                t2Var2.removeCallbacks(etVar);
                this.H.postDelayed(etVar, 200L);
            } else if (!this.e0) {
                this.x = 1.0f;
                this.y = true;
            }
        }
        float height2 = (this.H.getHeight() - (i26 / 2.0f)) + org.telegram.messenger.g0.L(6.0f);
        float width2 = (this.H.getWidth() + (z10 ? i15 * 2 : i16)) / 2.0f;
        if (this.O != null) {
            float f49 = this.o;
            if (f49 > 0.0f && f49 < 1.0f) {
                canvas.save();
                float f50 = (this.o * 0.2f) + 0.8f;
                canvas.scale(f50, f50, width2, com.google.android.recaptcha.internal.a.z(1.0f, this.o, org.telegram.messenger.g0.L(16.0f), height2));
            }
            i17 = i25;
            f13 = f28;
            f14 = f11;
            canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (this.o * f12 * f28 * this.x), 31);
            canvas.translate((width2 - this.Q) - (this.R / 2.0f), com.google.android.recaptcha.internal.a.z(1.0f, this.o, org.telegram.messenger.g0.L(8.0f), height2) - this.O.getHeight());
            float f51 = this.P;
            canvas.scale(f51, f51, (this.R / 2.0f) + this.Q, this.O.getHeight());
            this.O.draw(canvas);
            canvas.restore();
            float f52 = this.o;
            if (f52 > 0.0f && f52 < 1.0f) {
                canvas.restore();
            }
        } else {
            i17 = i25;
            f13 = f28;
            f14 = f11;
        }
        if (this.T != null) {
            float f53 = this.o;
            if (f53 > 0.0f && f53 < 1.0f) {
                canvas.save();
                float z15 = com.google.android.recaptcha.internal.a.z(1.0f, this.o, 0.1f, 0.9f);
                canvas.scale(z15, z15, width2, height2 - (org.telegram.messenger.g0.L(8.0f) * this.o));
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (org.telegram.messenger.k5.A(1.0f, this.o, f12, f13) * this.x), 31);
            canvas.translate((width2 - this.V) - (this.W / 2.0f), ((org.telegram.messenger.g0.L(8.0f) * this.o) + height2) - this.T.getHeight());
            float f54 = this.U;
            canvas.scale(f54, f54, (this.W / 2.0f) + this.V, this.T.getHeight());
            this.T.draw(canvas);
            canvas.restore();
            float f55 = this.o;
            if (f55 > 0.0f && f55 < 1.0f) {
                canvas.restore();
            }
        }
        canvas.restore();
        if (z10 || !this.e || this.C <= 0.0f) {
            return;
        }
        canvas.save();
        int i29 = org.telegram.ui.ActionBar.k6.u1.b;
        int height3 = (this.H.getHeight() - L2) - i14;
        float f56 = i29;
        float L7 = org.telegram.messenger.g0.L(24.0f) / f56;
        float f57 = this.C;
        float d2 = rf.b.d(1.0f - L7, f57, L7, f10);
        float f58 = i17 - f24;
        float f59 = 1.0f - f57;
        canvas.translate(f58 * f59, (height3 - f14) * f59);
        canvas.scale(d2, d2, f24, f14);
        org.telegram.ui.ActionBar.k6.u1.T(true, 0.0f);
        if (!org.telegram.ui.ActionBar.k6.C1) {
            zg0 zg0Var = org.telegram.ui.ActionBar.k6.u1;
            zg0Var.Z = true;
            int i30 = this.d;
            zg0Var.Q(org.telegram.ui.ActionBar.k6.x0(null, i30, true), "Arrow1");
            org.telegram.ui.ActionBar.k6.u1.Q(org.telegram.ui.ActionBar.k6.x0(null, i30, true), "Arrow2");
            org.telegram.ui.ActionBar.k6.u1.o();
            org.telegram.ui.ActionBar.k6.C1 = true;
        }
        float f60 = f56 / 2.0f;
        org.telegram.ui.ActionBar.k6.u1.setBounds((int) (f24 - f60), (int) (f14 - f60), (int) (f24 + f60), (int) (f60 + f14));
        org.telegram.ui.ActionBar.k6.u1.draw(canvas);
        canvas.restore();
    }

    public abstract float d();

    public final void e(float f10) {
        this.C = f10;
        int f11 = i0.a.f(1.0f - this.C, org.telegram.ui.ActionBar.k6.x0(null, this.d, true), org.telegram.ui.ActionBar.k6.x0(null, this.c, true));
        this.h.setColor(f11);
        if (this.e && this.X && !this.Y) {
            zg0 zg0Var = org.telegram.ui.ActionBar.k6.u1;
            zg0Var.Z = true;
            zg0Var.Q(f11, "Arrow1");
            org.telegram.ui.ActionBar.k6.u1.Q(f11, "Arrow2");
            org.telegram.ui.ActionBar.k6.u1.o();
            org.telegram.ui.ActionBar.k6.C1 = true;
        }
    }

    public final void f(float f10) {
        if (this.J != f10) {
            this.J = f10;
            org.telegram.ui.Cells.t2 t2Var = this.H;
            if (t2Var != null) {
                t2Var.invalidate();
            }
        }
    }

    public final void g(boolean z9) {
        this.X = z9;
    }

    public final void h() {
        AnimatorSet animatorSet = this.B;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.B.cancel();
        }
        e(0.0f);
        this.Y = false;
        this.E = false;
    }

    public final void i() {
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, this.b, false);
        this.k.setColor(-1);
        this.g.setColor(-1);
        this.f.setColor(i0.a.o(-1, 100));
        this.i.setColor(x02);
        ((Paint) this.l.d).setColor(x02);
        this.h.setColor(org.telegram.ui.ActionBar.k6.x0(null, this.d, false));
    }
}
