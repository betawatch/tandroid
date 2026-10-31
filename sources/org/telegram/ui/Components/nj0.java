package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class nj0 extends View {
    public final RectF D;
    public final RectF E;
    public final RectF F;
    public final Path G;
    public final RectF H;
    public final RectF I;
    public final RectF J;
    public int K;
    public byte[] L;
    public final Path M;
    public final t5 N;
    public final t5 O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public float V;
    public final org.telegram.ui.ActionBar.p6 a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final kf0 f;
    public final e6 h;
    public u61 n;
    public float r;
    public float s;
    public float w;
    public boolean x;
    public final eb0 y;

    public nj0(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.s = 0.0f;
        this.w = 1.0f;
        this.x = false;
        this.y = new eb0(this, 18);
        this.D = new RectF();
        this.E = new RectF();
        this.F = new RectF();
        this.G = new Path();
        this.H = new RectF();
        this.I = new RectF();
        this.J = new RectF();
        this.M = new Path();
        gr grVar = gr.h;
        this.N = new t5(this, 0L, 340L, grVar);
        this.O = new t5(this, 0L, 340L, grVar);
        this.P = true;
        this.a = p6Var;
        kf0 kf0Var = new kf0(12);
        this.f = kf0Var;
        kf0Var.f = this;
        kf0Var.setCallback(this);
        e6 e6Var = new e6(false, false, false);
        this.h = e6Var;
        e6Var.n(0.5f, 200L, grVar);
        e6Var.setCallback(this);
        e6Var.w(org.telegram.messenger.i0.L(12.0f));
        e6Var.x(org.telegram.messenger.i0.o());
        e6Var.M = org.telegram.messenger.i0.q.x;
    }

    public final void a(Canvas canvas, RectF rectF) {
        Paint paint;
        Paint paint2;
        e6 e6Var;
        kf0 kf0Var;
        Paint paint3;
        int i10;
        byte b10;
        byte b11;
        int i11;
        int i12;
        byte b12;
        float i13;
        int i14 = org.telegram.ui.ActionBar.t6.Yf;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i14, p6Var);
        Paint paint4 = this.b;
        paint4.setColor(w02);
        int w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Zf, p6Var);
        Paint paint5 = this.c;
        paint5.setColor(w03);
        int i15 = org.telegram.ui.ActionBar.t6.Wf;
        int w04 = org.telegram.ui.ActionBar.t6.w0(i15, p6Var);
        e6 e6Var2 = this.h;
        e6Var2.u(w04);
        int w05 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Uf, p6Var);
        kf0 kf0Var2 = this.f;
        kf0Var2.a.setColor(w05);
        int w06 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Vf, p6Var);
        Paint paint6 = this.d;
        paint6.setColor(w06);
        int w07 = org.telegram.ui.ActionBar.t6.w0(i15, p6Var);
        Paint paint7 = this.e;
        paint7.setColor(w07);
        int T1 = (int) org.telegram.messenger.i0.T1(rectF.left + org.telegram.messenger.i0.L(11.33f), rectF.right - org.telegram.messenger.i0.L(11.33f), Utilities.l(this.s));
        int T12 = (int) org.telegram.messenger.i0.T1(rectF.left + org.telegram.messenger.i0.L(11.33f), rectF.right - org.telegram.messenger.i0.L(11.33f), Utilities.l(this.w));
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(27.0f);
        int i16 = this.K;
        Path path = this.M;
        if (i16 == measuredWidth) {
            paint = paint5;
            paint2 = paint4;
            e6Var = e6Var2;
            kf0Var = kf0Var2;
            paint3 = paint7;
            i10 = T12;
        } else {
            int L = measuredWidth / org.telegram.messenger.i0.L(3.0f);
            int L2 = org.telegram.messenger.i0.L(2.0f);
            paint = paint5;
            int L3 = org.telegram.messenger.i0.L(12.0f);
            paint2 = paint4;
            byte b13 = Byte.MAX_VALUE;
            e6Var = e6Var2;
            byte b14 = Byte.MIN_VALUE;
            kf0Var = kf0Var2;
            int i17 = 0;
            while (i17 < L) {
                Paint paint8 = paint7;
                byte[] bArr = this.L;
                if (bArr == null) {
                    i12 = i17;
                    i11 = T12;
                    b12 = 0;
                } else {
                    i11 = T12;
                    i12 = i17;
                    b12 = bArr[(int) ((i17 / L) * bArr.length)];
                }
                b13 = (byte) Math.min((int) b13, (int) b12);
                b14 = (byte) Math.max((int) b14, (int) b12);
                i17 = i12 + 1;
                paint7 = paint8;
                T12 = i11;
            }
            paint3 = paint7;
            i10 = T12;
            path.rewind();
            int i18 = 0;
            while (i18 < L) {
                byte[] bArr2 = this.L;
                if (bArr2 == null) {
                    b10 = b13;
                    b11 = 0;
                } else {
                    b10 = b13;
                    b11 = bArr2[(int) ((i18 / L) * bArr2.length)];
                }
                float W1 = org.telegram.messenger.i0.W1(Utilities.l((b11 - b10) / (b14 - b10)), L2, L3);
                float L4 = org.telegram.messenger.i0.L(3.0f) * i18;
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(L4, (-W1) / 2.0f, org.telegram.messenger.i0.L(2.0f) + L4, W1 / 2.0f);
                path.addRoundRect(rectF2, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), Path.Direction.CW);
                i18++;
                b13 = b10;
                L = L;
                L2 = L2;
            }
            this.K = measuredWidth;
        }
        canvas.save();
        Path path2 = this.G;
        path2.rewind();
        path2.addRoundRect(rectF, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), Path.Direction.CW);
        canvas.clipPath(path2);
        Paint paint9 = paint;
        canvas.drawRect(rectF.left, rectF.top, T1 - org.telegram.messenger.i0.L(1.33f), rectF.bottom, paint9);
        canvas.drawRect(org.telegram.messenger.i0.L(1.33f) + i10, rectF.top, rectF.right, rectF.bottom, paint9);
        canvas.save();
        canvas.translate(rectF.left + org.telegram.messenger.i0.L(14.0f), rectF.centerY());
        int i19 = org.telegram.ui.ActionBar.t6.Vf;
        paint6.setColor(org.telegram.ui.ActionBar.t6.r1(0.3f, org.telegram.ui.ActionBar.t6.w0(i19, p6Var)));
        canvas.drawPath(path, paint6);
        canvas.restore();
        float f7 = T1;
        float f10 = i10;
        canvas.drawRect(f7, rectF.top, f10, rectF.bottom, paint2);
        if (this.U) {
            i13 = this.V;
        } else {
            i13 = Utilities.i(this.n != null ? r3.S() / this.n.U() : 1.0f, this.w, this.s);
        }
        float i20 = Utilities.i(org.telegram.messenger.i0.T1(rectF.left + org.telegram.messenger.i0.L(13.0f), rectF.right - org.telegram.messenger.i0.L(14.0f), i13), f10, f7);
        if (i20 < f10) {
            canvas.save();
            canvas.clipRect(i20, rectF.top, f10, rectF.bottom);
            canvas.translate(rectF.left + org.telegram.messenger.i0.L(14.0f), rectF.centerY());
            if (!this.x || i13 >= this.s || this.U) {
                paint6.setColor(org.telegram.ui.ActionBar.t6.w0(i19, p6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wf, p6Var));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        if (i20 > f7) {
            canvas.save();
            canvas.clipRect(f7, rectF.top, i20, rectF.bottom);
            canvas.translate(rectF.left + org.telegram.messenger.i0.L(14.0f), rectF.centerY());
            if (b() || this.x || this.U) {
                paint6.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wf, p6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.t6.w0(i19, p6Var));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        float L5 = T1 - org.telegram.messenger.i0.L(7.0f);
        float centerY = rectF.centerY() - org.telegram.messenger.i0.L(5.33f);
        float L6 = T1 - org.telegram.messenger.i0.L(5.33f);
        float centerY2 = rectF.centerY() + org.telegram.messenger.i0.L(5.33f);
        RectF rectF3 = this.F;
        rectF3.set(L5, centerY, L6, centerY2);
        Paint paint10 = paint3;
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint10);
        rectF3.set(org.telegram.messenger.i0.L(5.33f) + i10, rectF.centerY() - org.telegram.messenger.i0.L(5.33f), org.telegram.messenger.i0.L(7.0f) + i10, rectF.centerY() + org.telegram.messenger.i0.L(5.33f));
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint10);
        this.I.set(T1 - org.telegram.messenger.i0.L(24.0f), 0.0f, org.telegram.messenger.i0.L(6.0f) + T1, getHeight());
        this.J.set(i10 - org.telegram.messenger.i0.L(6.0f), 0.0f, org.telegram.messenger.i0.L(24.0f) + i10, getHeight());
        float d = this.O.d(!this.U);
        if (d > 0.0f) {
            float c10 = (int) (e6Var.c() + org.telegram.messenger.i0.L(30.0f));
            float d10 = this.N.d(c10 <= ((float) ((i10 - T1) - org.telegram.messenger.i0.L(8.0f))));
            float T13 = org.telegram.messenger.i0.T1(org.telegram.messenger.i0.L(24.0f), c10, d10);
            float f11 = T1 + i10;
            float f12 = (f11 - T13) / 2.0f;
            float L7 = org.telegram.messenger.i0.L(20.0f) / 2.0f;
            float centerY3 = rectF.centerY() - L7;
            float f13 = (f11 + T13) / 2.0f;
            float centerY4 = rectF.centerY() + L7;
            RectF rectF4 = this.E;
            rectF4.set(f12, centerY3, f13, centerY4);
            int alpha = paint9.getAlpha();
            paint9.setAlpha((int) (alpha * d));
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, rectF4.height() / 2.0f, paint9);
            paint9.setAlpha(alpha);
            RectF rectF5 = this.H;
            rectF5.set(rectF4);
            rectF5.inset(-org.telegram.messenger.i0.L(6.0f), -org.telegram.messenger.i0.L(6.0f));
            canvas.save();
            int L8 = org.telegram.messenger.i0.L(12.0f);
            canvas.translate(org.telegram.messenger.i0.T1(rectF4.centerX() - (L8 / 2.0f), rectF4.left + org.telegram.messenger.i0.L(6.0f), d10), rectF4.centerY());
            kf0 kf0Var3 = kf0Var;
            kf0Var3.setBounds(0, (-L8) / 2, L8, L8 / 2);
            kf0Var3.g = (int) (d * 255.0f);
            kf0Var3.draw(canvas);
            canvas.restore();
            if (d10 > 0.0f) {
                canvas.save();
                canvas.translate(rectF4.left + org.telegram.messenger.i0.L(21.66f), rectF4.centerY() - org.telegram.messenger.i0.L(1.0f));
                e6 e6Var3 = e6Var;
                e6Var3.setBounds(-1, -1, 1, 1);
                e6Var3.B = (int) (d10 * 255.0f * d);
                e6Var3.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        u61 u61Var = this.n;
        return u61Var != null && u61Var.d0();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.P) {
            a(canvas, this.D);
        }
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean contains = this.H.contains(motionEvent.getX(), motionEvent.getY());
        RectF rectF = this.I;
        boolean z10 = !contains && rectF.contains(motionEvent.getX(), motionEvent.getY());
        RectF rectF2 = this.J;
        boolean z11 = !contains && rectF2.contains(motionEvent.getX(), motionEvent.getY());
        boolean z12 = (contains || z10 || z11 || motionEvent.getX() <= rectF.right || motionEvent.getX() >= rectF2.left) ? false : true;
        if (motionEvent.getAction() == 0) {
            this.T = contains;
            this.R = z10;
            this.S = z11;
            if (z10 || z11) {
                b();
                setPlaying(false);
            }
            this.U = z12;
            if (z12) {
                b();
                this.V = this.n != null ? r0.S() / this.n.U() : 1.0f;
                setPlaying(false);
            }
            if (getParent() != null && (this.T || this.R || this.S || this.U)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z13 = this.R;
            RectF rectF3 = this.D;
            if (z13) {
                this.s = Utilities.i(org.telegram.messenger.i0.z1(motionEvent.getX(), rectF3.left + org.telegram.messenger.i0.L(11.33f), rectF3.right - org.telegram.messenger.i0.L(11.33f)), Utilities.l(this.w - Math.max(1.0f / this.r, org.telegram.messenger.i0.L(30.0f) / (rectF3.width() - org.telegram.messenger.i0.L(22.66f)))), 0.0f);
                invalidate();
            } else if (this.S) {
                this.w = Utilities.i(org.telegram.messenger.i0.z1(motionEvent.getX(), rectF3.left + org.telegram.messenger.i0.L(11.33f), rectF3.right - org.telegram.messenger.i0.L(11.33f)), 1.0f, Utilities.l(Math.max(1.0f / this.r, org.telegram.messenger.i0.L(30.0f) / (rectF3.width() - org.telegram.messenger.i0.L(22.66f))) + this.s));
                invalidate();
            } else if (this.U) {
                u61 u61Var = this.n;
                if (u61Var != null) {
                    float i10 = Utilities.i(org.telegram.messenger.i0.z1(motionEvent.getX(), rectF3.left + org.telegram.messenger.i0.L(11.33f), rectF3.right - org.telegram.messenger.i0.L(11.33f)), this.w, this.s);
                    this.V = i10;
                    u61Var.q0((long) (i10 * this.n.U()), false);
                }
                invalidate();
            }
            this.h.t(org.telegram.messenger.i0.g0(Math.round(Math.max(1.0f, (this.w - this.s) * this.r)), false, false), true, true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.T) {
                setPlaying(!b());
            } else if (this.R && this.x) {
                u61 u61Var2 = this.n;
                if (u61Var2 != null) {
                    u61Var2.q0((long) (this.s * u61Var2.U()), false);
                }
                setPlaying(true);
            } else if (this.S && this.x) {
                u61 u61Var3 = this.n;
                if (u61Var3 != null) {
                    u61Var3.q0(Math.max((long) (this.s * u61Var3.U()), ((long) (this.w * this.n.U())) - 1500), false);
                }
                setPlaying(true);
            } else if (this.U && !b()) {
                setPlaying(true);
            }
            this.T = false;
            this.R = false;
            this.S = false;
            this.U = false;
        }
        return this.T || this.R || this.S || this.U || super.dispatchTouchEvent(motionEvent);
    }

    public float getAudioLeft() {
        return this.s;
    }

    public long getAudioLeftMs() {
        return (long) (this.s * getDuration());
    }

    public float getAudioRight() {
        return this.w;
    }

    public long getAudioRightMs() {
        return (long) (this.w * getDuration());
    }

    public long getDuration() {
        u61 u61Var = this.n;
        if (u61Var == null) {
            return 0L;
        }
        return u61Var.U();
    }

    public double getNewDuration() {
        return ((this.w - this.s) * getDuration()) / 1000.0d;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float L = org.telegram.messenger.i0.L(32.0f);
        this.D.set(0.0f, (getHeight() - L) / 2.0f, getWidth(), (getHeight() + L) / 2.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float L = org.telegram.messenger.i0.L(32.0f);
        this.D.set(0.0f, (getMeasuredHeight() - L) / 2.0f, getMeasuredWidth(), (getMeasuredHeight() + L) / 2.0f);
    }

    public void setAllowDraw(boolean z10) {
        if (this.P != z10) {
            this.P = z10;
            invalidate();
        }
    }

    public void setPlaying(boolean z10) {
        if (this.Q) {
            z10 = false;
        }
        if (this.n != null) {
            float S = r0.S() / this.n.U();
            float f7 = this.s;
            if (S < f7 || S > this.w) {
                this.n.q0((long) (f7 * r0.U()), false);
            }
            this.n.u0(z10);
        }
        this.f.a(z10, true);
        eb0 eb0Var = this.y;
        org.telegram.messenger.i0.r(eb0Var);
        if (z10) {
            org.telegram.messenger.i0.h3(eb0Var, 16L);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.h == drawable || this.f == drawable || super.verifyDrawable(drawable);
    }
}
