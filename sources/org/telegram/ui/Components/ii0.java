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
import org.telegram.ui.bg1;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public abstract class ii0 {
    public ValueAnimator A;
    public AnimatorSet B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.Cells.r2 H;
    public ll0 I;
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
    public final gi0 a0;
    public final gi0 b0;
    public int c0;
    public final org.telegram.ui.Cells.l7 d0;
    public boolean e0;
    public final TextPaint k;
    public final hi0 l;
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
    public final int b = org.telegram.ui.ActionBar.j6.R9;
    public final int c = org.telegram.ui.ActionBar.j6.S9;
    public final int d = org.telegram.ui.ActionBar.j6.N7;
    public final boolean e = true;
    public final Paint f = new Paint(1);
    public final Paint g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint i = new Paint();
    public final RectF j = new RectF();

    public ii0(CharSequence charSequence, CharSequence charSequence2) {
        TextPaint textPaint = new TextPaint(1);
        this.k = textPaint;
        hi0 hi0Var = new hi0();
        hi0Var.a = new Path();
        hi0Var.b = new Paint(1);
        hi0Var.a();
        this.l = hi0Var;
        this.n = new Path();
        this.o = 1.0f;
        this.p = 1.0f;
        this.v = 1.0f;
        this.w = 1.0f;
        this.P = 1.0f;
        this.U = 1.0f;
        this.a0 = new gi0(this, 3);
        this.b0 = new gi0(this, 4);
        this.d0 = new org.telegram.ui.Cells.l7(this, 18);
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
                ofFloat.addUpdateListener(new gi0(this, 0));
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
            ofFloat2.addUpdateListener(new gi0(this, 1));
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
        int i10;
        char c10;
        int i11;
        boolean z11;
        int i12;
        float f7;
        int i13;
        float f10;
        int i14;
        float f11;
        int i15;
        int i16;
        float f12;
        float f13;
        if (!this.X || this.Y || (r2Var = this.H) == null || this.I == null) {
            return;
        }
        boolean z12 = r2Var instanceof bg1;
        int dp = AndroidUtilities.dp(z12 ? 15.0f : 28.0f);
        int dp2 = AndroidUtilities.dp(8.0f);
        int dp3 = AndroidUtilities.dp(9.0f);
        int dp4 = AndroidUtilities.dp(18.0f);
        int d = (int) d();
        int height = (int) (this.H.getHeight() * this.J);
        float f14 = this.F ? (this.D * 0.07f) - 0.05f : this.D * 0.02f;
        int width = (this.H.getWidth() - (dp * 4)) - AndroidUtilities.dp(16.0f);
        if (width != this.c0) {
            int i17 = AndroidUtilities.displaySize.x;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            c10 = 0;
            CharSequence charSequence = this.N;
            TextPaint textPaint = this.k;
            this.O = new StaticLayout(charSequence, textPaint, i17, alignment, 1.0f, 0.0f, false);
            float f15 = 0.0f;
            for (int i18 = 0; i18 < this.O.getLineCount(); i18++) {
                f15 = Math.max(f15, this.O.getLineWidth(i18));
            }
            float f16 = width;
            this.P = Math.min(1.0f, f16 / f15);
            int ceil = (int) Math.ceil(f15);
            if (this.P < 0.8f) {
                this.P = 0.8f;
                ceil = di.f4.a(this.N, textPaint);
            }
            int i19 = ceil;
            this.O = new StaticLayout(this.N, textPaint, i19, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.Q = i19;
            this.R = 0.0f;
            for (int i20 = 0; i20 < this.O.getLineCount(); i20++) {
                this.Q = Math.min(this.Q, this.O.getLineLeft(i20));
                this.R = Math.max(this.R, this.O.getLineWidth(i20));
            }
            this.T = new StaticLayout(this.S, textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            float f17 = 0.0f;
            for (int i21 = 0; i21 < this.T.getLineCount(); i21++) {
                f17 = Math.max(f17, this.T.getLineWidth(i21));
            }
            this.U = Math.min(1.0f, f16 / f17);
            i10 = dp4;
            int ceil2 = (int) Math.ceil(f17);
            if (this.U < 0.8f) {
                this.U = 0.8f;
                ceil2 = di.f4.a(this.S, textPaint);
            }
            int i22 = ceil2;
            this.T = new StaticLayout(this.S, textPaint, i22, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.V = i22;
            this.W = 0.0f;
            for (int i23 = 0; i23 < this.T.getLineCount(); i23++) {
                this.V = Math.min(this.V, this.T.getLineLeft(i23));
                this.W = Math.max(this.W, this.T.getLineWidth(i23));
            }
            this.c0 = width;
        } else {
            i10 = dp4;
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
                float f18 = this.o;
                float f19 = z13 ? 0.0f : 1.0f;
                float[] fArr = new float[2];
                fArr[c10] = f18;
                fArr[1] = f19;
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
            float f20 = this.p;
            float f21 = this.r ? 0.0f : 1.0f;
            float[] fArr2 = new float[2];
            fArr2[c10] = f20;
            fArr2[1] = f21;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
            this.A = ofFloat2;
            ofFloat2.addUpdateListener(new gi0(this, 2));
            this.A.setInterpolator(pr.j);
            this.A.setDuration(250L);
            this.A.start();
        }
        float f22 = this.C * 2.0f;
        if (f22 > 1.0f) {
            f22 = 1.0f;
        }
        float f23 = this.L;
        float f24 = this.K;
        if (z10) {
            f24 += d;
        }
        int i24 = dp + dp3;
        int measuredHeight = (this.H.getMeasuredHeight() - dp2) - dp3;
        if (z10) {
            measuredHeight += d;
        }
        int i25 = (dp2 * 2) + i10;
        float f25 = f22;
        float f26 = height > i25 ? 1.0f : height / i25;
        canvas.save();
        float f27 = f26;
        if (z10) {
            i11 = d;
            z11 = z12;
            canvas.clipRect(0, 0, this.I.getMeasuredWidth(), i11 + 1);
        } else {
            i11 = d;
            z11 = z12;
        }
        float f28 = this.C;
        Paint paint = this.i;
        RectF rectF = this.j;
        if (f28 == 0.0f) {
            if (this.v != 1.0f && this.w != 1.0f) {
                canvas.drawPaint(paint);
            }
            f10 = f24;
            i12 = i10;
            i13 = dp3;
            f7 = f14;
        } else {
            float f29 = this.M;
            i12 = i10;
            f7 = f14;
            i13 = dp3;
            float z14 = com.google.android.gms.internal.vision.e2.z(1.0f, this.C, this.H.getWidth() - this.M, (f29 * f14) + f29);
            if (this.v != 1.0f && this.w != 1.0f) {
                canvas.drawCircle(f23, f24, z14, paint);
            }
            Path path = this.n;
            path.reset();
            f10 = f24;
            rectF.set(f23 - z14, f24 - z14, f23 + z14, f10 + z14);
            path.addOval(rectF, Path.Direction.CW);
            canvas.clipPath(path);
        }
        boolean z15 = this.G;
        Paint paint2 = this.h;
        if (z15) {
            if (this.w > this.v) {
                canvas.save();
                float f30 = i24;
                float f31 = this.C;
                float f32 = measuredHeight;
                canvas.translate((f23 - f30) * f31, f31 * (f10 - f32));
                canvas.drawCircle(f30, f32, this.H.getWidth() * this.w, paint);
                canvas.restore();
            }
            if (this.v > 0.0f) {
                canvas.save();
                float f33 = i24;
                float f34 = this.C;
                float f35 = measuredHeight;
                canvas.translate((f23 - f33) * f34, (f10 - f35) * f34);
                canvas.drawCircle(f33, f35, this.H.getWidth() * this.v, paint2);
                canvas.restore();
            }
        } else {
            if (this.v > this.w) {
                canvas.save();
                float f36 = i24;
                float f37 = this.C;
                float f38 = measuredHeight;
                canvas.translate((f23 - f36) * f37, f37 * (f10 - f38));
                canvas.drawCircle(f36, f38, this.H.getWidth() * this.v, paint2);
                canvas.restore();
            }
            if (this.w > 0.0f) {
                canvas.save();
                float f39 = i24;
                float f40 = this.C;
                float f41 = measuredHeight;
                canvas.translate((f23 - f39) * f40, f40 * (f10 - f41));
                canvas.drawCircle(f39, f41, this.H.getWidth() * this.w, paint);
                canvas.restore();
            }
        }
        if (height > i25) {
            Paint paint3 = this.f;
            paint3.setAlpha((int) ((1.0f - f25) * 0.4f * f27 * 255.0f));
            if (z10) {
                rectF.set(dp, dp2, dp + i12, dp2 + i11 + i13);
            } else {
                rectF.set(dp, ((this.H.getHeight() - height) + dp2) - i11, dp + i12, this.H.getHeight() - dp2);
            }
            i14 = i13;
            float f42 = i14;
            canvas.drawRoundRect(rectF, f42, f42, paint3);
        } else {
            i14 = i13;
        }
        if (z10) {
            canvas.restore();
            return;
        }
        if (z11) {
            measuredHeight = (int) (measuredHeight - ((this.H.getMeasuredHeight() - AndroidUtilities.dp(41.0f)) * this.C));
        }
        float f43 = this.C;
        if (f43 == 0.0f || z11) {
            Paint paint4 = this.g;
            paint4.setAlpha((int) ((1.0f - f43) * f27 * 255.0f));
            float f44 = i24;
            float f45 = measuredHeight;
            canvas.drawCircle(f44, f45, i14, paint4);
            hi0 hi0Var = this.l;
            hi0Var.getClass();
            int dp5 = AndroidUtilities.dp(18.0f);
            int dp6 = AndroidUtilities.dp(18.0f) >> 1;
            f11 = 255.0f;
            int i26 = dp5 >> 1;
            i15 = dp;
            hi0Var.setBounds(i24 - dp6, measuredHeight - i26, i24 + dp6, measuredHeight + i26);
            float f46 = 1.0f - this.p;
            if (f46 < 0.0f) {
                f46 = 0.0f;
            }
            float f47 = 1.0f - f46;
            canvas.save();
            canvas.rotate(180.0f * f47, f44, f45);
            canvas.translate(0.0f, (AndroidUtilities.dpf2(1.0f) * 1.0f) - f47);
            hi0Var.b.setColor(this.G ? paint2.getColor() : org.telegram.ui.ActionBar.j6.w0(null, this.b, false));
            hi0Var.draw(canvas);
            canvas.restore();
        } else {
            i15 = dp;
            f11 = 255.0f;
        }
        if (this.J > 0.0f && !this.y) {
            if (Math.abs(this.a) >= this.Z * 0.5f) {
                this.e0 = true;
                org.telegram.ui.Cells.r2 r2Var2 = this.H;
                org.telegram.ui.Cells.l7 l7Var = this.d0;
                r2Var2.removeCallbacks(l7Var);
                this.H.postDelayed(l7Var, 200L);
            } else if (!this.e0) {
                this.x = 1.0f;
                this.y = true;
            }
        }
        float height2 = (this.H.getHeight() - (i25 / 2.0f)) + AndroidUtilities.dp(6.0f);
        float width2 = (this.H.getWidth() + (z11 ? i15 * 2 : 0)) / 2.0f;
        if (this.O != null) {
            float f48 = this.o;
            if (f48 > 0.0f && f48 < 1.0f) {
                canvas.save();
                float f49 = (this.o * 0.2f) + 0.8f;
                canvas.scale(f49, f49, width2, com.google.android.gms.internal.vision.e2.z(1.0f, this.o, AndroidUtilities.dp(16.0f), height2));
            }
            i16 = i24;
            f12 = f27;
            f13 = f10;
            canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (this.o * f11 * f27 * this.x), 31);
            canvas.translate((width2 - this.Q) - (this.R / 2.0f), com.google.android.gms.internal.vision.e2.z(1.0f, this.o, AndroidUtilities.dp(8.0f), height2) - this.O.getHeight());
            float f50 = this.P;
            canvas.scale(f50, f50, (this.R / 2.0f) + this.Q, this.O.getHeight());
            this.O.draw(canvas);
            canvas.restore();
            float f51 = this.o;
            if (f51 > 0.0f && f51 < 1.0f) {
                canvas.restore();
            }
        } else {
            i16 = i24;
            f12 = f27;
            f13 = f10;
        }
        if (this.T != null) {
            float f52 = this.o;
            if (f52 > 0.0f && f52 < 1.0f) {
                canvas.save();
                float z16 = com.google.android.gms.internal.vision.e2.z(1.0f, this.o, 0.1f, 0.9f);
                canvas.scale(z16, z16, width2, height2 - (AndroidUtilities.dp(8.0f) * this.o));
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (org.telegram.messenger.w1.A(1.0f, this.o, 255.0f, f12) * this.x), 31);
            canvas.translate((width2 - this.V) - (this.W / 2.0f), ((AndroidUtilities.dp(8.0f) * this.o) + height2) - this.T.getHeight());
            float f53 = this.U;
            canvas.scale(f53, f53, (this.W / 2.0f) + this.V, this.T.getHeight());
            this.T.draw(canvas);
            canvas.restore();
            float f54 = this.o;
            if (f54 > 0.0f && f54 < 1.0f) {
                canvas.restore();
            }
        }
        canvas.restore();
        if (z11 || !this.e || this.C <= 0.0f) {
            return;
        }
        canvas.save();
        int i27 = org.telegram.ui.ActionBar.j6.u1.b;
        int height3 = (this.H.getHeight() - dp2) - i14;
        float f55 = i27;
        float dp7 = AndroidUtilities.dp(24.0f) / f55;
        float f56 = this.C;
        float a2 = org.telegram.ui.Cells.p6.a(1.0f - dp7, f56, dp7, f7);
        float f57 = i16 - f23;
        float f58 = 1.0f - f56;
        canvas.translate(f57 * f58, (height3 - f13) * f58);
        canvas.scale(a2, a2, f23, f13);
        org.telegram.ui.ActionBar.j6.u1.Q(0.0f, true);
        if (!org.telegram.ui.ActionBar.j6.C1) {
            xi0 xi0Var = org.telegram.ui.ActionBar.j6.u1;
            xi0Var.a0 = true;
            int i28 = this.d;
            xi0Var.O(org.telegram.ui.ActionBar.j6.w0(null, i28, true), "Arrow1");
            org.telegram.ui.ActionBar.j6.u1.O(org.telegram.ui.ActionBar.j6.w0(null, i28, true), "Arrow2");
            org.telegram.ui.ActionBar.j6.u1.m();
            org.telegram.ui.ActionBar.j6.C1 = true;
        }
        float f59 = f55 / 2.0f;
        org.telegram.ui.ActionBar.j6.u1.setBounds((int) (f23 - f59), (int) (f13 - f59), (int) (f23 + f59), (int) (f59 + f13));
        org.telegram.ui.ActionBar.j6.u1.draw(canvas);
        canvas.restore();
    }

    public abstract float d();

    public final void e(float f7) {
        this.C = f7;
        int d = i0.a.d(1.0f - this.C, org.telegram.ui.ActionBar.j6.w0(null, this.d, true), org.telegram.ui.ActionBar.j6.w0(null, this.c, true));
        this.h.setColor(d);
        if (this.e && this.X && !this.Y) {
            xi0 xi0Var = org.telegram.ui.ActionBar.j6.u1;
            xi0Var.a0 = true;
            xi0Var.O(d, "Arrow1");
            org.telegram.ui.ActionBar.j6.u1.O(d, "Arrow2");
            org.telegram.ui.ActionBar.j6.u1.m();
            org.telegram.ui.ActionBar.j6.C1 = true;
        }
    }

    public final void f(float f7) {
        if (this.J != f7) {
            this.J = f7;
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
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, this.b, false);
        this.k.setColor(-1);
        this.g.setColor(-1);
        this.f.setColor(i0.a.k(-1, 100));
        this.i.setColor(w02);
        this.l.b.setColor(w02);
        this.h.setColor(org.telegram.ui.ActionBar.j6.w0(null, this.d, false));
    }
}
