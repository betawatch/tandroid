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
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.SystemClock;
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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class l extends FrameLayout implements snb {
    public final int[] A0;
    public cl0 B0;
    public boolean C0;
    public jl0 D0;
    public final pb1 E;
    public jl0 E0;
    public final Drawable F;
    public boolean F0;
    public final Drawable G;
    public int G0;
    public final k H;
    public final Paint H0;
    public int I;
    public final Paint I0;
    public final RectF J;
    public final Paint J0;
    public final RectF K;
    public final Path K0;
    public long L;
    public final Matrix L0;
    public final Path M;
    public final RectF M0;
    public final float[] N;
    public final jl0[] N0;
    public final float[] O;
    public final rg7 O0;
    public final mm P;
    public int P0;
    public final RectF Q;
    public int Q0;
    public jl0 R;
    public boolean R0;
    public final Paint S;
    public boolean S0;
    public final Paint T;
    public boolean T0;
    public final Paint U;
    public final /* synthetic */ ChatActivityEnterView U0;
    public final mm V;
    public final mm W;
    public dz1 a;
    public final mm a0;
    public dz1 b;
    public final mm b0;
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
    public final mm h0;
    public final mm i0;
    public final Paint j0;
    public final Paint k0;
    public final Path l0;
    public final Matrix m0;
    public final TextPaint n;
    public float n0;
    public final Paint o0;
    public final Paint p0;
    public final Paint q0;
    public final Paint r;
    public final RectF r0;
    public final Paint s;
    public jl0 s0;
    public final RectF t0;
    public final Paint u0;
    public final mm v0;
    public final Paint w;
    public final mm w0;
    public final Path x;
    public final mm x0;
    public final Paint y;
    public int y0;
    public final int[] z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.U0 = chatActivityEnterView;
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
        k43 k43Var = k43.h;
        this.P = new mm(this, 0L, 350L, k43Var);
        this.Q = new RectF();
        this.S = new Paint(1);
        this.T = new Paint(1);
        this.U = new Paint(1);
        this.V = new mm(this, 0L, 320L, k43Var);
        this.W = new mm(this, 0L, 260L, k43.k);
        this.a0 = new mm(this, 0L, 60L, k43Var);
        this.b0 = new mm(this, 0L, 180L, k43Var);
        this.d0 = new Path();
        this.e0 = new Path();
        this.f0 = new Path();
        this.g0 = new Paint(1);
        this.h0 = new mm(this, 0L, 220L, k43Var);
        this.i0 = new mm(this, 0L, 220L, k43Var);
        this.j0 = new Paint(1);
        this.k0 = new Paint(1);
        this.l0 = new Path();
        this.m0 = new Matrix();
        this.o0 = new Paint();
        this.p0 = new Paint();
        Paint paint2 = new Paint(1);
        this.q0 = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.r0 = new RectF();
        this.t0 = new RectF();
        new TextPaint(1);
        new Paint(1);
        new Paint(1);
        this.u0 = new Paint(1);
        this.v0 = new mm(this, 0L, 380L, k43Var);
        this.w0 = new mm(this, 0L, 300L, k43Var);
        this.x0 = new mm(this, 0L, 180L, k43Var);
        this.y0 = -1;
        this.z0 = new int[2];
        this.A0 = new int[2];
        this.H0 = new Paint(1);
        this.I0 = new Paint(1);
        this.J0 = new Paint(1);
        this.K0 = new Path();
        this.L0 = new Matrix();
        this.M0 = new RectF();
        this.N0 = new jl0[3];
        this.O0 = new rg7((byte) 15);
        k kVar = new k(this, this);
        this.H = kVar;
        ihc.l(this, kVar);
        pb1 pb1Var = new pb1(5);
        this.E = pb1Var;
        pb1Var.setCallback(this);
        pb1Var.p = true;
        pb1Var.f(1, chatActivityEnterView.P, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(hl.N(1.7f));
        Drawable drawable = getResources().getDrawable(R.drawable.lock_round_shadow);
        chatActivityEnterView.J4 = drawable;
        yob.x(this, drawable, aob.Se, chatActivityEnterView.K4, PorterDuff.Mode.MULTIPLY);
        this.c = aob.b0(hl.L(5.0f), chatActivityEnterView.J0(aob.hg));
        textPaint.setTextSize(hl.L(14.0f));
        this.d = context.getDrawable(R.drawable.tooltip_arrow);
        this.e = ob6.M0(2131745040, "SlideUpToLock");
        float L = hl.L(3.0f);
        float L2 = hl.L(3.0f);
        this.F = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.G = getResources().getDrawable(R.drawable.input_video).mutate();
        setWillNotDraw(false);
        updateColors();
    }

    public static float g() {
        float currentTimeMillis = (System.currentTimeMillis() % 2000) / 2000.0f;
        return currentTimeMillis < 0.5f ? (currentTimeMillis * 4.0f) - 1.0f : 3.0f - (currentTimeMillis * 4.0f);
    }

    private void setupHintPaint(float f) {
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.g0;
        paint.setStyle(style);
        paint.setStrokeWidth(hl.N(1.6f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        int i = aob.d6;
        ChatActivityEnterView chatActivityEnterView = this.U0;
        paint.setColor(hl.B(chatActivityEnterView.J0(i)) < 0.5f ? this.s.getColor() : chatActivityEnterView.J0(aob.eg));
        paint.setAlpha((int) (Color.alpha(r4) * f));
    }

    public final void a() {
        Path path = this.d0;
        if (path.isEmpty()) {
            float N = hl.N(0.3f);
            float N2 = hl.N(3.9f) + N;
            float f = -hl.N(6.2f);
            float N3 = hl.N(6.2f);
            float N4 = hl.N(4.6f);
            path.moveTo(N2 - N4, N3);
            path.lineTo(N2, f);
            path.lineTo(N2 + N4, N3);
            float f2 = N4 * 0.6f;
            path.moveTo(N2 - f2, hl.N(2.1f));
            path.lineTo(N2 + f2, hl.N(2.1f));
            float f3 = -hl.N(0.6f);
            float N5 = N - hl.N(2.6f);
            float N6 = N - hl.N(9.2f);
            Path path2 = this.e0;
            path2.moveTo(N6, f3);
            path2.lineTo(N5, f3);
            path2.moveTo(N5 - hl.N(3.2f), f3 - hl.N(4.0f));
            path2.lineTo(N5, f3);
            path2.lineTo(N5 - hl.N(3.2f), hl.N(4.0f) + f3);
            float f4 = -hl.N(5.0f);
            float N7 = hl.N(4.0f);
            Path path3 = this.f0;
            path3.moveTo(f4, N7);
            path3.lineTo(0.0f, 0.0f);
            path3.lineTo(hl.N(5.0f), hl.N(4.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03bd  */
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
        int x1;
        ChatActivityEnterView chatActivityEnterView;
        int i3;
        int i4;
        float f18;
        boolean z2;
        float i5;
        ChatActivityEnterView chatActivityEnterView2 = this.U0;
        float max = Math.max(0.0f, f3) * this.V.d(chatActivityEnterView2.t0() && !chatActivityEnterView2.i5 && chatActivityEnterView2.d5 == 0.0f && chatActivityEnterView2.u3 && !chatActivityEnterView2.j5);
        RectF rectF2 = this.Q;
        if (max <= 0.01f) {
            rectF2.setEmpty();
            return;
        }
        a();
        mm mmVar = this.W;
        mmVar.getClass();
        float max2 = Math.max(mmVar.e(false, 0.0f), this.b0.d(this.c0));
        float max3 = Math.max(this.a0.e(false, chatActivityEnterView2.w1), this.c0 ? 1.0f : 0.0f);
        float L = hl.L(36.0f);
        float f19 = L / 2.0f;
        float R1 = hl.R1(hl.L(64.0f), L, max3);
        float L2 = hl.L(79.0f);
        float L3 = ((hl.L(64.0f) - R1) / 2.0f) * 0.70710677f;
        float round = Math.round(f - L2) - L3;
        float round2 = Math.round(((f2 + hl.L(170.0f)) - L2) + f4) - L3;
        float f20 = R1 / 2.0f;
        float f21 = round2 - f20;
        float f22 = round2 + f20;
        rectF2.set(round - f20, f21, round + f20, f22);
        float max4 = ((Math.max(0.0f, max2) * 0.08f) + (0.04f * max3) + 1.0f) * ((0.4f * max) + 0.6f);
        canvas.save();
        float L4 = f2 + hl.L(170.0f) + f4;
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
            i = canvas2.saveLayerAlpha(round - R1, round2 - R1, hl.L(30.0f) + f, hl.L(30.0f) + L4, (int) (max * 255.0f));
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
        canvas2.scale(f11, f11, hl.R1(f9, f, f12), hl.R1(f10, f5, f12));
        int J0 = chatActivityEnterView2.J0(aob.Pe);
        if (max2 > f7) {
            float f23 = R1 * 0.95f;
            RadialGradient radialGradient = new RadialGradient(f9, f10, f23, new int[]{aob.p1(0.5f, J0), aob.p1(0.16f, J0), 0}, new float[]{0.3f, 0.62f, 1.0f}, Shader.TileMode.CLAMP);
            Paint paint = this.T;
            paint.setShader(radialGradient);
            paint.setAlpha((int) (Math.min(1.0f, max2) * 255.0f));
            canvas2.drawCircle(f9, f10, f23, paint);
        }
        boolean z3 = hl.B(chatActivityEnterView2.J0(aob.d6)) < 0.5f;
        RectF rectF3 = hl.P;
        float f24 = f9 - f19;
        float f25 = f9 + f19;
        float f26 = f6;
        rectF3.set(f24, f26, f25, f22);
        if (this.C0) {
            float f27 = f9;
            i2 = i;
            f14 = f27;
            f13 = f10;
            z = z3;
            f15 = f25;
            f16 = f26;
            f17 = f19;
            c(canvas, rectF3, f17, -45.0f, f14, f13, e(2));
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
        if (this.F0) {
            x1 = this.G0;
        } else {
            cl0 cl0Var = this.B0;
            x1 = cl0Var != null ? cl0Var.x1() : 0;
        }
        if (this.C0 || Color.alpha(x1) <= 0) {
            chatActivityEnterView = chatActivityEnterView2;
            i3 = J0;
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
            i3 = J0;
            f18 = max2;
            paint2.setShadowLayer(hl.N(1.0f), 0.0f, hl.N(0.33333334f), x1);
            canvas3.drawPath(path, paint2);
        }
        canvas3.save();
        canvas3.rotate(-45.0f, f14, f13);
        rectF.set(f24, f16, f15, f22);
        if (!this.C0) {
            jl0 jl0Var = this.R;
            if (jl0Var != null) {
                jl0Var.setBounds((int) (rectF.left - hl.N(3.0f)), (int) (rectF.top - hl.N(3.0f)), (int) (hl.N(3.0f) + rectF.right), (int) (hl.N(3.0f) + rectF.bottom));
                this.R.setAlpha(jn7.d4);
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
        paint4.setStrokeWidth(hl.N(0.66f));
        paint4.setColor(z ? 654311423 : 436207616);
        paint4.setAlpha((int) ((1.0f - i6) * Color.alpha(paint4.getColor())));
        rectF.inset(hl.N(0.33f), hl.N(0.33f));
        canvas3.drawRoundRect(rectF, f17, f17, paint4);
        canvas3.restore();
        float f28 = f20 - f17;
        Paint paint5 = this.U;
        paint5.setStyle(style);
        paint5.setStrokeWidth(hl.N(1.9f));
        paint5.setStrokeCap(Paint.Cap.ROUND);
        paint5.setStrokeJoin(Paint.Join.ROUND);
        paint5.setColor(vm2.f(i6, this.s.getColor(), -1));
        canvas3.save();
        canvas3.translate(((f28 - hl.N(2.0f)) * (-0.70710677f)) + f14, ((f28 - hl.N(2.0f)) * (-0.70710677f)) + f13);
        canvas3.drawPath(this.d0, paint5);
        mm mmVar2 = this.i0;
        float f29 = f8 * 1.4f;
        float N = hl.N(1.5f) * (1.0f - Utilities.i(f29, 1.0f, 0.0f)) * mmVar2.c;
        float g = (g() + 1.0f) / 2.0f;
        canvas3.translate((3.0f - (g * 2.0f)) * g * g * N, 0.0f);
        paint5.setStrokeWidth(hl.N(1.6f));
        canvas3.drawPath(this.e0, paint5);
        paint5.setStrokeWidth(hl.N(1.9f));
        canvas3.restore();
        if (!this.c0) {
            ChatActivityEnterView chatActivityEnterView3 = chatActivityEnterView;
            if (chatActivityEnterView3.u3 && !chatActivityEnterView3.j5) {
                z2 = true;
                i5 = (1.0f - Utilities.i(f29, 1.0f, 0.0f)) * mmVar2.d(z2);
                if (i5 > f7) {
                    setupHintPaint(i5);
                    float g2 = (g() * hl.N(2.5f)) + (-(f28 - hl.N(3.0f)));
                    canvas3.save();
                    float f30 = g2 * (-0.70710677f);
                    canvas3.translate(f14 + f30, f13 + f30);
                    canvas3.rotate(-45.0f);
                    d(canvas3);
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
        i5 = (1.0f - Utilities.i(f29, 1.0f, 0.0f)) * mmVar2.d(z2);
        if (i5 > f7) {
        }
        if (i4 >= 0) {
        }
        canvas3.restore();
        invalidate();
    }

    public final void c(Canvas canvas, RectF rectF, float f, float f2, float f3, float f4, jl0 jl0Var) {
        byte b;
        int i = aob.d6;
        ChatActivityEnterView chatActivityEnterView = this.U0;
        boolean z = hl.B(chatActivityEnterView.J0(i)) < 0.5f;
        Path path = this.K0;
        path.rewind();
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        if (f2 != 0.0f) {
            Matrix matrix = this.L0;
            matrix.setRotate(f2, f3, f4);
            path.transform(matrix);
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        Paint paint = this.J0;
        paint.setColor(-16777216);
        snc sncVar = chatActivityEnterView.r1;
        if (sncVar == null || (!((b = sncVar.c) == 2 || b == 3) || sncVar.K)) {
            paint.setShadowLayer(hl.N(8.0f), 0.0f, hl.N(2.0f), aob.p1((z ? 0.4f : 0.16f) * 1.0f, -16777216));
        } else {
            paint.setShadowLayer(hl.N(1.2f), 0.0f, 0.0f, aob.p1((z ? 0.36f : 0.12f) * 1.0f, -16777216));
        }
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.save();
        canvas.clipPath(path);
        if (jl0Var != null) {
            RectF rectF2 = this.M0;
            path.computeBounds(rectF2, true);
            jl0Var.setBounds(((int) rectF2.left) - hl.L(3.0f), ((int) rectF2.top) - hl.L(3.0f), hl.L(3.0f) + ((int) rectF2.right), hl.L(3.0f) + ((int) rectF2.bottom));
            jl0Var.setAlpha(jn7.d4);
            jl0Var.draw(canvas);
        }
        int i2 = z ? -1943655888 : -989855745;
        Paint paint2 = this.H0;
        paint2.setColor(i2);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * 1.0f));
        canvas.drawPaint(paint2);
        canvas.restore();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.I0;
        paint3.setStyle(style);
        paint3.setStrokeWidth(Math.max(1.0f, hl.N(0.5f)));
        paint3.setColor(z ? 620756991 : 385875968);
        paint3.setAlpha((int) (Color.alpha(paint3.getColor()) * 1.0f));
        canvas.drawPath(path, paint3);
    }

    public final void d(Canvas canvas) {
        ChatActivityEnterView chatActivityEnterView = this.U0;
        Paint paint = chatActivityEnterView.r7 ? chatActivityEnterView.p7 : null;
        Paint paint2 = this.g0;
        Path path = this.f0;
        if (paint == null) {
            canvas.drawPath(path, paint2);
            return;
        }
        RectF rectF = this.r0;
        path.computeBounds(rectF, true);
        rectF.inset(-hl.L(3.0f), -hl.L(3.0f));
        Paint paint3 = this.p0;
        paint3.set(paint);
        int saveLayer = canvas.saveLayer(rectF, paint3);
        canvas.drawPath(path, paint2);
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent) || this.H.f(motionEvent);
    }

    public final jl0 e(int i) {
        ll0 ll0Var = this.U0.K1;
        if (ll0Var == null) {
            return null;
        }
        jl0[] jl0VarArr = this.N0;
        if (jl0VarArr[i] == null) {
            jl0 c = ll0Var.c(this, this.O0, false);
            jl0VarArr[i] = c;
            c.r(0.0f);
            jl0VarArr[i].X = 0.0f;
        }
        return jl0VarArr[i];
    }

    public final void f() {
        dz1 dz1Var = this.a;
        if (dz1Var != null) {
            dz1Var.r0 = new yy1(this, dz1Var, (byte) 0);
            dz1Var.f(true);
            this.a = null;
        }
        dz1 dz1Var2 = this.b;
        if (dz1Var2 != null) {
            dz1Var2.r0 = new yy1(this, dz1Var2, (byte) 1);
            dz1Var2.f(true);
            this.b = null;
        }
    }

    public final int h(float f, float f2) {
        RectF rectF = this.t0;
        if (!rectF.isEmpty() && this.v0.c >= 0.8f) {
            RectF rectF2 = hl.P;
            rectF2.set(rectF);
            rectF2.inset(-hl.L(6.0f), -hl.L(6.0f));
            if (rectF2.contains(f, f2)) {
                return 0;
            }
        }
        return -1;
    }

    public final void i() {
        f();
        dz1 dz1Var = new dz1(getContext());
        this.b = dz1Var;
        dz1Var.n(1.0f, 0.0f);
        this.b.p(true);
        this.b.m(15.0f, 8.0f, 8.0f, 8.0f);
        ChatActivityEnterView chatActivityEnterView = this.U0;
        boolean z = chatActivityEnterView.d1;
        boolean z2 = chatActivityEnterView.P;
        this.b.t(hl.S2(ob6.M0(z ? z2 ? 2131743234 : 2131743235 : z2 ? 2131743162 : 2131743163, null)));
        dz1 dz1Var2 = this.b;
        dz1Var2.h = kg5.a(dz1Var2.getText(), this.b.getTextPaint());
        if (chatActivityEnterView.P) {
            dz1 dz1Var3 = this.b;
            dz1Var3.getClass();
            b29 b29Var = new b29(R.raw.fire_on, hl.L(34.0f), hl.L(34.0f));
            b29Var.start();
            dz1Var3.l(b29Var);
        } else {
            uc7.e1().edit().putInt("voiceoncehint", uc7.e1().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.b, tre.d(-1, -1.0f, jn7.D1, 0.0f, 0.0f, 54.0f, 58.0f));
        dz1 dz1Var4 = this.b;
        dz1Var4.r0 = new yy1(this, dz1Var4, (byte) 3);
        dz1Var4.v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x0202, code lost:
    
        if (r13.U4 != 0.0f) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0882  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0974  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x09c1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0a0c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0a95  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0aa8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0ba8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0bb9  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0baa  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0b8b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0936  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04a6  */
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
        boolean z;
        boolean z2;
        float i3;
        boolean z3;
        RectF rectF;
        float f14;
        float f15;
        int i4;
        float f16;
        char c;
        float f17;
        l lVar;
        Canvas canvas2;
        dz1 dz1Var;
        float i5;
        Paint paint;
        Paint paint2;
        float f18;
        float f19;
        Paint paint3;
        float f20;
        float f21;
        int i6;
        float f22;
        float f23;
        RectF rectF2;
        Canvas canvas3;
        Paint paint4;
        float f24;
        int saveLayerAlpha;
        float interpolation;
        float i7;
        float f25;
        RectF rectF3;
        float f26;
        Drawable drawable;
        Paint paint5;
        RectF rectF4;
        float i8;
        boolean z4;
        l lVar2;
        Canvas canvas4;
        float e2;
        RectF rectF5;
        RectF rectF6;
        float f27;
        rw1 rw1Var;
        float f28;
        float f29;
        int i9;
        z92 G0;
        jl0 jl0Var;
        bl0 bl0Var;
        boolean z5 = this.F0;
        ChatActivityEnterView chatActivityEnterView = this.U0;
        if (!z5 && chatActivityEnterView.K1 != null && (G0 = chatActivityEnterView.G0()) != null && (jl0Var = G0.r) != null && (bl0Var = jl0Var.w) != null) {
            jl0 c2 = chatActivityEnterView.K1.c(this, bl0Var, false);
            this.D0 = c2;
            c2.r(hl.L(18.0f));
            this.D0.q(hl.L(3.0f));
            this.D0.X = 0.0f;
            jl0 c3 = chatActivityEnterView.K1.c(this, bl0Var, false);
            this.E0 = c3;
            c3.r(hl.L(18.0f));
            this.E0.q(hl.L(3.0f));
            this.E0.X = 0.0f;
            jl0 c4 = chatActivityEnterView.K1.c(this, bl0Var, false);
            this.R = c4;
            c4.r(0.0f);
            jl0 jl0Var2 = this.R;
            jl0Var2.X = 0.0f;
            jl0Var2.q(hl.L(3.0f));
            this.G0 = bl0Var.x1();
            this.F0 = true;
        }
        float f30 = chatActivityEnterView.V4;
        float f31 = f30 <= 0.5f ? f30 / 0.5f : f30 <= 0.75f ? 1.0f - (((f30 - 0.5f) / 0.25f) * 0.1f) : (((f30 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        long currentTimeMillis = System.currentTimeMillis() - this.L;
        this.L = System.currentTimeMillis();
        float f32 = chatActivityEnterView.Z4;
        if (f32 != 10000.0f) {
            float max = Math.max(0.0f, chatActivityEnterView.Y4 - f32);
            float L3 = hl.L(5.0f);
            if (max <= L3) {
                f = 0.75f;
                f2 = 0.0f;
            } else {
                f = 0.75f;
                f2 = Math.round(((max - L3) * hl.L(57.0f)) / (hl.L(57.0f) - L3));
            }
            if (f2 > hl.L(57.0f)) {
                f2 = hl.L(57.0f);
            }
        } else {
            f = 0.75f;
            f2 = 0.0f;
        }
        int measuredWidth = getMeasuredWidth() - hl.M(26.0f);
        float L4 = 1.0f - (f2 / hl.L(57.0f));
        float measuredHeight = getMeasuredHeight() - hl.L(194.0f);
        if (chatActivityEnterView.j5) {
            L = hl.L(36.0f);
            L2 = bp1.e(14.0f, L4, (((1.0f - f31) * hl.N(30.0f)) + (hl.L(60.0f) + measuredHeight)) - f2);
            e = hl.N(2.0f) + (((L / 2.0f) + L2) - hl.N(8.0f));
            float f33 = L4 > 0.4f ? 1.0f : L4 / 0.4f;
            float f34 = chatActivityEnterView.b5;
            f3 = qu6.B(1.0f, f33, f34 * 15.0f, (1.0f - L4) * 9.0f * (1.0f - f34));
            f4 = L4;
        } else {
            L = hl.L(36.0f) + ((int) (hl.L(28.0f) * L4));
            L2 = (((hl.L(60.0f) - (hl.L(14.0f) * L4)) + measuredHeight) + ((int) ((1.0f - f31) * hl.L(30.0f)))) - ((int) f2);
            e = bp1.e(2.0f, L4, hl.N(2.0f) + (((L / 2.0f) + L2) - hl.N(8.0f))) - (hl.N(10.0f) * L4);
            f3 = (1.0f - L4) * 9.0f;
            chatActivityEnterView.b5 = 0.0f;
            f4 = 0.0f;
        }
        float f35 = e;
        float f36 = L2;
        float f37 = f3;
        boolean z6 = chatActivityEnterView.S4;
        RectF rectF7 = this.J;
        if (z6) {
            j = currentTimeMillis;
            i = 2;
            if (System.currentTimeMillis() - chatActivityEnterView.T4 > 200) {
                f5 = 0.0f;
                if (L4 < 0.8f || chatActivityEnterView.j5 || chatActivityEnterView.a5 != f5 || chatActivityEnterView.d5 != f5) {
                    chatActivityEnterView.S4 = false;
                }
                boolean z7 = chatActivityEnterView.S4;
                float f38 = chatActivityEnterView.U4;
                if (z7) {
                    i9 = i;
                    if (f38 != 1.0f) {
                        float f39 = (j / 150.0f) + f38;
                        chatActivityEnterView.U4 = f39;
                        if (f39 >= 1.0f) {
                            chatActivityEnterView.U4 = 1.0f;
                            boolean z8 = xea.a;
                            SharedPreferences.Editor edit = uc7.e1().edit();
                            int i10 = xea.N + 1;
                            xea.N = i10;
                            edit.putInt("lockRecordAudioVideoHint", i10);
                            edit.apply();
                        }
                    }
                } else {
                    i9 = i;
                    float f40 = f38 - (j / 150.0f);
                    chatActivityEnterView.U4 = f40;
                    if (f40 < 0.0f) {
                        chatActivityEnterView.U4 = 0.0f;
                    }
                }
                int i11 = (int) (chatActivityEnterView.U4 * 255.0f);
                this.c.setAlpha(i11);
                Drawable drawable2 = this.d;
                drawable2.setAlpha(i11);
                this.n.setAlpha(i11);
                if (this.f != null) {
                    canvas.save();
                    f8 = 1.0f;
                    rectF7.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.translate((getMeasuredWidth() - this.h) - hl.L(44.0f), hl.N(16.0f) + measuredHeight);
                    f6 = measuredHeight;
                    f7 = L;
                    this.c.setBounds(-hl.L(8.0f), -hl.L(2.0f), (int) (this.h + hl.L(36.0f)), (int) (hl.N(4.0f) + this.f.getHeight()));
                    this.c.draw(canvas);
                    this.f.draw(canvas);
                    canvas.restore();
                    canvas.save();
                    canvas.translate(getMeasuredWidth() - hl.L(26.0f), ((this.f.getHeight() / 2.0f) + (hl.N(17.0f) + f6)) - (hl.N(3.0f) * chatActivityEnterView.c5));
                    Path path = this.x;
                    path.reset();
                    path.setLastPoint(-hl.N(5.0f), hl.N(4.0f));
                    path.lineTo(0.0f, 0.0f);
                    path.lineTo(hl.N(5.0f), hl.N(4.0f));
                    Paint paint6 = this.y;
                    paint6.setColor(-1);
                    paint6.setAlpha(i11);
                    paint6.setStyle(Paint.Style.STROKE);
                    paint6.setStrokeCap(Paint.Cap.ROUND);
                    paint6.setStrokeJoin(Paint.Join.ROUND);
                    paint6.setStrokeWidth(hl.N(1.5f));
                    canvas.drawPath(path, paint6);
                    canvas.restore();
                    canvas.save();
                    drawable2.setBounds(measuredWidth - (drawable2.getIntrinsicWidth() / 2), (int) (hl.N(20.0f) + this.f.getHeight() + f6), bp1.w(i9, measuredWidth, drawable2), drawable2.getIntrinsicHeight() + ((int) (hl.N(20.0f) + this.f.getHeight() + f6)));
                    drawable2.draw(canvas);
                    canvas.restore();
                    float d = this.P.d(!chatActivityEnterView.d1 && chatActivityEnterView.X1 >= 59000);
                    f9 = chatActivityEnterView.d5;
                    if (f9 != 0.0f || chatActivityEnterView.i1 == null) {
                        f10 = chatActivityEnterView.a5;
                        if (f10 == 0.0f) {
                            float f41 = f10 > 0.6f ? f8 : f10 / 0.6f;
                            if (!chatActivityEnterView.h0) {
                                f10 = bp1.f(f10, 0.6f, 0.4f, 0.0f);
                            }
                            k43 k43Var = k43.j;
                            float interpolation2 = k43Var.getInterpolation(f41);
                            f11 = k43Var.getInterpolation(f10);
                            f12 = interpolation2;
                        } else {
                            f11 = 0.0f;
                            f12 = 0.0f;
                        }
                    } else {
                        float f42 = f9 > 0.38f ? f8 : f9 / 0.38f;
                        if (f9 > 0.63f) {
                            f29 = f8;
                            f28 = 0.0f;
                        } else {
                            f28 = 0.0f;
                            f29 = bp1.f(f9, 0.38f, 0.25f, 0.0f);
                        }
                        k43 k43Var2 = k43.j;
                        float interpolation3 = k43Var2.getInterpolation(f42);
                        k43Var2.getInterpolation(f29);
                        f11 = f28;
                        f12 = interpolation3;
                    }
                    if (chatActivityEnterView.l1) {
                        post(new fw1(chatActivityEnterView, (byte) 27));
                    }
                    canvas.save();
                    float measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight() - chatActivityEnterView.o2.getMeasuredHeight();
                    if (chatActivityEnterView.J1 || !chatActivityEnterView.Z5 || (rw1Var = chatActivityEnterView.f1) == null || rw1Var.getVisibility() != 0) {
                        f13 = f11;
                        i2 = 0;
                    } else {
                        f13 = f11;
                        i2 = c00.d(44.0f, chatActivityEnterView.n2.getMeasuredHeight(), 0);
                    }
                    canvas.clipRect(0.0f, 0.0f, measuredWidth2, (measuredHeight2 + i2) - chatActivityEnterView.Q7);
                    float f43 = f8 - chatActivityEnterView.W4;
                    float f44 = f43 == 0.0f ? f43 : f13 != 0.0f ? f13 : 0.0f;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    float min = chatActivityEnterView.h5 != 0 ? Math.min(48.0f, uptimeMillis - r14) : 16.0f;
                    chatActivityEnterView.h5 = uptimeMillis;
                    if (!chatActivityEnterView.i5) {
                        float f45 = chatActivityEnterView.X4;
                        if (f45 >= 0.65f) {
                            if (f45 > f) {
                                chatActivityEnterView.g5 = true;
                            }
                            z = false;
                            z2 = chatActivityEnterView.g5;
                            if (!z2) {
                                chatActivityEnterView.S4 = z;
                            }
                            i3 = Utilities.i(qu6.d(z2 ? f8 : -1.0f, min, 240.0f, chatActivityEnterView.f5), f8, 0.0f);
                            chatActivityEnterView.f5 = i3;
                            chatActivityEnterView.e5 = xnb.B(i3, 2.0f, 3.0f, i3 * i3);
                            if (i3 > 0.0f && i3 < f8) {
                                invalidate();
                            }
                            float N = hl.N(72.0f);
                            float A = qd4.A(1.0f, f44, hl.N(24.0f) * f12, N * f44);
                            float f46 = chatActivityEnterView.e5;
                            float A2 = qd4.A(1.0f, f46, N, A);
                            float f47 = A2 > N ? N : A2;
                            float f48 = 1.0f - d;
                            float f49 = 1.0f - f13;
                            float f50 = chatActivityEnterView.W4 * f48 * f49 * f46;
                            float f51 = measuredWidth;
                            float f52 = f35 + f47;
                            canvas.scale(f50, f50, f51, f52);
                            float f53 = f36 + f47;
                            float f54 = f53 + f7;
                            rectF7.set(f51 - hl.N(18.0f), f53, hl.N(18.0f) + f51, f54);
                            z3 = this.C0;
                            Paint paint7 = this.r;
                            if (z3) {
                                i4 = measuredWidth;
                                f14 = f51;
                                f15 = f54;
                                f16 = 0.4f;
                                c = 2;
                                f17 = 2.0f;
                                c(canvas, rectF7, hl.N(18.0f), 0.0f, 0.0f, 0.0f, e(0));
                                lVar = this;
                                canvas2 = canvas;
                                rectF = rectF7;
                            } else {
                                rectF = rectF7;
                                f14 = f51;
                                f15 = f54;
                                i4 = measuredWidth;
                                f16 = 0.4f;
                                c = 2;
                                f17 = 2.0f;
                                lVar = this;
                                canvas2 = canvas;
                                jl0 jl0Var3 = lVar.D0;
                                if (jl0Var3 != null) {
                                    jl0Var3.setBounds((int) (rectF.left - hl.N(3.0f)), (int) (rectF.top - hl.N(3.0f)), (int) (hl.N(3.0f) + rectF.right), (int) (hl.N(3.0f) + rectF.bottom));
                                    lVar.D0.draw(canvas2);
                                } else {
                                    chatActivityEnterView.J4.setBounds((int) (rectF.left - hl.N(3.0f)), (int) (rectF.top - hl.N(3.0f)), (int) (hl.N(3.0f) + rectF.right), (int) (hl.N(3.0f) + rectF.bottom));
                                    chatActivityEnterView.J4.draw(canvas2);
                                    canvas2.drawRoundRect(rectF, hl.N(18.0f), hl.N(18.0f), paint7);
                                }
                            }
                            chatActivityEnterView.G4.set(rectF);
                            RectF rectF8 = chatActivityEnterView.G4;
                            float centerX = rectF8.centerX();
                            float centerY = rectF8.centerY();
                            rectF8.left = hl.R1(centerX, rectF8.left, f50);
                            rectF8.right = hl.R1(centerX, rectF8.right, f50);
                            rectF8.top = hl.R1(centerY, rectF8.top, f50);
                            rectF8.bottom = hl.R1(centerY, rectF8.bottom, f50);
                            dz1Var = lVar.a;
                            if (dz1Var != null) {
                                dz1Var.o(0.0f, rectF.centerY());
                                lVar.a.invalidate();
                            }
                            float f55 = 1.0f - f4;
                            float f56 = f17;
                            rectF.set((f14 - hl.N(6.0f)) - (hl.N(f17) * f55), f52 - (hl.N(f17) * f55), bp1.e(f56, f55, hl.L(6.0f) + i4), bp1.e(f56, f55, f52 + hl.L(12.0f)));
                            float f57 = rectF.bottom;
                            float centerX2 = rectF.centerX();
                            float centerY2 = rectF.centerY();
                            canvas2.save();
                            i5 = Utilities.i(Math.max(chatActivityEnterView.d5, chatActivityEnterView.U6) * f56, 1.0f, 0.0f);
                            Paint paint8 = lVar.s;
                            int alpha = paint8.getAlpha();
                            Drawable drawable3 = null;
                            paint = chatActivityEnterView.r7 ? chatActivityEnterView.p7 : null;
                            if (paint != null) {
                                Paint paint9 = lVar.o0;
                                paint9.set(paint);
                                paint9.setAlpha((int) ((alpha / 255.0f) * paint.getAlpha() * (1.0f - i5)));
                                paint2 = paint;
                                f18 = f57;
                                paint3 = paint8;
                                f19 = 2.0f;
                                saveLayerAlpha = canvas.saveLayer(centerX2 - hl.L(24.0f), centerY2 - hl.L(24.0f), centerX2 + hl.L(24.0f), hl.L(24.0f) + centerY2, paint9);
                                f20 = f12;
                                f21 = centerY2;
                                canvas3 = canvas;
                                i6 = alpha;
                                f22 = f36;
                                f23 = centerX2;
                                rectF2 = rectF;
                                paint4 = paint7;
                                f24 = 1.0f;
                            } else {
                                paint2 = paint;
                                f18 = f57;
                                f19 = 2.0f;
                                paint3 = paint8;
                                f20 = f12;
                                f21 = centerY2;
                                i6 = alpha;
                                f22 = f36;
                                f23 = centerX2;
                                rectF2 = rectF;
                                canvas3 = canvas;
                                paint4 = paint7;
                                f24 = 1.0f;
                                saveLayerAlpha = canvas3.saveLayerAlpha(centerX2 - hl.L(24.0f), centerY2 - hl.L(24.0f), centerX2 + hl.L(24.0f), centerY2 + hl.L(24.0f), (int) ((1.0f - i5) * alpha), 31);
                            }
                            int i12 = saveLayerAlpha;
                            Paint paint10 = lVar.w;
                            paint10.setAlpha(jn7.d4);
                            paint3.setAlpha(jn7.d4);
                            float f58 = f24 - L4;
                            canvas3.translate(0.0f, hl.N(f19) * f58);
                            canvas3.rotate(f37, f23, f21);
                            interpolation = k43.j.getInterpolation(Utilities.i(f4, f24, 0.0f));
                            i7 = Utilities.i(interpolation / f16, f24, 0.0f);
                            float interpolation4 = k43.g.getInterpolation(Utilities.i((interpolation - 0.3f) / 0.7f, f24, 0.0f));
                            float i13 = f24 - Utilities.i((interpolation - 0.15f) / 0.7f, f24, 0.0f);
                            if (interpolation < f24 || i13 <= 0.0f) {
                                f25 = L4;
                                rectF3 = rectF2;
                                f26 = 0.0f;
                            } else {
                                RectF rectF9 = hl.P;
                                rectF9.set(0.0f, 0.0f, hl.N(8.0f), hl.N(8.0f));
                                canvas3.save();
                                float e3 = bp1.e(f19, f58, f47 + f18);
                                float measuredWidth3 = lVar.getMeasuredWidth();
                                RectF rectF10 = rectF2;
                                if (f4 > 0.0f) {
                                    e3 = Math.min(e3, hl.N(0.5f) + rectF10.top);
                                }
                                canvas3.clipRect(0.0f, 0.0f, measuredWidth3, e3);
                                float N2 = hl.N(1.75f) * lVar.n0;
                                float g = (g() + 1.0f) / f19;
                                float f59 = (3.0f - (g * f19)) * g * g * N2;
                                canvas3.translate(f14 - hl.N(4.0f), ((hl.N(f19) * chatActivityEnterView.b5) + bp1.e(11.0f, interpolation, (rectF10.top - hl.L(6.0f)) - hl.R1(hl.N(f19), hl.N(1.5f), L4))) - f59);
                                if (f37 > 0.0f) {
                                    canvas3.rotate(f37, hl.L(8.0f), hl.L(8.0f));
                                }
                                paint10.setAlpha((int) (i13 * 255.0f));
                                rectF3 = rectF10;
                                f25 = L4;
                                canvas3.drawLine(hl.N(8.0f), hl.N(4.0f), hl.N(8.0f), ((1.0f - interpolation) * hl.N(4.0f)) + hl.N(6.0f) + f59, paint10);
                                canvas.drawArc(rectF9, 0.0f, -180.0f, false, paint10);
                                canvas3 = canvas;
                                canvas3.drawLine(0.0f, hl.N(4.0f), 0.0f, c00.x(hl.N(4.0f), chatActivityEnterView.b5, f58, hl.N(4.0f)), paint10);
                                paint10.setAlpha(jn7.d4);
                                canvas3.restore();
                                f26 = 0.0f;
                            }
                            if (i5 > f26) {
                                drawable3 = chatActivityEnterView.d1 ? lVar.G : lVar.F;
                            }
                            drawable = drawable3;
                            if (f4 > f26) {
                                if (lVar.E0 == null) {
                                    f27 = 3.0f;
                                    paint5 = paint4;
                                    rectF4 = rectF3;
                                    canvas3.drawRoundRect(rectF4, hl.N(3.0f), hl.N(3.0f), paint5);
                                } else {
                                    paint5 = paint4;
                                    rectF4 = rectF3;
                                    f27 = 3.0f;
                                }
                                float N3 = hl.N(1.66f) * interpolation4;
                                float R1 = hl.R1(hl.N(f27), hl.N(1.5f), interpolation);
                                float N4 = hl.N(1.5f) * interpolation4;
                                Path path2 = lVar.M;
                                path2.rewind();
                                RectF rectF11 = hl.P;
                                rectF11.set(rectF4);
                                rectF11.right = rectF4.centerX() - N3;
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
                                path2.addRoundRect(rectF11, fArr, direction);
                                rectF11.set(rectF4);
                                rectF11.left = rectF4.centerX() + N3;
                                float[] fArr2 = lVar.O;
                                fArr2[5] = R1;
                                fArr2[4] = R1;
                                fArr2[3] = R1;
                                fArr2[c] = R1;
                                fArr2[7] = N4;
                                fArr2[6] = N4;
                                fArr2[1] = N4;
                                fArr2[0] = N4;
                                path2.addRoundRect(rectF11, fArr2, direction);
                                canvas3.drawPath(path2, paint3);
                            } else {
                                paint5 = paint4;
                                rectF4 = rectF3;
                                canvas3.drawRoundRect(rectF4, hl.N(3.0f), hl.N(3.0f), paint3);
                            }
                            if (i7 < 1.0f) {
                                canvas3.drawCircle(rectF4.centerX(), rectF4.centerY(), (1.0f - i7) * hl.N(f19), paint2 != null ? lVar.q0 : paint5);
                            }
                            int i14 = i6;
                            paint3.setAlpha(i14);
                            paint10.setAlpha(i14);
                            canvas3.restoreToCount(i12);
                            if (drawable != null) {
                                Rect rect = hl.Q;
                                rect.set((int) (rectF4.centerX() - ((drawable.getIntrinsicWidth() / 2) * 0.9285f)), (int) (rectF4.centerY() - ((drawable.getIntrinsicHeight() / 2) * 0.9285f)), (int) (((drawable.getIntrinsicWidth() / 2) * 0.9285f) + rectF4.centerX()), (int) (((drawable.getIntrinsicHeight() / 2) * 0.9285f) + rectF4.centerY()));
                                drawable.setBounds(rect);
                                drawable.setAlpha((int) (i5 * 255.0f));
                                drawable.draw(canvas3);
                            }
                            i8 = Utilities.i((f25 - 0.55f) / 0.45f, 1.0f, 0.0f) * lVar.h0.d(((chatActivityEnterView.E3 == null && chatActivityEnterView.F0 != null && chatActivityEnterView.z0) || (chatActivityEnterView.T2 && chatActivityEnterView.d1)) && !chatActivityEnterView.j5 && !chatActivityEnterView.x1 && !chatActivityEnterView.i5 && chatActivityEnterView.d5 == 0.0f && chatActivityEnterView.u3);
                            lVar.n0 = i8;
                            if (i8 > 0.01f) {
                                lVar.a();
                                lVar.setupHintPaint(i8);
                                canvas3.save();
                                canvas3.translate(Math.round(f14), (f15 - hl.L(17.0f)) - (g() * hl.N(2.5f)));
                                d(canvas);
                                canvas3.restore();
                                lVar.invalidate();
                            }
                            canvas3.restore();
                            canvas3.restore();
                            Canvas canvas5 = canvas3;
                            l lVar3 = lVar;
                            float f60 = f47;
                            lVar3.b(f14, f6, f48 * chatActivityEnterView.W4 * f49 * chatActivityEnterView.e5, f60, canvas5);
                            float L5 = (hl.L(38.0f) * d) + hl.R1(f22, lVar3.getMeasuredHeight() - hl.L(118.0f), Math.max(chatActivityEnterView.a5, Math.min(f20, chatActivityEnterView.e5))) + f60;
                            rectF4.set(f14 - hl.N(18.0f), L5, hl.N(18.0f) + f14, L5 + f7);
                            xy1 xy1Var = chatActivityEnterView.O3;
                            z4 = xy1Var == null && xy1Var.T0() && !chatActivityEnterView.j0();
                            chatActivityEnterView.Q = z4;
                            if (z4) {
                                float N5 = hl.N(12.0f);
                                rectF4.set(rectF4.left, (rectF4.top - hl.N(36.0f)) - N5, rectF4.right, rectF4.top - N5);
                                dz1 dz1Var2 = lVar3.b;
                                if (dz1Var2 != null) {
                                    dz1Var2.o(0.0f, rectF4.centerY());
                                    lVar3.b.invalidate();
                                }
                                lVar3.K.set(rectF4);
                                canvas5.save();
                                float f61 = (1.0f - chatActivityEnterView.a5) * chatActivityEnterView.W4 * chatActivityEnterView.e5 * chatActivityEnterView.b5;
                                canvas5.scale(f61, f61, rectF4.centerX(), rectF4.centerY());
                                if (lVar3.C0) {
                                    rectF6 = rectF4;
                                    lVar3.c(canvas5, rectF6, hl.N(18.0f), 0.0f, 0.0f, 0.0f, lVar3.e(1));
                                    lVar2 = lVar3;
                                    canvas4 = canvas5;
                                } else {
                                    lVar2 = lVar3;
                                    canvas4 = canvas5;
                                    rectF6 = rectF4;
                                    jl0 jl0Var4 = lVar2.E0;
                                    if (jl0Var4 != null) {
                                        jl0Var4.setBounds((int) (rectF6.left - hl.N(3.0f)), (int) (rectF6.top - hl.N(3.0f)), (int) (hl.N(3.0f) + rectF6.right), (int) (hl.N(3.0f) + rectF6.bottom));
                                        lVar2.E0.draw(canvas4);
                                    } else {
                                        chatActivityEnterView.J4.setBounds((int) (rectF6.left - hl.N(3.0f)), (int) (rectF6.top - hl.N(3.0f)), (int) (hl.N(3.0f) + rectF6.right), (int) (hl.N(3.0f) + rectF6.bottom));
                                        chatActivityEnterView.J4.draw(canvas4);
                                        canvas4.drawRoundRect(rectF6, hl.N(18.0f), hl.N(18.0f), paint5);
                                    }
                                }
                                lVar2.E.setBounds((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
                                lVar2.E.draw(canvas4);
                                canvas4.restore();
                            } else {
                                lVar2 = lVar3;
                                canvas4 = canvas5;
                            }
                            mm mmVar = lVar2.v0;
                            mmVar.getClass();
                            e2 = mmVar.e(false, 0.0f);
                            ChatActivityEnterView chatActivityEnterView2 = lVar2.U0;
                            RectF rectF12 = chatActivityEnterView2.G4;
                            float d2 = lVar2.w0.d(chatActivityEnterView2.T1);
                            float d3 = lVar2.x0.d(lVar2.y0 >= 0);
                            rectF5 = lVar2.t0;
                            if (e2 > 0.0f || rectF12.isEmpty()) {
                                rectF5.setEmpty();
                            } else {
                                float width = rectF12.width();
                                float measuredWidth4 = lVar2.getMeasuredWidth() - rectF12.right;
                                rectF5.set(measuredWidth4, rectF12.top, width + measuredWidth4, rectF12.bottom);
                                float R12 = (1.0f - (d3 * 0.06f)) * hl.R1(0.6f, 1.0f, e2);
                                canvas4.save();
                                canvas4.scale(R12, R12, rectF5.centerX(), rectF5.centerY());
                                float f62 = e2 * 255.0f;
                                int i15 = (int) f62;
                                jl0 jl0Var5 = lVar2.s0;
                                if (jl0Var5 != null) {
                                    jl0Var5.setBounds((int) (rectF5.left - hl.N(3.0f)), (int) (rectF5.top - hl.N(3.0f)), (int) (hl.N(3.0f) + rectF5.right), (int) (hl.N(3.0f) + rectF5.bottom));
                                    lVar2.s0.setAlpha(i15);
                                    lVar2.s0.draw(canvas4);
                                } else {
                                    int alpha2 = paint5.getAlpha();
                                    paint5.setAlpha((int) (alpha2 * e2));
                                    canvas4.drawRoundRect(rectF5, rectF5.width() / f19, rectF5.width() / f19, paint5);
                                    paint5.setAlpha(alpha2);
                                }
                                float centerX3 = rectF5.centerX();
                                float centerY3 = rectF5.centerY();
                                if (d2 < 1.0f) {
                                    Paint.Style style = Paint.Style.STROKE;
                                    Paint paint11 = lVar2.u0;
                                    paint11.setStyle(style);
                                    paint11.setStrokeWidth(hl.N(1.66f));
                                    paint11.setStrokeCap(Paint.Cap.ROUND);
                                    paint11.setStrokeJoin(Paint.Join.ROUND);
                                    paint11.setColor(paint3.getColor());
                                    paint11.setAlpha((int) ((1.0f - d2) * Color.alpha(paint3.getColor()) * e2));
                                    canvas4.save();
                                    float R13 = hl.R1(1.0f, 0.6f, d2);
                                    canvas4.scale(R13, R13, centerX3, centerY3);
                                    float N6 = hl.N(3.6f) + centerX3;
                                    float N7 = centerY3 - hl.N(5.85f);
                                    float N8 = hl.N(5.85f) + centerY3;
                                    float N9 = hl.N(4.3f);
                                    canvas4.drawLine(N6 - N9, N8, N6, N7, paint11);
                                    canvas.drawLine(N6, N7, N6 + N9, N8, paint11);
                                    float f63 = N9 * 0.6f;
                                    canvas.drawLine(N6 - f63, hl.N(1.9f) + centerY3, N6 + f63, hl.N(1.9f) + centerY3, paint11);
                                    float N10 = centerY3 - hl.N(0.6f);
                                    float N11 = centerX3 - hl.N(2.6f);
                                    canvas.drawLine(centerX3 - hl.N(9.4f), N10, N11, N10, paint11);
                                    canvas.drawLine(N11 - hl.N(2.6f), N10 - hl.N(2.6f), N11, N10, paint11);
                                    canvas4 = canvas;
                                    canvas4.drawLine(N11 - hl.N(2.6f), hl.N(2.6f) + N10, N11, N10, paint11);
                                    canvas4.restore();
                                }
                                if (d2 > 0.0f) {
                                    float R14 = hl.R1(0.6f, 1.0f, d2) * 0.9285f;
                                    Drawable drawable4 = lVar2.F;
                                    int intrinsicWidth = (int) ((drawable4.getIntrinsicWidth() / f19) * R14);
                                    int intrinsicHeight = (int) ((drawable4.getIntrinsicHeight() / f19) * R14);
                                    int i16 = (int) centerX3;
                                    int i17 = (int) centerY3;
                                    drawable4.setBounds(i16 - intrinsicWidth, i17 - intrinsicHeight, i16 + intrinsicWidth, i17 + intrinsicHeight);
                                    drawable4.setAlpha((int) (f62 * d2));
                                    drawable4.draw(canvas4);
                                    drawable4.setAlpha(jn7.d4);
                                }
                                canvas4.restore();
                            }
                            lVar2.getLocationInWindow(lVar2.A0);
                            chatActivityEnterView2.getLocationInWindow(lVar2.z0);
                            chatActivityEnterView2.z0(lVar2, canvas4, r1[0], r1[1], -100000.0f, r2[1]);
                            return;
                        }
                    }
                    z = false;
                    chatActivityEnterView.g5 = false;
                    z2 = chatActivityEnterView.g5;
                    if (!z2) {
                    }
                    i3 = Utilities.i(qu6.d(z2 ? f8 : -1.0f, min, 240.0f, chatActivityEnterView.f5), f8, 0.0f);
                    chatActivityEnterView.f5 = i3;
                    chatActivityEnterView.e5 = xnb.B(i3, 2.0f, 3.0f, i3 * i3);
                    if (i3 > 0.0f) {
                        invalidate();
                    }
                    float N12 = hl.N(72.0f);
                    float A3 = qd4.A(1.0f, f44, hl.N(24.0f) * f12, N12 * f44);
                    float f462 = chatActivityEnterView.e5;
                    float A22 = qd4.A(1.0f, f462, N12, A3);
                    if (A22 > N12) {
                    }
                    float f482 = 1.0f - d;
                    float f492 = 1.0f - f13;
                    float f502 = chatActivityEnterView.W4 * f482 * f492 * f462;
                    float f512 = measuredWidth;
                    float f522 = f35 + f47;
                    canvas.scale(f502, f502, f512, f522);
                    float f532 = f36 + f47;
                    float f542 = f532 + f7;
                    rectF7.set(f512 - hl.N(18.0f), f532, hl.N(18.0f) + f512, f542);
                    z3 = this.C0;
                    Paint paint72 = this.r;
                    if (z3) {
                    }
                    chatActivityEnterView.G4.set(rectF);
                    RectF rectF82 = chatActivityEnterView.G4;
                    float centerX4 = rectF82.centerX();
                    float centerY4 = rectF82.centerY();
                    rectF82.left = hl.R1(centerX4, rectF82.left, f502);
                    rectF82.right = hl.R1(centerX4, rectF82.right, f502);
                    rectF82.top = hl.R1(centerY4, rectF82.top, f502);
                    rectF82.bottom = hl.R1(centerY4, rectF82.bottom, f502);
                    dz1Var = lVar.a;
                    if (dz1Var != null) {
                    }
                    float f552 = 1.0f - f4;
                    float f562 = f17;
                    rectF.set((f14 - hl.N(6.0f)) - (hl.N(f17) * f552), f522 - (hl.N(f17) * f552), bp1.e(f562, f552, hl.L(6.0f) + i4), bp1.e(f562, f552, f522 + hl.L(12.0f)));
                    float f572 = rectF.bottom;
                    float centerX22 = rectF.centerX();
                    float centerY22 = rectF.centerY();
                    canvas2.save();
                    i5 = Utilities.i(Math.max(chatActivityEnterView.d5, chatActivityEnterView.U6) * f562, 1.0f, 0.0f);
                    Paint paint82 = lVar.s;
                    int alpha3 = paint82.getAlpha();
                    Drawable drawable32 = null;
                    if (chatActivityEnterView.r7) {
                    }
                    if (paint != null) {
                    }
                    int i122 = saveLayerAlpha;
                    Paint paint102 = lVar.w;
                    paint102.setAlpha(jn7.d4);
                    paint3.setAlpha(jn7.d4);
                    float f582 = f24 - L4;
                    canvas3.translate(0.0f, hl.N(f19) * f582);
                    canvas3.rotate(f37, f23, f21);
                    interpolation = k43.j.getInterpolation(Utilities.i(f4, f24, 0.0f));
                    i7 = Utilities.i(interpolation / f16, f24, 0.0f);
                    float interpolation42 = k43.g.getInterpolation(Utilities.i((interpolation - 0.3f) / 0.7f, f24, 0.0f));
                    float i132 = f24 - Utilities.i((interpolation - 0.15f) / 0.7f, f24, 0.0f);
                    if (interpolation < f24) {
                    }
                    f25 = L4;
                    rectF3 = rectF2;
                    f26 = 0.0f;
                    if (i5 > f26) {
                    }
                    drawable = drawable32;
                    if (f4 > f26) {
                    }
                    if (i7 < 1.0f) {
                    }
                    int i142 = i6;
                    paint3.setAlpha(i142);
                    paint102.setAlpha(i142);
                    canvas3.restoreToCount(i122);
                    if (drawable != null) {
                    }
                    i8 = Utilities.i((f25 - 0.55f) / 0.45f, 1.0f, 0.0f) * lVar.h0.d(((chatActivityEnterView.E3 == null && chatActivityEnterView.F0 != null && chatActivityEnterView.z0) || (chatActivityEnterView.T2 && chatActivityEnterView.d1)) && !chatActivityEnterView.j5 && !chatActivityEnterView.x1 && !chatActivityEnterView.i5 && chatActivityEnterView.d5 == 0.0f && chatActivityEnterView.u3);
                    lVar.n0 = i8;
                    if (i8 > 0.01f) {
                    }
                    canvas3.restore();
                    canvas3.restore();
                    Canvas canvas52 = canvas3;
                    l lVar32 = lVar;
                    float f602 = f47;
                    lVar32.b(f14, f6, f482 * chatActivityEnterView.W4 * f492 * chatActivityEnterView.e5, f602, canvas52);
                    float L52 = (hl.L(38.0f) * d) + hl.R1(f22, lVar32.getMeasuredHeight() - hl.L(118.0f), Math.max(chatActivityEnterView.a5, Math.min(f20, chatActivityEnterView.e5))) + f602;
                    rectF4.set(f14 - hl.N(18.0f), L52, hl.N(18.0f) + f14, L52 + f7);
                    xy1 xy1Var2 = chatActivityEnterView.O3;
                    if (xy1Var2 == null) {
                    }
                    chatActivityEnterView.Q = z4;
                    if (z4) {
                    }
                    mm mmVar2 = lVar2.v0;
                    mmVar2.getClass();
                    e2 = mmVar2.e(false, 0.0f);
                    ChatActivityEnterView chatActivityEnterView22 = lVar2.U0;
                    RectF rectF122 = chatActivityEnterView22.G4;
                    float d22 = lVar2.w0.d(chatActivityEnterView22.T1);
                    float d32 = lVar2.x0.d(lVar2.y0 >= 0);
                    rectF5 = lVar2.t0;
                    if (e2 > 0.0f) {
                    }
                    rectF5.setEmpty();
                    lVar2.getLocationInWindow(lVar2.A0);
                    chatActivityEnterView22.getLocationInWindow(lVar2.z0);
                    chatActivityEnterView22.z0(lVar2, canvas4, r1[0], r1[1], -100000.0f, r2[1]);
                    return;
                }
                f6 = measuredHeight;
                f7 = L;
                f8 = 1.0f;
                float d4 = this.P.d(!chatActivityEnterView.d1 && chatActivityEnterView.X1 >= 59000);
                f9 = chatActivityEnterView.d5;
                if (f9 != 0.0f) {
                }
                f10 = chatActivityEnterView.a5;
                if (f10 == 0.0f) {
                }
                if (chatActivityEnterView.l1) {
                }
                canvas.save();
                float measuredWidth22 = getMeasuredWidth();
                int measuredHeight22 = getMeasuredHeight() - chatActivityEnterView.o2.getMeasuredHeight();
                if (chatActivityEnterView.J1) {
                }
                f13 = f11;
                i2 = 0;
                canvas.clipRect(0.0f, 0.0f, measuredWidth22, (measuredHeight22 + i2) - chatActivityEnterView.Q7);
                float f432 = f8 - chatActivityEnterView.W4;
                if (f432 == 0.0f) {
                }
                long uptimeMillis2 = SystemClock.uptimeMillis();
                float min2 = chatActivityEnterView.h5 != 0 ? Math.min(48.0f, uptimeMillis2 - r14) : 16.0f;
                chatActivityEnterView.h5 = uptimeMillis2;
                if (!chatActivityEnterView.i5) {
                }
                z = false;
                chatActivityEnterView.g5 = false;
                z2 = chatActivityEnterView.g5;
                if (!z2) {
                }
                i3 = Utilities.i(qu6.d(z2 ? f8 : -1.0f, min2, 240.0f, chatActivityEnterView.f5), f8, 0.0f);
                chatActivityEnterView.f5 = i3;
                chatActivityEnterView.e5 = xnb.B(i3, 2.0f, 3.0f, i3 * i3);
                if (i3 > 0.0f) {
                }
                float N122 = hl.N(72.0f);
                float A32 = qd4.A(1.0f, f44, hl.N(24.0f) * f12, N122 * f44);
                float f4622 = chatActivityEnterView.e5;
                float A222 = qd4.A(1.0f, f4622, N122, A32);
                if (A222 > N122) {
                }
                float f4822 = 1.0f - d4;
                float f4922 = 1.0f - f13;
                float f5022 = chatActivityEnterView.W4 * f4822 * f4922 * f4622;
                float f5122 = measuredWidth;
                float f5222 = f35 + f47;
                canvas.scale(f5022, f5022, f5122, f5222);
                float f5322 = f36 + f47;
                float f5422 = f5322 + f7;
                rectF7.set(f5122 - hl.N(18.0f), f5322, hl.N(18.0f) + f5122, f5422);
                z3 = this.C0;
                Paint paint722 = this.r;
                if (z3) {
                }
                chatActivityEnterView.G4.set(rectF);
                RectF rectF822 = chatActivityEnterView.G4;
                float centerX42 = rectF822.centerX();
                float centerY42 = rectF822.centerY();
                rectF822.left = hl.R1(centerX42, rectF822.left, f5022);
                rectF822.right = hl.R1(centerX42, rectF822.right, f5022);
                rectF822.top = hl.R1(centerY42, rectF822.top, f5022);
                rectF822.bottom = hl.R1(centerY42, rectF822.bottom, f5022);
                dz1Var = lVar.a;
                if (dz1Var != null) {
                }
                float f5522 = 1.0f - f4;
                float f5622 = f17;
                rectF.set((f14 - hl.N(6.0f)) - (hl.N(f17) * f5522), f5222 - (hl.N(f17) * f5522), bp1.e(f5622, f5522, hl.L(6.0f) + i4), bp1.e(f5622, f5522, f5222 + hl.L(12.0f)));
                float f5722 = rectF.bottom;
                float centerX222 = rectF.centerX();
                float centerY222 = rectF.centerY();
                canvas2.save();
                i5 = Utilities.i(Math.max(chatActivityEnterView.d5, chatActivityEnterView.U6) * f5622, 1.0f, 0.0f);
                Paint paint822 = lVar.s;
                int alpha32 = paint822.getAlpha();
                Drawable drawable322 = null;
                if (chatActivityEnterView.r7) {
                }
                if (paint != null) {
                }
                int i1222 = saveLayerAlpha;
                Paint paint1022 = lVar.w;
                paint1022.setAlpha(jn7.d4);
                paint3.setAlpha(jn7.d4);
                float f5822 = f24 - L4;
                canvas3.translate(0.0f, hl.N(f19) * f5822);
                canvas3.rotate(f37, f23, f21);
                interpolation = k43.j.getInterpolation(Utilities.i(f4, f24, 0.0f));
                i7 = Utilities.i(interpolation / f16, f24, 0.0f);
                float interpolation422 = k43.g.getInterpolation(Utilities.i((interpolation - 0.3f) / 0.7f, f24, 0.0f));
                float i1322 = f24 - Utilities.i((interpolation - 0.15f) / 0.7f, f24, 0.0f);
                if (interpolation < f24) {
                }
                f25 = L4;
                rectF3 = rectF2;
                f26 = 0.0f;
                if (i5 > f26) {
                }
                drawable = drawable322;
                if (f4 > f26) {
                }
                if (i7 < 1.0f) {
                }
                int i1422 = i6;
                paint3.setAlpha(i1422);
                paint1022.setAlpha(i1422);
                canvas3.restoreToCount(i1222);
                if (drawable != null) {
                }
                i8 = Utilities.i((f25 - 0.55f) / 0.45f, 1.0f, 0.0f) * lVar.h0.d(((chatActivityEnterView.E3 == null && chatActivityEnterView.F0 != null && chatActivityEnterView.z0) || (chatActivityEnterView.T2 && chatActivityEnterView.d1)) && !chatActivityEnterView.j5 && !chatActivityEnterView.x1 && !chatActivityEnterView.i5 && chatActivityEnterView.d5 == 0.0f && chatActivityEnterView.u3);
                lVar.n0 = i8;
                if (i8 > 0.01f) {
                }
                canvas3.restore();
                canvas3.restore();
                Canvas canvas522 = canvas3;
                l lVar322 = lVar;
                float f6022 = f47;
                lVar322.b(f14, f6, f4822 * chatActivityEnterView.W4 * f4922 * chatActivityEnterView.e5, f6022, canvas522);
                float L522 = (hl.L(38.0f) * d4) + hl.R1(f22, lVar322.getMeasuredHeight() - hl.L(118.0f), Math.max(chatActivityEnterView.a5, Math.min(f20, chatActivityEnterView.e5))) + f6022;
                rectF4.set(f14 - hl.N(18.0f), L522, hl.N(18.0f) + f14, L522 + f7);
                xy1 xy1Var22 = chatActivityEnterView.O3;
                if (xy1Var22 == null) {
                }
                chatActivityEnterView.Q = z4;
                if (z4) {
                }
                mm mmVar22 = lVar2.v0;
                mmVar22.getClass();
                e2 = mmVar22.e(false, 0.0f);
                ChatActivityEnterView chatActivityEnterView222 = lVar2.U0;
                RectF rectF1222 = chatActivityEnterView222.G4;
                float d222 = lVar2.w0.d(chatActivityEnterView222.T1);
                float d322 = lVar2.x0.d(lVar2.y0 >= 0);
                rectF5 = lVar2.t0;
                if (e2 > 0.0f) {
                }
                rectF5.setEmpty();
                lVar2.getLocationInWindow(lVar2.A0);
                chatActivityEnterView222.getLocationInWindow(lVar2.z0);
                chatActivityEnterView222.z0(lVar2, canvas4, r1[0], r1[1], -100000.0f, r2[1]);
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
        int L = hl.L(250.0f);
        if (this.I != size) {
            this.I = size;
            StaticLayout staticLayout = new StaticLayout(this.e, this.n, hl.L(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
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
        ChatActivityEnterView chatActivityEnterView = this.U0;
        RectF rectF = chatActivityEnterView.G4;
        byte b = 3;
        if (chatActivityEnterView.J1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                int h = h(x, y);
                this.y0 = h;
                if (h >= 0) {
                    invalidate();
                    return true;
                }
            } else if (this.y0 >= 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 3) {
                        this.y0 = -1;
                        invalidate();
                        return true;
                    }
                }
                if (h(x, y) >= 0) {
                    chatActivityEnterView.c2(!chatActivityEnterView.T1, true);
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                this.y0 = -1;
                invalidate();
                return true;
            }
        }
        int action = motionEvent.getAction();
        RectF rectF2 = this.K;
        if (action == 0) {
            if (chatActivityEnterView.j5) {
                RectF rectF3 = hl.P;
                rectF3.set(rectF);
                rectF3.inset(-hl.L(10.0f), -hl.L(10.0f));
                this.T0 = !rectF.isEmpty() && rectF3.contains((float) x, (float) y);
            }
            if (chatActivityEnterView.Q && chatActivityEnterView.C2 != null && chatActivityEnterView.b5 > 0.1f) {
                this.S0 = rectF2.contains(x, y);
            }
        } else if (motionEvent.getAction() == 1) {
            RectF rectF4 = hl.P;
            rectF4.set(rectF);
            rectF4.inset(-hl.L(10.0f), -hl.L(10.0f));
            if (this.T0 && rectF4.contains(x, y)) {
                if (chatActivityEnterView.l1 && !chatActivityEnterView.d1) {
                    this.S0 = false;
                    this.T0 = false;
                    if (chatActivityEnterView.u3) {
                        if (chatActivityEnterView.T6) {
                            chatActivityEnterView.p0(false, true);
                            chatActivityEnterView.D0().M(true);
                        } else {
                            tx1 tx1Var = chatActivityEnterView.F0;
                            if (tx1Var == null || tx1Var.length() == 0) {
                                chatActivityEnterView.n0();
                                return true;
                            }
                            chatActivityEnterView.p0(true, true);
                            bn3 bn3Var = chatActivityEnterView.j1;
                            if (bn3Var != null && bn3Var.p0 && bn3Var.r == 1) {
                                bn3Var.w();
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
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.Z1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.O3.S0();
                } else {
                    go1 go1Var = new go1(this, (byte) 16);
                    dz1 dz1Var = this.a;
                    if (dz1Var != null && dz1Var.W) {
                        f();
                    }
                    if (chatActivityEnterView.J1) {
                        chatActivityEnterView.c2(false, false);
                        hl.r(chatActivityEnterView.W1);
                        chatActivityEnterView.V1(true);
                    }
                    x59 x59Var = chatActivityEnterView.i1;
                    if (x59Var != null) {
                        x59Var.setPlaying(false);
                    }
                    if (!MediaController.z().J() || (chatActivityEnterView.i1.getAudioLeft() <= 0.01f && chatActivityEnterView.i1.getAudioRight() >= 0.99f)) {
                        go1Var.run();
                    } else {
                        dy1 dy1Var = new dy1(this, go1Var, b);
                        if (uc7.e1().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, chatActivityEnterView.K4, getContext());
                            String M0 = ob6.M0(2131746075, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M0;
                            idVar.U = ob6.M0(2131746076, null);
                            alertDialog$Builder.j(ob6.M0(2131747558, null), new rd1((Object) dy1Var, (byte) 15));
                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                            alertDialog$Builder.o();
                        } else {
                            dy1Var.run();
                        }
                    }
                }
                this.S0 = false;
                this.T0 = false;
                return true;
            }
            if (this.S0 && rectF2.contains(x, y)) {
                boolean z = !chatActivityEnterView.P;
                chatActivityEnterView.P = z;
                this.E.f(1, z, true);
                ls6 d0 = ls6.d0(chatActivityEnterView.R);
                long j = chatActivityEnterView.F3;
                zu1 zu1Var = chatActivityEnterView.E3;
                d0.g2(j, (zu1Var == null || !zu1Var.x4) ? 0L : zu1Var.c(), chatActivityEnterView.P);
                if (chatActivityEnterView.P) {
                    i();
                } else {
                    f();
                }
                invalidate();
                this.S0 = false;
                this.T0 = false;
                return true;
            }
            this.S0 = false;
            this.T0 = false;
        } else if (motionEvent.getAction() == 3) {
            this.S0 = false;
            this.T0 = false;
        }
        return this.T0 || this.S0;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
    }

    public void setBlurredBackgroundFactory(ll0 ll0Var) {
        this.C0 = true;
        ChatActivityEnterView chatActivityEnterView = this.U0;
        chatActivityEnterView.K1 = ll0Var;
        cl0 cl0Var = this.B0;
        if (cl0Var == null) {
            cl0Var = new cl0(aob.Re, chatActivityEnterView.K4);
            this.B0 = cl0Var;
        }
        jl0 c = ll0Var.c(this, cl0Var, false);
        this.D0 = c;
        c.r(hl.L(18.0f));
        this.D0.q(hl.L(3.0f));
        jl0 c2 = ll0Var.c(this, this.B0, false);
        this.E0 = c2;
        c2.r(hl.L(18.0f));
        this.E0.q(hl.L(3.0f));
        jl0 c3 = ll0Var.c(this, this.B0, false);
        this.s0 = c3;
        c3.r(hl.L(18.0f));
        this.s0.q(hl.L(3.0f));
        jl0 c4 = ll0Var.c(this, this.B0, false);
        this.R = c4;
        c4.r(hl.L(18.0f));
        jl0 jl0Var = this.R;
        jl0Var.X = 0.0f;
        jl0Var.q(hl.L(3.0f));
        this.F0 = false;
        updateColors();
    }

    @Override // snb
    public final void updateColors() {
        TextPaint textPaint;
        Drawable drawable;
        Drawable drawable2;
        int i;
        pb1 pb1Var = this.E;
        if (pb1Var == null || (textPaint = this.n) == null || (drawable = this.F) == null || (drawable2 = this.G) == null) {
            return;
        }
        cl0 cl0Var = this.B0;
        if (cl0Var != null) {
            cl0Var.d();
        }
        jl0 jl0Var = this.D0;
        if (jl0Var != null) {
            jl0Var.updateColors();
        }
        jl0 jl0Var2 = this.E0;
        if (jl0Var2 != null) {
            jl0Var2.updateColors();
        }
        jl0 jl0Var3 = this.s0;
        if (jl0Var3 != null) {
            jl0Var3.updateColors();
        }
        jl0 jl0Var4 = this.R;
        if (jl0Var4 != null) {
            jl0Var4.updateColors();
        }
        int i2 = this.C0 ? aob.Nl : aob.Qe;
        ChatActivityEnterView chatActivityEnterView = this.U0;
        pb1Var.g(chatActivityEnterView.J0(i2), chatActivityEnterView.J0(aob.Uf), -1);
        textPaint.setColor(chatActivityEnterView.J0(aob.gg));
        ShapeDrawable shapeDrawable = this.c;
        if (shapeDrawable != null) {
            i = aob.hg;
            aob.A1(chatActivityEnterView.J0(i), shapeDrawable);
        } else {
            int L = hl.L(5.0f);
            i = aob.hg;
            this.c = aob.b0(L, chatActivityEnterView.J0(i));
        }
        int J0 = chatActivityEnterView.J0(i);
        Drawable drawable3 = this.d;
        if (drawable3 != null && J0 != this.P0) {
            this.P0 = J0;
            drawable3.setColorFilter(new PorterDuffColorFilter(J0, PorterDuff.Mode.SRC_IN));
        }
        this.r.setColor(chatActivityEnterView.J0(aob.Re));
        this.s.setColor(chatActivityEnterView.J0(this.C0 ? aob.Nl : aob.Qe));
        this.w.setColor(chatActivityEnterView.J0(this.C0 ? aob.Nl : aob.Qe));
        int J02 = chatActivityEnterView.J0(this.C0 ? aob.Nl : aob.Qe);
        if (this.R0 && J02 == this.Q0) {
            return;
        }
        this.R0 = true;
        this.Q0 = J02;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(J02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(J02, mode));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.E || super.verifyDrawable(drawable);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
