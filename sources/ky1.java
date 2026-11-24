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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class ky1 extends View implements bs5 {
    public final gn E;
    public final lm F;
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
    public final cm2[] R;
    public final lm S;
    public final n41 T;
    public boolean U;
    public final c84 V;
    public boolean W;
    public boolean a;
    public float a0;
    public final lm b;
    public final lm b0;
    public final wjb c;
    public final lm c0;
    public int d;
    public final Path d0;
    public Drawable e;
    public final Paint e0;
    public Drawable f;
    public final gn f0;
    public float g0;
    public Drawable h;
    public cc h0;
    public ChatActivityEnterView i0;
    public float j0;
    public float k0;
    public float l0;
    public int m0;
    public final tl n;
    public int n0;
    public boolean o0;
    public final lm p0;
    public Drawable q0;
    public float r;
    public il0 r0;
    public float s;
    public boolean s0;
    public int t0;
    public int u0;
    public int v0;
    public long w;
    public ValueAnimator w0;
    public int x;
    public final RectF x0;
    public boolean y;

    public ky1(int i, wjb wjbVar, Context context, boolean z) {
        super(context);
        s33 s33Var = s33.h;
        this.b = new lm(this, 0L, 260L, s33Var);
        this.F = new lm(this, 0L, 320L, s33Var);
        this.G = new Paint(1);
        this.L = -1;
        this.M = -1;
        this.O = new Paint(1);
        this.R = new cm2[1];
        this.S = new lm(this, 0L, 420L, s33Var);
        this.T = new n41(this);
        this.V = new c84();
        this.b0 = new lm(this, 0L, 420L, s33Var);
        this.c0 = new lm(this, 0L, 500L, s33Var);
        this.d0 = new Path();
        Paint paint = new Paint(1);
        this.e0 = paint;
        gn gnVar = new gn(true, true, true);
        this.f0 = gnVar;
        this.g0 = 1.0f;
        this.p0 = new lm(this, 0L, 320L, s33Var);
        this.x0 = new RectF();
        this.d = i;
        this.c = wjbVar;
        this.H = z;
        gn gnVar2 = new gn(false, false, false);
        this.E = gnVar2;
        gnVar2.w(gl.L(15.0f));
        gnVar2.x(gl.o());
        gnVar2.u(-1);
        gnVar2.b = 3;
        gnVar2.setCallback(this);
        gnVar2.N = gl.q.x;
        this.e = b00.d(context, i);
        this.f = b00.d(context, i);
        this.h = b00.d(context, i);
        this.n = new tl(gl.L(14.0f), this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gl.L(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        gnVar.setCallback(this);
        gnVar.u(-1);
        gnVar.w(gl.L(12.0f));
        gnVar.x(gl.o());
        gnVar.b = 17;
    }

    public final void a() {
        ValueAnimator valueAnimator = this.w0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.9f, 1.0f);
        this.w0 = ofFloat;
        ofFloat.addUpdateListener(new f0(this, (byte) 29));
        this.w0.addListener(new bb1((Object) this, (byte) 10));
        this.w0.setDuration(180L);
        this.w0.setInterpolator(new OvershootInterpolator());
        this.w0.start();
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
        canvas.saveLayerAlpha(-gl.L(6.0f), -gl.L(6.0f), getWidth(), getHeight(), kk7.d4, 31);
        super.draw(canvas);
        float L = gl.L(18.0f);
        RectF rectF = this.x0;
        float f = L / 2.0f;
        float L2 = (rectF.left + f) - gl.L(6.0f);
        float L3 = (rectF.top + f) - gl.L(6.0f);
        canvas.drawCircle(L2, L3, gl.L(2.0f) + f, bkb.Fm);
        canvas.drawCircle(L2, L3, f, this.G);
        if (this.J == null) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.mini_switch_lock).mutate();
            this.J = mutate;
            int i = this.t0;
            this.K = i;
            mutate.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        if (this.K != this.t0) {
            Drawable drawable = this.J;
            int i2 = this.t0;
            this.K = i2;
            drawable.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        }
        this.J.setBounds((int) (L2 - gl.L(8.0f)), (int) (L3 - gl.L(8.0f)), (int) (L2 + gl.L(8.0f)), (int) (L3 + gl.L(8.0f)));
        this.J.draw(canvas);
        canvas.restore();
    }

    @Override // bs5
    public final void e(RectF rectF) {
        float circleWidth = getCircleWidth();
        float circleHeight = getCircleHeight();
        float measuredWidth = (getMeasuredWidth() - gl.L(4.0f)) - this.P;
        float measuredHeight = (getMeasuredHeight() - gl.L(4.0f)) - this.Q;
        rectF.set(measuredWidth - circleWidth, measuredHeight - circleHeight, measuredWidth, measuredHeight);
    }

    public final void f(int i, boolean z) {
        this.f0.t(i <= 0 ? "" : String.valueOf(i), z, true);
        invalidate();
    }

    @Override // bs5
    public final void g(Canvas canvas, float f) {
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
            if (this.s0) {
                R1 = gl.R1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - gl.L(4.0f), f4) - this.P;
                U1 = getCircleHeight() * f4;
                R12 = ((getMeasuredHeight() - this.Q) - gl.L(4.0f)) - (U1 / 2.0f);
            } else {
                R1 = gl.R1(gl.R1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - gl.L(4.0f), f4) - this.P, getMeasuredWidth() - gl.L(9.0f), f5);
                R12 = gl.R1(((getMeasuredHeight() - this.Q) - gl.L(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - gl.L(24.0f), f5);
                U1 = gl.U1(f5, getCircleHeight(), gl.L(32.0f)) * f4;
            }
            float R13 = gl.R1(getCircleWidth(), this.E.c() + gl.L(this.H ? 20.0f : 22.0f), f5) * f4;
            if (f4 > 0.0f && R13 > 0.0f && U1 > 0.0f) {
                RectF rectF = gl.P;
                float f6 = U1 / 2.0f;
                rectF.set(R1 - R13, R12 - f6, R1, f6 + R12);
                rectF.inset(-gl.L(4.0f), -gl.L(4.0f));
                float min = (Math.min(R13, U1) / 2.0f) + gl.L(4.0f);
                canvas.drawRoundRect(rectF, min, min, paint);
            }
            gn gnVar = this.f0;
            float i2 = (1.0f - f5) * gnVar.i();
            if (i2 > 0.0f) {
                float max = Math.max(gnVar.c() + gl.L(9.0f), gl.L(18.0f));
                if (this.s0) {
                    f2 = R1 - gl.L(50.0f);
                    f3 = (max / 2.0f) + (R12 - (getCircleHeight() / 2.0f));
                } else {
                    float f7 = max / 2.0f;
                    float measuredWidth = (getMeasuredWidth() - this.P) - f7;
                    float measuredHeight = (getMeasuredHeight() - this.Q) - f7;
                    f2 = measuredWidth;
                    f3 = measuredHeight;
                }
                canvas.drawCircle(f2, f3, ((max / 2.0f) + gl.L(2.0f)) * i2 * this.g0, paint);
            }
        }
        draw(canvas);
    }

    public int getCircleHeight() {
        int i = this.M;
        return i >= 0 ? i : getMeasuredHeight() - gl.L(8.0f);
    }

    public int getCircleWidth() {
        int i = this.L;
        return i >= 0 ? i : getMeasuredHeight() - gl.L(8.0f);
    }

    public int getFillColor() {
        return bkb.v0(bkb.Oe, this.c);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [int, short] */
    public final void h(boolean z) {
        if (this.W != z || ((z && Math.abs(this.a0 - (-3.0f)) >= 0.01f) || !this.U)) {
            this.U = true;
            if (!this.W && z) {
                this.c0.e(true, 0.0f);
            }
            lm lmVar = this.b0;
            lmVar.f = (int) ((!z || lmVar.c < 1.0f) ? 0L : 650L);
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
        gn gnVar = this.E;
        if (j > 0) {
            gnVar.t(jva.Y0(false, "⭐️".concat(k96.E(j * Math.max(1, i), ',')), this.R), z, true);
        } else {
            gnVar.t("", z, true);
        }
        if (z) {
            invalidate();
        } else {
            this.F.a(this.w > 0);
        }
    }

    public boolean j() {
        return this instanceof e02;
    }

    public final void k() {
        boolean z = this.H;
        wjb wjbVar = this.c;
        int v0 = z ? -1 : bkb.v0(bkb.Oe, wjbVar);
        int v02 = bkb.v0(bkb.Ml, wjbVar);
        int v03 = bkb.v0(bkb.Sf, wjbVar);
        if (v0 != this.t0 || v02 != this.u0 || v03 != this.v0) {
            this.t0 = v0;
            this.u0 = v02;
            this.v0 = v03;
            Drawable drawable = this.e;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable.setColorFilter(new PorterDuffColorFilter(v0, mode));
            this.f.setColorFilter(new PorterDuffColorFilter(Color.argb(kk7.J2, Color.red(v02), Color.green(v02), Color.blue(v02)), mode));
            this.h.setColorFilter(new PorterDuffColorFilter(v03, mode));
        }
        boolean z2 = this.H;
        Paint paint = this.G;
        if (z2) {
            paint.setColor(bkb.v0(bkb.Oe, wjbVar));
        } else if (j()) {
            paint.setColor(getFillColor());
        } else {
            paint.setColor(bm2.o(-1, 75));
        }
    }

    public final int l() {
        getMeasuredHeight();
        return m();
    }

    public final int m() {
        return (int) gl.R1(this.P + getCircleWidth() + this.P, gl.L(this.H ? 20.0f : 22.0f) + gl.L(18.0f) + this.E.d, (this.w > 0 ? 1.0f : 0.0f) * (d() ? 1.0f : 0.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c6, code lost:
    
        if ((android.os.SystemClock.uptimeMillis() - r2.t6) < 1200) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0930  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x05fa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        long j;
        boolean z;
        float f2;
        float f3;
        long j2;
        float f4;
        Paint paint;
        float f5;
        int A;
        int measuredHeight;
        float d;
        float R1;
        float R12;
        float U1;
        float f6;
        int i;
        float f7;
        float i2;
        float measuredWidth;
        float measuredHeight2;
        float f8;
        int i3;
        int i4;
        int i5;
        float f9;
        float f10;
        float f11;
        float f12;
        float L;
        float sin;
        float f13;
        float f14;
        Paint paint2;
        ChatActivityEnterView chatActivityEnterView;
        long uptimeMillis;
        jm3 jm3Var;
        int save = canvas.save();
        if (this.H) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), kk7.d4, 31);
        }
        k();
        float N = gl.N(3.0f);
        float N2 = gl.N(38.0f);
        float N3 = gl.N(20.0f);
        gn gnVar = this.E;
        RectF rectF = this.x0;
        rectF.set((getMeasuredWidth() - gl.R1(Math.max(N2, gnVar.c() + N3), N2, this.s)) - N, (getMeasuredHeight() - N2) - N, getMeasuredWidth() - N, getMeasuredHeight() - N);
        if (this.h0 == null || !this.H) {
            f = 1.0f;
            j = 1200;
        } else {
            j = 1200;
            if (this.w <= 0 && Math.abs(rectF.width() - rectF.height()) < 1.0f) {
                ChatActivityEnterView chatActivityEnterView2 = this.i0;
                if (chatActivityEnterView2 != null) {
                    boolean z2 = chatActivityEnterView2.U1 || chatActivityEnterView2.T1 != null || ((jm3Var = chatActivityEnterView2.j1) != null && jm3Var.o());
                    if (chatActivityEnterView2.R3 != null || chatActivityEnterView2.U3 != null || (chatActivityEnterView2.T0() && !z2)) {
                        f = 1.0f;
                        chatActivityEnterView2.t6 = SystemClock.uptimeMillis();
                    } else if (chatActivityEnterView2.t6 != 0) {
                        f = 1.0f;
                    }
                }
                f = 1.0f;
                z = true;
                if (!z && this.h0 != null && (chatActivityEnterView = this.i0) != null && chatActivityEnterView.t6 != 0) {
                    uptimeMillis = SystemClock.uptimeMillis() - this.i0.t6;
                    if (j - uptimeMillis > 0) {
                        postInvalidateDelayed(1216 - uptimeMillis);
                    }
                }
                Paint paint3 = this.G;
                if (z) {
                    f2 = 3.0f;
                    f3 = 20.0f;
                    j2 = 0;
                    f4 = 0.003f;
                } else {
                    cc ccVar = this.h0;
                    int color = paint3.getColor();
                    f4 = 0.003f;
                    Paint paint4 = ccVar.n;
                    f2 = 3.0f;
                    f3 = 20.0f;
                    float d2 = ccVar.f.d(ccVar.c);
                    if (d2 <= 0.003f) {
                        j2 = 0;
                    } else {
                        float height = rectF.height() / 2.0f;
                        ccVar.a(height, color);
                        canvas2.save();
                        j2 = 0;
                        canvas2.translate(rectF.centerX(), rectF.centerY());
                        paint4.setAlpha((int) yjb.z((float) Math.sin(ccVar.d() * 4.2f), 0.25f, 0.75f, d2 * 255.0f));
                        canvas2.drawCircle(0.0f, 0.0f, height + gl.L(4.0f), paint4);
                        canvas2.restore();
                    }
                }
                if (this.H) {
                    canvas2.drawRoundRect(rectF, gl.L(19.0f), gl.L(19.0f), paint3);
                }
                if (z) {
                    paint = paint3;
                    f5 = 1.25f;
                } else {
                    cc ccVar2 = this.h0;
                    int color2 = paint3.getColor();
                    Paint paint5 = ccVar2.j;
                    Paint paint6 = ccVar2.h;
                    f5 = 1.25f;
                    Paint paint7 = ccVar2.m;
                    Path path = ccVar2.o;
                    Matrix matrix = ccVar2.q;
                    float d3 = ccVar2.f.d(ccVar2.c);
                    if (d3 <= f4) {
                        paint = paint3;
                    } else {
                        float height2 = rectF.height() / 2.0f;
                        ccVar2.a(height2, color2);
                        float d4 = ccVar2.d();
                        canvas2.save();
                        path.rewind();
                        path.addCircle(rectF.centerX(), rectF.centerY(), height2, Path.Direction.CW);
                        canvas2.clipPath(path);
                        canvas2.translate(rectF.centerX(), rectF.centerY());
                        matrix.reset();
                        float f15 = -height2;
                        matrix.setTranslate((((d4 / 1.25f) % f) * 2.2f * height2) + (1.1f * f15), 0.0f);
                        matrix.postRotate(-32.0f);
                        ccVar2.r.setLocalMatrix(matrix);
                        paint5.setAlpha((int) (d3 * 255.0f));
                        paint = paint3;
                        canvas2.drawRect(f15, f15, height2, height2, paint5);
                        float f16 = height2;
                        int i6 = 0;
                        while (i6 < 5) {
                            float f17 = (d4 + ccVar2.L[i6]) / ccVar2.M[i6];
                            float floor = f17 - ((int) Math.floor(f17));
                            float f18 = ((((104729 * i6) + (r4 * 7919)) & 1023) / 1023.0f) - 0.5f;
                            float L2 = (gl.L(f2) * f18) + ccVar2.N[i6];
                            float w = b00.w(floor, f16, 2.1f, 1.05f * f15);
                            float f19 = (w * (-0.848f)) - (L2 * 0.53f);
                            float f20 = (L2 * (-0.848f)) + (w * 0.53f);
                            float f21 = f16;
                            int i7 = i6;
                            float sin2 = ((float) Math.sin(floor * 3.141592653589793d)) * d3 * 0.5f;
                            if (sin2 <= 0.01f) {
                                f13 = f21;
                                f14 = d3;
                                paint2 = paint7;
                            } else {
                                float z3 = yjb.z(f18, 0.3f, 1.0f, ccVar2.O[i7]);
                                float f22 = ccVar2.P[i7];
                                int i8 = 0;
                                while (i8 < 4) {
                                    float f23 = i8 / 4.0f;
                                    int i9 = i8 + 1;
                                    float f24 = i9 / 4.0f;
                                    float f25 = z3;
                                    float f26 = 1.0f - f23;
                                    paint7.setStrokeWidth(Math.max(gl.L(0.5f), f25 * 0.55f * f26));
                                    paint7.setColor(Color.argb((int) (sin2 * 255.0f * 0.55f * f26 * f26), kk7.d4, kk7.d4, kk7.d4));
                                    float f27 = f22 * (-0.848f);
                                    float f28 = f19 - (f27 * f23);
                                    float f29 = f22 * 0.53f;
                                    float f30 = f20 - (f23 * f29);
                                    float f31 = f19 - (f27 * f24);
                                    float f32 = f20 - (f29 * f24);
                                    float f33 = d3;
                                    float f34 = f20;
                                    Paint paint8 = paint7;
                                    canvas.drawLine(f28, f30, f31, f32, paint8);
                                    z3 = f25;
                                    f21 = f21;
                                    i8 = i9;
                                    paint7 = paint8;
                                    f20 = f34;
                                    d3 = f33;
                                }
                                f13 = f21;
                                f14 = d3;
                                float f35 = f20;
                                paint2 = paint7;
                                float f36 = z3;
                                paint6.setColor(-1);
                                paint6.setAlpha((int) (sin2 * 255.0f));
                                canvas.save();
                                canvas.translate(f19, f35);
                                canvas.rotate(floor * 30.0f);
                                canvas.scale(f36, f36);
                                canvas.drawPath(ccVar2.i, paint6);
                                canvas.restore();
                            }
                            i6 = i7 + 1;
                            paint7 = paint2;
                            d3 = f14;
                            f16 = f13;
                        }
                        canvas2 = canvas;
                        canvas2.restore();
                    }
                }
                Drawable drawable = !c() ? this.f : this.e;
                if (this.H) {
                    A = oo1.A(2, getMeasuredWidth() - (getMeasuredHeight() / 2), drawable);
                    measuredHeight = (getMeasuredHeight() - drawable.getIntrinsicHeight()) / 2;
                    if (b()) {
                        measuredHeight -= gl.L(1.0f);
                    } else {
                        A += gl.L(2.0f);
                    }
                } else {
                    A = Math.round((rectF.right - (rectF.height() / 2.0f)) - (drawable.getIntrinsicWidth() / 2.0f));
                    measuredHeight = Math.round(((rectF.height() / 2.0f) + rectF.top) - (drawable.getIntrinsicHeight() / 2.0f));
                }
                int i10 = A;
                int i11 = measuredHeight;
                float d5 = this.b0.d(this.W);
                d = this.S.d(d());
                float d6 = this.F.d(this.w <= j2 && !this.y) * (1.0f - this.r);
                float e = this.p0.e(false, 1.0f);
                if (d < 1.0f) {
                    canvas2.save();
                    float f37 = 1.0f - e;
                    canvas2.translate((-gl.L(24.0f)) * f37, gl.L(24.0f) * f37);
                    float R13 = gl.R1(0.35f, 1.0f, e);
                    float f38 = i10;
                    float intrinsicWidth = (drawable.getIntrinsicWidth() / 2.0f) + f38;
                    float f39 = i11;
                    canvas2.scale(R13, R13, intrinsicWidth, (drawable.getIntrinsicHeight() / 2.0f) + f39);
                    canvas2.rotate(60.0f * f37, (drawable.getIntrinsicWidth() / 2.0f) + f38, (drawable.getIntrinsicHeight() / 2.0f) + f39);
                    if (z) {
                        float f40 = this.h0.f.c;
                        if (f40 <= 0.001f) {
                            f12 = 0.001f;
                            L = 0.0f;
                        } else {
                            f12 = 0.001f;
                            double d7 = r3.d() * 6.283185307179586d;
                            L = gl.L(f5) * f40 * ((float) Math.sin((Math.sin(d7 / 3.0999999046325684d) * 0.6000000238418579d) + (d7 / 1.2999999523162842d)));
                        }
                        canvas2.translate(0.0f, L);
                        float f41 = this.h0.f.c;
                        if (f41 <= f12) {
                            sin = 0.0f;
                        } else {
                            double d8 = r3.d() * 6.283185307179586d;
                            sin = f41 * 3.5f * ((float) Math.sin((Math.sin(d8 / 2.9000000953674316d) * 0.5d) + (d8 / 1.7000000476837158d) + 1.100000023841858d));
                        }
                        canvas2.rotate(sin, (drawable.getIntrinsicWidth() / 2.0f) + f38, (drawable.getIntrinsicHeight() / 2.0f) + f39);
                    }
                    drawable.setBounds(i10, i11, drawable.getIntrinsicWidth() + i10, drawable.getIntrinsicHeight() + i11);
                    drawable.setAlpha((int) (gl.R1(1.0f, 0.6f, this.b.d(this.a)) * (1.0f - d6) * 255.0f));
                    drawable.draw(canvas2);
                    canvas2.restore();
                }
                if (z && d < 1.0f) {
                    this.h0.b(canvas2, rectF, this.t0, paint.getColor());
                }
                if (this.s0) {
                    R1 = gl.R1(gl.R1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - gl.L(4.0f), d) - this.P, getMeasuredWidth() - gl.L(9.0f), d6);
                    R12 = gl.R1(((getMeasuredHeight() - this.Q) - gl.L(4.0f)) - (getCircleHeight() / 2.0f), getMeasuredHeight() - gl.L(24.0f), d6);
                    U1 = gl.U1(d6, getCircleHeight(), gl.L(32.0f)) * d;
                } else {
                    R1 = gl.R1(getMeasuredWidth() - (getMeasuredHeight() / 2.0f), getMeasuredWidth() - gl.L(4.0f), d) - this.P;
                    U1 = getCircleHeight() * d;
                    R12 = ((getMeasuredHeight() - this.Q) - gl.L(4.0f)) - (U1 / 2.0f);
                }
                float R14 = gl.R1(getCircleWidth(), gnVar.c() + gl.L(!this.H ? f3 : 22.0f), d6);
                float R15 = gl.R1(R14, U1, this.s) * d;
                float f42 = R14 - R15;
                float f43 = R1 - (R15 / 2.0f);
                setPivotX(f43);
                setPivotY(R12);
                float f44 = R12;
                float R16 = gl.R1(1.0f, 0.79f, this.r);
                if (d <= 0.0f) {
                    canvas2.save();
                    Path path2 = this.d0;
                    path2.rewind();
                    float min = Math.min(R15, U1) / 2.0f;
                    float f45 = U1;
                    RectF rectF2 = gl.P;
                    float f46 = f45 / 2.0f;
                    i = save;
                    float f47 = f44 - f46;
                    float f48 = f44 + f46;
                    rectF2.set(R1 - R15, f47, R1, f48);
                    path2.addRoundRect(rectF2, min, min, Path.Direction.CW);
                    float centerX = rectF2.centerX();
                    float centerY = rectF2.centerY();
                    f6 = R1;
                    if (this.r > 0.0f) {
                        Drawable drawable2 = this.q0;
                        if (drawable2 == null) {
                            i3 = i10;
                            drawable2 = getContext().getResources().getDrawable(R.drawable.send_outline);
                            this.q0 = drawable2;
                        } else {
                            i3 = i10;
                        }
                        i4 = i11;
                        drawable2.setColorFilter(paint.getColor(), PorterDuff.Mode.MULTIPLY);
                        kq3.d(this.q0, centerX, centerY, 17);
                        kq3.b(canvas2, this.q0, this.r);
                    } else {
                        i3 = i10;
                        i4 = i11;
                    }
                    canvas2.scale(R16, R16, centerX, centerY);
                    if (this.r0 != null) {
                        Rect rect = gl.Q;
                        rectF2.round(rect);
                        rect.inset(-gl.L(7.0f), -gl.L(7.0f));
                        this.r0.setBounds(rect);
                        this.r0.draw(canvas2);
                    }
                    if (!this.H) {
                        canvas2.drawPath(path2, paint);
                    }
                    canvas2.clipPath(path2);
                    int i12 = (d5 > 0.0f ? 1 : (d5 == 0.0f ? 0 : -1));
                    if (i12 > 0) {
                        Paint paint9 = this.e0;
                        paint9.setColor(-1);
                        paint9.setAlpha((int) (d5 * 255.0f));
                        float L3 = gl.L(8.66f);
                        rectF2.set(f43 - L3, f44 - L3, f43 + L3, f44 + L3);
                        if (this.U) {
                            long currentTimeMillis = System.currentTimeMillis() % 5400;
                            float f49 = (1520 * currentTimeMillis) / 5400.0f;
                            float max = Math.max(0.0f, f49 - f3);
                            int i13 = 0;
                            while (i13 < 4) {
                                int i14 = i13 * 1350;
                                c84 c84Var = this.V;
                                f49 += c84Var.getInterpolation((r38 - i14) / 667.0f) * 250.0f;
                                max += c84Var.getInterpolation((r38 - (i14 + 667)) / 667.0f) * 250.0f;
                                i13++;
                                currentTimeMillis = currentTimeMillis;
                            }
                            canvas2 = canvas;
                            i5 = i12;
                            f7 = f44;
                            f9 = f43;
                            f11 = 0.6f;
                            canvas2.drawArc(gl.P, max, f49 - max, false, paint9);
                        } else {
                            i5 = i12;
                            f7 = f44;
                            f9 = f43;
                            f11 = 0.6f;
                            canvas2 = canvas;
                            canvas2.drawArc(rectF2, (-90.0f) + ((((System.currentTimeMillis() % 3000) / 1000.0f) * 120.0f) % 360.0f), this.c0.e(false, this.a0) * 360.0f, false, paint9);
                        }
                        canvas2.save();
                        float R17 = gl.R1(1.0f, f11, d5);
                        canvas2.scale(R17, R17, f9, f7);
                        invalidate();
                    } else {
                        i5 = i12;
                        f7 = f44;
                        f9 = f43;
                    }
                    if (d6 > 0.0f) {
                        if (this.s0) {
                            gnVar.o((f6 - gnVar.d) - gl.L(11.0f), f47, f6 - gl.L(11.0f), f48);
                        } else if (this.H) {
                            gnVar.o(rectF.left + gl.L(10.0f), rectF.top, rectF.right, rectF.bottom);
                        } else {
                            gnVar.o((getMeasuredWidth() - gnVar.d) - gl.L(f3), getMeasuredHeight() - gl.L(48.0f), getMeasuredWidth() - gl.L(f3), getMeasuredHeight());
                        }
                        f10 = 1.0f;
                        gnVar.C = (int) ((1.0f - d5) * d6 * 255.0f);
                        gnVar.draw(canvas2);
                    } else {
                        f10 = 1.0f;
                    }
                    this.h.setAlpha((int) ((f10 - d6) * (f10 - d5) * 255.0f));
                    int i15 = this.L;
                    Drawable drawable3 = this.h;
                    if (i15 > 0) {
                        drawable3.setBounds((int) (f9 - (drawable3.getIntrinsicWidth() / 2.0f)), (int) (f7 - (this.h.getIntrinsicHeight() / 2.0f)), (int) ((this.h.getIntrinsicWidth() / 2.0f) + f9), (int) ((this.h.getIntrinsicHeight() / 2.0f) + f7));
                    } else {
                        drawable3.setBounds(i3, i4, drawable.getIntrinsicWidth() + i3, drawable.getIntrinsicHeight() + i4);
                    }
                    if (d >= 1.0f && d6 <= 0.0f && d5 <= 0.0f && R15 > 0.0f) {
                        this.j0 = f9;
                        this.k0 = f7;
                        this.l0 = f46;
                        this.m0 = this.h.getBounds().left;
                        this.n0 = this.h.getBounds().top;
                        this.o0 = true;
                    }
                    this.h.draw(canvas2);
                    if (i5 > 0) {
                        canvas2.restore();
                    }
                    canvas2.restore();
                } else {
                    f6 = R1;
                    i = save;
                    f7 = f44;
                }
                gn gnVar2 = this.f0;
                i2 = (1.0f - d6) * gnVar2.i();
                if (!this.I) {
                    float max2 = Math.max(gnVar2.c() + gl.L(9.0f), gl.L(18.0f));
                    if (this.s0) {
                        measuredWidth = (f6 - gl.L(50.0f)) + f42;
                        measuredHeight2 = (max2 / 2.0f) + (f7 - (getCircleHeight() / 2.0f));
                        f8 = gl.L(0.66f);
                    } else {
                        float f50 = max2 / 2.0f;
                        measuredWidth = (getMeasuredWidth() - this.P) - f50;
                        measuredHeight2 = (getMeasuredHeight() - this.Q) - f50;
                        f8 = 0.0f;
                    }
                    float f51 = max2 / 2.0f;
                    gnVar2.setBounds((int) (measuredWidth - f51), (int) ((measuredHeight2 - f51) - f8), (int) (measuredWidth + f51), (int) ((measuredHeight2 + f51) - f8));
                    if (i2 > 0.0f) {
                        float R18 = gl.R1(1.0f, 0.85f, this.r);
                        canvas2.save();
                        canvas2.scale(R18, R18, measuredWidth, measuredHeight2);
                        if (!this.H) {
                            canvas2.drawCircle(measuredWidth, measuredHeight2, (gl.L(2.0f) + f51) * i2 * this.g0, bkb.Fm);
                            canvas2.drawCircle(measuredWidth, measuredHeight2, f51 * i2 * this.g0, paint);
                        }
                        gnVar2.C = (int) (i2 * 255.0f);
                        gnVar2.draw(canvas2);
                        canvas2.restore();
                    }
                }
                if (i2 < 1.0f) {
                    int L4 = gl.L(8.0f);
                    int R19 = (int) gl.R1(((getMeasuredWidth() - (getCircleWidth() / 2.0f)) - this.P) + gl.L(12.0f), f6 - gl.L(2.0f), d6);
                    int R110 = (int) gl.R1(((getMeasuredHeight() - (getCircleHeight() / 2.0f)) - this.Q) + gl.L(10.0f), getMeasuredHeight() - gl.L(12.0f), d6);
                    int i16 = R19 - L4;
                    int i17 = R110 - L4;
                    int i18 = R19 + L4;
                    int i19 = R110 + L4;
                    tl tlVar = this.n;
                    tlVar.setBounds(i16, i17, i18, i19);
                    tlVar.w = (int) ((1.0f - i2) * 255.0f);
                    tlVar.draw(canvas2);
                }
                if (!this.H) {
                    canvas2.restore();
                }
                canvas2.restoreToCount(i);
                super.onDraw(canvas);
            }
            f = 1.0f;
        }
        z = false;
        if (!z) {
            uptimeMillis = SystemClock.uptimeMillis() - this.i0.t6;
            if (j - uptimeMillis > 0) {
            }
        }
        Paint paint32 = this.G;
        if (z) {
        }
        if (this.H) {
        }
        if (z) {
        }
        Drawable drawable4 = !c() ? this.f : this.e;
        if (this.H) {
        }
        int i102 = A;
        int i112 = measuredHeight;
        float d52 = this.b0.d(this.W);
        d = this.S.d(d());
        float d62 = this.F.d(this.w <= j2 && !this.y) * (1.0f - this.r);
        float e2 = this.p0.e(false, 1.0f);
        if (d < 1.0f) {
        }
        if (z) {
            this.h0.b(canvas2, rectF, this.t0, paint.getColor());
        }
        if (this.s0) {
        }
        float R142 = gl.R1(getCircleWidth(), gnVar.c() + gl.L(!this.H ? f3 : 22.0f), d62);
        float R152 = gl.R1(R142, U1, this.s) * d;
        float f422 = R142 - R152;
        float f432 = R1 - (R152 / 2.0f);
        setPivotX(f432);
        setPivotY(R12);
        float f442 = R12;
        float R162 = gl.R1(1.0f, 0.79f, this.r);
        if (d <= 0.0f) {
        }
        gn gnVar22 = this.f0;
        i2 = (1.0f - d62) * gnVar22.i();
        if (!this.I) {
        }
        if (i2 < 1.0f) {
        }
        if (!this.H) {
        }
        canvas2.restoreToCount(i);
        super.onDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r0 < (r3 - ((int) gl.R1((r8.Q + getCircleHeight()) + r8.Q, gl.L(32.0f), r8.w > 0 ? 1.0f : 0.0f)))) goto L14;
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

    public void setBlurredBackgroundDrawable(il0 il0Var) {
        this.r0 = il0Var;
        il0Var.r(gl.L(22.0f));
        this.r0.q(gl.L(4.0f));
    }

    public void setCircleSize(int i) {
        this.L = i;
        this.M = i;
    }

    public void setEffect(long j) {
        TLRPC.TL_availableEffect X0 = na7.q1(y6c.t0).X0(j);
        setEmoji(X0 != null ? vu3.g(X0.emoticon) : null);
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

    @Override // bs5
    public /* bridge */ /* synthetic */ void setScrimHidden(boolean z) {
        tb4.a(this, z);
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
