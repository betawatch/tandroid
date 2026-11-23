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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class rg extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public fh.g A0;
    public boolean B0;
    public int C0;
    public final Paint D0;
    public final hi.n E;
    public final Paint E0;
    public final Drawable F;
    public final Paint F0;
    public final Drawable G;
    public final Path G0;
    public final qg H;
    public final Matrix H0;
    public int I;
    public final RectF I0;
    public final RectF J;
    public final fh.g[] J0;
    public final RectF K;
    public final pb.b K0;
    public long L;
    public int L0;
    public final Path M;
    public int M0;
    public final float[] N;
    public boolean N0;
    public final float[] O;
    public boolean O0;
    public final d6 P;
    public boolean P0;
    public final RectF Q;
    public final /* synthetic */ ChatActivityEnterView Q0;
    public fh.g R;
    public final Paint S;
    public final Paint T;
    public final Paint U;
    public final d6 V;
    public final d6 W;
    public hi.l3 a;
    public final d6 a0;
    public hi.l3 b;
    public final d6 b0;
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
    public final d6 h0;
    public final d6 i0;
    public final Paint j0;
    public final Paint k0;
    public final Path l0;
    public final Matrix m0;
    public final TextPaint n;
    public float n0;
    public fh.g o0;
    public final RectF p0;
    public final Paint q0;
    public final Paint r;
    public final d6 r0;
    public final Paint s;
    public final d6 s0;
    public final d6 t0;
    public int u0;
    public final int[] v0;
    public final Paint w;
    public final int[] w0;
    public final Path x;
    public gh.b x0;
    public final Paint y;
    public boolean y0;
    public fh.g z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg(ChatActivityEnterView chatActivityEnterView, Context context) {
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
        nr nrVar = nr.h;
        this.P = new d6(this, 0L, 350L, nrVar);
        this.Q = new RectF();
        this.S = new Paint(1);
        this.T = new Paint(1);
        this.U = new Paint(1);
        this.V = new d6(this, 0L, 320L, nrVar);
        this.W = new d6(this, 0L, 260L, nr.k);
        this.a0 = new d6(this, 0L, 60L, nrVar);
        this.b0 = new d6(this, 0L, 180L, nrVar);
        this.d0 = new Path();
        this.e0 = new Path();
        this.f0 = new Path();
        this.g0 = new Paint(1);
        this.h0 = new d6(this, 0L, 220L, nrVar);
        this.i0 = new d6(this, 0L, 220L, nrVar);
        this.j0 = new Paint(1);
        this.k0 = new Paint(1);
        this.l0 = new Path();
        this.m0 = new Matrix();
        this.p0 = new RectF();
        new TextPaint(1);
        new Paint(1);
        new Paint(1);
        this.q0 = new Paint(1);
        new Path();
        new Path();
        this.r0 = new d6(this, 0L, 380L, nrVar);
        this.s0 = new d6(this, 0L, 300L, nrVar);
        this.t0 = new d6(this, 0L, 180L, nrVar);
        this.u0 = -1;
        this.v0 = new int[2];
        this.w0 = new int[2];
        this.D0 = new Paint(1);
        this.E0 = new Paint(1);
        this.F0 = new Paint(1);
        this.G0 = new Path();
        this.H0 = new Matrix();
        this.I0 = new RectF();
        this.J0 = new fh.g[3];
        this.K0 = new pb.b(18);
        qg qgVar = new qg(this, this);
        this.H = qgVar;
        r0.i0.j(this, qgVar);
        hi.n nVar = new hi.n(5);
        this.E = nVar;
        nVar.setCallback(this);
        nVar.d(1, chatActivityEnterView.P, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.7f));
        Drawable drawable = getResources().getDrawable(R.drawable.lock_round_shadow);
        chatActivityEnterView.L4 = drawable;
        org.telegram.ui.ActionBar.t6.x(this, drawable, org.telegram.ui.ActionBar.m6.Se, chatActivityEnterView.M4, PorterDuff.Mode.MULTIPLY);
        this.c = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(5.0f), chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.hg));
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.d = context.getDrawable(R.drawable.tooltip_arrow);
        this.e = org.telegram.messenger.hd.N0(2131745116, "SlideUpToLock");
        float L = org.telegram.messenger.g0.L(3.0f);
        float L2 = org.telegram.messenger.g0.L(3.0f);
        this.F = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.G = getResources().getDrawable(R.drawable.input_video).mutate();
        setWillNotDraw(false);
        updateColors();
    }

    public static float g() {
        float currentTimeMillis = (System.currentTimeMillis() % 2000) / 2000.0f;
        return currentTimeMillis < 0.5f ? (currentTimeMillis * 4.0f) - 1.0f : 3.0f - (currentTimeMillis * 4.0f);
    }

    private void setupHintPaint(float f10) {
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.g0;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.6f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        int i7 = org.telegram.ui.ActionBar.m6.d6;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        paint.setColor(org.telegram.messenger.g0.B(chatActivityEnterView.G0(i7)) < 0.5f ? this.s.getColor() : chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.eg));
        paint.setAlpha((int) (Color.alpha(r0) * f10));
    }

    public final void b() {
        Path path = this.d0;
        if (path.isEmpty()) {
            float N = org.telegram.messenger.g0.N(0.3f);
            float N2 = org.telegram.messenger.g0.N(3.9f) + N;
            float f10 = -org.telegram.messenger.g0.N(6.2f);
            float N3 = org.telegram.messenger.g0.N(6.2f);
            float N4 = org.telegram.messenger.g0.N(4.6f);
            path.moveTo(N2 - N4, N3);
            path.lineTo(N2, f10);
            path.lineTo(N2 + N4, N3);
            float f11 = N4 * 0.6f;
            path.moveTo(N2 - f11, org.telegram.messenger.g0.N(2.1f));
            path.lineTo(N2 + f11, org.telegram.messenger.g0.N(2.1f));
            float f12 = -org.telegram.messenger.g0.N(0.6f);
            float N5 = N - org.telegram.messenger.g0.N(2.6f);
            float N6 = N - org.telegram.messenger.g0.N(9.2f);
            Path path2 = this.e0;
            path2.moveTo(N6, f12);
            path2.lineTo(N5, f12);
            path2.moveTo(N5 - org.telegram.messenger.g0.N(3.2f), f12 - org.telegram.messenger.g0.N(4.0f));
            path2.lineTo(N5, f12);
            path2.lineTo(N5 - org.telegram.messenger.g0.N(3.2f), org.telegram.messenger.g0.N(4.0f) + f12);
            float f13 = -org.telegram.messenger.g0.N(5.0f);
            float N7 = org.telegram.messenger.g0.N(4.0f);
            Path path3 = this.f0;
            path3.moveTo(f13, N7);
            path3.lineTo(0.0f, 0.0f);
            path3.lineTo(org.telegram.messenger.g0.N(5.0f), org.telegram.messenger.g0.N(4.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(float f10, float f11, float f12, float f13, Canvas canvas) {
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        Canvas canvas2;
        float f21;
        int i7;
        float f22;
        float f23;
        boolean z10;
        float f24;
        RectF rectF;
        float f25;
        int i10;
        float f26;
        Canvas canvas3;
        int W1;
        ChatActivityEnterView chatActivityEnterView;
        int i11;
        int i12;
        float f27;
        boolean z11;
        float i13;
        ChatActivityEnterView chatActivityEnterView2 = this.Q0;
        float max = Math.max(0.0f, f12) * this.V.d(chatActivityEnterView2.r0() && !chatActivityEnterView2.h5 && chatActivityEnterView2.f5 == 0.0f && chatActivityEnterView2.v3 && !chatActivityEnterView2.i5);
        RectF rectF2 = this.Q;
        if (max <= 0.01f) {
            rectF2.setEmpty();
            return;
        }
        b();
        d6 d6Var = this.W;
        d6Var.getClass();
        float max2 = Math.max(d6Var.e(false, 0.0f), this.b0.d(this.c0));
        float max3 = Math.max(this.a0.e(false, chatActivityEnterView2.w1), this.c0 ? 1.0f : 0.0f);
        float L = org.telegram.messenger.g0.L(36.0f);
        float f28 = L / 2.0f;
        float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.L(64.0f), L, max3);
        float L2 = org.telegram.messenger.g0.L(79.0f);
        float L3 = ((org.telegram.messenger.g0.L(64.0f) - T1) / 2.0f) * ((float) Math.sqrt(0.5d));
        float round = Math.round(f10 - L2) - L3;
        float round2 = Math.round(((f11 + org.telegram.messenger.g0.L(170.0f)) - L2) + f13) - L3;
        float f29 = T1 / 2.0f;
        float f30 = round2 - f29;
        float f31 = round2 + f29;
        rectF2.set(round - f29, f30, round + f29, f31);
        float max4 = ((Math.max(0.0f, max2) * 0.08f) + (0.04f * max3) + 1.0f) * ((0.4f * max) + 0.6f);
        canvas.save();
        float L4 = f11 + org.telegram.messenger.g0.L(170.0f) + f13;
        if (max < 0.999f) {
            f16 = 0.01f;
            f14 = L4;
            f15 = f30;
            f17 = max3;
            f18 = max4;
            f20 = round2;
            f21 = 0.6f;
            canvas2 = canvas;
            f19 = round;
            i7 = canvas2.saveLayerAlpha(round - T1, round2 - T1, org.telegram.messenger.g0.L(30.0f) + f10, org.telegram.messenger.g0.L(30.0f) + L4, (int) (max * 255.0f));
        } else {
            f14 = L4;
            f15 = f30;
            f16 = 0.01f;
            f17 = max3;
            f18 = max4;
            f19 = round;
            f20 = round2;
            canvas2 = canvas;
            f21 = 0.6f;
            i7 = -1;
        }
        canvas2.scale(f18, f18, org.telegram.messenger.g0.T1(f19, f10, f21), org.telegram.messenger.g0.T1(f20, f14, f21));
        int G0 = chatActivityEnterView2.G0(org.telegram.ui.ActionBar.m6.Pe);
        if (max2 > f16) {
            float f32 = T1 * 0.95f;
            RadialGradient radialGradient = new RadialGradient(f19, f20, f32, new int[]{org.telegram.ui.ActionBar.m6.r1(0.5f, G0), org.telegram.ui.ActionBar.m6.r1(0.16f, G0), 0}, new float[]{0.3f, 0.62f, 1.0f}, Shader.TileMode.CLAMP);
            Paint paint = this.T;
            paint.setShader(radialGradient);
            paint.setAlpha((int) (Math.min(1.0f, max2) * 255.0f));
            canvas2.drawCircle(f19, f20, f32, paint);
        }
        boolean z12 = org.telegram.messenger.g0.B(chatActivityEnterView2.G0(org.telegram.ui.ActionBar.m6.d6)) < 0.5f;
        RectF rectF3 = org.telegram.messenger.g0.P;
        float f33 = f19 - f28;
        float f34 = f19 + f28;
        float f35 = f15;
        rectF3.set(f33, f35, f34, f31);
        if (this.y0) {
            float f36 = f19;
            i10 = i7;
            f23 = f36;
            f22 = f20;
            z10 = z12;
            f24 = f34;
            f25 = f35;
            f26 = f28;
            d(canvas, rectF3, f26, -45.0f, f23, f22, e(2));
            canvas3 = canvas;
            rectF = rectF3;
        } else {
            f22 = f20;
            f23 = f19;
            z10 = z12;
            f24 = f34;
            rectF = rectF3;
            f25 = f35;
            i10 = i7;
            f26 = f28;
            canvas3 = canvas;
        }
        if (this.B0) {
            W1 = this.C0;
        } else {
            gh.b bVar = this.x0;
            W1 = bVar != null ? bVar.W1() : 0;
        }
        if (this.y0 || Color.alpha(W1) <= 0) {
            chatActivityEnterView = chatActivityEnterView2;
            i11 = G0;
            i12 = i10;
            f27 = max2;
        } else {
            Path path = this.l0;
            path.rewind();
            rectF.set(f33, f25, f24, f31);
            i12 = i10;
            path.addRoundRect(rectF, f26, f26, Path.Direction.CW);
            Matrix matrix = this.m0;
            chatActivityEnterView = chatActivityEnterView2;
            matrix.setRotate(-45.0f, f23, f22);
            path.transform(matrix);
            Paint paint2 = this.k0;
            paint2.setColor(0);
            i11 = G0;
            f27 = max2;
            paint2.setShadowLayer(org.telegram.messenger.g0.N(1.0f), 0.0f, org.telegram.messenger.g0.N(0.33333334f), W1);
            canvas3.drawPath(path, paint2);
        }
        canvas3.save();
        canvas3.rotate(-45.0f, f23, f22);
        rectF.set(f33, f25, f24, f31);
        if (!this.y0) {
            fh.g gVar = this.R;
            if (gVar != null) {
                gVar.setBounds((int) (rectF.left - org.telegram.messenger.g0.N(3.0f)), (int) (rectF.top - org.telegram.messenger.g0.N(3.0f)), (int) (org.telegram.messenger.g0.N(3.0f) + rectF.right), (int) (org.telegram.messenger.g0.N(3.0f) + rectF.bottom));
                this.R.setAlpha(org.telegram.messenger.ls.e4);
                this.R.draw(canvas3);
            } else {
                canvas3.drawRoundRect(rectF, f26, f26, this.r);
            }
        }
        float i14 = Utilities.i(f27, 1.0f, 0.0f);
        if (i14 > 0.0f) {
            Paint paint3 = this.S;
            paint3.setColor(i11);
            paint3.setAlpha((int) (Color.alpha(r9) * i14));
            canvas3.drawRoundRect(rectF, f26, f26, paint3);
        }
        Paint.Style style = Paint.Style.STROKE;
        Paint paint4 = this.j0;
        paint4.setStyle(style);
        paint4.setStrokeWidth(org.telegram.messenger.g0.N(0.66f));
        paint4.setColor(z10 ? 654311423 : 436207616);
        paint4.setAlpha((int) ((1.0f - i14) * Color.alpha(paint4.getColor())));
        rectF.inset(org.telegram.messenger.g0.N(0.33f), org.telegram.messenger.g0.N(0.33f));
        canvas3.drawRoundRect(rectF, f26, f26, paint4);
        canvas3.restore();
        float f37 = -((float) Math.sqrt(0.5d));
        float f38 = f29 - f26;
        Paint paint5 = this.U;
        paint5.setStyle(style);
        paint5.setStrokeWidth(org.telegram.messenger.g0.N(1.9f));
        paint5.setStrokeCap(Paint.Cap.ROUND);
        paint5.setStrokeJoin(Paint.Join.ROUND);
        paint5.setColor(i0.a.f(i14, this.s.getColor(), -1));
        canvas3.save();
        canvas3.translate(((f38 - org.telegram.messenger.g0.N(2.0f)) * f37) + f23, ((f38 - org.telegram.messenger.g0.N(2.0f)) * f37) + f22);
        canvas3.drawPath(this.d0, paint5);
        d6 d6Var2 = this.i0;
        float f39 = f17 * 1.4f;
        float N = org.telegram.messenger.g0.N(1.5f) * (1.0f - Utilities.i(f39, 1.0f, 0.0f)) * d6Var2.c;
        float g10 = (g() + 1.0f) / 2.0f;
        canvas3.translate((3.0f - (g10 * 2.0f)) * g10 * g10 * N, 0.0f);
        paint5.setStrokeWidth(org.telegram.messenger.g0.N(1.6f));
        canvas3.drawPath(this.e0, paint5);
        paint5.setStrokeWidth(org.telegram.messenger.g0.N(1.9f));
        canvas3.restore();
        if (!this.c0) {
            ChatActivityEnterView chatActivityEnterView3 = chatActivityEnterView;
            if (chatActivityEnterView3.v3 && !chatActivityEnterView3.i5) {
                z11 = true;
                i13 = (1.0f - Utilities.i(f39, 1.0f, 0.0f)) * d6Var2.d(z11);
                if (i13 > f16) {
                    setupHintPaint(i13);
                    float g11 = (g() * org.telegram.messenger.g0.N(2.5f)) + (-(f38 - org.telegram.messenger.g0.N(3.0f)));
                    canvas3.save();
                    float f40 = g11 * f37;
                    canvas3.translate(f23 + f40, f22 + f40);
                    canvas3.rotate(-45.0f);
                    canvas3.drawPath(this.f0, this.g0);
                    canvas3.restore();
                }
                if (i12 >= 0) {
                    canvas3.restoreToCount(i12);
                }
                canvas3.restore();
                invalidate();
            }
        }
        z11 = false;
        i13 = (1.0f - Utilities.i(f39, 1.0f, 0.0f)) * d6Var2.d(z11);
        if (i13 > f16) {
        }
        if (i12 >= 0) {
        }
        canvas3.restore();
        invalidate();
    }

    public final void d(Canvas canvas, RectF rectF, float f10, float f11, float f12, float f13, fh.g gVar) {
        int i7;
        int i10 = org.telegram.ui.ActionBar.m6.d6;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        boolean z10 = org.telegram.messenger.g0.B(chatActivityEnterView.G0(i10)) < 0.5f;
        Path path = this.G0;
        path.rewind();
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        if (f11 != 0.0f) {
            Matrix matrix = this.H0;
            matrix.setRotate(f11, f12, f13);
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
        ji.o oVar = chatActivityEnterView.r1;
        if (oVar == null || (!((i7 = oVar.c) == 2 || i7 == 3) || oVar.J)) {
            paint.setShadowLayer(org.telegram.messenger.g0.N(8.0f), 0.0f, org.telegram.messenger.g0.N(2.0f), org.telegram.ui.ActionBar.m6.r1((z10 ? 0.4f : 0.16f) * 1.0f, -16777216));
        } else {
            paint.setShadowLayer(org.telegram.messenger.g0.N(1.2f), 0.0f, 0.0f, org.telegram.ui.ActionBar.m6.r1((z10 ? 0.36f : 0.12f) * 1.0f, -16777216));
        }
        canvas.drawPath(path, paint);
        canvas.restore();
        canvas.save();
        canvas.clipPath(path);
        if (gVar != null) {
            RectF rectF2 = this.I0;
            path.computeBounds(rectF2, true);
            gVar.setBounds(((int) rectF2.left) - org.telegram.messenger.g0.L(3.0f), ((int) rectF2.top) - org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f) + ((int) rectF2.right), org.telegram.messenger.g0.L(3.0f) + ((int) rectF2.bottom));
            gVar.setAlpha((int) 255.0f);
            gVar.draw(canvas);
        }
        int i11 = z10 ? -1943655888 : -989855745;
        Paint paint2 = this.D0;
        paint2.setColor(i11);
        paint2.setAlpha((int) (Color.alpha(paint2.getColor()) * 1.0f));
        canvas.drawPaint(paint2);
        canvas.restore();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint3 = this.E0;
        paint3.setStyle(style);
        paint3.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.N(0.5f)));
        paint3.setColor(z10 ? 620756991 : 385875968);
        paint3.setAlpha((int) (Color.alpha(paint3.getColor()) * 1.0f));
        canvas.drawPath(path, paint3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent) || this.H.f(motionEvent);
    }

    public final fh.g e(int i7) {
        dh.c cVar = this.Q0.L1;
        if (cVar == null) {
            return null;
        }
        fh.g[] gVarArr = this.J0;
        if (gVarArr[i7] == null) {
            fh.g c10 = cVar.c(this, this.K0, false);
            gVarArr[i7] = c10;
            c10.r(0.0f);
            gVarArr[i7].W = 0.0f;
        }
        return gVarArr[i7];
    }

    public final void f() {
        hi.l3 l3Var = this.a;
        if (l3Var != null) {
            l3Var.r0 = new pg(this, l3Var, 1);
            l3Var.f(true);
            this.a = null;
        }
        hi.l3 l3Var2 = this.b;
        if (l3Var2 != null) {
            l3Var2.r0 = new pg(this, l3Var2, 2);
            l3Var2.f(true);
            this.b = null;
        }
    }

    public final int h(float f10, float f11) {
        RectF rectF = this.p0;
        if (!rectF.isEmpty() && this.r0.c >= 0.8f) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set(rectF);
            rectF2.inset(-org.telegram.messenger.g0.L(6.0f), -org.telegram.messenger.g0.L(6.0f));
            if (rectF2.contains(f10, f11)) {
                return 0;
            }
        }
        return -1;
    }

    public final void i() {
        f();
        hi.l3 l3Var = new hi.l3(getContext(), 2);
        this.b = l3Var;
        l3Var.o(1.0f, 0.0f);
        hi.l3 l3Var2 = this.b;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        chatActivityEnterView.setHintGlass(l3Var2);
        this.b.r(true);
        this.b.v(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(chatActivityEnterView.d1 ? chatActivityEnterView.P ? 2131743337 : 2131743338 : chatActivityEnterView.P ? 2131743265 : 2131743266, null)));
        hi.l3 l3Var3 = this.b;
        l3Var3.h = hi.l3.a(l3Var3.getText(), this.b.getTextPaint());
        boolean z10 = chatActivityEnterView.P;
        int i7 = 0;
        if (z10) {
            hi.l3 l3Var4 = this.b;
            l3Var4.getClass();
            oh0 oh0Var = new oh0(R.raw.fire_on, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
            oh0Var.start();
            l3Var4.m(oh0Var);
        } else {
            org.telegram.messenger.np.g1().edit().putInt("voiceoncehint", org.telegram.messenger.np.g1().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.b, c8.ma.d(-1, -1.0f, org.telegram.messenger.ls.E1, 0.0f, 0.0f, 54.0f, 58.0f));
        hi.l3 l3Var5 = this.b;
        l3Var5.r0 = new pg(this, l3Var5, i7);
        l3Var5.x();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x07ef  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0920  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x09ea  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x09fe  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0afb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0b0c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0afd  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0ade  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x089b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x050a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float L;
        float L2;
        float e10;
        float f12;
        float f13;
        long j3;
        int i7;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        int i10;
        float f23;
        boolean z10;
        RectF rectF;
        float f24;
        int i11;
        float f25;
        float f26;
        float f27;
        char c10;
        rg rgVar;
        float f28;
        Paint paint;
        Canvas canvas2;
        hi.l3 l3Var;
        RectF rectF2;
        float interpolation;
        float i12;
        float f29;
        RectF rectF3;
        float f30;
        Drawable drawable;
        Paint paint2;
        RectF rectF4;
        float i13;
        boolean z11;
        rg rgVar2;
        Canvas canvas3;
        float e11;
        RectF rectF5;
        RectF rectF6;
        de deVar;
        float f31;
        float x10;
        int i14;
        jh.f D0;
        fh.g gVar;
        gh.a aVar;
        boolean z12 = this.B0;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        if (!z12 && chatActivityEnterView.L1 != null && (D0 = chatActivityEnterView.D0()) != null && (gVar = D0.n) != null && (aVar = gVar.w) != null) {
            fh.g c11 = chatActivityEnterView.L1.c(this, aVar, false);
            this.z0 = c11;
            c11.r(org.telegram.messenger.g0.L(18.0f));
            this.z0.q(org.telegram.messenger.g0.L(3.0f));
            this.z0.W = 0.0f;
            fh.g c12 = chatActivityEnterView.L1.c(this, aVar, false);
            this.A0 = c12;
            c12.r(org.telegram.messenger.g0.L(18.0f));
            this.A0.q(org.telegram.messenger.g0.L(3.0f));
            this.A0.W = 0.0f;
            fh.g c13 = chatActivityEnterView.L1.c(this, aVar, false);
            this.R = c13;
            c13.r(0.0f);
            fh.g gVar2 = this.R;
            gVar2.W = 0.0f;
            gVar2.q(org.telegram.messenger.g0.L(3.0f));
            this.C0 = aVar.W1();
            this.B0 = true;
        }
        float f32 = chatActivityEnterView.X4;
        float f33 = f32 <= 0.5f ? f32 / 0.5f : f32 <= 0.75f ? 1.0f - (((f32 - 0.5f) / 0.25f) * 0.1f) : (((f32 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        long currentTimeMillis = System.currentTimeMillis() - this.L;
        this.L = System.currentTimeMillis();
        float f34 = chatActivityEnterView.b5;
        if (f34 != 10000.0f) {
            float max = Math.max(0.0f, chatActivityEnterView.a5 - f34);
            float L3 = org.telegram.messenger.g0.L(5.0f);
            if (max <= L3) {
                f10 = 5.0f;
                f11 = 0.0f;
            } else {
                f10 = 5.0f;
                f11 = Math.round(((max - L3) * org.telegram.messenger.g0.L(57.0f)) / (org.telegram.messenger.g0.L(57.0f) - L3));
            }
            if (f11 > org.telegram.messenger.g0.L(57.0f)) {
                f11 = org.telegram.messenger.g0.L(57.0f);
            }
        } else {
            f10 = 5.0f;
            f11 = 0.0f;
        }
        int measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.M(26.0f);
        float L4 = 1.0f - (f11 / org.telegram.messenger.g0.L(57.0f));
        float measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(194.0f);
        if (chatActivityEnterView.i5) {
            L = org.telegram.messenger.g0.L(36.0f);
            L2 = org.telegram.ui.Cells.c0.e(14.0f, L4, (((1.0f - f33) * org.telegram.messenger.g0.N(30.0f)) + (org.telegram.messenger.g0.L(60.0f) + measuredHeight)) - f11);
            e10 = org.telegram.messenger.g0.N(2.0f) + (((L / 2.0f) + L2) - org.telegram.messenger.g0.N(8.0f));
            float f35 = L4 > 0.4f ? 1.0f : L4 / 0.4f;
            float f36 = chatActivityEnterView.d5;
            f12 = com.google.android.gms.internal.vision.e2.t(1.0f, f35, f36 * 15.0f, (1.0f - L4) * 9.0f * (1.0f - f36));
            f13 = L4;
        } else {
            L = org.telegram.messenger.g0.L(36.0f) + ((int) (org.telegram.messenger.g0.L(28.0f) * L4));
            L2 = (((org.telegram.messenger.g0.L(60.0f) - (org.telegram.messenger.g0.L(14.0f) * L4)) + measuredHeight) + ((int) ((1.0f - f33) * org.telegram.messenger.g0.L(30.0f)))) - ((int) f11);
            e10 = org.telegram.ui.Cells.c0.e(2.0f, L4, org.telegram.messenger.g0.N(2.0f) + (((L / 2.0f) + L2) - org.telegram.messenger.g0.N(8.0f))) - (org.telegram.messenger.g0.N(10.0f) * L4);
            f12 = (1.0f - L4) * 9.0f;
            chatActivityEnterView.d5 = 0.0f;
            f13 = 0.0f;
        }
        float f37 = e10;
        float f38 = L2;
        float f39 = f12;
        boolean z13 = chatActivityEnterView.U4;
        RectF rectF7 = this.J;
        if (z13) {
            j3 = currentTimeMillis;
            i7 = 2;
            if (System.currentTimeMillis() - chatActivityEnterView.V4 > 200) {
                f14 = 0.0f;
                if (L4 >= 0.8f || chatActivityEnterView.i5 || chatActivityEnterView.c5 != f14 || chatActivityEnterView.f5 != f14) {
                    chatActivityEnterView.U4 = false;
                }
                if (chatActivityEnterView.U4) {
                    i14 = i7;
                    float f40 = chatActivityEnterView.W4 - (j3 / 150.0f);
                    chatActivityEnterView.W4 = f40;
                    if (f40 < 0.0f) {
                        chatActivityEnterView.W4 = 0.0f;
                    }
                } else {
                    float f41 = chatActivityEnterView.W4;
                    if (f41 != 1.0f) {
                        i14 = i7;
                        float f42 = (j3 / 150.0f) + f41;
                        chatActivityEnterView.W4 = f42;
                        if (f42 >= 1.0f) {
                            chatActivityEnterView.W4 = 1.0f;
                            int i15 = org.telegram.messenger.cz.a;
                            SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
                            int i16 = org.telegram.messenger.cz.O + 1;
                            org.telegram.messenger.cz.O = i16;
                            edit.putInt("lockRecordAudioVideoHint", i16);
                            edit.apply();
                        }
                    } else {
                        i14 = i7;
                    }
                }
                int i17 = (int) (chatActivityEnterView.W4 * 255.0f);
                this.c.setAlpha(i17);
                Drawable drawable2 = this.d;
                drawable2.setAlpha(i17);
                this.n.setAlpha(i17);
                if (this.f == null) {
                    canvas.save();
                    f17 = 1.0f;
                    rectF7.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.translate((getMeasuredWidth() - this.h) - org.telegram.messenger.g0.L(44.0f), org.telegram.messenger.g0.N(16.0f) + measuredHeight);
                    f15 = measuredHeight;
                    f16 = L;
                    this.c.setBounds(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(2.0f), (int) (this.h + org.telegram.messenger.g0.L(36.0f)), (int) (org.telegram.messenger.g0.N(4.0f) + this.f.getHeight()));
                    this.c.draw(canvas);
                    this.f.draw(canvas);
                    canvas.restore();
                    canvas.save();
                    canvas.translate(getMeasuredWidth() - org.telegram.messenger.g0.L(26.0f), ((this.f.getHeight() / 2.0f) + (org.telegram.messenger.g0.N(17.0f) + f15)) - (org.telegram.messenger.g0.N(3.0f) * chatActivityEnterView.e5));
                    Path path = this.x;
                    path.reset();
                    path.setLastPoint(-org.telegram.messenger.g0.N(f10), org.telegram.messenger.g0.N(4.0f));
                    path.lineTo(0.0f, 0.0f);
                    path.lineTo(org.telegram.messenger.g0.N(f10), org.telegram.messenger.g0.N(4.0f));
                    Paint paint3 = this.y;
                    paint3.setColor(-1);
                    paint3.setAlpha(i17);
                    paint3.setStyle(Paint.Style.STROKE);
                    paint3.setStrokeCap(Paint.Cap.ROUND);
                    paint3.setStrokeJoin(Paint.Join.ROUND);
                    paint3.setStrokeWidth(org.telegram.messenger.g0.N(1.5f));
                    canvas.drawPath(path, paint3);
                    canvas.restore();
                    canvas.save();
                    drawable2.setBounds(measuredWidth - (drawable2.getIntrinsicWidth() / 2), (int) (org.telegram.messenger.g0.N(20.0f) + this.f.getHeight() + f15), org.telegram.ui.Cells.c0.y(i14, measuredWidth, drawable2), drawable2.getIntrinsicHeight() + ((int) (org.telegram.messenger.g0.N(20.0f) + this.f.getHeight() + f15)));
                    drawable2.draw(canvas);
                    canvas.restore();
                } else {
                    f15 = measuredHeight;
                    f16 = L;
                    f17 = 1.0f;
                }
                float d = this.P.d(!chatActivityEnterView.d1 && chatActivityEnterView.Y1 >= 59000);
                f18 = chatActivityEnterView.f5;
                if (f18 != 0.0f || chatActivityEnterView.i1 == null) {
                    f19 = chatActivityEnterView.c5;
                    if (f19 != 0.0f) {
                        float f43 = f19 > 0.6f ? f17 : f19 / 0.6f;
                        if (!chatActivityEnterView.h0) {
                            f19 = org.telegram.ui.Cells.c0.x(f19, 0.6f, 0.4f, 0.0f);
                        }
                        nr nrVar = nr.j;
                        float interpolation2 = nrVar.getInterpolation(f43);
                        f20 = nrVar.getInterpolation(f19);
                        f21 = interpolation2;
                    } else {
                        f20 = 0.0f;
                        f21 = 0.0f;
                    }
                } else {
                    float f44 = f18 > 0.38f ? f17 : f18 / 0.38f;
                    if (f18 > 0.63f) {
                        x10 = f17;
                        f31 = 0.0f;
                    } else {
                        f31 = 0.0f;
                        x10 = org.telegram.ui.Cells.c0.x(f18, 0.38f, 0.25f, 0.0f);
                    }
                    nr nrVar2 = nr.j;
                    float interpolation3 = nrVar2.getInterpolation(f44);
                    nrVar2.getInterpolation(x10);
                    f20 = f31;
                    f21 = interpolation3;
                }
                if (chatActivityEnterView.l1) {
                    post(new td(chatActivityEnterView, 18));
                }
                canvas.save();
                float measuredWidth2 = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight() - chatActivityEnterView.p2.getMeasuredHeight();
                if (chatActivityEnterView.K1 || !chatActivityEnterView.R5 || (deVar = chatActivityEnterView.f1) == null || deVar.getVisibility() != 0) {
                    f22 = f20;
                    i10 = 0;
                } else {
                    f22 = f20;
                    i10 = i5.c.d(44.0f, chatActivityEnterView.o2.getMeasuredHeight(), 0);
                }
                canvas.clipRect(0.0f, 0.0f, measuredWidth2, (measuredHeight2 + i10) - chatActivityEnterView.m7);
                float f45 = chatActivityEnterView.Y4;
                float f46 = f17 - f45 != 0.0f ? f17 - f45 : f22 != 0.0f ? f22 : 0.0f;
                if (chatActivityEnterView.Z4 >= 0.7f || chatActivityEnterView.h5) {
                    chatActivityEnterView.U4 = false;
                    f23 = chatActivityEnterView.g5;
                    if (f23 != 0.0f) {
                        float f47 = f23 - 0.12f;
                        chatActivityEnterView.g5 = f47;
                        if (f47 < 0.0f) {
                            chatActivityEnterView.g5 = 0.0f;
                        }
                    }
                } else {
                    float f48 = chatActivityEnterView.g5;
                    if (f48 != f17) {
                        float f49 = f48 + 0.12f;
                        chatActivityEnterView.g5 = f49;
                        if (f49 > f17) {
                            chatActivityEnterView.g5 = f17;
                        }
                    }
                }
                float N = org.telegram.messenger.g0.N(72.0f);
                float z14 = com.google.android.gms.internal.vision.e2.z(1.0f, f46, org.telegram.messenger.g0.N(24.0f) * f21, N * f46);
                float f50 = chatActivityEnterView.g5;
                float z15 = com.google.android.gms.internal.vision.e2.z(1.0f, f50, N, z14);
                float f51 = z15 > N ? N : z15;
                float f52 = 1.0f - d;
                float f53 = 1.0f - f22;
                float f54 = chatActivityEnterView.Y4 * f52 * f53 * f50;
                float f55 = measuredWidth;
                float f56 = f37 + f51;
                canvas.scale(f54, f54, f55, f56);
                float f57 = f38 + f51;
                float f58 = f57 + f16;
                rectF7.set(f55 - org.telegram.messenger.g0.N(18.0f), f57, org.telegram.messenger.g0.N(18.0f) + f55, f58);
                z10 = this.y0;
                Paint paint4 = this.r;
                if (z10) {
                    i11 = measuredWidth;
                    f24 = f58;
                    f25 = d;
                    f26 = 2.0f;
                    paint = paint4;
                    f27 = 0.4f;
                    c10 = 2;
                    f28 = f55;
                    d(canvas, rectF7, org.telegram.messenger.g0.N(18.0f), 0.0f, 0.0f, 0.0f, e(0));
                    rgVar = this;
                    canvas2 = canvas;
                    rectF = rectF7;
                } else {
                    rectF = rectF7;
                    f24 = f58;
                    i11 = measuredWidth;
                    f25 = d;
                    f26 = 2.0f;
                    f27 = 0.4f;
                    c10 = 2;
                    rgVar = this;
                    f28 = f55;
                    paint = paint4;
                    canvas2 = canvas;
                    fh.g gVar3 = rgVar.z0;
                    if (gVar3 != null) {
                        gVar3.setBounds((int) (rectF.left - org.telegram.messenger.g0.N(3.0f)), (int) (rectF.top - org.telegram.messenger.g0.N(3.0f)), (int) (org.telegram.messenger.g0.N(3.0f) + rectF.right), (int) (org.telegram.messenger.g0.N(3.0f) + rectF.bottom));
                        rgVar.z0.draw(canvas2);
                    } else {
                        chatActivityEnterView.L4.setBounds((int) (rectF.left - org.telegram.messenger.g0.N(3.0f)), (int) (rectF.top - org.telegram.messenger.g0.N(3.0f)), (int) (org.telegram.messenger.g0.N(3.0f) + rectF.right), (int) (org.telegram.messenger.g0.N(3.0f) + rectF.bottom));
                        chatActivityEnterView.L4.draw(canvas2);
                        canvas2.drawRoundRect(rectF, org.telegram.messenger.g0.N(18.0f), org.telegram.messenger.g0.N(18.0f), paint);
                    }
                }
                chatActivityEnterView.I4.set(rectF);
                RectF rectF8 = chatActivityEnterView.I4;
                float centerX = rectF8.centerX();
                float centerY = rectF8.centerY();
                rectF8.left = org.telegram.messenger.g0.T1(centerX, rectF8.left, f54);
                rectF8.right = org.telegram.messenger.g0.T1(centerX, rectF8.right, f54);
                rectF8.top = org.telegram.messenger.g0.T1(centerY, rectF8.top, f54);
                rectF8.bottom = org.telegram.messenger.g0.T1(centerY, rectF8.bottom, f54);
                l3Var = rgVar.a;
                if (l3Var != null) {
                    l3Var.p(0.0f, rectF.centerY());
                    rgVar.a.invalidate();
                }
                float f59 = 1.0f - f13;
                float f60 = f26;
                rectF.set((f28 - org.telegram.messenger.g0.N(6.0f)) - (org.telegram.messenger.g0.N(f26) * f59), f56 - (org.telegram.messenger.g0.N(f26) * f59), org.telegram.ui.Cells.c0.e(f60, f59, org.telegram.messenger.g0.L(6.0f) + i11), org.telegram.ui.Cells.c0.e(f60, f59, f56 + org.telegram.messenger.g0.L(12.0f)));
                float f61 = rectF.bottom;
                float centerX2 = rectF.centerX();
                float centerY2 = rectF.centerY();
                canvas2.save();
                float i18 = Utilities.i(Math.max(chatActivityEnterView.f5, chatActivityEnterView.B6) * f60, 1.0f, 0.0f);
                Paint paint5 = rgVar.s;
                int alpha = paint5.getAlpha();
                rectF2 = rectF;
                float f62 = f21;
                Paint paint6 = paint;
                Canvas canvas4 = canvas;
                int saveLayerAlpha = canvas4.saveLayerAlpha(centerX2 - org.telegram.messenger.g0.L(24.0f), centerY2 - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f) + centerX2, org.telegram.messenger.g0.L(24.0f) + centerY2, (int) (alpha * (1.0f - i18)), 31);
                Paint paint7 = rgVar.w;
                paint7.setAlpha(org.telegram.messenger.ls.e4);
                paint5.setAlpha(org.telegram.messenger.ls.e4);
                float f63 = 1.0f - L4;
                canvas4.translate(0.0f, org.telegram.messenger.g0.N(2.0f) * f63);
                canvas4.rotate(f39, centerX2, centerY2);
                interpolation = nr.j.getInterpolation(Utilities.i(f13, 1.0f, 0.0f));
                i12 = Utilities.i(interpolation / f27, 1.0f, 0.0f);
                float interpolation4 = nr.g.getInterpolation(Utilities.i((interpolation - 0.3f) / 0.7f, 1.0f, 0.0f));
                float i19 = 1.0f - Utilities.i((interpolation - 0.15f) / 0.7f, 1.0f, 0.0f);
                if (interpolation < 1.0f || i19 <= 0.0f) {
                    f29 = L4;
                    rectF3 = rectF2;
                    f30 = 0.0f;
                } else {
                    RectF rectF9 = org.telegram.messenger.g0.P;
                    rectF9.set(0.0f, 0.0f, org.telegram.messenger.g0.N(8.0f), org.telegram.messenger.g0.N(8.0f));
                    canvas4.save();
                    float e12 = org.telegram.ui.Cells.c0.e(2.0f, f63, f51 + f61);
                    float measuredWidth3 = rgVar.getMeasuredWidth();
                    if (f13 > 0.0f) {
                        e12 = Math.min(e12, org.telegram.messenger.g0.N(0.5f) + rectF2.top);
                    }
                    canvas4.clipRect(0.0f, 0.0f, measuredWidth3, e12);
                    float N2 = org.telegram.messenger.g0.N(1.75f) * rgVar.n0;
                    float g10 = (g() + 1.0f) / 2.0f;
                    float f64 = (3.0f - (g10 * 2.0f)) * g10 * g10 * N2;
                    canvas4.translate(f28 - org.telegram.messenger.g0.N(4.0f), ((chatActivityEnterView.d5 * org.telegram.messenger.g0.N(2.0f)) + org.telegram.ui.Cells.c0.e(11.0f, interpolation, (rectF2.top - org.telegram.messenger.g0.L(6.0f)) - org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(2.0f), org.telegram.messenger.g0.N(1.5f), L4))) - f64);
                    if (f39 > 0.0f) {
                        canvas4.rotate(f39, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    }
                    paint7.setAlpha((int) (i19 * 255.0f));
                    rectF3 = rectF2;
                    f29 = L4;
                    canvas4.drawLine(org.telegram.messenger.g0.N(8.0f), org.telegram.messenger.g0.N(4.0f), org.telegram.messenger.g0.N(8.0f), ((1.0f - interpolation) * org.telegram.messenger.g0.N(4.0f)) + org.telegram.messenger.g0.N(6.0f) + f64, paint7);
                    canvas.drawArc(rectF9, 0.0f, -180.0f, false, paint7);
                    canvas4 = canvas;
                    canvas4.drawLine(0.0f, org.telegram.messenger.g0.N(4.0f), 0.0f, com.google.android.gms.internal.vision.e2.x(chatActivityEnterView.d5, org.telegram.messenger.g0.N(4.0f), f63, org.telegram.messenger.g0.N(4.0f)), paint7);
                    paint7.setAlpha(org.telegram.messenger.ls.e4);
                    canvas4.restore();
                    f30 = 0.0f;
                }
                Drawable drawable3 = rgVar.F;
                drawable = i18 > f30 ? chatActivityEnterView.d1 ? rgVar.G : drawable3 : null;
                if (f13 > f30) {
                    if (rgVar.A0 == null) {
                        paint2 = paint6;
                        rectF4 = rectF3;
                        canvas4.drawRoundRect(rectF4, org.telegram.messenger.g0.N(3.0f), org.telegram.messenger.g0.N(3.0f), paint2);
                    } else {
                        paint2 = paint6;
                        rectF4 = rectF3;
                    }
                    float N3 = org.telegram.messenger.g0.N(1.66f) * interpolation4;
                    float T1 = org.telegram.messenger.g0.T1(org.telegram.messenger.g0.N(3.0f), org.telegram.messenger.g0.N(1.5f), interpolation);
                    float N4 = org.telegram.messenger.g0.N(1.5f) * interpolation4;
                    Path path2 = rgVar.M;
                    path2.rewind();
                    RectF rectF10 = org.telegram.messenger.g0.P;
                    rectF10.set(rectF4);
                    rectF10.right = rectF4.centerX() - N3;
                    float[] fArr = rgVar.N;
                    fArr[7] = T1;
                    fArr[6] = T1;
                    fArr[1] = T1;
                    fArr[0] = T1;
                    fArr[5] = N4;
                    fArr[4] = N4;
                    fArr[3] = N4;
                    fArr[c10] = N4;
                    Path.Direction direction = Path.Direction.CW;
                    path2.addRoundRect(rectF10, fArr, direction);
                    rectF10.set(rectF4);
                    rectF10.left = rectF4.centerX() + N3;
                    float[] fArr2 = rgVar.O;
                    fArr2[5] = T1;
                    fArr2[4] = T1;
                    fArr2[3] = T1;
                    fArr2[c10] = T1;
                    fArr2[7] = N4;
                    fArr2[6] = N4;
                    fArr2[1] = N4;
                    fArr2[0] = N4;
                    path2.addRoundRect(rectF10, fArr2, direction);
                    canvas4.drawPath(path2, paint5);
                } else {
                    paint2 = paint6;
                    rectF4 = rectF3;
                    canvas4.drawRoundRect(rectF4, org.telegram.messenger.g0.N(3.0f), org.telegram.messenger.g0.N(3.0f), paint5);
                }
                if (i12 < 1.0f) {
                    canvas4.drawCircle(rectF4.centerX(), rectF4.centerY(), (1.0f - i12) * org.telegram.messenger.g0.N(2.0f), paint2);
                }
                paint5.setAlpha(alpha);
                paint7.setAlpha(alpha);
                canvas4.restoreToCount(saveLayerAlpha);
                if (drawable != null) {
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set((int) (rectF4.centerX() - ((drawable.getIntrinsicWidth() / 2) * 0.9285f)), (int) (rectF4.centerY() - ((drawable.getIntrinsicHeight() / 2) * 0.9285f)), (int) (((drawable.getIntrinsicWidth() / 2) * 0.9285f) + rectF4.centerX()), (int) (((drawable.getIntrinsicHeight() / 2) * 0.9285f) + rectF4.centerY()));
                    drawable.setBounds(rect);
                    drawable.setAlpha((int) (i18 * 255.0f));
                    drawable.draw(canvas4);
                }
                i13 = Utilities.i((f29 - 0.55f) / 0.45f, 1.0f, 0.0f) * rgVar.h0.d((chatActivityEnterView.s0() || chatActivityEnterView.i5 || chatActivityEnterView.x1 || chatActivityEnterView.h5 || chatActivityEnterView.f5 != 0.0f || !chatActivityEnterView.v3) ? false : true);
                rgVar.n0 = i13;
                if (i13 > 0.01f) {
                    rgVar.b();
                    rgVar.setupHintPaint(i13);
                    canvas4.save();
                    canvas4.translate(Math.round(f28), (f24 - org.telegram.messenger.g0.L(17.0f)) - (g() * org.telegram.messenger.g0.N(2.5f)));
                    canvas4.drawPath(rgVar.f0, rgVar.g0);
                    canvas4.restore();
                    rgVar.invalidate();
                }
                canvas4.restore();
                canvas4.restore();
                Canvas canvas5 = canvas4;
                rg rgVar3 = rgVar;
                float f65 = f51;
                rgVar3.c(f28, f15, chatActivityEnterView.g5 * chatActivityEnterView.Y4 * f52 * f53, f65, canvas5);
                float L5 = (org.telegram.messenger.g0.L(38.0f) * f25) + org.telegram.messenger.g0.T1(f38, rgVar3.getMeasuredHeight() - org.telegram.messenger.g0.L(118.0f), Math.max(chatActivityEnterView.c5, Math.min(f62, chatActivityEnterView.g5))) + f65;
                rectF4.set(f28 - org.telegram.messenger.g0.N(18.0f), L5, org.telegram.messenger.g0.N(18.0f) + f28, L5 + f16);
                ng ngVar = chatActivityEnterView.P3;
                z11 = ngVar == null && ngVar.m1() && !chatActivityEnterView.i0();
                chatActivityEnterView.Q = z11;
                if (z11) {
                    float N5 = org.telegram.messenger.g0.N(12.0f);
                    rectF4.set(rectF4.left, (rectF4.top - org.telegram.messenger.g0.N(36.0f)) - N5, rectF4.right, rectF4.top - N5);
                    hi.l3 l3Var2 = rgVar3.b;
                    if (l3Var2 != null) {
                        l3Var2.p(0.0f, rectF4.centerY());
                        rgVar3.b.invalidate();
                    }
                    rgVar3.K.set(rectF4);
                    canvas5.save();
                    float f66 = chatActivityEnterView.d5 * chatActivityEnterView.g5 * (1.0f - chatActivityEnterView.c5) * chatActivityEnterView.Y4;
                    canvas5.scale(f66, f66, rectF4.centerX(), rectF4.centerY());
                    if (rgVar3.y0) {
                        rectF6 = rectF4;
                        rgVar3.d(canvas5, rectF6, org.telegram.messenger.g0.N(18.0f), 0.0f, 0.0f, 0.0f, rgVar3.e(1));
                        rgVar2 = rgVar3;
                        canvas3 = canvas5;
                    } else {
                        rgVar2 = rgVar3;
                        canvas3 = canvas5;
                        rectF6 = rectF4;
                        fh.g gVar4 = rgVar2.A0;
                        if (gVar4 != null) {
                            gVar4.setBounds((int) (rectF6.left - org.telegram.messenger.g0.N(3.0f)), (int) (rectF6.top - org.telegram.messenger.g0.N(3.0f)), (int) (org.telegram.messenger.g0.N(3.0f) + rectF6.right), (int) (org.telegram.messenger.g0.N(3.0f) + rectF6.bottom));
                            rgVar2.A0.draw(canvas3);
                        } else {
                            chatActivityEnterView.L4.setBounds((int) (rectF6.left - org.telegram.messenger.g0.N(3.0f)), (int) (rectF6.top - org.telegram.messenger.g0.N(3.0f)), (int) (org.telegram.messenger.g0.N(3.0f) + rectF6.right), (int) (org.telegram.messenger.g0.N(3.0f) + rectF6.bottom));
                            chatActivityEnterView.L4.draw(canvas3);
                            canvas3.drawRoundRect(rectF6, org.telegram.messenger.g0.N(18.0f), org.telegram.messenger.g0.N(18.0f), paint2);
                        }
                    }
                    rgVar2.E.setBounds((int) rectF6.left, (int) rectF6.top, (int) rectF6.right, (int) rectF6.bottom);
                    rgVar2.E.draw(canvas3);
                    canvas3.restore();
                } else {
                    rgVar2 = rgVar3;
                    canvas3 = canvas5;
                }
                d6 d6Var = rgVar2.r0;
                d6Var.getClass();
                e11 = d6Var.e(false, 0.0f);
                ChatActivityEnterView chatActivityEnterView2 = rgVar2.Q0;
                RectF rectF11 = chatActivityEnterView2.I4;
                float d2 = rgVar2.s0.d(chatActivityEnterView2.U1);
                float d10 = rgVar2.t0.d(rgVar2.u0 >= 0);
                rectF5 = rgVar2.p0;
                if (e11 > 0.0f || rectF11.isEmpty()) {
                    rectF5.setEmpty();
                } else {
                    float width = rectF11.width();
                    float measuredWidth4 = rgVar2.getMeasuredWidth() - rectF11.right;
                    rectF5.set(measuredWidth4, rectF11.top, width + measuredWidth4, rectF11.bottom);
                    float T12 = (1.0f - (d10 * 0.06f)) * org.telegram.messenger.g0.T1(0.6f, 1.0f, e11);
                    canvas3.save();
                    canvas3.scale(T12, T12, rectF5.centerX(), rectF5.centerY());
                    float f67 = e11 * 255.0f;
                    int i20 = (int) f67;
                    fh.g gVar5 = rgVar2.o0;
                    if (gVar5 != null) {
                        gVar5.setBounds((int) (rectF5.left - org.telegram.messenger.g0.N(3.0f)), (int) (rectF5.top - org.telegram.messenger.g0.N(3.0f)), (int) (org.telegram.messenger.g0.N(3.0f) + rectF5.right), (int) (org.telegram.messenger.g0.N(3.0f) + rectF5.bottom));
                        rgVar2.o0.setAlpha(i20);
                        rgVar2.o0.draw(canvas3);
                    } else {
                        int alpha2 = paint2.getAlpha();
                        paint2.setAlpha((int) (alpha2 * e11));
                        canvas3.drawRoundRect(rectF5, rectF5.width() / 2.0f, rectF5.width() / 2.0f, paint2);
                        paint2.setAlpha(alpha2);
                    }
                    float centerX3 = rectF5.centerX();
                    float centerY3 = rectF5.centerY();
                    if (d2 < 1.0f) {
                        Paint.Style style = Paint.Style.STROKE;
                        Paint paint8 = rgVar2.q0;
                        paint8.setStyle(style);
                        paint8.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
                        paint8.setStrokeCap(Paint.Cap.ROUND);
                        paint8.setStrokeJoin(Paint.Join.ROUND);
                        paint8.setColor(paint5.getColor());
                        paint8.setAlpha((int) ((1.0f - d2) * Color.alpha(paint5.getColor()) * e11));
                        canvas3.save();
                        float T13 = org.telegram.messenger.g0.T1(1.0f, 0.6f, d2);
                        canvas3.scale(T13, T13, centerX3, centerY3);
                        float N6 = org.telegram.messenger.g0.N(3.6f) + centerX3;
                        float N7 = centerY3 - org.telegram.messenger.g0.N(5.85f);
                        float N8 = org.telegram.messenger.g0.N(5.85f) + centerY3;
                        float N9 = org.telegram.messenger.g0.N(4.3f);
                        canvas3.drawLine(N6 - N9, N8, N6, N7, paint8);
                        canvas.drawLine(N6, N7, N6 + N9, N8, paint8);
                        float f68 = N9 * 0.6f;
                        canvas.drawLine(N6 - f68, org.telegram.messenger.g0.N(1.9f) + centerY3, N6 + f68, org.telegram.messenger.g0.N(1.9f) + centerY3, paint8);
                        float N10 = centerY3 - org.telegram.messenger.g0.N(0.6f);
                        float N11 = centerX3 - org.telegram.messenger.g0.N(2.6f);
                        canvas.drawLine(centerX3 - org.telegram.messenger.g0.N(9.4f), N10, N11, N10, paint8);
                        canvas.drawLine(N11 - org.telegram.messenger.g0.N(2.6f), N10 - org.telegram.messenger.g0.N(2.6f), N11, N10, paint8);
                        canvas3 = canvas;
                        canvas3.drawLine(N11 - org.telegram.messenger.g0.N(2.6f), org.telegram.messenger.g0.N(2.6f) + N10, N11, N10, paint8);
                        canvas3.restore();
                    }
                    if (d2 > 0.0f) {
                        float T14 = org.telegram.messenger.g0.T1(0.6f, 1.0f, d2) * 0.9285f;
                        int intrinsicWidth = (int) ((drawable3.getIntrinsicWidth() / 2.0f) * T14);
                        int intrinsicHeight = (int) ((drawable3.getIntrinsicHeight() / 2.0f) * T14);
                        int i21 = (int) centerX3;
                        int i22 = (int) centerY3;
                        drawable3.setBounds(i21 - intrinsicWidth, i22 - intrinsicHeight, i21 + intrinsicWidth, i22 + intrinsicHeight);
                        drawable3.setAlpha((int) (f67 * d2));
                        drawable3.draw(canvas3);
                        drawable3.setAlpha(org.telegram.messenger.ls.e4);
                    }
                    canvas3.restore();
                }
                rgVar2.getLocationInWindow(rgVar2.w0);
                chatActivityEnterView2.getLocationInWindow(rgVar2.v0);
                chatActivityEnterView2.x0(rgVar2, canvas3, r1[0], r1[1], -100000.0f, r2[1]);
            }
        } else {
            j3 = currentTimeMillis;
            i7 = 2;
        }
        f14 = 0.0f;
        if (chatActivityEnterView.W4 == 0.0f) {
            f15 = measuredHeight;
            f16 = L;
            f17 = 1.0f;
            float d11 = this.P.d(!chatActivityEnterView.d1 && chatActivityEnterView.Y1 >= 59000);
            f18 = chatActivityEnterView.f5;
            if (f18 != 0.0f) {
            }
            f19 = chatActivityEnterView.c5;
            if (f19 != 0.0f) {
            }
            if (chatActivityEnterView.l1) {
            }
            canvas.save();
            float measuredWidth22 = getMeasuredWidth();
            int measuredHeight22 = getMeasuredHeight() - chatActivityEnterView.p2.getMeasuredHeight();
            if (chatActivityEnterView.K1) {
            }
            f22 = f20;
            i10 = 0;
            canvas.clipRect(0.0f, 0.0f, measuredWidth22, (measuredHeight22 + i10) - chatActivityEnterView.m7);
            float f452 = chatActivityEnterView.Y4;
            if (f17 - f452 != 0.0f) {
            }
            if (chatActivityEnterView.Z4 >= 0.7f) {
            }
            chatActivityEnterView.U4 = false;
            f23 = chatActivityEnterView.g5;
            if (f23 != 0.0f) {
            }
            float N12 = org.telegram.messenger.g0.N(72.0f);
            float z142 = com.google.android.gms.internal.vision.e2.z(1.0f, f46, org.telegram.messenger.g0.N(24.0f) * f21, N12 * f46);
            float f502 = chatActivityEnterView.g5;
            float z152 = com.google.android.gms.internal.vision.e2.z(1.0f, f502, N12, z142);
            if (z152 > N12) {
            }
            float f522 = 1.0f - d11;
            float f532 = 1.0f - f22;
            float f542 = chatActivityEnterView.Y4 * f522 * f532 * f502;
            float f552 = measuredWidth;
            float f562 = f37 + f51;
            canvas.scale(f542, f542, f552, f562);
            float f572 = f38 + f51;
            float f582 = f572 + f16;
            rectF7.set(f552 - org.telegram.messenger.g0.N(18.0f), f572, org.telegram.messenger.g0.N(18.0f) + f552, f582);
            z10 = this.y0;
            Paint paint42 = this.r;
            if (z10) {
            }
            chatActivityEnterView.I4.set(rectF);
            RectF rectF82 = chatActivityEnterView.I4;
            float centerX4 = rectF82.centerX();
            float centerY4 = rectF82.centerY();
            rectF82.left = org.telegram.messenger.g0.T1(centerX4, rectF82.left, f542);
            rectF82.right = org.telegram.messenger.g0.T1(centerX4, rectF82.right, f542);
            rectF82.top = org.telegram.messenger.g0.T1(centerY4, rectF82.top, f542);
            rectF82.bottom = org.telegram.messenger.g0.T1(centerY4, rectF82.bottom, f542);
            l3Var = rgVar.a;
            if (l3Var != null) {
            }
            float f592 = 1.0f - f13;
            float f602 = f26;
            rectF.set((f28 - org.telegram.messenger.g0.N(6.0f)) - (org.telegram.messenger.g0.N(f26) * f592), f562 - (org.telegram.messenger.g0.N(f26) * f592), org.telegram.ui.Cells.c0.e(f602, f592, org.telegram.messenger.g0.L(6.0f) + i11), org.telegram.ui.Cells.c0.e(f602, f592, f562 + org.telegram.messenger.g0.L(12.0f)));
            float f612 = rectF.bottom;
            float centerX22 = rectF.centerX();
            float centerY22 = rectF.centerY();
            canvas2.save();
            float i182 = Utilities.i(Math.max(chatActivityEnterView.f5, chatActivityEnterView.B6) * f602, 1.0f, 0.0f);
            Paint paint52 = rgVar.s;
            int alpha3 = paint52.getAlpha();
            rectF2 = rectF;
            float f622 = f21;
            Paint paint62 = paint;
            Canvas canvas42 = canvas;
            int saveLayerAlpha2 = canvas42.saveLayerAlpha(centerX22 - org.telegram.messenger.g0.L(24.0f), centerY22 - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f) + centerX22, org.telegram.messenger.g0.L(24.0f) + centerY22, (int) (alpha3 * (1.0f - i182)), 31);
            Paint paint72 = rgVar.w;
            paint72.setAlpha(org.telegram.messenger.ls.e4);
            paint52.setAlpha(org.telegram.messenger.ls.e4);
            float f632 = 1.0f - L4;
            canvas42.translate(0.0f, org.telegram.messenger.g0.N(2.0f) * f632);
            canvas42.rotate(f39, centerX22, centerY22);
            interpolation = nr.j.getInterpolation(Utilities.i(f13, 1.0f, 0.0f));
            i12 = Utilities.i(interpolation / f27, 1.0f, 0.0f);
            float interpolation42 = nr.g.getInterpolation(Utilities.i((interpolation - 0.3f) / 0.7f, 1.0f, 0.0f));
            float i192 = 1.0f - Utilities.i((interpolation - 0.15f) / 0.7f, 1.0f, 0.0f);
            if (interpolation < 1.0f) {
            }
            f29 = L4;
            rectF3 = rectF2;
            f30 = 0.0f;
            Drawable drawable32 = rgVar.F;
            if (i182 > f30) {
            }
            if (f13 > f30) {
            }
            if (i12 < 1.0f) {
            }
            paint52.setAlpha(alpha3);
            paint72.setAlpha(alpha3);
            canvas42.restoreToCount(saveLayerAlpha2);
            if (drawable != null) {
            }
            i13 = Utilities.i((f29 - 0.55f) / 0.45f, 1.0f, 0.0f) * rgVar.h0.d((chatActivityEnterView.s0() || chatActivityEnterView.i5 || chatActivityEnterView.x1 || chatActivityEnterView.h5 || chatActivityEnterView.f5 != 0.0f || !chatActivityEnterView.v3) ? false : true);
            rgVar.n0 = i13;
            if (i13 > 0.01f) {
            }
            canvas42.restore();
            canvas42.restore();
            Canvas canvas52 = canvas42;
            rg rgVar32 = rgVar;
            float f652 = f51;
            rgVar32.c(f28, f15, chatActivityEnterView.g5 * chatActivityEnterView.Y4 * f522 * f532, f652, canvas52);
            float L52 = (org.telegram.messenger.g0.L(38.0f) * f25) + org.telegram.messenger.g0.T1(f38, rgVar32.getMeasuredHeight() - org.telegram.messenger.g0.L(118.0f), Math.max(chatActivityEnterView.c5, Math.min(f622, chatActivityEnterView.g5))) + f652;
            rectF4.set(f28 - org.telegram.messenger.g0.N(18.0f), L52, org.telegram.messenger.g0.N(18.0f) + f28, L52 + f16);
            ng ngVar2 = chatActivityEnterView.P3;
            if (ngVar2 == null) {
            }
            chatActivityEnterView.Q = z11;
            if (z11) {
            }
            d6 d6Var2 = rgVar2.r0;
            d6Var2.getClass();
            e11 = d6Var2.e(false, 0.0f);
            ChatActivityEnterView chatActivityEnterView22 = rgVar2.Q0;
            RectF rectF112 = chatActivityEnterView22.I4;
            float d22 = rgVar2.s0.d(chatActivityEnterView22.U1);
            float d102 = rgVar2.t0.d(rgVar2.u0 >= 0);
            rectF5 = rgVar2.p0;
            if (e11 > 0.0f) {
            }
            rectF5.setEmpty();
            rgVar2.getLocationInWindow(rgVar2.w0);
            chatActivityEnterView22.getLocationInWindow(rgVar2.v0);
            chatActivityEnterView22.x0(rgVar2, canvas3, r1[0], r1[1], -100000.0f, r2[1]);
        }
        if (L4 >= 0.8f) {
        }
        chatActivityEnterView.U4 = false;
        if (chatActivityEnterView.U4) {
        }
        int i172 = (int) (chatActivityEnterView.W4 * 255.0f);
        this.c.setAlpha(i172);
        Drawable drawable22 = this.d;
        drawable22.setAlpha(i172);
        this.n.setAlpha(i172);
        if (this.f == null) {
        }
        float d112 = this.P.d(!chatActivityEnterView.d1 && chatActivityEnterView.Y1 >= 59000);
        f18 = chatActivityEnterView.f5;
        if (f18 != 0.0f) {
        }
        f19 = chatActivityEnterView.c5;
        if (f19 != 0.0f) {
        }
        if (chatActivityEnterView.l1) {
        }
        canvas.save();
        float measuredWidth222 = getMeasuredWidth();
        int measuredHeight222 = getMeasuredHeight() - chatActivityEnterView.p2.getMeasuredHeight();
        if (chatActivityEnterView.K1) {
        }
        f22 = f20;
        i10 = 0;
        canvas.clipRect(0.0f, 0.0f, measuredWidth222, (measuredHeight222 + i10) - chatActivityEnterView.m7);
        float f4522 = chatActivityEnterView.Y4;
        if (f17 - f4522 != 0.0f) {
        }
        if (chatActivityEnterView.Z4 >= 0.7f) {
        }
        chatActivityEnterView.U4 = false;
        f23 = chatActivityEnterView.g5;
        if (f23 != 0.0f) {
        }
        float N122 = org.telegram.messenger.g0.N(72.0f);
        float z1422 = com.google.android.gms.internal.vision.e2.z(1.0f, f46, org.telegram.messenger.g0.N(24.0f) * f21, N122 * f46);
        float f5022 = chatActivityEnterView.g5;
        float z1522 = com.google.android.gms.internal.vision.e2.z(1.0f, f5022, N122, z1422);
        if (z1522 > N122) {
        }
        float f5222 = 1.0f - d112;
        float f5322 = 1.0f - f22;
        float f5422 = chatActivityEnterView.Y4 * f5222 * f5322 * f5022;
        float f5522 = measuredWidth;
        float f5622 = f37 + f51;
        canvas.scale(f5422, f5422, f5522, f5622);
        float f5722 = f38 + f51;
        float f5822 = f5722 + f16;
        rectF7.set(f5522 - org.telegram.messenger.g0.N(18.0f), f5722, org.telegram.messenger.g0.N(18.0f) + f5522, f5822);
        z10 = this.y0;
        Paint paint422 = this.r;
        if (z10) {
        }
        chatActivityEnterView.I4.set(rectF);
        RectF rectF822 = chatActivityEnterView.I4;
        float centerX42 = rectF822.centerX();
        float centerY42 = rectF822.centerY();
        rectF822.left = org.telegram.messenger.g0.T1(centerX42, rectF822.left, f5422);
        rectF822.right = org.telegram.messenger.g0.T1(centerX42, rectF822.right, f5422);
        rectF822.top = org.telegram.messenger.g0.T1(centerY42, rectF822.top, f5422);
        rectF822.bottom = org.telegram.messenger.g0.T1(centerY42, rectF822.bottom, f5422);
        l3Var = rgVar.a;
        if (l3Var != null) {
        }
        float f5922 = 1.0f - f13;
        float f6022 = f26;
        rectF.set((f28 - org.telegram.messenger.g0.N(6.0f)) - (org.telegram.messenger.g0.N(f26) * f5922), f5622 - (org.telegram.messenger.g0.N(f26) * f5922), org.telegram.ui.Cells.c0.e(f6022, f5922, org.telegram.messenger.g0.L(6.0f) + i11), org.telegram.ui.Cells.c0.e(f6022, f5922, f5622 + org.telegram.messenger.g0.L(12.0f)));
        float f6122 = rectF.bottom;
        float centerX222 = rectF.centerX();
        float centerY222 = rectF.centerY();
        canvas2.save();
        float i1822 = Utilities.i(Math.max(chatActivityEnterView.f5, chatActivityEnterView.B6) * f6022, 1.0f, 0.0f);
        Paint paint522 = rgVar.s;
        int alpha32 = paint522.getAlpha();
        rectF2 = rectF;
        float f6222 = f21;
        Paint paint622 = paint;
        Canvas canvas422 = canvas;
        int saveLayerAlpha22 = canvas422.saveLayerAlpha(centerX222 - org.telegram.messenger.g0.L(24.0f), centerY222 - org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f) + centerX222, org.telegram.messenger.g0.L(24.0f) + centerY222, (int) (alpha32 * (1.0f - i1822)), 31);
        Paint paint722 = rgVar.w;
        paint722.setAlpha(org.telegram.messenger.ls.e4);
        paint522.setAlpha(org.telegram.messenger.ls.e4);
        float f6322 = 1.0f - L4;
        canvas422.translate(0.0f, org.telegram.messenger.g0.N(2.0f) * f6322);
        canvas422.rotate(f39, centerX222, centerY222);
        interpolation = nr.j.getInterpolation(Utilities.i(f13, 1.0f, 0.0f));
        i12 = Utilities.i(interpolation / f27, 1.0f, 0.0f);
        float interpolation422 = nr.g.getInterpolation(Utilities.i((interpolation - 0.3f) / 0.7f, 1.0f, 0.0f));
        float i1922 = 1.0f - Utilities.i((interpolation - 0.15f) / 0.7f, 1.0f, 0.0f);
        if (interpolation < 1.0f) {
        }
        f29 = L4;
        rectF3 = rectF2;
        f30 = 0.0f;
        Drawable drawable322 = rgVar.F;
        if (i1822 > f30) {
        }
        if (f13 > f30) {
        }
        if (i12 < 1.0f) {
        }
        paint522.setAlpha(alpha32);
        paint722.setAlpha(alpha32);
        canvas422.restoreToCount(saveLayerAlpha22);
        if (drawable != null) {
        }
        i13 = Utilities.i((f29 - 0.55f) / 0.45f, 1.0f, 0.0f) * rgVar.h0.d((chatActivityEnterView.s0() || chatActivityEnterView.i5 || chatActivityEnterView.x1 || chatActivityEnterView.h5 || chatActivityEnterView.f5 != 0.0f || !chatActivityEnterView.v3) ? false : true);
        rgVar.n0 = i13;
        if (i13 > 0.01f) {
        }
        canvas422.restore();
        canvas422.restore();
        Canvas canvas522 = canvas422;
        rg rgVar322 = rgVar;
        float f6522 = f51;
        rgVar322.c(f28, f15, chatActivityEnterView.g5 * chatActivityEnterView.Y4 * f5222 * f5322, f6522, canvas522);
        float L522 = (org.telegram.messenger.g0.L(38.0f) * f25) + org.telegram.messenger.g0.T1(f38, rgVar322.getMeasuredHeight() - org.telegram.messenger.g0.L(118.0f), Math.max(chatActivityEnterView.c5, Math.min(f6222, chatActivityEnterView.g5))) + f6522;
        rectF4.set(f28 - org.telegram.messenger.g0.N(18.0f), L522, org.telegram.messenger.g0.N(18.0f) + f28, L522 + f16);
        ng ngVar22 = chatActivityEnterView.P3;
        if (ngVar22 == null) {
        }
        chatActivityEnterView.Q = z11;
        if (z11) {
        }
        d6 d6Var22 = rgVar2.r0;
        d6Var22.getClass();
        e11 = d6Var22.e(false, 0.0f);
        ChatActivityEnterView chatActivityEnterView222 = rgVar2.Q0;
        RectF rectF1122 = chatActivityEnterView222.I4;
        float d222 = rgVar2.s0.d(chatActivityEnterView222.U1);
        float d1022 = rgVar2.t0.d(rgVar2.u0 >= 0);
        rectF5 = rgVar2.p0;
        if (e11 > 0.0f) {
        }
        rectF5.setEmpty();
        rgVar2.getLocationInWindow(rgVar2.w0);
        chatActivityEnterView222.getLocationInWindow(rgVar2.v0);
        chatActivityEnterView222.x0(rgVar2, canvas3, r1[0], r1[1], -100000.0f, r2[1]);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(250.0f);
        if (this.I != size) {
            this.I = size;
            StaticLayout staticLayout = new StaticLayout(this.e, this.n, org.telegram.messenger.g0.L(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i11 = 0; i11 < lineCount; i11++) {
                float lineWidth = this.f.getLineWidth(i11);
                if (lineWidth > this.h) {
                    this.h = lineWidth;
                }
            }
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onSetAlpha(int i7) {
        return super.onSetAlpha(i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        RectF rectF = chatActivityEnterView.I4;
        int i7 = 2;
        if (chatActivityEnterView.K1) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                int h = h(x10, y10);
                this.u0 = h;
                if (h >= 0) {
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
                if (h(x10, y10) >= 0) {
                    chatActivityEnterView.S1(!chatActivityEnterView.U1, true);
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
        int i10 = 0;
        if (action == 0) {
            if (chatActivityEnterView.i5) {
                RectF rectF3 = org.telegram.messenger.g0.P;
                rectF3.set(rectF);
                rectF3.inset(-org.telegram.messenger.g0.L(10.0f), -org.telegram.messenger.g0.L(10.0f));
                this.P0 = !rectF.isEmpty() && rectF3.contains((float) x10, (float) y10);
            }
            if (chatActivityEnterView.Q && chatActivityEnterView.D2 != null && chatActivityEnterView.d5 > 0.1f) {
                this.O0 = rectF2.contains(x10, y10);
            }
        } else if (motionEvent.getAction() == 1) {
            RectF rectF4 = org.telegram.messenger.g0.P;
            rectF4.set(rectF);
            rectF4.inset(-org.telegram.messenger.g0.L(10.0f), -org.telegram.messenger.g0.L(10.0f));
            if (this.P0 && rectF4.contains(x10, y10)) {
                if (chatActivityEnterView.l1 && !chatActivityEnterView.d1) {
                    this.O0 = false;
                    this.P0 = false;
                    if (chatActivityEnterView.v3) {
                        if (chatActivityEnterView.A6) {
                            chatActivityEnterView.n0(false, true);
                            chatActivityEnterView.A0().I(true);
                        } else {
                            gf gfVar = chatActivityEnterView.F0;
                            if (gfVar == null || gfVar.length() == 0) {
                                chatActivityEnterView.l0();
                                return true;
                            }
                            chatActivityEnterView.n0(true, true);
                            ai.p0 p0Var = chatActivityEnterView.j1;
                            if (p0Var != null && p0Var.o0 && p0Var.r == 1) {
                                p0Var.t();
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
                    chatActivityEnterView.P3.l1();
                } else {
                    og ogVar = new og(this, i10);
                    hi.l3 l3Var = this.a;
                    if (l3Var != null && l3Var.W) {
                        f();
                    }
                    if (chatActivityEnterView.K1) {
                        chatActivityEnterView.S1(false, false);
                        org.telegram.messenger.g0.r(chatActivityEnterView.X1);
                        chatActivityEnterView.L1(true);
                    }
                    zi0 zi0Var = chatActivityEnterView.i1;
                    if (zi0Var != null) {
                        zi0Var.setPlaying(false);
                    }
                    if (!MediaController.B().K() || (chatActivityEnterView.i1.getAudioLeft() <= 0.01f && chatActivityEnterView.i1.getAudioRight() >= 0.99f)) {
                        ogVar.run();
                    } else {
                        mf mfVar = new mf(i7, this, ogVar);
                        if (org.telegram.messenger.np.g1().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), chatActivityEnterView.M4);
                            String N0 = org.telegram.messenger.hd.N0(2131746152, null);
                            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                            t1Var.S = N0;
                            t1Var.U = org.telegram.messenger.hd.N0(2131746153, null);
                            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), new c0(mfVar, 18));
                            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                            alertDialog$Builder.p();
                        } else {
                            mfVar.run();
                        }
                    }
                }
                this.O0 = false;
                this.P0 = false;
                return true;
            }
            if (this.O0 && rectF2.contains(x10, y10)) {
                boolean z10 = !chatActivityEnterView.P;
                chatActivityEnterView.P = z10;
                this.E.d(1, z10, true);
                org.telegram.messenger.si d02 = org.telegram.messenger.si.d0(chatActivityEnterView.R);
                long j3 = chatActivityEnterView.G3;
                org.telegram.ui.bn bnVar = chatActivityEnterView.F3;
                d02.j2(j3, (bnVar == null || !bnVar.x4) ? 0L : bnVar.d(), chatActivityEnterView.P);
                if (chatActivityEnterView.P) {
                    i();
                } else {
                    f();
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
    public void setAlpha(float f10) {
        super.setAlpha(f10);
    }

    public void setBlurredBackgroundFactory(dh.c cVar) {
        this.y0 = true;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        chatActivityEnterView.L1 = cVar;
        if (this.x0 == null) {
            this.x0 = new gh.b(org.telegram.ui.ActionBar.m6.Re, chatActivityEnterView.M4);
        }
        fh.g c10 = cVar.c(this, this.x0, false);
        this.z0 = c10;
        c10.r(org.telegram.messenger.g0.L(18.0f));
        this.z0.q(org.telegram.messenger.g0.L(3.0f));
        fh.g c11 = cVar.c(this, this.x0, false);
        this.A0 = c11;
        c11.r(org.telegram.messenger.g0.L(18.0f));
        this.A0.q(org.telegram.messenger.g0.L(3.0f));
        fh.g c12 = cVar.c(this, this.x0, false);
        this.o0 = c12;
        c12.r(org.telegram.messenger.g0.L(18.0f));
        this.o0.q(org.telegram.messenger.g0.L(3.0f));
        fh.g c13 = cVar.c(this, this.x0, false);
        this.R = c13;
        c13.r(org.telegram.messenger.g0.L(18.0f));
        fh.g gVar = this.R;
        gVar.W = 0.0f;
        gVar.q(org.telegram.messenger.g0.L(3.0f));
        this.B0 = false;
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        TextPaint textPaint;
        Drawable drawable;
        Drawable drawable2;
        hi.n nVar = this.E;
        if (nVar == null || (textPaint = this.n) == null || (drawable = this.F) == null || (drawable2 = this.G) == null) {
            return;
        }
        gh.b bVar = this.x0;
        if (bVar != null) {
            bVar.d();
        }
        fh.g gVar = this.z0;
        if (gVar != null) {
            gVar.updateColors();
        }
        fh.g gVar2 = this.A0;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        fh.g gVar3 = this.o0;
        if (gVar3 != null) {
            gVar3.updateColors();
        }
        fh.g gVar4 = this.R;
        if (gVar4 != null) {
            gVar4.updateColors();
        }
        int i7 = this.y0 ? org.telegram.ui.ActionBar.m6.Nl : org.telegram.ui.ActionBar.m6.Qe;
        ChatActivityEnterView chatActivityEnterView = this.Q0;
        nVar.e(chatActivityEnterView.G0(i7), chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.Uf), -1);
        textPaint.setColor(chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.gg));
        ShapeDrawable shapeDrawable = this.c;
        if (shapeDrawable != null) {
            org.telegram.ui.ActionBar.m6.C1(chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.hg), shapeDrawable);
        } else {
            this.c = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(5.0f), chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.hg));
        }
        int G0 = chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.hg);
        Drawable drawable3 = this.d;
        if (drawable3 != null && G0 != this.L0) {
            this.L0 = G0;
            drawable3.setColorFilter(new PorterDuffColorFilter(G0, PorterDuff.Mode.SRC_IN));
        }
        this.r.setColor(chatActivityEnterView.G0(org.telegram.ui.ActionBar.m6.Re));
        this.s.setColor(chatActivityEnterView.G0(this.y0 ? org.telegram.ui.ActionBar.m6.Nl : org.telegram.ui.ActionBar.m6.Qe));
        this.w.setColor(chatActivityEnterView.G0(this.y0 ? org.telegram.ui.ActionBar.m6.Nl : org.telegram.ui.ActionBar.m6.Qe));
        int G02 = chatActivityEnterView.G0(this.y0 ? org.telegram.ui.ActionBar.m6.Nl : org.telegram.ui.ActionBar.m6.Qe);
        if (this.N0 && G02 == this.M0) {
            return;
        }
        this.N0 = true;
        this.M0 = G02;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(new PorterDuffColorFilter(G02, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(G02, mode));
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.E || super.verifyDrawable(drawable);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
