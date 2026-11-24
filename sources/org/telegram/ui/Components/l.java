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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l extends FrameLayout implements vlb {
    public im0 A0;
    public boolean B0;
    public int C0;
    public final Paint D0;
    public final oc1 E;
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
    public final im0[] J0;
    public final RectF K;
    public final kg7 K0;
    public long L;
    public int L0;
    public final Path M;
    public int M0;
    public final float[] N;
    public boolean N0;
    public final float[] O;
    public boolean O0;
    public final ln P;
    public boolean P0;
    public final RectF Q;
    public final /* synthetic */ ChatActivityEnterView Q0;
    public im0 R;
    public final Paint S;
    public final Paint T;
    public final Paint U;
    public final ln V;
    public final ln W;
    public hg5 a;
    public final ln a0;
    public hg5 b;
    public final ln b0;
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
    public final ln h0;
    public final ln i0;
    public final Paint j0;
    public final Paint k0;
    public final Path l0;
    public final Matrix m0;
    public final TextPaint n;
    public float n0;
    public im0 o0;
    public final RectF p0;
    public final Paint q0;
    public final Paint r;
    public final ln r0;
    public final Paint s;
    public final ln s0;
    public final ln t0;
    public int u0;
    public final int[] v0;
    public final Paint w;
    public final int[] w0;
    public final Path x;
    public bm0 x0;
    public final Paint y;
    public boolean y0;
    public im0 z0;

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
        d53 d53Var = d53.h;
        this.P = new ln(this, 0L, 350L, d53Var);
        this.Q = new RectF();
        this.S = new Paint(1);
        this.T = new Paint(1);
        this.U = new Paint(1);
        this.V = new ln(this, 0L, 320L, d53Var);
        this.W = new ln(this, 0L, 260L, d53.k);
        this.a0 = new ln(this, 0L, 60L, d53Var);
        this.b0 = new ln(this, 0L, 180L, d53Var);
        this.d0 = new Path();
        this.e0 = new Path();
        this.f0 = new Path();
        this.g0 = new Paint(1);
        this.h0 = new ln(this, 0L, 220L, d53Var);
        this.i0 = new ln(this, 0L, 220L, d53Var);
        this.j0 = new Paint(1);
        this.k0 = new Paint(1);
        this.l0 = new Path();
        this.m0 = new Matrix();
        this.p0 = new RectF();
        new TextPaint(1);
        new Paint(1);
        new Paint(1);
        this.q0 = new Paint(1);
        this.r0 = new ln(this, 0L, 380L, d53Var);
        this.s0 = new ln(this, 0L, 300L, d53Var);
        this.t0 = new ln(this, 0L, 180L, d53Var);
        this.u0 = -1;
        this.v0 = new int[2];
        this.w0 = new int[2];
        this.D0 = new Paint(1);
        this.E0 = new Paint(1);
        this.F0 = new Paint(1);
        this.G0 = new Path();
        this.H0 = new Matrix();
        this.I0 = new RectF();
        this.J0 = new im0[3];
        this.K0 = new kg7((byte) 15);
        k kVar = new k(this, this);
        this.H = kVar;
        kfc.k(this, kVar);
        oc1 oc1Var = new oc1(5);
        this.E = oc1Var;
        oc1Var.setCallback(this);
        oc1Var.d(1, chatActivityEnterView.P, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(gm.N(1.7f));
        Drawable drawable = getResources().getDrawable(R.drawable.lock_round_shadow);
        chatActivityEnterView.K4 = drawable;
        anb.x(this, drawable, cmb.Re, chatActivityEnterView.L4, PorterDuff.Mode.MULTIPLY);
        this.c = cmb.b0(gm.L(5.0f), chatActivityEnterView.F0(cmb.gg));
        textPaint.setTextSize(gm.L(14.0f));
        this.d = context.getDrawable(R.drawable.tooltip_arrow);
        this.e = jb6.M0(2131745046, "SlideUpToLock");
        float L = gm.L(3.0f);
        float L2 = gm.L(3.0f);
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
        paint.setStrokeWidth(gm.N(1.6f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        int i = cmb.c6;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        paint.setColor(gm.B(chatActivityEnterView.F0(i)) < 0.5f ? this.s.getColor() : chatActivityEnterView.F0(cmb.dg));
        paint.setAlpha((int) (Color.alpha(r4) * f));
    }

    public final void a() {
        Path path = this.d0;
        if (path.isEmpty()) {
            float N = gm.N(0.3f);
            float N2 = gm.N(3.9f) + N;
            float f = -gm.N(6.2f);
            float N3 = gm.N(6.2f);
            float N4 = gm.N(4.6f);
            path.moveTo(N2 - N4, N3);
            path.lineTo(N2, f);
            path.lineTo(N2 + N4, N3);
            float f2 = N4 * 0.6f;
            path.moveTo(N2 - f2, gm.N(2.1f));
            path.lineTo(N2 + f2, gm.N(2.1f));
            float f3 = -gm.N(0.6f);
            float N5 = N - gm.N(2.6f);
            float N6 = N - gm.N(9.2f);
            Path path2 = this.e0;
            path2.moveTo(N6, f3);
            path2.lineTo(N5, f3);
            path2.moveTo(N5 - gm.N(3.2f), f3 - gm.N(4.0f));
            path2.lineTo(N5, f3);
            path2.lineTo(N5 - gm.N(3.2f), gm.N(4.0f) + f3);
            float f4 = -gm.N(5.0f);
            float N7 = gm.N(4.0f);
            Path path3 = this.f0;
            path3.moveTo(f4, N7);
            path3.lineTo(0.0f, 0.0f);
            path3.lineTo(gm.N(5.0f), gm.N(4.0f));
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
        int r1;
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
        ln lnVar = this.W;
        lnVar.getClass();
        float max2 = Math.max(lnVar.e(false, 0.0f), this.b0.d(this.c0));
        float max3 = Math.max(this.a0.e(false, chatActivityEnterView2.w1), this.c0 ? 1.0f : 0.0f);
        float L = gm.L(36.0f);
        float f19 = L / 2.0f;
        float R1 = gm.R1(gm.L(64.0f), L, max3);
        float L2 = gm.L(79.0f);
        float L3 = ((gm.L(64.0f) - R1) / 2.0f) * 0.70710677f;
        float round = Math.round(f - L2) - L3;
        float round2 = Math.round(((f2 + gm.L(170.0f)) - L2) + f4) - L3;
        float f20 = R1 / 2.0f;
        float f21 = round2 - f20;
        float f22 = round2 + f20;
        rectF2.set(round - f20, f21, round + f20, f22);
        float max4 = ((Math.max(0.0f, max2) * 0.08f) + (0.04f * max3) + 1.0f) * ((0.4f * max) + 0.6f);
        canvas.save();
        float L4 = f2 + gm.L(170.0f) + f4;
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
            i = canvas2.saveLayerAlpha(round - R1, round2 - R1, gm.L(30.0f) + f, gm.L(30.0f) + L4, (int) (max * 255.0f));
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
        canvas2.scale(f11, f11, gm.R1(f9, f, f12), gm.R1(f10, f5, f12));
        int F0 = chatActivityEnterView2.F0(cmb.Oe);
        if (max2 > f7) {
            float f23 = R1 * 0.95f;
            RadialGradient radialGradient = new RadialGradient(f9, f10, f23, new int[]{cmb.p1(0.5f, F0), cmb.p1(0.16f, F0), 0}, new float[]{0.3f, 0.62f, 1.0f}, Shader.TileMode.CLAMP);
            Paint paint = this.T;
            paint.setShader(radialGradient);
            paint.setAlpha((int) (Math.min(1.0f, max2) * 255.0f));
            canvas2.drawCircle(f9, f10, f23, paint);
        }
        boolean z3 = gm.B(chatActivityEnterView2.F0(cmb.c6)) < 0.5f;
        RectF rectF3 = gm.P;
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
            r1 = this.C0;
        } else {
            bm0 bm0Var = this.x0;
            r1 = bm0Var != null ? bm0Var.r1() : 0;
        }
        if (this.y0 || Color.alpha(r1) <= 0) {
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
            paint2.setShadowLayer(gm.N(1.0f), 0.0f, gm.N(0.33333334f), r1);
            canvas3.drawPath(path, paint2);
        }
        canvas3.save();
        canvas3.rotate(-45.0f, f14, f13);
        rectF.set(f24, f16, f15, f22);
        if (!this.y0) {
            im0 im0Var = this.R;
            if (im0Var != null) {
                im0Var.setBounds((int) (rectF.left - gm.N(3.0f)), (int) (rectF.top - gm.N(3.0f)), (int) (gm.N(3.0f) + rectF.right), (int) (gm.N(3.0f) + rectF.bottom));
                this.R.setAlpha(nm7.d4);
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
        paint4.setStrokeWidth(gm.N(0.66f));
        paint4.setColor(z ? 654311423 : 436207616);
        paint4.setAlpha((int) ((1.0f - i6) * Color.alpha(paint4.getColor())));
        rectF.inset(gm.N(0.33f), gm.N(0.33f));
        canvas3.drawRoundRect(rectF, f17, f17, paint4);
        canvas3.restore();
        float f28 = f20 - f17;
        Paint paint5 = this.U;
        paint5.setStyle(style);
        paint5.setStrokeWidth(gm.N(1.9f));
        paint5.setStrokeCap(Paint.Cap.ROUND);
        paint5.setStrokeJoin(Paint.Join.ROUND);
        paint5.setColor(on2.f(i6, this.s.getColor(), -1));
        canvas3.save();
        canvas3.translate(((f28 - gm.N(2.0f)) * (-0.70710677f)) + f14, ((f28 - gm.N(2.0f)) * (-0.70710677f)) + f13);
        canvas3.drawPath(this.d0, paint5);
        ln lnVar2 = this.i0;
        float f29 = f8 * 1.4f;
        float N = gm.N(1.5f) * (1.0f - Utilities.i(f29, 1.0f, 0.0f)) * lnVar2.c;
        float f30 = (f() + 1.0f) / 2.0f;
        canvas3.translate((3.0f - (f30 * 2.0f)) * f30 * f30 * N, 0.0f);
        paint5.setStrokeWidth(gm.N(1.6f));
        canvas3.drawPath(this.e0, paint5);
        paint5.setStrokeWidth(gm.N(1.9f));
        canvas3.restore();
        if (!this.c0) {
            ChatActivityEnterView chatActivityEnterView3 = chatActivityEnterView;
            if (chatActivityEnterView3.v3 && !chatActivityEnterView3.h5) {
                z2 = true;
                i5 = (1.0f - Utilities.i(f29, 1.0f, 0.0f)) * lnVar2.d(z2);
                if (i5 > f7) {
                    setupHintPaint(i5);
                    float f31 = (f() * gm.N(2.5f)) + (-(f28 - gm.N(3.0f)));
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
        i5 = (1.0f - Utilities.i(f29, 1.0f, 0.0f)) * lnVar2.d(z2);
        if (i5 > f7) {
        }
        if (i4 >= 0) {
        }
        canvas3.restore();
        invalidate();
    }

    public final void c(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4, im0 im0Var) {
        byte b;
        int i = cmb.c6;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        boolean z = gm.B(chatActivityEnterView.F0(i)) < 0.5f;
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
        glc glcVar = chatActivityEnterView.r1;
        if (glcVar == null || (!((b = glcVar.c) == 2 || b == 3) || glcVar.J)) {
            paint.setShadowLayer(gm.N(8.0f), 0.0f, gm.N(2.0f), cmb.p1((z ? 0.4f : 0.16f) * 1.0f, -16777216));
        } else {
            paint.setShadowLayer(gm.N(1.2f), 0.0f, 0.0f, cmb.p1((z ? 0.36f : 0.12f) * 1.0f, -16777216));
        }
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.save();
        canvas.clipPath(path);
        if (im0Var != null) {
            RectF rectF2 = this.I0;
            path.computeBounds(rectF2, true);
            im0Var.setBounds(((int) rectF2.left) - gm.L(3.0f), ((int) rectF2.top) - gm.L(3.0f), gm.L(3.0f) + ((int) rectF2.right), gm.L(3.0f) + ((int) rectF2.bottom));
            im0Var.setAlpha(nm7.d4);
            im0Var.draw(canvas);
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
        paint3.setStrokeWidth(Math.max(1.0f, gm.N(0.5f)));
        paint3.setColor(z ? 620756991 : 385875968);
        paint3.setAlpha((int) (Color.alpha(paint3.getColor()) * 1.0f));
        canvas.drawPath(path, paint3);
    }

    public final im0 d(int i) {
        km0 km0Var = this.Q0.L1;
        if (km0Var == null) {
            return null;
        }
        im0[] im0VarArr = this.J0;
        if (im0VarArr[i] == null) {
            im0 c = km0Var.c(this, this.K0, false);
            im0VarArr[i] = c;
            c.r(0.0f);
            im0VarArr[i].X = 0.0f;
        }
        return im0VarArr[i];
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent) || this.H.f(motionEvent);
    }

    public final void e() {
        hg5 hg5Var = this.a;
        if (hg5Var != null) {
            hg5Var.r0 = new vz1(this, hg5Var, (byte) 1);
            hg5Var.f(true);
            this.a = null;
        }
        hg5 hg5Var2 = this.b;
        if (hg5Var2 != null) {
            hg5Var2.r0 = new vz1(this, hg5Var2, (byte) 2);
            hg5Var2.f(true);
            this.b = null;
        }
    }

    public final int g(float f, float f2) {
        RectF rectF = this.p0;
        if (!rectF.isEmpty() && this.r0.c >= 0.8f) {
            RectF rectF2 = gm.P;
            rectF2.set(rectF);
            rectF2.inset(-gm.L(6.0f), -gm.L(6.0f));
            if (rectF2.contains(f, f2)) {
                return 0;
            }
        }
        return -1;
    }

    public final void h() {
        e();
        hg5 hg5Var = new hg5(getContext(), 2);
        this.b = hg5Var;
        hg5Var.n(1.0f, 0.0f);
        hg5 hg5Var2 = this.b;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        chatActivityEnterView.setHintGlass(hg5Var2);
        this.b.p(true);
        boolean z = chatActivityEnterView.d1;
        boolean z2 = chatActivityEnterView.P;
        this.b.t(gm.S2(jb6.M0(z ? z2 ? 2131743266 : 2131743267 : z2 ? 2131743194 : 2131743195, null)));
        hg5 hg5Var3 = this.b;
        hg5Var3.h = hg5.a(hg5Var3.getText(), this.b.getTextPaint());
        if (chatActivityEnterView.P) {
            hg5 hg5Var4 = this.b;
            hg5Var4.getClass();
            p09 p09Var = new p09(R.raw.fire_on, gm.L(34.0f), gm.L(34.0f));
            p09Var.start();
            hg5Var4.l(p09Var);
        } else {
            oc7.d1().edit().putInt("voiceoncehint", oc7.d1().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.b, qoe.d(-1, -1.0f, nm7.D1, 0.0f, 0.0f, 54.0f, 58.0f));
        hg5 hg5Var5 = this.b;
        hg5Var5.r0 = new vz1(this, hg5Var5, (byte) 0);
        hg5Var5.v();
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
        hg5 hg5Var;
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
        px1 px1Var;
        float f23;
        float f24;
        int i6;
        va2 C0;
        im0 im0Var;
        am0 am0Var;
        boolean z3 = this.B0;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        if (!z3 && chatActivityEnterView.L1 != null && (C0 = chatActivityEnterView.C0()) != null && (im0Var = C0.n) != null && (am0Var = im0Var.w) != null) {
            im0 c2 = chatActivityEnterView.L1.c(this, am0Var, false);
            this.z0 = c2;
            c2.r(gm.L(18.0f));
            this.z0.q(gm.L(3.0f));
            this.z0.X = 0.0f;
            im0 c3 = chatActivityEnterView.L1.c(this, am0Var, false);
            this.A0 = c3;
            c3.r(gm.L(18.0f));
            this.A0.q(gm.L(3.0f));
            this.A0.X = 0.0f;
            im0 c4 = chatActivityEnterView.L1.c(this, am0Var, false);
            this.R = c4;
            c4.r(0.0f);
            im0 im0Var2 = this.R;
            im0Var2.X = 0.0f;
            im0Var2.q(gm.L(3.0f));
            this.C0 = am0Var.r1();
            this.B0 = true;
        }
        float f25 = chatActivityEnterView.W4;
        float f26 = f25 <= 0.5f ? f25 / 0.5f : f25 <= 0.75f ? 1.0f - (((f25 - 0.5f) / 0.25f) * 0.1f) : (((f25 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        long currentTimeMillis = System.currentTimeMillis() - this.L;
        this.L = System.currentTimeMillis();
        float f27 = chatActivityEnterView.a5;
        if (f27 != 10000.0f) {
            float max = Math.max(0.0f, chatActivityEnterView.Z4 - f27);
            float L3 = gm.L(5.0f);
            if (max <= L3) {
                f = 5.0f;
                f2 = 0.0f;
            } else {
                f = 5.0f;
                f2 = Math.round(((max - L3) * gm.L(57.0f)) / (gm.L(57.0f) - L3));
            }
            if (f2 > gm.L(57.0f)) {
                f2 = gm.L(57.0f);
            }
        } else {
            f = 5.0f;
            f2 = 0.0f;
        }
        int measuredWidth = getMeasuredWidth() - gm.M(26.0f);
        float L4 = 1.0f - (f2 / gm.L(57.0f));
        float measuredHeight = getMeasuredHeight() - gm.L(194.0f);
        if (chatActivityEnterView.h5) {
            L = gm.L(36.0f);
            L2 = aq1.e(14.0f, L4, (((1.0f - f26) * gm.N(30.0f)) + (gm.L(60.0f) + measuredHeight)) - f2);
            e = gm.N(2.0f) + (((L / 2.0f) + L2) - gm.N(8.0f));
            float f28 = L4 > 0.4f ? 1.0f : L4 / 0.4f;
            float f29 = chatActivityEnterView.c5;
            f3 = kt6.B(1.0f, f28, f29 * 15.0f, (1.0f - L4) * 9.0f * (1.0f - f29));
            f4 = L4;
        } else {
            L = gm.L(36.0f) + ((int) (gm.L(28.0f) * L4));
            L2 = (((gm.L(60.0f) - (gm.L(14.0f) * L4)) + measuredHeight) + ((int) ((1.0f - f26) * gm.L(30.0f)))) - ((int) f2);
            e = aq1.e(2.0f, L4, gm.N(2.0f) + (((L / 2.0f) + L2) - gm.N(8.0f))) - (gm.N(10.0f) * L4);
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
                            boolean z6 = gda.a;
                            SharedPreferences.Editor edit = oc7.d1().edit();
                            int i7 = gda.N + 1;
                            gda.N = i7;
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
                    canvas.translate((getMeasuredWidth() - this.h) - gm.L(44.0f), gm.N(16.0f) + measuredHeight);
                    f6 = measuredHeight;
                    f7 = L;
                    this.c.setBounds(-gm.L(8.0f), -gm.L(2.0f), (int) (this.h + gm.L(36.0f)), (int) (gm.N(4.0f) + this.f.getHeight()));
                    this.c.draw(canvas);
                    this.f.draw(canvas);
                    canvas.restore();
                    canvas.save();
                    canvas.translate(getMeasuredWidth() - gm.L(26.0f), ((this.f.getHeight() / 2.0f) + (gm.N(17.0f) + f6)) - (gm.N(3.0f) * chatActivityEnterView.d5));
                    Path path = this.x;
                    path.reset();
                    path.setLastPoint(-gm.N(f), gm.N(4.0f));
                    path.lineTo(0.0f, 0.0f);
                    path.lineTo(gm.N(f), gm.N(4.0f));
                    Paint paint3 = this.y;
                    paint3.setColor(-1);
                    paint3.setAlpha(i8);
                    paint3.setStyle(Paint.Style.STROKE);
                    paint3.setStrokeCap(Paint.Cap.ROUND);
                    paint3.setStrokeJoin(Paint.Join.ROUND);
                    paint3.setStrokeWidth(gm.N(1.5f));
                    canvas.drawPath(path, paint3);
                    canvas.restore();
                    canvas.save();
                    drawable2.setBounds(measuredWidth - (drawable2.getIntrinsicWidth() / 2), (int) (gm.N(20.0f) + this.f.getHeight() + f6), aq1.w(i6, measuredWidth, drawable2), drawable2.getIntrinsicHeight() + ((int) (gm.N(20.0f) + this.f.getHeight() + f6)));
                    drawable2.draw(canvas);
                    canvas.restore();
                    float d = this.P.d(!chatActivityEnterView.d1 && chatActivityEnterView.Y1 >= 59000);
                    f9 = chatActivityEnterView.e5;
                    if (f9 != 0.0f || chatActivityEnterView.i1 == null) {
                        f10 = chatActivityEnterView.b5;
                        if (f10 == 0.0f) {
                            float f36 = f10 > 0.6f ? f8 : f10 / 0.6f;
                            if (!chatActivityEnterView.h0) {
                                f10 = aq1.f(f10, 0.6f, 0.4f, 0.0f);
                            }
                            d53 d53Var = d53.j;
                            float interpolation2 = d53Var.getInterpolation(f36);
                            f11 = d53Var.getInterpolation(f10);
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
                            f24 = aq1.f(f9, 0.38f, 0.25f, 0.0f);
                        }
                        d53 d53Var2 = d53.j;
                        float interpolation3 = d53Var2.getInterpolation(f37);
                        d53Var2.getInterpolation(f24);
                        f11 = f23;
                        f12 = interpolation3;
                    }
                    if (chatActivityEnterView.l1) {
                        post(new gx1(chatActivityEnterView, (byte) 19));
                    }
                    canvas.save();
                    float measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight() - chatActivityEnterView.p2.getMeasuredHeight();
                    if (chatActivityEnterView.K1 || !chatActivityEnterView.Q5 || (px1Var = chatActivityEnterView.f1) == null || px1Var.getVisibility() != 0) {
                        f13 = f11;
                        i2 = 0;
                    } else {
                        f13 = f11;
                        i2 = b10.c(44.0f, chatActivityEnterView.o2.getMeasuredHeight(), 0);
                    }
                    canvas.clipRect(0.0f, 0.0f, measuredWidth2, (measuredHeight2 + i2) - chatActivityEnterView.t7);
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
                    float N = gm.N(72.0f);
                    float A = td4.A(1.0f, f39, gm.N(24.0f) * f12, N * f39);
                    float f43 = chatActivityEnterView.f5;
                    float A2 = td4.A(1.0f, f43, N, A);
                    float f44 = A2 <= N ? N : A2;
                    float f45 = 1.0f - d;
                    float f46 = 1.0f - f13;
                    float f47 = chatActivityEnterView.X4 * f45 * f46 * f43;
                    float f48 = measuredWidth;
                    float f49 = f30 + f44;
                    canvas.scale(f47, f47, f48, f49);
                    float f50 = f31 + f44;
                    float f51 = f50 + f7;
                    rectF7.set(f48 - gm.N(18.0f), f50, gm.N(18.0f) + f48, f51);
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
                        im0 im0Var3 = lVar.z0;
                        if (im0Var3 != null) {
                            im0Var3.setBounds((int) (rectF.left - gm.N(3.0f)), (int) (rectF.top - gm.N(3.0f)), (int) (gm.N(3.0f) + rectF.right), (int) (gm.N(3.0f) + rectF.bottom));
                            lVar.z0.draw(canvas2);
                        } else {
                            chatActivityEnterView.K4.setBounds((int) (rectF.left - gm.N(3.0f)), (int) (rectF.top - gm.N(3.0f)), (int) (gm.N(3.0f) + rectF.right), (int) (gm.N(3.0f) + rectF.bottom));
                            chatActivityEnterView.K4.draw(canvas2);
                            canvas2.drawRoundRect(rectF, gm.N(18.0f), gm.N(18.0f), paint);
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
                        c(canvas, rectF7, gm.N(18.0f), 0.0f, 0.0f, 0.0f, d(0));
                        lVar = this;
                        canvas2 = canvas;
                        rectF = rectF7;
                    }
                    chatActivityEnterView.H4.set(rectF);
                    RectF rectF8 = chatActivityEnterView.H4;
                    float centerX = rectF8.centerX();
                    float centerY = rectF8.centerY();
                    rectF8.left = gm.R1(centerX, rectF8.left, f47);
                    rectF8.right = gm.R1(centerX, rectF8.right, f47);
                    rectF8.top = gm.R1(centerY, rectF8.top, f47);
                    rectF8.bottom = gm.R1(centerY, rectF8.bottom, f47);
                    hg5Var = lVar.a;
                    if (hg5Var != null) {
                        hg5Var.o(0.0f, rectF.centerY());
                        lVar.a.invalidate();
                    }
                    float f52 = 1.0f - f4;
                    float f53 = f17;
                    rectF.set((f19 - gm.N(6.0f)) - (gm.N(f17) * f52), f49 - (gm.N(f17) * f52), aq1.e(f53, f52, gm.L(6.0f) + i3), aq1.e(f53, f52, f49 + gm.L(12.0f)));
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
                    int saveLayerAlpha = canvas4.saveLayerAlpha(centerX2 - gm.L(24.0f), centerY2 - gm.L(24.0f), gm.L(24.0f) + centerX2, gm.L(24.0f) + centerY2, (int) (alpha * (1.0f - i9)), 31);
                    Paint paint7 = lVar.w;
                    paint7.setAlpha(nm7.d4);
                    paint5.setAlpha(nm7.d4);
                    float f56 = 1.0f - L4;
                    canvas4.translate(0.0f, gm.N(2.0f) * f56);
                    canvas4.rotate(f32, centerX2, centerY2);
                    interpolation = d53.j.getInterpolation(Utilities.i(f4, 1.0f, 0.0f));
                    i4 = Utilities.i(interpolation / f18, 1.0f, 0.0f);
                    float interpolation4 = d53.g.getInterpolation(Utilities.i((interpolation - 0.3f) / 0.7f, 1.0f, 0.0f));
                    float i10 = 1.0f - Utilities.i((interpolation - 0.15f) / 0.7f, 1.0f, 0.0f);
                    if (interpolation < 1.0f || i10 <= 0.0f) {
                        f20 = L4;
                        rectF3 = rectF2;
                        f21 = 0.0f;
                    } else {
                        RectF rectF9 = gm.P;
                        rectF9.set(0.0f, 0.0f, gm.N(8.0f), gm.N(8.0f));
                        canvas4.save();
                        float e3 = aq1.e(2.0f, f56, f44 + f54);
                        float measuredWidth3 = lVar.getMeasuredWidth();
                        if (f4 > 0.0f) {
                            e3 = Math.min(e3, gm.N(0.5f) + rectF2.top);
                        }
                        canvas4.clipRect(0.0f, 0.0f, measuredWidth3, e3);
                        float N2 = gm.N(1.75f) * lVar.n0;
                        float f57 = (f() + 1.0f) / 2.0f;
                        float f58 = (3.0f - (f57 * 2.0f)) * f57 * f57 * N2;
                        canvas4.translate(f19 - gm.N(4.0f), ((gm.N(2.0f) * chatActivityEnterView.c5) + aq1.e(11.0f, interpolation, (rectF2.top - gm.L(6.0f)) - gm.R1(gm.N(2.0f), gm.N(1.5f), L4))) - f58);
                        if (f32 > 0.0f) {
                            canvas4.rotate(f32, gm.L(8.0f), gm.L(8.0f));
                        }
                        paint7.setAlpha((int) (i10 * 255.0f));
                        rectF3 = rectF2;
                        f20 = L4;
                        canvas4.drawLine(gm.N(8.0f), gm.N(4.0f), gm.N(8.0f), ((1.0f - interpolation) * gm.N(4.0f)) + gm.N(6.0f) + f58, paint7);
                        canvas.drawArc(rectF9, 0.0f, -180.0f, false, paint7);
                        canvas4 = canvas;
                        canvas4.drawLine(0.0f, gm.N(4.0f), 0.0f, b10.w(gm.N(4.0f), chatActivityEnterView.c5, f56, gm.N(4.0f)), paint7);
                        paint7.setAlpha(nm7.d4);
                        canvas4.restore();
                        f21 = 0.0f;
                    }
                    Drawable drawable3 = lVar.F;
                    drawable = i9 <= f21 ? chatActivityEnterView.d1 ? lVar.G : drawable3 : null;
                    if (f4 <= f21) {
                        if (lVar.A0 == null) {
                            paint2 = paint6;
                            rectF4 = rectF3;
                            canvas4.drawRoundRect(rectF4, gm.N(3.0f), gm.N(3.0f), paint2);
                        } else {
                            paint2 = paint6;
                            rectF4 = rectF3;
                        }
                        float N3 = gm.N(1.66f) * interpolation4;
                        f22 = 1.66f;
                        float R1 = gm.R1(gm.N(3.0f), gm.N(1.5f), interpolation);
                        float N4 = gm.N(1.5f) * interpolation4;
                        Path path2 = lVar.M;
                        path2.rewind();
                        RectF rectF10 = gm.P;
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
                        canvas4.drawRoundRect(rectF4, gm.N(3.0f), gm.N(3.0f), paint5);
                    }
                    if (i4 < 1.0f) {
                        canvas4.drawCircle(rectF4.centerX(), rectF4.centerY(), (1.0f - i4) * gm.N(2.0f), paint2);
                    }
                    paint5.setAlpha(alpha);
                    paint7.setAlpha(alpha);
                    canvas4.restoreToCount(saveLayerAlpha);
                    if (drawable != null) {
                        Rect rect = gm.Q;
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
                        canvas4.translate(Math.round(f19), (f15 - gm.L(17.0f)) - (f() * gm.N(2.5f)));
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
                    float L5 = (gm.L(38.0f) * f16) + gm.R1(f31, lVar3.getMeasuredHeight() - gm.L(118.0f), Math.max(chatActivityEnterView.b5, Math.min(f55, chatActivityEnterView.f5))) + f59;
                    rectF11.set(f19 - gm.N(18.0f), L5, gm.N(18.0f) + f19, L5 + f7);
                    uz1 uz1Var = chatActivityEnterView.P3;
                    z2 = uz1Var == null && uz1Var.K0() && !chatActivityEnterView.g0();
                    chatActivityEnterView.Q = z2;
                    if (z2) {
                        lVar2 = lVar3;
                        canvas3 = canvas5;
                    } else {
                        float N5 = gm.N(12.0f);
                        rectF11.set(rectF11.left, (rectF11.top - gm.N(36.0f)) - N5, rectF11.right, rectF11.top - N5);
                        hg5 hg5Var2 = lVar3.b;
                        if (hg5Var2 != null) {
                            hg5Var2.o(0.0f, rectF11.centerY());
                            lVar3.b.invalidate();
                        }
                        lVar3.K.set(rectF11);
                        canvas5.save();
                        float f60 = (1.0f - chatActivityEnterView.b5) * chatActivityEnterView.X4 * chatActivityEnterView.f5 * chatActivityEnterView.c5;
                        canvas5.scale(f60, f60, rectF11.centerX(), rectF11.centerY());
                        if (lVar3.y0) {
                            rectF6 = rectF11;
                            lVar3.c(canvas5, rectF6, gm.N(18.0f), 0.0f, 0.0f, 0.0f, lVar3.d(1));
                            lVar2 = lVar3;
                            canvas3 = canvas5;
                        } else {
                            lVar2 = lVar3;
                            canvas3 = canvas5;
                            rectF6 = rectF11;
                            im0 im0Var4 = lVar2.A0;
                            if (im0Var4 != null) {
                                im0Var4.setBounds((int) (rectF6.left - gm.N(3.0f)), (int) (rectF6.top - gm.N(3.0f)), (int) (gm.N(3.0f) + rectF6.right), (int) (gm.N(3.0f) + rectF6.bottom));
                                lVar2.A0.draw(canvas3);
                            } else {
                                chatActivityEnterView.K4.setBounds((int) (rectF6.left - gm.N(3.0f)), (int) (rectF6.top - gm.N(3.0f)), (int) (gm.N(3.0f) + rectF6.right), (int) (gm.N(3.0f) + rectF6.bottom));
                                chatActivityEnterView.K4.draw(canvas3);
                                canvas3.drawRoundRect(rectF6, gm.N(18.0f), gm.N(18.0f), paint2);
                            }
                        }
                        int i11 = (int) rectF6.left;
                        int i12 = (int) rectF6.top;
                        int i13 = (int) rectF6.right;
                        int i14 = (int) rectF6.bottom;
                        oc1 oc1Var = lVar2.E;
                        oc1Var.setBounds(i11, i12, i13, i14);
                        oc1Var.draw(canvas3);
                        canvas3.restore();
                    }
                    ln lnVar = lVar2.r0;
                    lnVar.getClass();
                    e2 = lnVar.e(false, 0.0f);
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
                        float R12 = (1.0f - (d3 * 0.06f)) * gm.R1(0.6f, 1.0f, e2);
                        canvas3.save();
                        canvas3.scale(R12, R12, rectF5.centerX(), rectF5.centerY());
                        float f61 = e2 * 255.0f;
                        int i15 = (int) f61;
                        im0 im0Var5 = lVar2.o0;
                        if (im0Var5 != null) {
                            im0Var5.setBounds((int) (rectF5.left - gm.N(3.0f)), (int) (rectF5.top - gm.N(3.0f)), (int) (gm.N(3.0f) + rectF5.right), (int) (gm.N(3.0f) + rectF5.bottom));
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
                            paint8.setStrokeWidth(gm.N(f22));
                            paint8.setStrokeCap(Paint.Cap.ROUND);
                            paint8.setStrokeJoin(Paint.Join.ROUND);
                            paint8.setColor(paint5.getColor());
                            paint8.setAlpha((int) ((1.0f - d2) * Color.alpha(paint5.getColor()) * e2));
                            canvas3.save();
                            float R13 = gm.R1(1.0f, 0.6f, d2);
                            canvas3.scale(R13, R13, centerX3, centerY3);
                            float N6 = gm.N(3.6f) + centerX3;
                            float N7 = centerY3 - gm.N(5.85f);
                            float N8 = gm.N(5.85f) + centerY3;
                            float N9 = gm.N(4.3f);
                            canvas3.drawLine(N6 - N9, N8, N6, N7, paint8);
                            canvas.drawLine(N6, N7, N6 + N9, N8, paint8);
                            float f62 = N9 * 0.6f;
                            canvas.drawLine(N6 - f62, gm.N(1.9f) + centerY3, N6 + f62, gm.N(1.9f) + centerY3, paint8);
                            float N10 = centerY3 - gm.N(0.6f);
                            float N11 = centerX3 - gm.N(2.6f);
                            canvas.drawLine(centerX3 - gm.N(9.4f), N10, N11, N10, paint8);
                            canvas.drawLine(N11 - gm.N(2.6f), N10 - gm.N(2.6f), N11, N10, paint8);
                            canvas3 = canvas;
                            canvas3.drawLine(N11 - gm.N(2.6f), gm.N(2.6f) + N10, N11, N10, paint8);
                            canvas3.restore();
                        }
                        if (d2 > 0.0f) {
                            float R14 = gm.R1(0.6f, 1.0f, d2) * 0.9285f;
                            int intrinsicWidth = (int) ((drawable3.getIntrinsicWidth() / 2.0f) * R14);
                            int intrinsicHeight = (int) ((drawable3.getIntrinsicHeight() / 2.0f) * R14);
                            int i16 = (int) centerX3;
                            int i17 = (int) centerY3;
                            drawable3.setBounds(i16 - intrinsicWidth, i17 - intrinsicHeight, i16 + intrinsicWidth, i17 + intrinsicHeight);
                            drawable3.setAlpha((int) (f61 * d2));
                            drawable3.draw(canvas3);
                            drawable3.setAlpha(nm7.d4);
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
                canvas.clipRect(0.0f, 0.0f, measuredWidth22, (measuredHeight22 + i2) - chatActivityEnterView.t7);
                float f382 = f8 - chatActivityEnterView.X4;
                if (f382 == 0.0f) {
                }
                if (chatActivityEnterView.Y4 >= 0.7f) {
                }
                chatActivityEnterView.T4 = false;
                f14 = chatActivityEnterView.f5;
                if (f14 != 0.0f) {
                }
                float N12 = gm.N(72.0f);
                float A3 = td4.A(1.0f, f39, gm.N(24.0f) * f12, N12 * f39);
                float f432 = chatActivityEnterView.f5;
                float A22 = td4.A(1.0f, f432, N12, A3);
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
                rectF7.set(f482 - gm.N(18.0f), f502, gm.N(18.0f) + f482, f512);
                z = this.y0;
                Paint paint42 = this.r;
                if (z) {
                }
                chatActivityEnterView.H4.set(rectF);
                RectF rectF82 = chatActivityEnterView.H4;
                float centerX4 = rectF82.centerX();
                float centerY4 = rectF82.centerY();
                rectF82.left = gm.R1(centerX4, rectF82.left, f472);
                rectF82.right = gm.R1(centerX4, rectF82.right, f472);
                rectF82.top = gm.R1(centerY4, rectF82.top, f472);
                rectF82.bottom = gm.R1(centerY4, rectF82.bottom, f472);
                hg5Var = lVar.a;
                if (hg5Var != null) {
                }
                float f522 = 1.0f - f4;
                float f532 = f17;
                rectF.set((f19 - gm.N(6.0f)) - (gm.N(f17) * f522), f492 - (gm.N(f17) * f522), aq1.e(f532, f522, gm.L(6.0f) + i3), aq1.e(f532, f522, f492 + gm.L(12.0f)));
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
                int saveLayerAlpha2 = canvas42.saveLayerAlpha(centerX22 - gm.L(24.0f), centerY22 - gm.L(24.0f), gm.L(24.0f) + centerX22, gm.L(24.0f) + centerY22, (int) (alpha3 * (1.0f - i92)), 31);
                Paint paint72 = lVar.w;
                paint72.setAlpha(nm7.d4);
                paint52.setAlpha(nm7.d4);
                float f562 = 1.0f - L4;
                canvas42.translate(0.0f, gm.N(2.0f) * f562);
                canvas42.rotate(f32, centerX22, centerY22);
                interpolation = d53.j.getInterpolation(Utilities.i(f4, 1.0f, 0.0f));
                i4 = Utilities.i(interpolation / f18, 1.0f, 0.0f);
                float interpolation42 = d53.g.getInterpolation(Utilities.i((interpolation - 0.3f) / 0.7f, 1.0f, 0.0f));
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
                float L52 = (gm.L(38.0f) * f16) + gm.R1(f31, lVar32.getMeasuredHeight() - gm.L(118.0f), Math.max(chatActivityEnterView.b5, Math.min(f552, chatActivityEnterView.f5))) + f592;
                rectF112.set(f19 - gm.N(18.0f), L52, gm.N(18.0f) + f19, L52 + f7);
                uz1 uz1Var2 = chatActivityEnterView.P3;
                if (uz1Var2 == null) {
                }
                chatActivityEnterView.Q = z2;
                if (z2) {
                }
                ln lnVar2 = lVar2.r0;
                lnVar2.getClass();
                e2 = lnVar2.e(false, 0.0f);
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
        int L = gm.L(250.0f);
        if (this.I != size) {
            this.I = size;
            StaticLayout staticLayout = new StaticLayout(this.e, this.n, gm.L(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
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
                    chatActivityEnterView.U1(!chatActivityEnterView.U1, true);
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
                RectF rectF3 = gm.P;
                rectF3.set(rectF);
                rectF3.inset(-gm.L(10.0f), -gm.L(10.0f));
                this.P0 = !rectF.isEmpty() && rectF3.contains((float) x, (float) y);
            }
            if (chatActivityEnterView.Q && chatActivityEnterView.D2 != null && chatActivityEnterView.c5 > 0.1f) {
                this.O0 = rectF2.contains(x, y);
            }
        } else if (motionEvent.getAction() == 1) {
            RectF rectF4 = gm.P;
            rectF4.set(rectF);
            rectF4.inset(-gm.L(10.0f), -gm.L(10.0f));
            if (this.P0 && rectF4.contains(x, y)) {
                if (chatActivityEnterView.l1 && !chatActivityEnterView.d1) {
                    this.O0 = false;
                    this.P0 = false;
                    if (chatActivityEnterView.v3) {
                        if (chatActivityEnterView.z6) {
                            chatActivityEnterView.m0(false, true);
                            chatActivityEnterView.z0().I(true);
                        } else {
                            sy1 sy1Var = chatActivityEnterView.F0;
                            if (sy1Var == null || sy1Var.length() == 0) {
                                chatActivityEnterView.k0();
                                return true;
                            }
                            chatActivityEnterView.m0(true, true);
                            un3 un3Var = chatActivityEnterView.j1;
                            if (un3Var != null && un3Var.o0 && un3Var.r == 1) {
                                un3Var.u();
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
                    chatActivityEnterView.P3.I0();
                } else {
                    fo1 fo1Var = new fo1(this, (byte) 15);
                    hg5 hg5Var = this.a;
                    if (hg5Var != null && hg5Var.W) {
                        e();
                    }
                    if (chatActivityEnterView.K1) {
                        chatActivityEnterView.U1(false, false);
                        gm.r(chatActivityEnterView.X1);
                        chatActivityEnterView.N1(true);
                    }
                    l49 l49Var = chatActivityEnterView.i1;
                    if (l49Var != null) {
                        l49Var.setPlaying(false);
                    }
                    if (!MediaController.w().F() || (chatActivityEnterView.i1.getAudioLeft() <= 0.01f && chatActivityEnterView.i1.getAudioRight() >= 0.99f)) {
                        fo1Var.run();
                    } else {
                        lx1 lx1Var = new lx1(this, fo1Var, (byte) 4);
                        if (oc7.d1().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.L4, getContext());
                            String M0 = jb6.M0(2131746081, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M0;
                            heVar.U = jb6.M0(2131746082, null);
                            alertDialog$Builder.j(jb6.M0(2131747564, null), new cd1((Object) lx1Var, (byte) 16));
                            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                            alertDialog$Builder.o();
                        } else {
                            lx1Var.run();
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
                hs6 d0 = hs6.d0(chatActivityEnterView.R);
                long j = chatActivityEnterView.G3;
                yv1 yv1Var = chatActivityEnterView.F3;
                d0.g2(j, (yv1Var == null || !yv1Var.x4) ? 0L : yv1Var.d(), chatActivityEnterView.P);
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

    public void setBlurredBackgroundFactory(km0 km0Var) {
        this.y0 = true;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        chatActivityEnterView.L1 = km0Var;
        bm0 bm0Var = this.x0;
        if (bm0Var == null) {
            bm0Var = new bm0(cmb.Qe, chatActivityEnterView.L4);
            this.x0 = bm0Var;
        }
        im0 c = km0Var.c(this, bm0Var, false);
        this.z0 = c;
        c.r(gm.L(18.0f));
        this.z0.q(gm.L(3.0f));
        im0 c2 = km0Var.c(this, this.x0, false);
        this.A0 = c2;
        c2.r(gm.L(18.0f));
        this.A0.q(gm.L(3.0f));
        im0 c3 = km0Var.c(this, this.x0, false);
        this.o0 = c3;
        c3.r(gm.L(18.0f));
        this.o0.q(gm.L(3.0f));
        im0 c4 = km0Var.c(this, this.x0, false);
        this.R = c4;
        c4.r(gm.L(18.0f));
        im0 im0Var = this.R;
        im0Var.X = 0.0f;
        im0Var.q(gm.L(3.0f));
        this.B0 = false;
        updateColors();
    }

    @Override // vlb
    public final void updateColors() {
        TextPaint textPaint;
        Drawable drawable;
        Drawable drawable2;
        int i;
        oc1 oc1Var = this.E;
        if (oc1Var == null || (textPaint = this.n) == null || (drawable = this.F) == null || (drawable2 = this.G) == null) {
            return;
        }
        bm0 bm0Var = this.x0;
        if (bm0Var != null) {
            bm0Var.d();
        }
        im0 im0Var = this.z0;
        if (im0Var != null) {
            im0Var.updateColors();
        }
        im0 im0Var2 = this.A0;
        if (im0Var2 != null) {
            im0Var2.updateColors();
        }
        im0 im0Var3 = this.o0;
        if (im0Var3 != null) {
            im0Var3.updateColors();
        }
        im0 im0Var4 = this.R;
        if (im0Var4 != null) {
            im0Var4.updateColors();
        }
        int i2 = this.y0 ? cmb.Ml : cmb.Pe;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        oc1Var.e(chatActivityEnterView.F0(i2), chatActivityEnterView.F0(cmb.Tf), -1);
        textPaint.setColor(chatActivityEnterView.F0(cmb.fg));
        ShapeDrawable shapeDrawable = this.c;
        if (shapeDrawable != null) {
            i = cmb.gg;
            cmb.A1(chatActivityEnterView.F0(i), shapeDrawable);
        } else {
            int L = gm.L(5.0f);
            i = cmb.gg;
            this.c = cmb.b0(L, chatActivityEnterView.F0(i));
        }
        int F0 = chatActivityEnterView.F0(i);
        Drawable drawable3 = this.d;
        if (drawable3 != null && F0 != this.L0) {
            this.L0 = F0;
            drawable3.setColorFilter(new PorterDuffColorFilter(F0, PorterDuff.Mode.SRC_IN));
        }
        this.r.setColor(chatActivityEnterView.F0(cmb.Qe));
        this.s.setColor(chatActivityEnterView.F0(this.y0 ? cmb.Ml : cmb.Pe));
        this.w.setColor(chatActivityEnterView.F0(this.y0 ? cmb.Ml : cmb.Pe));
        int F02 = chatActivityEnterView.F0(this.y0 ? cmb.Ml : cmb.Pe);
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

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
