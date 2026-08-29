package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gk0 extends View {
    public final RectF A;
    public final RectF B;
    public final Path C;
    public final RectF D;
    public final RectF E;
    public final RectF F;
    public int G;
    public byte[] H;
    public final Path I;
    public final d6 J;
    public final d6 K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public float R;
    public final org.telegram.ui.ActionBar.c6 a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final cg0 f;
    public final n6 h;
    public x61 n;
    public float r;
    public float s;
    public float v;
    public boolean w;
    public final xb0 x;
    public final RectF y;

    public gk0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.s = 0.0f;
        this.v = 1.0f;
        this.w = false;
        this.x = new xb0(this, 18);
        this.y = new RectF();
        this.A = new RectF();
        this.B = new RectF();
        this.C = new Path();
        this.D = new RectF();
        this.E = new RectF();
        this.F = new RectF();
        this.I = new Path();
        jr jrVar = jr.h;
        this.J = new d6(this, 0L, 340L, jrVar);
        this.K = new d6(this, 0L, 340L, jrVar);
        this.L = true;
        this.a = c6Var;
        cg0 cg0Var = new cg0(12);
        this.f = cg0Var;
        cg0Var.f = this;
        cg0Var.setCallback(this);
        n6 n6Var = new n6(false, false, false, false);
        this.h = n6Var;
        n6Var.k(0.5f, 200L, jrVar);
        n6Var.setCallback(this);
        n6Var.t(AndroidUtilities.dp(12.0f));
        n6Var.u(AndroidUtilities.bold());
        n6Var.G = AndroidUtilities.displaySize.x;
    }

    public final void a(Canvas canvas, RectF rectF) {
        Paint paint;
        Paint paint2;
        n6 n6Var;
        cg0 cg0Var;
        Paint paint3;
        int i10;
        int i11;
        byte b10;
        int i12;
        int i13;
        byte b11;
        float clamp;
        int i14 = org.telegram.ui.ActionBar.g6.kf;
        org.telegram.ui.ActionBar.c6 c6Var = this.a;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i14, c6Var);
        Paint paint4 = this.b;
        paint4.setColor(v02);
        int v03 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.lf, c6Var);
        Paint paint5 = this.c;
        paint5.setColor(v03);
        int i15 = org.telegram.ui.ActionBar.g6.hf;
        int v04 = org.telegram.ui.ActionBar.g6.v0(i15, c6Var);
        n6 n6Var2 = this.h;
        n6Var2.r(v04);
        int v05 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ff, c6Var);
        cg0 cg0Var2 = this.f;
        cg0Var2.a.setColor(v05);
        int v06 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gf, c6Var);
        Paint paint6 = this.d;
        paint6.setColor(v06);
        int v07 = org.telegram.ui.ActionBar.g6.v0(i15, c6Var);
        Paint paint7 = this.e;
        paint7.setColor(v07);
        int lerp = (int) AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(11.33f), rectF.right - AndroidUtilities.dp(11.33f), Utilities.clamp01(this.s));
        int lerp2 = (int) AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(11.33f), rectF.right - AndroidUtilities.dp(11.33f), Utilities.clamp01(this.v));
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(27.0f);
        int i16 = this.G;
        Path path = this.I;
        if (i16 == measuredWidth) {
            paint = paint5;
            paint2 = paint4;
            n6Var = n6Var2;
            cg0Var = cg0Var2;
            paint3 = paint7;
            i10 = lerp2;
        } else {
            int dp = measuredWidth / AndroidUtilities.dp(3.0f);
            int dp2 = AndroidUtilities.dp(2.0f);
            paint = paint5;
            int dp3 = AndroidUtilities.dp(12.0f);
            paint2 = paint4;
            n6Var = n6Var2;
            cg0Var = cg0Var2;
            byte b12 = Byte.MAX_VALUE;
            byte b13 = Byte.MIN_VALUE;
            int i17 = 0;
            while (i17 < dp) {
                Paint paint8 = paint7;
                byte[] bArr = this.H;
                if (bArr == null) {
                    i13 = i17;
                    i12 = lerp2;
                    b11 = 0;
                } else {
                    i12 = lerp2;
                    i13 = i17;
                    b11 = bArr[(int) ((i17 / dp) * bArr.length)];
                }
                b12 = (byte) Math.min((int) b12, (int) b11);
                b13 = (byte) Math.max((int) b13, (int) b11);
                i17 = i13 + 1;
                paint7 = paint8;
                lerp2 = i12;
            }
            paint3 = paint7;
            i10 = lerp2;
            path.rewind();
            int i18 = 0;
            while (i18 < dp) {
                byte[] bArr2 = this.H;
                if (bArr2 == null) {
                    i11 = i18;
                    b10 = 0;
                } else {
                    i11 = i18;
                    b10 = bArr2[(int) ((i18 / dp) * bArr2.length)];
                }
                float lerp3 = AndroidUtilities.lerp(dp2, dp3, Utilities.clamp01(AndroidUtilities.ilerp((int) b10, (int) b12, (int) b13)));
                float dp4 = AndroidUtilities.dp(3.0f) * i11;
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(dp4, (-lerp3) / 2.0f, AndroidUtilities.dp(2.0f) + dp4, lerp3 / 2.0f);
                path.addRoundRect(rectF2, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Path.Direction.CW);
                i18 = i11 + 1;
                dp = dp;
                dp2 = dp2;
            }
            this.G = measuredWidth;
        }
        canvas.save();
        Path path2 = this.C;
        path2.rewind();
        path2.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        canvas.clipPath(path2);
        Paint paint9 = paint;
        canvas.drawRect(rectF.left, rectF.top, lerp - AndroidUtilities.dp(1.33f), rectF.bottom, paint9);
        canvas.drawRect(AndroidUtilities.dp(1.33f) + i10, rectF.top, rectF.right, rectF.bottom, paint9);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(14.0f), rectF.centerY());
        int i19 = org.telegram.ui.ActionBar.g6.gf;
        paint6.setColor(org.telegram.ui.ActionBar.g6.l1(0.3f, org.telegram.ui.ActionBar.g6.v0(i19, c6Var)));
        canvas.drawPath(path, paint6);
        canvas.restore();
        float f9 = lerp;
        float f10 = i10;
        canvas.drawRect(f9, rectF.top, f10, rectF.bottom, paint2);
        if (this.Q) {
            clamp = this.R;
        } else {
            clamp = Utilities.clamp(this.n != null ? r3.o() / this.n.q() : 1.0f, this.v, this.s);
        }
        float clamp2 = Utilities.clamp(AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(13.0f), rectF.right - AndroidUtilities.dp(14.0f), clamp), f10, f9);
        if (clamp2 < f10) {
            canvas.save();
            canvas.clipRect(clamp2, rectF.top, f10, rectF.bottom);
            canvas.translate(rectF.left + AndroidUtilities.dp(14.0f), rectF.centerY());
            if (!this.w || clamp >= this.s || this.Q) {
                paint6.setColor(org.telegram.ui.ActionBar.g6.v0(i19, c6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.hf, c6Var));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        if (clamp2 > f9) {
            canvas.save();
            canvas.clipRect(f9, rectF.top, clamp2, rectF.bottom);
            canvas.translate(rectF.left + AndroidUtilities.dp(14.0f), rectF.centerY());
            if (b() || this.w || this.Q) {
                paint6.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.hf, c6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.g6.v0(i19, c6Var));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        float dp5 = lerp - AndroidUtilities.dp(7.0f);
        float centerY = rectF.centerY() - AndroidUtilities.dp(5.33f);
        float dp6 = lerp - AndroidUtilities.dp(5.33f);
        float centerY2 = rectF.centerY() + AndroidUtilities.dp(5.33f);
        RectF rectF3 = this.B;
        rectF3.set(dp5, centerY, dp6, centerY2);
        Paint paint10 = paint3;
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint10);
        rectF3.set(AndroidUtilities.dp(5.33f) + i10, rectF.centerY() - AndroidUtilities.dp(5.33f), AndroidUtilities.dp(7.0f) + i10, rectF.centerY() + AndroidUtilities.dp(5.33f));
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint10);
        this.E.set(lerp - AndroidUtilities.dp(24.0f), 0.0f, AndroidUtilities.dp(6.0f) + lerp, getHeight());
        this.F.set(i10 - AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(24.0f) + i10, getHeight());
        float e10 = this.K.e(!this.Q);
        if (e10 > 0.0f) {
            float d = (int) (n6Var.d() + AndroidUtilities.dp(30.0f));
            float e11 = this.J.e(d <= ((float) ((i10 - lerp) - AndroidUtilities.dp(8.0f))));
            float lerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), d, e11);
            float f11 = lerp + i10;
            float f12 = (f11 - lerp4) / 2.0f;
            float dp7 = AndroidUtilities.dp(20.0f) / 2.0f;
            float centerY3 = rectF.centerY() - dp7;
            float f13 = (f11 + lerp4) / 2.0f;
            float centerY4 = rectF.centerY() + dp7;
            RectF rectF4 = this.A;
            rectF4.set(f12, centerY3, f13, centerY4);
            int alpha = paint9.getAlpha();
            paint9.setAlpha((int) (alpha * e10));
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, rectF4.height() / 2.0f, paint9);
            paint9.setAlpha(alpha);
            RectF rectF5 = this.D;
            rectF5.set(rectF4);
            rectF5.inset(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f));
            canvas.save();
            int dp8 = AndroidUtilities.dp(12.0f);
            canvas.translate(AndroidUtilities.lerp(rectF4.centerX() - (dp8 / 2.0f), rectF4.left + AndroidUtilities.dp(6.0f), e11), rectF4.centerY());
            cg0 cg0Var3 = cg0Var;
            cg0Var3.setBounds(0, (-dp8) / 2, dp8, dp8 / 2);
            cg0Var3.g = (int) (e10 * 255.0f);
            cg0Var3.draw(canvas);
            canvas.restore();
            if (e11 > 0.0f) {
                canvas.save();
                canvas.translate(rectF4.left + AndroidUtilities.dp(21.66f), rectF4.centerY() - AndroidUtilities.dp(1.0f));
                n6 n6Var3 = n6Var;
                n6Var3.setBounds(-1, -1, 1, 1);
                n6Var3.w = (int) (e11 * 255.0f * e10);
                n6Var3.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        x61 x61Var = this.n;
        return x61Var != null && x61Var.z();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.L) {
            a(canvas, this.y);
        }
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.D.contains(motionEvent.getX(), motionEvent.getY());
        RectF rectF = this.E;
        boolean z10 = !contains && rectF.contains(motionEvent.getX(), motionEvent.getY());
        RectF rectF2 = this.F;
        boolean z11 = !contains && rectF2.contains(motionEvent.getX(), motionEvent.getY());
        boolean z12 = (contains || z10 || z11 || motionEvent.getX() <= rectF.right || motionEvent.getX() >= rectF2.left) ? false : true;
        if (motionEvent.getAction() == 0) {
            this.P = contains;
            this.N = z10;
            this.O = z11;
            if (z10 || z11) {
                b();
                setPlaying(false);
            }
            this.Q = z12;
            if (z12) {
                b();
                this.R = this.n != null ? r0.o() / this.n.q() : 1.0f;
                setPlaying(false);
            }
            if (getParent() != null && (this.P || this.N || this.O || this.Q)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z13 = this.N;
            RectF rectF3 = this.y;
            if (z13) {
                this.s = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), Utilities.clamp01(this.v - Math.max(1.0f / this.r, AndroidUtilities.dp(30.0f) / (rectF3.width() - AndroidUtilities.dp(22.66f)))), 0.0f);
                invalidate();
            } else if (this.O) {
                this.v = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), 1.0f, Utilities.clamp01(Math.max(1.0f / this.r, AndroidUtilities.dp(30.0f) / (rectF3.width() - AndroidUtilities.dp(22.66f))) + this.s));
                invalidate();
            } else if (this.Q) {
                x61 x61Var = this.n;
                if (x61Var != null) {
                    float clamp = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), this.v, this.s);
                    this.R = clamp;
                    x61Var.M((long) (clamp * this.n.q()), false);
                }
                invalidate();
            }
            this.h.q(AndroidUtilities.formatDuration(Math.round(Math.max(1.0f, (this.v - this.s) * this.r)), false), true, true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.P) {
                setPlaying(!b());
            } else if (this.N && this.w) {
                x61 x61Var2 = this.n;
                if (x61Var2 != null) {
                    x61Var2.M((long) (this.s * x61Var2.q()), false);
                }
                setPlaying(true);
            } else if (this.O && this.w) {
                x61 x61Var3 = this.n;
                if (x61Var3 != null) {
                    x61Var3.M(Math.max((long) (this.s * x61Var3.q()), ((long) (this.v * this.n.q())) - 1500), false);
                }
                setPlaying(true);
            } else if (this.Q && !b()) {
                setPlaying(true);
            }
            this.P = false;
            this.N = false;
            this.O = false;
            this.Q = false;
        }
        return this.P || this.N || this.O || this.Q || super.dispatchTouchEvent(motionEvent);
    }

    public float getAudioLeft() {
        return this.s;
    }

    public long getAudioLeftMs() {
        return (long) (this.s * getDuration());
    }

    public float getAudioRight() {
        return this.v;
    }

    public long getAudioRightMs() {
        return (long) (this.v * getDuration());
    }

    public long getDuration() {
        x61 x61Var = this.n;
        if (x61Var == null) {
            return 0L;
        }
        return x61Var.q();
    }

    public double getNewDuration() {
        return ((this.v - this.s) * getDuration()) / 1000.0d;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(32.0f);
        this.y.set(0.0f, (getHeight() - dp) / 2.0f, getWidth(), (getHeight() + dp) / 2.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float dp = AndroidUtilities.dp(32.0f);
        this.y.set(0.0f, (getMeasuredHeight() - dp) / 2.0f, getMeasuredWidth(), (getMeasuredHeight() + dp) / 2.0f);
    }

    public void setAllowDraw(boolean z10) {
        if (this.L != z10) {
            this.L = z10;
            invalidate();
        }
    }

    public void setPlaying(boolean z10) {
        if (this.M) {
            z10 = false;
        }
        if (this.n != null) {
            float o10 = r0.o() / this.n.q();
            float f9 = this.s;
            if (o10 < f9 || o10 > this.v) {
                this.n.M((long) (f9 * r0.q()), false);
            }
            this.n.Q(z10);
        }
        this.f.a(z10, true);
        xb0 xb0Var = this.x;
        AndroidUtilities.cancelRunOnUIThread(xb0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(xb0Var, 16L);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.h == drawable || this.f == drawable || super.verifyDrawable(drawable);
    }
}
