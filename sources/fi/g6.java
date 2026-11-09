package fi;

import android.app.Activity;
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
import org.telegram.messenger.gf;
import org.telegram.messenger.hc;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.we;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class g6 extends View implements o2 {
    public boolean A0;
    public final org.telegram.ui.Components.w5 B0;
    public final org.telegram.ui.Components.w5 C0;
    public final Paint D;
    public final org.telegram.ui.Components.w5 D0;
    public final Paint E;
    public final org.telegram.ui.Components.w5 E0;
    public final Paint F;
    public final org.telegram.ui.Components.w5 F0;
    public final Paint G;
    public final org.telegram.ui.Components.w5 G0;
    public final Matrix H;
    public float H0;
    public final RadialGradient I;
    public final org.telegram.ui.Components.w5 I0;
    public final ic J;
    public final org.telegram.ui.Components.w5 J0;
    public final ic K;
    public final org.telegram.ui.Components.w5 K0;
    public final ic L;
    public final d6 L0;
    public float M;
    public final d6 M0;
    public final org.telegram.ui.Components.w5 N;
    public final Path N0;
    public boolean O;
    public final Path O0;
    public final org.telegram.ui.Components.w5 P;
    public final PointF P0;
    public long Q;
    public final PointF Q0;
    public long R;
    public final PointF R0;
    public final Path S;
    public final PointF S0;
    public final PointF T;
    public final PointF T0;
    public final PointF U;
    public final PointF U0;
    public final PointF V;
    public final PointF V0;
    public final f6 W;
    public final PointF W0;
    public boolean X0;
    public e6 a;
    public boolean a0;
    public final ImageReceiver b;
    public boolean b0;
    public final xp c;
    public boolean c0;
    public final Drawable d;
    public boolean d0;
    public final Drawable e;
    public boolean e0;
    public final Drawable f;
    public boolean f0;
    public float g0;
    public final Drawable h;
    public final org.telegram.ui.Components.w5 h0;
    public float i0;
    public float j0;
    public float k0;
    public float l0;
    public final org.telegram.ui.Components.w5 m0;
    public final Drawable n;
    public float n0;
    public boolean o0;
    public final org.telegram.ui.Components.w5 p0;
    public final org.telegram.ui.Components.w5 q0;
    public final Paint r;
    public boolean r0;
    public final Paint s;
    public final float[] s0;
    public final org.telegram.ui.Components.w5 t0;
    public boolean u0;
    public long v0;
    public final Paint w;
    public boolean w0;
    public final Paint x;
    public boolean x0;
    public final Paint y;
    public float y0;
    public boolean z0;

    public g6(Activity activity) {
        super(activity);
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
        this.D = paint5;
        Paint paint6 = new Paint(1);
        this.E = paint6;
        Paint paint7 = new Paint(1);
        this.F = paint7;
        Paint paint8 = new Paint(1);
        this.G = paint8;
        Matrix matrix = new Matrix();
        this.H = matrix;
        this.J = new ic(this);
        this.K = new ic(this);
        this.L = new ic(this);
        xq xqVar = xq.h;
        this.N = new org.telegram.ui.Components.w5(this, 0L, 310L, xqVar);
        this.P = new org.telegram.ui.Components.w5(this, 0L, 330L, xqVar);
        this.S = new Path();
        this.T = new PointF(-org.telegram.messenger.g0.N(9.666667f), org.telegram.messenger.g0.N(2.3333333f));
        this.U = new PointF(-org.telegram.messenger.g0.N(2.8333333f), org.telegram.messenger.g0.N(8.666667f));
        this.V = new PointF(org.telegram.messenger.g0.N(9.666667f), org.telegram.messenger.g0.N(-3.6666667f));
        this.h0 = new org.telegram.ui.Components.w5(this, 0L, 200L, xq.f);
        this.m0 = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
        this.n0 = -1.0f;
        this.o0 = true;
        this.p0 = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
        this.q0 = new org.telegram.ui.Components.w5(this, 0L, 850L, xqVar);
        this.s0 = new float[2];
        this.t0 = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
        this.B0 = new org.telegram.ui.Components.w5(this, 0L, 350L, xqVar);
        this.C0 = new org.telegram.ui.Components.w5(this, 0L, 650L, xqVar);
        this.D0 = new org.telegram.ui.Components.w5(this, 0L, 160L, xq.i);
        this.E0 = new org.telegram.ui.Components.w5(this, 0L, 750L, xqVar);
        this.F0 = new org.telegram.ui.Components.w5(this, 0L, 650L, xqVar);
        this.G0 = new org.telegram.ui.Components.w5(this, 0L, 320L, xqVar);
        this.I0 = new org.telegram.ui.Components.w5(this, 0L, 320L, xqVar);
        this.J0 = new org.telegram.ui.Components.w5(this, 0L, 320L, xqVar);
        this.K0 = new org.telegram.ui.Components.w5(this, 0L, 320L, xqVar);
        this.L0 = new d6(this, 2);
        this.M0 = new d6(this, 3);
        this.N0 = new Path();
        this.O0 = new Path();
        this.P0 = new PointF();
        this.Q0 = new PointF();
        this.R0 = new PointF();
        this.S0 = new PointF();
        this.T0 = new PointF();
        this.U0 = new PointF();
        this.V0 = new PointF();
        this.W0 = new PointF();
        setWillNotDraw(false);
        f6 f6Var = new f6(this, this);
        this.W = f6Var;
        r0.i0.j(this, f6Var);
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(48.0f), new int[]{-577231, -577231, -1}, new float[]{0.0f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
        this.I = radialGradient;
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
        imageReceiver.H0(this);
        imageReceiver.A0 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        Drawable mutate = activity.getResources().getDrawable(R.drawable.msg_media_gallery).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, mode));
        xp xpVar = new xp(org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(6.0f), -13750737), mutate);
        this.c = xpVar;
        xpVar.x = false;
        int L = org.telegram.messenger.g0.L(24.0f);
        int L2 = org.telegram.messenger.g0.L(24.0f);
        xpVar.e = L;
        xpVar.f = L2;
        Drawable mutate2 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.d = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate3 = activity.getResources().getDrawable(R.drawable.msg_photo_switch2).mutate();
        this.e = mutate3;
        mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate4 = activity.getResources().getDrawable(R.drawable.msg_filled_unlockedrecord).mutate();
        this.f = mutate4;
        mutate4.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate5 = activity.getResources().getDrawable(R.drawable.msg_filled_lockedrecord).mutate();
        this.h = mutate5;
        mutate5.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        Drawable mutate6 = activity.getResources().getDrawable(R.drawable.msg_round_pause_m).mutate();
        this.n = mutate6;
        mutate6.setColorFilter(new PorterDuffColorFilter(-1, mode));
        h();
    }

    public static void a(float f10, float f11, double d, float f12, PointF pointF) {
        double d2 = f12;
        pointF.x = (float) ((Math.cos(d) * d2) + f10);
        pointF.y = (float) ((Math.sin(d) * d2) + f11);
    }

    public static void f(Drawable drawable, float f10, float f11) {
        float max = Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) / 2.0f;
        drawable.setBounds((int) (f10 - max), (int) (f11 - max), (int) (f10 + max), (int) (f11 + max));
    }

    public final boolean b() {
        return this.H0 >= 1.0f;
    }

    public final boolean c(float f10, float f11, float f12, float f13, float f14, boolean z9) {
        return this.r0 ? (!z9 || f13 - f11 <= ((float) org.telegram.messenger.g0.L(100.0f))) && Math.abs(f12 - f10) <= f14 : a8.r9.a(f10, f11, f12, f13) <= f14;
    }

    public final void d(float f10) {
        this.N.g = f10 > 180.0f ? 620L : 310L;
        this.M += f10;
        invalidate();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        f6 f6Var = this.W;
        if (f6Var == null || !f6Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final void e(boolean z9, float f10) {
        if (Math.abs(f10 - this.H0) < 0.01f) {
            return;
        }
        this.H0 = f10;
        if (!z9) {
            this.I0.f(f10 > 0.0f && !this.r0, true);
            this.J0.e(true, f10);
        }
        invalidate();
    }

    public final void g(boolean z9) {
        this.u0 = false;
        if (!z9) {
            org.telegram.ui.Components.w5 w5Var = this.t0;
            w5Var.getClass();
            w5Var.e(true, 0.0f);
        }
        invalidate();
    }

    public final void h() {
        String str;
        ArrayList arrayList;
        e6 e6Var = this.a;
        xp xpVar = this.c;
        ImageReceiver imageReceiver = this.b;
        if (e6Var != null) {
            ArrayList arrayList2 = qp.s1(imageReceiver.d).P1().w.b;
            imageReceiver.G0(0, 0, true);
            if (arrayList2 != null && !arrayList2.isEmpty() && ((e7) arrayList2.get(0)).O0 != null) {
                imageReceiver.r0(hc.g(((e7) arrayList2.get(0)).O0.getAbsolutePath()), "80_80", null, null, xpVar, 0L, null, null, 0);
                return;
            }
        }
        we weVar = MediaController.Z1;
        gf gfVar = (weVar == null || (arrayList = weVar.e) == null || arrayList.isEmpty()) ? null : (gf) arrayList.get(0);
        if (gfVar != null && (str = gfVar.c) != null) {
            imageReceiver.r0(hc.g(str), "80_80", null, null, xpVar, 0L, null, null, 0);
            return;
        }
        if (gfVar != null) {
            int i7 = gfVar.C;
            String str2 = gfVar.I;
            if (str2 != null) {
                if (gfVar.b) {
                    imageReceiver.r0(hc.g("vthumb://" + i7 + ":" + str2), "80_80", null, null, xpVar, 0L, null, null, 0);
                    return;
                }
                imageReceiver.G0(gfVar.J, gfVar.K, true);
                imageReceiver.r0(hc.g("thumb://" + i7 + ":" + str2), "80_80", null, null, xpVar, 0L, null, null, 0);
                return;
            }
        }
        imageReceiver.w0(xpVar);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.b.R();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0887  */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v2 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        boolean z9;
        Canvas canvas2;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        RectF rectF;
        Paint paint;
        float f23;
        float f24;
        RectF rectF2;
        float f25;
        float f26;
        RectF rectF3;
        Canvas canvas3;
        float f27;
        float f28;
        float f29;
        float f30;
        float f31;
        org.telegram.ui.Components.w5 w5Var;
        ic icVar;
        int i7;
        float f32;
        float a10;
        Path path;
        f6 f6Var;
        float f33;
        float f34;
        double d;
        double d2;
        float e10 = this.p0.e(false, this.r0 ? 1.0f : 0.0f);
        float e11 = this.q0.e(false, this.r0 ? 1.0f : 0.0f);
        float f35 = this.n0;
        if (f35 < 0.0f) {
            f35 = this.m0.e(false, this.o0 ? 1.0f : 0.0f);
        }
        float max = Math.max(e10, f35);
        float e12 = this.B0.e(false, this.w0 ? 1.0f : 0.0f);
        float abs = Math.abs(this.y0 - this.i0);
        float L = org.telegram.messenger.g0.L(64.0f);
        ic icVar2 = this.J;
        float e13 = this.C0.e(false, (abs >= L || !(this.r0 || icVar2.i)) ? 0.0f : 1.0f) * e12;
        float e14 = this.D0.e(false, Math.abs(this.y0 - this.i0) < ((float) org.telegram.messenger.g0.L(64.0f)) ? 1.0f : 0.0f) * e12;
        float i10 = Utilities.i((this.y0 - this.i0) / org.telegram.messenger.g0.L(16.0f), 1.0f, -1.0f);
        float i11 = Utilities.i((this.y0 - this.i0) / org.telegram.messenger.g0.L(64.0f), 1.0f, -1.0f);
        float e15 = this.F0.e(false, Math.min(Math.abs(this.y0 - this.l0), Math.abs(this.y0 - this.k0)) < ((float) org.telegram.messenger.g0.L(16.0f)) ? 1.0f : 0.0f) * e12;
        float f36 = 1.0f - e10;
        float d10 = this.I0.d(this.H0 > 0.0f) * f36;
        float e16 = this.J0.e(false, this.H0);
        float d11 = this.K0.d(b());
        float f37 = this.z0 ? e10 * max * e12 : 0.0f;
        if (f37 > 0.0f) {
            f13 = 1.0f;
            float L2 = this.i0 - org.telegram.messenger.g0.L(50.0f);
            f14 = 0.0f;
            float L3 = this.i0 + org.telegram.messenger.g0.L(50.0f);
            float L4 = org.telegram.messenger.g0.L(2.0f);
            Paint paint2 = this.E;
            paint2.setStrokeWidth(L4);
            float L5 = org.telegram.messenger.g0.L(2.0f);
            Paint paint3 = this.F;
            paint3.setStrokeWidth(L5);
            f16 = d10;
            float f38 = f37;
            f15 = e11;
            f11 = e15;
            f10 = e14;
            z9 = 1;
            f12 = d11;
            canvas.drawLine(L3, this.j0, org.telegram.messenger.g0.T1(L3, this.l0 - org.telegram.messenger.g0.L(30.0f), f37), this.j0, paint3);
            canvas.drawLine(L3, this.j0, org.telegram.messenger.g0.T1(L3, this.l0 - org.telegram.messenger.g0.L(30.0f), f38), this.j0, paint2);
            canvas.drawLine(L2, this.j0, org.telegram.messenger.g0.T1(L2, this.k0 + org.telegram.messenger.g0.L(30.0f), f38), this.j0, paint3);
            canvas2 = canvas;
            canvas2.drawLine(L2, this.j0, org.telegram.messenger.g0.T1(L2, this.k0 + org.telegram.messenger.g0.L(30.0f), f38), this.j0, paint2);
        } else {
            f10 = e14;
            f11 = e15;
            f12 = d11;
            f13 = 1.0f;
            f14 = 0.0f;
            f15 = e11;
            z9 = 1;
            canvas2 = canvas;
            f16 = d10;
        }
        float f39 = this.i0;
        float T1 = org.telegram.messenger.g0.T1(f39, this.E0.e(false, (org.telegram.messenger.g0.L(4.0f) * i10) + f39), e13);
        float T12 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(12.0f)), org.telegram.messenger.g0.L(32.0f) - (Math.abs(i11) * org.telegram.messenger.g0.L(4.0f)), e13);
        float W1 = org.telegram.messenger.g0.W1(e13, org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(7.0f)), org.telegram.messenger.g0.L(32.0f));
        float T13 = org.telegram.messenger.g0.T1(icVar2.a(this.o0 ? f14 : 0.2f), (this.h0.e(false, this.g0) * 0.2f) + f13, e10);
        RectF rectF4 = org.telegram.messenger.g0.P;
        float f40 = T1 - T12;
        float f41 = this.j0;
        float f42 = T1 + T12;
        rectF4.set(f40, f41 - T12, f42, f41 + T12);
        float f43 = f13 - f12;
        int f44 = i0.a.f(max * f43, -1, -577231);
        Paint paint4 = this.r;
        paint4.setColor(f44);
        if (f12 > f14) {
            canvas2.save();
            canvas2.scale(T13, T13, this.i0, this.j0);
            paint4.setAlpha((int) (f43 * 255.0f));
            canvas2.drawRoundRect(rectF4, W1, W1, paint4);
            canvas2.restore();
            f18 = f42;
            f19 = e10;
            f20 = e12;
            f21 = f40;
            f17 = f43;
            paint = paint4;
            f22 = T13;
            rectF = rectF4;
            f23 = max;
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), qs.e4, 31);
        } else {
            f17 = f43;
            f18 = f42;
            f19 = e10;
            f20 = e12;
            f21 = f40;
            f22 = T13;
            rectF = rectF4;
            paint = paint4;
            f23 = max;
            canvas2.save();
        }
        canvas2.scale(f22, f22, this.i0, this.j0);
        paint.setAlpha(qs.e4);
        canvas2.drawRoundRect(rectF, W1, W1, paint);
        if (f12 > f14) {
            float L6 = org.telegram.messenger.g0.L(4.0f);
            Paint paint5 = this.G;
            paint5.setStrokeWidth(L6);
            Path path2 = this.S;
            path2.rewind();
            PointF pointF = this.T;
            f26 = 0.7f;
            path2.moveTo(pointF.x, pointF.y);
            float f45 = pointF.x;
            PointF pointF2 = this.U;
            float f46 = f12 / 0.3f;
            f24 = 0.3f;
            rectF2 = rectF;
            f25 = W1;
            float f47 = f13;
            float f48 = f14;
            path2.lineTo(org.telegram.messenger.g0.T1(f45, pointF2.x, Utilities.i(f46, f47, f48)), org.telegram.messenger.g0.T1(pointF.y, pointF2.y, Utilities.i(f46, f47, f48)));
            if (f12 > 0.3f) {
                float f49 = pointF2.x;
                PointF pointF3 = this.V;
                float f50 = (f12 - 0.3f) / 0.7f;
                path2.lineTo(org.telegram.messenger.g0.T1(f49, pointF3.x, Utilities.i(f50, f47, f48)), org.telegram.messenger.g0.T1(pointF2.y, pointF3.y, Utilities.i(f50, f47, f48)));
            }
            canvas2.translate(this.i0, this.j0);
            canvas2.drawPath(path2, paint5);
        } else {
            f24 = 0.3f;
            rectF2 = rectF;
            f25 = W1;
            f26 = 0.7f;
        }
        canvas2.restore();
        canvas2.save();
        float max2 = Math.max(f22, 1.0f);
        canvas2.scale(max2, max2, this.i0, this.j0);
        float max3 = Math.max(org.telegram.messenger.g0.N(33.5f), ((1.0f - e13) * org.telegram.messenger.g0.L(5.0f) * f16) + org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(4.5f), org.telegram.messenger.g0.L(9.0f), e13) + T12);
        float W12 = org.telegram.messenger.g0.W1(f16, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(4.0f));
        float T14 = org.telegram.messenger.g0.T1(max3, (T12 - W12) - org.telegram.messenger.g0.L(4.0f), f12);
        float f51 = this.i0;
        float f52 = this.j0;
        RectF rectF5 = rectF2;
        rectF5.set(f51 - T14, f52 - T14, f51 + T14, f52 + T14);
        Paint paint6 = this.s;
        paint6.setStrokeWidth(W12);
        paint6.setAlpha((int) (org.telegram.messenger.g0.T1(1.0f, f24, f16) * 255.0f * f17));
        canvas2.drawCircle(this.i0, this.j0, T14, paint6);
        if ((e16 > 0.0f ? z9 : false) && ((f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1)) > 0 ? z9 : false)) {
            paint6.setAlpha(qs.e4);
            rectF3 = rectF5;
            canvas2.drawArc(rectF3, -90.0f, e16 * 360.0f, false, paint6);
        } else {
            rectF3 = rectF5;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.Q;
        float f53 = this.r0 ? 0.0f : 1.0f - f15;
        long j3 = this.a != null ? 177000L : 60000L;
        float min = Math.min((currentTimeMillis / 60000) * 360.0f, 360.0f);
        float d12 = this.t0.d(this.u0);
        Paint paint7 = this.w;
        paint7.setStrokeWidth(W12);
        paint7.setAlpha((int) (Math.max(d12 * f26, 1.0f - f53) * 255.0f));
        if (d12 <= 0.0f) {
            canvas3 = canvas;
            canvas3.drawArc(rectF3, -90.0f, min, false, paint7);
        } else {
            cp.a((SystemClock.elapsedRealtime() - this.v0) % 5400, this.s0);
            invalidate();
            float[] fArr = this.s0;
            float f54 = fArr[0];
            float f55 = fArr[z9];
            float f56 = (f54 + f55) / 2.0f;
            float abs2 = Math.abs(f55 - f54) / 2.0f;
            if (this.u0) {
                float f57 = min / 2.0f;
                f56 = org.telegram.messenger.g0.T1((-90.0f) + f57, f56, d12);
                abs2 = org.telegram.messenger.g0.T1(f57, abs2, d12);
            }
            float f58 = f56 - abs2;
            float f59 = abs2 * 2.0f;
            canvas3 = canvas;
            canvas3.drawArc(rectF3, f58, f59, false, paint7);
        }
        if (this.r0) {
            invalidate();
            long j10 = currentTimeMillis / 1000;
            if (j10 != this.R / 1000) {
                ((r9) this.a).a.J0.a(j10, z9);
            }
            if (j3 > 0 && currentTimeMillis >= j3) {
                post(new d6(this, 0));
            }
            this.R = currentTimeMillis;
        }
        canvas3.restore();
        boolean z10 = this.A0;
        ic icVar3 = this.L;
        if (z10) {
            float a11 = icVar3.a(0.2f) * f19;
            if (a11 > 0.0f) {
                canvas3.save();
                canvas3.scale(a11, a11, this.k0, this.j0);
                canvas3.drawCircle(this.k0, this.j0, org.telegram.messenger.g0.L(22.0f), this.x);
                canvas3.rotate(-getRotation(), this.k0, this.j0);
                this.f.draw(canvas3);
                canvas3.restore();
            }
        }
        float a12 = icVar3.a(0.2f) * f36 * f17;
        if (a12 > 0.0f) {
            canvas3.save();
            canvas3.scale(a12, a12, this.k0, this.j0);
            canvas3.rotate(-getRotation(), this.k0, this.j0);
            this.b.h(canvas3, null);
            canvas3.restore();
        }
        float e17 = this.P.e(false, this.O ? 1.0f : 0.0f);
        Paint paint8 = this.y;
        org.telegram.ui.Components.w5 w5Var2 = this.N;
        ic icVar4 = this.K;
        if (e17 > 0.0f) {
            canvas3.save();
            float a13 = icVar4.a(0.2f) * e17 * f17;
            canvas3.scale(a13, a13, this.l0, this.j0);
            canvas3.rotate(w5Var2.e(false, this.M) - getRotation(), this.l0, this.j0);
            canvas3.drawCircle(this.l0, this.j0, org.telegram.messenger.g0.L(22.0f), paint8);
            this.e.draw(canvas3);
            canvas3.restore();
        }
        if (e17 < 1.0f) {
            canvas3.save();
            f27 = f17;
            float A = org.telegram.messenger.k5.A(1.0f, e17, icVar4.a(0.2f), f27);
            canvas3.scale(A, A, this.l0, this.j0);
            canvas3.rotate(w5Var2.e(false, this.M) - getRotation(), this.l0, this.j0);
            canvas3.drawCircle(this.l0, this.j0, org.telegram.messenger.g0.L(22.0f), this.x);
            this.d.draw(canvas3);
            canvas3.restore();
        } else {
            f27 = f17;
        }
        if (!this.z0 || b()) {
            f28 = 0.0f;
        } else {
            float f60 = f11;
            f28 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.T1((Math.abs(i11) * org.telegram.messenger.g0.L(8.0f)) + org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(22.0f), f60), Math.max(f60, e13)) * f20 * f23 * f19;
        }
        float e18 = this.G0.e(false, (this.z0 || !this.r0) ? 0.0f : 1.0f);
        int i12 = (f28 > 0.0f ? 1 : (f28 == 0.0f ? 0 : -1));
        if (i12 > 0) {
            Paint paint9 = this.D;
            paint9.setAlpha(qs.e4);
            canvas3.drawCircle(this.y0, this.j0, f28, paint9);
            float f61 = this.y0;
            float abs3 = 1.0f - ((Math.abs(i11) * f20) / 1.3f);
            f30 = 22.0f;
            float i13 = Utilities.i(abs3, 1.0f, 0.0f);
            float abs4 = Math.abs(T1 - f61);
            if (abs4 < T12 + (f28 * 2.0f) && i13 < 0.6f) {
                float f62 = T12 + f28;
                if (abs4 < f62) {
                    float f63 = T12 * T12;
                    float f64 = abs4 * abs4;
                    float f65 = f28 * f28;
                    f33 = f28;
                    f34 = abs4;
                    f31 = e18;
                    double acos = Math.acos(((f63 + f64) - f65) / ((T12 * 2.0f) * abs4));
                    d2 = Math.acos(((f65 + f64) - f63) / (r15 * f34));
                    d = acos;
                } else {
                    f33 = f28;
                    f34 = abs4;
                    f31 = e18;
                    d = 0.0d;
                    d2 = 0.0d;
                }
                double d13 = f61 > T1 ? 0.0d : 3.141592653589793d;
                double d14 = d;
                double acos2 = (float) Math.acos((T12 - f33) / f34);
                double d15 = acos2 - d14;
                double d16 = i13;
                double d17 = d15 * d16;
                double d18 = d13 + d14 + d17;
                double d19 = (d13 - d14) - d17;
                double d20 = ((3.141592653589793d - d2) - acos2) * d16;
                double d21 = ((d13 + 3.141592653589793d) - d2) - d20;
                double d22 = (d13 - 3.141592653589793d) + d2 + d20;
                float f66 = this.j0;
                PointF pointF4 = this.P0;
                a(T1, f66, d18, T12, pointF4);
                float f67 = this.j0;
                PointF pointF5 = this.Q0;
                a(T1, f67, d19, T12, pointF5);
                float f68 = this.j0;
                PointF pointF6 = this.R0;
                float f69 = f33;
                a(f61, f68, d21, f69, pointF6);
                float f70 = this.j0;
                PointF pointF7 = this.S0;
                i7 = i12;
                a(f61, f70, d22, f69, pointF7);
                f29 = f69;
                f32 = f27;
                w5Var = w5Var2;
                icVar = icVar4;
                float min2 = Math.min(1.0f, (f34 * 2.0f) / f62) * Math.min(i13 * 2.4f, a8.r9.a(pointF4.x, pointF4.y, pointF6.x, pointF6.y) / f62);
                float f71 = T12 * min2;
                float f72 = f29 * min2;
                a(pointF4.x, pointF4.y, d18 - 1.5707963705062866d, f71, this.T0);
                a(pointF5.x, pointF5.y, d19 + 1.5707963705062866d, f71, this.U0);
                a(pointF6.x, pointF6.y, d21 + 1.5707963705062866d, f72, this.V0);
                a(pointF7.x, pointF7.y, d22 - 1.5707963705062866d, f72, this.W0);
                float f73 = f19;
                float D = com.google.android.recaptcha.internal.a.D(f20, f23, f73, f10);
                if (D > 0.0f) {
                    Path path3 = this.N0;
                    path3.rewind();
                    path3.moveTo(pointF4.x, pointF4.y);
                    PointF pointF8 = this.T0;
                    float f74 = pointF8.x;
                    float f75 = pointF8.y;
                    f19 = f73;
                    PointF pointF9 = this.V0;
                    path3.cubicTo(f74, f75, pointF9.x, pointF9.y, pointF6.x, pointF6.y);
                    path3.lineTo(pointF7.x, pointF7.y);
                    PointF pointF10 = this.W0;
                    float f76 = pointF10.x;
                    float f77 = pointF10.y;
                    PointF pointF11 = this.U0;
                    path3.cubicTo(f76, f77, pointF11.x, pointF11.y, pointF5.x, pointF5.y);
                    path3.lineTo(pointF4.x, pointF4.y);
                    paint9.setAlpha((int) (D * 255.0f));
                    canvas3.drawPath(path3, paint9);
                    float f78 = this.j0;
                    rectF3.set(f21, f78 - T12, f18, f78 + T12);
                    float f79 = f25;
                    canvas3.drawRoundRect(rectF3, f79, f79, paint9);
                } else {
                    f19 = f73;
                }
                if (i7 <= 0 || f31 > 0.0f) {
                    a10 = icVar3.a(0.2f) * f19 * f32;
                    canvas3.save();
                    path = this.O0;
                    path.rewind();
                    if (i7 > 0) {
                        path.addCircle(this.y0, this.j0, f29, Path.Direction.CW);
                    }
                    if (f31 > 0.0f && this.A0) {
                        path.addCircle(this.k0, this.j0, org.telegram.messenger.g0.L(f30) * f31 * a10, Path.Direction.CW);
                    }
                    canvas3.clipPath(path);
                    if (this.A0) {
                        canvas3.save();
                        canvas3.scale(a10, a10, this.k0, this.j0);
                        canvas3.drawCircle(this.k0, this.j0, org.telegram.messenger.g0.L(f30), paint8);
                        canvas3.rotate(-getRotation(), this.k0, this.j0);
                        this.h.draw(canvas3);
                        canvas3.restore();
                    }
                    float a14 = icVar.a(0.2f) * f32;
                    canvas3.save();
                    canvas3.scale(a14, a14, this.l0, this.j0);
                    canvas3.rotate(w5Var.e(false, this.M) - getRotation(), this.l0, this.j0);
                    canvas3.drawCircle(this.l0, this.j0, org.telegram.messenger.g0.L(f30), paint8);
                    this.e.draw(canvas3);
                    canvas3.restore();
                    canvas3.restore();
                }
                f6Var = this.W;
                if (f6Var != null) {
                    return;
                }
                boolean b10 = b();
                boolean z11 = this.a0;
                boolean z12 = this.r0;
                if (z11 == z12 && this.b0 == b10 && this.c0 == this.O && this.d0 == this.o0 && this.e0 == this.u0 && this.f0 == this.A0) {
                    return;
                }
                this.a0 = z12;
                this.b0 = b10;
                this.c0 = this.O;
                this.d0 = this.o0;
                this.e0 = this.u0;
                this.f0 = this.A0;
                f6Var.i();
                return;
            }
            f29 = f28;
        } else {
            f29 = f28;
            f30 = 22.0f;
        }
        f31 = e18;
        w5Var = w5Var2;
        icVar = icVar4;
        i7 = i12;
        f32 = f27;
        if (i7 <= 0) {
        }
        a10 = icVar3.a(0.2f) * f19 * f32;
        canvas3.save();
        path = this.O0;
        path.rewind();
        if (i7 > 0) {
        }
        if (f31 > 0.0f) {
            path.addCircle(this.k0, this.j0, org.telegram.messenger.g0.L(f30) * f31 * a10, Path.Direction.CW);
        }
        canvas3.clipPath(path);
        if (this.A0) {
        }
        float a142 = icVar.a(0.2f) * f32;
        canvas3.save();
        canvas3.scale(a142, a142, this.l0, this.j0);
        canvas3.rotate(w5Var.e(false, this.M) - getRotation(), this.l0, this.j0);
        canvas3.drawCircle(this.l0, this.j0, org.telegram.messenger.g0.L(f30), paint8);
        this.e.draw(canvas3);
        canvas3.restore();
        canvas3.restore();
        f6Var = this.W;
        if (f6Var != null) {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(100.0f);
        float f10 = size;
        this.i0 = f10 / 2.0f;
        this.j0 = L / 2.0f;
        float min = Math.min(org.telegram.messenger.g0.L(135.0f), f10 * 0.35f);
        float f11 = this.i0;
        this.k0 = f11 - min;
        float f12 = f11 + min;
        this.l0 = f12;
        float f13 = this.j0;
        float L2 = org.telegram.messenger.g0.L(14.0f);
        this.d.setBounds((int) (f12 - L2), (int) (f13 - L2), (int) (f12 + L2), (int) (f13 + L2));
        float f14 = this.l0;
        float f15 = this.j0;
        float L3 = org.telegram.messenger.g0.L(14.0f);
        this.e.setBounds((int) (f14 - L3), (int) (f15 - L3), (int) (f14 + L3), (int) (f15 + L3));
        f(this.f, this.k0, this.j0);
        f(this.h, this.k0, this.j0);
        f(this.n, this.k0, this.j0);
        this.b.y0(this.k0 - org.telegram.messenger.g0.L(20.0f), this.j0 - org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
        Matrix matrix = this.H;
        matrix.reset();
        matrix.postTranslate(this.i0, this.j0);
        this.I.setLocalMatrix(matrix);
        setMeasuredDimension(size, L);
        f6 f6Var = this.W;
        if (f6Var != null) {
            f6Var.i();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float i7 = Utilities.i(motionEvent.getX() + 0.0f, this.l0, this.k0);
        float y10 = motionEvent.getY() + 0.0f;
        boolean c10 = c(i7, y10, this.l0, this.j0, org.telegram.messenger.g0.L(7.0f), true);
        boolean z9 = this.u0;
        ic icVar = this.L;
        ic icVar2 = this.J;
        ic icVar3 = this.K;
        boolean z10 = true;
        z10 = true;
        z10 = true;
        z10 = true;
        z10 = true;
        z10 = true;
        if (z9) {
            icVar2.c(false);
            icVar3.c(false);
            icVar.c(false);
        } else if (action == 0 || this.w0) {
            icVar2.c(c(i7, y10, this.i0, this.j0, org.telegram.messenger.g0.L(60.0f), false));
            icVar3.c(c(i7, y10, this.l0, this.j0, (float) org.telegram.messenger.g0.L(30.0f), true) && !b());
            icVar.c(c(i7, y10, this.k0, this.j0, (float) org.telegram.messenger.g0.L(30.0f), false) && !b());
        }
        d6 d6Var = this.M0;
        d6 d6Var2 = this.L0;
        if (action == 0) {
            this.w0 = true;
            this.x0 = icVar2.i || icVar3.i;
            System.currentTimeMillis();
            this.y0 = i7;
            if (Math.abs(i7 - this.i0) < org.telegram.messenger.g0.L(50.0f)) {
                org.telegram.messenger.g0.i3(d6Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (icVar3.i) {
                org.telegram.messenger.g0.i3(d6Var, ViewConfiguration.getLongPressTimeout());
            }
        } else {
            if (action == 2) {
                if (this.w0) {
                    this.y0 = Utilities.i(i7, this.l0, this.k0);
                    invalidate();
                    if (this.r0 && !this.X0 && c10) {
                        d(180.0f);
                        ((r9) this.a).b();
                    }
                    if (this.r0 && this.z0) {
                        float i10 = Utilities.i(((this.j0 - org.telegram.messenger.g0.L(48.0f)) - y10) / (org.telegram.messenger.g0.q.y / 2.0f), 1.0f, 0.0f);
                        va vaVar = ((r9) this.a).a;
                        vaVar.V0.b(true, i10);
                        vaVar.i0(false);
                    }
                }
                return false;
            }
            if (action == 1 || action == 3) {
                if (this.w0) {
                    this.w0 = false;
                    this.x0 = false;
                    org.telegram.messenger.g0.r(d6Var2);
                    org.telegram.messenger.g0.r(d6Var);
                    boolean z11 = this.r0;
                    if (!z11 && icVar.i) {
                        ((r9) this.a).c();
                    } else if (z11 && this.z0) {
                        if (icVar.i) {
                            this.z0 = false;
                            this.G0.e(true, 1.0f);
                            k3 k3Var = ((r9) this.a).a.T0;
                            k3Var.a.t(id.M0(2131744661, null), true, true);
                            k3Var.invalidate();
                        } else {
                            this.r0 = false;
                            this.v0 = SystemClock.elapsedRealtime();
                            this.u0 = true;
                            ((r9) this.a).e(false);
                        }
                    } else if (icVar2.i) {
                        if (b()) {
                            ((r9) this.a).a();
                        } else if (!this.o0 && !this.r0 && !this.z0) {
                            ((r9) this.a).d();
                        } else if (this.r0) {
                            this.r0 = false;
                            this.v0 = SystemClock.elapsedRealtime();
                            this.u0 = true;
                            ((r9) this.a).e(false);
                        } else if (va.c(((r9) this.a).a)) {
                            this.R = 0L;
                            this.Q = System.currentTimeMillis();
                            this.A0 = false;
                            ((r9) this.a).f(new d6(this, z10 ? 1 : 0), false);
                        }
                    }
                    this.z0 = false;
                    if (icVar3.i) {
                        d(180.0f);
                        ((r9) this.a).b();
                    }
                    icVar2.c(false);
                    icVar3.c(false);
                    icVar.c(false);
                    invalidate();
                }
                return false;
            }
            z10 = false;
        }
        this.X0 = c10;
        return z10;
    }

    public void setDelegate(e6 e6Var) {
        this.a = e6Var;
    }

    public void setDual(boolean z9) {
        if (z9 != this.O) {
            this.O = z9;
            invalidate();
        }
    }

    @Override // fi.o2
    public void setInvert(float f10) {
        this.s.setColor(i0.a.f(f10, -1, -16777216));
        this.x.setColor(i0.a.f(f10, 1677721600, 369098752));
        this.E.setColor(i0.a.f(f10, 1493172223, 285212671));
        this.F.setColor(i0.a.f(f10, 402653184, 805306368));
        int f11 = i0.a.f(f10, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(f11, mode));
        this.f.setColorFilter(new PorterDuffColorFilter(i0.a.f(f10, -1, -16777216), mode));
    }
}
