package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class l extends FrameLayout implements tjb {
    public il0 A0;
    public boolean B0;
    public int C0;
    public final Paint D0;
    public final hb1 E;
    public final Paint E0;
    public final Drawable F;
    public final Paint F0;
    public final Drawable G;
    public final Path G0;
    public final k H;
    public final Matrix H0;
    public int I;
    public final RectF I0;
    public final RectF J;
    public final il0[] J0;
    public final RectF K;
    public final ie7 K0;
    public long L;
    public int L0;
    public final Path M;
    public int M0;
    public final float[] N;
    public boolean N0;
    public final float[] O;
    public boolean O0;
    public final lm P;
    public boolean P0;
    public final RectF Q;
    public final /* synthetic */ ChatActivityEnterView Q0;
    public il0 R;
    public final Paint S;
    public final Paint T;
    public final Paint U;
    public final lm V;
    public final lm W;
    public je5 a;
    public final lm a0;
    public je5 b;
    public final lm b0;
    public ShapeDrawable c;
    public boolean c0;
    public final Drawable d;
    public final Path d0;
    public final String e;
    public final Path e0;
    public StaticLayout f;
    public final Path f0;
    public final Paint g0;
    public float h;
    public final lm h0;
    public final lm i0;
    public final Paint j0;
    public final Paint k0;
    public final Path l0;
    public final Matrix m0;
    public final TextPaint n;
    public float n0;
    public il0 o0;
    public final RectF p0;
    public final Paint q0;
    public final Paint r;
    public final lm r0;
    public final Paint s;
    public final lm s0;
    public final lm t0;
    public int u0;
    public final int[] v0;
    public final Paint w;
    public final int[] w0;
    public final Path x;
    public bl0 x0;
    public final Paint y;
    public boolean y0;
    public il0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.Q0 = chatActivityEnterView;
        TextPaint textPaint = new TextPaint(1);
        this.n = textPaint;
        this.r = new Paint(1);
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Path();
        this.y = new Paint(1);
        this.J = new RectF();
        this.K = new RectF();
        this.M = new Path();
        this.N = new float[]{r5, r5, 0.0f, 0.0f, 0.0f, 0.0f, r5, r5};
        this.O = new float[]{0.0f, 0.0f, r3, r3, r3, r3, 0.0f, 0.0f};
        s33 s33Var = s33.h;
        this.P = new lm(this, 0L, 350L, s33Var);
        this.Q = new RectF();
        this.S = new Paint(1);
        this.T = new Paint(1);
        this.U = new Paint(1);
        this.V = new lm(this, 0L, 320L, s33Var);
        this.W = new lm(this, 0L, 260L, s33.k);
        this.a0 = new lm(this, 0L, 60L, s33Var);
        this.b0 = new lm(this, 0L, 180L, s33Var);
        this.d0 = new Path();
        this.e0 = new Path();
        this.f0 = new Path();
        this.g0 = new Paint(1);
        this.h0 = new lm(this, 0L, 220L, s33Var);
        this.i0 = new lm(this, 0L, 220L, s33Var);
        this.j0 = new Paint(1);
        this.k0 = new Paint(1);
        this.l0 = new Path();
        this.m0 = new Matrix();
        this.p0 = new RectF();
        new TextPaint(1);
        new Paint(1);
        new Paint(1);
        this.q0 = new Paint(1);
        this.r0 = new lm(this, 0L, 380L, s33Var);
        this.s0 = new lm(this, 0L, 300L, s33Var);
        this.t0 = new lm(this, 0L, 180L, s33Var);
        this.u0 = -1;
        this.v0 = new int[2];
        this.w0 = new int[2];
        this.D0 = new Paint(1);
        this.E0 = new Paint(1);
        this.F0 = new Paint(1);
        this.G0 = new Path();
        this.H0 = new Matrix();
        this.I0 = new RectF();
        this.J0 = new il0[3];
        this.K0 = new ie7((byte) 15);
        k kVar = new k(this, this);
        this.H = kVar;
        jdc.k(this, kVar);
        hb1 hb1Var = new hb1(5);
        this.E = hb1Var;
        hb1Var.setCallback(this);
        hb1Var.d(1, chatActivityEnterView.P, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(gl.N(1.7f));
        Drawable drawable = getResources().getDrawable(R.drawable.lock_round_shadow);
        chatActivityEnterView.K4 = drawable;
        zkb.x(this, drawable, bkb.Re, chatActivityEnterView.L4, PorterDuff.Mode.MULTIPLY);
        this.c = bkb.b0(gl.L(5.0f), chatActivityEnterView.F0(bkb.gg));
        textPaint.setTextSize(gl.L(14.0f));
        this.d = context.getDrawable(R.drawable.tooltip_arrow);
        this.e = k96.M0(2131745120, "SlideUpToLock");
        float L = gl.L(3.0f);
        float L2 = gl.L(3.0f);
        this.F = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.G = getResources().getDrawable(R.drawable.input_video).mutate();
        setWillNotDraw(false);
        updateColors();
    }

    public static float f() {
        float currentTimeMillis = (System.currentTimeMillis() % 2000) / 2000.0f;
        return currentTimeMillis < 0.5f ? (currentTimeMillis * 4.0f) - 1.0f : 3.0f - (currentTimeMillis * 4.0f);
    }

    private void setupHintPaint(float f) {
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.g0;
        paint.setStyle(style);
        paint.setStrokeWidth(gl.N(1.6f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        int i = bkb.c6;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        paint.setColor(gl.B(chatActivityEnterView.F0(i)) < 0.5f ? this.s.getColor() : chatActivityEnterView.F0(bkb.dg));
        paint.setAlpha((int) (Color.alpha(r4) * f));
    }

    public final void a() {
        Path path = this.d0;
        if (path.isEmpty()) {
            float N = gl.N(0.3f);
            float N2 = gl.N(3.9f) + N;
            float f = -gl.N(6.2f);
            float N3 = gl.N(6.2f);
            float N4 = gl.N(4.6f);
            path.moveTo(N2 - N4, N3);
            path.lineTo(N2, f);
            path.lineTo(N2 + N4, N3);
            float f2 = N4 * 0.6f;
            path.moveTo(N2 - f2, gl.N(2.1f));
            path.lineTo(N2 + f2, gl.N(2.1f));
            float f3 = -gl.N(0.6f);
            float N5 = N - gl.N(2.6f);
            float N6 = N - gl.N(9.2f);
            Path path2 = this.e0;
            path2.moveTo(N6, f3);
            path2.lineTo(N5, f3);
            path2.moveTo(N5 - gl.N(3.2f), f3 - gl.N(4.0f));
            path2.lineTo(N5, f3);
            path2.lineTo(N5 - gl.N(3.2f), gl.N(4.0f) + f3);
            float f4 = -gl.N(5.0f);
            float N7 = gl.N(4.0f);
            Path path3 = this.f0;
            path3.moveTo(f4, N7);
            path3.lineTo(0.0f, 0.0f);
            path3.lineTo(gl.N(5.0f), gl.N(4.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(float f, float f2, float f3, float f4, Canvas canvas) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        Canvas canvas2;
        float f12;
        int i;
        float f13;
        float f14;
        boolean z;
        float f15;
        RectF rectF;
        float f16;
        int i2;
        float f17;
        Canvas canvas3;
        int d1;
        ChatActivityEnterView chatActivityEnterView;
        int i3;
        int i4;
        float f18;
        boolean z2;
        float i5;
        ChatActivityEnterView chatActivityEnterView2 = this.Q0;
        float max = Math.max(0.0f, f3) * this.V.d(chatActivityEnterView2.q0() && !chatActivityEnterView2.g5 && chatActivityEnterView2.e5 == 0.0f && chatActivityEnterView2.v3 && !chatActivityEnterView2.h5);
        RectF rectF2 = this.Q;
        if (max <= 0.01f) {
            rectF2.setEmpty();
            return;
        }
        a();
        lm lmVar = this.W;
        lmVar.getClass();
        float max2 = Math.max(lmVar.e(false, 0.0f), this.b0.d(this.c0));
        float max3 = Math.max(this.a0.e(false, chatActivityEnterView2.w1), this.c0 ? 1.0f : 0.0f);
        float L = gl.L(36.0f);
        float f19 = L / 2.0f;
        float R1 = gl.R1(gl.L(64.0f), L, max3);
        float L2 = gl.L(79.0f);
        float L3 = ((gl.L(64.0f) - R1) / 2.0f) * 0.70710677f;
        float round = Math.round(f - L2) - L3;
        float round2 = Math.round(((f2 + gl.L(170.0f)) - L2) + f4) - L3;
        float f20 = R1 / 2.0f;
        float f21 = round2 - f20;
        float f22 = round2 + f20;
        rectF2.set(round - f20, f21, round + f20, f22);
        float max4 = ((Math.max(0.0f, max2) * 0.08f) + (0.04f * max3) + 1.0f) * ((0.4f * max) + 0.6f);
        canvas.save();
        float L4 = f2 + gl.L(170.0f) + f4;
        if (max < 0.999f) {
            f7 = 0.01f;
            f5 = L4;
            f6 = f21;
            f8 = max3;
            f12 = 0.6f;
            f10 = round2;
            f11 = max4;
            canvas2 = canvas;
            f9 = round;
            i = canvas2.saveLayerAlpha(round - R1, round2 - R1, gl.L(30.0f) + f, gl.L(30.0f) + L4, (int) (max * 255.0f));
        } else {
            f5 = L4;
            f6 = f21;
            f7 = 0.01f;
            f8 = max3;
            f9 = round;
            f10 = round2;
            f11 = max4;
            canvas2 = canvas;
            f12 = 0.6f;
            i = -1;
        }
        canvas2.scale(f11, f11, gl.R1(f9, f, f12), gl.R1(f10, f5, f12));
        int F0 = chatActivityEnterView2.F0(bkb.Oe);
        if (max2 > f7) {
            float f23 = R1 * 0.95f;
            RadialGradient radialGradient = new RadialGradient(f9, f10, f23, new int[]{bkb.p1(0.5f, F0), bkb.p1(0.16f, F0), 0}, new float[]{0.3f, 0.62f, 1.0f}, Shader.TileMode.CLAMP);
            Paint paint = this.T;
            paint.setShader(radialGradient);
            paint.setAlpha((int) (Math.min(1.0f, max2) * 255.0f));
            canvas2.drawCircle(f9, f10, f23, paint);
        }
        boolean z3 = gl.B(chatActivityEnterView2.F0(bkb.c6)) < 0.5f;
        RectF rectF3 = gl.P;
        float f24 = f9 - f19;
        float f25 = f9 + f19;
        float f26 = f6;
        rectF3.set(f24, f26, f25, f22);
        if (this.y0) {
            float f27 = f9;
            i2 = i;
            f14 = f27;
            f13 = f10;
            z = z3;
            f15 = f25;
            f16 = f26;
            f17 = f19;
            c(canvas, rectF3, f17, -45.0f, f14, f13, d(2));
            canvas3 = canvas;
            rectF = rectF3;
        } else {
            f13 = f10;
            f14 = f9;
            z = z3;
            f15 = f25;
            rectF = rectF3;
            f16 = f26;
            i2 = i;
            f17 = f19;
            canvas3 = canvas;
        }
        if (this.B0) {
            d1 = this.C0;
        } else {
            bl0 bl0Var = this.x0;
            d1 = bl0Var != null ? bl0Var.d1() : 0;
        }
        if (this.y0 || Color.alpha(d1) <= 0) {
            chatActivityEnterView = chatActivityEnterView2;
            i3 = F0;
            i4 = i2;
            f18 = max2;
        } else {
            Path path = this.l0;
            path.rewind();
            rectF.set(f24, f16, f15, f22);
            i4 = i2;
            path.addRoundRect(rectF, f17, f17, Path.Direction.CW);
            Matrix matrix = this.m0;
            chatActivityEnterView = chatActivityEnterView2;
            matrix.setRotate(-45.0f, f14, f13);
            path.transform(matrix);
            Paint paint2 = this.k0;
            paint2.setColor(0);
            i3 = F0;
            f18 = max2;
            paint2.setShadowLayer(gl.N(1.0f), 0.0f, gl.N(0.33333334f), d1);
            canvas3.drawPath(path, paint2);
        }
        canvas3.save();
        canvas3.rotate(-45.0f, f14, f13);
        rectF.set(f24, f16, f15, f22);
        if (!this.y0) {
            il0 il0Var = this.R;
            if (il0Var != null) {
                il0Var.setBounds((int) (rectF.left - gl.N(3.0f)), (int) (rectF.top - gl.N(3.0f)), (int) (gl.N(3.0f) + rectF.right), (int) (gl.N(3.0f) + rectF.bottom));
                this.R.setAlpha(kk7.d4);
                this.R.draw(canvas3);
            } else {
                canvas3.drawRoundRect(rectF, f17, f17, this.r);
            }
        }
        float i6 = Utilities.i(f18, 1.0f, 0.0f);
        if (i6 > 0.0f) {
            Paint paint3 = this.S;
            paint3.setColor(i3);
            paint3.setAlpha((int) (Color.alpha(r9) * i6));
            canvas3.drawRoundRect(rectF, f17, f17, paint3);
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint4 = this.j0;
        paint4.setStyle(style);
        paint4.setStrokeWidth(gl.N(0.66f));
        paint4.setColor(z ? 654311423 : 436207616);
        paint4.setAlpha((int) ((1.0f - i6) * Color.alpha(paint4.getColor())));
        rectF.inset(gl.N(0.33f), gl.N(0.33f));
        canvas3.drawRoundRect(rectF, f17, f17, paint4);
        canvas3.restore();
        float f28 = f20 - f17;
        Paint paint5 = this.U;
        paint5.setStyle(style);
        paint5.setStrokeWidth(gl.N(1.9f));
        paint5.setStrokeCap(Paint.Cap.ROUND);
        paint5.setStrokeJoin(Paint.Join.ROUND);
        paint5.setColor(bm2.f(i6, this.s.getColor(), -1));
        canvas3.save();
        canvas3.translate(((f28 - gl.N(2.0f)) * (-0.70710677f)) + f14, ((f28 - gl.N(2.0f)) * (-0.70710677f)) + f13);
        canvas3.drawPath(this.d0, paint5);
        lm lmVar2 = this.i0;
        float f29 = f8 * 1.4f;
        float N = gl.N(1.5f) * (1.0f - Utilities.i(f29, 1.0f, 0.0f)) * lmVar2.c;
        float f30 = (f() + 1.0f) / 2.0f;
        canvas3.translate((3.0f - (f30 * 2.0f)) * f30 * f30 * N, 0.0f);
        paint5.setStrokeWidth(gl.N(1.6f));
        canvas3.drawPath(this.e0, paint5);
        paint5.setStrokeWidth(gl.N(1.9f));
        canvas3.restore();
        if (!this.c0) {
            ChatActivityEnterView chatActivityEnterView3 = chatActivityEnterView;
            if (chatActivityEnterView3.v3 && !chatActivityEnterView3.h5) {
                z2 = true;
                i5 = (1.0f - Utilities.i(f29, 1.0f, 0.0f)) * lmVar2.d(z2);
                if (i5 > f7) {
                    setupHintPaint(i5);
                    float f31 = (f() * gl.N(2.5f)) + (-(f28 - gl.N(3.0f)));
                    canvas3.save();
                    float f32 = f31 * (-0.70710677f);
                    canvas3.translate(f14 + f32, f13 + f32);
                    canvas3.rotate(-45.0f);
                    canvas3.drawPath(this.f0, this.g0);
                    canvas3.restore();
                }
                if (i4 >= 0) {
                    canvas3.restoreToCount(i4);
                }
                canvas3.restore();
                invalidate();
            }
        }
        z2 = false;
        i5 = (1.0f - Utilities.i(f29, 1.0f, 0.0f)) * lmVar2.d(z2);
        if (i5 > f7) {
        }
        if (i4 >= 0) {
        }
        canvas3.restore();
        invalidate();
    }

    public final void c(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4, il0 il0Var) {
        byte b;
        int i = bkb.c6;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        boolean z = gl.B(chatActivityEnterView.F0(i)) < 0.5f;
        Path path = this.G0;
        path.rewind();
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        if (f2 != 0.0f) {
            Matrix matrix = this.H0;
            matrix.setRotate(f2, f3, f4);
            path.transform(matrix);
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        Paint paint = this.F0;
        paint.setColor(-16777216);
        gjc gjcVar = chatActivityEnterView.r1;
        if (gjcVar == null || (!((b = gjcVar.c) == 2 || b == 3) || gjcVar.J)) {
            paint.setShadowLayer(gl.N(8.0f), 0.0f, gl.N(2.0f), bkb.p1((z ? 0.4f : 0.16f) * 1.0f, -16777216));
        } else {
            paint.setShadowLayer(gl.N(1.2f), 0.0f, 0.0f, bkb.p1((z ? 0.36f : 0.12f) * 1.0f, -16777216));
        }
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.save();
        canvas.clipPath(path);
        if (il0Var != null) {
            RectF rectF2 = this.I0;
            path.computeBounds(rectF2, true);
            il0Var.setBounds(((int) rectF2.left) - gl.L(3.0f), ((int) rectF2.top) - gl.L(3.0f), gl.L(3.0f) + ((int) rectF2.right), gl.L(3.0f) + ((int) rectF2.bottom));
            il0Var.setAlpha(kk7.d4);
            il0Var.draw(canvas);
        }
        int i2 = z ? -1943655888 : -989855745;
        Paint paint2 = this.D0;
        paint2.setColor(i2);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * 1.0f));
        canvas.drawPaint(paint2);
        canvas.restore();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.E0;
        paint3.setStyle(style);
        paint3.setStrokeWidth(Math.max(1.0f, gl.N(0.5f)));
        paint3.setColor(z ? 620756991 : 385875968);
        paint3.setAlpha((int) (Color.alpha(paint3.getColor()) * 1.0f));
        canvas.drawPath(path, paint3);
    }

    public final il0 d(int i) {
        kl0 kl0Var = this.Q0.L1;
        if (kl0Var == null) {
            return null;
        }
        il0[] il0VarArr = this.J0;
        if (il0VarArr[i] == null) {
            il0 c = kl0Var.c(this, this.K0, false);
            il0VarArr[i] = c;
            c.r(0.0f);
            il0VarArr[i].X = 0.0f;
        }
        return il0VarArr[i];
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent) || this.H.f(motionEvent);
    }

    public final void e() {
        je5 je5Var = this.a;
        byte b = 1;
        if (je5Var != null) {
            je5Var.r0 = new iy1(this, je5Var, b);
            je5Var.f(true);
            this.a = null;
        }
        je5 je5Var2 = this.b;
        if (je5Var2 != null) {
            je5Var2.r0 = new iy1(this, je5Var2, (byte) 2);
            je5Var2.f(true);
            this.b = null;
        }
    }

    public final int g(float f, float f2) {
        RectF rectF = this.p0;
        if (!rectF.isEmpty() && this.r0.c >= 0.8f) {
            RectF rectF2 = gl.P;
            rectF2.set(rectF);
            rectF2.inset(-gl.L(6.0f), -gl.L(6.0f));
            if (rectF2.contains(f, f2)) {
                return 0;
            }
        }
        return -1;
    }

    public final void h() {
        e();
        je5 je5Var = new je5(getContext(), 2);
        this.b = je5Var;
        je5Var.n(1.0f, 0.0f);
        je5 je5Var2 = this.b;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        chatActivityEnterView.setHintGlass(je5Var2);
        this.b.p(true);
        boolean z = chatActivityEnterView.d1;
        boolean z2 = chatActivityEnterView.P;
        this.b.t(gl.S2(k96.M0(z ? z2 ? 2131743340 : 2131743341 : z2 ? 2131743268 : 2131743269, null)));
        je5 je5Var3 = this.b;
        je5Var3.h = je5.a(je5Var3.getText(), this.b.getTextPaint());
        boolean z3 = chatActivityEnterView.P;
        byte b = 0;
        if (z3) {
            je5 je5Var4 = this.b;
            je5Var4.getClass();
            oy8 oy8Var = new oy8(R.raw.fire_on, gl.L(34.0f), gl.L(34.0f));
            oy8Var.start();
            je5Var4.l(oy8Var);
        } else {
            na7.c1().edit().putInt("voiceoncehint", na7.c1().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.b, nme.d(-1, -1.0f, kk7.D1, 0.0f, 0.0f, 54.0f, 58.0f));
        je5 je5Var5 = this.b;
        je5Var5.r0 = new iy1(this, je5Var5, b);
        je5Var5.v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:233:0x01fa, code lost:
    
        if (r13.V4 != 0.0f) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x08ac  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0937  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x09d9  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0ad2  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0ad4  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0ab7  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04ed  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float L;
        float L2;
        float e;
        float f3;
        float f4;
        long j;
        int i;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        int i2;
        float f14;
        boolean z;
        RectF rectF;
        float f15;
        int i3;
        float f16;
        float f17;
        float f18;
        char c;
        l lVar;
        float f19;
        Paint paint;
        Canvas canvas2;
        je5 je5Var;
        RectF rectF2;
        float interpolation;
        float i4;
        float f20;
        RectF rectF3;
        float f21;
        Drawable drawable;
        float f22;
        Paint paint2;
        RectF rectF4;
        float i5;
        boolean z2;
        l lVar2;
        Canvas canvas3;
        float e2;
        RectF rectF5;
        RectF rectF6;
        cw1 cw1Var;
        float f23;
        float f24;
        int i6;
        j92 C0;
        il0 il0Var;
        al0 al0Var;
        boolean z3 = this.B0;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        if (!z3 && chatActivityEnterView.L1 != null && (C0 = chatActivityEnterView.C0()) != null && (il0Var = C0.n) != null && (al0Var = il0Var.w) != null) {
            il0 c2 = chatActivityEnterView.L1.c(this, al0Var, false);
            this.z0 = c2;
            c2.r(gl.L(18.0f));
            this.z0.q(gl.L(3.0f));
            this.z0.X = 0.0f;
            il0 c3 = chatActivityEnterView.L1.c(this, al0Var, false);
            this.A0 = c3;
            c3.r(gl.L(18.0f));
            this.A0.q(gl.L(3.0f));
            this.A0.X = 0.0f;
            il0 c4 = chatActivityEnterView.L1.c(this, al0Var, false);
            this.R = c4;
            c4.r(0.0f);
            il0 il0Var2 = this.R;
            il0Var2.X = 0.0f;
            il0Var2.q(gl.L(3.0f));
            this.C0 = al0Var.d1();
            this.B0 = true;
        }
        float f25 = chatActivityEnterView.W4;
        float f26 = f25 <= 0.5f ? f25 / 0.5f : f25 <= 0.75f ? 1.0f - (((f25 - 0.5f) / 0.25f) * 0.1f) : (((f25 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        long currentTimeMillis = System.currentTimeMillis() - this.L;
        this.L = System.currentTimeMillis();
        float f27 = chatActivityEnterView.a5;
        if (f27 != 10000.0f) {
            float max = Math.max(0.0f, chatActivityEnterView.Z4 - f27);
            float L3 = gl.L(5.0f);
            if (max <= L3) {
                f = 5.0f;
                f2 = 0.0f;
            } else {
                f = 5.0f;
                f2 = Math.round(((max - L3) * gl.L(57.0f)) / (gl.L(57.0f) - L3));
            }
            if (f2 > gl.L(57.0f)) {
                f2 = gl.L(57.0f);
            }
        } else {
            f = 5.0f;
            f2 = 0.0f;
        }
        int measuredWidth = getMeasuredWidth() - gl.M(26.0f);
        float L4 = 1.0f - (f2 / gl.L(57.0f));
        float measuredHeight = getMeasuredHeight() - gl.L(194.0f);
        if (chatActivityEnterView.h5) {
            L = gl.L(36.0f);
            L2 = oo1.e(14.0f, L4, (((1.0f - f26) * gl.N(30.0f)) + (gl.L(60.0f) + measuredHeight)) - f2);
            e = gl.N(2.0f) + (((L / 2.0f) + L2) - gl.N(8.0f));
            float f28 = L4 > 0.4f ? 1.0f : L4 / 0.4f;
            float f29 = chatActivityEnterView.c5;
            f3 = ls6.B(1.0f, f28, f29 * 15.0f, (1.0f - L4) * 9.0f * (1.0f - f29));
            f4 = L4;
        } else {
            L = gl.L(36.0f) + ((int) (gl.L(28.0f) * L4));
            L2 = (((gl.L(60.0f) - (gl.L(14.0f) * L4)) + measuredHeight) + ((int) ((1.0f - f26) * gl.L(30.0f)))) - ((int) f2);
            e = oo1.e(2.0f, L4, gl.N(2.0f) + (((L / 2.0f) + L2) - gl.N(8.0f))) - (gl.N(10.0f) * L4);
            f3 = (1.0f - L4) * 9.0f;
            chatActivityEnterView.c5 = 0.0f;
            f4 = 0.0f;
        }
        float f30 = e;
        float f31 = L2;
        float f32 = f3;
        boolean z4 = chatActivityEnterView.T4;
        RectF rectF7 = this.J;
        if (z4) {
            j = currentTimeMillis;
            i = 2;
            if (System.currentTimeMillis() - chatActivityEnterView.U4 > 200) {
                f5 = 0.0f;
                if (L4 < 0.8f || chatActivityEnterView.h5 || chatActivityEnterView.b5 != f5 || chatActivityEnterView.e5 != f5) {
                    chatActivityEnterView.T4 = false;
                }
                boolean z5 = chatActivityEnterView.T4;
                float f33 = chatActivityEnterView.V4;
                if (z5) {
                    i6 = i;
                    if (f33 != 1.0f) {
                        float f34 = (j / 150.0f) + f33;
                        chatActivityEnterView.V4 = f34;
                        if (f34 >= 1.0f) {
                            chatActivityEnterView.V4 = 1.0f;
                            boolean z6 = gba.a;
                            SharedPreferences.Editor edit = na7.c1().edit();
                            int i7 = gba.N + 1;
                            gba.N = i7;
                            edit.putInt("lockRecordAudioVideoHint", i7);
                            edit.apply();
                        }
                    }
                } else {
                    i6 = i;
                    float f35 = f33 - (j / 150.0f);
                    chatActivityEnterView.V4 = f35;
                    if (f35 < 0.0f) {
                        chatActivityEnterView.V4 = 0.0f;
                    }
                }
                int i8 = (int) (chatActivityEnterView.V4 * 255.0f);
                this.c.setAlpha(i8);
                Drawable drawable2 = this.d;
                drawable2.setAlpha(i8);
                this.n.setAlpha(i8);
                if (this.f != null) {
                    canvas.save();
                    f8 = 1.0f;
                    rectF7.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.translate((getMeasuredWidth() - this.h) - gl.L(44.0f), gl.N(16.0f) + measuredHeight);
                    f6 = measuredHeight;
                    f7 = L;
                    this.c.setBounds(-gl.L(8.0f), -gl.L(2.0f), (int) (this.h + gl.L(36.0f)), (int) (gl.N(4.0f) + this.f.getHeight()));
                    this.c.draw(canvas);
                    this.f.draw(canvas);
                    canvas.restore();
                    canvas.save();
                    canvas.translate(getMeasuredWidth() - gl.L(26.0f), ((this.f.getHeight() / 2.0f) + (gl.N(17.0f) + f6)) - (gl.N(3.0f) * chatActivityEnterView.d5));
                    Path path = this.x;
                    path.reset();
                    path.setLastPoint(-gl.N(f), gl.N(4.0f));
                    path.lineTo(0.0f, 0.0f);
                    path.lineTo(gl.N(f), gl.N(4.0f));
                    Paint paint3 = this.y;
                    paint3.setColor(-1);
                    paint3.setAlpha(i8);
                    paint3.setStyle(Paint.Style.STROKE);
                    paint3.setStrokeCap(Paint.Cap.ROUND);
                    paint3.setStrokeJoin(Paint.Join.ROUND);
                    paint3.setStrokeWidth(gl.N(1.5f));
                    canvas.drawPath(path, paint3);
                    canvas.restore();
                    canvas.save();
                    drawable2.setBounds(measuredWidth - (drawable2.getIntrinsicWidth() / 2), (int) (gl.N(20.0f) + this.f.getHeight() + f6), oo1.w(i6, measuredWidth, drawable2), drawable2.getIntrinsicHeight() + ((int) (gl.N(20.0f) + this.f.getHeight() + f6)));
                    drawable2.draw(canvas);
                    canvas.restore();
                    float d = this.P.d(!chatActivityEnterView.d1 && chatActivityEnterView.Y1 >= 59000);
                    f9 = chatActivityEnterView.e5;
                    if (f9 != 0.0f || chatActivityEnterView.i1 == null) {
                        f10 = chatActivityEnterView.b5;
                        if (f10 == 0.0f) {
                            float f36 = f10 > 0.6f ? f8 : f10 / 0.6f;
                            if (!chatActivityEnterView.h0) {
                                f10 = oo1.f(f10, 0.6f, 0.4f, 0.0f);
                            }
                            s33 s33Var = s33.j;
                            float interpolation2 = s33Var.getInterpolation(f36);
                            f11 = s33Var.getInterpolation(f10);
                            f12 = interpolation2;
                        } else {
                            f11 = 0.0f;
                            f12 = 0.0f;
                        }
                    } else {
                        float f37 = f9 > 0.38f ? f8 : f9 / 0.38f;
                        if (f9 > 0.63f) {
                            f24 = f8;
                            f23 = 0.0f;
                        } else {
                            f23 = 0.0f;
                            f24 = oo1.f(f9, 0.38f, 0.25f, 0.0f);
                        }
                        s33 s33Var2 = s33.j;
                        float interpolation3 = s33Var2.getInterpolation(f37);
                        s33Var2.getInterpolation(f24);
                        f11 = f23;
                        f12 = interpolation3;
                    }
                    if (chatActivityEnterView.l1) {
                        post(new uv1(chatActivityEnterView, (byte) 18));
                    }
                    canvas.save();
                    float measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight() - chatActivityEnterView.p2.getMeasuredHeight();
                    if (chatActivityEnterView.K1 || !chatActivityEnterView.Q5 || (cw1Var = chatActivityEnterView.f1) == null || cw1Var.getVisibility() != 0) {
                        f13 = f11;
                        i2 = 0;
                    } else {
                        f13 = f11;
                        i2 = b00.c(44.0f, chatActivityEnterView.o2.getMeasuredHeight(), 0);
                    }
                    canvas.clipRect(0.0f, 0.0f, measuredWidth2, (measuredHeight2 + i2) - chatActivityEnterView.l7);
                    float f38 = f8 - chatActivityEnterView.X4;
                    float f39 = f38 == 0.0f ? f38 : f13 != 0.0f ? f13 : 0.0f;
                    if (chatActivityEnterView.Y4 >= 0.7f || chatActivityEnterView.g5) {
                        chatActivityEnterView.T4 = false;
                        f14 = chatActivityEnterView.f5;
                        if (f14 != 0.0f) {
                            float f40 = f14 - 0.12f;
                            chatActivityEnterView.f5 = f40;
                            if (f40 < 0.0f) {
                                chatActivityEnterView.f5 = 0.0f;
                            }
                        }
                    } else {
                        float f41 = chatActivityEnterView.f5;
                        if (f41 != f8) {
                            float f42 = f41 + 0.12f;
                            chatActivityEnterView.f5 = f42;
                            if (f42 > f8) {
                                chatActivityEnterView.f5 = f8;
                            }
                        }
                    }
                    float N = gl.N(72.0f);
                    float A = tb4.A(1.0f, f39, gl.N(24.0f) * f12, N * f39);
                    float f43 = chatActivityEnterView.f5;
                    float A2 = tb4.A(1.0f, f43, N, A);
                    float f44 = A2 <= N ? N : A2;
                    float f45 = 1.0f - d;
                    float f46 = 1.0f - f13;
                    float f47 = chatActivityEnterView.X4 * f45 * f46 * f43;
                    float f48 = measuredWidth;
                    float f49 = f30 + f44;
                    canvas.scale(f47, f47, f48, f49);
                    float f50 = f31 + f44;
                    float f51 = f50 + f7;
                    rectF7.set(f48 - gl.N(18.0f), f50, gl.N(18.0f) + f48, f51);
                    z = this.y0;
                    Paint paint4 = this.r;
                    if (z) {
                        rectF = rectF7;
                        f15 = f51;
                        i3 = measuredWidth;
                        f16 = d;
                        f17 = 2.0f;
                        f18 = 0.4f;
                        c = 2;
                        lVar = this;
                        f19 = f48;
                        paint = paint4;
                        canvas2 = canvas;
                        il0 il0Var3 = lVar.z0;
                        if (il0Var3 != null) {
                            il0Var3.setBounds((int) (rectF.left - gl.N(3.0f)), (int) (rectF.top - gl.N(3.0f)), (int) (gl.N(3.0f) + rectF.right), (int) (gl.N(3.0f) + rectF.bottom));
                            lVar.z0.draw(canvas2);
                        } else {
                            chatActivityEnterView.K4.setBounds((int) (rectF.left - gl.N(3.0f)), (int) (rectF.top - gl.N(3.0f)), (int) (gl.N(3.0f) + rectF.right), (int) (gl.N(3.0f) + rectF.bottom));
                            chatActivityEnterView.K4.draw(canvas2);
                            canvas2.drawRoundRect(rectF, gl.N(18.0f), gl.N(18.0f), paint);
                        }
                    } else {
                        i3 = measuredWidth;
                        f15 = f51;
                        f16 = d;
                        f17 = 2.0f;
                        paint = paint4;
                        f18 = 0.4f;
                        c = 2;
                        f19 = f48;
                        c(canvas, rectF7, gl.N(18.0f), 0.0f, 0.0f, 0.0f, d(0));
                        lVar = this;
                        canvas2 = canvas;
                        rectF = rectF7;
                    }
                    chatActivityEnterView.H4.set(rectF);
                    RectF rectF8 = chatActivityEnterView.H4;
                    float centerX = rectF8.centerX();
                    float centerY = rectF8.centerY();
                    rectF8.left = gl.R1(centerX, rectF8.left, f47);
                    rectF8.right = gl.R1(centerX, rectF8.right, f47);
                    rectF8.top = gl.R1(centerY, rectF8.top, f47);
                    rectF8.bottom = gl.R1(centerY, rectF8.bottom, f47);
                    je5Var = lVar.a;
                    if (je5Var != null) {
                        je5Var.o(0.0f, rectF.centerY());
                        lVar.a.invalidate();
                    }
                    float f52 = 1.0f - f4;
                    float f53 = f17;
                    rectF.set((f19 - gl.N(6.0f)) - (gl.N(f17) * f52), f49 - (gl.N(f17) * f52), oo1.e(f53, f52, gl.L(6.0f) + i3), oo1.e(f53, f52, f49 + gl.L(12.0f)));
                    float f54 = rectF.bottom;
                    float centerX2 = rectF.centerX();
                    float centerY2 = rectF.centerY();
                    canvas2.save();
                    float i9 = Utilities.i(Math.max(chatActivityEnterView.e5, chatActivityEnterView.A6) * f53, 1.0f, 0.0f);
                    Paint paint5 = lVar.s;
                    int alpha = paint5.getAlpha();
                    rectF2 = rectF;
                    float f55 = f12;
                    Paint paint6 = paint;
                    Canvas canvas4 = canvas;
                    int saveLayerAlpha = canvas4.saveLayerAlpha(centerX2 - gl.L(24.0f), centerY2 - gl.L(24.0f), gl.L(24.0f) + centerX2, gl.L(24.0f) + centerY2, (int) (alpha * (1.0f - i9)), 31);
                    Paint paint7 = lVar.w;
                    paint7.setAlpha(kk7.d4);
                    paint5.setAlpha(kk7.d4);
                    float f56 = 1.0f - L4;
                    canvas4.translate(0.0f, gl.N(2.0f) * f56);
                    canvas4.rotate(f32, centerX2, centerY2);
                    interpolation = s33.j.getInterpolation(Utilities.i(f4, 1.0f, 0.0f));
                    i4 = Utilities.i(interpolation / f18, 1.0f, 0.0f);
                    float interpolation4 = s33.g.getInterpolation(Utilities.i((interpolation - 0.3f) / 0.7f, 1.0f, 0.0f));
                    float i10 = 1.0f - Utilities.i((interpolation - 0.15f) / 0.7f, 1.0f, 0.0f);
                    if (interpolation < 1.0f || i10 <= 0.0f) {
                        f20 = L4;
                        rectF3 = rectF2;
                        f21 = 0.0f;
                    } else {
                        RectF rectF9 = gl.P;
                        rectF9.set(0.0f, 0.0f, gl.N(8.0f), gl.N(8.0f));
                        canvas4.save();
                        float e3 = oo1.e(2.0f, f56, f44 + f54);
                        float measuredWidth3 = lVar.getMeasuredWidth();
                        if (f4 > 0.0f) {
                            e3 = Math.min(e3, gl.N(0.5f) + rectF2.top);
                        }
                        canvas4.clipRect(0.0f, 0.0f, measuredWidth3, e3);
                        float N2 = gl.N(1.75f) * lVar.n0;
                        float f57 = (f() + 1.0f) / 2.0f;
                        float f58 = (3.0f - (f57 * 2.0f)) * f57 * f57 * N2;
                        canvas4.translate(f19 - gl.N(4.0f), ((gl.N(2.0f) * chatActivityEnterView.c5) + oo1.e(11.0f, interpolation, (rectF2.top - gl.L(6.0f)) - gl.R1(gl.N(2.0f), gl.N(1.5f), L4))) - f58);
                        if (f32 > 0.0f) {
                            canvas4.rotate(f32, gl.L(8.0f), gl.L(8.0f));
                        }
                        paint7.setAlpha((int) (i10 * 255.0f));
                        rectF3 = rectF2;
                        f20 = L4;
                        canvas4.drawLine(gl.N(8.0f), gl.N(4.0f), gl.N(8.0f), ((1.0f - interpolation) * gl.N(4.0f)) + gl.N(6.0f) + f58, paint7);
                        canvas.drawArc(rectF9, 0.0f, -180.0f, false, paint7);
                        canvas4 = canvas;
                        canvas4.drawLine(0.0f, gl.N(4.0f), 0.0f, b00.w(gl.N(4.0f), chatActivityEnterView.c5, f56, gl.N(4.0f)), paint7);
                        paint7.setAlpha(kk7.d4);
                        canvas4.restore();
                        f21 = 0.0f;
                    }
                    Drawable drawable3 = lVar.F;
                    drawable = i9 <= f21 ? chatActivityEnterView.d1 ? lVar.G : drawable3 : null;
                    if (f4 <= f21) {
                        if (lVar.A0 == null) {
                            paint2 = paint6;
                            rectF4 = rectF3;
                            canvas4.drawRoundRect(rectF4, gl.N(3.0f), gl.N(3.0f), paint2);
                        } else {
                            paint2 = paint6;
                            rectF4 = rectF3;
                        }
                        float N3 = gl.N(1.66f) * interpolation4;
                        f22 = 1.66f;
                        float R1 = gl.R1(gl.N(3.0f), gl.N(1.5f), interpolation);
                        float N4 = gl.N(1.5f) * interpolation4;
                        Path path2 = lVar.M;
                        path2.rewind();
                        RectF rectF10 = gl.P;
                        rectF10.set(rectF4);
                        rectF10.right = rectF4.centerX() - N3;
                        float[] fArr = lVar.N;
                        fArr[7] = R1;
                        fArr[6] = R1;
                        fArr[1] = R1;
                        fArr[0] = R1;
                        fArr[5] = N4;
                        fArr[4] = N4;
                        fArr[3] = N4;
                        fArr[c] = N4;
                        Path.Direction direction = Path.Direction.CW;
                        path2.addRoundRect(rectF10, fArr, direction);
                        rectF10.set(rectF4);
                        rectF10.left = rectF4.centerX() + N3;
                        float[] fArr2 = lVar.O;
                        fArr2[5] = R1;
                        fArr2[4] = R1;
                        fArr2[3] = R1;
                        fArr2[c] = R1;
                        fArr2[7] = N4;
                        fArr2[6] = N4;
                        fArr2[1] = N4;
                        fArr2[0] = N4;
                        path2.addRoundRect(rectF10, fArr2, direction);
                        canvas4.drawPath(path2, paint5);
                    } else {
                        f22 = 1.66f;
                        paint2 = paint6;
                        rectF4 = rectF3;
                        canvas4.drawRoundRect(rectF4, gl.N(3.0f), gl.N(3.0f), paint5);
                    }
                    if (i4 < 1.0f) {
                        canvas4.drawCircle(rectF4.centerX(), rectF4.centerY(), (1.0f - i4) * gl.N(2.0f), paint2);
                    }
                    paint5.setAlpha(alpha);
                    paint7.setAlpha(alpha);
                    canvas4.restoreToCount(saveLayerAlpha);
                    if (drawable != null) {
                        Rect rect = gl.Q;
                        rect.set((int) (rectF4.centerX() - ((drawable.getIntrinsicWidth() / 2) * 0.9285f)), (int) (rectF4.centerY() - ((drawable.getIntrinsicHeight() / 2) * 0.9285f)), (int) (((drawable.getIntrinsicWidth() / 2) * 0.9285f) + rectF4.centerX()), (int) (((drawable.getIntrinsicHeight() / 2) * 0.9285f) + rectF4.centerY()));
                        drawable.setBounds(rect);
                        drawable.setAlpha((int) (i9 * 255.0f));
                        drawable.draw(canvas4);
                    }
                    i5 = Utilities.i((f20 - 0.55f) / 0.45f, 1.0f, 0.0f) * lVar.h0.d((chatActivityEnterView.r0() || chatActivityEnterView.h5 || chatActivityEnterView.x1 || chatActivityEnterView.g5 || chatActivityEnterView.e5 != 0.0f || !chatActivityEnterView.v3) ? false : true);
                    lVar.n0 = i5;
                    if (i5 > 0.01f) {
                        lVar.a();
                        lVar.setupHintPaint(i5);
                        canvas4.save();
                        canvas4.translate(Math.round(f19), (f15 - gl.L(17.0f)) - (f() * gl.N(2.5f)));
                        canvas4.drawPath(lVar.f0, lVar.g0);
                        canvas4.restore();
                        lVar.invalidate();
                    }
                    canvas4.restore();
                    canvas4.restore();
                    Canvas canvas5 = canvas4;
                    RectF rectF11 = rectF4;
                    l lVar3 = lVar;
                    float f59 = f44;
                    lVar3.b(f19, f6, f45 * chatActivityEnterView.X4 * f46 * chatActivityEnterView.f5, f59, canvas5);
                    float L5 = (gl.L(38.0f) * f16) + gl.R1(f31, lVar3.getMeasuredHeight() - gl.L(118.0f), Math.max(chatActivityEnterView.b5, Math.min(f55, chatActivityEnterView.f5))) + f59;
                    rectF11.set(f19 - gl.N(18.0f), L5, gl.N(18.0f) + f19, L5 + f7);
                    hy1 hy1Var = chatActivityEnterView.P3;
                    z2 = hy1Var == null && hy1Var.H0() && !chatActivityEnterView.g0();
                    chatActivityEnterView.Q = z2;
                    if (z2) {
                        lVar2 = lVar3;
                        canvas3 = canvas5;
                    } else {
                        float N5 = gl.N(12.0f);
                        rectF11.set(rectF11.left, (rectF11.top - gl.N(36.0f)) - N5, rectF11.right, rectF11.top - N5);
                        je5 je5Var2 = lVar3.b;
                        if (je5Var2 != null) {
                            je5Var2.o(0.0f, rectF11.centerY());
                            lVar3.b.invalidate();
                        }
                        lVar3.K.set(rectF11);
                        canvas5.save();
                        float f60 = (1.0f - chatActivityEnterView.b5) * chatActivityEnterView.X4 * chatActivityEnterView.f5 * chatActivityEnterView.c5;
                        canvas5.scale(f60, f60, rectF11.centerX(), rectF11.centerY());
                        if (lVar3.y0) {
                            rectF6 = rectF11;
                            lVar3.c(canvas5, rectF6, gl.N(18.0f), 0.0f, 0.0f, 0.0f, lVar3.d(1));
                            lVar2 = lVar3;
                            canvas3 = canvas5;
                        } else {
                            lVar2 = lVar3;
                            canvas3 = canvas5;
                            rectF6 = rectF11;
                            il0 il0Var4 = lVar2.A0;
                            if (il0Var4 != null) {
                                il0Var4.setBounds((int) (rectF6.left - gl.N(3.0f)), (int) (rectF6.top - gl.N(3.0f)), (int) (gl.N(3.0f) + rectF6.right), (int) (gl.N(3.0f) + rectF6.bottom));
                                lVar2.A0.draw(canvas3);
                            } else {
                                chatActivityEnterView.K4.setBounds((int) (rectF6.left - gl.N(3.0f)), (int) (rectF6.top - gl.N(3.0f)), (int) (gl.N(3.0f) + rectF6.right), (int) (gl.N(3.0f) + rectF6.bottom));
                                chatActivityEnterView.K4.draw(canvas3);
                                canvas3.drawRoundRect(rectF6, gl.N(18.0f), gl.N(18.0f), paint2);
                            }
                        }
                        int i11 = (int) rectF6.left;
                        int i12 = (int) rectF6.top;
                        int i13 = (int) rectF6.right;
                        int i14 = (int) rectF6.bottom;
                        hb1 hb1Var = lVar2.E;
                        hb1Var.setBounds(i11, i12, i13, i14);
                        hb1Var.draw(canvas3);
                        canvas3.restore();
                    }
                    lm lmVar = lVar2.r0;
                    lmVar.getClass();
                    e2 = lmVar.e(false, 0.0f);
                    RectF rectF12 = chatActivityEnterView.H4;
                    float d2 = lVar2.s0.d(chatActivityEnterView.U1);
                    float d3 = lVar2.t0.d(lVar2.u0 < 0);
                    rectF5 = lVar2.p0;
                    if (e2 > 0.0f || rectF12.isEmpty()) {
                        rectF5.setEmpty();
                    } else {
                        float width = rectF12.width();
                        float measuredWidth4 = lVar2.getMeasuredWidth() - rectF12.right;
                        rectF5.set(measuredWidth4, rectF12.top, width + measuredWidth4, rectF12.bottom);
                        float R12 = (1.0f - (d3 * 0.06f)) * gl.R1(0.6f, 1.0f, e2);
                        canvas3.save();
                        canvas3.scale(R12, R12, rectF5.centerX(), rectF5.centerY());
                        float f61 = e2 * 255.0f;
                        int i15 = (int) f61;
                        il0 il0Var5 = lVar2.o0;
                        if (il0Var5 != null) {
                            il0Var5.setBounds((int) (rectF5.left - gl.N(3.0f)), (int) (rectF5.top - gl.N(3.0f)), (int) (gl.N(3.0f) + rectF5.right), (int) (gl.N(3.0f) + rectF5.bottom));
                            lVar2.o0.setAlpha(i15);
                            lVar2.o0.draw(canvas3);
                        } else {
                            int alpha2 = paint2.getAlpha();
                            paint2.setAlpha((int) (alpha2 * e2));
                            canvas3.drawRoundRect(rectF5, rectF5.width() / 2.0f, rectF5.width() / 2.0f, paint2);
                            paint2.setAlpha(alpha2);
                        }
                        float centerX3 = rectF5.centerX();
                        float centerY3 = rectF5.centerY();
                        if (d2 < 1.0f) {
                            Paint.Style style = Paint.Style.STROKE;
                            Paint paint8 = lVar2.q0;
                            paint8.setStyle(style);
                            paint8.setStrokeWidth(gl.N(f22));
                            paint8.setStrokeCap(Paint.Cap.ROUND);
                            paint8.setStrokeJoin(Paint.Join.ROUND);
                            paint8.setColor(paint5.getColor());
                            paint8.setAlpha((int) ((1.0f - d2) * Color.alpha(paint5.getColor()) * e2));
                            canvas3.save();
                            float R13 = gl.R1(1.0f, 0.6f, d2);
                            canvas3.scale(R13, R13, centerX3, centerY3);
                            float N6 = gl.N(3.6f) + centerX3;
                            float N7 = centerY3 - gl.N(5.85f);
                            float N8 = gl.N(5.85f) + centerY3;
                            float N9 = gl.N(4.3f);
                            canvas3.drawLine(N6 - N9, N8, N6, N7, paint8);
                            canvas.drawLine(N6, N7, N6 + N9, N8, paint8);
                            float f62 = N9 * 0.6f;
                            canvas.drawLine(N6 - f62, gl.N(1.9f) + centerY3, N6 + f62, gl.N(1.9f) + centerY3, paint8);
                            float N10 = centerY3 - gl.N(0.6f);
                            float N11 = centerX3 - gl.N(2.6f);
                            canvas.drawLine(centerX3 - gl.N(9.4f), N10, N11, N10, paint8);
                            canvas.drawLine(N11 - gl.N(2.6f), N10 - gl.N(2.6f), N11, N10, paint8);
                            canvas3 = canvas;
                            canvas3.drawLine(N11 - gl.N(2.6f), gl.N(2.6f) + N10, N11, N10, paint8);
                            canvas3.restore();
                        }
                        if (d2 > 0.0f) {
                            float R14 = gl.R1(0.6f, 1.0f, d2) * 0.9285f;
                            int intrinsicWidth = (int) ((drawable3.getIntrinsicWidth() / 2.0f) * R14);
                            int intrinsicHeight = (int) ((drawable3.getIntrinsicHeight() / 2.0f) * R14);
                            int i16 = (int) centerX3;
                            int i17 = (int) centerY3;
                            drawable3.setBounds(i16 - intrinsicWidth, i17 - intrinsicHeight, i16 + intrinsicWidth, i17 + intrinsicHeight);
                            drawable3.setAlpha((int) (f61 * d2));
                            drawable3.draw(canvas3);
                            drawable3.setAlpha(kk7.d4);
                        }
                        canvas3.restore();
                    }
                    lVar2.getLocationInWindow(lVar2.w0);
                    chatActivityEnterView.getLocationInWindow(lVar2.v0);
                    chatActivityEnterView.w0(lVar2, canvas3, r1[0], r1[1], -100000.0f, r2[1]);
                    return;
                }
                f6 = measuredHeight;
                f7 = L;
                f8 = 1.0f;
                float d4 = this.P.d(!chatActivityEnterView.d1 && chatActivityEnterView.Y1 >= 59000);
                f9 = chatActivityEnterView.e5;
                if (f9 != 0.0f) {
                }
                f10 = chatActivityEnterView.b5;
                if (f10 == 0.0f) {
                }
                if (chatActivityEnterView.l1) {
                }
                canvas.save();
                float measuredWidth22 = getMeasuredWidth();
                int measuredHeight22 = getMeasuredHeight() - chatActivityEnterView.p2.getMeasuredHeight();
                if (chatActivityEnterView.K1) {
                }
                f13 = f11;
                i2 = 0;
                canvas.clipRect(0.0f, 0.0f, measuredWidth22, (measuredHeight22 + i2) - chatActivityEnterView.l7);
                float f382 = f8 - chatActivityEnterView.X4;
                if (f382 == 0.0f) {
                }
                if (chatActivityEnterView.Y4 >= 0.7f) {
                }
                chatActivityEnterView.T4 = false;
                f14 = chatActivityEnterView.f5;
                if (f14 != 0.0f) {
                }
                float N12 = gl.N(72.0f);
                float A3 = tb4.A(1.0f, f39, gl.N(24.0f) * f12, N12 * f39);
                float f432 = chatActivityEnterView.f5;
                float A22 = tb4.A(1.0f, f432, N12, A3);
                if (A22 <= N12) {
                }
                float f452 = 1.0f - d4;
                float f462 = 1.0f - f13;
                float f472 = chatActivityEnterView.X4 * f452 * f462 * f432;
                float f482 = measuredWidth;
                float f492 = f30 + f44;
                canvas.scale(f472, f472, f482, f492);
                float f502 = f31 + f44;
                float f512 = f502 + f7;
                rectF7.set(f482 - gl.N(18.0f), f502, gl.N(18.0f) + f482, f512);
                z = this.y0;
                Paint paint42 = this.r;
                if (z) {
                }
                chatActivityEnterView.H4.set(rectF);
                RectF rectF82 = chatActivityEnterView.H4;
                float centerX4 = rectF82.centerX();
                float centerY4 = rectF82.centerY();
                rectF82.left = gl.R1(centerX4, rectF82.left, f472);
                rectF82.right = gl.R1(centerX4, rectF82.right, f472);
                rectF82.top = gl.R1(centerY4, rectF82.top, f472);
                rectF82.bottom = gl.R1(centerY4, rectF82.bottom, f472);
                je5Var = lVar.a;
                if (je5Var != null) {
                }
                float f522 = 1.0f - f4;
                float f532 = f17;
                rectF.set((f19 - gl.N(6.0f)) - (gl.N(f17) * f522), f492 - (gl.N(f17) * f522), oo1.e(f532, f522, gl.L(6.0f) + i3), oo1.e(f532, f522, f492 + gl.L(12.0f)));
                float f542 = rectF.bottom;
                float centerX22 = rectF.centerX();
                float centerY22 = rectF.centerY();
                canvas2.save();
                float i92 = Utilities.i(Math.max(chatActivityEnterView.e5, chatActivityEnterView.A6) * f532, 1.0f, 0.0f);
                Paint paint52 = lVar.s;
                int alpha3 = paint52.getAlpha();
                rectF2 = rectF;
                float f552 = f12;
                Paint paint62 = paint;
                Canvas canvas42 = canvas;
                int saveLayerAlpha2 = canvas42.saveLayerAlpha(centerX22 - gl.L(24.0f), centerY22 - gl.L(24.0f), gl.L(24.0f) + centerX22, gl.L(24.0f) + centerY22, (int) (alpha3 * (1.0f - i92)), 31);
                Paint paint72 = lVar.w;
                paint72.setAlpha(kk7.d4);
                paint52.setAlpha(kk7.d4);
                float f562 = 1.0f - L4;
                canvas42.translate(0.0f, gl.N(2.0f) * f562);
                canvas42.rotate(f32, centerX22, centerY22);
                interpolation = s33.j.getInterpolation(Utilities.i(f4, 1.0f, 0.0f));
                i4 = Utilities.i(interpolation / f18, 1.0f, 0.0f);
                float interpolation42 = s33.g.getInterpolation(Utilities.i((interpolation - 0.3f) / 0.7f, 1.0f, 0.0f));
                float i102 = 1.0f - Utilities.i((interpolation - 0.15f) / 0.7f, 1.0f, 0.0f);
                if (interpolation < 1.0f) {
                }
                f20 = L4;
                rectF3 = rectF2;
                f21 = 0.0f;
                Drawable drawable32 = lVar.F;
                if (i92 <= f21) {
                }
                if (f4 <= f21) {
                }
                if (i4 < 1.0f) {
                }
                paint52.setAlpha(alpha3);
                paint72.setAlpha(alpha3);
                canvas42.restoreToCount(saveLayerAlpha2);
                if (drawable != null) {
                }
                i5 = Utilities.i((f20 - 0.55f) / 0.45f, 1.0f, 0.0f) * lVar.h0.d((chatActivityEnterView.r0() || chatActivityEnterView.h5 || chatActivityEnterView.x1 || chatActivityEnterView.g5 || chatActivityEnterView.e5 != 0.0f || !chatActivityEnterView.v3) ? false : true);
                lVar.n0 = i5;
                if (i5 > 0.01f) {
                }
                canvas42.restore();
                canvas42.restore();
                Canvas canvas52 = canvas42;
                RectF rectF112 = rectF4;
                l lVar32 = lVar;
                float f592 = f44;
                lVar32.b(f19, f6, f452 * chatActivityEnterView.X4 * f462 * chatActivityEnterView.f5, f592, canvas52);
                float L52 = (gl.L(38.0f) * f16) + gl.R1(f31, lVar32.getMeasuredHeight() - gl.L(118.0f), Math.max(chatActivityEnterView.b5, Math.min(f552, chatActivityEnterView.f5))) + f592;
                rectF112.set(f19 - gl.N(18.0f), L52, gl.N(18.0f) + f19, L52 + f7);
                hy1 hy1Var2 = chatActivityEnterView.P3;
                if (hy1Var2 == null) {
                }
                chatActivityEnterView.Q = z2;
                if (z2) {
                }
                lm lmVar2 = lVar2.r0;
                lmVar2.getClass();
                e2 = lmVar2.e(false, 0.0f);
                RectF rectF122 = chatActivityEnterView.H4;
                float d22 = lVar2.s0.d(chatActivityEnterView.U1);
                float d32 = lVar2.t0.d(lVar2.u0 < 0);
                rectF5 = lVar2.p0;
                if (e2 > 0.0f) {
                }
                rectF5.setEmpty();
                lVar2.getLocationInWindow(lVar2.w0);
                chatActivityEnterView.getLocationInWindow(lVar2.v0);
                chatActivityEnterView.w0(lVar2, canvas3, r1[0], r1[1], -100000.0f, r2[1]);
                return;
            }
        } else {
            j = currentTimeMillis;
            i = 2;
        }
        f5 = 0.0f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = gl.L(250.0f);
        if (this.I != size) {
            this.I = size;
            StaticLayout staticLayout = new StaticLayout(this.e, this.n, gl.L(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i3 = 0; i3 < lineCount; i3++) {
                float lineWidth = this.f.getLineWidth(i3);
                if (lineWidth > this.h) {
                    this.h = lineWidth;
                }
            }
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onSetAlpha(int i) {
        return super.onSetAlpha(i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        RectF rectF = chatActivityEnterView.H4;
        byte b = 3;
        if (chatActivityEnterView.K1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                int g = g(x, y);
                this.u0 = g;
                if (g >= 0) {
                    invalidate();
                    return true;
                }
            } else if (this.u0 >= 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 3) {
                        this.u0 = -1;
                        invalidate();
                        return true;
                    }
                }
                if (g(x, y) >= 0) {
                    chatActivityEnterView.R1(!chatActivityEnterView.U1, true);
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.u0 = -1;
                invalidate();
                return true;
            }
        }
        int action = motionEvent.getAction();
        RectF rectF2 = this.K;
        if (action == 0) {
            if (chatActivityEnterView.h5) {
                RectF rectF3 = gl.P;
                rectF3.set(rectF);
                rectF3.inset(-gl.L(10.0f), -gl.L(10.0f));
                this.P0 = !rectF.isEmpty() && rectF3.contains((float) x, (float) y);
            }
            if (chatActivityEnterView.Q && chatActivityEnterView.D2 != null && chatActivityEnterView.c5 > 0.1f) {
                this.O0 = rectF2.contains(x, y);
            }
        } else if (motionEvent.getAction() == 1) {
            RectF rectF4 = gl.P;
            rectF4.set(rectF);
            rectF4.inset(-gl.L(10.0f), -gl.L(10.0f));
            if (this.P0 && rectF4.contains(x, y)) {
                if (chatActivityEnterView.l1 && !chatActivityEnterView.d1) {
                    this.O0 = false;
                    this.P0 = false;
                    if (chatActivityEnterView.v3) {
                        if (chatActivityEnterView.z6) {
                            chatActivityEnterView.m0(false, true);
                            chatActivityEnterView.z0().I(true);
                        } else {
                            ex1 ex1Var = chatActivityEnterView.F0;
                            if (ex1Var == null || ex1Var.length() == 0) {
                                chatActivityEnterView.k0();
                                return true;
                            }
                            chatActivityEnterView.m0(true, true);
                            jm3 jm3Var = chatActivityEnterView.j1;
                            if (jm3Var != null && jm3Var.o0 && jm3Var.r == 1) {
                                jm3Var.u();
                            }
                        }
                        try {
                            chatActivityEnterView.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                        return true;
                    }
                }
                if (chatActivityEnterView.d1) {
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.a2;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.P3.G0();
                } else {
                    hq1 hq1Var = new hq1(this, (byte) 11);
                    je5 je5Var = this.a;
                    if (je5Var != null && je5Var.W) {
                        e();
                    }
                    if (chatActivityEnterView.K1) {
                        chatActivityEnterView.R1(false, false);
                        gl.r(chatActivityEnterView.X1);
                        chatActivityEnterView.K1(true);
                    }
                    i29 i29Var = chatActivityEnterView.i1;
                    if (i29Var != null) {
                        i29Var.setPlaying(false);
                    }
                    if (!MediaController.w().F() || (chatActivityEnterView.i1.getAudioLeft() <= 0.01f && chatActivityEnterView.i1.getAudioRight() >= 0.99f)) {
                        hq1Var.run();
                    } else {
                        kx1 kx1Var = new kx1(this, hq1Var, b);
                        if (na7.c1().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.L4, getContext());
                            String M0 = k96.M0(2131746155, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            hdVar.U = k96.M0(2131746156, null);
                            alertDialog$Builder.j(k96.M0(2131747638, null), new rh1((Object) kx1Var, (byte) 13));
                            alertDialog$Builder.g(k96.M0(2131752577, null), null);
                            alertDialog$Builder.o();
                        } else {
                            kx1Var.run();
                        }
                    }
                }
                this.O0 = false;
                this.P0 = false;
                return true;
            }
            if (this.O0 && rectF2.contains(x, y)) {
                boolean z = !chatActivityEnterView.P;
                chatActivityEnterView.P = z;
                this.E.d(1, z, true);
                hq6 d0 = hq6.d0(chatActivityEnterView.R);
                long j = chatActivityEnterView.G3;
                mu1 mu1Var = chatActivityEnterView.F3;
                d0.g2(j, (mu1Var == null || !mu1Var.x4) ? 0L : mu1Var.d(), chatActivityEnterView.P);
                if (chatActivityEnterView.P) {
                    h();
                } else {
                    e();
                }
                invalidate();
                this.O0 = false;
                this.P0 = false;
                return true;
            }
            this.O0 = false;
            this.P0 = false;
        } else if (motionEvent.getAction() == 3) {
            this.O0 = false;
            this.P0 = false;
        }
        return this.P0 || this.O0;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
    }

    public void setBlurredBackgroundFactory(kl0 kl0Var) {
        this.y0 = true;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        chatActivityEnterView.L1 = kl0Var;
        bl0 bl0Var = this.x0;
        if (bl0Var == null) {
            bl0Var = new bl0(bkb.Qe, chatActivityEnterView.L4);
            this.x0 = bl0Var;
        }
        il0 c = kl0Var.c(this, bl0Var, false);
        this.z0 = c;
        c.r(gl.L(18.0f));
        this.z0.q(gl.L(3.0f));
        il0 c2 = kl0Var.c(this, this.x0, false);
        this.A0 = c2;
        c2.r(gl.L(18.0f));
        this.A0.q(gl.L(3.0f));
        il0 c3 = kl0Var.c(this, this.x0, false);
        this.o0 = c3;
        c3.r(gl.L(18.0f));
        this.o0.q(gl.L(3.0f));
        il0 c4 = kl0Var.c(this, this.x0, false);
        this.R = c4;
        c4.r(gl.L(18.0f));
        il0 il0Var = this.R;
        il0Var.X = 0.0f;
        il0Var.q(gl.L(3.0f));
        this.B0 = false;
        updateColors();
    }

    @Override // tjb
    public final void updateColors() {
        TextPaint textPaint;
        Drawable drawable;
        Drawable drawable2;
        int i;
        hb1 hb1Var = this.E;
        if (hb1Var == null || (textPaint = this.n) == null || (drawable = this.F) == null || (drawable2 = this.G) == null) {
            return;
        }
        bl0 bl0Var = this.x0;
        if (bl0Var != null) {
            bl0Var.d();
        }
        il0 il0Var = this.z0;
        if (il0Var != null) {
            il0Var.updateColors();
        }
        il0 il0Var2 = this.A0;
        if (il0Var2 != null) {
            il0Var2.updateColors();
        }
        il0 il0Var3 = this.o0;
        if (il0Var3 != null) {
            il0Var3.updateColors();
        }
        il0 il0Var4 = this.R;
        if (il0Var4 != null) {
            il0Var4.updateColors();
        }
        int i2 = this.y0 ? bkb.Ml : bkb.Pe;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        hb1Var.e(chatActivityEnterView.F0(i2), chatActivityEnterView.F0(bkb.Tf), -1);
        textPaint.setColor(chatActivityEnterView.F0(bkb.fg));
        ShapeDrawable shapeDrawable = this.c;
        if (shapeDrawable != null) {
            i = bkb.gg;
            bkb.A1(chatActivityEnterView.F0(i), shapeDrawable);
        } else {
            int L = gl.L(5.0f);
            i = bkb.gg;
            this.c = bkb.b0(L, chatActivityEnterView.F0(i));
        }
        int F0 = chatActivityEnterView.F0(i);
        Drawable drawable3 = this.d;
        if (drawable3 != null && F0 != this.L0) {
            this.L0 = F0;
            drawable3.setColorFilter(new PorterDuffColorFilter(F0, PorterDuff.Mode.SRC_IN));
        }
        this.r.setColor(chatActivityEnterView.F0(bkb.Qe));
        this.s.setColor(chatActivityEnterView.F0(this.y0 ? bkb.Ml : bkb.Pe));
        this.w.setColor(chatActivityEnterView.F0(this.y0 ? bkb.Ml : bkb.Pe));
        int F02 = chatActivityEnterView.F0(this.y0 ? bkb.Ml : bkb.Pe);
        if (this.N0 && F02 == this.M0) {
            return;
        }
        this.N0 = true;
        this.M0 = F02;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(F02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(F02, mode));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.E || super.verifyDrawable(drawable);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
