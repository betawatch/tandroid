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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.R;
import org.telegram.ui.se1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class uh0 {
    public ValueAnimator A;
    public AnimatorSet B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.Cells.r2 H;
    public wk0 I;
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
    public final sh0 a0;
    public final sh0 b0;
    public int c0;
    public final m.i3 d0;
    public boolean e0;
    public final TextPaint k;
    public final th0 l;
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
    public final int b = org.telegram.ui.ActionBar.f6.R9;
    public final int c = org.telegram.ui.ActionBar.f6.S9;
    public final int d = org.telegram.ui.ActionBar.f6.N7;
    public final boolean e = true;
    public final Paint f = new Paint(1);
    public final Paint g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint i = new Paint();
    public final RectF j = new RectF();

    public uh0(CharSequence charSequence, CharSequence charSequence2) {
        TextPaint textPaint = new TextPaint(1);
        this.k = textPaint;
        th0 th0Var = new th0();
        th0Var.a = new Path();
        th0Var.b = new Paint(1);
        th0Var.a();
        this.l = th0Var;
        this.n = new Path();
        this.o = 1.0f;
        this.p = 1.0f;
        this.v = 1.0f;
        this.w = 1.0f;
        this.P = 1.0f;
        this.U = 1.0f;
        this.a0 = new sh0(this, 3);
        this.b0 = new sh0(this, 4);
        this.d0 = new m.i3(this, 25);
        this.e0 = false;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(16.0f));
        this.Z = ViewConfiguration.get(ApplicationLoader.applicationContext).getScaledTouchSlop();
        this.N = charSequence;
        this.S = charSequence2;
        try {
            this.m = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.msg_filled_general).mutate();
        } catch (Exception unused) {
        }
    }

    public final void a(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            if (z10) {
                ValueAnimator valueAnimator = this.t;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.t = null;
                }
                this.v = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.t = ofFloat;
                ofFloat.addUpdateListener(new sh0(this, 0));
                this.t.setInterpolator(AndroidUtilities.accelerateInterpolator);
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
            ofFloat2.addUpdateListener(new sh0(this, 1));
            this.u.setInterpolator(AndroidUtilities.accelerateInterpolator);
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
        org.telegram.ui.Cells.r2 r2Var = this.H;
        if (r2Var != null) {
            r2Var.removeCallbacks(this.d0);
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

    public final void c(Canvas canvas, boolean z10) {
        org.telegram.ui.Cells.r2 r2Var;
        int i9;
        char c10;
        int i10;
        boolean z11;
        int i11;
        float f10;
        int i12;
        float f11;
        int i13;
        float f12;
        int i14;
        int i15;
        float f13;
        float f14;
        if (!this.X || this.Y || (r2Var = this.H) == null || this.I == null) {
            return;
        }
        boolean z12 = r2Var instanceof se1;
        int dp = AndroidUtilities.dp(z12 ? 15.0f : 28.0f);
        int dp2 = AndroidUtilities.dp(8.0f);
        int dp3 = AndroidUtilities.dp(9.0f);
        int dp4 = AndroidUtilities.dp(18.0f);
        int d = (int) d();
        int height = (int) (this.H.getHeight() * this.J);
        float f15 = this.F ? (this.D * 0.07f) - 0.05f : this.D * 0.02f;
        int width = (this.H.getWidth() - (dp * 4)) - AndroidUtilities.dp(16.0f);
        if (width != this.c0) {
            int i16 = AndroidUtilities.displaySize.x;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            c10 = 0;
            CharSequence charSequence = this.N;
            TextPaint textPaint = this.k;
            this.O = new StaticLayout(charSequence, textPaint, i16, alignment, 1.0f, 0.0f, false);
            float f16 = 0.0f;
            for (int i17 = 0; i17 < this.O.getLineCount(); i17++) {
                f16 = Math.max(f16, this.O.getLineWidth(i17));
            }
            float f17 = width;
            this.P = Math.min(1.0f, f17 / f16);
            int ceil = (int) Math.ceil(f16);
            if (this.P < 0.8f) {
                this.P = 0.8f;
                ceil = kh.x3.a(this.N, textPaint);
            }
            int i18 = ceil;
            this.O = new StaticLayout(this.N, textPaint, i18, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.Q = i18;
            this.R = 0.0f;
            for (int i19 = 0; i19 < this.O.getLineCount(); i19++) {
                this.Q = Math.min(this.Q, this.O.getLineLeft(i19));
                this.R = Math.max(this.R, this.O.getLineWidth(i19));
            }
            this.T = new StaticLayout(this.S, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            float f18 = 0.0f;
            for (int i20 = 0; i20 < this.T.getLineCount(); i20++) {
                f18 = Math.max(f18, this.T.getLineWidth(i20));
            }
            this.U = Math.min(1.0f, f17 / f18);
            i9 = dp4;
            int ceil2 = (int) Math.ceil(f18);
            if (this.U < 0.8f) {
                this.U = 0.8f;
                ceil2 = kh.x3.a(this.S, textPaint);
            }
            int i21 = ceil2;
            this.T = new StaticLayout(this.S, textPaint, i21, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.V = i21;
            this.W = 0.0f;
            for (int i22 = 0; i22 < this.T.getLineCount(); i22++) {
                this.V = Math.min(this.V, this.T.getLineLeft(i22));
                this.W = Math.max(this.W, this.T.getLineWidth(i22));
            }
            this.c0 = width;
        } else {
            i9 = dp4;
            c10 = 0;
        }
        boolean z13 = this.J > 0.85f;
        if (this.q != z13) {
            this.q = z13;
            if (this.x == 0.0f) {
                ValueAnimator valueAnimator = this.s;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.o = z13 ? 0.0f : 1.0f;
            } else {
                ValueAnimator valueAnimator2 = this.s;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                float f19 = this.o;
                float f20 = z13 ? 0.0f : 1.0f;
                float[] fArr = new float[2];
                fArr[c10] = f19;
                fArr[1] = f20;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                this.s = ofFloat;
                ofFloat.addUpdateListener(this.a0);
                this.s.setInterpolator(new LinearInterpolator());
                this.s.setDuration(170L);
                this.s.start();
            }
        }
        if (z13 != this.r) {
            this.r = z13;
            ValueAnimator valueAnimator3 = this.A;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            float f21 = this.p;
            float f22 = this.r ? 0.0f : 1.0f;
            float[] fArr2 = new float[2];
            fArr2[c10] = f21;
            fArr2[1] = f22;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
            this.A = ofFloat2;
            ofFloat2.addUpdateListener(new sh0(this, 2));
            this.A.setInterpolator(gr.j);
            this.A.setDuration(250L);
            this.A.start();
        }
        float f23 = this.C * 2.0f;
        if (f23 > 1.0f) {
            f23 = 1.0f;
        }
        float f24 = this.L;
        float f25 = this.K;
        if (z10) {
            f25 += d;
        }
        int i23 = dp + dp3;
        int measuredHeight = (this.H.getMeasuredHeight() - dp2) - dp3;
        if (z10) {
            measuredHeight += d;
        }
        int i24 = (dp2 * 2) + i9;
        float f26 = f23;
        float f27 = height > i24 ? 1.0f : height / i24;
        canvas.save();
        float f28 = f27;
        if (z10) {
            i10 = d;
            z11 = z12;
            canvas.clipRect(0, 0, this.I.getMeasuredWidth(), i10 + 1);
        } else {
            i10 = d;
            z11 = z12;
        }
        float f29 = this.C;
        Paint paint = this.i;
        RectF rectF = this.j;
        if (f29 == 0.0f) {
            if (this.v != 1.0f && this.w != 1.0f) {
                canvas.drawPaint(paint);
            }
            f11 = f25;
            i11 = i9;
            i12 = dp3;
            f10 = f15;
        } else {
            float f30 = this.M;
            i11 = i9;
            f10 = f15;
            i12 = dp3;
            float z14 = e2.c.z(1.0f, this.C, this.H.getWidth() - this.M, (f30 * f15) + f30);
            if (this.v != 1.0f && this.w != 1.0f) {
                canvas.drawCircle(f24, f25, z14, paint);
            }
            Path path = this.n;
            path.reset();
            f11 = f25;
            rectF.set(f24 - z14, f25 - z14, f24 + z14, f11 + z14);
            path.addOval(rectF, Path.Direction.CW);
            canvas.clipPath(path);
        }
        boolean z15 = this.G;
        Paint paint2 = this.h;
        if (z15) {
            if (this.w > this.v) {
                canvas.save();
                float f31 = i23;
                float f32 = this.C;
                float f33 = measuredHeight;
                canvas.translate((f24 - f31) * f32, f32 * (f11 - f33));
                canvas.drawCircle(f31, f33, this.H.getWidth() * this.w, paint);
                canvas.restore();
            }
            if (this.v > 0.0f) {
                canvas.save();
                float f34 = i23;
                float f35 = this.C;
                float f36 = measuredHeight;
                canvas.translate((f24 - f34) * f35, (f11 - f36) * f35);
                canvas.drawCircle(f34, f36, this.H.getWidth() * this.v, paint2);
                canvas.restore();
            }
        } else {
            if (this.v > this.w) {
                canvas.save();
                float f37 = i23;
                float f38 = this.C;
                float f39 = measuredHeight;
                canvas.translate((f24 - f37) * f38, f38 * (f11 - f39));
                canvas.drawCircle(f37, f39, this.H.getWidth() * this.v, paint2);
                canvas.restore();
            }
            if (this.w > 0.0f) {
                canvas.save();
                float f40 = i23;
                float f41 = this.C;
                float f42 = measuredHeight;
                canvas.translate((f24 - f40) * f41, f41 * (f11 - f42));
                canvas.drawCircle(f40, f42, this.H.getWidth() * this.w, paint);
                canvas.restore();
            }
        }
        if (height > i24) {
            Paint paint3 = this.f;
            paint3.setAlpha((int) ((1.0f - f26) * 0.4f * f28 * 255.0f));
            if (z10) {
                rectF.set(dp, dp2, dp + i11, dp2 + i10 + i12);
            } else {
                rectF.set(dp, ((this.H.getHeight() - height) + dp2) - i10, dp + i11, this.H.getHeight() - dp2);
            }
            i13 = i12;
            float f43 = i13;
            canvas.drawRoundRect(rectF, f43, f43, paint3);
        } else {
            i13 = i12;
        }
        if (z10) {
            canvas.restore();
            return;
        }
        if (z11) {
            measuredHeight = (int) (measuredHeight - ((this.H.getMeasuredHeight() - AndroidUtilities.dp(41.0f)) * this.C));
        }
        float f44 = this.C;
        if (f44 == 0.0f || z11) {
            Paint paint4 = this.g;
            paint4.setAlpha((int) ((1.0f - f44) * f28 * 255.0f));
            float f45 = i23;
            float f46 = measuredHeight;
            canvas.drawCircle(f45, f46, i13, paint4);
            th0 th0Var = this.l;
            th0Var.getClass();
            int dp5 = AndroidUtilities.dp(18.0f);
            int dp6 = AndroidUtilities.dp(18.0f) >> 1;
            f12 = 255.0f;
            int i25 = dp5 >> 1;
            i14 = dp;
            th0Var.setBounds(i23 - dp6, measuredHeight - i25, i23 + dp6, measuredHeight + i25);
            float f47 = 1.0f - this.p;
            if (f47 < 0.0f) {
                f47 = 0.0f;
            }
            float f48 = 1.0f - f47;
            canvas.save();
            canvas.rotate(180.0f * f48, f45, f46);
            canvas.translate(0.0f, (AndroidUtilities.dpf2(1.0f) * 1.0f) - f48);
            th0Var.b.setColor(this.G ? paint2.getColor() : org.telegram.ui.ActionBar.f6.w0(null, this.b, false));
            th0Var.draw(canvas);
            canvas.restore();
        } else {
            i14 = dp;
            f12 = 255.0f;
        }
        if (this.J > 0.0f && !this.y) {
            if (Math.abs(this.a) >= this.Z * 0.5f) {
                this.e0 = true;
                org.telegram.ui.Cells.r2 r2Var2 = this.H;
                m.i3 i3Var = this.d0;
                r2Var2.removeCallbacks(i3Var);
                this.H.postDelayed(i3Var, 200L);
            } else if (!this.e0) {
                this.x = 1.0f;
                this.y = true;
            }
        }
        float height2 = (this.H.getHeight() - (i24 / 2.0f)) + AndroidUtilities.dp(6.0f);
        float width2 = (this.H.getWidth() + (z11 ? i14 * 2 : 0)) / 2.0f;
        if (this.O != null) {
            float f49 = this.o;
            if (f49 > 0.0f && f49 < 1.0f) {
                canvas.save();
                float f50 = (this.o * 0.2f) + 0.8f;
                canvas.scale(f50, f50, width2, e2.c.z(1.0f, this.o, AndroidUtilities.dp(16.0f), height2));
            }
            i15 = i23;
            f13 = f28;
            f14 = f11;
            canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (this.o * f12 * f28 * this.x), 31);
            canvas.translate((width2 - this.Q) - (this.R / 2.0f), e2.c.z(1.0f, this.o, AndroidUtilities.dp(8.0f), height2) - this.O.getHeight());
            float f51 = this.P;
            canvas.scale(f51, f51, (this.R / 2.0f) + this.Q, this.O.getHeight());
            this.O.draw(canvas);
            canvas.restore();
            float f52 = this.o;
            if (f52 > 0.0f && f52 < 1.0f) {
                canvas.restore();
            }
        } else {
            i15 = i23;
            f13 = f28;
            f14 = f11;
        }
        if (this.T != null) {
            float f53 = this.o;
            if (f53 > 0.0f && f53 < 1.0f) {
                canvas.save();
                float z16 = e2.c.z(1.0f, this.o, 0.1f, 0.9f);
                canvas.scale(z16, z16, width2, height2 - (AndroidUtilities.dp(8.0f) * this.o));
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (org.telegram.messenger.l0.y(1.0f, this.o, 255.0f, f13) * this.x), 31);
            canvas.translate((width2 - this.V) - (this.W / 2.0f), ((AndroidUtilities.dp(8.0f) * this.o) + height2) - this.T.getHeight());
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
        if (z11 || !this.e || this.C <= 0.0f) {
            return;
        }
        canvas.save();
        int i26 = org.telegram.ui.ActionBar.f6.u1.b;
        int height3 = (this.H.getHeight() - dp2) - i13;
        float f56 = i26;
        float dp7 = AndroidUtilities.dp(24.0f) / f56;
        float f57 = this.C;
        float w8 = aa.d.w(1.0f - dp7, f57, dp7, f10);
        float f58 = i15 - f24;
        float f59 = 1.0f - f57;
        canvas.translate(f58 * f59, (height3 - f14) * f59);
        canvas.scale(w8, w8, f24, f14);
        org.telegram.ui.ActionBar.f6.u1.Q(0.0f, true);
        if (!org.telegram.ui.ActionBar.f6.C1) {
            mi0 mi0Var = org.telegram.ui.ActionBar.f6.u1;
            mi0Var.W = true;
            int i27 = this.d;
            mi0Var.O(org.telegram.ui.ActionBar.f6.w0(null, i27, true), "Arrow1");
            org.telegram.ui.ActionBar.f6.u1.O(org.telegram.ui.ActionBar.f6.w0(null, i27, true), "Arrow2");
            org.telegram.ui.ActionBar.f6.u1.m();
            org.telegram.ui.ActionBar.f6.C1 = true;
        }
        float f60 = f56 / 2.0f;
        org.telegram.ui.ActionBar.f6.u1.setBounds((int) (f24 - f60), (int) (f14 - f60), (int) (f24 + f60), (int) (f60 + f14));
        org.telegram.ui.ActionBar.f6.u1.draw(canvas);
        canvas.restore();
    }

    public abstract float d();

    public final void e(float f10) {
        this.C = f10;
        int d = i0.a.d(1.0f - this.C, org.telegram.ui.ActionBar.f6.w0(null, this.d, true), org.telegram.ui.ActionBar.f6.w0(null, this.c, true));
        this.h.setColor(d);
        if (this.e && this.X && !this.Y) {
            mi0 mi0Var = org.telegram.ui.ActionBar.f6.u1;
            mi0Var.W = true;
            mi0Var.O(d, "Arrow1");
            org.telegram.ui.ActionBar.f6.u1.O(d, "Arrow2");
            org.telegram.ui.ActionBar.f6.u1.m();
            org.telegram.ui.ActionBar.f6.C1 = true;
        }
    }

    public final void f(float f10) {
        if (this.J != f10) {
            this.J = f10;
            org.telegram.ui.Cells.r2 r2Var = this.H;
            if (r2Var != null) {
                r2Var.invalidate();
            }
        }
    }

    public final void g(boolean z10) {
        this.X = z10;
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
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, this.b, false);
        this.k.setColor(-1);
        this.g.setColor(-1);
        this.f.setColor(i0.a.k(-1, 100));
        this.i.setColor(w02);
        this.l.b.setColor(w02);
        this.h.setColor(org.telegram.ui.ActionBar.f6.w0(null, this.d, false));
    }
}
