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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class qk0 extends View {
    public final RectF B;
    public final RectF C;
    public final Path D;
    public final RectF E;
    public final RectF F;
    public final RectF G;
    public int H;
    public byte[] I;
    public final Path J;
    public final z5 K;
    public final z5 L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public float S;
    public final org.telegram.ui.ActionBar.f6 a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final ng0 f;
    public final j6 h;
    public i71 n;
    public float r;
    public float s;
    public float v;
    public boolean w;
    public final dc0 x;
    public final RectF y;

    public qk0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.s = 0.0f;
        this.v = 1.0f;
        this.w = false;
        this.x = new dc0(this, 18);
        this.y = new RectF();
        this.B = new RectF();
        this.C = new RectF();
        this.D = new Path();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new RectF();
        this.J = new Path();
        mr mrVar = mr.h;
        this.K = new z5(this, 0L, 340L, mrVar);
        this.L = new z5(this, 0L, 340L, mrVar);
        this.M = true;
        this.a = f6Var;
        ng0 ng0Var = new ng0(12);
        this.f = ng0Var;
        ng0Var.f = this;
        ng0Var.setCallback(this);
        j6 j6Var = new j6(false, false, false, false);
        this.h = j6Var;
        j6Var.k(0.5f, 200L, mrVar);
        j6Var.setCallback(this);
        j6Var.t(AndroidUtilities.dp(12.0f));
        j6Var.u(AndroidUtilities.bold());
        j6Var.G = AndroidUtilities.displaySize.x;
    }

    public final void a(Canvas canvas, RectF rectF) {
        Paint paint;
        Paint paint2;
        j6 j6Var;
        ng0 ng0Var;
        Paint paint3;
        int i10;
        int i11;
        byte b10;
        int i12;
        int i13;
        byte b11;
        float clamp;
        int i14 = org.telegram.ui.ActionBar.j6.kf;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i14, f6Var);
        Paint paint4 = this.b;
        paint4.setColor(v02);
        int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.lf, f6Var);
        Paint paint5 = this.c;
        paint5.setColor(v03);
        int i15 = org.telegram.ui.ActionBar.j6.hf;
        int v04 = org.telegram.ui.ActionBar.j6.v0(i15, f6Var);
        j6 j6Var2 = this.h;
        j6Var2.r(v04);
        int v05 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ff, f6Var);
        ng0 ng0Var2 = this.f;
        ng0Var2.a.setColor(v05);
        int v06 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gf, f6Var);
        Paint paint6 = this.d;
        paint6.setColor(v06);
        int v07 = org.telegram.ui.ActionBar.j6.v0(i15, f6Var);
        Paint paint7 = this.e;
        paint7.setColor(v07);
        int lerp = (int) AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(11.33f), rectF.right - AndroidUtilities.dp(11.33f), Utilities.clamp01(this.s));
        int lerp2 = (int) AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(11.33f), rectF.right - AndroidUtilities.dp(11.33f), Utilities.clamp01(this.v));
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(27.0f);
        int i16 = this.H;
        Path path = this.J;
        if (i16 == measuredWidth) {
            paint = paint5;
            paint2 = paint4;
            j6Var = j6Var2;
            ng0Var = ng0Var2;
            paint3 = paint7;
            i10 = lerp2;
        } else {
            int dp = measuredWidth / AndroidUtilities.dp(3.0f);
            int dp2 = AndroidUtilities.dp(2.0f);
            paint = paint5;
            int dp3 = AndroidUtilities.dp(12.0f);
            paint2 = paint4;
            j6Var = j6Var2;
            ng0Var = ng0Var2;
            byte b12 = Byte.MAX_VALUE;
            byte b13 = Byte.MIN_VALUE;
            int i17 = 0;
            while (i17 < dp) {
                Paint paint8 = paint7;
                byte[] bArr = this.I;
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
                byte[] bArr2 = this.I;
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
            this.H = measuredWidth;
        }
        canvas.save();
        Path path2 = this.D;
        path2.rewind();
        path2.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        canvas.clipPath(path2);
        Paint paint9 = paint;
        canvas.drawRect(rectF.left, rectF.top, lerp - AndroidUtilities.dp(1.33f), rectF.bottom, paint9);
        canvas.drawRect(AndroidUtilities.dp(1.33f) + i10, rectF.top, rectF.right, rectF.bottom, paint9);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(14.0f), rectF.centerY());
        int i19 = org.telegram.ui.ActionBar.j6.gf;
        paint6.setColor(org.telegram.ui.ActionBar.j6.l1(0.3f, org.telegram.ui.ActionBar.j6.v0(i19, f6Var)));
        canvas.drawPath(path, paint6);
        canvas.restore();
        float f10 = lerp;
        float f11 = i10;
        canvas.drawRect(f10, rectF.top, f11, rectF.bottom, paint2);
        if (this.R) {
            clamp = this.S;
        } else {
            clamp = Utilities.clamp(this.n != null ? r3.n() / this.n.p() : 1.0f, this.v, this.s);
        }
        float clamp2 = Utilities.clamp(AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(13.0f), rectF.right - AndroidUtilities.dp(14.0f), clamp), f11, f10);
        if (clamp2 < f11) {
            canvas.save();
            canvas.clipRect(clamp2, rectF.top, f11, rectF.bottom);
            canvas.translate(rectF.left + AndroidUtilities.dp(14.0f), rectF.centerY());
            if (!this.w || clamp >= this.s || this.R) {
                paint6.setColor(org.telegram.ui.ActionBar.j6.v0(i19, f6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.hf, f6Var));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        if (clamp2 > f10) {
            canvas.save();
            canvas.clipRect(f10, rectF.top, clamp2, rectF.bottom);
            canvas.translate(rectF.left + AndroidUtilities.dp(14.0f), rectF.centerY());
            if (b() || this.w || this.R) {
                paint6.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.hf, f6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.j6.v0(i19, f6Var));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        float dp5 = lerp - AndroidUtilities.dp(7.0f);
        float centerY = rectF.centerY() - AndroidUtilities.dp(5.33f);
        float dp6 = lerp - AndroidUtilities.dp(5.33f);
        float centerY2 = rectF.centerY() + AndroidUtilities.dp(5.33f);
        RectF rectF3 = this.C;
        rectF3.set(dp5, centerY, dp6, centerY2);
        Paint paint10 = paint3;
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint10);
        rectF3.set(AndroidUtilities.dp(5.33f) + i10, rectF.centerY() - AndroidUtilities.dp(5.33f), AndroidUtilities.dp(7.0f) + i10, rectF.centerY() + AndroidUtilities.dp(5.33f));
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint10);
        this.F.set(lerp - AndroidUtilities.dp(24.0f), 0.0f, AndroidUtilities.dp(6.0f) + lerp, getHeight());
        this.G.set(i10 - AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(24.0f) + i10, getHeight());
        float e = this.L.e(!this.R);
        if (e > 0.0f) {
            float d = (int) (j6Var.d() + AndroidUtilities.dp(30.0f));
            float e6 = this.K.e(d <= ((float) ((i10 - lerp) - AndroidUtilities.dp(8.0f))));
            float lerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), d, e6);
            float f12 = lerp + i10;
            float f13 = (f12 - lerp4) / 2.0f;
            float dp7 = AndroidUtilities.dp(20.0f) / 2.0f;
            float centerY3 = rectF.centerY() - dp7;
            float f14 = (f12 + lerp4) / 2.0f;
            float centerY4 = rectF.centerY() + dp7;
            RectF rectF4 = this.B;
            rectF4.set(f13, centerY3, f14, centerY4);
            int alpha = paint9.getAlpha();
            paint9.setAlpha((int) (alpha * e));
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, rectF4.height() / 2.0f, paint9);
            paint9.setAlpha(alpha);
            RectF rectF5 = this.E;
            rectF5.set(rectF4);
            rectF5.inset(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f));
            canvas.save();
            int dp8 = AndroidUtilities.dp(12.0f);
            canvas.translate(AndroidUtilities.lerp(rectF4.centerX() - (dp8 / 2.0f), rectF4.left + AndroidUtilities.dp(6.0f), e6), rectF4.centerY());
            ng0 ng0Var3 = ng0Var;
            ng0Var3.setBounds(0, (-dp8) / 2, dp8, dp8 / 2);
            ng0Var3.g = (int) (e * 255.0f);
            ng0Var3.draw(canvas);
            canvas.restore();
            if (e6 > 0.0f) {
                canvas.save();
                canvas.translate(rectF4.left + AndroidUtilities.dp(21.66f), rectF4.centerY() - AndroidUtilities.dp(1.0f));
                j6 j6Var3 = j6Var;
                j6Var3.setBounds(-1, -1, 1, 1);
                j6Var3.w = (int) (e6 * 255.0f * e);
                j6Var3.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        i71 i71Var = this.n;
        return i71Var != null && i71Var.y();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.M) {
            a(canvas, this.y);
        }
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.E.contains(motionEvent.getX(), motionEvent.getY());
        RectF rectF = this.F;
        boolean z4 = !contains && rectF.contains(motionEvent.getX(), motionEvent.getY());
        RectF rectF2 = this.G;
        boolean z10 = !contains && rectF2.contains(motionEvent.getX(), motionEvent.getY());
        boolean z11 = (contains || z4 || z10 || motionEvent.getX() <= rectF.right || motionEvent.getX() >= rectF2.left) ? false : true;
        if (motionEvent.getAction() == 0) {
            this.Q = contains;
            this.O = z4;
            this.P = z10;
            if (z4 || z10) {
                b();
                setPlaying(false);
            }
            this.R = z11;
            if (z11) {
                b();
                this.S = this.n != null ? r0.n() / this.n.p() : 1.0f;
                setPlaying(false);
            }
            if (getParent() != null && (this.Q || this.O || this.P || this.R)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z12 = this.O;
            RectF rectF3 = this.y;
            if (z12) {
                this.s = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), Utilities.clamp01(this.v - Math.max(1.0f / this.r, AndroidUtilities.dp(30.0f) / (rectF3.width() - AndroidUtilities.dp(22.66f)))), 0.0f);
                invalidate();
            } else if (this.P) {
                this.v = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), 1.0f, Utilities.clamp01(Math.max(1.0f / this.r, AndroidUtilities.dp(30.0f) / (rectF3.width() - AndroidUtilities.dp(22.66f))) + this.s));
                invalidate();
            } else if (this.R) {
                i71 i71Var = this.n;
                if (i71Var != null) {
                    float clamp = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), this.v, this.s);
                    this.S = clamp;
                    i71Var.L((long) (clamp * this.n.p()), false);
                }
                invalidate();
            }
            this.h.q(AndroidUtilities.formatDuration(Math.round(Math.max(1.0f, (this.v - this.s) * this.r)), false), true, true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.Q) {
                setPlaying(!b());
            } else if (this.O && this.w) {
                i71 i71Var2 = this.n;
                if (i71Var2 != null) {
                    i71Var2.L((long) (this.s * i71Var2.p()), false);
                }
                setPlaying(true);
            } else if (this.P && this.w) {
                i71 i71Var3 = this.n;
                if (i71Var3 != null) {
                    i71Var3.L(Math.max((long) (this.s * i71Var3.p()), ((long) (this.v * this.n.p())) - 1500), false);
                }
                setPlaying(true);
            } else if (this.R && !b()) {
                setPlaying(true);
            }
            this.Q = false;
            this.O = false;
            this.P = false;
            this.R = false;
        }
        return this.Q || this.O || this.P || this.R || super.dispatchTouchEvent(motionEvent);
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
        i71 i71Var = this.n;
        if (i71Var == null) {
            return 0L;
        }
        return i71Var.p();
    }

    public double getNewDuration() {
        return ((this.v - this.s) * getDuration()) / 1000.0d;
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(32.0f);
        this.y.set(0.0f, (getHeight() - dp) / 2.0f, getWidth(), (getHeight() + dp) / 2.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float dp = AndroidUtilities.dp(32.0f);
        this.y.set(0.0f, (getMeasuredHeight() - dp) / 2.0f, getMeasuredWidth(), (getMeasuredHeight() + dp) / 2.0f);
    }

    public void setAllowDraw(boolean z4) {
        if (this.M != z4) {
            this.M = z4;
            invalidate();
        }
    }

    public void setPlaying(boolean z4) {
        if (this.N) {
            z4 = false;
        }
        if (this.n != null) {
            float n10 = r0.n() / this.n.p();
            float f10 = this.s;
            if (n10 < f10 || n10 > this.v) {
                this.n.L((long) (f10 * r0.p()), false);
            }
            this.n.P(z4);
        }
        this.f.a(z4, true);
        dc0 dc0Var = this.x;
        AndroidUtilities.cancelRunOnUIThread(dc0Var);
        if (z4) {
            AndroidUtilities.runOnUIThread(dc0Var, 16L);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.h == drawable || this.f == drawable || super.verifyDrawable(drawable);
    }
}
