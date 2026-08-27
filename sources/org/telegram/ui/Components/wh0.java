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
import org.telegram.ui.te1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class wh0 {
    public ValueAnimator A;
    public AnimatorSet B;
    public float C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public org.telegram.ui.Cells.p2 H;
    public zk0 I;
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
    public final uh0 a0;
    public final uh0 b0;
    public int c0;
    public final m.i3 d0;
    public boolean e0;
    public final TextPaint k;
    public final vh0 l;
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
    public final int b = org.telegram.ui.ActionBar.g6.R9;
    public final int c = org.telegram.ui.ActionBar.g6.S9;
    public final int d = org.telegram.ui.ActionBar.g6.N7;
    public final boolean e = true;
    public final Paint f = new Paint(1);
    public final Paint g = new Paint(1);
    public final Paint h = new Paint(1);
    public final Paint i = new Paint();
    public final RectF j = new RectF();

    public wh0(CharSequence charSequence, CharSequence charSequence2) {
        TextPaint textPaint = new TextPaint(1);
        this.k = textPaint;
        vh0 vh0Var = new vh0();
        vh0Var.a = new Path();
        vh0Var.b = new Paint(1);
        vh0Var.a();
        this.l = vh0Var;
        this.n = new Path();
        this.o = 1.0f;
        this.p = 1.0f;
        this.v = 1.0f;
        this.w = 1.0f;
        this.P = 1.0f;
        this.U = 1.0f;
        this.a0 = new uh0(this, 3);
        this.b0 = new uh0(this, 4);
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
                ofFloat.addUpdateListener(new uh0(this, 0));
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
            ofFloat2.addUpdateListener(new uh0(this, 1));
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
        org.telegram.ui.Cells.p2 p2Var = this.H;
        if (p2Var != null) {
            p2Var.removeCallbacks(this.d0);
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
        org.telegram.ui.Cells.p2 p2Var;
        int i10;
        char c10;
        int i11;
        boolean z11;
        int i12;
        float f10;
        int i13;
        float f11;
        int i14;
        float f12;
        int i15;
        int i16;
        float f13;
        float f14;
        if (!this.X || this.Y || (p2Var = this.H) == null || this.I == null) {
            return;
        }
        boolean z12 = p2Var instanceof te1;
        int dp = AndroidUtilities.dp(z12 ? 15.0f : 28.0f);
        int dp2 = AndroidUtilities.dp(8.0f);
        int dp3 = AndroidUtilities.dp(9.0f);
        int dp4 = AndroidUtilities.dp(18.0f);
        int d = (int) d();
        int height = (int) (this.H.getHeight() * this.J);
        float f15 = this.F ? (this.D * 0.07f) - 0.05f : this.D * 0.02f;
        int width = (this.H.getWidth() - (dp * 4)) - AndroidUtilities.dp(16.0f);
        if (width != this.c0) {
            int i17 = AndroidUtilities.displaySize.x;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            c10 = 0;
            CharSequence charSequence = this.N;
            TextPaint textPaint = this.k;
            this.O = new StaticLayout(charSequence, textPaint, i17, alignment, 1.0f, 0.0f, false);
            float f16 = 0.0f;
            for (int i18 = 0; i18 < this.O.getLineCount(); i18++) {
                f16 = Math.max(f16, this.O.getLineWidth(i18));
            }
            float f17 = width;
            this.P = Math.min(1.0f, f17 / f16);
            int ceil = (int) Math.ceil(f16);
            if (this.P < 0.8f) {
                this.P = 0.8f;
                ceil = lh.w3.a(this.N, textPaint);
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
            float f18 = 0.0f;
            for (int i21 = 0; i21 < this.T.getLineCount(); i21++) {
                f18 = Math.max(f18, this.T.getLineWidth(i21));
            }
            this.U = Math.min(1.0f, f17 / f18);
            i10 = dp4;
            int ceil2 = (int) Math.ceil(f18);
            if (this.U < 0.8f) {
                this.U = 0.8f;
                ceil2 = lh.w3.a(this.S, textPaint);
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
            ofFloat2.addUpdateListener(new uh0(this, 2));
            this.A.setInterpolator(er.j);
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
        int i24 = dp + dp3;
        int measuredHeight = (this.H.getMeasuredHeight() - dp2) - dp3;
        if (z10) {
            measuredHeight += d;
        }
        int i25 = (dp2 * 2) + i10;
        float f26 = f23;
        float f27 = height > i25 ? 1.0f : height / i25;
        canvas.save();
        float f28 = f27;
        if (z10) {
            i11 = d;
            z11 = z12;
            canvas.clipRect(0, 0, this.I.getMeasuredWidth(), i11 + 1);
        } else {
            i11 = d;
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
            i12 = i10;
            i13 = dp3;
            f10 = f15;
        } else {
            float f30 = this.M;
            i12 = i10;
            f10 = f15;
            i13 = dp3;
            float z14 = com.google.android.recaptcha.internal.a.z(1.0f, this.C, this.H.getWidth() - this.M, (f30 * f15) + f30);
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
                float f31 = i24;
                float f32 = this.C;
                float f33 = measuredHeight;
                canvas.translate((f24 - f31) * f32, f32 * (f11 - f33));
                canvas.drawCircle(f31, f33, this.H.getWidth() * this.w, paint);
                canvas.restore();
            }
            if (this.v > 0.0f) {
                canvas.save();
                float f34 = i24;
                float f35 = this.C;
                float f36 = measuredHeight;
                canvas.translate((f24 - f34) * f35, (f11 - f36) * f35);
                canvas.drawCircle(f34, f36, this.H.getWidth() * this.v, paint2);
                canvas.restore();
            }
        } else {
            if (this.v > this.w) {
                canvas.save();
                float f37 = i24;
                float f38 = this.C;
                float f39 = measuredHeight;
                canvas.translate((f24 - f37) * f38, f38 * (f11 - f39));
                canvas.drawCircle(f37, f39, this.H.getWidth() * this.v, paint2);
                canvas.restore();
            }
            if (this.w > 0.0f) {
                canvas.save();
                float f40 = i24;
                float f41 = this.C;
                float f42 = measuredHeight;
                canvas.translate((f24 - f40) * f41, f41 * (f11 - f42));
                canvas.drawCircle(f40, f42, this.H.getWidth() * this.w, paint);
                canvas.restore();
            }
        }
        if (height > i25) {
            Paint paint3 = this.f;
            paint3.setAlpha((int) ((1.0f - f26) * 0.4f * f28 * 255.0f));
            if (z10) {
                rectF.set(dp, dp2, dp + i12, dp2 + i11 + i13);
            } else {
                rectF.set(dp, ((this.H.getHeight() - height) + dp2) - i11, dp + i12, this.H.getHeight() - dp2);
            }
            i14 = i13;
            float f43 = i14;
            canvas.drawRoundRect(rectF, f43, f43, paint3);
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
        float f44 = this.C;
        if (f44 == 0.0f || z11) {
            Paint paint4 = this.g;
            paint4.setAlpha((int) ((1.0f - f44) * f28 * 255.0f));
            float f45 = i24;
            float f46 = measuredHeight;
            canvas.drawCircle(f45, f46, i14, paint4);
            vh0 vh0Var = this.l;
            vh0Var.getClass();
            int dp5 = AndroidUtilities.dp(18.0f);
            int dp6 = AndroidUtilities.dp(18.0f) >> 1;
            f12 = 255.0f;
            int i26 = dp5 >> 1;
            i15 = dp;
            vh0Var.setBounds(i24 - dp6, measuredHeight - i26, i24 + dp6, measuredHeight + i26);
            float f47 = 1.0f - this.p;
            if (f47 < 0.0f) {
                f47 = 0.0f;
            }
            float f48 = 1.0f - f47;
            canvas.save();
            canvas.rotate(180.0f * f48, f45, f46);
            canvas.translate(0.0f, (AndroidUtilities.dpf2(1.0f) * 1.0f) - f48);
            vh0Var.b.setColor(this.G ? paint2.getColor() : org.telegram.ui.ActionBar.g6.w0(null, this.b, false));
            vh0Var.draw(canvas);
            canvas.restore();
        } else {
            i15 = dp;
            f12 = 255.0f;
        }
        if (this.J > 0.0f && !this.y) {
            if (Math.abs(this.a) >= this.Z * 0.5f) {
                this.e0 = true;
                org.telegram.ui.Cells.p2 p2Var2 = this.H;
                m.i3 i3Var = this.d0;
                p2Var2.removeCallbacks(i3Var);
                this.H.postDelayed(i3Var, 200L);
            } else if (!this.e0) {
                this.x = 1.0f;
                this.y = true;
            }
        }
        float height2 = (this.H.getHeight() - (i25 / 2.0f)) + AndroidUtilities.dp(6.0f);
        float width2 = (this.H.getWidth() + (z11 ? i15 * 2 : 0)) / 2.0f;
        if (this.O != null) {
            float f49 = this.o;
            if (f49 > 0.0f && f49 < 1.0f) {
                canvas.save();
                float f50 = (this.o * 0.2f) + 0.8f;
                canvas.scale(f50, f50, width2, com.google.android.recaptcha.internal.a.z(1.0f, this.o, AndroidUtilities.dp(16.0f), height2));
            }
            i16 = i24;
            f13 = f28;
            f14 = f11;
            canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (this.o * f12 * f28 * this.x), 31);
            canvas.translate((width2 - this.Q) - (this.R / 2.0f), com.google.android.recaptcha.internal.a.z(1.0f, this.o, AndroidUtilities.dp(8.0f), height2) - this.O.getHeight());
            float f51 = this.P;
            canvas.scale(f51, f51, (this.R / 2.0f) + this.Q, this.O.getHeight());
            this.O.draw(canvas);
            canvas.restore();
            float f52 = this.o;
            if (f52 > 0.0f && f52 < 1.0f) {
                canvas.restore();
            }
        } else {
            i16 = i24;
            f13 = f28;
            f14 = f11;
        }
        if (this.T != null) {
            float f53 = this.o;
            if (f53 > 0.0f && f53 < 1.0f) {
                canvas.save();
                float z16 = com.google.android.recaptcha.internal.a.z(1.0f, this.o, 0.1f, 0.9f);
                canvas.scale(z16, z16, width2, height2 - (AndroidUtilities.dp(8.0f) * this.o));
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, this.H.getMeasuredWidth(), this.H.getMeasuredHeight(), (int) (org.telegram.messenger.y1.z(1.0f, this.o, 255.0f, f13) * this.x), 31);
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
        int i27 = org.telegram.ui.ActionBar.g6.u1.b;
        int height3 = (this.H.getHeight() - dp2) - i14;
        float f56 = i27;
        float dp7 = AndroidUtilities.dp(24.0f) / f56;
        float f57 = this.C;
        float d10 = com.google.android.recaptcha.internal.a.d(1.0f - dp7, f57, dp7, f10);
        float f58 = i16 - f24;
        float f59 = 1.0f - f57;
        canvas.translate(f58 * f59, (height3 - f14) * f59);
        canvas.scale(d10, d10, f24, f14);
        org.telegram.ui.ActionBar.g6.u1.Q(0.0f, true);
        if (!org.telegram.ui.ActionBar.g6.C1) {
            oi0 oi0Var = org.telegram.ui.ActionBar.g6.u1;
            oi0Var.W = true;
            int i28 = this.d;
            oi0Var.O(org.telegram.ui.ActionBar.g6.w0(null, i28, true), "Arrow1");
            org.telegram.ui.ActionBar.g6.u1.O(org.telegram.ui.ActionBar.g6.w0(null, i28, true), "Arrow2");
            org.telegram.ui.ActionBar.g6.u1.m();
            org.telegram.ui.ActionBar.g6.C1 = true;
        }
        float f60 = f56 / 2.0f;
        org.telegram.ui.ActionBar.g6.u1.setBounds((int) (f24 - f60), (int) (f14 - f60), (int) (f24 + f60), (int) (f60 + f14));
        org.telegram.ui.ActionBar.g6.u1.draw(canvas);
        canvas.restore();
    }

    public abstract float d();

    public final void e(float f10) {
        this.C = f10;
        int d = i0.b.d(1.0f - this.C, org.telegram.ui.ActionBar.g6.w0(null, this.d, true), org.telegram.ui.ActionBar.g6.w0(null, this.c, true));
        this.h.setColor(d);
        if (this.e && this.X && !this.Y) {
            oi0 oi0Var = org.telegram.ui.ActionBar.g6.u1;
            oi0Var.W = true;
            oi0Var.O(d, "Arrow1");
            org.telegram.ui.ActionBar.g6.u1.O(d, "Arrow2");
            org.telegram.ui.ActionBar.g6.u1.m();
            org.telegram.ui.ActionBar.g6.C1 = true;
        }
    }

    public final void f(float f10) {
        if (this.J != f10) {
            this.J = f10;
            org.telegram.ui.Cells.p2 p2Var = this.H;
            if (p2Var != null) {
                p2Var.invalidate();
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
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, this.b, false);
        this.k.setColor(-1);
        this.g.setColor(-1);
        this.f.setColor(i0.b.k(-1, 100));
        this.i.setColor(w02);
        this.l.b.setColor(w02);
        this.h.setColor(org.telegram.ui.ActionBar.g6.w0(null, this.d, false));
    }
}
