package gi;

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
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.pe;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h6 extends View implements m2 {
    public boolean A0;
    public boolean B0;
    public final org.telegram.ui.Components.u5 C0;
    public final org.telegram.ui.Components.u5 D0;
    public final Paint E;
    public final org.telegram.ui.Components.u5 E0;
    public final Paint F;
    public final org.telegram.ui.Components.u5 F0;
    public final Paint G;
    public final org.telegram.ui.Components.u5 G0;
    public final Paint H;
    public final org.telegram.ui.Components.u5 H0;
    public final Matrix I;
    public float I0;
    public final RadialGradient J;
    public final org.telegram.ui.Components.u5 J0;
    public final gc K;
    public final org.telegram.ui.Components.u5 K0;
    public final gc L;
    public final org.telegram.ui.Components.u5 L0;
    public final gc M;
    public final d6 M0;
    public float N;
    public final d6 N0;
    public final org.telegram.ui.Components.u5 O;
    public final Path O0;
    public boolean P;
    public final Path P0;
    public final org.telegram.ui.Components.u5 Q;
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
    public e6 a;
    public final g6 a0;
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
    public boolean g0;
    public final Drawable h;
    public float h0;
    public final org.telegram.ui.Components.u5 i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public final Drawable n;
    public final org.telegram.ui.Components.u5 n0;
    public float o0;
    public boolean p0;
    public final org.telegram.ui.Components.u5 q0;
    public final Paint r;
    public final org.telegram.ui.Components.u5 r0;
    public final Paint s;
    public boolean s0;
    public final float[] t0;
    public final org.telegram.ui.Components.u5 u0;
    public boolean v0;
    public final Paint w;
    public long w0;
    public final Paint x;
    public boolean x0;
    public final Paint y;
    public boolean y0;
    public float z0;

    public h6(Activity activity) {
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
        this.E = paint5;
        Paint paint6 = new Paint(1);
        this.F = paint6;
        Paint paint7 = new Paint(1);
        this.G = paint7;
        Paint paint8 = new Paint(1);
        this.H = paint8;
        Matrix matrix = new Matrix();
        this.I = matrix;
        this.K = new gc(this);
        this.L = new gc(this);
        this.M = new gc(this);
        xq xqVar = xq.h;
        this.O = new org.telegram.ui.Components.u5(this, 0L, 310L, xqVar);
        this.Q = new org.telegram.ui.Components.u5(this, 0L, 330L, xqVar);
        this.T = new Path();
        this.U = new PointF(-org.telegram.messenger.g0.N(9.666667f), org.telegram.messenger.g0.N(2.3333333f));
        this.V = new PointF(-org.telegram.messenger.g0.N(2.8333333f), org.telegram.messenger.g0.N(8.666667f));
        this.W = new PointF(org.telegram.messenger.g0.N(9.666667f), org.telegram.messenger.g0.N(-3.6666667f));
        this.i0 = new org.telegram.ui.Components.u5(this, 0L, 200L, xq.f);
        this.n0 = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        this.o0 = -1.0f;
        this.p0 = true;
        this.q0 = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        this.r0 = new org.telegram.ui.Components.u5(this, 0L, 850L, xqVar);
        this.t0 = new float[2];
        this.u0 = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        this.C0 = new org.telegram.ui.Components.u5(this, 0L, 350L, xqVar);
        this.D0 = new org.telegram.ui.Components.u5(this, 0L, 650L, xqVar);
        this.E0 = new org.telegram.ui.Components.u5(this, 0L, 160L, xq.i);
        this.F0 = new org.telegram.ui.Components.u5(this, 0L, 750L, xqVar);
        this.G0 = new org.telegram.ui.Components.u5(this, 0L, 650L, xqVar);
        this.H0 = new org.telegram.ui.Components.u5(this, 0L, 320L, xqVar);
        this.J0 = new org.telegram.ui.Components.u5(this, 0L, 320L, xqVar);
        this.K0 = new org.telegram.ui.Components.u5(this, 0L, 320L, xqVar);
        this.L0 = new org.telegram.ui.Components.u5(this, 0L, 320L, xqVar);
        this.M0 = new d6(this, 2);
        this.N0 = new d6(this, 3);
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
        g6 g6Var = new g6(this, this);
        this.a0 = g6Var;
        r0.i0.j(this, g6Var);
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(48.0f), new int[]{-577231, -577231, -1}, new float[]{0.0f, 0.64f, 1.0f}, Shader.TileMode.CLAMP);
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
        imageReceiver.H0(this);
        imageReceiver.B0 = true;
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        Drawable mutate = activity.getResources().getDrawable(R.drawable.msg_media_gallery).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(1308622847, mode));
        xp xpVar = new xp(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(6.0f), -13750737), mutate);
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
        double d10 = f12;
        pointF.x = (float) ((Math.cos(d) * d10) + f10);
        pointF.y = (float) ((Math.sin(d) * d10) + f11);
    }

    public static void f(Drawable drawable, float f10, float f11) {
        float max = Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight()) / 2.0f;
        drawable.setBounds((int) (f10 - max), (int) (f11 - max), (int) (f10 + max), (int) (f11 + max));
    }

    public final boolean b() {
        return this.I0 >= 1.0f;
    }

    public final boolean c(float f10, float f11, float f12, float f13, float f14, boolean z10) {
        return this.s0 ? (!z10 || f13 - f11 <= ((float) org.telegram.messenger.g0.L(100.0f))) && Math.abs(f12 - f10) <= f14 : a7.h.a(f10, f11, f12, f13) <= f14;
    }

    public final void d(float f10) {
        this.O.g = f10 > 180.0f ? 620L : 310L;
        this.N += f10;
        invalidate();
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        g6 g6Var = this.a0;
        if (g6Var == null || !g6Var.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final void e(boolean z10, float f10) {
        if (Math.abs(f10 - this.I0) < 0.01f) {
            return;
        }
        this.I0 = f10;
        if (!z10) {
            this.J0.f(f10 > 0.0f && !this.s0, true);
            this.K0.e(true, f10);
        }
        invalidate();
    }

    public final void g(boolean z10) {
        this.v0 = false;
        if (!z10) {
            org.telegram.ui.Components.u5 u5Var = this.u0;
            u5Var.getClass();
            u5Var.e(true, 0.0f);
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
            ArrayList arrayList2 = hp.s1(imageReceiver.d).P1().w.b;
            imageReceiver.G0(0, 0, true);
            if (arrayList2 != null && !arrayList2.isEmpty() && ((f7) arrayList2.get(0)).O0 != null) {
                imageReceiver.r0(ac.g(((f7) arrayList2.get(0)).O0.getAbsolutePath()), "80_80", null, null, xpVar, 0L, null, null, 0);
                return;
            }
        }
        pe peVar = MediaController.a2;
        ye yeVar = (peVar == null || (arrayList = peVar.e) == null || arrayList.isEmpty()) ? null : (ye) arrayList.get(0);
        if (yeVar != null && (str = yeVar.c) != null) {
            imageReceiver.r0(ac.g(str), "80_80", null, null, xpVar, 0L, null, null, 0);
            return;
        }
        if (yeVar != null) {
            int i3 = yeVar.C;
            String str2 = yeVar.I;
            if (str2 != null) {
                if (yeVar.b) {
                    imageReceiver.r0(ac.g("vthumb://" + i3 + ":" + str2), "80_80", null, null, xpVar, 0L, null, null, 0);
                    return;
                }
                imageReceiver.G0(yeVar.J, yeVar.K, true);
                imageReceiver.r0(ac.g("thumb://" + i3 + ":" + str2), "80_80", null, null, xpVar, 0L, null, null, 0);
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
        boolean z10;
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
        org.telegram.ui.Components.u5 u5Var;
        gc gcVar;
        int i3;
        float f32;
        float a10;
        Path path;
        g6 g6Var;
        float f33;
        float f34;
        double d;
        double d10;
        float e10 = this.q0.e(false, this.s0 ? 1.0f : 0.0f);
        float e11 = this.r0.e(false, this.s0 ? 1.0f : 0.0f);
        float f35 = this.o0;
        if (f35 < 0.0f) {
            f35 = this.n0.e(false, this.p0 ? 1.0f : 0.0f);
        }
        float max = Math.max(e10, f35);
        float e12 = this.C0.e(false, this.x0 ? 1.0f : 0.0f);
        float abs = Math.abs(this.z0 - this.j0);
        float L = org.telegram.messenger.g0.L(64.0f);
        gc gcVar2 = this.K;
        float e13 = this.D0.e(false, (abs >= L || !(this.s0 || gcVar2.i)) ? 0.0f : 1.0f) * e12;
        float e14 = this.E0.e(false, Math.abs(this.z0 - this.j0) < ((float) org.telegram.messenger.g0.L(64.0f)) ? 1.0f : 0.0f) * e12;
        float i10 = Utilities.i((this.z0 - this.j0) / org.telegram.messenger.g0.L(16.0f), 1.0f, -1.0f);
        float i11 = Utilities.i((this.z0 - this.j0) / org.telegram.messenger.g0.L(64.0f), 1.0f, -1.0f);
        float e15 = this.G0.e(false, Math.min(Math.abs(this.z0 - this.m0), Math.abs(this.z0 - this.l0)) < ((float) org.telegram.messenger.g0.L(16.0f)) ? 1.0f : 0.0f) * e12;
        float f36 = 1.0f - e10;
        float d11 = this.J0.d(this.I0 > 0.0f) * f36;
        float e16 = this.K0.e(false, this.I0);
        float d12 = this.L0.d(b());
        float f37 = this.A0 ? e10 * max * e12 : 0.0f;
        if (f37 > 0.0f) {
            f13 = 1.0f;
            float L2 = this.j0 - org.telegram.messenger.g0.L(50.0f);
            f14 = 0.0f;
            float L3 = this.j0 + org.telegram.messenger.g0.L(50.0f);
            float L4 = org.telegram.messenger.g0.L(2.0f);
            Paint paint2 = this.F;
            paint2.setStrokeWidth(L4);
            float L5 = org.telegram.messenger.g0.L(2.0f);
            Paint paint3 = this.G;
            paint3.setStrokeWidth(L5);
            f16 = d11;
            float f38 = f37;
            f15 = e11;
            f11 = e15;
            f10 = e14;
            z10 = 1;
            f12 = d12;
            canvas.drawLine(L3, this.k0, org.telegram.messenger.g0.T1(L3, this.m0 - org.telegram.messenger.g0.L(30.0f), f37), this.k0, paint3);
            canvas.drawLine(L3, this.k0, org.telegram.messenger.g0.T1(L3, this.m0 - org.telegram.messenger.g0.L(30.0f), f38), this.k0, paint2);
            canvas.drawLine(L2, this.k0, org.telegram.messenger.g0.T1(L2, this.l0 + org.telegram.messenger.g0.L(30.0f), f38), this.k0, paint3);
            canvas2 = canvas;
            canvas2.drawLine(L2, this.k0, org.telegram.messenger.g0.T1(L2, this.l0 + org.telegram.messenger.g0.L(30.0f), f38), this.k0, paint2);
        } else {
            f10 = e14;
            f11 = e15;
            f12 = d12;
            f13 = 1.0f;
            f14 = 0.0f;
            f15 = e11;
            z10 = 1;
            canvas2 = canvas;
            f16 = d11;
        }
        float f39 = this.j0;
        float T1 = org.telegram.messenger.g0.T1(f39, this.F0.e(false, (org.telegram.messenger.g0.L(4.0f) * i10) + f39), e13);
        float T12 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(12.0f)), org.telegram.messenger.g0.L(32.0f) - (Math.abs(i11) * org.telegram.messenger.g0.L(4.0f)), e13);
        float W1 = org.telegram.messenger.g0.W1(e13, org.telegram.messenger.g0.W1(e10, org.telegram.messenger.g0.L(32.0f), org.telegram.messenger.g0.L(7.0f)), org.telegram.messenger.g0.L(32.0f));
        float T13 = org.telegram.messenger.g0.T1(gcVar2.a(this.p0 ? f14 : 0.2f), (this.i0.e(false, this.h0) * 0.2f) + f13, e10);
        RectF rectF4 = org.telegram.messenger.g0.P;
        float f40 = T1 - T12;
        float f41 = this.k0;
        float f42 = T1 + T12;
        rectF4.set(f40, f41 - T12, f42, f41 + T12);
        float f43 = f13 - f12;
        int f44 = i0.a.f(max * f43, -1, -577231);
        Paint paint4 = this.r;
        paint4.setColor(f44);
        if (f12 > f14) {
            canvas2.save();
            canvas2.scale(T13, T13, this.j0, this.k0);
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
            canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), hs.e4, 31);
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
        canvas2.scale(f22, f22, this.j0, this.k0);
        paint.setAlpha(hs.e4);
        canvas2.drawRoundRect(rectF, W1, W1, paint);
        if (f12 > f14) {
            float L6 = org.telegram.messenger.g0.L(4.0f);
            Paint paint5 = this.H;
            paint5.setStrokeWidth(L6);
            Path path2 = this.T;
            path2.rewind();
            PointF pointF = this.U;
            f26 = 0.7f;
            path2.moveTo(pointF.x, pointF.y);
            float f45 = pointF.x;
            PointF pointF2 = this.V;
            float f46 = f12 / 0.3f;
            f24 = 0.3f;
            rectF2 = rectF;
            f25 = W1;
            float f47 = f13;
            float f48 = f14;
            path2.lineTo(org.telegram.messenger.g0.T1(f45, pointF2.x, Utilities.i(f46, f47, f48)), org.telegram.messenger.g0.T1(pointF.y, pointF2.y, Utilities.i(f46, f47, f48)));
            if (f12 > 0.3f) {
                float f49 = pointF2.x;
                PointF pointF3 = this.W;
                float f50 = (f12 - 0.3f) / 0.7f;
                path2.lineTo(org.telegram.messenger.g0.T1(f49, pointF3.x, Utilities.i(f50, f47, f48)), org.telegram.messenger.g0.T1(pointF2.y, pointF3.y, Utilities.i(f50, f47, f48)));
            }
            canvas2.translate(this.j0, this.k0);
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
        canvas2.scale(max2, max2, this.j0, this.k0);
        float max3 = Math.max(org.telegram.messenger.g0.N(33.5f), ((1.0f - e13) * org.telegram.messenger.g0.L(5.0f) * f16) + org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(4.5f), org.telegram.messenger.g0.L(9.0f), e13) + T12);
        float W12 = org.telegram.messenger.g0.W1(f16, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(4.0f));
        float T14 = org.telegram.messenger.g0.T1(max3, (T12 - W12) - org.telegram.messenger.g0.L(4.0f), f12);
        float f51 = this.j0;
        float f52 = this.k0;
        RectF rectF5 = rectF2;
        rectF5.set(f51 - T14, f52 - T14, f51 + T14, f52 + T14);
        Paint paint6 = this.s;
        paint6.setStrokeWidth(W12);
        paint6.setAlpha((int) (org.telegram.messenger.g0.T1(1.0f, f24, f16) * 255.0f * f17));
        canvas2.drawCircle(this.j0, this.k0, T14, paint6);
        if ((e16 > 0.0f ? z10 : false) && ((f16 > 0.0f ? 1 : (f16 == 0.0f ? 0 : -1)) > 0 ? z10 : false)) {
            paint6.setAlpha(hs.e4);
            rectF3 = rectF5;
            canvas2.drawArc(rectF3, -90.0f, e16 * 360.0f, false, paint6);
        } else {
            rectF3 = rectF5;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.R;
        float f53 = this.s0 ? 0.0f : 1.0f - f15;
        long j10 = this.a != null ? 177000L : 60000L;
        float min = Math.min((currentTimeMillis / 60000) * 360.0f, 360.0f);
        float d13 = this.u0.d(this.v0);
        Paint paint7 = this.w;
        paint7.setStrokeWidth(W12);
        paint7.setAlpha((int) (Math.max(d13 * f26, 1.0f - f53) * 255.0f));
        if (d13 <= 0.0f) {
            canvas3 = canvas;
            canvas3.drawArc(rectF3, -90.0f, min, false, paint7);
        } else {
            cp.a((SystemClock.elapsedRealtime() - this.w0) % 5400, this.t0);
            invalidate();
            float[] fArr = this.t0;
            float f54 = fArr[0];
            float f55 = fArr[z10];
            float f56 = (f54 + f55) / 2.0f;
            float abs2 = Math.abs(f55 - f54) / 2.0f;
            if (this.v0) {
                float f57 = min / 2.0f;
                f56 = org.telegram.messenger.g0.T1((-90.0f) + f57, f56, d13);
                abs2 = org.telegram.messenger.g0.T1(f57, abs2, d13);
            }
            float f58 = f56 - abs2;
            float f59 = abs2 * 2.0f;
            canvas3 = canvas;
            canvas3.drawArc(rectF3, f58, f59, false, paint7);
        }
        if (this.s0) {
            invalidate();
            long j11 = currentTimeMillis / 1000;
            if (j11 != this.S / 1000) {
                ((s9) this.a).a.K0.a(j11, z10);
            }
            if (j10 > 0 && currentTimeMillis >= j10) {
                post(new d6(this, 0));
            }
            this.S = currentTimeMillis;
        }
        canvas3.restore();
        boolean z11 = this.B0;
        gc gcVar3 = this.M;
        if (z11) {
            float a11 = gcVar3.a(0.2f) * f19;
            if (a11 > 0.0f) {
                canvas3.save();
                canvas3.scale(a11, a11, this.l0, this.k0);
                canvas3.drawCircle(this.l0, this.k0, org.telegram.messenger.g0.L(22.0f), this.x);
                canvas3.rotate(-getRotation(), this.l0, this.k0);
                this.f.draw(canvas3);
                canvas3.restore();
            }
        }
        float a12 = gcVar3.a(0.2f) * f36 * f17;
        if (a12 > 0.0f) {
            canvas3.save();
            canvas3.scale(a12, a12, this.l0, this.k0);
            canvas3.rotate(-getRotation(), this.l0, this.k0);
            this.b.h(canvas3, null);
            canvas3.restore();
        }
        float e17 = this.Q.e(false, this.P ? 1.0f : 0.0f);
        Paint paint8 = this.y;
        org.telegram.ui.Components.u5 u5Var2 = this.O;
        gc gcVar4 = this.L;
        if (e17 > 0.0f) {
            canvas3.save();
            float a13 = gcVar4.a(0.2f) * e17 * f17;
            canvas3.scale(a13, a13, this.m0, this.k0);
            canvas3.rotate(u5Var2.e(false, this.N) - getRotation(), this.m0, this.k0);
            canvas3.drawCircle(this.m0, this.k0, org.telegram.messenger.g0.L(22.0f), paint8);
            this.e.draw(canvas3);
            canvas3.restore();
        }
        if (e17 < 1.0f) {
            canvas3.save();
            f27 = f17;
            float A = org.telegram.messenger.k5.A(1.0f, e17, gcVar4.a(0.2f), f27);
            canvas3.scale(A, A, this.m0, this.k0);
            canvas3.rotate(u5Var2.e(false, this.N) - getRotation(), this.m0, this.k0);
            canvas3.drawCircle(this.m0, this.k0, org.telegram.messenger.g0.L(22.0f), this.x);
            this.d.draw(canvas3);
            canvas3.restore();
        } else {
            f27 = f17;
        }
        if (!this.A0 || b()) {
            f28 = 0.0f;
        } else {
            float f60 = f11;
            f28 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.T1((Math.abs(i11) * org.telegram.messenger.g0.L(8.0f)) + org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(22.0f), f60), Math.max(f60, e13)) * f20 * f23 * f19;
        }
        float e18 = this.H0.e(false, (this.A0 || !this.s0) ? 0.0f : 1.0f);
        int i12 = (f28 > 0.0f ? 1 : (f28 == 0.0f ? 0 : -1));
        if (i12 > 0) {
            Paint paint9 = this.E;
            paint9.setAlpha(hs.e4);
            canvas3.drawCircle(this.z0, this.k0, f28, paint9);
            float f61 = this.z0;
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
                    d10 = Math.acos(((f65 + f64) - f63) / (r15 * f34));
                    d = acos;
                } else {
                    f33 = f28;
                    f34 = abs4;
                    f31 = e18;
                    d = 0.0d;
                    d10 = 0.0d;
                }
                double d14 = f61 > T1 ? 0.0d : 3.141592653589793d;
                double d15 = d;
                double acos2 = (float) Math.acos((T12 - f33) / f34);
                double d16 = acos2 - d15;
                double d17 = i13;
                double d18 = d16 * d17;
                double d19 = d14 + d15 + d18;
                double d20 = (d14 - d15) - d18;
                double d21 = ((3.141592653589793d - d10) - acos2) * d17;
                double d22 = ((d14 + 3.141592653589793d) - d10) - d21;
                double d23 = (d14 - 3.141592653589793d) + d10 + d21;
                float f66 = this.k0;
                PointF pointF4 = this.Q0;
                a(T1, f66, d19, T12, pointF4);
                float f67 = this.k0;
                PointF pointF5 = this.R0;
                a(T1, f67, d20, T12, pointF5);
                float f68 = this.k0;
                PointF pointF6 = this.S0;
                float f69 = f33;
                a(f61, f68, d22, f69, pointF6);
                float f70 = this.k0;
                PointF pointF7 = this.T0;
                i3 = i12;
                a(f61, f70, d23, f69, pointF7);
                f29 = f69;
                f32 = f27;
                u5Var = u5Var2;
                gcVar = gcVar4;
                float min2 = Math.min(1.0f, (f34 * 2.0f) / f62) * Math.min(i13 * 2.4f, a7.h.a(pointF4.x, pointF4.y, pointF6.x, pointF6.y) / f62);
                float f71 = T12 * min2;
                float f72 = f29 * min2;
                a(pointF4.x, pointF4.y, d19 - 1.5707963705062866d, f71, this.U0);
                a(pointF5.x, pointF5.y, d20 + 1.5707963705062866d, f71, this.V0);
                a(pointF6.x, pointF6.y, d22 + 1.5707963705062866d, f72, this.W0);
                a(pointF7.x, pointF7.y, d23 - 1.5707963705062866d, f72, this.X0);
                float f73 = f19;
                float C = com.google.android.recaptcha.internal.a.C(f20, f23, f73, f10);
                if (C > 0.0f) {
                    Path path3 = this.O0;
                    path3.rewind();
                    path3.moveTo(pointF4.x, pointF4.y);
                    PointF pointF8 = this.U0;
                    float f74 = pointF8.x;
                    float f75 = pointF8.y;
                    f19 = f73;
                    PointF pointF9 = this.W0;
                    path3.cubicTo(f74, f75, pointF9.x, pointF9.y, pointF6.x, pointF6.y);
                    path3.lineTo(pointF7.x, pointF7.y);
                    PointF pointF10 = this.X0;
                    float f76 = pointF10.x;
                    float f77 = pointF10.y;
                    PointF pointF11 = this.V0;
                    path3.cubicTo(f76, f77, pointF11.x, pointF11.y, pointF5.x, pointF5.y);
                    path3.lineTo(pointF4.x, pointF4.y);
                    paint9.setAlpha((int) (C * 255.0f));
                    canvas3.drawPath(path3, paint9);
                    float f78 = this.k0;
                    rectF3.set(f21, f78 - T12, f18, f78 + T12);
                    float f79 = f25;
                    canvas3.drawRoundRect(rectF3, f79, f79, paint9);
                } else {
                    f19 = f73;
                }
                if (i3 <= 0 || f31 > 0.0f) {
                    a10 = gcVar3.a(0.2f) * f19 * f32;
                    canvas3.save();
                    path = this.P0;
                    path.rewind();
                    if (i3 > 0) {
                        path.addCircle(this.z0, this.k0, f29, Path.Direction.CW);
                    }
                    if (f31 > 0.0f && this.B0) {
                        path.addCircle(this.l0, this.k0, org.telegram.messenger.g0.L(f30) * f31 * a10, Path.Direction.CW);
                    }
                    canvas3.clipPath(path);
                    if (this.B0) {
                        canvas3.save();
                        canvas3.scale(a10, a10, this.l0, this.k0);
                        canvas3.drawCircle(this.l0, this.k0, org.telegram.messenger.g0.L(f30), paint8);
                        canvas3.rotate(-getRotation(), this.l0, this.k0);
                        this.h.draw(canvas3);
                        canvas3.restore();
                    }
                    float a14 = gcVar.a(0.2f) * f32;
                    canvas3.save();
                    canvas3.scale(a14, a14, this.m0, this.k0);
                    canvas3.rotate(u5Var.e(false, this.N) - getRotation(), this.m0, this.k0);
                    canvas3.drawCircle(this.m0, this.k0, org.telegram.messenger.g0.L(f30), paint8);
                    this.e.draw(canvas3);
                    canvas3.restore();
                    canvas3.restore();
                }
                g6Var = this.a0;
                if (g6Var != null) {
                    return;
                }
                boolean b10 = b();
                boolean z12 = this.b0;
                boolean z13 = this.s0;
                if (z12 == z13 && this.c0 == b10 && this.d0 == this.P && this.e0 == this.p0 && this.f0 == this.v0 && this.g0 == this.B0) {
                    return;
                }
                this.b0 = z13;
                this.c0 = b10;
                this.d0 = this.P;
                this.e0 = this.p0;
                this.f0 = this.v0;
                this.g0 = this.B0;
                g6Var.i();
                return;
            }
            f29 = f28;
        } else {
            f29 = f28;
            f30 = 22.0f;
        }
        f31 = e18;
        u5Var = u5Var2;
        gcVar = gcVar4;
        i3 = i12;
        f32 = f27;
        if (i3 <= 0) {
        }
        a10 = gcVar3.a(0.2f) * f19 * f32;
        canvas3.save();
        path = this.P0;
        path.rewind();
        if (i3 > 0) {
        }
        if (f31 > 0.0f) {
            path.addCircle(this.l0, this.k0, org.telegram.messenger.g0.L(f30) * f31 * a10, Path.Direction.CW);
        }
        canvas3.clipPath(path);
        if (this.B0) {
        }
        float a142 = gcVar.a(0.2f) * f32;
        canvas3.save();
        canvas3.scale(a142, a142, this.m0, this.k0);
        canvas3.rotate(u5Var.e(false, this.N) - getRotation(), this.m0, this.k0);
        canvas3.drawCircle(this.m0, this.k0, org.telegram.messenger.g0.L(f30), paint8);
        this.e.draw(canvas3);
        canvas3.restore();
        canvas3.restore();
        g6Var = this.a0;
        if (g6Var != null) {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int L = org.telegram.messenger.g0.L(100.0f);
        float f10 = size;
        this.j0 = f10 / 2.0f;
        this.k0 = L / 2.0f;
        float min = Math.min(org.telegram.messenger.g0.L(135.0f), f10 * 0.35f);
        float f11 = this.j0;
        this.l0 = f11 - min;
        float f12 = f11 + min;
        this.m0 = f12;
        float f13 = this.k0;
        float L2 = org.telegram.messenger.g0.L(14.0f);
        this.d.setBounds((int) (f12 - L2), (int) (f13 - L2), (int) (f12 + L2), (int) (f13 + L2));
        float f14 = this.m0;
        float f15 = this.k0;
        float L3 = org.telegram.messenger.g0.L(14.0f);
        this.e.setBounds((int) (f14 - L3), (int) (f15 - L3), (int) (f14 + L3), (int) (f15 + L3));
        f(this.f, this.l0, this.k0);
        f(this.h, this.l0, this.k0);
        f(this.n, this.l0, this.k0);
        this.b.y0(this.l0 - org.telegram.messenger.g0.L(20.0f), this.k0 - org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
        Matrix matrix = this.I;
        matrix.reset();
        matrix.postTranslate(this.j0, this.k0);
        this.J.setLocalMatrix(matrix);
        setMeasuredDimension(size, L);
        g6 g6Var = this.a0;
        if (g6Var != null) {
            g6Var.i();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float i3 = Utilities.i(motionEvent.getX() + 0.0f, this.m0, this.l0);
        float y9 = motionEvent.getY() + 0.0f;
        boolean c2 = c(i3, y9, this.m0, this.k0, org.telegram.messenger.g0.L(7.0f), true);
        boolean z10 = this.v0;
        gc gcVar = this.M;
        gc gcVar2 = this.K;
        gc gcVar3 = this.L;
        boolean z11 = true;
        z11 = true;
        z11 = true;
        z11 = true;
        z11 = true;
        z11 = true;
        if (z10) {
            gcVar2.c(false);
            gcVar3.c(false);
            gcVar.c(false);
        } else if (action == 0 || this.x0) {
            gcVar2.c(c(i3, y9, this.j0, this.k0, org.telegram.messenger.g0.L(60.0f), false));
            gcVar3.c(c(i3, y9, this.m0, this.k0, (float) org.telegram.messenger.g0.L(30.0f), true) && !b());
            gcVar.c(c(i3, y9, this.l0, this.k0, (float) org.telegram.messenger.g0.L(30.0f), false) && !b());
        }
        d6 d6Var = this.N0;
        d6 d6Var2 = this.M0;
        if (action == 0) {
            this.x0 = true;
            this.y0 = gcVar2.i || gcVar3.i;
            System.currentTimeMillis();
            this.z0 = i3;
            if (Math.abs(i3 - this.j0) < org.telegram.messenger.g0.L(50.0f)) {
                org.telegram.messenger.g0.i3(d6Var2, ViewConfiguration.getLongPressTimeout());
            }
            if (gcVar3.i) {
                org.telegram.messenger.g0.i3(d6Var, ViewConfiguration.getLongPressTimeout());
            }
        } else {
            if (action == 2) {
                if (this.x0) {
                    this.z0 = Utilities.i(i3, this.m0, this.l0);
                    invalidate();
                    if (this.s0 && !this.Y0 && c2) {
                        d(180.0f);
                        ((s9) this.a).b();
                    }
                    if (this.s0 && this.A0) {
                        float i10 = Utilities.i(((this.k0 - org.telegram.messenger.g0.L(48.0f)) - y9) / (org.telegram.messenger.g0.q.y / 2.0f), 1.0f, 0.0f);
                        va vaVar = ((s9) this.a).a;
                        vaVar.W0.b(true, i10);
                        vaVar.i0(false);
                    }
                }
                return false;
            }
            if (action == 1 || action == 3) {
                if (this.x0) {
                    this.x0 = false;
                    this.y0 = false;
                    org.telegram.messenger.g0.r(d6Var2);
                    org.telegram.messenger.g0.r(d6Var);
                    boolean z12 = this.s0;
                    if (!z12 && gcVar.i) {
                        ((s9) this.a).c();
                    } else if (z12 && this.A0) {
                        if (gcVar.i) {
                            this.A0 = false;
                            this.H0.e(true, 1.0f);
                            i3 i3Var = ((s9) this.a).a.U0;
                            i3Var.a.t(bd.M0(2131744671, null), true, true);
                            i3Var.invalidate();
                        } else {
                            this.s0 = false;
                            this.w0 = SystemClock.elapsedRealtime();
                            this.v0 = true;
                            ((s9) this.a).e(false);
                        }
                    } else if (gcVar2.i) {
                        if (b()) {
                            ((s9) this.a).a();
                        } else if (!this.p0 && !this.s0 && !this.A0) {
                            ((s9) this.a).d();
                        } else if (this.s0) {
                            this.s0 = false;
                            this.w0 = SystemClock.elapsedRealtime();
                            this.v0 = true;
                            ((s9) this.a).e(false);
                        } else if (va.c(((s9) this.a).a)) {
                            this.S = 0L;
                            this.R = System.currentTimeMillis();
                            this.B0 = false;
                            ((s9) this.a).f(new d6(this, z11 ? 1 : 0), false);
                        }
                    }
                    this.A0 = false;
                    if (gcVar3.i) {
                        d(180.0f);
                        ((s9) this.a).b();
                    }
                    gcVar2.c(false);
                    gcVar3.c(false);
                    gcVar.c(false);
                    invalidate();
                }
                return false;
            }
            z11 = false;
        }
        this.Y0 = c2;
        return z11;
    }

    public void setDelegate(e6 e6Var) {
        this.a = e6Var;
    }

    public void setDual(boolean z10) {
        if (z10 != this.P) {
            this.P = z10;
            invalidate();
        }
    }

    @Override // gi.m2
    public void setInvert(float f10) {
        this.s.setColor(i0.a.f(f10, -1, -16777216));
        this.x.setColor(i0.a.f(f10, 1677721600, 369098752));
        this.F.setColor(i0.a.f(f10, 1493172223, 285212671));
        this.G.setColor(i0.a.f(f10, 402653184, 805306368));
        int f11 = i0.a.f(f10, -1, -16777216);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        this.d.setColorFilter(new PorterDuffColorFilter(f11, mode));
        this.f.setColorFilter(new PorterDuffColorFilter(i0.a.f(f10, -1, -16777216), mode));
    }
}
