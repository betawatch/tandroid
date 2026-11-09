package bi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class zd extends View {
    public LinearGradient D;
    public final Matrix E;
    public boolean F;
    public final Drawable G;
    public final org.telegram.ui.Components.i6 H;
    public final org.telegram.ui.Components.i6 I;
    public final wp[] J;
    public final Paint K;
    public final ny0 L;
    public final org.telegram.ui.Components.w5 M;
    public final org.telegram.ui.Components.w5 N;
    public boolean O;
    public long P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public final RectF T;
    public final Path U;
    public final Path V;
    public final Path W;
    public final org.telegram.ui.ActionBar.g6 a;
    public final RectF a0;
    public final Paint b;
    public final Path b0;
    public final Paint c;
    public float c0;
    public final Paint d;
    public float d0;
    public final Paint e;
    public int[] e0;
    public final Paint f;
    public final te.a f0;
    public float g0;
    public final ud h;
    public float h0;
    public long i0;
    public int j0;
    public boolean k0;
    public ValueAnimator l0;
    public final ud n;
    public int r;
    public int s;
    public ValueAnimator w;
    public int x;
    public int y;

    public zd(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.f = new Paint(1);
        this.h = new ud(0, qs.X4);
        this.n = new ud(2, 30);
        this.r = -1135603;
        this.s = -404714;
        this.x = -1135603;
        this.y = -404714;
        this.D = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.r, this.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.E = new Matrix();
        this.F = true;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        this.H = i6Var;
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, true, true);
        this.I = i6Var2;
        this.J = new wp[1];
        Paint paint = new Paint(1);
        this.K = paint;
        this.L = new ny0(org.telegram.messenger.id.M0(2131745037, null), 14.0f, org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        xq xqVar = xq.h;
        this.M = new org.telegram.ui.Components.w5(this, 0L, 320L, xqVar);
        this.N = new org.telegram.ui.Components.w5(this, 0L, 320L, xqVar);
        this.P = -1L;
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.T = new RectF();
        this.U = new Path();
        this.V = new Path();
        this.W = new Path();
        this.a0 = new RectF();
        this.b0 = new Path();
        this.c0 = 0.0f;
        this.f0 = new te.a(this, xqVar, 320L);
        this.a = g6Var;
        Drawable h = jg.g.h(context, R.drawable.msg_premium_liststar);
        this.G = h;
        h.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        i6Var.u(-1);
        i6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        i6Var.w(org.telegram.messenger.g0.L(21.0f));
        i6Var.setCallback(this);
        Point point = org.telegram.messenger.g0.q;
        i6Var.M = point.x;
        i6Var.b = 17;
        i6Var2.u(-570425345);
        i6Var2.w(org.telegram.messenger.g0.L(11.0f));
        i6Var2.setCallback(this);
        i6Var2.M = point.x;
        i6Var2.b = 17;
        paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.h5, g6Var));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
    }

    public final void a(float f10) {
        ValueAnimator valueAnimator = this.l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.c0, f10);
        this.l0 = ofFloat;
        ofFloat.addUpdateListener(new ah.h(this, 9));
        int value = getValue();
        this.l0.addListener(new yd(this, f10, value));
        this.l0.setDuration(320L);
        this.l0.setInterpolator(xq.h);
        this.l0.start();
        if (c(f10) != value) {
            e(c(f10));
        }
        org.telegram.ui.Components.i6 i6Var = this.H;
        i6Var.a();
        i6Var.t(dd.Y0(false, org.telegram.messenger.id.E(c(f10), ','), this.J), true, true);
    }

    public final float b(int i7) {
        int i10 = 1;
        while (true) {
            int[] iArr = this.e0;
            if (i10 >= iArr.length) {
                return 1.0f;
            }
            if (i7 <= iArr[i10]) {
                int i11 = i10 - 1;
                int i12 = iArr[i11];
                return (i11 + ((i7 - i12) / (r3 - i12))) / (iArr.length - 1);
            }
            i10++;
        }
    }

    public final int c(float f10) {
        if (f10 <= 0.0f) {
            return this.e0[0];
        }
        if (f10 >= 1.0f) {
            return this.e0[r7.length - 1];
        }
        int[] iArr = this.e0;
        float length = f10 * (iArr.length - 1);
        int i7 = (int) length;
        float f11 = length - i7;
        float f12 = iArr[i7];
        int i10 = i7 + 1;
        if (i10 < iArr.length) {
            i7 = i10;
        }
        return Math.round((f11 * (iArr[i7] - r2)) + f12);
    }

    public boolean d(float f10) {
        return false;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Paint paint;
        float f10;
        org.telegram.ui.Components.w5 w5Var;
        int i7;
        Path path;
        Paint paint2;
        RectF rectF;
        Canvas canvas2;
        int i10;
        float f11;
        float f12;
        float f13;
        super.dispatchDraw(canvas);
        Matrix matrix = this.E;
        matrix.reset();
        RectF rectF2 = this.Q;
        matrix.postTranslate(rectF2.left, 0.0f);
        matrix.postScale(rectF2.width() / 255.0f, 1.0f);
        this.D.setLocalMatrix(matrix);
        LinearGradient linearGradient = this.D;
        Paint paint3 = this.c;
        paint3.setShader(linearGradient);
        int f14 = i0.a.f(this.c0, this.r, this.s);
        Path path2 = this.U;
        path2.rewind();
        float L = org.telegram.messenger.g0.L(12.0f);
        float L2 = org.telegram.messenger.g0.L(12.0f);
        Path.Direction direction = Path.Direction.CW;
        path2.addRoundRect(rectF2, L, L2, direction);
        int r12 = org.telegram.ui.ActionBar.l6.r1(0.15f, this.r);
        Paint paint4 = this.b;
        paint4.setColor(r12);
        canvas.drawPath(path2, paint4);
        RectF rectF3 = this.R;
        rectF3.set(rectF2);
        float b10 = b(getValue());
        rectF3.right = org.telegram.messenger.g0.T1(rectF3.left + org.telegram.messenger.g0.L(24.0f), rectF3.right, b10);
        Path path3 = this.V;
        path3.rewind();
        path3.addRoundRect(rectF3, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), direction);
        ud udVar = this.h;
        udVar.g(rectF2);
        float f15 = this.c0;
        udVar.h = (f15 * 15.0f) + 1.0f;
        udVar.j = (int) (udVar.b.size() * ((f15 * 0.85f) + 0.15f));
        udVar.d();
        canvas.save();
        canvas.clipPath(path2);
        udVar.a(canvas, f14);
        long j3 = this.P;
        org.telegram.ui.Components.w5 w5Var2 = this.N;
        org.telegram.ui.Components.w5 w5Var3 = this.M;
        ny0 ny0Var = this.L;
        Paint paint5 = this.K;
        if (j3 == -1 || b((int) j3) >= 1.0f || b((int) this.P) <= 0.0f) {
            paint = paint4;
            f10 = b10;
            w5Var = w5Var2;
            i7 = f14;
            path = path3;
            paint2 = paint5;
            rectF = rectF3;
            canvas2 = canvas;
        } else {
            float L3 = rectF2.left + org.telegram.messenger.g0.L(12.0f) + (Utilities.l(b((int) this.P)) * (rectF2.width() - org.telegram.messenger.g0.L(24.0f)));
            float d = w5Var3.d(Math.abs((rectF3.right - ((float) org.telegram.messenger.g0.L(10.0f))) - L3) < ((float) org.telegram.messenger.g0.L(14.0f)));
            float W1 = org.telegram.messenger.g0.W1(w5Var2.d(Math.abs((rectF3.right - ((float) org.telegram.messenger.g0.L(10.0f))) - L3) < ((float) org.telegram.messenger.g0.L(12.0f))), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(16.0f));
            float f16 = (L3 + ny0Var.c) + ((float) (org.telegram.messenger.g0.L(16.0f) * 2)) > rectF2.right ? (L3 - W1) - ny0Var.c : L3 + W1;
            paint5.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
            paint5.setColor(org.telegram.ui.ActionBar.l6.r1(0.6f, f14));
            paint = paint4;
            f10 = b10;
            w5Var = w5Var2;
            i7 = f14;
            rectF = rectF3;
            canvas.drawLine(L3, org.telegram.messenger.g0.T1(rectF2.top, rectF2.centerY(), d), L3, org.telegram.messenger.g0.T1(rectF2.bottom, rectF2.centerY(), d), paint5);
            path = path3;
            paint2 = paint5;
            this.L.c(f16, rectF2.centerY(), 0.6f, i7, canvas);
            canvas2 = canvas;
        }
        Path path4 = path;
        canvas2.drawPath(path4, paint3);
        canvas2.clipPath(path4);
        udVar.a(canvas2, -1);
        long j10 = this.P;
        if (j10 == -1 || b((int) j10) >= 1.0f || b((int) this.P) <= 0.0f) {
            i10 = i7;
        } else {
            float L4 = rectF2.left + org.telegram.messenger.g0.L(12.0f) + (Utilities.l(b((int) this.P)) * (rectF2.width() - org.telegram.messenger.g0.L(24.0f)));
            float d2 = w5Var3.d(Math.abs((rectF.right - ((float) org.telegram.messenger.g0.L(10.0f))) - L4) < ((float) org.telegram.messenger.g0.L(14.0f)));
            float W12 = org.telegram.messenger.g0.W1(w5Var.d(Math.abs((rectF.right - ((float) org.telegram.messenger.g0.L(10.0f))) - L4) < ((float) org.telegram.messenger.g0.L(12.0f))), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(16.0f));
            float f17 = (ny0Var.c + L4) + ((float) (org.telegram.messenger.g0.L(16.0f) * 2)) > rectF2.right ? (L4 - W12) - ny0Var.c : W12 + L4;
            paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
            paint2.setColor(org.telegram.ui.ActionBar.l6.r1(0.4f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.h5, this.a)));
            i10 = i7;
            canvas2.drawLine(L4, org.telegram.messenger.g0.T1(rectF2.top, rectF2.centerY(), d2), L4, org.telegram.messenger.g0.T1(rectF2.bottom, rectF2.centerY(), d2), paint2);
            this.L.c(f17, rectF2.centerY(), 0.75f, -1, canvas);
            canvas2 = canvas;
        }
        canvas2.restore();
        invalidate();
        if (this.O) {
            float height = rectF2.right - (rectF2.height() / 2.0f);
            float centerY = rectF2.centerY();
            int f18 = i0.a.f(0.5f, paint.getColor(), this.s);
            Paint paint6 = this.d;
            paint6.setColor(f18);
            Path path5 = this.W;
            path5.rewind();
            f11 = 0.5f;
            f12 = 2.0f;
            f13 = 0.15f;
            path5.addRoundRect(height - org.telegram.messenger.g0.L(1.0f), centerY - org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f) + height, centerY + org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), direction);
            path5.addRoundRect(height - org.telegram.messenger.g0.L(6.0f), centerY - org.telegram.messenger.g0.L(1.0f), height + org.telegram.messenger.g0.L(6.0f), centerY + org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), direction);
            canvas2.drawPath(path5, paint6);
        } else {
            f11 = 0.5f;
            f12 = 2.0f;
            f13 = 0.15f;
        }
        float L5 = (rectF.right - org.telegram.messenger.g0.L(16.0f)) - org.telegram.messenger.g0.L(4.0f);
        float centerY2 = rectF.centerY() - (org.telegram.messenger.g0.L(16.0f) / f12);
        float L6 = rectF.right - org.telegram.messenger.g0.L(4.0f);
        float L7 = (org.telegram.messenger.g0.L(16.0f) / f12) + rectF.centerY();
        RectF rectF4 = this.S;
        rectF4.set(L5, centerY2, L6, L7);
        canvas2.drawRoundRect(rectF4, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), this.e);
        float L8 = org.telegram.messenger.g0.L(9.0f) / rectF2.width();
        float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.T1(rectF4.left, rectF4.right, f10), org.telegram.messenger.g0.T1(rectF4.left + org.telegram.messenger.g0.L(9.0f), rectF4.right - org.telegram.messenger.g0.L(9.0f), f10), Math.min(Utilities.l(f10 / L8), Utilities.l((1.0f - f10) / L8)));
        org.telegram.ui.Components.i6 i6Var = this.I;
        float c10 = i6Var.c() + org.telegram.messenger.g0.L(20.0f);
        org.telegram.ui.Components.i6 i6Var2 = this.H;
        float max = Math.max(c10, i6Var2.c() + org.telegram.messenger.g0.L(50.0f));
        float L9 = org.telegram.messenger.g0.L(44.0f);
        float i11 = Utilities.i(T1 - (max / f12), (rectF2.right - max) - org.telegram.messenger.g0.L(4.0f), rectF2.left + org.telegram.messenger.g0.L(4.0f));
        float L10 = rectF2.top - org.telegram.messenger.g0.L(21.0f);
        RectF rectF5 = this.a0;
        rectF5.set(i11, (rectF2.top - org.telegram.messenger.g0.L(21.0f)) - L9, max + i11, L10);
        float height2 = rectF5.height();
        float f19 = height2 / f12;
        float i12 = Utilities.i(T1, rectF5.right, rectF5.left);
        float i13 = Utilities.i(i12 - org.telegram.messenger.g0.L(9.0f), rectF5.right, rectF5.left);
        float i14 = Utilities.i(org.telegram.messenger.g0.L(9.0f) + i12, rectF5.right, rectF5.left);
        float i15 = Utilities.i(this.c0 - this.d0, 1.0f, -1.0f) * 60.0f;
        float f20 = f13;
        float L11 = rectF5.bottom + org.telegram.messenger.g0.L(8.0f);
        Path path6 = this.b0;
        path6.rewind();
        float f21 = rectF5.left;
        float f22 = rectF5.top;
        RectF rectF6 = this.T;
        rectF6.set(f21, f22, f21 + height2, f22 + height2);
        path6.arcTo(rectF6, -180.0f, 90.0f);
        float f23 = rectF5.right;
        float f24 = rectF5.top;
        rectF6.set(f23 - height2, f24, f23, f24 + height2);
        path6.arcTo(rectF6, -90.0f, 90.0f);
        float f25 = rectF5.right;
        float f26 = rectF5.bottom;
        rectF6.set(f25 - height2, f26 - height2, f25, f26);
        int i16 = i10;
        path6.arcTo(rectF6, 0.0f, (float) Utilities.h(((Math.acos(Utilities.l((i14 - rectF6.centerX()) / f19)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d));
        float f27 = 0.7f * height2;
        if (i13 < rectF5.right - f27) {
            path6.lineTo(i14, rectF5.bottom);
            path6.lineTo(i12 + f12, rectF5.bottom + org.telegram.messenger.g0.L(8.0f));
        }
        path6.lineTo(i12, rectF5.bottom + org.telegram.messenger.g0.L(8.0f) + 1.0f);
        if (i14 > rectF5.left + f27) {
            path6.lineTo(i12 - f12, rectF5.bottom + org.telegram.messenger.g0.L(8.0f));
            path6.lineTo(i13, rectF5.bottom);
        }
        float f28 = rectF5.left;
        float f29 = rectF5.bottom;
        rectF6.set(f28, f29 - height2, f28 + height2, f29);
        float h = ((float) Utilities.h(((Math.acos(Utilities.l((i13 - rectF6.left) / f19)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d)) + 90.0f;
        path6.arcTo(rectF6, h, 180.0f - h);
        path6.lineTo(rectF5.left, rectF5.bottom);
        path6.close();
        RectF rectF7 = org.telegram.messenger.g0.P;
        rectF7.set(rectF5);
        rectF7.inset(-org.telegram.messenger.g0.L(12.0f), -org.telegram.messenger.g0.L(12.0f));
        ud udVar2 = this.n;
        udVar2.g(rectF7);
        udVar2.h = (this.c0 * 15.0f) + 1.0f;
        udVar2.d();
        canvas2.save();
        udVar2.a(canvas2, i16);
        canvas2.restore();
        canvas2.save();
        canvas2.rotate(i15, i12, L11);
        if (Math.abs(this.c0 - this.d0) > 0.001f) {
            this.d0 = org.telegram.messenger.g0.T1(this.d0, this.c0, 0.1f);
            invalidate();
        }
        this.f.setShader(this.D);
        canvas2.drawPath(path6, this.f);
        canvas2.save();
        canvas2.clipPath(path6);
        canvas2.rotate(-i15, i12, L11);
        udVar2.a(canvas2, -1);
        canvas2.restore();
        canvas2.save();
        float f30 = 1.0f - (this.f0.e * f20);
        canvas2.scale(f30, f30, rectF5.centerX(), rectF5.top - (rectF5.height() * f11));
        this.G.setBounds((int) ((rectF5.centerX() - (i6Var2.c() / f12)) + org.telegram.messenger.g0.L(-12.0f)), (int) (rectF5.centerY() - org.telegram.messenger.g0.L(10.0f)), (int) ((rectF5.centerX() - (i6Var2.c() / f12)) + org.telegram.messenger.g0.L(8.0f)), (int) (rectF5.centerY() + org.telegram.messenger.g0.L(10.0f)));
        if (this.F) {
            this.G.draw(canvas2);
        }
        i6Var2.o(rectF5.left + org.telegram.messenger.g0.L(24.0f), rectF5.top, rectF5.right, rectF5.bottom);
        i6Var2.draw(canvas2);
        canvas2.restore();
        i6Var.o(rectF5.left, rectF5.top + org.telegram.messenger.g0.L(10.0f), rectF5.right, rectF5.bottom + org.telegram.messenger.g0.L(10.0f));
        i6Var.B = (int) (this.f0.e * 255.0f);
        i6Var.draw(canvas2);
        canvas2.restore();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.g0 = motionEvent.getX();
            this.h0 = motionEvent.getY();
            this.j0 = motionEvent.getPointerId(0);
            this.i0 = System.currentTimeMillis();
            this.k0 = false;
            return true;
        }
        if (motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.j0) {
            float x10 = motionEvent.getX() - this.g0;
            float y10 = motionEvent.getY() - this.h0;
            if (!this.k0 && Math.abs(x10) > Math.abs(y10 * 1.5f) && Math.abs(x10) > org.telegram.messenger.g0.e) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.k0 = true;
                ValueAnimator valueAnimator = this.l0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            }
            if (this.k0) {
                int value = getValue();
                this.c0 = Utilities.l((x10 / (getWidth() * 1.0f)) + this.c0);
                if (getValue() != value) {
                    e(getValue());
                    org.telegram.ui.Components.i6 i6Var = this.H;
                    i6Var.a();
                    i6Var.t(dd.Y0(false, org.telegram.messenger.id.E(getValue(), ','), this.J), true, true);
                }
                this.g0 = motionEvent.getX();
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (!this.k0 && motionEvent.getPointerId(0) == this.j0 && a8.r9.a(this.g0, this.h0, motionEvent.getX(), motionEvent.getY()) < org.telegram.messenger.g0.e && System.currentTimeMillis() - this.i0 <= ViewConfiguration.getTapTimeout() * 1.5f) {
                float x11 = motionEvent.getX();
                motionEvent.getY();
                if (!d(x11)) {
                    float x12 = motionEvent.getX();
                    RectF rectF = this.Q;
                    float l10 = Utilities.l((x12 - rectF.left) / rectF.width());
                    long j3 = this.P;
                    if (j3 > 0 && Math.abs(b((int) j3) - l10) < 0.035f) {
                        l10 = Utilities.l(b((int) this.P));
                    }
                    a(l10);
                }
            }
            this.k0 = false;
            return true;
        }
        return true;
    }

    public abstract void e(int i7);

    public final void f(int i7, int i10, boolean z9) {
        if (this.x == i7 && this.y == i10) {
            return;
        }
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.w = null;
        }
        if (!z9) {
            this.x = i7;
            this.r = i7;
            this.y = i10;
            this.s = i10;
            this.D = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.r, this.s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            invalidate();
            return;
        }
        int i11 = this.r;
        int i12 = this.s;
        this.x = i7;
        this.y = i10;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.w = ofFloat;
        ofFloat.addUpdateListener(new wd(this, i11, i7, i12, i10, 0));
        this.w.addListener(new xd(this, i11, i7, i12, i10));
        this.w.setInterpolator(xq.h);
        this.w.setDuration(420L);
        this.w.start();
    }

    public final void g(String str) {
        this.f0.a(!TextUtils.isEmpty(str), true);
        org.telegram.ui.Components.i6 i6Var = this.I;
        i6Var.a();
        i6Var.t(str, true, true);
    }

    public float getProgress() {
        return this.c0;
    }

    public int getValue() {
        return c(this.c0);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(220.0f));
        int measuredWidth = getMeasuredWidth();
        getMeasuredHeight();
        this.Q.set(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(135.0f), measuredWidth - r5, org.telegram.messenger.g0.L(24.0f) + r0);
        this.c.setColor(-1069811);
        this.e.setColor(-1);
    }

    public void setStarsTop(long j3) {
        this.P = j3;
        invalidate();
    }

    public void setTopText(String str) {
        this.L.q(str);
    }

    public void setValue(int i7) {
        float b10 = b(i7);
        this.c0 = b10;
        this.d0 = b10;
        org.telegram.ui.Components.i6 i6Var = this.H;
        i6Var.a();
        i6Var.t(dd.Y0(false, org.telegram.messenger.id.E(getValue(), ','), this.J), true, true);
    }

    public void setValueAnimated(int i7) {
        if (i7 == getValue()) {
            return;
        }
        a(b(i7));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.H || super.verifyDrawable(drawable);
    }
}
