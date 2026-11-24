// default package

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class f29 extends View implements li4 {
    public boolean A0;
    public boolean B0;
    public final lm C0;
    public final lm D0;
    public final Paint E;
    public final lm E0;
    public final Paint F;
    public final lm F0;
    public final Paint G;
    public final lm G0;
    public final Paint H;
    public final lm H0;
    public final Matrix I;
    public float I0;
    public final RadialGradient J;
    public final lm J0;
    public final n41 K;
    public final lm K0;
    public final n41 L;
    public final lm L0;
    public final n41 M;
    public final d29 M0;
    public float N;
    public final d29 N0;
    public final lm O;
    public final Path O0;
    public boolean P;
    public final Path P0;
    public final lm Q;
    public final PointF Q0;
    public long R;
    public final PointF R0;
    public long S;
    public final PointF S0;
    public final Path T;
    public final PointF T0;
    public final PointF U;
    public final PointF U0;
    public final PointF V;
    public final PointF V0;
    public final PointF W;
    public final PointF W0;
    public final PointF X0;
    public boolean Y0;
    public e29 a;
    public final ux0 a0;
    public final ImageReceiver b;
    public boolean b0;
    public final fm2 c;
    public boolean c0;
    public final Drawable d;
    public boolean d0;
    public final Drawable e;
    public boolean e0;
    public final Drawable f;
    public boolean f0;
    public boolean g0;
    public final Drawable h;
    public float h0;
    public final lm i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public final Drawable n;
    public final lm n0;
    public float o0;
    public boolean p0;
    public final lm q0;
    public final Paint r;
    public final lm r0;
    public final Paint s;
    public boolean s0;
    public final float[] t0;
    public final lm u0;
    public boolean v0;
    public final Paint w;
    public long w0;
    public final Paint x;
    public boolean x0;
    public final Paint y;
    public boolean y0;
    public float z0;

    public f29(Context context) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.b = imageReceiver;
        this.r = new Paint(1);
        Paint paint = new Paint(1);
        this.s = paint;
        Paint paint2 = new Paint(1);
        this.w = paint2;
        Paint paint3 = new Paint(1);
        this.x = paint3;
        Paint paint4 = new Paint(1);
        this.y = paint4;
        Paint paint5 = new Paint(1);
        this.E = paint5;
        Paint paint6 = new Paint(1);
        this.F = paint6;
        Paint paint7 = new Paint(1);
        this.G = paint7;
        Paint paint8 = new Paint(1);
        this.H = paint8;
        Matrix matrix = new Matrix();
        this.I = matrix;
        this.K = new n41(this);
        this.L = new n41(this);
        this.M = new n41(this);
        s33 s33Var = s33.h;
        this.O = new lm(this, 0L, 310L, s33Var);
        this.Q = new lm(this, 0L, 330L, s33Var);
        this.T = new Path();
        this.U = new PointF(-gl.N(9.666667f), gl.N(2.3333333f));
        this.V = new PointF(-gl.N(2.8333333f), gl.N(8.666667f));
        this.W = new PointF(gl.N(9.666667f), gl.N(-3.6666667f));
        this.i0 = new lm(this, 0L, 200L, s33.f);
        this.n0 = new lm(this, 0L, 350L, s33Var);
        this.o0 = -1.0f;
        this.p0 = true;
        this.q0 = new lm(this, 0L, 350L, s33Var);
        this.r0 = new lm(this, 0L, 850L, s33Var);
        this.t0 = new float[2];
        this.u0 = new lm(this, 0L, 350L, s33Var);
        this.C0 = new lm(this, 0L, 350L, s33Var);
        this.D0 = new lm(this, 0L, 650L, s33Var);
        this.E0 = new lm(this, 0L, 160L, s33.i);
        this.F0 = new lm(this, 0L, 750L, s33Var);
        this.G0 = new lm(this, 0L, 650L, s33Var);
        this.H0 = new lm(this, 0L, 320L, s33Var);
        this.J0 = new lm(this, 0L, 320L, s33Var);
        this.K0 = new lm(this, 0L, 320L, s33Var);
        this.L0 = new lm(this, 0L, 320L, s33Var);
        this.M0 = new d29(this, (byte) 2);
        this.N0 = new d29(this, (byte) 3);
        this.O0 = new Path();
        this.P0 = new Path();
        this.Q0 = new PointF();
        this.R0 = new PointF();
        this.S0 = new PointF();
        this.T0 = new PointF();
        this.U0 = new PointF();
        this.V0 = new PointF();
        this.W0 = new PointF();
        this.X0 = new PointF();
        setWillNotDraw(false);
        ux0 ux0Var = new ux0(this, this);
        this.a0 = ux0Var;
        jdc.k(this, ux0Var);
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, gl.L(48.0f), new int[]{-577231, -577231, -1}, new float[]{0.0f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.J = radialGradient;
        radialGradient.setLocalMatrix(matrix);
        paint5.setShader(radialGradient);
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(-577231);
        paint2.setStrokeCap(cap);
        paint2.setStyle(style);
        paint3.setColor(1677721600);
        paint4.setColor(-1);
        paint6.setColor(1493172223);
        paint7.setColor(402653184);
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        paint7.setStyle(style);
        paint7.setStrokeCap(cap);
        paint8.setStyle(style);
        paint8.setStrokeJoin(Paint.Join.ROUND);
        paint8.setStrokeCap(cap);
        if (Build.VERSION.SDK_INT >= 29) {
            paint8.setBlendMode(BlendMode.CLEAR);
        } else {
            paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        imageReceiver.p0(this);
        imageReceiver.B0 = true;
        imageReceiver.q0(gl.L(6.0f));
        Drawable mutate = context.getResources().getDrawable(R.drawable.msg_media_gallery).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, mode));
        fm2 fm2Var = new fm2(bkb.b0(gl.L(6.0f), -13750737), mutate);
        this.c = fm2Var;
        fm2Var.x = false;
        int L = gl.L(24.0f);
        int L2 = gl.L(24.0f);
        fm2Var.e = L;
        fm2Var.f = L2;
        Drawable d = b00.d(context, R.drawable.msg_photo_switch2);
        this.d = d;
        d.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = context.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.e = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate3 = context.getResources().getDrawable(R.drawable.msg_filled_unlockedrecord).mutate();
        this.f = mutate3;
        mutate3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate4 = context.getResources().getDrawable(R.drawable.msg_filled_lockedrecord).mutate();
        this.h = mutate4;
        mutate4.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate5 = context.getResources().getDrawable(R.drawable.msg_round_pause_m).mutate();
        this.n = mutate5;
        mutate5.setColorFilter(new PorterDuffColorFilter(-1, mode));
        h();
    }

    public static void a(float f, float f2, double d, float f3, PointF pointF) {
        double d2 = f3;
        pointF.x = (float) ((Math.cos(d) * d2) + f);
        pointF.y = (float) ((Math.sin(d) * d2) + f2);
    }

    public static void f(Drawable drawable, float f, float f2) {
        float max = Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) / 2.0f;
        drawable.setBounds((int) (f - max), (int) (f2 - max), (int) (f + max), (int) (f2 + max));
    }

    public final boolean b() {
        return this.I0 >= 1.0f;
    }

    public final boolean c(float f, float f2, float f3, float f4, float f5, boolean z) {
        return this.s0 ? (!z || f4 - f2 <= ((float) gl.L(100.0f))) && Math.abs(f3 - f) <= f5 : loe.a(f, f2, f3, f4) <= f5;
    }

    public final void d(float f) {
        this.O.g = f > 180.0f ? 620L : 310L;
        this.N += f;
        invalidate();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        ux0 ux0Var = this.a0;
        if (ux0Var == null || !ux0Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final void e(boolean z, float f) {
        if (Math.abs(f - this.I0) < 0.01f) {
            return;
        }
        this.I0 = f;
        if (!z) {
            this.J0.f(f > 0.0f && !this.s0, true);
            this.K0.e(true, f);
        }
        invalidate();
    }

    public final void g(boolean z) {
        this.v0 = false;
        if (!z) {
            lm lmVar = this.u0;
            lmVar.getClass();
            lmVar.e(true, 0.0f);
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        jm6 jm6Var;
        e29 e29Var = this.a;
        fm2 fm2Var = this.c;
        ImageReceiver imageReceiver = this.b;
        if (e29Var != null) {
            ArrayList arrayList = na7.q1(imageReceiver.d).M1().w.b;
            imageReceiver.o0(0, 0, true);
            if (arrayList != null && !arrayList.isEmpty() && ((f4b) arrayList.get(0)).O0 != null) {
                imageReceiver.Z(gl5.g(((f4b) arrayList.get(0)).O0.getAbsolutePath()), "80_80", null, null, fm2Var, 0L, null, null, 0);
                return;
            }
        }
        xl6 xl6Var = MediaController.a2;
        if (xl6Var != null) {
            ArrayList arrayList2 = xl6Var.e;
            if (!arrayList2.isEmpty()) {
                jm6Var = (jm6) arrayList2.get(0);
                if (jm6Var != null) {
                    String str = jm6Var.c;
                    if (str != null) {
                        imageReceiver.Z(gl5.g(str), "80_80", null, null, fm2Var, 0L, null, null, 0);
                        return;
                    }
                    int i = jm6Var.C;
                    String str2 = jm6Var.I;
                    if (str2 != null) {
                        if (jm6Var.b) {
                            imageReceiver.Z(gl5.g("vthumb://" + i + ":" + str2), "80_80", null, null, fm2Var, 0L, null, null, 0);
                            return;
                        }
                        imageReceiver.o0(jm6Var.J, jm6Var.K, true);
                        imageReceiver.Z(gl5.g("thumb://" + i + ":" + str2), "80_80", null, null, fm2Var, 0L, null, null, 0);
                        return;
                    }
                }
                imageReceiver.g0(fm2Var);
            }
        }
        jm6Var = null;
        if (jm6Var != null) {
        }
        imageReceiver.g0(fm2Var);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.I();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.b.K();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v9 */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        boolean z;
        Canvas canvas2;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        RectF rectF;
        Paint paint;
        float f14;
        float f15;
        RectF rectF2;
        float f16;
        float f17;
        RectF rectF3;
        Canvas canvas3;
        float f18;
        float f19;
        float f20;
        float f21;
        int i;
        Drawable drawable;
        lm lmVar;
        n41 n41Var;
        float f22;
        float f23;
        float f24;
        double d;
        double d2;
        float e = this.q0.e(false, this.s0 ? 1.0f : 0.0f);
        float e2 = this.r0.e(false, this.s0 ? 1.0f : 0.0f);
        float f25 = this.o0;
        if (f25 < 0.0f) {
            f25 = this.n0.e(false, this.p0 ? 1.0f : 0.0f);
        }
        float max = Math.max(e, f25);
        float e3 = this.C0.e(false, this.x0 ? 1.0f : 0.0f);
        float abs = Math.abs(this.z0 - this.j0);
        float L = gl.L(64.0f);
        n41 n41Var2 = this.K;
        float e4 = this.D0.e(false, (abs >= L || !(this.s0 || n41Var2.i)) ? 0.0f : 1.0f) * e3;
        float e5 = this.E0.e(false, Math.abs(this.z0 - this.j0) < ((float) gl.L(64.0f)) ? 1.0f : 0.0f) * e3;
        float i2 = Utilities.i((this.z0 - this.j0) / gl.L(16.0f), 1.0f, -1.0f);
        float i3 = Utilities.i((this.z0 - this.j0) / gl.L(64.0f), 1.0f, -1.0f);
        float e6 = this.G0.e(false, Math.min(Math.abs(this.z0 - this.m0), Math.abs(this.z0 - this.l0)) < ((float) gl.L(16.0f)) ? 1.0f : 0.0f) * e3;
        float f26 = 1.0f - e;
        float d3 = this.J0.d(this.I0 > 0.0f) * f26;
        float e7 = this.K0.e(false, this.I0);
        float d4 = this.L0.d(b());
        float f27 = this.A0 ? e * max * e3 : 0.0f;
        if (f27 > 0.0f) {
            f4 = 1.0f;
            float L2 = this.j0 - gl.L(50.0f);
            f5 = 0.0f;
            float L3 = this.j0 + gl.L(50.0f);
            float L4 = gl.L(2.0f);
            Paint paint2 = this.F;
            paint2.setStrokeWidth(L4);
            float L5 = gl.L(2.0f);
            Paint paint3 = this.G;
            paint3.setStrokeWidth(L5);
            f7 = d3;
            float f28 = f27;
            f6 = e2;
            f2 = e6;
            f = e5;
            z = 1;
            f3 = d4;
            canvas.drawLine(L3, this.k0, gl.R1(L3, this.m0 - gl.L(30.0f), f27), this.k0, paint3);
            canvas.drawLine(L3, this.k0, gl.R1(L3, this.m0 - gl.L(30.0f), f28), this.k0, paint2);
            canvas.drawLine(L2, this.k0, gl.R1(L2, this.l0 + gl.L(30.0f), f28), this.k0, paint3);
            canvas2 = canvas;
            canvas2.drawLine(L2, this.k0, gl.R1(L2, this.l0 + gl.L(30.0f), f28), this.k0, paint2);
        } else {
            f = e5;
            f2 = e6;
            f3 = d4;
            f4 = 1.0f;
            f5 = 0.0f;
            f6 = e2;
            z = 1;
            canvas2 = canvas;
            f7 = d3;
        }
        float f29 = this.j0;
        float R1 = gl.R1(f29, this.F0.e(false, (gl.L(4.0f) * i2) + f29), e4);
        float R12 = gl.R1(gl.U1(e, gl.L(29.0f), gl.L(12.0f)), gl.L(32.0f) - (Math.abs(i3) * gl.L(4.0f)), e4);
        float U1 = gl.U1(e4, gl.U1(e, gl.L(32.0f), gl.L(7.0f)), gl.L(32.0f));
        float R13 = gl.R1(n41Var2.a(this.p0 ? f5 : 0.2f), (this.i0.e(false, this.h0) * 0.2f) + f4, e);
        RectF rectF4 = gl.P;
        float f30 = R1 - R12;
        float f31 = this.k0;
        float f32 = R1 + R12;
        rectF4.set(f30, f31 - R12, f32, f31 + R12);
        float f33 = f4 - f3;
        int f34 = bm2.f(max * f33, -1, -577231);
        Paint paint4 = this.r;
        paint4.setColor(f34);
        if (f3 > f5) {
            canvas2.save();
            canvas2.scale(R13, R13, this.j0, this.k0);
            paint4.setAlpha((int) (f33 * 255.0f));
            canvas2.drawRoundRect(rectF4, U1, U1, paint4);
            canvas2.restore();
            f9 = f32;
            f10 = e;
            f11 = e3;
            f12 = f30;
            f8 = f33;
            paint = paint4;
            f13 = R13;
            rectF = rectF4;
            f14 = max;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), kk7.d4, 31);
        } else {
            f8 = f33;
            f9 = f32;
            f10 = e;
            f11 = e3;
            f12 = f30;
            f13 = R13;
            rectF = rectF4;
            paint = paint4;
            f14 = max;
            canvas2.save();
        }
        canvas2.scale(f13, f13, this.j0, this.k0);
        paint.setAlpha(kk7.d4);
        canvas2.drawRoundRect(rectF, U1, U1, paint);
        if (f3 > f5) {
            float L6 = gl.L(4.0f);
            Paint paint5 = this.H;
            paint5.setStrokeWidth(L6);
            Path path = this.T;
            path.rewind();
            PointF pointF = this.U;
            f17 = 0.7f;
            path.moveTo(pointF.x, pointF.y);
            float f35 = pointF.x;
            PointF pointF2 = this.V;
            float f36 = f3 / 0.3f;
            f15 = 0.3f;
            rectF2 = rectF;
            f16 = U1;
            float f37 = f4;
            float f38 = f5;
            path.lineTo(gl.R1(f35, pointF2.x, Utilities.i(f36, f37, f38)), gl.R1(pointF.y, pointF2.y, Utilities.i(f36, f37, f38)));
            if (f3 > 0.3f) {
                float f39 = pointF2.x;
                PointF pointF3 = this.W;
                float f40 = (f3 - 0.3f) / 0.7f;
                path.lineTo(gl.R1(f39, pointF3.x, Utilities.i(f40, f37, f38)), gl.R1(pointF2.y, pointF3.y, Utilities.i(f40, f37, f38)));
            }
            canvas2.translate(this.j0, this.k0);
            canvas2.drawPath(path, paint5);
        } else {
            f15 = 0.3f;
            rectF2 = rectF;
            f16 = U1;
            f17 = 0.7f;
        }
        canvas2.restore();
        canvas2.save();
        float max2 = Math.max(f13, 1.0f);
        canvas2.scale(max2, max2, this.j0, this.k0);
        float max3 = Math.max(gl.N(33.5f), ((1.0f - e4) * gl.L(5.0f) * f7) + gl.R1(gl.N(4.5f), gl.L(9.0f), e4) + R12);
        float U12 = gl.U1(f7, gl.L(3.0f), gl.L(4.0f));
        float R14 = gl.R1(max3, (R12 - U12) - gl.L(4.0f), f3);
        float f41 = this.j0;
        float f42 = this.k0;
        RectF rectF5 = rectF2;
        rectF5.set(f41 - R14, f42 - R14, f41 + R14, f42 + R14);
        Paint paint6 = this.s;
        paint6.setStrokeWidth(U12);
        paint6.setAlpha((int) (gl.R1(1.0f, f15, f7) * 255.0f * f8));
        canvas2.drawCircle(this.j0, this.k0, R14, paint6);
        if ((f7 > 0.0f ? z : false) && (e7 > 0.0f ? z : false)) {
            paint6.setAlpha(kk7.d4);
            rectF3 = rectF5;
            canvas2.drawArc(rectF3, -90.0f, e7 * 360.0f, false, paint6);
        } else {
            rectF3 = rectF5;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.R;
        float f43 = this.s0 ? 0.0f : 1.0f - f6;
        long j = this.a != null ? 177000L : 60000L;
        float min = Math.min((currentTimeMillis / 60000.0f) * 360.0f, 360.0f);
        float d5 = this.u0.d(this.v0);
        Paint paint7 = this.w;
        paint7.setStrokeWidth(U12);
        paint7.setAlpha((int) (Math.max(d5 * f17, 1.0f - f43) * 255.0f));
        if (d5 <= 0.0f) {
            canvas3 = canvas;
            canvas3.drawArc(rectF3, -90.0f, min, false, paint7);
        } else {
            float elapsedRealtime = (SystemClock.elapsedRealtime() - this.w0) % 5400;
            float[] fArr = this.t0;
            ih2.a(elapsedRealtime, fArr);
            invalidate();
            float f44 = fArr[0];
            float f45 = fArr[z];
            float f46 = (f44 + f45) / 2.0f;
            float abs2 = Math.abs(f45 - f44) / 2.0f;
            if (this.v0) {
                float f47 = min / 2.0f;
                f46 = gl.R1((-90.0f) + f47, f46, d5);
                abs2 = gl.R1(f47, abs2, d5);
            }
            float f48 = f46 - abs2;
            float f49 = abs2 * 2.0f;
            canvas3 = canvas;
            canvas3.drawArc(rectF3, f48, f49, false, paint7);
        }
        if (this.s0) {
            invalidate();
            long j2 = currentTimeMillis / 1000;
            if (j2 != this.S / 1000) {
                ((t6b) this.a).a.K0.a(j2, z);
            }
            if (j > 0 && currentTimeMillis >= j) {
                post(new d29(this, (byte) 0));
            }
            this.S = currentTimeMillis;
        }
        canvas3.restore();
        boolean z2 = this.B0;
        Paint paint8 = this.x;
        n41 n41Var3 = this.M;
        if (z2) {
            float a = n41Var3.a(0.2f) * f10;
            if (a > 0.0f) {
                canvas3.save();
                canvas3.scale(a, a, this.l0, this.k0);
                canvas3.drawCircle(this.l0, this.k0, gl.L(22.0f), paint8);
                canvas3.rotate(-getRotation(), this.l0, this.k0);
                this.f.draw(canvas3);
                canvas3.restore();
            }
        }
        float a2 = n41Var3.a(0.2f) * f26 * f8;
        if (a2 > 0.0f) {
            canvas3.save();
            canvas3.scale(a2, a2, this.l0, this.k0);
            canvas3.rotate(-getRotation(), this.l0, this.k0);
            this.b.h(canvas3, null);
            canvas3.restore();
        }
        float e8 = this.Q.e(false, this.P ? 1.0f : 0.0f);
        Drawable drawable2 = this.e;
        Paint paint9 = this.y;
        lm lmVar2 = this.O;
        n41 n41Var4 = this.L;
        if (e8 > 0.0f) {
            canvas3.save();
            float a3 = n41Var4.a(0.2f) * e8 * f8;
            canvas3.scale(a3, a3, this.m0, this.k0);
            canvas3.rotate(lmVar2.e(false, this.N) - getRotation(), this.m0, this.k0);
            canvas3.drawCircle(this.m0, this.k0, gl.L(22.0f), paint9);
            drawable2.draw(canvas3);
            canvas3.restore();
        }
        if (e8 < 1.0f) {
            canvas3.save();
            f18 = f8;
            float z3 = tb4.z(1.0f, e8, n41Var4.a(0.2f), f18);
            canvas3.scale(z3, z3, this.m0, this.k0);
            canvas3.rotate(lmVar2.e(false, this.N) - getRotation(), this.m0, this.k0);
            canvas3.drawCircle(this.m0, this.k0, gl.L(22.0f), paint8);
            this.d.draw(canvas3);
            canvas3.restore();
        } else {
            f18 = f8;
        }
        if (!this.A0 || b()) {
            f19 = 0.0f;
        } else {
            float f50 = f2;
            f19 = gl.R1(gl.L(16.0f), gl.R1((Math.abs(i3) * gl.L(8.0f)) + gl.L(8.0f), gl.L(22.0f), f50), Math.max(f50, e4)) * f11 * f14 * f10;
        }
        float e9 = this.H0.e(false, (this.A0 || !this.s0) ? 0.0f : 1.0f);
        int i4 = (f19 > 0.0f ? 1 : (f19 == 0.0f ? 0 : -1));
        if (i4 > 0) {
            Paint paint10 = this.E;
            paint10.setAlpha(kk7.d4);
            canvas3.drawCircle(this.z0, this.k0, f19, paint10);
            float f51 = this.z0;
            f21 = 22.0f;
            float f52 = f19;
            float i5 = Utilities.i(1.0f - ((Math.abs(i3) * f11) / 1.3f), 1.0f, 0.0f);
            float abs3 = Math.abs(R1 - f51);
            if (abs3 >= R12 + (f52 * 2.0f) || i5 >= 0.6f) {
                f20 = e9;
                i = i4;
                drawable = drawable2;
                lmVar = lmVar2;
                n41Var = n41Var4;
                f22 = f18;
                f23 = f52;
            } else {
                float f53 = R12 + f52;
                if (abs3 < f53) {
                    float f54 = R12 * R12;
                    float f55 = abs3 * abs3;
                    float f56 = f52 * f52;
                    f24 = abs3;
                    f20 = e9;
                    double acos = Math.acos(((f54 + f55) - f56) / ((R12 * 2.0f) * abs3));
                    d2 = Math.acos(((f56 + f55) - f54) / (r6 * f24));
                    d = acos;
                } else {
                    f24 = abs3;
                    f20 = e9;
                    d = 0.0d;
                    d2 = 0.0d;
                }
                double d6 = f51 <= R1 ? 3.141592653589793d : 0.0d;
                double d7 = d;
                double acos2 = (float) Math.acos((R12 - f52) / f24);
                double d8 = acos2 - d7;
                double d9 = i5;
                double d10 = d8 * d9;
                double d11 = d6 + d7 + d10;
                double d12 = (d6 - d7) - d10;
                double d13 = ((3.141592653589793d - d2) - acos2) * d9;
                double d14 = ((d6 + 3.141592653589793d) - d2) - d13;
                double d15 = (d6 - 3.141592653589793d) + d2 + d13;
                float f57 = this.k0;
                PointF pointF4 = this.Q0;
                a(R1, f57, d11, R12, pointF4);
                float f58 = this.k0;
                PointF pointF5 = this.R0;
                a(R1, f58, d12, R12, pointF5);
                float f59 = this.k0;
                PointF pointF6 = this.S0;
                a(f51, f59, d14, f52, pointF6);
                float f60 = this.k0;
                i = i4;
                PointF pointF7 = this.T0;
                a(f51, f60, d15, f52, pointF7);
                f23 = f52;
                f22 = f18;
                drawable = drawable2;
                lmVar = lmVar2;
                n41Var = n41Var4;
                float min2 = Math.min(1.0f, (f24 * 2.0f) / f53) * Math.min(i5 * 2.4f, loe.a(pointF4.x, pointF4.y, pointF6.x, pointF6.y) / f53);
                float f61 = R12 * min2;
                float f62 = f23 * min2;
                a(pointF4.x, pointF4.y, d11 - 1.5707963705062866d, f61, this.U0);
                a(pointF5.x, pointF5.y, d12 + 1.5707963705062866d, f61, this.V0);
                a(pointF6.x, pointF6.y, d14 + 1.5707963705062866d, f62, this.W0);
                a(pointF7.x, pointF7.y, d15 - 1.5707963705062866d, f62, this.X0);
                float f63 = f10;
                float C = yjb.C(f11, f14, f63, f);
                if (C > 0.0f) {
                    Path path2 = this.O0;
                    path2.rewind();
                    path2.moveTo(pointF4.x, pointF4.y);
                    PointF pointF8 = this.U0;
                    float f64 = pointF8.x;
                    float f65 = pointF8.y;
                    f10 = f63;
                    PointF pointF9 = this.W0;
                    path2.cubicTo(f64, f65, pointF9.x, pointF9.y, pointF6.x, pointF6.y);
                    path2.lineTo(pointF7.x, pointF7.y);
                    PointF pointF10 = this.X0;
                    float f66 = pointF10.x;
                    float f67 = pointF10.y;
                    PointF pointF11 = this.V0;
                    path2.cubicTo(f66, f67, pointF11.x, pointF11.y, pointF5.x, pointF5.y);
                    path2.lineTo(pointF4.x, pointF4.y);
                    paint10.setAlpha((int) (C * 255.0f));
                    canvas3.drawPath(path2, paint10);
                    float f68 = this.k0;
                    rectF3.set(f12, f68 - R12, f9, f68 + R12);
                    float f69 = f16;
                    canvas3.drawRoundRect(rectF3, f69, f69, paint10);
                } else {
                    f10 = f63;
                }
            }
        } else {
            f20 = e9;
            f21 = 22.0f;
            i = i4;
            drawable = drawable2;
            lmVar = lmVar2;
            n41Var = n41Var4;
            f22 = f18;
            f23 = f19;
        }
        if (i > 0 || f20 > 0.0f) {
            float a4 = n41Var3.a(0.2f) * f10 * f22;
            canvas3.save();
            Path path3 = this.P0;
            path3.rewind();
            if (i > 0) {
                path3.addCircle(this.z0, this.k0, f23, Path.Direction.CW);
            }
            if (f20 > 0.0f && this.B0) {
                path3.addCircle(this.l0, this.k0, gl.L(f21) * f20 * a4, Path.Direction.CW);
            }
            canvas3.clipPath(path3);
            if (this.B0) {
                canvas3.save();
                canvas3.scale(a4, a4, this.l0, this.k0);
                canvas3.drawCircle(this.l0, this.k0, gl.L(f21), paint9);
                canvas3.rotate(-getRotation(), this.l0, this.k0);
                this.h.draw(canvas3);
                canvas3.restore();
            }
            float a5 = n41Var.a(0.2f) * f22;
            canvas3.save();
            canvas3.scale(a5, a5, this.m0, this.k0);
            canvas3.rotate(lmVar.e(false, this.N) - getRotation(), this.m0, this.k0);
            canvas3.drawCircle(this.m0, this.k0, gl.L(f21), paint9);
            drawable.draw(canvas3);
            canvas3.restore();
            canvas3.restore();
        }
        ux0 ux0Var = this.a0;
        if (ux0Var != null) {
            boolean b = b();
            boolean z4 = this.b0;
            boolean z5 = this.s0;
            if (z4 == z5 && this.c0 == b && this.d0 == this.P && this.e0 == this.p0 && this.f0 == this.v0 && this.g0 == this.B0) {
                return;
            }
            this.b0 = z5;
            this.c0 = b;
            this.d0 = this.P;
            this.e0 = this.p0;
            this.f0 = this.v0;
            this.g0 = this.B0;
            ux0Var.i();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = gl.L(100.0f);
        float f = size;
        this.j0 = f / 2.0f;
        this.k0 = L / 2.0f;
        float min = Math.min(gl.L(135.0f), f * 0.35f);
        float f2 = this.j0;
        this.l0 = f2 - min;
        float f3 = f2 + min;
        this.m0 = f3;
        float f4 = this.k0;
        float L2 = gl.L(14.0f);
        this.d.setBounds((int) (f3 - L2), (int) (f4 - L2), (int) (f3 + L2), (int) (f4 + L2));
        float f5 = this.m0;
        float f6 = this.k0;
        float L3 = gl.L(14.0f);
        this.e.setBounds((int) (f5 - L3), (int) (f6 - L3), (int) (f5 + L3), (int) (f6 + L3));
        f(this.f, this.l0, this.k0);
        f(this.h, this.l0, this.k0);
        f(this.n, this.l0, this.k0);
        this.b.i0(this.l0 - gl.L(20.0f), this.k0 - gl.L(20.0f), gl.L(40.0f), gl.L(40.0f));
        Matrix matrix = this.I;
        matrix.reset();
        matrix.postTranslate(this.j0, this.k0);
        this.J.setLocalMatrix(matrix);
        setMeasuredDimension(size, L);
        ux0 ux0Var = this.a0;
        if (ux0Var != null) {
            ux0Var.i();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0195  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float i = Utilities.i(motionEvent.getX() + 0.0f, this.m0, this.l0);
        float y = motionEvent.getY() + 0.0f;
        boolean c = c(i, y, this.m0, this.k0, gl.L(7.0f), true);
        boolean z = this.v0;
        n41 n41Var = this.M;
        n41 n41Var2 = this.K;
        n41 n41Var3 = this.L;
        boolean z2 = true;
        z2 = true;
        z2 = true;
        z2 = true;
        z2 = true;
        z2 = true;
        if (z) {
            n41Var2.c(false);
            n41Var3.c(false);
            n41Var.c(false);
        } else if (action == 0 || this.x0) {
            n41Var2.c(c(i, y, this.j0, this.k0, gl.L(60.0f), false));
            n41Var3.c(c(i, y, this.m0, this.k0, (float) gl.L(30.0f), true) && !b());
            n41Var.c(c(i, y, this.l0, this.k0, (float) gl.L(30.0f), false) && !b());
        }
        d29 d29Var = this.N0;
        d29 d29Var2 = this.M0;
        if (action == 0) {
            this.x0 = true;
            this.y0 = n41Var2.i || n41Var3.i;
            System.currentTimeMillis();
            this.z0 = i;
            if (Math.abs(i - this.j0) < gl.L(50.0f)) {
                gl.e3(d29Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (n41Var3.i) {
                gl.e3(d29Var, ViewConfiguration.getLongPressTimeout());
            }
        } else {
            if (action == 2) {
                if (this.x0) {
                    this.z0 = Utilities.i(i, this.m0, this.l0);
                    invalidate();
                    if (this.s0 && !this.Y0 && c) {
                        d(180.0f);
                        ((t6b) this.a).b();
                    }
                    if (this.s0 && this.A0) {
                        float i2 = Utilities.i(((this.k0 - gl.L(48.0f)) - y) / (gl.q.y / 2.0f), 1.0f, 0.0f);
                        t7b t7bVar = ((t6b) this.a).a;
                        t7bVar.W0.b(true, i2);
                        t7bVar.i0(false);
                    }
                }
                return false;
            }
            if (action == 1 || action == 3) {
                if (this.x0) {
                    this.x0 = false;
                    this.y0 = false;
                    gl.r(d29Var2);
                    gl.r(d29Var);
                    if (this.s0) {
                        if (this.A0) {
                            if (n41Var.i) {
                                this.A0 = false;
                                this.H0.e(true, 1.0f);
                                ge5 ge5Var = ((t6b) this.a).a.U0;
                                ge5Var.a.t(k96.M0(2131744421, null), true, true);
                                ge5Var.invalidate();
                            } else {
                                this.s0 = false;
                                this.w0 = SystemClock.elapsedRealtime();
                                this.v0 = true;
                                ((t6b) this.a).e(false);
                            }
                            this.A0 = false;
                            if (n41Var3.i) {
                            }
                            n41Var2.c(false);
                            n41Var3.c(false);
                            n41Var.c(false);
                            invalidate();
                        }
                        if (n41Var2.i) {
                        }
                        this.A0 = false;
                        if (n41Var3.i) {
                        }
                        n41Var2.c(false);
                        n41Var3.c(false);
                        n41Var.c(false);
                        invalidate();
                    } else {
                        if (n41Var.i) {
                            ((t6b) this.a).c();
                            this.A0 = false;
                            if (n41Var3.i) {
                                d(180.0f);
                                ((t6b) this.a).b();
                            }
                            n41Var2.c(false);
                            n41Var3.c(false);
                            n41Var.c(false);
                            invalidate();
                        }
                        if (n41Var2.i) {
                            if (b()) {
                                ((t6b) this.a).a();
                            } else if (!this.p0 && !this.s0 && !this.A0) {
                                ((t6b) this.a).d();
                            } else if (this.s0) {
                                this.s0 = false;
                                this.w0 = SystemClock.elapsedRealtime();
                                this.v0 = true;
                                ((t6b) this.a).e(false);
                            } else if (((t6b) this.a).a.Y()) {
                                this.S = 0L;
                                this.R = System.currentTimeMillis();
                                this.B0 = false;
                                ((t6b) this.a).f(new d29(this, z2 ? (byte) 1 : (byte) 0), false);
                            }
                        }
                        this.A0 = false;
                        if (n41Var3.i) {
                        }
                        n41Var2.c(false);
                        n41Var3.c(false);
                        n41Var.c(false);
                        invalidate();
                    }
                }
                return false;
            }
            z2 = false;
        }
        this.Y0 = c;
        return z2;
    }

    public void setDelegate(e29 e29Var) {
        this.a = e29Var;
    }

    public void setDual(boolean z) {
        if (z != this.P) {
            this.P = z;
            invalidate();
        }
    }

    @Override // li4
    public void setInvert(float f) {
        this.s.setColor(bm2.f(f, -1, -16777216));
        this.x.setColor(bm2.f(f, 1677721600, 369098752));
        this.F.setColor(bm2.f(f, 1493172223, 285212671));
        this.G.setColor(bm2.f(f, 402653184, 805306368));
        int f2 = bm2.f(f, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(f2, mode));
        this.f.setColorFilter(new PorterDuffColorFilter(bm2.f(f, -1, -16777216), mode));
    }
}
