// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class bz1 extends View implements eu5 {
    public final hn E;
    public final mm F;
    public final Paint G;
    public boolean H;
    public boolean I;
    public Drawable J;
    public int K;
    public int L;
    public int M;
    public int N;
    public final Paint O;
    public float P;
    public float Q;
    public final wm2[] R;
    public final mm S;
    public final v41 T;
    public boolean U;
    public final x84 V;
    public boolean W;
    public boolean a;
    public float a0;
    public final mm b;
    public final mm b0;
    public final vnb c;
    public final mm c0;
    public int d;
    public final Path d0;
    public Drawable e;
    public final Paint e0;
    public Drawable f;
    public final hn f0;
    public float g0;
    public Drawable h;
    public dc h0;
    public final RectF i0;
    public ChatActivityEnterView j0;
    public float k0;
    public float l0;
    public float m0;
    public final ul n;
    public int n0;
    public int o0;
    public boolean p0;
    public final mm q0;
    public float r;
    public Drawable r0;
    public float s;
    public jl0 s0;
    public boolean t0;
    public int u0;
    public int v0;
    public long w;
    public int w0;
    public int x;
    public ValueAnimator x0;
    public boolean y;
    public final RectF y0;

    public bz1(int i, vnb vnbVar, Context context, boolean z) {
        super(context);
        k43 k43Var = k43.h;
        this.b = new mm(this, 0L, 260L, k43Var);
        this.F = new mm(this, 0L, 320L, k43Var);
        this.G = new Paint(1);
        this.L = -1;
        this.M = -1;
        this.O = new Paint(1);
        this.R = new wm2[1];
        this.S = new mm(this, 0L, 420L, k43Var);
        this.T = new v41(this);
        this.V = new x84();
        this.b0 = new mm(this, 0L, 420L, k43Var);
        this.c0 = new mm(this, 0L, 500L, k43Var);
        this.d0 = new Path();
        Paint paint = new Paint(1);
        this.e0 = paint;
        hn hnVar = new hn(true, true, true);
        this.f0 = hnVar;
        this.g0 = 1.0f;
        this.i0 = new RectF();
        this.q0 = new mm(1.0f, this, 0L, 320L, k43Var);
        this.y0 = new RectF();
        this.d = i;
        this.c = vnbVar;
        this.H = z;
        hn hnVar2 = new hn(false, false, false);
        this.E = hnVar2;
        hnVar2.w(hl.L(15.0f));
        hnVar2.x(hl.o());
        hnVar2.u(-1);
        hnVar2.b = 3;
        hnVar2.setCallback(this);
        hnVar2.N = hl.q.x;
        this.e = c00.e(context, i);
        this.f = c00.e(context, i);
        this.h = c00.e(context, i);
        this.n = new ul(hl.L(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        hnVar.setCallback(this);
        hnVar.u(-1);
        hnVar.w(hl.L(12.0f));
        hnVar.x(hl.o());
        hnVar.b = 17;
    }

    public final void a() {
        ValueAnimator valueAnimator = this.x0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.x0 = ofFloat;
        ofFloat.addUpdateListener(new az1(this, (byte) 0));
        this.x0.addListener(new jb1((Object) this, (byte) 10));
        this.x0.setDuration(180L);
        this.x0.setInterpolator(new OvershootInterpolator());
        this.x0.start();
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return true;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (!this.I) {
            super.draw(canvas);
            return;
        }
        canvas.saveLayerAlpha(-hl.L(6.0f), -hl.L(6.0f), getWidth(), getHeight(), jn7.d4, 31);
        super.draw(canvas);
        float L = hl.L(18.0f);
        RectF rectF = this.y0;
        float f = L / 2.0f;
        float L2 = (rectF.left + f) - hl.L(6.0f);
        float L3 = (rectF.top + f) - hl.L(6.0f);
        canvas.drawCircle(L2, L3, hl.L(2.0f) + f, aob.Gm);
        canvas.drawCircle(L2, L3, f, this.G);
        if (this.J == null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
            this.J = mutate;
            int i = this.u0;
            this.K = i;
            mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        if (this.K != this.u0) {
            Drawable drawable = this.J;
            int i2 = this.u0;
            this.K = i2;
            drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        }
        this.J.setBounds((int) (L2 - hl.L(8.0f)), (int) (L3 - hl.L(8.0f)), (int) (L2 + hl.L(8.0f)), (int) (L3 + hl.L(8.0f)));
        this.J.draw(canvas);
        canvas.restore();
    }

    @Override // eu5
    public final void e(RectF rectF) {
        float circleWidth = getCircleWidth();
        float circleHeight = getCircleHeight();
        float measuredWidth = (getMeasuredWidth() - hl.L(4.0f)) - this.P;
        float measuredHeight = (getMeasuredHeight() - hl.L(4.0f)) - this.Q;
        rectF.set(measuredWidth - circleWidth, measuredHeight - circleHeight, measuredWidth, measuredHeight);
    }

    @Override // eu5
    public final void f(Canvas canvas, float f) {
        float R1;
        float R12;
        float U1;
        float f2;
        float f3;
        int i = this.N;
        if (i != 0) {
            Paint paint = this.O;
            paint.setColor(i);
            paint.setAlpha((int) (Color.alpha(this.N) * f));
            float f4 = this.S.c;
            float f5 = this.F.c;
            if (this.t0) {
                R1 = hl.R1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - hl.L(4.0f), f4) - this.P;
                U1 = getCircleHeight() * f4;
                R12 = ((getMeasuredHeight() - this.Q) - hl.L(4.0f)) - (U1 / 2.0f);
            } else {
                R1 = hl.R1(hl.R1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - hl.L(4.0f), f4) - this.P, getMeasuredWidth() - hl.L(9.0f), f5);
                R12 = hl.R1(((getMeasuredHeight() - this.Q) - hl.L(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - hl.L(24.0f), f5);
                U1 = hl.U1(f5, getCircleHeight(), hl.L(32.0f)) * f4;
            }
            float R13 = hl.R1(getCircleWidth(), this.E.c() + hl.L(this.H ? 20.0f : 22.0f), f5) * f4;
            if (f4 > 0.0f && R13 > 0.0f && U1 > 0.0f) {
                RectF rectF = hl.P;
                float f6 = U1 / 2.0f;
                rectF.set(R1 - R13, R12 - f6, R1, f6 + R12);
                rectF.inset(-hl.L(4.0f), -hl.L(4.0f));
                float min = (Math.min(R13, U1) / 2.0f) + hl.L(4.0f);
                canvas.drawRoundRect(rectF, min, min, paint);
            }
            hn hnVar = this.f0;
            float i2 = (1.0f - f5) * hnVar.i();
            if (i2 > 0.0f) {
                float max = Math.max(hnVar.c() + hl.L(9.0f), hl.L(18.0f));
                if (this.t0) {
                    f2 = R1 - hl.L(50.0f);
                    f3 = (max / 2.0f) + (R12 - (getCircleHeight() / 2.0f));
                } else {
                    float f7 = max / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.P) - f7;
                    float measuredHeight = (getMeasuredHeight() - this.Q) - f7;
                    f2 = measuredWidth;
                    f3 = measuredHeight;
                }
                canvas.drawCircle(f2, f3, ((max / 2.0f) + hl.L(2.0f)) * i2 * this.g0, paint);
            }
        }
        draw(canvas);
    }

    public final void g(int i, boolean z) {
        this.f0.t(i <= 0 ? "" : String.valueOf(i), z, true);
        invalidate();
    }

    public int getCircleHeight() {
        int i = this.M;
        return i >= 0 ? i : getMeasuredHeight() - hl.L(8.0f);
    }

    public int getCircleWidth() {
        int i = this.L;
        return i >= 0 ? i : getMeasuredHeight() - hl.L(8.0f);
    }

    public int getFillColor() {
        return aob.v0(aob.Pe, this.c);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [int, short] */
    public final void h(boolean z) {
        if (this.W != z || ((z && Math.abs(this.a0 - (-3.0f)) >= 0.01f) || !this.U)) {
            this.U = true;
            if (!this.W && z) {
                this.c0.e(true, 0.0f);
            }
            mm mmVar = this.b0;
            mmVar.f = (int) ((!z || mmVar.c < 1.0f) ? 0L : 650L);
            this.W = z;
            this.a0 = z ? -3.0f : 1.0f;
            invalidate();
        }
    }

    public final void i(int i, long j, boolean z) {
        if (this.w == j && this.x == i) {
            return;
        }
        this.w = j;
        this.x = i;
        hn hnVar = this.E;
        if (j > 0) {
            hnVar.t(nza.Z0(false, "⭐️".concat(ob6.E(j * Math.max(1, i), ',')), this.R), z, true);
        } else {
            hnVar.t("", z, true);
        }
        if (z) {
            invalidate();
        } else {
            this.F.a(this.w > 0);
        }
    }

    public boolean j() {
        return this instanceof u02;
    }

    public final void k() {
        boolean z = this.H;
        vnb vnbVar = this.c;
        int v0 = z ? -1 : aob.v0(aob.Pe, vnbVar);
        int v02 = aob.v0(aob.Nl, vnbVar);
        int v03 = aob.v0(aob.Tf, vnbVar);
        if (v0 != this.u0 || v02 != this.v0 || v03 != this.w0) {
            this.u0 = v0;
            this.v0 = v02;
            this.w0 = v03;
            Drawable drawable = this.e;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(v0, mode));
            this.f.setColorFilter(new PorterDuffColorFilter(Color.argb(jn7.J2, Color.red(v02), Color.green(v02), Color.blue(v02)), mode));
            this.h.setColorFilter(new PorterDuffColorFilter(v03, mode));
        }
        boolean z2 = this.H;
        Paint paint = this.G;
        if (z2) {
            paint.setColor(aob.v0(aob.Pe, vnbVar));
        } else if (j()) {
            paint.setColor(getFillColor());
        } else {
            paint.setColor(vm2.o(-1, 75));
        }
    }

    public final int l() {
        getMeasuredHeight();
        return m();
    }

    public final int m() {
        return (int) hl.R1(this.P + getCircleWidth() + this.P, hl.L(this.H ? 20.0f : 22.0f) + hl.L(18.0f) + this.E.d, (this.w > 0 ? 1.0f : 0.0f) * (d() ? 1.0f : 0.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c6, code lost:
    
        if ((android.os.SystemClock.uptimeMillis() - r2.F6) < 1200) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x059d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        long j;
        boolean z;
        boolean z2;
        Paint paint;
        float f2;
        long j2;
        float f3;
        int A;
        int measuredHeight;
        float d;
        int i;
        int i2;
        float f4;
        float R1;
        float R12;
        float U1;
        float f5;
        int i3;
        float f6;
        float f7;
        float f8;
        float i4;
        float measuredWidth;
        float measuredHeight2;
        float f9;
        int i5;
        float f10;
        float f11;
        int i6;
        float f12;
        float f13;
        float f14;
        float L;
        float sin;
        Paint paint2;
        float f15;
        float f16;
        float f17;
        ChatActivityEnterView chatActivityEnterView;
        long uptimeMillis;
        bn3 bn3Var;
        int save = canvas.save();
        if (this.H) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), jn7.d4, 31);
        }
        k();
        float N = hl.N(3.0f);
        float N2 = hl.N(38.0f);
        float N3 = hl.N(20.0f);
        hn hnVar = this.E;
        RectF rectF = this.y0;
        rectF.set((getMeasuredWidth() - hl.R1(Math.max(N2, hnVar.c() + N3), N2, this.s)) - N, (getMeasuredHeight() - N2) - N, getMeasuredWidth() - N, getMeasuredHeight() - N);
        if (this.h0 == null || !this.H) {
            f = 1.0f;
            j = 1200;
        } else {
            j = 1200;
            if (this.w <= 0 && Math.abs(rectF.width() - rectF.height()) < 1.0f) {
                ChatActivityEnterView chatActivityEnterView2 = this.j0;
                if (chatActivityEnterView2 != null) {
                    boolean z3 = chatActivityEnterView2.T1 || chatActivityEnterView2.S1 != null || ((bn3Var = chatActivityEnterView2.j1) != null && bn3Var.q());
                    if (chatActivityEnterView2.Q3 != null || chatActivityEnterView2.T3 != null || (chatActivityEnterView2.X0() && !z3)) {
                        f = 1.0f;
                        chatActivityEnterView2.F6 = SystemClock.uptimeMillis();
                    } else if (chatActivityEnterView2.F6 != 0) {
                        f = 1.0f;
                    }
                }
                f = 1.0f;
                z = true;
                if (!z && this.h0 != null && (chatActivityEnterView = this.j0) != null && chatActivityEnterView.F6 != 0) {
                    uptimeMillis = SystemClock.uptimeMillis() - this.j0.F6;
                    if (j - uptimeMillis > 0) {
                        postInvalidateDelayed(1216 - uptimeMillis);
                    }
                }
                z2 = this.H;
                Paint paint3 = this.G;
                if (z2) {
                    canvas2.drawRoundRect(rectF, hl.L(19.0f), hl.L(19.0f), paint3);
                }
                if (z) {
                    paint = paint3;
                    f2 = 20.0f;
                    j2 = 0;
                } else {
                    dc dcVar = this.h0;
                    int color = paint3.getColor();
                    Paint paint4 = dcVar.j;
                    Paint paint5 = dcVar.h;
                    f2 = 20.0f;
                    Paint paint6 = dcVar.m;
                    j2 = 0;
                    Path path = dcVar.o;
                    Matrix matrix = dcVar.q;
                    float d2 = dcVar.f.d(dcVar.c);
                    if (d2 > 0.003f) {
                        float height = rectF.height() / 2.0f;
                        dcVar.a(height, color);
                        float e = dcVar.e();
                        canvas2.save();
                        path.rewind();
                        paint = paint3;
                        path.addCircle(rectF.centerX(), rectF.centerY(), height, Path.Direction.CW);
                        canvas2.clipPath(path);
                        canvas2.translate(rectF.centerX(), rectF.centerY());
                        matrix.reset();
                        float f18 = -height;
                        matrix.setTranslate((((e / 1.25f) % f) * 2.2f * height) + (1.1f * f18), 0.0f);
                        matrix.postRotate(-32.0f);
                        dcVar.r.setLocalMatrix(matrix);
                        paint4.setAlpha((int) (d2 * 255.0f));
                        float f19 = f;
                        canvas2.drawRect(f18, f18, height, height, paint4);
                        float f20 = height;
                        int i7 = 0;
                        while (i7 < 5) {
                            float f21 = (e + dcVar.L[i7]) / dcVar.M[i7];
                            float floor = f21 - ((int) Math.floor(f21));
                            float f22 = ((((104729 * i7) + (r4 * 7919)) & 1023) / 1023.0f) - 0.5f;
                            float L2 = (hl.L(3.0f) * f22) + dcVar.N[i7];
                            float x = c00.x(floor, f20, 2.1f, 1.05f * f18);
                            float f23 = (x * (-0.848f)) - (L2 * 0.53f);
                            float f24 = (L2 * (-0.848f)) + (x * 0.53f);
                            float f25 = f20;
                            int i8 = i7;
                            float sin2 = ((float) Math.sin(floor * 3.141592653589793d)) * d2 * 0.5f;
                            if (sin2 <= 0.01f) {
                                paint2 = paint6;
                                f15 = d2;
                                f16 = f19;
                                f17 = f25;
                            } else {
                                float z4 = xnb.z(f22, 0.3f, f19, dcVar.O[i8]);
                                float f26 = dcVar.P[i8];
                                int i9 = 0;
                                while (i9 < 4) {
                                    float f27 = i9 / 4.0f;
                                    int i10 = i9 + 1;
                                    float f28 = f19;
                                    float f29 = i10 / 4.0f;
                                    float f30 = z4;
                                    float f31 = f28 - f27;
                                    paint6.setStrokeWidth(Math.max(hl.L(0.5f), f30 * 0.55f * f31));
                                    paint6.setColor(Color.argb((int) (sin2 * 255.0f * 0.55f * f31 * f31), jn7.d4, jn7.d4, jn7.d4));
                                    float f32 = f26 * (-0.848f);
                                    float f33 = f23 - (f32 * f27);
                                    float f34 = f26 * 0.53f;
                                    float f35 = f24 - (f27 * f34);
                                    float f36 = f23 - (f32 * f29);
                                    float f37 = f24 - (f34 * f29);
                                    Paint paint7 = paint6;
                                    canvas.drawLine(f33, f35, f36, f37, paint7);
                                    paint6 = paint7;
                                    f24 = f24;
                                    z4 = f30;
                                    f25 = f25;
                                    f19 = f28;
                                    floor = floor;
                                    d2 = d2;
                                    i9 = i10;
                                }
                                Paint paint8 = paint6;
                                float f38 = f24;
                                paint2 = paint8;
                                f15 = d2;
                                f16 = f19;
                                float f39 = z4;
                                f17 = f25;
                                paint5.setColor(-1);
                                paint5.setAlpha((int) (sin2 * 255.0f));
                                canvas.save();
                                canvas.translate(f23, f38);
                                canvas.rotate(floor * 30.0f);
                                canvas.scale(f39, f39);
                                canvas.drawPath(dcVar.i, paint5);
                                canvas.restore();
                            }
                            i7 = i8 + 1;
                            paint6 = paint2;
                            f20 = f17;
                            f19 = f16;
                            d2 = f15;
                        }
                        canvas2 = canvas;
                        f3 = f19;
                        canvas2.restore();
                        Drawable drawable = c() ? this.f : this.e;
                        if (this.H) {
                            A = Math.round((rectF.right - (rectF.height() / 2.0f)) - (drawable.getIntrinsicWidth() / 2.0f));
                            measuredHeight = Math.round(((rectF.height() / 2.0f) + rectF.top) - (drawable.getIntrinsicHeight() / 2.0f));
                        } else {
                            A = bp1.A(2, getMeasuredWidth() - (getMeasuredHeight() / 2), drawable);
                            measuredHeight = (getMeasuredHeight() - drawable.getIntrinsicHeight()) / 2;
                            if (b()) {
                                measuredHeight -= hl.L(f3);
                            } else {
                                A += hl.L(2.0f);
                            }
                        }
                        int i11 = A;
                        int i12 = measuredHeight;
                        float d3 = this.b0.d(this.W);
                        d = this.S.d(d());
                        float d4 = (f3 - this.r) * this.F.d(this.w <= j2 && !this.y);
                        float f40 = f3;
                        float e2 = this.q0.e(false, f40);
                        i = (d > f40 ? 1 : (d == f40 ? 0 : -1));
                        if (i < 0) {
                            canvas2.save();
                            f4 = 24.0f;
                            float f41 = f40 - e2;
                            canvas2.translate((-hl.L(24.0f)) * f41, hl.L(24.0f) * f41);
                            float R13 = hl.R1(0.35f, f40, e2);
                            float f42 = i11;
                            float f43 = i12;
                            i2 = i;
                            canvas2.scale(R13, R13, (drawable.getIntrinsicWidth() / 2.0f) + f42, (drawable.getIntrinsicHeight() / 2.0f) + f43);
                            canvas2.rotate(60.0f * f41, (drawable.getIntrinsicWidth() / 2.0f) + f42, (drawable.getIntrinsicHeight() / 2.0f) + f43);
                            if (z) {
                                float f44 = this.h0.f.c;
                                if (f44 <= 0.001f) {
                                    f14 = 0.001f;
                                    L = 0.0f;
                                } else {
                                    f14 = 0.001f;
                                    double e3 = r2.e() * 6.283185307179586d;
                                    L = hl.L(1.25f) * f44 * ((float) Math.sin((Math.sin(e3 / 3.0999999046325684d) * 0.6000000238418579d) + (e3 / 1.2999999523162842d)));
                                }
                                canvas2.translate(0.0f, L);
                                float f45 = this.h0.f.c;
                                if (f45 <= f14) {
                                    sin = 0.0f;
                                } else {
                                    double e4 = r2.e() * 6.283185307179586d;
                                    sin = f45 * 3.5f * ((float) Math.sin((Math.sin(e4 / 2.9000000953674316d) * 0.5d) + (e4 / 1.7000000476837158d) + 1.100000023841858d));
                                }
                                canvas2.rotate(sin, (drawable.getIntrinsicWidth() / 2.0f) + f42, (drawable.getIntrinsicHeight() / 2.0f) + f43);
                            }
                            drawable.setBounds(i11, i12, drawable.getIntrinsicWidth() + i11, drawable.getIntrinsicHeight() + i12);
                            drawable.setAlpha((int) (hl.R1(1.0f, 0.6f, this.b.d(this.a)) * (1.0f - d4) * 255.0f));
                            drawable.draw(canvas2);
                            canvas2.restore();
                        } else {
                            i2 = i;
                            f4 = 24.0f;
                        }
                        if (z && i2 < 0) {
                            this.h0.b(canvas2, rectF, this.u0, paint.getColor());
                        }
                        if (this.t0) {
                            R1 = hl.R1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - hl.L(4.0f), d) - this.P;
                            U1 = getCircleHeight() * d;
                            R12 = ((getMeasuredHeight() - this.Q) - hl.L(4.0f)) - (U1 / 2.0f);
                        } else {
                            R1 = hl.R1(hl.R1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - hl.L(4.0f), d) - this.P, getMeasuredWidth() - hl.L(9.0f), d4);
                            R12 = hl.R1(((getMeasuredHeight() - this.Q) - hl.L(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - hl.L(f4), d4);
                            U1 = hl.U1(d4, getCircleHeight(), hl.L(32.0f)) * d;
                        }
                        float R14 = hl.R1(getCircleWidth(), hnVar.c() + hl.L(this.H ? f2 : 22.0f), d4);
                        float R15 = hl.R1(R14, U1, this.s) * d;
                        float f46 = R14 - R15;
                        float f47 = R1 - (R15 / 2.0f);
                        setPivotX(f47);
                        setPivotY(R12);
                        float f48 = R12;
                        float R16 = hl.R1(1.0f, 0.79f, this.r);
                        if (d > 0.0f) {
                            canvas2.save();
                            Path path2 = this.d0;
                            path2.rewind();
                            f8 = 10.0f;
                            float min = Math.min(R15, U1) / 2.0f;
                            float f49 = U1;
                            RectF rectF2 = hl.P;
                            float f50 = R1 - R15;
                            i3 = save;
                            float f51 = f49 / 2.0f;
                            f6 = d4;
                            float f52 = f48 - f51;
                            float f53 = f48 + f51;
                            rectF2.set(f50, f52, R1, f53);
                            float f54 = R1;
                            path2.addRoundRect(rectF2, min, min, Path.Direction.CW);
                            float centerX = rectF2.centerX();
                            float centerY = rectF2.centerY();
                            if (this.r > 0.0f) {
                                Drawable drawable2 = this.r0;
                                if (drawable2 == null) {
                                    f10 = f50;
                                    drawable2 = getContext().getResources().getDrawable(R.drawable.send_outline);
                                    this.r0 = drawable2;
                                } else {
                                    f10 = f50;
                                }
                                i5 = i11;
                                drawable2.setColorFilter(paint.getColor(), PorterDuff.Mode.MULTIPLY);
                                br3.d(this.r0, centerX, centerY, 17);
                                br3.b(canvas2, this.r0, this.r);
                            } else {
                                i5 = i11;
                                f10 = f50;
                            }
                            canvas2.scale(R16, R16, centerX, centerY);
                            if (this.s0 != null) {
                                Rect rect = hl.Q;
                                rectF2.round(rect);
                                rect.inset(-hl.L(7.0f), -hl.L(7.0f));
                                this.s0.setBounds(rect);
                                this.s0.draw(canvas2);
                            }
                            Paint paint9 = paint;
                            if (!this.H) {
                                canvas2.drawPath(path2, paint9);
                            }
                            canvas2.clipPath(path2);
                            int i13 = (d3 > 0.0f ? 1 : (d3 == 0.0f ? 0 : -1));
                            if (i13 > 0) {
                                Paint paint10 = this.e0;
                                paint10.setColor(-1);
                                paint10.setAlpha((int) (d3 * 255.0f));
                                float L3 = hl.L(8.66f);
                                rectF2.set(f47 - L3, f48 - L3, f47 + L3, f48 + L3);
                                if (this.U) {
                                    long currentTimeMillis = System.currentTimeMillis() % 5400;
                                    float f55 = (1520 * currentTimeMillis) / 5400.0f;
                                    float max = Math.max(0.0f, f55 - f2);
                                    int i14 = 0;
                                    while (i14 < 4) {
                                        int i15 = i14 * 1350;
                                        x84 x84Var = this.V;
                                        f55 += x84Var.getInterpolation((r40 - i15) / 667.0f) * 250.0f;
                                        max += x84Var.getInterpolation((r40 - (i15 + 667)) / 667.0f) * 250.0f;
                                        i14++;
                                        currentTimeMillis = currentTimeMillis;
                                    }
                                    canvas2 = canvas;
                                    paint = paint9;
                                    f11 = f47;
                                    f13 = 0.6f;
                                    i6 = i13;
                                    f7 = f48;
                                    canvas2.drawArc(hl.P, max, f55 - max, false, paint10);
                                } else {
                                    paint = paint9;
                                    f11 = f47;
                                    f13 = 0.6f;
                                    i6 = i13;
                                    f7 = f48;
                                    canvas2 = canvas;
                                    canvas2.drawArc(rectF2, (-90.0f) + ((((System.currentTimeMillis() % 3000) / 1000.0f) * 120.0f) % 360.0f), this.c0.e(false, this.a0) * 360.0f, false, paint10);
                                }
                                canvas2.save();
                                float R17 = hl.R1(1.0f, f13, d3);
                                canvas2.scale(R17, R17, f11, f7);
                                invalidate();
                            } else {
                                paint = paint9;
                                f11 = f47;
                                i6 = i13;
                                f7 = f48;
                            }
                            if (f6 > 0.0f) {
                                if (this.t0) {
                                    hnVar.o((f54 - hnVar.d) - hl.L(11.0f), f52, f54 - hl.L(11.0f), f53);
                                } else if (this.H) {
                                    hnVar.o(rectF.left + hl.L(10.0f), rectF.top, rectF.right, rectF.bottom);
                                } else {
                                    hnVar.o((getMeasuredWidth() - hnVar.d) - hl.L(f2), getMeasuredHeight() - hl.L(48.0f), getMeasuredWidth() - hl.L(f2), getMeasuredHeight());
                                }
                                f12 = 1.0f;
                                hnVar.C = (int) ((1.0f - d3) * f6 * 255.0f);
                                hnVar.draw(canvas2);
                            } else {
                                f12 = 1.0f;
                            }
                            this.h.setAlpha((int) ((f12 - f6) * (f12 - d3) * 255.0f));
                            int i16 = this.L;
                            Drawable drawable3 = this.h;
                            if (i16 > 0) {
                                drawable3.setBounds((int) (f11 - (drawable3.getIntrinsicWidth() / 2.0f)), (int) (f7 - (this.h.getIntrinsicHeight() / 2.0f)), (int) ((this.h.getIntrinsicWidth() / 2.0f) + f11), (int) ((this.h.getIntrinsicHeight() / 2.0f) + f7));
                            } else {
                                drawable3.setBounds(i5, i12, drawable.getIntrinsicWidth() + i5, drawable.getIntrinsicHeight() + i12);
                            }
                            if (d >= 1.0f && f6 <= 0.0f && d3 <= 0.0f && R15 > 0.0f) {
                                this.k0 = f11;
                                this.l0 = f7;
                                this.m0 = f51;
                                this.n0 = this.h.getBounds().left;
                                this.o0 = this.h.getBounds().top;
                                this.p0 = true;
                            }
                            this.h.draw(canvas2);
                            if (!z || d3 > 0.0f || f6 > 0.0f || R15 <= 0.0f) {
                                f5 = f54;
                            } else {
                                RectF rectF3 = this.i0;
                                f5 = f54;
                                rectF3.set(f10, f52, f5, f53);
                                this.h0.b(canvas2, rectF3, this.u0, paint.getColor());
                            }
                            if (i6 > 0) {
                                canvas2.restore();
                            }
                            canvas2.restore();
                        } else {
                            f5 = R1;
                            i3 = save;
                            f6 = d4;
                            f7 = f48;
                            f8 = 10.0f;
                        }
                        hn hnVar2 = this.f0;
                        i4 = (1.0f - f6) * hnVar2.i();
                        if (!this.I) {
                            float max2 = Math.max(hnVar2.c() + hl.L(9.0f), hl.L(18.0f));
                            if (this.t0) {
                                measuredWidth = (f5 - hl.L(50.0f)) + f46;
                                measuredHeight2 = (max2 / 2.0f) + (f7 - (getCircleHeight() / 2.0f));
                                f9 = hl.L(0.66f);
                            } else {
                                float f56 = max2 / 2.0f;
                                measuredWidth = (getMeasuredWidth() - this.P) - f56;
                                measuredHeight2 = (getMeasuredHeight() - this.Q) - f56;
                                f9 = 0.0f;
                            }
                            float f57 = max2 / 2.0f;
                            hnVar2.setBounds((int) (measuredWidth - f57), (int) ((measuredHeight2 - f57) - f9), (int) (measuredWidth + f57), (int) ((measuredHeight2 + f57) - f9));
                            if (i4 > 0.0f) {
                                float R18 = hl.R1(1.0f, 0.85f, this.r);
                                canvas2.save();
                                canvas2.scale(R18, R18, measuredWidth, measuredHeight2);
                                if (!this.H) {
                                    canvas2.drawCircle(measuredWidth, measuredHeight2, (hl.L(2.0f) + f57) * i4 * this.g0, aob.Gm);
                                    canvas2.drawCircle(measuredWidth, measuredHeight2, f57 * i4 * this.g0, paint);
                                }
                                hnVar2.C = (int) (i4 * 255.0f);
                                hnVar2.draw(canvas2);
                                canvas2.restore();
                            }
                        }
                        if (i4 < 1.0f) {
                            int L4 = hl.L(8.0f);
                            float f58 = f6;
                            int R19 = (int) hl.R1(((getMeasuredWidth() - (getCircleWidth() / 2.0f)) - this.P) + hl.L(12.0f), f5 - hl.L(2.0f), f58);
                            int R110 = (int) hl.R1(((getMeasuredHeight() - (getCircleHeight() / 2.0f)) - this.Q) + hl.L(f8), getMeasuredHeight() - hl.L(12.0f), f58);
                            int i17 = R19 - L4;
                            int i18 = R110 - L4;
                            int i19 = R19 + L4;
                            int i20 = R110 + L4;
                            ul ulVar = this.n;
                            ulVar.setBounds(i17, i18, i19, i20);
                            ulVar.w = (int) ((1.0f - i4) * 255.0f);
                            ulVar.draw(canvas2);
                        }
                        if (!this.H) {
                            canvas2.restore();
                        }
                        canvas2.restoreToCount(i3);
                        super.onDraw(canvas);
                    }
                    paint = paint3;
                }
                f3 = f;
                Drawable drawable4 = c() ? this.f : this.e;
                if (this.H) {
                }
                int i112 = A;
                int i122 = measuredHeight;
                float d32 = this.b0.d(this.W);
                d = this.S.d(d());
                float d42 = (f3 - this.r) * this.F.d(this.w <= j2 && !this.y);
                float f402 = f3;
                float e22 = this.q0.e(false, f402);
                i = (d > f402 ? 1 : (d == f402 ? 0 : -1));
                if (i < 0) {
                }
                if (z) {
                    this.h0.b(canvas2, rectF, this.u0, paint.getColor());
                }
                if (this.t0) {
                }
                float R142 = hl.R1(getCircleWidth(), hnVar.c() + hl.L(this.H ? f2 : 22.0f), d42);
                float R152 = hl.R1(R142, U1, this.s) * d;
                float f462 = R142 - R152;
                float f472 = R1 - (R152 / 2.0f);
                setPivotX(f472);
                setPivotY(R12);
                float f482 = R12;
                float R162 = hl.R1(1.0f, 0.79f, this.r);
                if (d > 0.0f) {
                }
                hn hnVar22 = this.f0;
                i4 = (1.0f - f6) * hnVar22.i();
                if (!this.I) {
                }
                if (i4 < 1.0f) {
                }
                if (!this.H) {
                }
                canvas2.restoreToCount(i3);
                super.onDraw(canvas);
            }
            f = 1.0f;
        }
        z = false;
        if (!z) {
            uptimeMillis = SystemClock.uptimeMillis() - this.j0.F6;
            if (j - uptimeMillis > 0) {
            }
        }
        z2 = this.H;
        Paint paint32 = this.G;
        if (z2) {
        }
        if (z) {
        }
        f3 = f;
        Drawable drawable42 = c() ? this.f : this.e;
        if (this.H) {
        }
        int i1122 = A;
        int i1222 = measuredHeight;
        float d322 = this.b0.d(this.W);
        d = this.S.d(d());
        float d422 = (f3 - this.r) * this.F.d(this.w <= j2 && !this.y);
        float f4022 = f3;
        float e222 = this.q0.e(false, f4022);
        i = (d > f4022 ? 1 : (d == f4022 ? 0 : -1));
        if (i < 0) {
        }
        if (z) {
        }
        if (this.t0) {
        }
        float R1422 = hl.R1(getCircleWidth(), hnVar.c() + hl.L(this.H ? f2 : 22.0f), d422);
        float R1522 = hl.R1(R1422, U1, this.s) * d;
        float f4622 = R1422 - R1522;
        float f4722 = R1 - (R1522 / 2.0f);
        setPivotX(f4722);
        setPivotY(R12);
        float f4822 = R12;
        float R1622 = hl.R1(1.0f, 0.79f, this.r);
        if (d > 0.0f) {
        }
        hn hnVar222 = this.f0;
        i4 = (1.0f - f6) * hnVar222.i();
        if (!this.I) {
        }
        if (i4 < 1.0f) {
        }
        if (!this.H) {
        }
        canvas2.restoreToCount(i3);
        super.onDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r0 < (r3 - ((int) hl.R1((r8.Q + getCircleHeight()) + r8.Q, hl.L(32.0f), r8.w > 0 ? 1.0f : 0.0f)))) goto L14;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() <= 0.0f) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getX() >= getWidth() - l()) {
                float y = motionEvent.getY();
                int height = getHeight();
                getMeasuredHeight();
            }
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBlurredBackgroundDrawable(jl0 jl0Var) {
        this.s0 = jl0Var;
        jl0Var.r(hl.L(22.0f));
        this.s0.q(hl.L(4.0f));
    }

    public void setCircleSize(int i) {
        this.L = i;
        this.M = i;
    }

    public void setEffect(long j) {
        TLRPC.TL_availableEffect Z0 = uc7.s1(yac.t0).Z0(j);
        setEmoji(Z0 != null ? pv3.g(Z0.emoticon) : null);
    }

    public void setEmoji(Drawable drawable) {
        this.n.g(drawable, true);
    }

    public void setEphemeralFactor(float f) {
        if (this.r != f) {
            this.r = f;
            invalidate();
        }
    }

    public void setIconDimmed(boolean z) {
        if (this.a != z) {
            this.a = z;
            invalidate();
        }
    }

    public void setLocked(boolean z) {
        if (this.I == z) {
            return;
        }
        this.I = z;
        invalidate();
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.T.c(z);
    }

    public void setResourceId(int i) {
        if (this.d != i) {
            this.d = i;
            this.e = getContext().getResources().getDrawable(i).mutate();
            this.f = getContext().getResources().getDrawable(i).mutate();
            this.h = getContext().getResources().getDrawable(i).mutate();
            invalidate();
        }
    }

    public void setSameWidthFactor(float f) {
        if (this.s != f) {
            this.s = f;
            invalidate();
        }
    }

    @Override // eu5
    public /* bridge */ /* synthetic */ void setScrimHidden(boolean z) {
        qd4.a(this, z);
    }

    public void setScrimViewBackgroundColor(int i) {
        this.N = i;
        this.O.setColor(i);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f0 || drawable == this.n || drawable == this.E || super.verifyDrawable(drawable);
    }
}
